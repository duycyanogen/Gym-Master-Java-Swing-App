/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoaiGoiTapMOD;
import Object.LoaiGoiTap;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LoaiGoiTapCTR {
     public LoaiGoiTapMOD lgtm = new LoaiGoiTapMOD();
    
    public ArrayList getData()
    {
    return lgtm.getData();
    }
    
    
    public Boolean AddData(LoaiGoiTap lgtmObj)
    {
    return lgtm.AddData(lgtmObj);
    }
    
    public Boolean UpdateData(LoaiGoiTap lgtmObj)
    {
    return lgtm.UpdateData(lgtmObj);
    }
    
    public Boolean DeleteData(String TenHV)
    {
    return lgtm.DeleteData(TenHV);
    }
    
    public int getNextID()
    {
    return lgtm.getNextID();
    }
    
    public ArrayList<String> ToString()
    {
    return lgtm.ToString();
    }
    public int getMaLoaiGoiTap(String TenLoaiGoiTap)
    {
    return lgtm.getMaLoaiGoiTap(TenLoaiGoiTap);
    }
    public String getTenLoaiGoiTap(int MaLoaiGoiTap)
    {
    return lgtm.getTenLoaiGoiTap(MaLoaiGoiTap);
    }
    
    public LoaiGoiTap getDataByMaLoaiGoiTap( int MaLoaiGoiTap)
    {
    return lgtm.getDataByMaLoaiGoiTap(MaLoaiGoiTap);
    }
}
