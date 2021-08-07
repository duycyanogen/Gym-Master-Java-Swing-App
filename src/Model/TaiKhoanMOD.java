/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Object.TaiKhoan;
import View.Dialog.ErrorDialog;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TaiKhoanMOD {
    // READ
    public ArrayList<TaiKhoan> getData(){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TAI_KHOAN");
            while(rs.next())
            {
                //TenDangNhap,PassWord,LoaiTK,DiaChi,SDT,GioiTinh
            String TenDangNhap = rs.getString("TenDangNhap");
            String Password = rs.getString("PassWord");
            int LoaiTK = rs.getInt("LoaiTK");
            int MaNV = rs.getInt("MaNV");
            TaiKhoan tk = new TaiKhoan(TenDangNhap,Password,LoaiTK,MaNV);
            list.add(tk);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
   public ArrayList<Object[]> getDataJoinNVAndTaiKhoan()
   {
        ArrayList<Object[]> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT NV.MaNV, NV.TenNV, NV.DiaChi,"
                    + " NV.SDT, NV.GioiTinh, NV.Email, TK.TenDangNhap, TK.LoaiTK,"
                    + " TK.PassWord FROM NHAN_VIEN AS NV, TAI_KHOAN AS TK WHERE NV.MaNV = TK.MaNV");
            while(rs.next())
            {
                //TenDangNhap,PassWord,LoaiTK,DiaChi,SDT,GioiTinh
                Object[] nvtk = new Object[9];           
                nvtk[0] = rs.getInt("MaNV");
                nvtk[1] = rs.getString("TenNV");
                nvtk[2] = rs.getString("DiaChi");
                nvtk[3] = rs.getString("SDT");
                nvtk[4] = rs.getString("GioiTinh");
                nvtk[5] = rs.getString("Email");
                nvtk[6] = rs.getString("TenDangNhap");
                nvtk[7] = rs.getInt("LoaiTK");
                nvtk[8] = rs.getString("PassWord");      
            list.add(nvtk);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   
   public Object[] getDataJoinNVAndTaiKhoan(String TenDangNhap)
   {
        //ArrayList<Object[]> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT NV.MaNV, NV.TenNV, NV.DiaChi,"
                    + " NV.SDT, NV.GioiTinh, NV.Email, TK.TenDangNhap, TK.LoaiTK,"
                    + " TK.PassWord FROM NHAN_VIEN AS NV, TAI_KHOAN AS TK WHERE NV.MaNV = TK.MaNV AND TK.TenDangNhap ='"+TenDangNhap+"'");
            while(rs.next())
            {
                //TenDangNhap,PassWord,LoaiTK,DiaChi,SDT,GioiTinh
                Object[] nvtk = new Object[9];           
                nvtk[0] = rs.getInt("MaNV");
                nvtk[1] = rs.getString("TenNV");
                nvtk[2] = rs.getString("DiaChi");
                nvtk[3] = rs.getString("SDT");
                nvtk[4] = rs.getString("GioiTinh");
                nvtk[5] = rs.getString("Email");
                nvtk[6] = rs.getString("TenDangNhap");
                nvtk[7] = rs.getInt("LoaiTK");
                nvtk[8] = rs.getString("PassWord");      
            //list.add(nvtk);
            return nvtk;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
    
     public TaiKhoan getData( String TenDangNhap){        
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TAI_KHOAN WHERE TenDangNhap = '"+TenDangNhap+"'");
            while(rs.next())
            {
            //String TenDangNhap = rs.getString("TenDangNhap");
            String Password = rs.getString("PassWord");
            int LoaiTK = rs.getInt("LoaiTK");
            int MaNV = rs.getInt("MaNV");
            TaiKhoan tk = new TaiKhoan(TenDangNhap,Password,LoaiTK,MaNV);
            return tk;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public Boolean checkPass( String TenDangNhap, String Password){        
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TAI_KHOAN WHERE TenDangNhap = '"+TenDangNhap+"' And PassWord = '"+Password+"'");           
            while(rs.next())
            {
            if (!rs.getString("TenDangNhap").isEmpty())
                return true;
            }         
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // CREATE
     public Boolean AddData(TaiKhoan tk)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO TAI_KHOAN (TenDangNhap,PassWord,LoaiTK,MaNV) values(?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tk.getTenDangNhap());
            pst.setString(2, tk.getPassWord());         
            pst.setInt(3, tk.getLoaiTK());
            pst.setInt(4, tk.getMaNV());
          
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean UpdateData(TaiKhoan tk)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Update TAI_KHOAN set PassWord =?, LoaiTK = ? Where TenDangNhap =?";
            PreparedStatement pst = conn.prepareStatement(sql);            
            pst.setString(1, tk.getPassWord());        
            pst.setInt(2, tk.getLoaiTK());
            pst.setString(3, tk.getTenDangNhap());         
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
           new ErrorDialog("Update failed").setVisible(true);
        }
       return false;
     }
      
     
      public Boolean DeleteData(String TenDangNhap)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete TAI_KHOAN Where TenDangNhap =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, TenDangNhap);
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
       return false;
     }
     
     public int Login(String TenDangNhap, String PassWord)
     {
      Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TAI_KHOAN WHERE TenDangNhap = '"+TenDangNhap +"' AND PassWord ='"+PassWord+"'");
            while(rs.next())
            {
            if (!rs.getString("TenDangNhap").isEmpty())
                return rs.getInt("LoaiTK");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
     }
     
          public boolean ResetPassword(String TenDangNhap, String Email)
     {
      Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TAI_KHOAN AS TK, NHAN_VIEN AS NV WHERE TK.MaNV = NV.MaNV AND TK.TenDangNhap ='"+TenDangNhap+"' AND NV.Email = '"+Email+"'");
            while(rs.next())
            {
            if (!rs.getString("TenDangNhap").isEmpty())
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     }
     
     
    
}
