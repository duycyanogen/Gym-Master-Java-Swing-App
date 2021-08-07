/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Controller.GoiTapHoanChinhCTR;
import Controller.GoiTapCTR;
import Controller.LoaiGoiTapCTR;
import Object.GoiTapHoanChinh;
import Object.GoiTap;
import Processor.NumberProcesser;
import View.Dialog.ErrorDialog;
import View.Dialog.SuccessDialog;
import View.Dialog.WarningDialg;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class jPanelPackage extends javax.swing.JPanel {

    GoiTapCTR gtc = new GoiTapCTR();
    GoiTapHoanChinhCTR gthcc = new GoiTapHoanChinhCTR();
    LoaiGoiTapCTR lgtc = new LoaiGoiTapCTR();
    ArrayList<GoiTap> lgt = new ArrayList();
    NumberProcesser np = new NumberProcesser();
    DefaultTableModel Dtable;
    Boolean addable = true;

    public jPanelPackage() {
        initComponents();
        Dtable = (DefaultTableModel) tableGoiTap.getModel();
        showGT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableGoiTap = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSuaGT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnXoaGT = new javax.swing.JLabel();
        btnThemGT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPackageDetail = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAuto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTenGoiTap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt365 = new javax.swing.JTextField();
        txt180 = new javax.swing.JTextField();
        txt90 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableGoiTap.setAutoCreateRowSorter(true);
        tableGoiTap.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tableGoiTap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Package ID", "Package name"
            }
        ));
        tableGoiTap.setPreferredSize(new java.awt.Dimension(180, 600));
        tableGoiTap.setShowGrid(false);
        tableGoiTap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGoiTapMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableGoiTap);
        if (tableGoiTap.getColumnModel().getColumnCount() > 0) {
            tableGoiTap.getColumnModel().getColumn(0).setMinWidth(1);
            tableGoiTap.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnSuaGT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_edit_file_48px.png"))); // NOI18N
        btnSuaGT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaGTMouseClicked(evt);
            }
        });

        jLabel4.setText("Change Package");

        jLabel3.setText("Delete Package");

        btnXoaGT.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnXoaGT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_waste_48px.png"))); // NOI18N
        btnXoaGT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaGTMouseClicked(evt);
            }
        });

        btnThemGT.setToolTipText("Thêm hội viên");
        btnThemGT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_new_copy_48px.png"))); // NOI18N
        btnThemGT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemGTMouseClicked(evt);
            }
        });

        jLabel2.setText("Add Package");

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_broom_48px.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel11.setText("Clear");

        txtPackageDetail.setColumns(20);
        txtPackageDetail.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtPackageDetail.setRows(5);
        txtPackageDetail.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtPackageDetail);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel9.setText("Package detail:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThemGT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnXoaGT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnSuaGT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)))
                .addGap(47, 47, 47))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaGT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemGT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaGT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAuto.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnAuto.setText("Generate");
        btnAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Price  (one week):");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 136, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Price (one month):");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 188, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Price (three months):");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 241, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel8.setText("Price (six months):");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 287, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Package name(*):");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 25, -1, -1));

        txtTenGoiTap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTenGoiTap.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtTenGoiTap.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txtTenGoiTap, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 21, 205, 21));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel12.setText("Price (one day): ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 83, -1, -1));

        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txt1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 70, 205, 29));

        txt7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt7.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txt7.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 127, 205, 25));

        txt30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt30.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txt30.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt30, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 180, 205, 24));

        txt365.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt365.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txt365.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt365, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 325, 205, 24));

        txt180.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt180.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txt180.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt180, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 279, 205, 24));

        txt90.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt90.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txt90.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt90, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 232, 205, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setText("Price (one year):");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 333, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jScrollPane6)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaGTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaGTMouseClicked
        // TODO add your handling code here:
        int index = tableGoiTap.getSelectedRow();
        if (index == -1) {
            new ErrorDialog("Please choose package!").setVisible(true);
        } else if (lgt.isEmpty()) {
            new ErrorDialog("There is no package yet!").setVisible(true);
        } else {
            WarningDialg w = new WarningDialg("Are you sure to delete this package?");
            w.setVisible(true);
            if (w.Accept == true) {
                w.setVisible(false);
                if (gthcc.DeleteData(lgt.get(index).getMaGoiTap()) && gtc.DeleteData(lgt.get(index).getMaGoiTap())) {
                    new SuccessDialog("Delete successfully").setVisible(true);
                    showGT();
                }
            } else {
                w.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnXoaGTMouseClicked

    private void btnThemGTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemGTMouseClicked
        // TODO add your handling code here:
        if (addable == true) {
            String TenGoiTap = null;
            String ChiTietGoiTap = null;
            Float Txt7 = 0f, Txt30 = 0f, Txt1 = 0f, Txt90 = 0f, Txt180 = 0f, Txt365 = 0f;
            try {
                Txt1 = np.VNDToFloat(txt1.getText());
                Txt7 = np.VNDToFloat(txt7.getText());
                Txt30 = np.VNDToFloat(txt30.getText());
                Txt90 = np.VNDToFloat(txt90.getText());
                Txt180 = np.VNDToFloat(txt180.getText());
                Txt365 = np.VNDToFloat(txt365.getText());
                if (!txtTenGoiTap.getText().equals("") && !txtPackageDetail.getText().equals("")) {
                    TenGoiTap = txtTenGoiTap.getText();
                    ChiTietGoiTap = txtPackageDetail.getText();
                    GoiTap gt = new GoiTap(0, TenGoiTap, ChiTietGoiTap);
                    Float[] array = {Txt1, Txt7, Txt30, Txt90, Txt180, Txt365};
                    Boolean sorted = true;
                    for (int i = 0; i < 5; i++) {
                        if (array[i] > array[i + 1]) {
                            sorted = false;
                        }
                        break;
                    }
                    if (sorted == false) {
                        new ErrorDialog("Invalid price!").setVisible(true);
                    } else {
                        if (gtc.AddData(gt)) {
                            int MaGoiTap = gtc.getNextID();
                            //System.out.println(MaGoiTap);
                            GoiTapHoanChinh ct1 = new GoiTapHoanChinh(MaGoiTap, 10000, Txt1);
                            gthcc.AddData(ct1);
                            GoiTapHoanChinh ct2 = new GoiTapHoanChinh(MaGoiTap, 10001, Txt7);
                            gthcc.AddData(ct2);
                            GoiTapHoanChinh ct3 = new GoiTapHoanChinh(MaGoiTap, 10002, Txt30);
                            gthcc.AddData(ct3);
                            GoiTapHoanChinh ct4 = new GoiTapHoanChinh(MaGoiTap, 10003, Txt90);
                            gthcc.AddData(ct4);
                            GoiTapHoanChinh ct5 = new GoiTapHoanChinh(MaGoiTap, 10004, Txt180);
                            gthcc.AddData(ct5);
                            GoiTapHoanChinh ct6 = new GoiTapHoanChinh(MaGoiTap, 10005, Txt365);
                            gthcc.AddData(ct6);
                            new SuccessDialog("Add successfully!").setVisible(true);
                            showGT();
                        }
                    }

                } else {
                    new ErrorDialog("Please fill all the field!").setVisible(true);
                }
            } catch (Exception e) {
                new ErrorDialog("Please type match the regex!").setVisible(true);
            }
        }

    }//GEN-LAST:event_btnThemGTMouseClicked

    private void btnAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoActionPerformed
        try {
            Float p = Float.parseFloat(txt1.getText());
            txt7.setText(np.FloatToVND(p * 7));
            txt30.setText(np.FloatToVND(p * 27));
            txt90.setText(np.FloatToVND(p * 80));
            txt180.setText(np.FloatToVND(p * 150));
            txt365.setText(np.FloatToVND(p * 300));
        } catch (Exception e) {
            new ErrorDialog("The price is invalid!!").setVisible(true);
        }

    }//GEN-LAST:event_btnAutoActionPerformed

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        addable = true;
        btnThemGT.setEnabled(true);
        txt1.setText("");
        txt7.setText("");
        txt30.setText("");
        txt90.setText("");
        txt180.setText("");
        txt365.setText("");
        txtTenGoiTap.setText("");
        txtTenGoiTap.setEnabled(true);
    }//GEN-LAST:event_btnClearMouseClicked

    private void tableGoiTapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGoiTapMouseClicked
        // TODO add your handling code here:
        int index = tableGoiTap.getSelectedRow();
        if (index != -1) {
            addable = false;
            btnThemGT.setEnabled(false);
            txtTenGoiTap.setText(lgt.get(index).getTenGoiTap());
            txtTenGoiTap.setEnabled(false);
            txt1.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10000)));
            txt7.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10001)));
            txt30.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10002)));
            txt90.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10003)));
            txt180.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10004)));
            txt365.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10005)));
            txtPackageDetail.setText(lgt.get(index).getChiTietGoiTap());
        }
    }//GEN-LAST:event_tableGoiTapMouseClicked

    private void btnSuaGTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaGTMouseClicked
        // TODO add your handling code here:
        int index = tableGoiTap.getSelectedRow();
        if (index == -1) {
            new ErrorDialog("Please choose the package!").setVisible(true);
        } else if (lgt.isEmpty()) {
            new ErrorDialog("There is not any package!").setVisible(true);
        } else {
            WarningDialg w = new WarningDialg("Are you sure to update this package?");
            w.setVisible(true);
            if (w.Accept == true) {
                Float Txt7 = 0f, Txt30 = 0f, Txt1 = 0f, Txt90 = 0f, Txt180 = 0f, Txt365 = 0f;
                try {
                    Txt1 = np.VNDToFloat(txt1.getText());
                    Txt7 = np.VNDToFloat(txt7.getText());
                    Txt30 = np.VNDToFloat(txt30.getText());
                    Txt90 = np.VNDToFloat(txt90.getText());
                    Txt180 = np.VNDToFloat(txt180.getText());
                    Txt365 = np.VNDToFloat(txt365.getText());
                    Float[] array = {Txt1, Txt7, Txt30, Txt90, Txt180, Txt365};
                    Boolean sorted = true;
                    for (int i = 0; i < 5; i++) {
                        if (array[i] > array[i + 1]) {
                            sorted = false;
                        }
                        break;
                    }
                    if (sorted == false) {
                        new ErrorDialog("Invalid price!").setVisible(true);
                    } else {
                        int MaGoiTap = lgt.get(index).getMaGoiTap();
                        GoiTapHoanChinh ct1 = new GoiTapHoanChinh(MaGoiTap, 10000, Txt1);
                        gthcc.UpdateData(ct1);
                        GoiTapHoanChinh ct2 = new GoiTapHoanChinh(MaGoiTap, 10001, Txt7);
                        gthcc.UpdateData(ct2);
                        GoiTapHoanChinh ct3 = new GoiTapHoanChinh(MaGoiTap, 10002, Txt30);
                        gthcc.UpdateData(ct3);
                        GoiTapHoanChinh ct4 = new GoiTapHoanChinh(MaGoiTap, 10003, Txt90);
                        gthcc.UpdateData(ct4);
                        GoiTapHoanChinh ct5 = new GoiTapHoanChinh(MaGoiTap, 10004, Txt180);
                        gthcc.UpdateData(ct5);
                        GoiTapHoanChinh ct6 = new GoiTapHoanChinh(MaGoiTap, 10005, Txt365);
                        gthcc.UpdateData(ct6);
                        new SuccessDialog("Update successfully!").setVisible(true);
                        showGT();
                    }
                } catch (Exception e) {
                    new ErrorDialog("Invalid price!").setVisible(true);
                }

            }

        }
    }//GEN-LAST:event_btnSuaGTMouseClicked

    public void showGT() {
        int stt = 0;
        NumberProcesser x = new NumberProcesser();
        if (tableGoiTap.getRowCount() > 0) {
            Dtable.setRowCount(0);
        }
        lgt = gtc.getData();
        for (GoiTap goiTap : lgt) {
            Dtable.addRow(new Object[]{++stt, goiTap.getMaGoiTap(), gtc.getData(goiTap.getMaGoiTap()).getTenGoiTap()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuto;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnSuaGT;
    private javax.swing.JLabel btnThemGT;
    private javax.swing.JLabel btnXoaGT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tableGoiTap;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt180;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt365;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt90;
    private javax.swing.JTextArea txtPackageDetail;
    private javax.swing.JTextField txtTenGoiTap;
    // End of variables declaration//GEN-END:variables
}
