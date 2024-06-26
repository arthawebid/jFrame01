/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project02;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BCMedia
 */
public class Multidimensi extends javax.swing.JFrame {
    //private String[][] dtBukuAlamat = new String[100][3];
    dtAlamat DA = new dtAlamat(0);
    
    private void cmdTambah(boolean jns){
        cTambah.setEnabled(jns);
    }
    private void StoreData(){
        DA.StoreData(txNama.getText(), txAlamat.getText(), txTelp.getText());
    }
    private void cmdUbah(boolean jns){
        cUbah.setEnabled(jns);
    }
    private void cmdHapus(boolean jns){
        cHapus.setEnabled(jns);
    }
    private void ViewData(int aRec){
        aRec--;
        txNama.setText(DA.GetViewNama(aRec));
        txAlamat.setText(DA.GetViewAlamat(aRec));
        txTelp.setText(DA.GetViewNoTelp(aRec));
        posRec();
    }
    private void edtext(boolean jns){
        txNama.setEditable(jns);
        txAlamat.setEditable(jns);
        txTelp.setEditable(jns);
    }
    private void posRec(){
        LBJREK.setText(String.valueOf(DA.aRec));
        LBREC.setText(String.valueOf(DA.Rec));
    }
    private void clearform(){
        txNama.setText("");
        txAlamat.setText("");
        txTelp.setText("");
    }
    private void loadata(){
        edtext(false);
        //cmdNav(false);
        cmdTambah(true);
        cmdUbah(false);
        cmdHapus(false);
        if(DA.aRec>0){
            ViewData(1);
            //cmdNav(true);
            cmdTambah(true);
            cmdUbah(true);
            cmdHapus(true);
            posRec();
        }
    }
    /**
     * Creates new form Multidimensi
     */
    public Multidimensi() {
        initComponents();
        viewdata();
    }

    private void viewdata(){
        DefaultTableModel TM = (DefaultTableModel) jTable1.getModel();
        TM.setRowCount(0);
        for(String[] row : DA.dtBukuAlamat ){
            TM.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txAlamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txTelp = new javax.swing.JTextField();
        cUbah = new javax.swing.JButton();
        cHapus = new javax.swing.JButton();
        cTutup = new javax.swing.JButton();
        cTambah = new javax.swing.JButton();
        LBJREK = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LBREC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Alamat", "NoTelp"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("No Telp");

        cUbah.setText("Ubah");

        cHapus.setText("Hapus");

        cTutup.setText("TutupForm");
        cTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTutupActionPerformed(evt);
            }
        });

        cTambah.setText("Tambah");
        cTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTambahActionPerformed(evt);
            }
        });

        LBJREK.setText("0");

        jLabel1.setText("/");

        LBREC.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LBJREK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LBREC))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txAlamat)
                            .addComponent(txTelp)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txNama))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBJREK)
                                    .addComponent(jLabel1)
                                    .addComponent(LBREC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTutupActionPerformed
        if(cTutup.getText().equals("Batal")){
            cTambah.setText("Tambah");
            cTutup.setText("TutupForm");
            cmdUbah(true);
            cmdHapus(true);
        }else{
            dispose();
        }
    }//GEN-LAST:event_cTutupActionPerformed

    private void cTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTambahActionPerformed
        if(cTambah.getText().equals("Tambah")){
            System.out.println("ARek: "+DA.aRec+"; JRek: "+DA.getJREC());
            if(DA.aRec+1 > DA.getJREC()){
                JOptionPane.showMessageDialog(null, "Data sudah penuh");
            }else{
                cTambah.setText("Simpan");
                cTutup.setText("Batal");
                clearform();
                cmdUbah(false);
                cmdHapus(false);
                edtext(true);
            }
        }else{
            cTambah.setText("Tambah");
            cTutup.setText("TutupForm");
            edtext(false);
            StoreData();
            viewdata();
            cmdUbah(true);
            cmdHapus(true);
            posRec();
            ViewData(DA.aRec);
            clearform();
        }
    }//GEN-LAST:event_cTambahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txNama.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txAlamat.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txTelp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Multidimensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multidimensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multidimensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multidimensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multidimensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBJREK;
    private javax.swing.JLabel LBREC;
    private javax.swing.JButton cHapus;
    private javax.swing.JButton cTambah;
    private javax.swing.JButton cTutup;
    private javax.swing.JButton cUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txAlamat;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txTelp;
    // End of variables declaration//GEN-END:variables
}
