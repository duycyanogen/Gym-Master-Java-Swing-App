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
public class LoaiGoiTap {
    int MaLoaiGoiTap;
    int ThoiLuong;
    String TenLoaiGoiTap;

    public LoaiGoiTap(int MaLoaiGoiTap, int ThoiLuong, String TenLoaiGoiTap) {
        this.MaLoaiGoiTap = MaLoaiGoiTap;
        this.ThoiLuong = ThoiLuong;
        this.TenLoaiGoiTap = TenLoaiGoiTap;
    }

    public int getMaLoaiGoiTap() {
        return MaLoaiGoiTap;
    }

    public void setMaLoaiGoiTap(int MaLoaiGoiTap) {
        this.MaLoaiGoiTap = MaLoaiGoiTap;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getTenLoaiGoiTap() {
        return TenLoaiGoiTap;
    }

    public void setTenLoaiGoiTap(String TenLoaiGoiTap) {
        this.TenLoaiGoiTap = TenLoaiGoiTap;
    }

    
    
}
