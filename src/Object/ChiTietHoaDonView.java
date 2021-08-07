/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Processor.NumberProcesser;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDonView {
    private String MaHV;
    private String TenGoiTap, LoaiGoiTap;
    private String DonGia;
    private String NgayBatDau,NgayKetThuc;
    private String Voucher;
    private String GiamGia1, GiamGia2, ThemNgay;
    private String ThanhTien;

    public ChiTietHoaDonView() {
    }

    public ChiTietHoaDonView(String MaHV, String TenGoiTap, String LoaiGoiTap, String DonGia, String NgayBatDau, String NgayKetThuc, String Voucher, String GiamGia1, String GiamGia2, String ThemNgay, String ThanhTien) {
        this.MaHV = MaHV;
        this.TenGoiTap = TenGoiTap;
        this.LoaiGoiTap = LoaiGoiTap;
        this.DonGia = DonGia;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.Voucher = Voucher;
        this.GiamGia1 = GiamGia1;
        this.GiamGia2 = GiamGia2;
        this.ThemNgay = ThemNgay;
        this.ThanhTien = ThanhTien;
    }

    public String getGiamGia1() {
        return GiamGia1;
    }

    public void setGiamGia1(String GiamGia1) {
        this.GiamGia1 = GiamGia1;
    }

    public String getGiamGia2() {
        return GiamGia2;
    }

    public void setGiamGia2(String GiamGia2) {
        this.GiamGia2 = GiamGia2;
    }

    public String getThemNgay() {
        return ThemNgay;
    }

    public void setThemNgay(String ThemNgay) {
        this.ThemNgay = ThemNgay;
    }


    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getTenGoiTap() {
        return TenGoiTap;
    }

    public void setTenGoiTap(String TenGoiTap) {
        this.TenGoiTap = TenGoiTap;
    }

    public String getLoaiGoiTap() {
        return LoaiGoiTap;
    }

    public void setLoaiGoiTap(String LoaiGoiTap) {
        this.LoaiGoiTap = LoaiGoiTap;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
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

    public String getVoucher() {
        return Voucher;
    }

    public void setVoucher(String Voucher) {
        this.Voucher = Voucher;
    }

    public String getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(String ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    
    public Object[] toArray()
    {
        NumberProcesser x = new NumberProcesser();
    return new Object[]{MaHV,TenGoiTap, LoaiGoiTap,DonGia,NgayBatDau,NgayKetThuc,Voucher,GiamGia1,x.FloatToVND(Float.parseFloat(GiamGia2)),ThemNgay,ThanhTien};
    }
    
    
}
