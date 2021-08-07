/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GoiTapMOD;
import java.util.ArrayList;
import Object.GoiTap;
/**
 *
 * @author Admin
 */
public class GoiTapCTR {
      public GoiTapMOD gtm = new GoiTapMOD();
    
    public ArrayList getData()
    {
    return gtm.getData();
    }
    
//    public ArrayList find(String TenGoiTap)
//    {
//    return gtm.find(TenGoiTap);
//    }
    
    public Boolean AddData(GoiTap gtmObj)
    {
    return gtm.AddData(gtmObj);
    }
    
    public Boolean UpdateData(GoiTap gtmObj)
    {
    return gtm.UpdateData(gtmObj);
    }
    
    public Boolean DeleteData(int MaGoiTap)
    {
    return gtm.DeleteData(MaGoiTap);
    }
    
    public int getNextID()
    {
    return gtm.getNextID();
    }
    
    public ArrayList<String> ToString()
    {
    return gtm.ToString();
    }
    public int getMaGoiTap(String TenLoaiGoiTap)
    {
        
        //const goitap = fun
    return gtm.getMaGoiTap(TenLoaiGoiTap);
    }
    
    public GoiTap getData(int MaGoiTap)
    {
        return gtm.getData(MaGoiTap);
    }
    
    public ArrayList<String> findTenGoiTapByMaHV( int MaHV)
    {
    return gtm.getTenGoiTapByMaHV(MaHV);
    }
    
     public ArrayList<String> getTenGoiTapByMaHV( int MaHV, String CurrentDate)
    {
    return gtm.getTenGoiTapByMaHV(MaHV, CurrentDate);
    }
    
}
