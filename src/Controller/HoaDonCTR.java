/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HoaDonMOD;
import Object.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDonCTR {
     public HoaDonMOD hd = new HoaDonMOD();
    
    public ArrayList getData()
    {
    return hd.getData();
    }
    
    public ArrayList getDataByDate(int Date, int Month, int Year)
    {
    return hd.getDataByDate(Date, Month, Year);
    }
    
    public ArrayList getDataByMonth(int Month, int Year)
    {
    return hd.getDataByMonth(Month, Year);
    }
    
    public ArrayList getDataByYear( int Year)
    {
    return hd.getDataByYear(Year);
    }
    
    public HoaDon getDataByMaHD(int MaHD)
    {
    return hd.getDataByMaHD(MaHD);
    }
    
    public Boolean AddData(HoaDon hdObj)
    {
    return hd.AddData(hdObj);
    }
    
    public Boolean UpdateData(HoaDon hdObj)
    {
    return hd.UpdateData(hdObj);
    }
    
    public Boolean DeleteData(String TenDN)
    {
    return hd.DeleteData(TenDN);
    }
    
    public int getNextID()
    {
    return hd.getNextID();
    }
    
    public Float getPriceByMaHD( int MaHD)
    {
    return hd.getPriceByMaHD(MaHD);
    }
    public Boolean getData(int MaNV)
    {
    return hd.getData(MaNV);
    }
}
