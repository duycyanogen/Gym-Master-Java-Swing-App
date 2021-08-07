/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import View.Dialog.WarningExitDialog;
import View.LoginAndForgetPassword.LoginForm;
import View.Staff.StaffForm;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class AdminForm extends javax.swing.JFrame {

    CardLayout Layout;
    String MaNV;
    public jPanelStaff nv;
    public jPanelCustomer hv;
    public jPanelPackage gt;
    public jPanelSales dt;
    public JPanelBills hd;
    public jPanelVoucher vc;
    public jPanelChangeDetail tdtt;
    public jPanelExelExport ee;
    int MouseX, MouseY;

    public AdminForm() {
        initComponents();
        Layout = new CardLayout();
        MainPanel.setLayout(Layout);
        MainPanel.add("NhanVien", new jPanelStaff());
        MainPanel.add("HoiVien", new jPanelCustomer());
        MainPanel.add("GoiTap", new jPanelPackage());
        MainPanel.add("DoanhThu", new jPanelSales());
        MainPanel.add("Voucher", new jPanelVoucher());
        MainPanel.add("HoaDon", new JPanelBills());
    }

    public AdminForm(String TenDN) {
        // initComponents();
        initComponents();
        this.setLocationRelativeTo(null);
        MaNV = TenDN;
        Layout = new CardLayout();
        MainPanel.setLayout(Layout);
        nv = new jPanelStaff();
        MainPanel.add("NhanVien", nv);
        hv = new jPanelCustomer();
        MainPanel.add("HoiVien", hv);
        gt = new jPanelPackage();
        MainPanel.add("GoiTap", gt);
        dt = new jPanelSales();
        MainPanel.add("DoanhThu", dt);
        vc = new jPanelVoucher();
        MainPanel.add("Voucher", vc);
        hd = new JPanelBills();
        MainPanel.add("HoaDon", hd);
        tdtt = new jPanelChangeDetail(TenDN);
        MainPanel.add("DoiThongTin", tdtt);
        ee = new jPanelExelExport();
        MainPanel.add("Excel", ee);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelAccount = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        SliderAccount = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanelStaff = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SliderStaff = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelCustomer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SliderCustomer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelProducts = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SliderProduct = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanelSales = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        SliderSales = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelVoucher = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        SliderVouchers = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jStaffMode = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        SliderStaffMode = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanelExcel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        SliderExcel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelBills = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        SliderBillManager1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BG.setBackground(new java.awt.Color(204, 204, 204));
        BG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BGMouseDragged(evt);
            }
        });
        BG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BGMousePressed(evt);
            }
        });
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 39, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAccount.setBackground(new java.awt.Color(42, 39, 41));
        jLabelAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAccountMouseExited(evt);
            }
        });
        jLabelAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_edit_property_30px_1.png"))); // NOI18N
        jLabelAccount.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderAccount.setBackground(new java.awt.Color(192, 27, 54));
        jLabelAccount.add(SliderAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Account");
        jLabelAccount.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(42, 39, 41));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel34.setBackground(new java.awt.Color(192, 27, 54));
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Staff mode");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabelAccount.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 50));

        jPanel2.add(jLabelAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 180, 50));

        jPanelStaff.setBackground(new java.awt.Color(42, 39, 41));
        jPanelStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelStaffMouseExited(evt);
            }
        });
        jPanelStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_staff_30px_2.png"))); // NOI18N
        jPanelStaff.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderStaff.setBackground(new java.awt.Color(192, 27, 54));
        SliderStaff.setOpaque(true);
        jPanelStaff.add(SliderStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Staff");
        jPanelStaff.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(jPanelStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 50));

        jPanelCustomer.setBackground(new java.awt.Color(42, 39, 41));
        jPanelCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCustomerMouseExited(evt);
            }
        });
        jPanelCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_customer_30px.png"))); // NOI18N
        jPanelCustomer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderCustomer.setBackground(new java.awt.Color(192, 27, 54));
        jPanelCustomer.add(SliderCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Customer");
        jPanelCustomer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(jPanelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 50));

        jPanelProducts.setBackground(new java.awt.Color(42, 39, 41));
        jPanelProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelProductsMouseExited(evt);
            }
        });
        jPanelProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\DoAnQuanLyGYM\\src\\View\\Image\\icons8_delivery_handcart_30px.png")); // NOI18N
        jPanelProducts.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderProduct.setBackground(new java.awt.Color(192, 27, 54));
        jPanelProducts.add(SliderProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Products");
        jPanelProducts.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(jPanelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 50));

        jPanelSales.setBackground(new java.awt.Color(42, 39, 41));
        jPanelSales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSalesMouseExited(evt);
            }
        });
        jPanelSales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_total_sales_30px.png"))); // NOI18N
        jPanelSales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderSales.setBackground(new java.awt.Color(192, 27, 54));
        jPanelSales.add(SliderSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Sales");
        jPanelSales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(jPanelSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 50));

        jPanelVoucher.setBackground(new java.awt.Color(42, 39, 41));
        jPanelVoucher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelVoucherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVoucherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelVoucherMouseExited(evt);
            }
        });
        jPanelVoucher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_membership_card_30px.png"))); // NOI18N
        jPanelVoucher.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderVouchers.setBackground(new java.awt.Color(192, 27, 54));
        jPanelVoucher.add(SliderVouchers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Vouchers");
        jPanelVoucher.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(jPanelVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 50));

        jStaffMode.setBackground(new java.awt.Color(42, 39, 41));
        jStaffMode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jStaffMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStaffModeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jStaffModeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jStaffModeMouseExited(evt);
            }
        });
        jStaffMode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\DoAnQuanLyGYM\\src\\View\\Image\\icons8_toggle_on_30px.png")); // NOI18N
        jStaffMode.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderStaffMode.setBackground(new java.awt.Color(192, 27, 54));
        jStaffMode.add(SliderStaffMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Staff mode");
        jStaffMode.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel9.setBackground(new java.awt.Color(42, 39, 41));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel20.setBackground(new java.awt.Color(192, 27, 54));
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Staff mode");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jStaffMode.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 50));

        jPanel2.add(jStaffMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 180, 50));

        jPanelExcel.setBackground(new java.awt.Color(42, 39, 41));
        jPanelExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelExcelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExcelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelExcelMouseExited(evt);
            }
        });
        jPanelExcel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_microsoft_excel_30px_2.png"))); // NOI18N
        jPanelExcel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderExcel.setBackground(new java.awt.Color(192, 27, 54));
        jPanelExcel.add(SliderExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Excel Export");
        jPanelExcel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel11.setBackground(new java.awt.Color(42, 39, 41));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel26.setBackground(new java.awt.Color(192, 27, 54));
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Staff mode");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanelExcel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 50));

        jPanel2.add(jPanelExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 180, 50));

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_exit_50px.png"))); // NOI18N
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        jPanel2.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 50, 50));

        jLabel37.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Log out");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1550, 30));

        jPanelBills.setBackground(new java.awt.Color(42, 39, 41));
        jPanelBills.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBillsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBillsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBillsMouseExited(evt);
            }
        });
        jPanelBills.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\DoAnQuanLyGYM\\src\\View\\Image\\icons8_paid_bill_30px.png")); // NOI18N
        jPanelBills.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        SliderBillManager1.setBackground(new java.awt.Color(192, 27, 54));
        jPanelBills.add(SliderBillManager1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Bills Manager");
        jPanelBills.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel12.setBackground(new java.awt.Color(42, 39, 41));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel40.setBackground(new java.awt.Color(192, 27, 54));
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Staff mode");
        jPanel12.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanelBills.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 50));

        jPanel2.add(jPanelBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, 50));

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 180, 765));

        MainPanel.setBackground(new java.awt.Color(102, 102, 102));
        MainPanel.setPreferredSize(new java.awt.Dimension(1319, 625));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BG.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 174, 1370, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 0, 60)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Gym Master v1.1");

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Control your life, control your wife");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(919, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 1370, 140));

        jLabel36.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("-");
        jLabel36.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        BG.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 5, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("X");
        jLabel38.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        BG.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 5, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelStaffMouseClicked
        Layout.show(MainPanel, "NhanVien");
        bar(SliderStaff);
        nv.repaint();
    }//GEN-LAST:event_jPanelStaffMouseClicked

    private void jPanelStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelStaffMouseEntered
        jPanelStaff.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelStaffMouseEntered

    private void jPanelStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelStaffMouseExited
        jPanelStaff.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelStaffMouseExited

    private void jPanelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCustomerMouseClicked
        Layout.show(MainPanel, "HoiVien");
        bar(SliderCustomer);
        hv.repaint();
    }//GEN-LAST:event_jPanelCustomerMouseClicked

    private void jPanelCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCustomerMouseEntered
        jPanelCustomer.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelCustomerMouseEntered

    private void jPanelCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCustomerMouseExited
        jPanelCustomer.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelCustomerMouseExited

    private void jPanelProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductsMouseClicked
        Layout.show(MainPanel, "GoiTap");
        bar(SliderProduct);
        gt.repaint();
    }//GEN-LAST:event_jPanelProductsMouseClicked

    private void jPanelProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductsMouseEntered
        jPanelProducts.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelProductsMouseEntered

    private void jPanelProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProductsMouseExited
        jPanelProducts.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelProductsMouseExited

    private void jPanelSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalesMouseClicked
        Layout.show(MainPanel, "DoanhThu");
        bar(SliderSales);
        dt.repaint();
    }//GEN-LAST:event_jPanelSalesMouseClicked

    private void jPanelSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalesMouseEntered
        jPanelSales.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelSalesMouseEntered

    private void jPanelSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalesMouseExited
        jPanelSales.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelSalesMouseExited

    private void jPanelVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVoucherMouseClicked
        vc.InitDefaultData();
        Layout.show(MainPanel, "Voucher");
        bar(SliderVouchers);

    }//GEN-LAST:event_jPanelVoucherMouseClicked

    private void jPanelVoucherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVoucherMouseEntered
        jPanelVoucher.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelVoucherMouseEntered

    private void jPanelVoucherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVoucherMouseExited
        jPanelVoucher.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelVoucherMouseExited

    private void jPanelExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExcelMouseClicked
        Layout.show(MainPanel, "Excel");
        bar(SliderExcel);
        //hd.showAllDataHD();
    }//GEN-LAST:event_jPanelExcelMouseClicked

    private void jPanelExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExcelMouseEntered
        jPanelExcel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelExcelMouseEntered

    private void jPanelExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExcelMouseExited
        jPanelExcel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelExcelMouseExited

    private void jStaffModeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStaffModeMouseClicked
        //Layout.show(MainPanel, "NhanVien");
        new StaffForm(MaNV).setVisible(true);
        bar(SliderStaffMode);

    }//GEN-LAST:event_jStaffModeMouseClicked

    private void jStaffModeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStaffModeMouseEntered
        jStaffMode.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jStaffModeMouseEntered

    private void jStaffModeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStaffModeMouseExited
        jStaffMode.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jStaffModeMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1; i += 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabelAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccountMouseClicked
        // TODO add your handling code here:
        Layout.show(MainPanel, "DoiThongTin");
        bar(SliderAccount);
        //tdtt.repaint();

    }//GEN-LAST:event_jLabelAccountMouseClicked

    private void jLabelAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccountMouseEntered
        // TODO add your handling code here:
        jLabelAccount.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jLabelAccountMouseEntered

    private void jLabelAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccountMouseExited
        // TODO add your handling code here:
        jLabelAccount.setBackground((Color.decode("#2a2729")));
    }//GEN-LAST:event_jLabelAccountMouseExited

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        LoginForm f = new LoginForm();
        f.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnLogOutMouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jPanelBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBillsMouseClicked
        Layout.show(MainPanel, "HoaDon");
        bar(SliderBillManager1);
        hd.showAllDataHD();
    }//GEN-LAST:event_jPanelBillsMouseClicked

    private void jPanelBillsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBillsMouseEntered
        jPanelBills.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_jPanelBillsMouseEntered

    private void jPanelBillsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBillsMouseExited
        jPanelBills.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_jPanelBillsMouseExited

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        WarningExitDialog w = new WarningExitDialog("Are you sure to exit the program?");
        w.setVisible(true);
        if (w.Accept == true)
            System.exit(0);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void BGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - MouseX, y - MouseY);
    }//GEN-LAST:event_BGMouseDragged

    private void BGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMousePressed
        MouseX = evt.getXOnScreen();
        MouseY = evt.getYOnScreen();
    }//GEN-LAST:event_BGMousePressed

    public void bar(JLabel lab) {
        SliderAccount.setOpaque(false);
        SliderStaffMode.setOpaque(false);
        SliderExcel.setOpaque(false);
        SliderSales.setOpaque(false);
        SliderCustomer.setOpaque(false);
        SliderStaff.setOpaque(false);
        SliderProduct.setOpaque(false);
        SliderVouchers.setOpaque(false);
        SliderExcel.setOpaque(false);
        SliderBillManager1.setOpaque(false);
        lab.setOpaque(true);
        jPanel2.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel SliderAccount;
    private javax.swing.JLabel SliderBillManager1;
    private javax.swing.JLabel SliderCustomer;
    private javax.swing.JLabel SliderExcel;
    private javax.swing.JLabel SliderProduct;
    private javax.swing.JLabel SliderSales;
    private javax.swing.JLabel SliderStaff;
    private javax.swing.JLabel SliderStaffMode;
    private javax.swing.JLabel SliderVouchers;
    private javax.swing.JLabel btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLabelAccount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBills;
    private javax.swing.JPanel jPanelCustomer;
    private javax.swing.JPanel jPanelExcel;
    private javax.swing.JPanel jPanelProducts;
    private javax.swing.JPanel jPanelSales;
    private javax.swing.JPanel jPanelStaff;
    private javax.swing.JPanel jPanelVoucher;
    private javax.swing.JPanel jStaffMode;
    // End of variables declaration//GEN-END:variables
}
