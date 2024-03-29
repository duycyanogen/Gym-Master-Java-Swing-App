/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Staff;

import Controller.ChiTietHoaDonCTR;
import Controller.GoiTapCTR;
import Controller.HoaDonCTR;
import Controller.HoiVienCTR;
import Controller.LoaiGoiTapCTR;
import Object.ChiTietHoaDon;
import Processor.NumberProcesser;
import View.Dialog.ErrorDialog;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Admin
 */
public class BillsForm extends javax.swing.JFrame {
    GoiTapCTR gtc = new GoiTapCTR();
    LoaiGoiTapCTR lgtc = new LoaiGoiTapCTR();
    HoiVienCTR hvc = new HoiVienCTR();
    HoaDonCTR hdc = new HoaDonCTR();
    ChiTietHoaDonCTR cthdc = new ChiTietHoaDonCTR();
    ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<>();
    DefaultTableModel Dtable = new DefaultTableModel();
    NumberProcesser np =new NumberProcesser();
    /**
     * Creates new form NewBillsForm2
     */
    public BillsForm(int MaHD) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtInvoiceNo.setText(MaHD+"");
        txtStaffID.setText(hdc.getDataByMaHD(MaHD).getMaNV()+"");
        txtInvoiceDate.setText(hdc.getDataByMaHD(MaHD).getNgayLap());
        txtCustomerID.setText(hdc.getDataByMaHD(MaHD).getMaHV()+"");
        txtCustomerName.setText(hvc.getData(hdc.getDataByMaHD(MaHD).getMaHV()).getTenHV()+"");
        txtToTalDue.setText(np.FloatToVND(hdc.getPriceByMaHD(MaHD)));
        txtTel.setText(hvc.getData(hdc.getDataByMaHD(MaHD).getMaHV()).getSDT()+"");
        listCTHD = cthdc.getDataByMaHD(MaHD);
        Dtable = (DefaultTableModel) TableHoaDon.getModel();
        showData();
        
    }
     
     private void showData() {         
         if (TableHoaDon.getRowCount() >0)
            Dtable.setRowCount(0); // reset nd trong bang ve 0
         for (ChiTietHoaDon c : listCTHD) {
             Dtable.addRow(new Object[]{gtc.getData(c.getMaGoiTap()).getTenGoiTap(),lgtc.getTenLoaiGoiTap(c.getMaLoaiGoiTap()),c.getNgayBatDau(),c.getNgayKetThuc(),c.getMaVoucher(),c.getGiaCuoi()});
             
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

        txtCustomerName = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JLabel();
        txtTel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JLabel();
        txtInvoiceDate = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JLabel();
        txtToTalDue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCustomerName.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtCustomerName.setText("Nguyễn Thế Duy");
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 131, -1, -1));

        txtCustomerID.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtCustomerID.setText("10001");
        getContentPane().add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 121, -1, -1));

        txtTel.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtTel.setText("0935893903");
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 143, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtEmail.setText("duyzpcm13@gmail.com");
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 152, -1, -1));

        txtInvoiceNo.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtInvoiceNo.setText("10001");
        getContentPane().add(txtInvoiceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 121, -1, -1));

        txtInvoiceDate.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtInvoiceDate.setText("6/7/2021");
        getContentPane().add(txtInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 131, -1, -1));

        txtStaffID.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtStaffID.setText("10001");
        getContentPane().add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 145, -1, -1));

        txtToTalDue.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        txtToTalDue.setText("100.000đ");
        getContentPane().add(txtToTalDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 156, -1, -1));

        TableHoaDon.setFont(new java.awt.Font("Segoe UI Light", 0, 8)); // NOI18N
        TableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package name", "Package type", "Start date", "End date", "Voucher", "Price"
            }
        ));
        TableHoaDon.setPreferredSize(new java.awt.Dimension(450, 303));
        TableHoaDon.setShowHorizontalLines(false);
        TableHoaDon.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TableHoaDon);
        JTableHeader header = TableHoaDon.getTableHeader();
        header.setFont(new Font("Segoe UI Light",Font.PLAIN,9));
        header.setBackground(Color.LIGHT_GRAY);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 330));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("Print");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("Ok");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 0, -1, 630));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Invoice874x1240.jpg"))); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new ErrorDialog("No printer found! Please check your connection!").setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JTable TableHoaDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCustomerID;
    private javax.swing.JLabel txtCustomerName;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtInvoiceDate;
    private javax.swing.JLabel txtInvoiceNo;
    private javax.swing.JLabel txtStaffID;
    private javax.swing.JLabel txtTel;
    private javax.swing.JLabel txtToTalDue;
    // End of variables declaration//GEN-END:variables
}
