/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.HangSP;
import model.HoaDon;
import service.HoaDonServices;
import service.SanPhamFormBanHangServices;
import service.impl.HoaDonServicesImpl;
import service.impl.SanPhamFormBanHangServicesImpl;
import viewmodel.HoaDonViewModel;
import viewmodel.SanPhamFormBanHangViewModel;

/**
 *
 * @author ASUS
 */
public class BanHangView extends javax.swing.JInternalFrame {

//    private final Dimension ds = new Dimension(250, 150);
//    private final Dimension cs = WebcamResolution.VGA.getSize();
//    private final Webcam wCam = Webcam.getDefault();
//    private final WebcamPanel wCamPanel = new WebcamPanel(wCam, ds, false);
    private DefaultTableModel tblModel1 = new DefaultTableModel();
    private HoaDonServices hoaDonServices = new HoaDonServicesImpl();
    private SanPhamFormBanHangServices sanPhamFormBanHangServices = new SanPhamFormBanHangServicesImpl();
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    private List<SanPhamFormBanHangViewModel> lst = new ArrayList<>();

    public BanHangView() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
//        wCam.setViewSize(cs);
//        wCamPanel.setFillArea(true);
//        lblCamera.setLayout(new FlowLayout());
//        lblCamera.add(wCamPanel);
//        initWebcam();
        loadHoaDon();
        lst = sanPhamFormBanHangServices.getAll();
        loadSanPham(lst);
        cbbTenHang(sanPhamFormBanHangServices.getTenHangSPs());
    }

