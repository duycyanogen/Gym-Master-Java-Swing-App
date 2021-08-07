/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GoiTapHoanChinhMOD;
import Object.GoiTapHoanChinh;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GoiTapHoanChinhCTR {
    public GoiTapHoanChinhMOD ctgtm = new GoiTapHoanChinhMOD();
    
    public ArrayList getData()
    {
    return ctgtm.getData();
    }
       
    public Boolean AddData(GoiTapHoanChinh ctgtObj)
    {
    return ctgtm.AddData(ctgtObj);
    }
    
    public Boolean UpdateData(GoiTapHoanChinh gtmObj)
    {
    return ctgtm.UpdateData(gtmObj);
    }
    
    public Boolean DeleteData(int MaGoiTap)
    {
    return ctgtm.DeleteData(MaGoiTap);
    }
    
    public int getNextID()
    {
    return ctgtm.getNextID();
    }
    public Float findPrice( int MaGoiTap, int MaLoaiGoiTap)
    {
    return ctgtm.findPrice(MaGoiTap, MaLoaiGoiTap);
    }
//    public ArrayList<String> ToString()
//    {
//    return ctgtm.ToString();
//    }
    
}
