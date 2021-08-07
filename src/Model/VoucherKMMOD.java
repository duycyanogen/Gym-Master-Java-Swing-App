/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Object.VoucherKM;
import View.Dialog.ErrorDialog;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class VoucherKMMOD {
    public ArrayList<VoucherKM> getData(){
        ArrayList<VoucherKM> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VOUCHER_KM");
            while(rs.next())
            {
            String MaVoucher = rs.getString("MaVoucher");
            int MaGoiTap = rs.getInt("MaGoiTap");
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");
           // int TrangThai = rs.getInt("TrangThai");
            int GiamGia1 = rs.getInt("GiamGia1");
            Float GiamGia2 = rs.getFloat("GiamGia2");
            int ThemNgay = rs.getInt("ThemNgay");
            String NgayBatDau = rs.getString("NgayBatDau");
            String NgayKetThuc = rs.getString("NgayKetThuc");
            VoucherKM tk = new VoucherKM(MaVoucher, MaGoiTap, MaLoaiGoiTap, GiamGia1, GiamGia2, ThemNgay, NgayBatDau, NgayKetThuc);
            list.add(tk);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public VoucherKM getData(String MaVoucher, int MaGoiTap, int MaLoaiGoiTap){
        
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VOUCHER_KM WHERE MaVoucher = '"+MaVoucher+"' AND MaGoiTap = "+MaGoiTap +" AND MaLoaiGoiTap = "+MaLoaiGoiTap);
            while(rs.next())
            {           
            //int TrangThai = rs.getInt("TrangThai");
            int GiamGia1 = rs.getInt("GiamGia1");
            Float GiamGia2 = rs.getFloat("GiamGia2");
            int ThemNgay = rs.getInt("ThemNgay");
            String NgayBatDau = rs.getString("NgayBatDau");
            String NgayKetThuc = rs.getString("NgayKetThuc");
            return new VoucherKM(MaVoucher, MaGoiTap, MaLoaiGoiTap, GiamGia1, GiamGia2, ThemNgay, NgayBatDau, NgayKetThuc);
           
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public Boolean UpdateData(VoucherKM tk)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Update VOUCHER_KM set GiamGia1 =?, GiamGia2 =?, ThemNgay =?, NgayBatDau =?, NgayKetThuc =? Where MaVoucher =? AND MaGoiTap =? AND MaLoaiGoiTap =?";
            PreparedStatement pst = conn.prepareStatement(sql);            
            //pst.setInt(1, tk.getTrangThai());
            pst.setInt(1, tk.getGiamGia1());          
            pst.setFloat(2, tk.getGiamGia2());
            pst.setInt(3, tk.getThemNgay());
            pst.setString(4, tk.getNgayBatDau());
            pst.setString(5, tk.getNgayKetThuc());
            pst.setString(6,tk.getMaVoucher());
            pst.setInt(7, tk.getMaGoiTap());
            pst.setInt(8, tk.getMaLoaiGoiTap());      
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
       return false;
     }
    
    public Boolean AddData(VoucherKM tk)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO VOUCHER_KM (MaVoucher, MaGoiTap, MaLoaiGoiTap, GiamGia1, GiamGia2, ThemNgay, NgayBatDau, NgayKetThuc) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tk.getMaVoucher());
            pst.setInt(2, tk.getMaGoiTap());
            pst.setInt(3, tk.getMaLoaiGoiTap());
            //pst.setInt(4, tk.getTrangThai());
            pst.setInt(4, tk.getGiamGia1());
            pst.setFloat(5, tk.getGiamGia2());
            pst.setInt(6, tk.getThemNgay());
            pst.setString(7, tk.getNgayBatDau());
            pst.setString(8, tk.getNgayKetThuc());
            return pst.executeUpdate()>0;   
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
    
    public Boolean DeleteData(String MaVoucher, int MaGoiTap, int MaLoaiGoiTap)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete VOUCHER_KM Where MaVoucher =? AND MaGoiTap = ? AND MaLoaiGoiTap =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, MaVoucher);
            pst.setInt(2, MaGoiTap);
            pst.setInt(3,MaLoaiGoiTap);
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
       return false;
     }
    
    
}
