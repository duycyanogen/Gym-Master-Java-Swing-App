
package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Object.GoiTap;
import View.Dialog.ErrorDialog;

/**
 *
 * @author Admin
 */
public class GoiTapMOD {

    public ArrayList<GoiTap> getData() {
        ArrayList<GoiTap> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM GOI_TAP ORDER BY MaGoiTap");
            while (rs.next()) {
                // private int MaGoiTap, LoaiGoiTap; TenGoiTap; Gia;
                int MaGoiTap = rs.getInt("MaGoiTap");
                String TenGoiTap = rs.getString("TenGoiTap");
                String ChiTietGoiTap = rs.getString("ChiTietGoiTap");
                GoiTap gt = new GoiTap(MaGoiTap, TenGoiTap, ChiTietGoiTap);
                //GoiTap(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String GioiThieu
                list.add(gt);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
        public GoiTap getData(int MaGoiTap) {
        Connection conn = DBConnection.getConnection();
        //String TenGoiTap = "";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM GOI_TAP WHERE MaGoiTap =" + MaGoiTap);
            while (rs.next()) {               
                String TenGoiTap = rs.getString("TenGoiTap");
                String ChiTietGoiTap = rs.getString("ChiTietGoiTap");
                GoiTap gt = new GoiTap(MaGoiTap, TenGoiTap, ChiTietGoiTap);
                return gt;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<String> getTenGoiTapByMaHV(int MaHV) {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT GT.TenGoiTap FROM HOI_VIEN AS HV, "
                    + "CHI_TIET_HOA_DON AS CTHD, GOI_TAP_HOAN_CHINH AS GTHC, GOI_TAP AS GT, "
                    + "HOA_DON AS HD WHERE HV.MaHV = HD.MaHV AND CTHD.MaHD = HD.MaHD "
                    + "AND CTHD.MaGoiTap = GTHC.MaGoiTap  AND CTHD.MaLoaiGoiTap = GTHC.MaLoaiGoiTap "
                    + "AND GTHC.MaGoiTap = GT.MaGoiTap AND HV.MaHV =" + MaHV);
            while (rs.next()) {
                String TenGoiTap = rs.getString("TenGoiTap");
                list.add(TenGoiTap);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<String> getTenGoiTapByMaHV(int MaHV, String CurrentDate) {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT GT.TenGoiTap FROM HOI_VIEN AS HV, "
                    + "CHI_TIET_HOA_DON AS CTHD, GOI_TAP_HOAN_CHINH AS GTHC, GOI_TAP AS GT, "
                    + "HOA_DON AS HD WHERE HV.MaHV = HD.MaHV AND CTHD.MaHD = HD.MaHD "
                    + "AND CTHD.MaGoiTap = GTHC.MaGoiTap  AND CTHD.MaLoaiGoiTap = GTHC.MaLoaiGoiTap "
                    + "AND GTHC.MaGoiTap = GT.MaGoiTap AND HV.MaHV =" + MaHV + " AND CTHD.NgayKetThuc >='" + CurrentDate+"'");
            while (rs.next()) {
                String TenGoiTap = rs.getString("TenGoiTap");
                list.add(TenGoiTap);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Boolean AddData(GoiTap hv) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Insert INTO GOI_TAP (TenGoiTap, ChiTietGoiTap) values(?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, hv.getTenGoiTap());
            pst.setString(2, hv.getChiTietGoiTap());
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            new ErrorDialog("Add failed").setVisible(true);
        }
        return false;
    }

    public Boolean UpdateData(GoiTap hv) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Update GOI_TAP set TenGoiTap = '?', ChiTietGoiTap = '?' Where MaGoiTap = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(3, hv.getMaGoiTap());
            pst.setString(2, hv.getChiTietGoiTap());
            pst.setString(1, hv.getTenGoiTap());

            return pst.executeUpdate() > 0;

        } catch (SQLException ex) {
            new ErrorDialog("Update failed").setVisible(true);
        }
        return false;
    }

    public Boolean DeleteData(int MaGoiTap) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "Delete GOI_TAP Where MaGoiTap =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, MaGoiTap);

            return pst.executeUpdate() > 0;

        } catch (SQLException ex) {
            new ErrorDialog("Delete failed").setVisible(true);
        }
        return false;
    }

    public int getNextID() {
        GoiTapMOD gtm = new GoiTapMOD();
        ArrayList<GoiTap> list = gtm.getData();
        System.out.println(list.get(list.size() - 1).getMaGoiTap() + " " + list.get(list.size() - 1).getTenGoiTap());
        return list.get(list.size() - 1).getMaGoiTap();

    }

    public ArrayList<String> ToString() {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT TenGoiTap FROM GOI_TAP");
            while (rs.next()) {
                String TenGoiTap = rs.getString("TenGoiTap");
                list.add(TenGoiTap);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getMaGoiTap(String TenGoiTap) {
        Connection conn = DBConnection.getConnection();
        int MaGoiTap = 0;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MaGoiTap FROM GOI_TAP WHERE TenGoiTap = N'" + TenGoiTap + "'");
            while (rs.next()) {
                // private int MaLoaiGoiTap, LoaiLoaiGoiTap; TenLoaiGoiTap; Gia;
                MaGoiTap = rs.getInt("MaGoiTap");

            }

        } catch (SQLException ex) {
            Logger.getLogger(LoaiGoiTapMOD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MaGoiTap;
    }



}
