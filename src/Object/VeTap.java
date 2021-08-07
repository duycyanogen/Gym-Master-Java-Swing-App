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
public class VeTap {
    private int MaVe;
    private String NgayTap;
    private int MaGoiTap;
    private int MaLoaiGoiTap;
    private Float Gia;

    public VeTap() {
    }

    public VeTap(int MaVe, String NgayTap, int MaGoiTap, int MaLoaiGoiTap, Float Gia) {
        this.MaVe = MaVe;
        this.NgayTap = NgayTap;
        this.MaGoiTap = MaGoiTap;
        this.MaLoaiGoiTap = MaLoaiGoiTap;
        this.Gia = Gia;
    }

    public int getMaVe() {
        return MaVe;
    }

    public void setMaVe(int MaVe) {
        this.MaVe = MaVe;
    }

    public String getNgayTap() {
        return NgayTap;
    }

    public void setNgayTap(String NgayTap) {
        this.NgayTap = NgayTap;
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

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float Gia) {
        this.Gia = Gia;
    }

   
    public Object[] toArray()
    {
    return new Object[]{MaVe,NgayTap, MaGoiTap, Gia};
    }
}
