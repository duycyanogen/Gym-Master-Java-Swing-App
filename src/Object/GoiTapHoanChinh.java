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
public class GoiTapHoanChinh {
    int MaGoiTap, MaLoaiGoiTap;
    Float GiaGoiTap;

    public GoiTapHoanChinh(int MaGoiTap, int MaLoaiGoiTap, Float GiaGoiTap) {
        this.MaGoiTap = MaGoiTap;
        this.MaLoaiGoiTap = MaLoaiGoiTap;
        this.GiaGoiTap = GiaGoiTap;
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

    public Float getGiaGoiTap() {
        return GiaGoiTap;
    }

    public void setGiaGoiTap(Float GiaGoiTap) {
        this.GiaGoiTap = GiaGoiTap;
    }
    

    public GoiTapHoanChinh() {
    }

 

   
     public Object[] toArray()
    {
        NumberProcesser x = new NumberProcesser();
    return new Object[]{MaGoiTap,MaLoaiGoiTap,x.FloatToVND(GiaGoiTap)};
    }
    
}
