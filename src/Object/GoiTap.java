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
public class GoiTap {
    private int MaGoiTap;
    private String TenGoiTap;
    private String ChiTietGoiTap;

    public String getChiTietGoiTap() {
        return ChiTietGoiTap;
    }

    public void setChiTietGoiTap(String ChiTietGoiTap) {
        this.ChiTietGoiTap = ChiTietGoiTap;
    }


    public GoiTap() {
    }

    public GoiTap(int MaGoiTap, String TenGoiTap, String ChiTietGoiTap) {
        this.MaGoiTap = MaGoiTap;
        this.TenGoiTap = TenGoiTap;
        this.ChiTietGoiTap = ChiTietGoiTap;
    }

    public int getMaGoiTap() {
        return MaGoiTap;
    }

    public void setMaGoiTap(int MaGoiTap) {
        this.MaGoiTap = MaGoiTap;
    }

    public String getTenGoiTap() {
        return TenGoiTap;
    }

    public void setTenGoiTap(String TenGoiTap) {
        this.TenGoiTap = TenGoiTap;
    }

    
    
}
