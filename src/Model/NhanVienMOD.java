/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Object.NhanVien;
import View.Dialog.ErrorDialog;

/**
 *
 * @author Admin
 */
public class NhanVienMOD {
    public ArrayList<NhanVien> getData(){
        ArrayList<NhanVien> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM NHAN_VIEN");
            while(rs.next())
            {
            int MaNV = rs.getInt("MaNV");
             String TenHV = rs.getString("TenNV");          
            String DiaChi = rs.getString("DiaChi");
            String SDT = rs.getString("SDT");
            String Email = rs.getString("Email");
            String GioiTinh = rs.getString("GioiTinh");
            NhanVien hv = new NhanVien(MaNV,TenHV,DiaChi,SDT,GioiTinh,Email);
            //NhanVien(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String CMND
            list.add(hv);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public NhanVien getData( int MaNV){
        //ArrayList<NhanVien> list = new ArrayList<>();
        NhanVien hv = new NhanVien();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM NHAN_VIEN WHERE MaNV = "+MaNV);
            while(rs.next())
            {
            
            String TenHV = rs.getString("TenNV");          
            String DiaChi = rs.getString("DiaChi");
            String SDT = rs.getString("SDT");
            String Email = rs.getString("Email");
            String GioiTinh = rs.getString("GioiTinh");
            hv = new NhanVien(MaNV,TenHV,DiaChi,SDT,GioiTinh,Email);
            //list.add(hv);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hv;
    }
    
    // CREATE
     public Boolean AddData(NhanVien hv)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO NHAN_VIEN (TenNV,DiaChi,SDT,GioiTinh,Email) values(?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
           // pst.setInt(1, hv.getMaHV());
            pst.setString(1, hv.getTenNV());
            pst.setString(2, hv.getDiaChi());
            pst.setString(3, hv.getSDT());
            pst.setString(4, hv.getGioiTinh());
            pst.setString(5, hv.getEmail());           
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
     
     public int GetMaNVByTenDangNhap(String TenDangNhap)
     {
          Connection conn = DBConnection.getConnection();
     try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT NV.MaNV FROM NHAN_VIEN AS NV, TAI_KHOAN AS TK WHERE TK.MaNV = NV.MaNV AND TK.TenDangNhap ='"+TenDangNhap+"'");
            while(rs.next())
            {
            return rs.getInt("MaNV");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
     return -1;
     }
     
      public Boolean UpdateData(NhanVien hv)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Update NHAN_VIEN SET TenNV =?, DiaChi =?, SDT = ?, GioiTinh =?, Email =? Where MaNV =?";
            PreparedStatement pst = conn.prepareStatement(sql);          
            pst.setInt(6, hv.getMaNV());
            pst.setString(1, hv.getTenNV());           
            pst.setString(2, hv.getDiaChi());
            pst.setString(3, hv.getSDT());
            pst.setString(5, hv.getEmail());
            pst.setString(4, hv.getGioiTinh());   
            
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean DeleteData(int MaNV)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete NHAN_VIEN Where MaNV =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, MaNV);
            
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
       
       return false;
     }
     
        public int getCurrentID()
      {
          NhanVienMOD nvm = new NhanVienMOD();
          ArrayList<NhanVien> list = nvm.getData();       
          return  list.get(list.size() - 1).getMaNV();
      }
     
    
}
