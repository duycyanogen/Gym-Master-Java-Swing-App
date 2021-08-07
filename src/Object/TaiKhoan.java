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
public class TaiKhoan {
    private String TenDangNhap, PassWord;
    private int LoaiTK, MaNV;
    
    public TaiKhoan() {
    }

    public TaiKhoan(String TenDangNhap, String PassWord, int LoaiTK, int MaNV) {
        this.TenDangNhap = TenDangNhap;
        this.PassWord = PassWord;
        this.LoaiTK = LoaiTK;
        this.MaNV = MaNV;
    }
    
    

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public int getLoaiTK() {
        return LoaiTK;
    }

    public void setLoaiTK(int LoaiTK) {
        this.LoaiTK = LoaiTK;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    
}
