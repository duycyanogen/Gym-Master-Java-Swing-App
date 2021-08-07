/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Controller.GoiTapCTR;
import Controller.GoiTapHoanChinhCTR;
import Controller.HoaDonCTR;
import Controller.LoaiGoiTapCTR;
import Controller.VoucherKMCTR;
import Object.VoucherKM;
import Processor.DateProcessor;
import Processor.NumberProcesser;
import View.Dialog.ErrorDialog;
import View.Dialog.SuccessDialog;
import View.Dialog.WarningDialg;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class jPanelVoucher extends javax.swing.JPanel {

    DefaultTableModel DTable;
    GoiTapCTR gtc = new GoiTapCTR();
    LoaiGoiTapCTR lgtc = new LoaiGoiTapCTR();
    HoaDonCTR hdc = new HoaDonCTR();
    VoucherKMCTR vkmc = new VoucherKMCTR();
    DateProcessor dp = new DateProcessor();
    NumberProcesser np = new NumberProcesser();
    String currentDate = dp.getCurrentDate();
    String startDate, endDate;
    ArrayList<VoucherKM> listVoucher = new ArrayList<>();
    Boolean addable = true;

    public jPanelVoucher() {
        initComponents();
        InitDefaultData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtChiTiet = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableVoucher = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMucGiam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMaVoucher = new javax.swing.JTextField();
        GoiTapComboBox = new javax.swing.JComboBox<>();
        LoaiGoiTapComboBox = new javax.swing.JComboBox<>();
        btnGetToDay = new javax.swing.JButton();
        txtStartYear = new javax.swing.JTextField();
        sMonthComboBox = new javax.swing.JComboBox<>();
        sDateComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        eDateComboBox = new javax.swing.JComboBox<>();
        eMonthComboBox = new javax.swing.JComboBox<>();
        txtEndYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoNgayThem = new javax.swing.JTextField();
        giamGia1Radio = new javax.swing.JRadioButton();
        giamGia2Radio = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnXoaVoucher = new javax.swing.JLabel();
        btnThemVoucher = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnActive = new javax.swing.JButton();
        txtDonGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        txtChiTiet.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        txtChiTiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tableVoucher.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tableVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Voucher", "Package", "Package type", "Apply date", "End date", "Status"
            }
        ));
        tableVoucher.setPreferredSize(new java.awt.Dimension(180, 615));
        tableVoucher.setShowHorizontalLines(false);
        tableVoucher.setShowVerticalLines(false);
        tableVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVoucherMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableVoucher);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Voucher:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("Package:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Discount Ammount:");

        GoiTapComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        GoiTapComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiTapComboBoxActionPerformed(evt);
            }
        });

        LoaiGoiTapComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        LoaiGoiTapComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoaiGoiTapComboBoxActionPerformed(evt);
            }
        });

        btnGetToDay.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnGetToDay.setText("Today?");
        btnGetToDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetToDayActionPerformed(evt);
            }
        });

        txtStartYear.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtStartYear.setText("2021");

        sMonthComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        sMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        sMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMonthComboBoxActionPerformed(evt);
            }
        });

        sDateComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        sDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        sDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDateComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setText("Apply day:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setText("End day:");

        eDateComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        eDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        eDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDateComboBoxActionPerformed(evt);
            }
        });

        eMonthComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        eMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        eMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMonthComboBoxActionPerformed(evt);
            }
        });

        txtEndYear.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtEndYear.setText("2021");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Day(s) bonus:");

        giamGia1Radio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(giamGia1Radio);
        giamGia1Radio.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        giamGia1Radio.setText("Discount (%)");

        giamGia2Radio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(giamGia2Radio);
        giamGia2Radio.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        giamGia2Radio.setText("Discount (Direct)");
        giamGia2Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giamGia2RadioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnXoaVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_waste_48px.png"))); // NOI18N
        btnXoaVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaVoucherMouseClicked(evt);
            }
        });

        btnThemVoucher.setToolTipText("Thêm hội viên");
        btnThemVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_new_ticket_48px.png"))); // NOI18N
        btnThemVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemVoucherMouseClicked(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_broom_48px.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setText("Clear");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Delete Voucher");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Add Voucher");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnThemVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnXoaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnXoaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnActive.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnActive.setText("Active");
        btnActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActiveActionPerformed(evt);
            }
        });

        txtDonGia.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Price:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(26, 26, 26)
                                .addComponent(sDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEndYear)
                            .addComponent(txtStartYear))
                        .addGap(18, 18, 18)
                        .addComponent(btnGetToDay))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoNgayThem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(giamGia1Radio)
                                        .addGap(26, 26, 26)
                                        .addComponent(giamGia2Radio))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(GoiTapComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LoaiGoiTapComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtMaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnActive)))))
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(GoiTapComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoaiGoiTapComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giamGia1Radio)
                    .addComponent(giamGia2Radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoNgayThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetToDay)
                    .addComponent(txtStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(eDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(txtChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addComponent(jScrollPane4)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaVoucherMouseClicked
        // TODO add your handling code here:
        int SelectedIndex = tableVoucher.getSelectedRow();
        if (SelectedIndex == -1) {
            //  JOptionPane.showMessageDialog(null, "Mời chọn gói tập cần sửa thông tin!");
            new ErrorDialog("PLease choose voucher first!!").setVisible(true);

        } else if (listVoucher.isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Chưa có gói tập nào!");
            new ErrorDialog("There are not any voucher!").setVisible(true);
        } else {
            WarningDialg w = new WarningDialg("Are you sure to delete this voucher??");
            w.setVisible(true);
            if (w.Accept == true) {
                if (vkmc.DeleteData(listVoucher.get(SelectedIndex).getMaVoucher(), listVoucher.get(SelectedIndex).getMaGoiTap(), listVoucher.get(SelectedIndex).getMaLoaiGoiTap())) {
                    new SuccessDialog("Delete successfully!").setVisible(true);
                    listVoucher.clear();
                    listVoucher = vkmc.getData();
                    showData();
                }

            }
        }

    }//GEN-LAST:event_btnXoaVoucherMouseClicked

    private void btnThemVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemVoucherMouseClicked
        if (addable == true) {
            Boolean isOK = true;
            String MaVoucher = null;
            int MaGoiTap = gtc.getMaGoiTap(GoiTapComboBox.getSelectedItem() + "");
            int MaLoaiGoiTap = lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "");
            getStartDate();
            getEndDate();
            if (txtMaVoucher.getText().isEmpty()) {
                // JOptionPane.showMessageDialog(null, "Mã voucher không được rỗng!");
                new ErrorDialog("Empty voucher is not allowed").setVisible(true);
                isOK = false;
            } else {
                MaVoucher = txtMaVoucher.getText();
            }
            int GiamGia1 = 0, SoNgayThem = 0;
            float GiamGia2 = 0;
            if (txtMucGiam.getText().isEmpty() && txtSoNgayThem.getText().isEmpty()) {
                //JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin!");
                new ErrorDialog("Please fill all the field!").setVisible(true);
                isOK = false;
            } else {
                if (giamGia1Radio.isSelected()) {
                    if (txtMucGiam.getText().isEmpty()) {
                        isOK = false;
                        new ErrorDialog("The discount (%) is empty").setVisible(true);
                    } else {
                        try {
                            GiamGia1 = Integer.parseInt(txtMucGiam.getText());
                            GiamGia2 = 0f;
                            if (GiamGia1 < 0 || GiamGia1 > 100) {
                                new ErrorDialog("The discount (%)  must have value from 1 to 100").setVisible(true);
                                isOK = false;
                            }
                        } catch (Exception e) {
                            new ErrorDialog("The discount (%)  must have value from 1 to 100").setVisible(true);
                            isOK = false;
                        }
                    }
                } else if (giamGia2Radio.isSelected()) {
                    if (txtMucGiam.getText().isEmpty()) {
                        isOK = false;

                        new ErrorDialog("The discount (%)  is empty!").setVisible(true);
                    } else {
                        try {
                            GiamGia2 = Float.parseFloat(txtMucGiam.getText());
                            GiamGia1 = 0;
                            if (GiamGia2 < 0) {

                                new ErrorDialog("The discount must be a number!").setVisible(true);
                                isOK = false;
                            } else if (GiamGia2 >= np.VNDToFloat(txtDonGia.getText())) {

                                new ErrorDialog("The discount must be smaller than the unit price").setVisible(true);
                                isOK = false;
                            }
                        } catch (Exception e) {

                            new ErrorDialog("The discount (%)  must be a number!").setVisible(true);
                            isOK = false;
                        }
                    }
                } else {
                    if (!txtMucGiam.getText().isEmpty()) {

                        new ErrorDialog("Please choose discount type first!").setVisible(true);
                        isOK = false;
                    }
                }
            }

            if (!txtSoNgayThem.getText().isEmpty())
        try {
                SoNgayThem = Integer.parseInt(txtSoNgayThem.getText());
            } catch (Exception e) {
                new ErrorDialog("Bonus day must be an integer number").setVisible(true);
                isOK = false;
            }
            if (dp.CompareDate(startDate, currentDate) < 0) {
                new ErrorDialog("Invalid start date!").setVisible(true);
                isOK = false;
            } else if (dp.CompareDate(startDate, endDate) > 0) {
                new ErrorDialog("Invalid start date or end date!").setVisible(true);
                isOK = false;
            } else {
                if (isOK == true) {
                    VoucherKM x = new VoucherKM(MaVoucher, MaGoiTap, MaLoaiGoiTap, GiamGia1, GiamGia2, SoNgayThem, dp.ReverseDate(startDate), dp.ReverseDate(endDate));
                    listVoucher.add(x);
                    if (vkmc.Adddata(x)) {
                        listVoucher.clear();
                        listVoucher = vkmc.getData();
                        new SuccessDialog("Add successfully !").setVisible(true);
                        showData();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnThemVoucherMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        addable = true;
        btnThemVoucher.setEnabled(true);
        txtChiTiet.setText("");
        txtMaVoucher.setText("");
        txtMaVoucher.setEnabled(true);
        txtMucGiam.setEnabled(true);
        txtMucGiam.setText("");
        txtSoNgayThem.setEnabled(true);
        txtSoNgayThem.setText("");
        GoiTapComboBox.setEnabled(true);
        LoaiGoiTapComboBox.setEnabled(true);
        GoiTapComboBox.setSelectedIndex(0);
        LoaiGoiTapComboBox.setSelectedIndex(0);
        giamGia1Radio.setEnabled(true);
        giamGia2Radio.setEnabled(true);
        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtStartYear.getText());
        currentDate = sDate + "/" + sMonth + "/" + sYear;;
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, 30);
        int eDate = Integer.parseInt(endDate.split("/")[0]);
        int eMonth = Integer.parseInt(endDate.split("/")[1]);
        int eYear = Integer.parseInt(endDate.split("/")[2]);
        eDateComboBox.setSelectedIndex(eDate - 1);
        eMonthComboBox.setSelectedIndex(eMonth - 1);
        txtEndYear.setText(eYear + "");

    }//GEN-LAST:event_btnClearMouseClicked
    int MaGoiTap, MaLoaiGoiTap;
    GoiTapHoanChinhCTR ctgtc = new GoiTapHoanChinhCTR();
    private void GoiTapComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiTapComboBoxActionPerformed

        MaGoiTap = gtc.getMaGoiTap(GoiTapComboBox.getSelectedItem() + "");
        txtDonGia.setText(np.FloatToVND(ctgtc.findPrice(MaGoiTap, MaLoaiGoiTap)));

    }//GEN-LAST:event_GoiTapComboBoxActionPerformed

    private void LoaiGoiTapComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoaiGoiTapComboBoxActionPerformed
        // TODO add your handling code here:
        MaLoaiGoiTap = lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "");
        txtDonGia.setText(np.FloatToVND(ctgtc.findPrice(MaGoiTap, MaLoaiGoiTap)));
    }//GEN-LAST:event_LoaiGoiTapComboBoxActionPerformed

    private void showData() {
        DTable = (DefaultTableModel) tableVoucher.getModel();
        if (tableVoucher.getRowCount() > 0) {
            DTable.setRowCount(0); // reset nd trong bang ve 0
        }
        for (VoucherKM voucherKM : listVoucher) {
            String trangthai = null;
            if (dp.CompareDate(dp.ConvertDate(voucherKM.getNgayKetThuc()), currentDate) == 1) {
                trangthai = "Actived";

            } else {
                trangthai = "Expired";
            }
            DTable.addRow(new Object[]{voucherKM.getMaVoucher(), gtc.getData(voucherKM.getMaGoiTap()).getTenGoiTap(), lgtc.getTenLoaiGoiTap(voucherKM.getMaLoaiGoiTap()), voucherKM.getNgayBatDau(), voucherKM.getNgayKetThuc(), trangthai});
        }
    }
    private void btnGetToDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetToDayActionPerformed
