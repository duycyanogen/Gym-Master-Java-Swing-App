/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.VeTapMOD;
import Object.VeTap;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class VeTapCTR {
    VeTapMOD x = new VeTapMOD();
    public Boolean AddData(VeTap ct)
    {
    return x.AddData(ct);
    }
    
    public ArrayList<VeTap> getData()
    {
    return x.getData();
    }
    public ArrayList<VeTap> getDataByDate(int Date, int Month, int Year)
    {
    return x.getDataByDate(Date, Month, Year);
    }
    
    public ArrayList<VeTap> getDataByMonth(int Month, int Year)
    {
    return x.getDataByMonth( Month, Year);
    }
    
    public ArrayList<VeTap> getDataByYear(int Year)
    {
    return x.getDataByYear(Year);
    }
}
