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
import Object.GoiTapHoanChinh;
import View.Dialog.ErrorDialog;
/**
 *
 * @author Admin
 */
public class GoiTapHoanChinhMOD {
     public ArrayList<GoiTapHoanChinh> getData(){
        ArrayList<GoiTapHoanChinh> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM GOI_TAP_HOAN_CHINH");
            while(rs.next())
            {
                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; GiaGoiTap;
            int MaGoiTap = rs.getInt("MaGoiTap");
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");
            Float GiaGoiTap = rs.getFloat("GiaGoiTap");
                    
            GoiTapHoanChinh gt = new GoiTapHoanChinh(MaGoiTap, MaLoaiGoiTap,GiaGoiTap);
            //GoiTap(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String GioiThieu
            list.add(gt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GoiTapHoanChinhMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     
     public Float findPrice( int MaGoiTap, int MaLoaiGoiTap){
       // ArrayList<GoiTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT GiaGoiTap FROM GOI_TAP_HOAN_CHINH WHERE MaGoiTap = "+MaGoiTap+" AND MaLoaiGoiTap = "+MaLoaiGoiTap);
            while(rs.next())
           {
                return rs.getFloat("GiaGoiTap");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0f;
    }
    
    // CREATE
     public Boolean AddData(GoiTapHoanChinh ct)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO GOI_TAP_HOAN_CHINH (MaGoiTap,MaLoaiGoiTap,GiaGoiTap) values(?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, ct.getMaGoiTap());
            pst.setInt(2, ct.getMaLoaiGoiTap());
            pst.setFloat(3, ct.getGiaGoiTap());       
            return pst.executeUpdate()>0;   
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean UpdateData(GoiTapHoanChinh ct)
     {
     Connection conn = DBConnection.getConnection();
        try {
            //String sql = "Update HOI_VIEN TenHV =?, NgaySinh = ?, DiaChi =? SDT = ? Email =?, GioiTinh =?, Facebook = ?. Anh =?, GioiThieu = ? Where MaHV =?";
            String sql ="Update GOI_TAP_HOAN_CHINH set GiaGoiTap = ? Where MaGoiTap = ? AND MaLoaiGoiTap =?";
            PreparedStatement pst = conn.prepareStatement(sql);          
            pst.setInt(2, ct.getMaGoiTap());
            pst.setInt(3, ct.getMaLoaiGoiTap());
            pst.setFloat(1, ct.getGiaGoiTap());
                
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean DeleteData(int MaGoiTap)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete GOI_TAP_HOAN_CHINH Where MaGoiTap = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, MaGoiTap);
           // pst.setInt(2, MaLoaiGoiTap);            
            return pst.executeUpdate()>0;
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
       return false;
     }
     
     public int getNextID()
      {
          GoiTapHoanChinhMOD gtm = new GoiTapHoanChinhMOD();
          ArrayList<GoiTapHoanChinh> list = gtm.getData();
          return  list.get(list.size() - 1).getMaGoiTap();
      }
     
    public ArrayList<String> ToString()
    {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MaGoiTap,TenGoiTap FROM GOI_TAP_HOAN_CHINH");
            while(rs.next())
            {
                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; GiaGoiTap;
            int MaGoiTap = rs.getInt("MaGoiTap");
           String TenGoiTap = rs.getString("TenGoiTap");
            String Ma_Ten = (MaGoiTap+" "+TenGoiTap);
            //GoiTap(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String GioiThieu
            list.add(Ma_Ten);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GoiTapHoanChinhMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
