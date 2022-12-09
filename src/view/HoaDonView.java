/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.impl.HoaDonChiTietServiceImpl;
import service.impl.hoaDonViewModelServicesImplHUY;
import util.MsgBox;
import viewmodel.ChiTietHoaDonView;
import viewmodel.hoaDonViewModelHUY;

/**
 *
 * @author ASUS
 */
public class HoaDonView extends javax.swing.JInternalFrame {

    /**
     * Creates new form HoaDonView
     */
    private final hoaDonViewModelServicesImplHUY hoaViewModelServicesImplHUY = new hoaDonViewModelServicesImplHUY();
    private HoaDonChiTietServiceImpl impl = new HoaDonChiTietServiceImpl();
    private DefaultTableModel dtm = new DefaultTableModel();

    public HoaDonView() {
        initComponents();
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        loadtable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        txt_timKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbo_trangThai = new javax.swing.JComboBox<>();
        cbo_HTTT = new javax.swing.JComboBox<>();
        cbo_HTGH = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDonChiTiet = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MaHD", "Ten NhanVien", "Tên Khách Hàng", "Tổng Tiền", "tên  HTTT", "Tên HTGH", "Trạng Thái"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        txt_timKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timKiemCaretUpdate(evt);
            }
        });

        jLabel1.setText("Tìm Kiếm");

        cbo_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã Thanh Toán", "Đã Hủy", "Chờ Thanh Toán", "Đang Giao Hàng", "Giao Hàng Thành Công" }));
        cbo_trangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_trangThaiItemStateChanged(evt);
            }
        });

        cbo_HTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "Quẹt Thẻ", "Chuyển Khoản", "Quét Mã" }));
        cbo_HTTT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_HTTTItemStateChanged(evt);
            }
        });
        cbo_HTTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_HTTTActionPerformed(evt);
            }
        });

        cbo_HTGH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tại Quầy", "Khác" }));
        cbo_HTGH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_HTGHItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbo_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(cbo_HTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(cbo_HTGH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_HTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_HTGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1270, 390));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MaHD", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Tiền Thừa", "Tiền Giảm Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHoaDonChiTiet);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 910, 300));

        jLabel2.setText("Hóa Đơn Chi Tiết");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel3.setText("Hóa Đơn");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 500, 330, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_timKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timKiemCaretUpdate
        if (txt_timKiem.getText().equalsIgnoreCase("")) {
            return;
        }
        String maHD = txt_timKiem.getText();
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemHoaDonViewModelHUY(maHD);
        int i = 1;
        for (hoaDonViewModelHUY hd : list) {

            model.addRow(new Object[]{
                i++,
                hd.getMaHD(),
                hd.getHoVaTen(),
                hd.getTenKhachHang(),
                hd.getTongTien(),
                hd.getTenHTTT(),
                hd.getTenHTGH(),
                hd.getTrangThai()

            });
        }
    }//GEN-LAST:event_txt_timKiemCaretUpdate

    private void cbo_trangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_trangThaiItemStateChanged
        // TODO add your handling code here:
        if (cbo_trangThai.getSelectedIndex() == 0) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_trangThai.getSelectedIndex() == 1) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_trangThai.getSelectedIndex() == 2) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_trangThai.getSelectedIndex() == 3) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_trangThai.getSelectedIndex() == 4) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }


    }//GEN-LAST:event_cbo_trangThaiItemStateChanged

    private void cbo_HTTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_HTTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_HTTTActionPerformed

    private void cbo_HTTTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_HTTTItemStateChanged
        if (cbo_HTTT.getSelectedIndex() == 0) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_HTTT.getSelectedIndex() == 1) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_HTTT.getSelectedIndex() == 2) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }
        if (cbo_HTTT.getSelectedIndex() == 3) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }


    }//GEN-LAST:event_cbo_HTTTItemStateChanged

    private void cbo_HTGHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_HTGHItemStateChanged
        // TODO add your handling code here:
        if (cbo_HTGH.getSelectedIndex() == 0) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });

            }
            return;
        }

        if (cbo_HTGH.getSelectedIndex() == 0) {
            String tranThai = cbo_trangThai.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.setRowCount(0);
            List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.timKiemCombobox(tranThai);
            int i = 1;
            for (hoaDonViewModelHUY hd : list) {
                model.addRow(new Object[]{
                    i++,
                    hd.getMaHD(),
                    hd.getHoVaTen(),
                    hd.getTenKhachHang(),
                    hd.getTongTien(),
                    hd.getTenHTTT(),
                    hd.getTenHTGH(),
                    hd.getTrangThai()

                });
            }
            return;
        }
    }//GEN-LAST:event_cbo_HTGHItemStateChanged

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        dtm = (DefaultTableModel) tblHoaDonChiTiet.getModel();
        dtm.setRowCount(0);
        List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.getAllhoaDonViewModelHUY();
        List<ChiTietHoaDonView> listHoaDon = impl.getAllCt(list.get(tblHoaDon.getSelectedRow()).getId());
        int i =1;
        for (ChiTietHoaDonView x : listHoaDon) {
            dtm.addRow(new Object[]{
                i++,
                x.getMaHD(),
                x.getTenSP(),
                x.getSoLuong(),
                x.getDonGia(),
                x.getTienThua(),
                x.getTienGiamGia()
            });
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_HTGH;
    private javax.swing.JComboBox<String> cbo_HTTT;
    private javax.swing.JComboBox<String> cbo_trangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblHoaDonChiTiet;
    private javax.swing.JTextField txt_timKiem;
    // End of variables declaration//GEN-END:variables

    private void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void xuatExcel() {
        DefaultTableModel model = (DefaultTableModel) this.tblHoaDon.getModel();
        JFileChooser jfc = new JFileChooser("documents");
        int result = jfc.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File newFile = jfc.getSelectedFile();
                newFile = new File(newFile.toString() + ".xlsx");
                XSSFWorkbook xwb = new XSSFWorkbook();
                XSSFSheet Diemsheep = xwb.createSheet("Thống kê Hóa Đơn");
                XSSFRow row = Diemsheep.createRow((short) 0);
                XSSFCell h;
                for (int i = 0; i < model.getColumnCount(); i++) {
                    h = row.createCell((short) i);
                    h.setCellValue(model.getColumnName(i));
                }

                XSSFRow row1;
                XSSFCell a1;
                for (int i = 0; i < model.getRowCount(); i++) {
                    row1 = Diemsheep.createRow((short) i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        a1 = row1.createCell((short) j);
                        a1.setCellValue(model.getValueAt(i, j).toString());
                    }
                }
                FileOutputStream file = new FileOutputStream(newFile.getAbsoluteFile().getPath());
                xwb.write(file);
                xwb.close();
                file.close();
                MsgBox.alert(this, "Xuất tệp thành công");
                openFile(newFile.toString());
            } catch (Exception e) {
                MsgBox.alert(this, "Xuất tệp thất bại");
            }
        }
    }

    private void loadtable() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        List<hoaDonViewModelHUY> list = hoaViewModelServicesImplHUY.getAllhoaDonViewModelHUY();
        int i = 1;
        for (hoaDonViewModelHUY hd : list) {
            model.addRow(new Object[]{
                i++,
                hd.getMaHD(),
                hd.getHoVaTen(),
                hd.getTenKhachHang(),
                hd.getTongTien(),
                hd.getTenHTTT(),
                hd.getTenHTGH(),
                hd.getTrangThai()
            });
        }

    }
}