//    private void initWebcam() {
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//                wCamPanel.start();
//            }
//        };
//        t.setDaemon(true);
//        t.start();
//    }
    private void cbbTenHang(List<HangSP> list) {
        cbbTenHang.setModel(dcbm);
        for (HangSP hangSP : list) {
            dcbm.addElement(hangSP.getTen());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblCamera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbbTenHang = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Ngày Tạo", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tblHoaDon);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 450, 140));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/invoice.png"))); // NOI18N
        jButton1.setText("Tạo hóa Đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Hóa Đơn");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 500, 220));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn giá", "Thành Tiền"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 740, 160));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCamera.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lblCameraLayout = new javax.swing.GroupLayout(lblCamera);
        lblCamera.setLayout(lblCameraLayout);
        lblCameraLayout.setHorizontalGroup(
            lblCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        lblCameraLayout.setVerticalGroup(
            lblCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel4.add(lblCamera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Quét mã sản phẩm");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 270, 180));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(51, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Hãng", "Giá Bán", "Xuất Xứ"
            }
        ));
        jScrollPane2.setViewportView(tblSanPham);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 700, 200));

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jButton6.setText("Thêm");
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });
        jPanel6.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 310, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tìm kiếm");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 740, 270));

        jPanel8.setBackground(new java.awt.Color(0, 204, 255));

        jPanel9.setBackground(new java.awt.Color(0, 204, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 218, -1));

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel7.setText("Mã Hóa Đơn");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTextField7.setEnabled(false);
        jPanel9.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, -1));

        jLabel8.setText("Ngày Tạo");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 240, -1));

        jLabel9.setText("Giảm giá");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel10.setText("Tiền khách");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 240, -1));

        jLabel12.setText("TG bảo hành");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel13.setText("Tiền Thừa");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 410, -1, -1));

        jTextField1.setEnabled(false);
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 240, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 475, 240, 62));

        jLabel14.setText("Mô tả");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 475, -1, -1));

        jButton5.setBackground(new java.awt.Color(102, 255, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiply.png"))); // NOI18N
        jButton5.setText("Hủy đơn");
        jPanel9.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 589, 150, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tại Quầy", "Chuyển Khoản", "Quẹt Thẻ", "Quét Mã" }));
        jPanel9.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 589, 143, 39));

        jButton4.setBackground(new java.awt.Color(102, 255, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pay.png"))); // NOI18N
        jButton4.setText("Thanh Toán");
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 646, 160, -1));

        jTextField10.setEnabled(false);
        jPanel9.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 240, -1));

        jLabel11.setText("Tổng Tiền");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextField12.setEnabled(false);
        jPanel9.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 240, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 Tháng", "6 Tháng", "9 Tháng ", "12 Tháng" }));
        jPanel9.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 240, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tại quầy", jPanel8);

        jPanel7.setBackground(new java.awt.Color(0, 204, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Tổng Tiền");

        jLabel3.setText("Ngày Tạo");

        jLabel4.setText("Khuyến Mãi");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel15.setText("TG BH");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel19.setText("Thu hộ tiền");

        jLabel20.setText("Tiền thừa");

        jLabel21.setText("Mô tả");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiply.png"))); // NOI18N
        jButton2.setText("Hủy Đơn");

        jButton7.setBackground(new java.awt.Color(102, 255, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pay.png"))); // NOI18N
        jButton7.setText("Thanh toán");

        jButton8.setBackground(new java.awt.Color(102, 255, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jButton8.setText("Thêm");

        jLabel6.setText("Mã Hóa Đơn");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel21)
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jButton7)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ShipCode", jPanel7);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 440, 790));

        jButton9.setBackground(new java.awt.Color(102, 255, 102));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash.png"))); // NOI18N
        jButton9.setText("Xóa");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Sản Phẩm");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Giỏ Hàng");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        cbbTenHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTenHangItemStateChanged(evt);
            }
        });
        jPanel1.add(cbbTenHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new KhachHangJframe().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addHoaDon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        searchByMa();

    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void cbbTenHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTenHangItemStateChanged
        String tenHagString = (String) cbbTenHang.getSelectedItem();
        List<SanPhamFormBanHangViewModel> list = sanPhamFormBanHangServices.searchTenHang(lst, tenHagString);
        loadSanPham(list);
    }//GEN-LAST:event_cbbTenHangItemStateChanged
    private void loadHoaDon() {
        List<HoaDonViewModel> list = hoaDonServices.getAll();
        DefaultTableModel tblModel = new DefaultTableModel();

        tblModel = (DefaultTableModel) tblHoaDon.getModel();
        tblModel.setRowCount(0);

        int i = 1;
        for (HoaDonViewModel hd : list) {
            tblModel.addRow(new Object[]{
                i++,
                hd.getMaHD(),
                hd.getNgayTao(),
                hd.getTrangThai()
            });
        }
    }

    private void addHoaDon() {
        HoaDon hoaDon = new HoaDon();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        String dateTT = df.format(date);
        Random rd = new Random();

        hoaDon.setMaHD("HD" + rd.nextInt(999999));
        hoaDon.setNgayTao(dateTT);
        hoaDon.setTrangThai("Chờ Thanh Toán");

        JOptionPane.showMessageDialog(this, hoaDonServices.addHoaDon(hoaDon));
        loadHoaDon();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbTenHang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel lblCamera;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void loadSanPham(List<SanPhamFormBanHangViewModel> lst) {
        tblModel1 = (DefaultTableModel) tblSanPham.getModel();
        tblModel1.setRowCount(0);
        int i = 1;
        for (SanPhamFormBanHangViewModel spp : lst) {
            tblModel1.addRow(new Object[]{
                i++,
                spp.getMaSp(),
                spp.getTenSp(),
                spp.getSoLuong(),
                spp.getHang(),
                spp.getGiaBan(),
                spp.getXuatXu()
            });
        }
    }

    private void searchByMa() {
        DefaultTableModel tblModel2 = new DefaultTableModel();
        tblModel2 = (DefaultTableModel) tblSanPham.getModel();
        tblModel2.setRowCount(0);
        List<SanPhamFormBanHangViewModel> sp = sanPhamFormBanHangServices.Search(txtTimKiem.getText());
        int i = 1;
        for (SanPhamFormBanHangViewModel spp : sp) {
            tblModel2.addRow(new Object[]{
                i++,
                spp.getMaSp(),
                spp.getTenSp(),
                spp.getSoLuong(),
                spp.getHang(),
                spp.getGiaBan(),
                spp.getXuatXu()
            });
        }
    }

}