//        // TODO add your handling code here:
        sDateComboBox.setSelectedIndex(java.time.LocalDate.now().getDayOfMonth() - 1);
        sMonthComboBox.setSelectedIndex(java.time.LocalDate.now().getMonthValue() - 1);
        txtStartYear.setText(java.time.LocalDate.now().getYear() + "");
        getStartDate();

    }//GEN-LAST:event_btnGetToDayActionPerformed

    private void sMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMonthComboBoxActionPerformed
        // TODO add your handling code here:
        getStartDate();
    }//GEN-LAST:event_sMonthComboBoxActionPerformed

    private void sDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDateComboBoxActionPerformed
        // TODO add your handling code here:

        getStartDate();

    }//GEN-LAST:event_sDateComboBoxActionPerformed

    private void eDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDateComboBoxActionPerformed
        // TODO add your handling code here:
        getEndDate();
    }//GEN-LAST:event_eDateComboBoxActionPerformed

    private void eMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMonthComboBoxActionPerformed
        // TODO add your handling code here:
        getEndDate();
    }//GEN-LAST:event_eMonthComboBoxActionPerformed

    private void getStartDate() {
        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtStartYear.getText());
        startDate = sDate + "/" + sMonth + "/" + sYear;
    }

    private void getEndDate() {
        int eDate = eDateComboBox.getSelectedIndex() + 1;
        int eMonth = eMonthComboBox.getSelectedIndex() + 1;
        int eYear = Integer.parseInt(txtEndYear.getText());
        endDate = eDate + "/" + eMonth + "/" + eYear;
    }
    private void tableVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVoucherMouseClicked
        // TODO add your handling code here:
        int SelectedIndex = tableVoucher.getSelectedRow();
        if (SelectedIndex != -1) {
            addable = false;
            btnThemVoucher.setEnabled(false);
            txtSoNgayThem.setEnabled(false);
            txtMucGiam.setEnabled(false);
            giamGia1Radio.setEnabled(false);
            giamGia2Radio.setEnabled(false);
            txtMaVoucher.setText(listVoucher.get(SelectedIndex).getMaVoucher());
            startDate = listVoucher.get(SelectedIndex).getNgayBatDau();
            endDate = listVoucher.get(SelectedIndex).getNgayKetThuc();
            //System.out.println(startDate);
            sDateComboBox.setSelectedIndex(Integer.parseInt(listVoucher.get(SelectedIndex).getNgayBatDau().split("-")[2]) - 1);
            sMonthComboBox.setSelectedIndex(Integer.parseInt(listVoucher.get(SelectedIndex).getNgayBatDau().split("-")[1]) - 1);
            eDateComboBox.setSelectedIndex(Integer.parseInt(listVoucher.get(SelectedIndex).getNgayKetThuc().split("-")[2]) - 1);
            eMonthComboBox.setSelectedIndex(Integer.parseInt(listVoucher.get(SelectedIndex).getNgayKetThuc().split("-")[1]) - 1);
            txtStartYear.setText(listVoucher.get(SelectedIndex).getNgayBatDau().split("-")[0]);
            txtEndYear.setText(listVoucher.get(SelectedIndex).getNgayKetThuc().split("-")[0]);
            GoiTapComboBox.setSelectedItem(gtc.getData(listVoucher.get(SelectedIndex).getMaGoiTap()).getTenGoiTap());
            GoiTapComboBox.setEnabled(false);
            LoaiGoiTapComboBox.setSelectedItem(lgtc.getTenLoaiGoiTap(listVoucher.get(SelectedIndex).getMaLoaiGoiTap()));
            LoaiGoiTapComboBox.setEnabled(false);
            txtMaVoucher.setEnabled(false);
            if (dp.CompareDate(dp.ConvertDate(listVoucher.get(SelectedIndex).getNgayKetThuc()), currentDate) == 1) {
                btnActive.setEnabled(false);
            } else {
                btnActive.setEnabled(true);
            }

            String ChiTiet = "";
            if (listVoucher.get(SelectedIndex).getGiamGia1() > 0 && listVoucher.get(SelectedIndex).getThemNgay() > 0 || listVoucher.get(SelectedIndex).getGiamGia2() > 0 && listVoucher.get(SelectedIndex).getThemNgay() > 0) {
                if (listVoucher.get(SelectedIndex).getGiamGia1() > 0) {
                    giamGia1Radio.setSelected(true);
                    //giamGia2Radio.setSelected(false);
                    txtMucGiam.setText(listVoucher.get(SelectedIndex).getGiamGia1() + "");
                    String s1 = "Discount " + listVoucher.get(SelectedIndex).getGiamGia1() + "% and ";
                    ChiTiet = ChiTiet.concat(s1);
                } else if (listVoucher.get(SelectedIndex).getGiamGia2() > 0) {
                    //giamGia1Radio.setSelected(false);
                    giamGia2Radio.setSelected(true);
                    // txtSoNgayThem.setText("");                
                    txtMucGiam.setText(listVoucher.get(SelectedIndex).getGiamGia2() + "");
                    ChiTiet = ChiTiet.concat("Discount " + np.FloatToVND(listVoucher.get(SelectedIndex).getGiamGia2()) + " and");
                }
                if (listVoucher.get(SelectedIndex).getThemNgay() > 0) {
                    ChiTiet = ChiTiet.concat(" add " + listVoucher.get(SelectedIndex).getThemNgay() + " bonus days for this package");
                    txtSoNgayThem.setText(listVoucher.get(SelectedIndex).getThemNgay() + "");
                }
                txtChiTiet.setText(ChiTiet);
            } else {
                if (listVoucher.get(SelectedIndex).getGiamGia1() > 0) {
                    ChiTiet = ChiTiet.concat("Discount " + listVoucher.get(SelectedIndex).getGiamGia1() + "% for this package. ");
                    giamGia1Radio.setSelected(true);
                    //giamGia2Radio.setSelected(false);
                    txtSoNgayThem.setText("0");
                    txtMucGiam.setText(listVoucher.get(SelectedIndex).getGiamGia1() + "");
                } else if (listVoucher.get(SelectedIndex).getGiamGia2() > 0) {
                    ChiTiet = ChiTiet.concat("Discount " + np.FloatToVND(listVoucher.get(SelectedIndex).getGiamGia2()) + " for this package. ");
                    //giamGia1Radio.setSelected(false);
                    giamGia2Radio.setSelected(true);
                    txtSoNgayThem.setText("0");
                    txtMucGiam.setText(listVoucher.get(SelectedIndex).getGiamGia2() + "");

                } else {
                    ChiTiet = ChiTiet.concat("Add " + listVoucher.get(SelectedIndex).getThemNgay() + " bonus day for this package");
                    txtSoNgayThem.setText(listVoucher.get(SelectedIndex).getThemNgay() + "");
                    txtMucGiam.setText("0");
                    giamGia1Radio.setSelected(false);
                    giamGia2Radio.setSelected(false);

                }
                txtChiTiet.setText(ChiTiet);
            }
        }
    }//GEN-LAST:event_tableVoucherMouseClicked

    private void btnActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActiveActionPerformed

        Boolean isOK = true;
        String MaVoucher = null;
        int MaGoiTap = gtc.getMaGoiTap(GoiTapComboBox.getSelectedItem() + "");
        int MaLoaiGoiTap = lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "");
        int TrangThai = 1;
        if (txtMaVoucher.getText().isEmpty()) {
            new ErrorDialog("Empty voucher is not allowed").setVisible(true);
            isOK = false;
        } else {
            MaVoucher = txtMaVoucher.getText();
            int GiamGia1 = 0, SoNgayThem = 0;
            float GiamGia2 = 0;
            if (txtMucGiam.getText().isEmpty() && txtSoNgayThem.getText().isEmpty()) {
                new ErrorDialog("Please fill all the field!").setVisible(true);
                isOK = false;
            } else {
                if (giamGia1Radio.isSelected()) {
                    if (txtMucGiam.getText().isEmpty()) {
                        isOK = false;
                        new ErrorDialog("The discount (%)  is empty!").setVisible(true);
                    } else {
                        try {
                            GiamGia1 = Integer.parseInt(txtMucGiam.getText());
                            GiamGia2 = 0f;
                            if (GiamGia1 < 0 || GiamGia1 > 100) {
                                new ErrorDialog("The discount (%)  must have value from 1 to 100").setVisible(true);
                                isOK = false;
                            }
                        } catch (Exception e) {
                            new ErrorDialog("The discount (%)  must have value from 1 to 100").setVisible(true);
                            isOK = false;
                        }
                    }
                } else if (giamGia2Radio.isSelected()) {
                    if (txtMucGiam.getText().isEmpty()) {
                        isOK = false;
                        new ErrorDialog("The discount (%)  is empty").setVisible(true);
                    } else {
                        try {
                            GiamGia2 = Float.parseFloat(txtMucGiam.getText());
                            GiamGia1 = 0;
                            if (GiamGia2 < 0) {
                                new ErrorDialog("The discount (%)  must be a number!").setVisible(true);
                                isOK = false;
                            }
                        } catch (Exception e) {
                            new ErrorDialog("The discount (%)  must be a number!").setVisible(true);
                            isOK = false;
                        }
                    }
                } else {
                    if (!txtMucGiam.getText().isEmpty()) {
                        new ErrorDialog("Please choose discount type first!").setVisible(true);
                        isOK = false;
                    }
                }

            }
            if (!txtSoNgayThem.getText().isEmpty())
        try {
                SoNgayThem = Integer.parseInt(txtSoNgayThem.getText());
            } catch (Exception e) {
                new ErrorDialog("Bonus day(s) must be an integer number!").setVisible(true);
                isOK = false;
            }
            if (dp.CompareDate(startDate, currentDate) < 0) {
                new ErrorDialog("Invalid start date").setVisible(true);
                isOK = false;
            } else if (dp.CompareDate(startDate, endDate) > 0) {
                new ErrorDialog("Invalid start date or end date!").setVisible(true);
                isOK = false;
            } else {
                if (isOK == true) {
                    WarningDialg w = new WarningDialg("Are you sure to active this voucher?");
                    w.setVisible(true);
                    if (w.Accept == true) {
                        VoucherKM x = new VoucherKM(MaVoucher, MaGoiTap, MaLoaiGoiTap, GiamGia1, GiamGia2, SoNgayThem, dp.ReverseDate(startDate), dp.ReverseDate(endDate));
                        listVoucher.add(x);
                        VoucherKMCTR vckm = new VoucherKMCTR();
                        if (vckm.UpdateData(x)) {
                            listVoucher.clear();
                            listVoucher = vckm.getData();
                            new SuccessDialog("Update successfully !").setVisible(true);
                            showData();
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnActiveActionPerformed

    private void giamGia2RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giamGia2RadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giamGia2RadioActionPerformed

    public void InitDefaultData() {
        listVoucher = vkmc.getData();
        ArrayList<String> list1 = gtc.ToString();
        GoiTapComboBox.removeAllItems();
        for (String string : list1) {
            GoiTapComboBox.addItem(string);
        }
        ArrayList<String> list2 = lgtc.ToString();
        LoaiGoiTapComboBox.removeAllItems();
        for (String string : list2) {
            LoaiGoiTapComboBox.addItem(string);
        }
        sDateComboBox.setSelectedIndex(java.time.LocalDate.now().getDayOfMonth() - 1);
        sMonthComboBox.setSelectedIndex(java.time.LocalDate.now().getMonthValue() - 1);
        txtStartYear.setText(java.time.LocalDate.now().getYear() + "");

        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtStartYear.getText());
        currentDate = sDate + "/" + sMonth + "/" + sYear;;
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, 30);
        int eDate = Integer.parseInt(endDate.split("/")[0]);
        int eMonth = Integer.parseInt(endDate.split("/")[1]);
        int eYear = Integer.parseInt(endDate.split("/")[2]);
        eDateComboBox.setSelectedIndex(eDate - 1);
        eMonthComboBox.setSelectedIndex(eMonth - 1);
        txtEndYear.setText(eYear + "");
        btnActive.setEnabled(false);
        showData();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GoiTapComboBox;
    private javax.swing.JComboBox<String> LoaiGoiTapComboBox;
    private javax.swing.JButton btnActive;
    private javax.swing.JLabel btnClear;
    private javax.swing.JButton btnGetToDay;
    private javax.swing.JLabel btnThemVoucher;
    private javax.swing.JLabel btnXoaVoucher;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> eDateComboBox;
    private javax.swing.JComboBox<String> eMonthComboBox;
    private javax.swing.JRadioButton giamGia1Radio;
    private javax.swing.JRadioButton giamGia2Radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> sDateComboBox;
    private javax.swing.JComboBox<String> sMonthComboBox;
    private javax.swing.JTable tableVoucher;
    private javax.swing.JLabel txtChiTiet;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtEndYear;
    private javax.swing.JTextField txtMaVoucher;
    private javax.swing.JTextField txtMucGiam;
    private javax.swing.JTextField txtSoNgayThem;
    private javax.swing.JTextField txtStartYear;
    // End of variables declaration//GEN-END:variables
}
