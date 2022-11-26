/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplicationmultithread;


import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Pelin
 */
public final class TableSenaryo3  implements Runnable{
    private int data;
    private int aralik;
    float oran;
    String sutunbenzerlik;
    String sutunAyni;
    String benzer;
    String ayni;
    int complaintID;
    Connection connection;
    JTable tablemodel;
    int Row;
    JavaList array;
    /**
     * Creates new form TableSenoryo1
     */
    public TableSenaryo3() {
    
       
      

    }

  public TableSenaryo3(int data,int aralik,float oran,String sutunbenzerlik ,JavaList Array,String sutunAyni,int complaintID,String ayni,String benzer,Connection connection) {
         this.data= data;
        this.aralik=aralik;
        this.oran=oran;
        this.sutunbenzerlik=sutunbenzerlik;
        this.array=Array;
        this.ayni=ayni;
        this.benzer=benzer;
        this.sutunAyni=sutunAyni;
        this.complaintID=complaintID;
        this.connection=connection;
       
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    @Override
    public void run() {
  
        try {
            
	            
	                 
                   
                 
                      PreparedStatement st2 = (PreparedStatement) connection
	                         .prepareStatement("Select * from bigdata.table1  where table1.index>= ?  and table1.index < ?  and `Complaint ID` !=?");
                               st2.setInt(1,(this.data));
                               st2.setInt(2,(this.aralik));
                               st2.setInt(3, complaintID);
	                    ResultSet rs3 = st2.executeQuery(); 
                          
                    while (rs3.next()) {
                        
                       int num=0;
                       String cmpproduct=rs3.getString(ayni);
                       String cmpbenzerlik=rs3.getString(benzer);
                    

                      if(sutunAyni.equals(cmpproduct)){
           
//System.out.println(product+" "+cmpproduct+" "+benzerlik+" "+cmpbenzerlik+ " ");
                             int cmplen=cmpbenzerlik.split("\\s+").length;
                       int prolen=sutunbenzerlik.split("\\s+").length;
                       String[] a = cmpbenzerlik.split("\\s+");
                       String[] b =sutunbenzerlik.split("\\s+");
                   
    for (int k = 0; k < a.length; k++) {
                   for (int j = 0; j < b.length; j++) {
                           if (!(k>=cmplen) && !(j>=prolen)) {
                               if(a[k].equals(b[j])){
                                     k++;  
              
              num++;
                               }
            
          }
      }
  }
                 //System.out.print(num);
                 if(cmplen>=prolen){
                     if(oran<=(Float.parseFloat(java.math.BigDecimal.valueOf((float)(((float)num/(float)cmplen)*100)).setScale(1,RoundingMode.HALF_UP).toString()))){
                         String data[]={String.valueOf(sutunAyni),String.valueOf(cmpproduct),String.valueOf(sutunbenzerlik),String.valueOf(cmpbenzerlik),String.valueOf(Float.toString((float)(((float)num/(float)cmplen)*100))),};    
                            this.array.senaryo3.add(data);
                                                //    System.out.println(product+" "+cmpproduct+" "+benzerlik+" "+cmpbenzerlik+" "+istenen+" "+cmpistenen+" "+String.valueOf(Float.toString((float)(((float)num/(float)cmplen)*100))));

                     
                     }
                         
                     //  System.out.println(product+" "+cmpproduct+" "+(float)(((float)num/(float)cmplen)*100));
                   }else{
                      if(oran<=(Float.parseFloat(java.math.BigDecimal.valueOf((float)(((float)num/(float)prolen)*100)).setScale(1,RoundingMode.HALF_UP).toString()))){
                         String data[]={String.valueOf(sutunAyni),String.valueOf(cmpproduct),String.valueOf(sutunbenzerlik),String.valueOf(cmpbenzerlik),String.valueOf(Float.toString((float)(((float)num/(float)cmplen)*100))),};    
                            this.array.senaryo3.add(data);
                          //  System.out.println(product+" "+cmpproduct+" "+benzerlik+" "+cmpbenzerlik+" "+istenen+" "+cmpistenen+" "+String.valueOf(Float.toString((float)(((float)num/(float)cmplen)*100))));

                     }
                                                                      
                                          //  System.out.println(product+" "+cmpproduct+" "+(float)(((float)num/(float)prolen)*100));
 
                   } 
                          
                      }
                                            //  System.out.println(" "+product+" "+cmpproduct+" ");       
  
                   
                  
                  
                 
                      
                   
              
                 }
                
               

                                
                                   
	                  
                                                   

            
                   }catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }
        
       
       
    }
    
}
