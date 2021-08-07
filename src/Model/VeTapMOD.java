/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Object.VeTap;
import View.Dialog.ErrorDialog;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class VeTapMOD {
    public Boolean AddData(VeTap ct)
     {
     Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO VE_TAP (NgayTap, MaGoiTap, MaLoaiGoiTap,Gia) values(?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);         
            pst.setString(1, ct.getNgayTap());
            pst.setInt(2, ct.getMaGoiTap());  
            pst.setInt(3, ct.getMaLoaiGoiTap());
            pst.setFloat(4, ct.getGia());
            return pst.executeUpdate()>0;   
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
       return false;
     }
    
    public ArrayList<VeTap> getData(){
        ArrayList<VeTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VE_TAP");
            while(rs.next())
            {
                
            int MaVe = rs.getInt("MaVe");
            String NgayTap = rs.getString("NgayTap");
            int MaGoiTap = rs.getInt("MaGoiTap");
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");         
            Float Gia = rs.getFloat("Gia");               
            VeTap gt = new VeTap(MaVe, NgayTap, MaGoiTap, MaLoaiGoiTap, Gia);
            list.add(gt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VeTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    
    public ArrayList<VeTap> getDataByDate(int Date, int Month, int Year){
        ArrayList<VeTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VE_TAP WHERE DAY(NgayTap) = "+Date +" AND MONTH(NgayTap) =" +Month+" AND Year(NgayTap) = "+Year);
            while(rs.next())
            {
                // private int MaHD, LoaiVeTap; TenVeTap; Gia;
            int MaVe = rs.getInt("MaVe");
            String NgayTap = rs.getString("NgayTap");
            int MaGoiTap = rs.getInt("MaGoiTap");
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");         
            Float Gia = rs.getFloat("Gia");               
            VeTap gt = new VeTap(MaVe, NgayTap, MaGoiTap, MaLoaiGoiTap, Gia);
            list.add(gt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VeTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<VeTap> getDataByMonth(int Month, int Year){
        ArrayList<VeTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VE_TAP WHERE MONTH(NgayTap)= " +Month+" AND Year(NgayTap) = "+Year);
            while(rs.next())
            {
                // private int MaHD, LoaiVeTap; TenVeTap; Gia;
            int MaVe = rs.getInt("MaVe");
            String NgayTap = rs.getString("NgayTap");
            int MaGoiTap = rs.getInt("MaGoiTap");
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");         
            Float Gia = rs.getFloat("Gia");               
            VeTap gt = new VeTap(MaVe, NgayTap, MaGoiTap, MaLoaiGoiTap, Gia);
            list.add(gt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VeTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<VeTap> getDataByYear(int Year){
        ArrayList<VeTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VE_TAP where Year(NgayTap) = "+Year);
            while(rs.next())
           while(rs.next())
            {
                // private int MaHD, LoaiVeTap; TenVeTap; Gia;
            int MaVe = rs.getInt("MaVe");
            String NgayTap = rs.getString("NgayTap");
            int MaGoiTap = rs.getInt("MaGoiTap");
            int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");         
            Float Gia = rs.getFloat("Gia");               
            VeTap gt = new VeTap(MaVe, NgayTap, MaGoiTap, MaLoaiGoiTap, Gia);
            list.add(gt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VeTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}


