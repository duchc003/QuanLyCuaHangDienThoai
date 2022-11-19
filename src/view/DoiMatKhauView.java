/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.NhanVien;
import service.impl.DoiMatKhauServiceImpl;
import util.Auth;
import util.MsgBox;
import service.DoiMatKhauService;

/**
 *
 * @author ASUS
 */
public class DoiMatKhauView extends javax.swing.JFrame {

    private DoiMatKhauServiceImpl impl = new DoiMatKhauServiceImpl();

    public DoiMatKhauView() {
        initComponents();
        setLocationRelativeTo(null);
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
        txt_nhapTk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_nhapMKCu = new javax.swing.JPasswordField();
        txt_nhapMKmoi = new javax.swing.JPasswordField();
        txt_nhapLaiMK = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nhập tài khoản");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nhập Mật khẩu cũ");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nhập mật khẩu mới");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/password.png"))); // NOI18N
        jButton1.setText("Đổi mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Đổi Mật Khẩu");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nhập lại mật khẩu");

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nhapTk, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nhapMKCu)
                            .addComponent(txt_nhapMKmoi)
                            .addComponent(txt_nhapLaiMK)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_nhapTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nhapMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nhapMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txt_nhapTk.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền tên tài khoản muốn đổi!");
            return;
            //thông báo nếu password trống    
        }
        if (txt_nhapMKCu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền mật khẩu Cũ!");
            return;
        }
        if (txt_nhapMKmoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập lại mật khẩu mới!");
            return;
        }
        if (txt_nhapLaiMK.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập lại mật khẩu mới vừa nhập!");
            return;
        }
        if (txt_nhapLaiMK.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập lại mật khẩu mới vừa nhập!");
            return;
        }

        String tk = txt_nhapTk.getText();
        String mk = txt_nhapMKCu.getText();
        String matKhauMoi = txt_nhapMKmoi.getText();
        String matKhauNhapLai = txt_nhapLaiMK.getText();
        if (!matKhauMoi.equals(matKhauNhapLai)) {
            JOptionPane.showMessageDialog(this, "Nhập lại mật khẩu chưa trùng khớp");
            return;
        }
        JOptionPane.showMessageDialog(this, impl.update(matKhauMoi, tk));
        new DangNhapView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn hủy bỏ đổi mật khẩu")) {
            System.exit(0); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_nhapLaiMK;
    private javax.swing.JPasswordField txt_nhapMKCu;
    private javax.swing.JPasswordField txt_nhapMKmoi;
    private javax.swing.JTextField txt_nhapTk;
    // End of variables declaration//GEN-END:variables
}
