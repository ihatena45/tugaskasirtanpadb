/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dimbar
 */
public class formkasir extends javax.swing.JFrame {

    /**
     * Creates new form formkasir
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public formkasir() {
        initComponents();
        Kodebarang();
        Total();
        Discount();
    }
    
    
    
    private void Discount(){
        txtDiskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int diskon, hasil_diskon;
                diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", ""))
                        * Integer.parseInt(txtDiskon.getText().replace("", "")) / 100;

                hasil_diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", ""))
                        - diskon;

                txtHasilDiskon.setText(nf.format(diskon ));
                //ppn / pajak
                int hasil_ppn = 0;
                if (chkPpn.isSelected()) {
                    hasil_ppn = hasil_diskon * 10 / 100;
                    txtHasilppn.setText(nf.format(hasil_ppn));
                } else {
                    hasil_ppn = hasil_diskon * 0 / 100;
                    txtHasilppn.setText(nf.format(hasil_ppn));
                }

                //total setelah diskon dan ppn
                int totalBersih;
                totalBersih = hasil_ppn + hasil_diskon;
                lblDisplayHarga.setText("Rp.  " + nf.format(totalBersih));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    private void Total(){
        txtQty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try {
                    int hasil = 0;
                    if (txtQty.getText().equals("")){
                        hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 0;
                    } else {
                        hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 
                                Integer.parseInt(txtQty.getText());
                    }
                    txtTotalharga.setText(nf.format(hasil));
               } catch (Exception e){
               }
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try {
                    int hasil = 0;
                    if (txtQty.getText().equals("")) {
                        hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 0;
                    } else {
                        hasil = Integer.parseInt(txtHarga.getText().replace(".", ""))
                                * Integer.parseInt(txtQty.getText());
                    }
                    txtTotalharga.setText(nf.format(hasil));
                } catch (Exception e) {
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    private void Kodebarang(){
        txtKodebarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  String kodeBarang;
                  kodeBarang = (String) txtKodebarang.getText();
                  
                  switch (kodeBarang){
                      case "B001":
                          txtNamabarang.setText("Acer Aspire 5");
                          txtHarga.setText(nf.format(7500000));
                          txtQty.grabFocus();
                          break;
                      case "B002":
                          txtNamabarang.setText("Advan Workplus Ryzen 7");
                          txtHarga.setText(nf.format(8000000));
                          txtQty.grabFocus();
                          break;
                      case "B003":
                          txtNamabarang.setText("Asus Vivobook OLED RTX 2050");
                          txtHarga.setText(nf.format(11000000));
                          txtQty.grabFocus();
                          break;
                      case "B004":
                          txtNamabarang.setText("Axioo Pongo 725");
                          txtHarga.setText(nf.format(9900000));
                          txtQty.grabFocus();
                          break;
                      case "B005":
                          txtNamabarang.setText("Adata XPG Gammix S70 Blade");
                          txtHarga.setText(nf.format(1135000));
                          txtQty.grabFocus();
                          break;
                      default:
                          txtNamabarang.setText("");
                          txtHarga.setText("");
                  }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  String kodeBarang;
                  kodeBarang = (String) txtKodebarang.getText();
                  
                  switch (kodeBarang){
                      case "B001":
                          txtNamabarang.setText("Acer Aspire 5");
                          txtHarga.setText(nf.format(7500000));
                          txtQty.grabFocus();
                          break;
                      case "B002":
                          txtNamabarang.setText("Advan Workplus Ryzen 7");
                          txtHarga.setText(nf.format(8000000));
                          txtQty.grabFocus();
                          break;
                      case "B003":
                          txtNamabarang.setText("Asus Vivobook OLED RTX 2050");
                          txtHarga.setText(nf.format(11000000));
                          txtQty.grabFocus();
                          break;
                      case "B004":
                          txtNamabarang.setText("Axioo Pongo 725");
                          txtHarga.setText(nf.format(9900000));
                          txtQty.grabFocus();
                          break;
                      case "B005":
                          txtNamabarang.setText("Adata XPG Gammix S70 Blade");
                          txtHarga.setText(nf.format(1135000));
                          txtQty.grabFocus();
                          break;
                      default:
                          txtNamabarang.setText("");
                          txtHarga.setText("");
                  }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDisplayHarga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFaktur = new javax.swing.JTextField();
        txtKodebarang = new javax.swing.JTextField();
        txtNamabarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtTotalharga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        txtHasilDiskon = new javax.swing.JTextField();
        chkPpn = new javax.swing.JCheckBox();
        txtHasilppn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblJmlqty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDisplayHarga.setFont(new java.awt.Font("Andy", 1, 48)); // NOI18N
        lblDisplayHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisplayHarga.setText("Rp.");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("No. Faktur");

        jLabel3.setText("Kode Barang");

        txtHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nama Barang");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Harga");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("QTY");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Harga Barang x QTY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFaktur, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(txtKodebarang))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNamabarang, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalharga, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Faktur", "Kode Barang", "Nama Barang", "Harga", "Qty", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        jLabel4.setText("Harga Barang");

        jLabel5.setText("Diskon %");

        chkPpn.setText("PPN 10%");
        chkPpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPpnActionPerformed(evt);
            }
        });

        jLabel7.setText("Jenis Item Yang Dibeli :");

        lblJmlqty.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblDisplayHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJmlqty)
                        .addGap(0, 566, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkPpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHasilDiskon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(txtHasilppn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtJumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblDisplayHarga)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblJmlqty)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasilppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPpn))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1138, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
        if (txtQty.getText().equals("")){
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            
            Object obj [] = new Object[6];
            obj[1] = txtKodebarang.getText();
            obj[2] = txtNamabarang.getText();
            obj[3] = txtHarga.getText();
            obj[4] = txtQty.getText();
            obj[5] = txtTotalharga.getText();
            
            model.addRow(obj);
            
            int baris = model.getRowCount();
            for(int a = 0; a < baris; a ++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            
            tblList.setRowHeight(30);
            
            lblJmlqty.setText(String.valueOf(baris));
            
            jmlTotalHarga();
            Bersih();
        }
    }//GEN-LAST:event_txtQtyActionPerformed

    private void chkPpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPpnActionPerformed
        // TODO add your handling code here:
        jmlTotalHarga();
    }//GEN-LAST:event_chkPpnActionPerformed

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
            java.util.logging.Logger.getLogger(formkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formkasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPpn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplayHarga;
    private javax.swing.JLabel lblJmlqty;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtFaktur;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHasilDiskon;
    private javax.swing.JTextField txtHasilppn;
    private javax.swing.JTextField txtJumlahharga;
    private javax.swing.JTextField txtKodebarang;
    private javax.swing.JTextField txtNamabarang;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotalharga;
    // End of variables declaration//GEN-END:variables

    private void jmlTotalHarga() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody\
        int sub_total = 0;
        for(int a = 0; a < tblList.getRowCount(); a ++){
            sub_total += Integer.parseInt((String) 
                    tblList.getValueAt(a, 5).toString().replace(".", ""));
        }
        
        txtJumlahharga.setText(nf.format(sub_total));
        
        //discount / diskon / apalah tau
        int diskon, hasil_diskon;
        diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", ""))
                * Integer.parseInt(txtDiskon.getText().replace("", "0")) / 100;
        
        hasil_diskon = Integer.parseInt(txtJumlahharga.getText().replace(".", ""))
                - diskon;
        
        //ppn / pajak
        int hasil_ppn = 0;
        if(chkPpn.isSelected()){
            hasil_ppn = hasil_diskon * 10 /100;
            txtHasilppn.setText(nf.format(hasil_ppn));
        } else {
            hasil_ppn = hasil_diskon * 0 / 100;
            txtHasilppn.setText(nf.format(hasil_ppn));
        }
        
        //total setelah diskon dan ppn
        
        int totalBersih;
        totalBersih = hasil_ppn + hasil_diskon;
        lblDisplayHarga.setText("Rp.  " + nf.format(totalBersih));
    }

    private void Bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        txtKodebarang.setText("");
        txtKodebarang.grabFocus();
        txtQty.setText("");
        txtTotalharga.setText("");
    }
}
