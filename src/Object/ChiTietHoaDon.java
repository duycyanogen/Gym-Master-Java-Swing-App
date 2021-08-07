/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {
    int MaHD,MaGoiTap,MaLoaiGoiTap;
    String MaVoucher;
    Float GiaCuoi;
    String NgayBatDau,NgayKetThuc;

    public ChiTietHoaDon(int MaHD, int MaGoiTap, int MaLoaiGoiTap, String MaVoucher, Float GiaCuoi, String NgayBatDau, String NgayKetThuc) {
        this.MaHD = MaHD;
        this.MaGoiTap = MaGoiTap;
        this.MaLoaiGoiTap = MaLoaiGoiTap;
        this.MaVoucher = MaVoucher;
        this.GiaCuoi = GiaCuoi;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    
    

    public String getMaVoucher() {
        return MaVoucher;
    }

    public void setMaVoucher(String MaVoucher) {
        this.MaVoucher = MaVoucher;
    }

    

    public ChiTietHoaDon() {
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaGoiTap() {
        return MaGoiTap;
    }

    public void setMaGoiTap(int MaGoiTap) {
        this.MaGoiTap = MaGoiTap;
    }

    public int getMaLoaiGoiTap() {
        return MaLoaiGoiTap;
    }

    public void setMaLoaiGoiTap(int MaLoaiGoiTap) {
        this.MaLoaiGoiTap = MaLoaiGoiTap;
    }

    public Float getGiaCuoi() {
        return GiaCuoi;
    }

    public void setGiaCuoi(Float GiaCuoi) {
        this.GiaCuoi = GiaCuoi;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }
    
      public Object[] toArray()
    {
    return new Object[]{MaHD,MaGoiTap,MaLoaiGoiTap,MaVoucher,GiaCuoi,NgayBatDau,NgayKetThuc};
    }
}
