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
public class HoaDon {
    private int MaHD;
    private String NgayLap;
    private int MaHV;
    private int MaNV;

    public HoaDon() {
    }

    public HoaDon(int MaHD, String NgayLap, int MaHV, int MaNV) {
        this.MaHD = MaHD;
        this.NgayLap = NgayLap;
        this.MaHV = MaHV;
        this.MaNV = MaNV;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }



    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public int getMaHV() {
        return MaHV;
    }

    public void setMaHV(int MaHV) {
        this.MaHV = MaHV;
    }




    public Object[] toArray()
    {
        NumberProcesser x = new NumberProcesser();
    return new Object[]{MaHD, NgayLap,MaHV,MaNV};
    }
}
