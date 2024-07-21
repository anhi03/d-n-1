/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package room;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class room extends javax.swing.JFrame {
    private repository rp = new repository();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;
    /**
     * Creates new form room
     */
    public room() {
        initComponents();
        this.filltotable(rp.getAll());
    }
    void filltotable(ArrayList<model_room> list){
        mol = (DefaultTableModel) tbl_phong.getModel();
        mol.setRowCount(0);
        for (model_room x : list) {
            mol.addRow(x.toDataRow());
        }
    }
    void showData(int i){
        
        txt_Maphong.setText(tbl_phong.getValueAt(i, 0).toString());
        txt_dientich.setText(tbl_phong.getValueAt(i, 1).toString());
        cbo_typeroom.setSelectedItem(tbl_phong.getValueAt(i, 2).toString());
        txt_price.setText(tbl_phong.getValueAt(i, 3).toString());
        txt_mota.setText(tbl_phong.getValueAt(i, 4).toString());
        if(tbl_phong.getValueAt(i, 5).toString().equalsIgnoreCase("trống"))
            rb_noroom.setSelected(true);
        else rb_conroom.setSelected(true);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_phong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Maphong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_dientich = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbo_typeroom = new javax.swing.JComboBox<>();
        rb_conroom = new javax.swing.JRadioButton();
        rb_noroom = new javax.swing.JRadioButton();
        btn_Add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Diện tích", "Loại phòng", "Giá phòng", "Mô tả", "Trạng thái"
            }
        ));
        tbl_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_phong);

        jLabel1.setText("Mã phòng:");

        txt_Maphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaphongActionPerformed(evt);
            }
        });

        jLabel2.setText("Diện tích:");

        txt_dientich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dientichActionPerformed(evt);
            }
        });

        jLabel3.setText("Loại phòng:");

        jLabel4.setText("giá:");

        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        jLabel5.setText("mô tả:");

        txt_mota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_motaActionPerformed(evt);
            }
        });

        jLabel6.setText("Trạng thái:");

        cbo_typeroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng đơn", "Phòng ghép" }));

        buttonGroup1.add(rb_conroom);
        rb_conroom.setText("trống");

        buttonGroup1.add(rb_noroom);
        rb_noroom.setText("hết");

        btn_Add.setText("Thêm");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_update.setText("Sửa");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Xóa");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jButton1.setText("Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_noroom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rb_conroom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_dientich, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_Maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addGap(13, 13, 13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbo_typeroom, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_mota)
                                    .addGap(47, 47, 47)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Add)
                                .addGap(26, 26, 26)
                                .addComponent(btn_update)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Maphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_dientich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_typeroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_mota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rb_conroom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_noroom)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add)
                    .addComponent(btn_update))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_MaphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaphongActionPerformed

    private void txt_dientichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dientichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dientichActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_motaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_motaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motaActionPerformed

    private void tbl_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_phongMouseClicked
        // TODO add your handling code here:
        i = tbl_phong.getSelectedRow();
        
        this.showData(i);
        
        
    }//GEN-LAST:event_tbl_phongMouseClicked

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        if (rp.them(this.readForm()) >0) {
            JOptionPane.showMessageDialog(this, "thêm thành công");
            filltotable(rp.getAll());
        }else{
            JOptionPane.showMessageDialog(this, "thêm thất bại");
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        i = tbl_phong.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Chua chon dong muon sua");
        } else {
            String ma = tbl_phong.getValueAt(i, 0).toString();
            if (readForm() != null) {
                if (rp.sua(readForm(), ma) > 0) {
                    JOptionPane.showMessageDialog(this, "Sua thanh cong");
                this.filltotable(rp.getAll());
                }
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if(this.readForm() != null){
            String maXoa = txt_Maphong.getText().toString();
            if(rp.xoa(maXoa) > 0){
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                this.filltotable(rp.getAll());
            }else{
                JOptionPane.showMessageDialog(this, "Xoa that bai");
            }
        }
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_Maphong.setText("");
        txt_dientich.setText("");
        txt_dientich.setText("");
        txt_price.setText("");
        txt_mota.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_typeroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_conroom;
    private javax.swing.JRadioButton rb_noroom;
    private javax.swing.JTable tbl_phong;
    private javax.swing.JTextField txt_Maphong;
    private javax.swing.JTextField txt_dientich;
    private javax.swing.JTextField txt_mota;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables

    model_room readForm() {
        String maphong, mota;
        String loaiphong = cbo_typeroom.getSelectedItem().toString();
        double dientich;
        int giaphong;
        boolean trangthai;
        if (txt_Maphong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chua nhap Ma phong");
            txt_Maphong.requestFocus();
            return null;
        } else {
            maphong = txt_Maphong.getText();
        }
        
        if (txt_dientich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chua nhap dien tich");
            txt_dientich.requestFocus();
            return null;
        } else {
            dientich = Double.parseDouble(txt_dientich.getText());
            if(dientich<0){
                JOptionPane.showMessageDialog(this, "dien tich phai lon hon 0");
                return null;
            }
        }
        
        

        if (txt_price.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chua nhap gia phong");
            txt_price.requestFocus();
            return null;
        } else {
            try{
            giaphong = Integer.parseInt(txt_price.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "giá phong phai la so nguyen");
                return null;
            }
            if(giaphong<0){
                JOptionPane.showMessageDialog(this, "gia phong phai lon hon 0");
                return null;
            }
        }
        if (txt_mota.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chua nhap mo ta");
            txt_mota.requestFocus();
            return null;
        } else {
            mota = txt_mota.getText();
        }
        
        
        if(rb_conroom.isSelected()){
            trangthai = true;
        }else{
            trangthai = false;
        }
        
        
        
        return new model_room(maphong, dientich, loaiphong, giaphong, mota, trangthai);
        
        
        
    }


}
