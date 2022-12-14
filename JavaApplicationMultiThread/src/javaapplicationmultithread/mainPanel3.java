/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplicationmultithread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pelin
 */
public class mainPanel3 extends javax.swing.JFrame {

    /**
     * Creates new form mainPanel3
     */
    public mainPanel3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sutun1 = new javax.swing.JComboBox<>();
        benzerlikoranÄ± = new javax.swing.JTextField();
        threadsayisi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sonuc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        maxveri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aralik = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        complaintID = new javax.swing.JTextField();
        sutun3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        runtime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablemodel = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        threadtable = new javax.swing.JTable();
        geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setUndecorated(true);
        setResizable(false);

        sutun1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product", "Issue", "Company" }));
        sutun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sutun1ActionPerformed(evt);
            }
        });

        benzerlikoranÄ±.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benzerlikoranÄ±ActionPerformed(evt);
            }
        });

        threadsayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threadsayisiActionPerformed(evt);
            }
        });

        jLabel1.setText("Benzerlik OranÄ±:");

        jLabel2.setText("Thread SayÄ±sÄ±:");

        jLabel3.setText("AynÄ± SÃ¼tunlar");

        sonuc.setText("gÃ¶ster");
        sonuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonucActionPerformed(evt);
            }
        });

        jLabel4.setText("Max Veri");

        maxveri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxveriActionPerformed(evt);
            }
        });

        jLabel5.setText("Thread BaÅÄ± SatÄ±r:");

        jLabel7.setText("Complaint ID:");

        sutun3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product", "Issue", "Company" }));

        jLabel8.setText("Benzerlik SÃ¼tunu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sutun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(sonuc))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sutun1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(benzerlikoranÄ±)
                            .addComponent(threadsayisi)
                            .addComponent(maxveri)
                            .addComponent(aralik)
                            .addComponent(complaintID))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(benzerlikoranÄ±, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(threadsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sutun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(maxveri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(aralik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(complaintID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sutun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(sonuc)
                .addGap(28, 28, 28))
        );

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setText("Program ÃalÄ±Åma SÃ¼resi :");

        tablemodel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KayÄ±t1", "KayÄ±t 2", "Benzerlik 1", "Benzerlik 2", "Benzerlik OranÄ±"
            }
        ));
        tablemodel.setRowHeight(50);
        jScrollPane2.setViewportView(tablemodel);

        threadtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thread ", "Thread Runtime"
            }
        ));
        threadtable.setRowHeight(50);
        jScrollPane1.setViewportView(threadtable);

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(runtime, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(exit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(runtime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sutun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sutun1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sutun1ActionPerformed

    private void benzerlikoranÄ±ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benzerlikoranÄ±ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_benzerlikoranÄ±ActionPerformed

    private void threadsayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threadsayisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threadsayisiActionPerformed

    private void sonucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonucActionPerformed
         Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bigdata", "root", "mysql26");
        } catch (SQLException ex) {
            Logger.getLogger(mainPanel3.class.getName()).log(Level.SEVERE, null, ex);
        }
        int  data = 0;
        int tumdata=Integer.parseInt(maxveri.getText());
        int verisayisi=Integer.parseInt(aralik.getText());

        Thread[] t = new Thread[Integer.parseInt(threadsayisi.getText().toString())];
        JavaList array = new JavaList();
        array.senaryo3.clear();
        DefaultTableModel tblModel=(DefaultTableModel)tablemodel.getModel();
        DefaultTableModel threadModel=(DefaultTableModel)threadtable.getModel();
  ;
int rowCount = tblModel.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    tblModel.removeRow(i);
}

int trowCount = threadModel.getRowCount();
//Remove rows one by one from the end of the table
for (int i = trowCount - 1; i >= 0; i--) {
    threadModel.removeRow(i);
}
        long start = System.currentTimeMillis();
  long birthreadson,birthreadstart;
  
  String benzerlik="",product="";
  
   try {
            
	            
	                // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bigdata", "root", "mysql26");
                           PreparedStatement st = (PreparedStatement) connection
	                         .prepareStatement("SELECT * FROM bigdata.table1 where `Complaint ID`=?");
                                 st.setInt(1,Integer.parseInt(complaintID.getText()));
                                
                                                              
                           ResultSet rs2 = st.executeQuery(); 
                       
                           
                            
                            
               while (rs2.next() ) {
                  product=rs2.getString(sutun1.getSelectedItem().toString());
                  benzerlik=rs2.getString(sutun3.getSelectedItem().toString());
               }}catch(Exception e){
                   System.out.print(e);
               }
        for (int i = 0; i < Integer.parseInt(threadsayisi.getText().toString()); i++) {
          t[i] = new Thread(new TableSenaryo3(data,verisayisi,Float.parseFloat((benzerlikoranÄ±.getText())),benzerlik,array,product,Integer.parseInt(complaintID.getText()),sutun1.getSelectedItem().toString(),sutun3.getSelectedItem().toString(),connection));
               birthreadstart=System.currentTimeMillis();
            t[i].start();

            try {
                t[i].join();
                birthreadson=System.currentTimeMillis();
                int z=i;
                z++;
            String[] threaddata={String.valueOf("Thread"+" "+z),String.valueOf((birthreadson-birthreadstart))};
            threadModel.addRow(threaddata);
            } catch (InterruptedException ex) {
                 Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            data=verisayisi;
            verisayisi+=Integer.parseInt(aralik.getText());
            System.out.println(verisayisi);
            if((verisayisi>tumdata)){
                break;
            }

        }

        long time = System.currentTimeMillis() - start;
        String[] datastr=new String[5];
        for(int z=0;z<array.senaryo3.size();z++){

            for (int i = 0; i < array.senaryo3.get(z).length; i++) {
                datastr[i]=array.senaryo3.get(z)[i].toString();

            }
            String[] tabledata={String.valueOf(datastr[0]),String.valueOf(datastr[1]),String.valueOf(datastr[2]),String.valueOf(datastr[3]),String.valueOf(datastr[4])};
            

            
            tblModel.addRow(tabledata);

        }
        System.out.println(array.senaryo3.size());
        runtime.setText(Long.toString(time));
    }//GEN-LAST:event_sonucActionPerformed

    private void maxveriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxveriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxveriActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        this.dispose();
        new LoginProgram().setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPanel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aralik;
    private javax.swing.JTextField benzerlikoranÄ±;
    private javax.swing.JTextField complaintID;
    private javax.swing.JButton exit;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField maxveri;
    private javax.swing.JLabel runtime;
    private javax.swing.JButton sonuc;
    private javax.swing.JComboBox<String> sutun1;
    private javax.swing.JComboBox<String> sutun3;
    private javax.swing.JTable tablemodel;
    private javax.swing.JTextField threadsayisi;
    private javax.swing.JTable threadtable;
    // End of variables declaration//GEN-END:variables
}
