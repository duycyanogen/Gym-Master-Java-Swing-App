/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.ArrayList;
import Model.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Object.HoaDon;
import View.Dialog.ErrorDialog;

/**
 *
 * @author Admin
 */
public class HoaDonMOD {
    public ArrayList<HoaDon> getData(){
        ArrayList<HoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOA_DON");
            while(rs.next())
            {
                // private int MaHD, LoaiHoaDon; TenHoaDon; Gia;
            int MaHD = rs.getInt("MaHD");
            String NgayLap = rs.getString("NgayLap");
            int MaHV = rs.getInt("MaHV");
            int MaNV = rs.getInt("MaNV");
            //Float ThanhTien = rs.getFloat("ThanhTien");
            HoaDon hd = new HoaDon(MaHD, NgayLap, MaHV, MaNV);
            list.add(hd);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Boolean getData(int MaNV){
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOA_DON WHERE MaNV ="+MaNV);
            while(rs.next())
            {
                System.out.println(rs.getInt("MaHD"));
                System.out.println(rs.getInt("MaHD")>0);
            if (rs.getInt("MaHD")>0)
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<HoaDon> getDataByDate(int Date, int Month, int Year){
        ArrayList<HoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOA_DON WHERE DAY(NgayLap) = "+Date +" AND MONTH(NgayLap) =" +Month+" AND Year(NgayLap) = "+Year);
            while(rs.next())
            {
                // private int MaHD, LoaiHoaDon; TenHoaDon; Gia;
            int MaHD = rs.getInt("MaHD");
            String NgayLap = rs.getString("NgayLap");
            int MaHV = rs.getInt("MaHV");
            int MaNV = rs.getInt("MaNV");
           // Float ThanhTien = rs.getFloat("ThanhTien");
            HoaDon hd = new HoaDon(MaHD, NgayLap, MaHV, MaNV);
            list.add(hd);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<HoaDon> getDataByMonth(int Month, int Year){
        ArrayList<HoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOA_DON WHERE MONTH(NgayLap)= " +Month+" AND Year(NgayLap) = "+Year);
            while(rs.next())
            {
            int MaHD = rs.getInt("MaHD");
            String NgayLap = rs.getString("NgayLap");
            int MaHV = rs.getInt("MaHV");
            int MaNV = rs.getInt("MaNV");
            HoaDon hd = new HoaDon(MaHD, NgayLap, MaHV, MaNV);
            list.add(hd);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<HoaDon> getDataByYear(int Year){
        ArrayList<HoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOA_DON where Year(NgayLap) = "+Year);
            while(rs.next())
            {
                // private int MaHD, LoaiHoaDon; TenHoaDon; Gia;
            int MaHD = rs.getInt("MaHD");
            String NgayLap = rs.getString("NgayLap");
            int MaHV = rs.getInt("MaHV");
            int MaNV = rs.getInt("MaNV");           
            HoaDon hd = new HoaDon(MaHD, NgayLap, MaHV, MaNV);
            list.add(hd);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public HoaDon getDataByMaHD( int MaHD){      
        Connection conn = DBConnection.getConnection();
        HoaDon hd = new HoaDon();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOA_DON WHERE MaHD = "+MaHD);
            while(rs.next())
           {
                // private int MaHD, LoaiHoaDon; TenHoaDon; Gia;
           //int MaHD = rs.getInt("MaHD");
            String NgayLap = rs.getString("NgayLap");
            int MaHV = rs.getInt("MaHV");
            int MaNV = rs.getInt("MaNV");
            //Float ThanhTien = rs.getFloat("ThanhTien");
            hd.setMaHD(MaHD);
            hd.setMaHV(MaHV);
            hd.setMaNV(MaNV);
            hd.setNgayLap(NgayLap);
            //hd.setThanhTien(ThanhTien);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hd;
    }
     
     public Float getPriceByMaHD( int MaHD){
       // ArrayList<HoaDon> list = new ArrayList<>();
       Float TotalPrice = 0f;
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT GiaCuoi FROM HOA_DON AS HD, CHI_TIET_HOA_DON AS CTHD WHERE HD.MaHD = CTHD.MaHD AND HD.MaHD = "+MaHD);
            while(rs.next())
           {
                TotalPrice += rs.getFloat("GiaCuoi");
            }
            return TotalPrice;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0f;
    }
    
    // CREATE
     public Boolean AddData(HoaDon hd)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO HOA_DON (NgayLap,MaHV,MaNV) values(?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            //pst.setInt(1, hd.ge1MaHD());
            pst.setString(1, hd.getNgayLap());
            pst.setInt(2, hd.getMaHV());  
            pst.setInt(3, hd.getMaNV());                    
            return pst.executeUpdate()>0;   
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean UpdateData(HoaDon hd)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql ="Update HOA_DON NgayLap = ?, MaHV = ?, MaNV =? Where MaHD = ?";
            PreparedStatement pst = conn.prepareStatement(sql);          
            pst.setInt(4, hd.getMaHD());
            pst.setString(1, hd.getNgayLap());
            pst.setInt(2, hd.getMaHV());  
            pst.setInt(3, hd.getMaNV());                      
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
       return false;
     }
     
      public Boolean DeleteData(String MaHD)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete HOA_DON Where MaHD =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, MaHD);
            
            return pst.executeUpdate()>0;
     
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
       return false;
     }
     
      public int getNextID()
      {
          HoaDonMOD hdm = new HoaDonMOD();
          ArrayList<HoaDon> list = hdm.getData();          
          return  list.get(list.size() - 1).getMaHD();         
      }
}
