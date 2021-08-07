/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Processor.DateProcessor;

/**
 *
 * @author Admin
 */
public class HoiVien {
    private int MaHV;
    private String TenHV, NgaySinh,DiaChi,SDT,Email,GioiTinh,FaceBook,Anh,CMND;

    public HoiVien() {
    }

    public HoiVien(int MaHV, String TenHV, String NgaySinh, String DiaChi, String SDT, String Email, String GioiTinh, String FaceBook, String Anh, String CMND) {
        this.MaHV = MaHV;
        this.TenHV = TenHV;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.FaceBook = FaceBook;
        this.Anh = Anh;
        this.CMND = CMND;
    }

    public int getMaHV() {
        return MaHV;
    }

    public void setMaHV(int MaHV) {
        this.MaHV = MaHV;
    }

    public String getTenHV() {
        return TenHV;
    }

    public void setTenHV(String TenHV) {
        this.TenHV = TenHV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getFaceBook() {
        return FaceBook;
    }

    public void setFaceBook(String FaceBook) {
        this.FaceBook = FaceBook;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
   public Object[] toArray()
    {
        
    return new Object[]{MaHV, TenHV,NgaySinh, DiaChi, SDT, Email, GioiTinh,FaceBook,CMND};
    }
}
