/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Staff;

import Controller.GoiTapHoanChinhCTR;
import Controller.GoiTapCTR;
import Controller.LoaiGoiTapCTR;
import Object.GoiTap;
import Processor.NumberProcesser;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PackageListDialog extends javax.swing.JDialog {
    
    GoiTapCTR gtc = new GoiTapCTR();
    GoiTapHoanChinhCTR gthcc = new GoiTapHoanChinhCTR();
    LoaiGoiTapCTR lgtc = new LoaiGoiTapCTR();
    ArrayList<GoiTap> lgt = new ArrayList();
    NumberProcesser np = new NumberProcesser();
    DefaultTableModel Dtable;
    Boolean addable = true;
    
    public PackageListDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Dtable = (DefaultTableModel) tableGoiTap.getModel();
        showGT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableGoiTap = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPackageDetail = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableGoiTap.setAutoCreateRowSorter(true);
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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
                .addComponent(jLabel9)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
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
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jScrollPane6)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1383, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void tableGoiTapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGoiTapMouseClicked
        // TODO add your handling code here:
        addable = false;
        
        int index = tableGoiTap.getSelectedRow();
        txtTenGoiTap.setText(lgt.get(index).getTenGoiTap());
        txtTenGoiTap.setEnabled(false);
        txt1.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10000)));
        txt7.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10001)));
        txt30.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10002)));
        txt90.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10003)));
        txt180.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10004)));
        txt365.setText(np.FloatToVND(gthcc.findPrice(lgt.get(index).getMaGoiTap(), 10005)));
        txtPackageDetail.setText(lgt.get(index).getChiTietGoiTap());
        //System.out.println(np.VNDToFloat(txt365.getText()));
    }//GEN-LAST:event_tableGoiTapMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
