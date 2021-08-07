/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NhanVienMOD;
import Object.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhanVienCTR {

    public NhanVienMOD nv = new NhanVienMOD();

    public ArrayList getData() {
        return nv.getData();
    }

    public NhanVien getData(int MaHV) {
        return nv.getData(MaHV);
    }

    public Boolean AddData(NhanVien nvObj) {
        return nv.AddData(nvObj);
    }

    public Boolean UpdateData(NhanVien nvObj) {
        return nv.UpdateData(nvObj);
    }

    public Boolean DeleteData(int MaHV) {
        return nv.DeleteData(MaHV);
    }

    public int getCurrentID() {
        return nv.getCurrentID();
    }

    public int GetMaNVByTenDangNhap(String TenDangNhap) {
        return nv.GetMaNVByTenDangNhap(TenDangNhap);
    }

}
