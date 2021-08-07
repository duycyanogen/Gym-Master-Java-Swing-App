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
public class VoucherKM {
    private String MaVoucher;
    private int MaGoiTap, MaLoaiGoiTap,GiamGia1;
    private Float GiamGia2;
    private int ThemNgay;
    private String NgayBatDau,NgayKetThuc;

    public VoucherKM(String MaVoucher, int MaGoiTap, int MaLoaiGoiTap, int GiamGia1, Float GiamGia2, int ThemNgay, String NgayBatDau, String NgayKetThuc) {
        this.MaVoucher = MaVoucher;
        this.MaGoiTap = MaGoiTap;
        this.MaLoaiGoiTap = MaLoaiGoiTap;
        this.GiamGia1 = GiamGia1;
        this.GiamGia2 = GiamGia2;
        this.ThemNgay = ThemNgay;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    public VoucherKM() {
    }

    public String getMaVoucher() {
        return MaVoucher;
    }

    public void setMaVoucher(String MaVoucher) {
        this.MaVoucher = MaVoucher;
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

    public int getGiamGia1() {
        return GiamGia1;
    }

    public void setGiamGia1(int GiamGia1) {
        this.GiamGia1 = GiamGia1;
    }

    public Float getGiamGia2() {
        return GiamGia2;
    }

    public void setGiamGia2(Float GiamGia2) {
        this.GiamGia2 = GiamGia2;
    }

    public int getThemNgay() {
        return ThemNgay;
    }

    public void setThemNgay(int ThemNgay) {
        this.ThemNgay = ThemNgay;
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
    
    public Object toArray()
    {
    return new Object[]{};
    }
    
}
