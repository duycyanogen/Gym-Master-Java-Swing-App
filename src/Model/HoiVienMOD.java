/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Object.HoiVien;
import View.Dialog.ErrorDialog;

/**
 *
 * @author Admin
 */
public class HoiVienMOD {

    public ArrayList<HoiVien> getData() {
        ArrayList<HoiVien> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOI_VIEN");
            while (rs.next()) {
                int MaHV = rs.getInt("MaHV");
                String TenHV = rs.getString("TenHV");
                String NgaySinh = rs.getString("NgaySinh");
                String DiaChi = rs.getString("DiaChi");
                String SDT = rs.getString("SDT");
                String Email = rs.getString("Email");
                String GioiTinh = rs.getString("GioiTinh");
                String Facebook = rs.getString("Facebook");
                String Anh = rs.getString("Anh");
                String CMND = rs.getString("CMND");
                HoiVien hv = new HoiVien(MaHV, TenHV, NgaySinh, DiaChi, SDT, Email, GioiTinh, Facebook, Anh, CMND);
                //HoiVien(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String CMND
                list.add(hv);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HoiVienMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public HoiVien getData(int MaHV) {
        //ArrayList<HoiVien> list = new ArrayList<>();
        HoiVien hv = new HoiVien();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOI_VIEN WHERE MaHV = " + MaHV);
            while (rs.next()) {
                //int MaHV = rs.getInt("MaHV");
                String TenHV = rs.getString("TenHV");
                String NgaySinh = rs.getString("NgaySinh");
                String DiaChi = rs.getString("DiaChi");
                String SDT = rs.getString("SDT");
                String Email = rs.getString("Email");
                String GioiTinh = rs.getString("GioiTinh");
                String Facebook = rs.getString("Facebook");
                String Anh = rs.getString("Anh");
                String CMND = rs.getString("CMND");
                hv = new HoiVien(0, TenHV, NgaySinh, DiaChi, SDT, Email, GioiTinh, Facebook, Anh, CMND);
                //list.add(hv);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HoiVienMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hv;
    }

    // CREATE
    public Boolean AddData(HoiVien hv) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO HOI_VIEN (TenHV,NgaySinh,DiaChi,SDT,Email,GioiTinh,Facebook,Anh,CMND) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            // pst.setInt(1, hv.getMaHV());
            pst.setString(1, hv.getTenHV());
            pst.setString(2, hv.getNgaySinh());          
            pst.setString(3, hv.getDiaChi());
            pst.setString(4, hv.getSDT());
            pst.setString(5, hv.getEmail());
            pst.setString(6, hv.getGioiTinh());
            pst.setString(7, hv.getFaceBook());
            pst.setString(8, hv.getAnh());
            pst.setString(9, hv.getCMND());
            return pst.executeUpdate() > 0;

        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
        return false;
    }

    public Boolean UpdateData(HoiVien hv) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Update HOI_VIEN set TenHV =?, NgaySinh = ?, DiaChi =?, SDT = ?, Email =?, GioiTinh =?, Facebook = ?, Anh =?, CMND = ? Where MaHV =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(10, hv.getMaHV());
            pst.setString(1, hv.getTenHV());
            pst.setString(2, hv.getNgaySinh());
            pst.setString(3, hv.getDiaChi());
            pst.setString(4, hv.getSDT());
            pst.setString(5, hv.getEmail());
            pst.setString(6, hv.getGioiTinh());
            pst.setString(7, hv.getFaceBook());
            pst.setString(8, hv.getAnh());
            pst.setString(9, hv.getCMND());
            return pst.executeUpdate() > 0;

        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
        return false;
    }

    public Boolean DeleteData(String MaHV) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete HOI_VIEN Where MaHV =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, MaHV);

            return pst.executeUpdate() > 0;

        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }

        return false;
    }

    public int getNextID() {
        HoiVienMOD hvm = new HoiVienMOD();
        ArrayList<HoiVien> list = hvm.getData();
        return list.get(list.size() - 1).getMaHV();
    }

    public ArrayList<String> ToString() {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MaHV,TenHV FROM HOI_VIEN");
            while (rs.next()) {
                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; Gia;
                int MaHoiVien = rs.getInt("MaHV");
                String TenHoiVien = rs.getString("TenHV");
                String Ma_Ten = (MaHoiVien + " " + TenHoiVien);
                //GoiTap(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String CMND
                list.add(Ma_Ten);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
