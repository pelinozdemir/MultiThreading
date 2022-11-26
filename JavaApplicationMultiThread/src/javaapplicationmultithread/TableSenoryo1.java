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
public final class TableSenoryo1  implements Runnable{
    private int data;
    private int aralik;
    float oran;
    String sutun;
    JTable tablemodel;
    int Row;
    JavaList array;
    /**
     * Creates new form TableSenoryo1
     */
    public TableSenoryo1() {
    
       
      

    }

  public TableSenoryo1(int data,int aralik,float oran,String sutun ,JavaList Array) {
         this.data= data;
        this.aralik=aralik;
        this.oran=oran;
        this.sutun=sutun;
        this.array=Array;
     
       
       

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
            
	            
	                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bigdata", "root", "mysql26");
                           PreparedStatement st = (PreparedStatement) connection
	                         .prepareStatement("Select * from bigdata.table1  where table1.index >= ? and table1.index <= ?");
                                 st.setInt(1,0);
                                 st.setInt(2,this.aralik);
                                                              
                           ResultSet rs2 = st.executeQuery(); 
                       
                           
                            
                            
               while (rs2.next() ) {
                 String product=rs2.getString(sutun);
                 int index=rs2.getInt("index");   
                 if(this.data>index){
                         PreparedStatement st2 = (PreparedStatement) connection
	                         .prepareStatement("Select * from bigdata.table1  where table1.index> ? and table1.index <= ?");
                               st2.setInt(1,(this.data));
                               st2.setInt(2,(this.aralik));
	                    ResultSet rs3 = st2.executeQuery(); 
                          
                    while (rs3.next()) {
                       int num=0;
                       String cmpproduct=rs3.getString(sutun);
                      
                                            //  System.out.println(" "+product+" "+cmpproduct+" ");       
  
                       int cmplen=cmpproduct.split("\\s+").length;
                       int prolen=product.split("\\s+").length;
                       String[] a = cmpproduct.split("\\s+");
                       String[] b = product.split("\\s+");
                   
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
                         String data[]={String.valueOf(product),String.valueOf(cmpproduct),String.valueOf(Float.toString((float)(((float)num/(float)cmplen)*100))),};    
                            this.array.floors.add(data);
                         
                     
                     }
                         
                     //  System.out.println(product+" "+cmpproduct+" "+(float)(((float)num/(float)cmplen)*100));
                   }else{
                      if(oran<=(Float.parseFloat(java.math.BigDecimal.valueOf((float)(((float)num/(float)prolen)*100)).setScale(1,RoundingMode.HALF_UP).toString()))){
                           String data[]={String.valueOf(product),String.valueOf(cmpproduct),String.valueOf(Float.toString((float)(((float)num/(float)prolen)*100))),};    
                      this.array.floors.add(data);
                     
                     }
                                                                      
                                          //  System.out.println(product+" "+cmpproduct+" "+(float)(((float)num/(float)prolen)*100));
 
                   }
                  
                  
                 
                      
                   
              
                 }
                 }else if(this.data<=index){
                         PreparedStatement st2 = (PreparedStatement) connection
	                         .prepareStatement("Select * from bigdata.table1  where table1.index> ? and table1.index <= ?");
                               st2.setInt(1,(index));
                               st2.setInt(2,(this.aralik));
	                    ResultSet rs3 = st2.executeQuery(); 
                          
                    while (rs3.next()) {
                       int num=0;
                       String cmpproduct=rs3.getString(sutun);
                     // System.out.println(" "+product+" "+cmpproduct+" ");       
                       int cmplen=cmpproduct.split("\\s+").length;
                       int prolen=product.split("\\s+").length;
                       String[] a = cmpproduct.split("\\s+");
                       String[] b = product.split("\\s+");
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
               
                 
                  if(cmplen>=prolen){
                     if(oran<=(Float.parseFloat(java.math.BigDecimal.valueOf((float)(((float)num/(float)cmplen)*100)).setScale(1,RoundingMode.HALF_UP).toString()))){
                         String data[]={String.valueOf(product),String.valueOf(cmpproduct),String.valueOf(Float.toString((float)(((float)num/(float)cmplen)*100))),}; 
                        
                        this.array.floors.add(data);
               
                    

                      
                     }
                         
                     //  System.out.println(product+" "+cmpproduct+" "+(float)(((float)num/(float)cmplen)*100));
                   }else{
                      if(oran<=(Float.parseFloat(java.math.BigDecimal.valueOf((float)(((float)num/(float)prolen)*100)).setScale(1,RoundingMode.HALF_UP).toString()))){
                           String data[]={String.valueOf(product),String.valueOf(cmpproduct),String.valueOf(Float.toString((float)(((float)num/(float)prolen)*100))),}; 
                      this.array.floors.add(data);
                    
                     }
                                                                      
                                          //  System.out.println(product+" "+cmpproduct+" "+(float)(((float)num/(float)prolen)*100));
 
                   }
                  
                  
                 
                      
                   
              
                 }
               
            }

                  
           
                
                
               }

                                
                                   
	                  
                                                   

            
                   }catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }
        
       
       
    }
    
}