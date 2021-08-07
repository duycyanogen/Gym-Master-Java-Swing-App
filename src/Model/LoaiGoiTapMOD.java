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
import Object.LoaiGoiTap;
import View.Dialog.ErrorDialog;
/**
 *
 * @author Admin
 */
public class LoaiGoiTapMOD {
    public ArrayList<LoaiGoiTap> getData(){
        ArrayList<LoaiGoiTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LOAI_GOI_TAP");
            while(rs.next())
            {
                // private int MaLoaiGoiTap, LoaiLoaiGoiTap; TenLoaiGoiTap; Gia;
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");
            int ThoiLuong = rs.getInt("ThoiLuong");
            String TenLoaiGoiTap = rs.getString("TenLoaiGoiTap");
   
            LoaiGoiTap gt = new LoaiGoiTap(MaLoaiGoiTap, ThoiLuong,TenLoaiGoiTap );
            //LoaiGoiTap(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String GioiThieu
            list.add(gt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public LoaiGoiTap getDataByMaLoaiGoiTap( int MaLoaiGoiTap){
        //ArrayList<LoaiGoiTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LOAI_GOI_TAP WHERE MaLoaiGoiTap = "+MaLoaiGoiTap);
            while(rs.next())
           {
            //int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");
            int ThoiLuong = rs.getInt("ThoiLuong");
            String TenLoaiGoiTap = rs.getString("TenLoaiGoiTap");
            LoaiGoiTap gt = new LoaiGoiTap(MaLoaiGoiTap,ThoiLuong, TenLoaiGoiTap);
            //LoaiGoiTap(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String GioiThieu
            //list.add(gt);
            LoaiGoiTap lgt = new LoaiGoiTap(MaLoaiGoiTap, ThoiLuong, TenLoaiGoiTap);
            return lgt;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return list;
        return null;
    }
     

     public Boolean AddData(LoaiGoiTap hv)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO LOAI_GOI_TAP (MaLoaiGoiTap,'TenLoaiGoiTap') values(?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, hv.getMaLoaiGoiTap());
            pst.setString(2, hv.getTenLoaiGoiTap());  
            return pst.executeUpdate()>0;   
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean UpdateData(LoaiGoiTap hv)
     {
     Connection conn = DBConnection.getConnection();
        try {
            //String sql = "Update HOI_VIEN TenHV =?, NgaySinh = ?, DiaChi =? SDT = ? Email =?, GioiTinh =?, Facebook = ?. Anh =?, GioiThieu = ? Where MaHV =?";
            String sql ="Update LOAI_GOI_TAP 'TenLoaiGoiTap' = ?, Where MaLoaiGoiTap = ?";
            PreparedStatement pst = conn.prepareStatement(sql);          
            pst.setInt(4, hv.getMaLoaiGoiTap());
            pst.setString(1, hv.getTenLoaiGoiTap());          
            return pst.executeUpdate()>0;    
        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean DeleteData(String MaLoaiGoiTap)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete LOAI_GOI_TAP Where MaLoaiGoiTap =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, MaLoaiGoiTap);            
            return pst.executeUpdate()>0;  
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
       return false;
     }
     
     public int getNextID()
      {
          LoaiGoiTapMOD gtm = new LoaiGoiTapMOD();
          ArrayList<LoaiGoiTap> list = gtm.getData();
          return  list.get(list.size() - 1).getMaLoaiGoiTap();
      }
     
    public ArrayList<String> ToString()
    {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TenLoaiGoiTap FROM LOAI_GOI_TAP");
            while(rs.next())
            {
            String TenLoaiGoiTap = rs.getString("TenLoaiGoiTap");
            list.add(TenLoaiGoiTap);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public int getMaLoaiGoiTap(String TenLoaiGoiTap)
    {
    Connection conn = DBConnection.getConnection();
    int MaLoaiGoiTap = 0;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MaLoaiGoiTap FROM LOAI_GOI_TAP WHERE TenLoaiGoiTap ='"+TenLoaiGoiTap+"'");
            while(rs.next())
            {
           MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");          
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MaLoaiGoiTap;
    }
    
    public String getTenLoaiGoiTap(int MaLoaiGoiTap)
    {
    Connection conn = DBConnection.getConnection();   
         String TenLoaiGoiTap = "";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TenLoaiGoiTap FROM LOAI_GOI_TAP WHERE MaLoaiGoiTap ="+MaLoaiGoiTap);
            while(rs.next())
            {
           TenLoaiGoiTap = rs.getString("TenLoaiGoiTap");          
            }           
        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return TenLoaiGoiTap;
    }
}
