/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilerep;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khman
 */
public class pay extends javax.swing.JFrame {

    /**
     * Creates new form print
     */
    public pay() {
        initComponents();
    }
    
    String p_id;
    String c_name;
    String r_id;
    String due;
    String n_pay;
    String b_bal;

    public pay(String ppid, String ccname, String rrid, String mmdue, String npay, String bal) {
      initComponents();
        this.p_id = ppid;
        this.c_name = ccname;
        this.r_id = rrid;
        this.due = mmdue;
        this.n_pay = npay;
        this.b_bal = bal;
        
        txtprint.setText(txtprint.getText()+"****************************************\n");
        txtprint.setText(txtprint.getText()+"********** MOBILE SERVICE CENTER *******\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"************* BILLING ******************\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        
        txtprint.setText(txtprint.getText()+" "+"Payment ID:    " + p_id + "\n");
        txtprint.setText(txtprint.getText()+" "+"Customer Name: " + c_name + "\n");
        txtprint.setText(txtprint.getText()+" "+"Repair ID:     " + r_id + "\n");

        txtprint.setText(txtprint.getText()+" "+"Bill:          " + due + "\n");
        txtprint.setText(txtprint.getText()+" "+"pay:           " + n_pay + "\n");
        txtprint.setText(txtprint.getText()+" "+"Balance:       " + b_bal + "\n");
        txtprint.setText(txtprint.getText()+"\n");
        txtprint.setText(txtprint.getText()+"\n");
        
        txtprint.setText(txtprint.getText()+"****************************************\n");
        txtprint.setText(txtprint.getText()+"****************************************\n");
        txtprint.setText(txtprint.getText()+"************ WELCOME AGAIN *************\n");
        txtprint.setText(txtprint.getText()+"************** THANK YOU ***************\n");
        
        
        try {
            txtprint.print();
        } catch (PrinterException ex) {
            Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(20, 20));

        txtprint.setBackground(new java.awt.Color(255, 255, 255));
        txtprint.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtprint.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtprint;
    // End of variables declaration//GEN-END:variables
}
