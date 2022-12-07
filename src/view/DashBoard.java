/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import util.Auth;
import util.MsgBox;

/**
 *
 * @author ASUS
 */
public class DashBoard extends javax.swing.JFrame {

    private Color defaultColor, clickColor;

    public DashBoard() {
        initComponents();
        setTitle("Quản Lý Bán Điện Thoại");
        setLocationRelativeTo(null);
        if (Auth.user.getTaiKhoan().equalsIgnoreCase("duchcph22577")) {
            txtNhanVien.setText("Hoàng Công Đức");
            txtVaiTro.setText("Quản Lý");
        }
        if (Auth.user.getTaiKhoan().equalsIgnoreCase("namndph")) {
            txtNhanVien.setText("Nguyễn Đức Nam");
            txtVaiTro.setText("Nhân Viên");
        }
        if (Auth.user.getTaiKhoan().equalsIgnoreCase("hieunvph")) {
            txtNhanVien.setText("Nguyễn Minh Hiếu");
            txtVaiTro.setText("Nhân Viên");
        }
        if (Auth.user.getTaiKhoan().equalsIgnoreCase("huybqph")) {
            txtNhanVien.setText("Bùi Quang Huy");
            txtVaiTro.setText("Nhân Viên");
        }
        if (Auth.user.getTaiKhoan().equalsIgnoreCase("huyhmph")) {
            txtNhanVien.setText("Hoàng Minh Huy");
            txtVaiTro.setText("Nhân Viên");
        }
        BanHangView banHangView = new BanHangView();
        jDesktopPane1.add(banHangView).setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNhanVien = new javax.swing.JLabel();
        txtVaiTro = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblThoat = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblKhuyenMai = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/team.png"))); // NOI18N

        txtNhanVien.setBackground(new java.awt.Color(0, 0, 0));
        txtNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNhanVien.setText("Tên Nhân Viên");

        txtVaiTro.setBackground(new java.awt.Color(0, 0, 0));
        txtVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtVaiTro.setText("Vai Trò");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNhanVien))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtVaiTro)))))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVaiTro)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 200));

        jPanel7.setBackground(new java.awt.Color(0, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rating.png"))); // NOI18N
        lblKhachHang.setText("      Khách Hàng");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblKhachHangMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 75));

        jPanel8.setBackground(new java.awt.Color(0, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/housekeeper.png"))); // NOI18N
        lblNhanVien.setText("      Nhân Viên");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNhanVienMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 75));

        jPanel10.setBackground(new java.awt.Color(0, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setForeground(new java.awt.Color(255, 255, 204));

        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/receipt.png"))); // NOI18N
        lblHoaDon.setText("      Hóa Đơn");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHoaDonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 220, 75));

        jPanel12.setBackground(new java.awt.Color(0, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pie-chart.png"))); // NOI18N
        lblThongKe.setText("     Thống kê");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThongKeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 220, 75));

        jPanel13.setBackground(new java.awt.Color(0, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblThoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/emergency-exit.png"))); // NOI18N
        lblThoat.setText("      Thoát");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 220, 110));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBanHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/personal.png"))); // NOI18N
        lblBanHang.setText("      Bán Hàng");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBanHangMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 75));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/smartphone.png"))); // NOI18N
        lblSanPham.setText("      Sản Phẩm");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSanPhamMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 75));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tag.png"))); // NOI18N
        lblKhuyenMai.setText("     Khuyến mãi");
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, 75));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 800));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1380, 800));

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

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        BanHangView banHangView = new BanHangView();
        jDesktopPane1.add(banHangView).setVisible(true);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        SanPhamView sanPhamView = new SanPhamView();
        jDesktopPane1.add(sanPhamView).setVisible(true);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        KhachHangView khachHangView = new KhachHangView();
        jDesktopPane1.add(khachHangView).setVisible(true);
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        NhanVienView nhanVienView = new NhanVienView();
        jDesktopPane1.add(nhanVienView).setVisible(true);
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        if (Auth.user.getTaiKhoan().equalsIgnoreCase("duchcph22577")) {
            ThongKeView thongKeView = new ThongKeView();
            jDesktopPane1.add(thongKeView).setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn không có quyền xem thống kê");
        }
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        KhuyenMaiView khuyenMaiView = new KhuyenMaiView();
        jDesktopPane1.add(khuyenMaiView).setVisible(true);
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        HoaDonView hoaDonView = new HoaDonView();
        jDesktopPane1.add(hoaDonView).setVisible(true);
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        if (MsgBox.confirm(this, "Bạn có muốn thoát không")) {
            this.dispose();
            new DangNhapView().setVisible(true);
        }
    }//GEN-LAST:event_lblThoatMouseClicked

    private void lblBanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMousePressed
        lblBanHang.setBackground(clickColor);
        lblHoaDon.setBackground(defaultColor);
        lblKhachHang.setBackground(defaultColor);
        lblKhuyenMai.setBackground(defaultColor);
        lblSanPham.setBackground(defaultColor);
        lblNhanVien.setBackground(defaultColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(defaultColor);
    }//GEN-LAST:event_lblBanHangMousePressed

    private void lblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMousePressed
        lblBanHang.setBackground(defaultColor);
        lblHoaDon.setBackground(defaultColor);
        lblKhachHang.setBackground(defaultColor);
        lblKhuyenMai.setBackground(defaultColor);
        lblSanPham.setBackground(clickColor);
        lblNhanVien.setBackground(defaultColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(defaultColor);
    }//GEN-LAST:event_lblSanPhamMousePressed

    private void lblKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMousePressed
        lblBanHang.setBackground(defaultColor);
        lblHoaDon.setBackground(defaultColor);
        lblKhachHang.setBackground(clickColor);
        lblKhuyenMai.setBackground(defaultColor);
        lblSanPham.setBackground(defaultColor);
        lblNhanVien.setBackground(defaultColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(defaultColor);
    }//GEN-LAST:event_lblKhachHangMousePressed

    private void lblNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMousePressed
        lblBanHang.setBackground(defaultColor);
        lblHoaDon.setBackground(defaultColor);
        lblKhachHang.setBackground(defaultColor);
        lblKhuyenMai.setBackground(defaultColor);
        lblSanPham.setBackground(defaultColor);
        lblNhanVien.setBackground(clickColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(defaultColor);
    }//GEN-LAST:event_lblNhanVienMousePressed

    private void lblHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMousePressed
        lblBanHang.setBackground(defaultColor);
        lblHoaDon.setBackground(clickColor);
        lblKhachHang.setBackground(defaultColor);
        lblKhuyenMai.setBackground(defaultColor);
        lblSanPham.setBackground(defaultColor);
        lblNhanVien.setBackground(defaultColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(defaultColor);
    }//GEN-LAST:event_lblHoaDonMousePressed

    private void lblKhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMousePressed
        lblBanHang.setBackground(defaultColor);
        lblHoaDon.setBackground(defaultColor);
        lblKhachHang.setBackground(defaultColor);
        lblKhuyenMai.setBackground(clickColor);
        lblSanPham.setBackground(defaultColor);
        lblNhanVien.setBackground(defaultColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(defaultColor);
    }//GEN-LAST:event_lblKhuyenMaiMousePressed

    private void lblThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMousePressed
        lblBanHang.setBackground(defaultColor);
        lblHoaDon.setBackground(defaultColor);
        lblKhachHang.setBackground(defaultColor);
        lblKhuyenMai.setBackground(defaultColor);
        lblSanPham.setBackground(defaultColor);
        lblNhanVien.setBackground(defaultColor);
        lblThoat.setBackground(defaultColor);
        lblThongKe.setBackground(clickColor);
    }//GEN-LAST:event_lblThongKeMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel txtNhanVien;
    private javax.swing.JLabel txtVaiTro;
    // End of variables declaration//GEN-END:variables
}
