/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HoiVienMOD;
import Object.HoiVien;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoiVienCTR {
     public HoiVienMOD hv = new HoiVienMOD();
    
    public ArrayList getData()
    {
    return hv.getData();
    }
    
    public HoiVien getData(int MaHV)
    {
    return hv.getData(MaHV);
    }
    
    public Boolean AddData(HoiVien hvObj)
    {
    return hv.AddData(hvObj);
    }
    
    public Boolean UpdateData(HoiVien hvObj)
    {
    return hv.UpdateData(hvObj);
    }
    
    public Boolean DeleteData(String TenHV)
    {
    return hv.DeleteData(TenHV);
    }
    
    public int getNextID()
    {
    return hv.getNextID();
    }
    
    public ArrayList<String> ToString()
    {
    return hv.ToString();
    }
    
}
