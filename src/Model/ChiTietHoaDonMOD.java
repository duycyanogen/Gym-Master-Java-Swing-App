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
import Object.ChiTietHoaDon;
import View.Dialog.ErrorDialog;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDonMOD {

    public ArrayList<ChiTietHoaDon> getData() {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CHI_TIET_HOA_DON");
            while (rs.next()) {
                // privsate int MaGoiTap, LoaiGoiTap; TenGoiTap; Gia;
                int MaHD = rs.getInt("MaHD");
                int MaGoiTap = rs.getInt("MaGoiTap");
                int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");
                String MaVoucher = rs.getString("MaVoucher");
                Float Gia = rs.getFloat("GiaCuoi");
                String NgayBatDau = rs.getString("NgayBatDau");
                String NgayKetThuc = rs.getString("NgayKetThuc");
                ChiTietHoaDon gt = new ChiTietHoaDon(MaHD, MaGoiTap, MaLoaiGoiTap, MaVoucher, Gia, NgayBatDau, NgayKetThuc);
                list.add(gt);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Object[]> getDataByMaHV(int MaHV) {
        ArrayList<Object[]> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        int stt = 0;
        try {
            //TenGoiTap[0], TenLoaiGoiTap[1], GiaCuoi[2], NgayBatDau[3], NgayKetThuc[4], MaHV[5], TenHV[6]
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT GT.TenGoiTap, LGT.TenLoaiGoiTap, "
                    + "CT.GiaCuoi, CT.NgayBatDau, CT.NgayKetThuc,HV.MaHV, HV.TenHV FROM HOA_DON AS HD, "
                    + "HOI_VIEN AS HV, CHI_TIET_HOA_DON AS CT, GOI_TAP AS GT, "
                    + "LOAI_GOI_TAP AS LGT WHERE HD.MaHV = HV.MaHV AND "
                    + "CT.MaHD = HD.MaHD AND GT.MaGoiTap = CT.MaGoiTap "
                    + "AND LGT.MaLoaiGoiTap = CT.MaLoaiGoiTap AND HV.MaHV =" + MaHV);
            while (rs.next()) {
                Object[] cthd = new Object[8];

                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; Gia;
                cthd[0] = rs.getString("TenGoiTap");
                cthd[1] = rs.getString("TenLoaiGoiTap");
                cthd[2] = rs.getString("GiaCuoi");
                cthd[3] = rs.getString("NgayBatDau");
                cthd[4] = rs.getString("NgayKetThuc");
                cthd[5] = rs.getString("TenHV");
                cthd[6] = rs.getString("MaHV");
                cthd[7] = ++stt;
                list.add(cthd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Object[]> getDataObject(String currentDate) {
        ArrayList<Object[]> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        int stt = 0;
        try {
            //TenGoiTap[0], TenLoaiGoiTap[1], GiaCuoi[2], NgayBatDau[3], NgayKetThuc[4], MaHV[5], TenHV[6]
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT GT.TenGoiTap, LGT.TenLoaiGoiTap, "
                    + "CT.GiaCuoi, CT.NgayBatDau, CT.NgayKetThuc,HV.MaHV, HV.TenHV FROM HOA_DON AS HD, "
                    + "HOI_VIEN AS HV, CHI_TIET_HOA_DON AS CT, GOI_TAP AS GT, "
                    + "LOAI_GOI_TAP AS LGT WHERE HD.MaHV = HV.MaHV AND "
                    + "CT.MaHD = HD.MaHD AND GT.MaGoiTap = CT.MaGoiTap "
                    + "AND LGT.MaLoaiGoiTap = CT.MaLoaiGoiTap AND CT.NgayKetThuc >= '" + currentDate + "'");
            while (rs.next()) {
                Object[] cthd = new Object[8];

                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; Gia;
                cthd[0] = rs.getString("TenGoiTap");
                cthd[1] = rs.getString("TenLoaiGoiTap");
                cthd[2] = rs.getString("GiaCuoi");
                cthd[3] = rs.getString("NgayBatDau");
                cthd[4] = rs.getString("NgayKetThuc");
                cthd[6] = rs.getString("MaHV");
                cthd[5] = rs.getString("TenHV");
                cthd[7] = ++stt;
                System.out.println(stt);
                list.add(cthd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

//   
    public String getEndDate(int MaHV, int MaGoiTap, String CurrentDate) {
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TOP 1 CTHD.NgayKetThuc FROM CHI_TIET_HOA_DON "
                    + "AS CTHD, HOA_DON AS HD WHERE CTHD.MaHD = HD.MaHD AND HD.MaHV =" + MaHV + " "
                    + "AND CTHD.MaGoiTap = " + MaGoiTap + " AND CTHD.NgayKetThuc >='" + CurrentDate + "' ORDER BY CTHD.MaHD DESC");
            while (rs.next()) {
                return rs.getString("NgayKetThuc");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getStartDate(int MaHV, int MaGoiTap, String CurrentDate) {
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TOP 1 CTHD.NgayBatDau FROM CHI_TIET_HOA_DON AS CTHD, HOA_DON AS HD WHERE CTHD.MaHD = HD.MaHD AND HD.MaHV =" + MaHV + "AND CTHD.MaGoiTap = " + MaGoiTap + " AND CTHD.NgayKetThuc >='" + CurrentDate + "' ORDER BY CTHD.MaHD ASC");
            while (rs.next()) {
                return rs.getString("NgayKetThuc");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<ChiTietHoaDon> getDataByMaHD(int MaHD) {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CHI_TIET_HOA_DON WHERE MaHD = " + MaHD);
            while (rs.next()) {
                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; Gia;            
                int MaGoiTap = rs.getInt("MaGoiTap");
                int MaLoaiGoiTap = rs.getInt("MaLoaiGoiTap");
                String MaVoucher = rs.getString("MaVoucher");
                Float Gia = rs.getFloat("GiaCuoi");
                String NgayBatDau = rs.getString("NgayBatDau");
                String NgayKetThuc = rs.getString("NgayKetThuc");
                ChiTietHoaDon gt = new ChiTietHoaDon(MaHD, MaGoiTap, MaLoaiGoiTap, MaVoucher, Gia, NgayBatDau, NgayKetThuc);
                list.add(gt);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Float getPriceByMaHD(int MaHD) {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Float total = 0f;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT GiaCuoi FROM CHI_TIET_HOA_DON WHERE MaHD = " + MaHD);
            while (rs.next()) {
                total += rs.getFloat("GiaCuoi");
            }
            return total;

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // CREATE
    public Boolean AddData(ChiTietHoaDon ct) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO CHI_TIET_HOA_DON (MaHD, MaGoiTap, MaLoaiGoiTap,MaVoucher, GiaCuoi, NgayBatDau,NgayKetThuc) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, ct.getMaHD());
            pst.setInt(2, ct.getMaGoiTap());
            pst.setInt(3, ct.getMaLoaiGoiTap());
            pst.setString(4, ct.getMaVoucher());
            pst.setFloat(5, ct.getGiaCuoi());
            pst.setString(6, ct.getNgayBatDau());
            pst.setString(7, ct.getNgayKetThuc());
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
        return false;
    }

    public Boolean DeleteData(int MaGoiTap, int MaLoaiGoiTap, int MaHD) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete CHI_TIET_HOA_DON Where MaGoiTap = ? AND MaLoaiGoiTap =? AND MaHD = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, MaGoiTap);
            pst.setInt(2, MaLoaiGoiTap);
            pst.setInt(2, MaHD);
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
        return false;
    }

}
