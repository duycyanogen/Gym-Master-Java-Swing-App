/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiTietHoaDonMOD;
import Object.ChiTietHoaDon;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDonCTR {
    public ChiTietHoaDonMOD ctgtm = new ChiTietHoaDonMOD();
    
    public ArrayList getData()
    {
    return ctgtm.getData();
    }
    
    public ArrayList<ChiTietHoaDon> getDataByMaHD(int MaHD){
    
    return ctgtm.getDataByMaHD(MaHD);
    }
    
    
    public Boolean AddData(ChiTietHoaDon ctgtObj)
    {
    return ctgtm.AddData(ctgtObj);
    }
    
    public Boolean DeleteData(int MaGoiTap, int MaLoaiGoiTap, int MaHD)
    {
    return ctgtm.DeleteData(MaGoiTap,MaGoiTap, MaHD);
    }
    
     public ArrayList<Object[]> getDataByMaHV(int MaHV)
     {
     return ctgtm.getDataByMaHV(MaHV);
     
     }
     
     public ArrayList<Object[]> getDataObject(String currentDate)        
     {
     return ctgtm.getDataObject(currentDate);
     }
     
      public String getEndDate(int MaHV, int MaGoiTap, String CurrentDate)
      {
      return ctgtm.getEndDate(MaHV, MaGoiTap, CurrentDate);
      }
      
      public String getStartDate(int MaHV, int MaGoiTap, String CurrentDate)
      {
      return ctgtm.getEndDate(MaHV, MaGoiTap, CurrentDate);
      }
      public Float getPriceByMaHD(int MaHD)
      {
      return ctgtm.getPriceByMaHD(MaHD);
      }
    

}
