/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.VoucherKMMOD;
import Object.VoucherKM;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class VoucherKMCTR {
    VoucherKMMOD x = new VoucherKMMOD();
    public ArrayList<VoucherKM> getData()
    {
    return x.getData();
    }
    
    public VoucherKM getData(String MaVoucher, int MaGoiTap, int MaLoaiGoiTap)
    {
    return x.getData(MaVoucher, MaGoiTap, MaLoaiGoiTap);
    }
    
    public Boolean Adddata(VoucherKM VchObj)
    {
    return x.AddData(VchObj);
    }
    
    public Boolean UpdateData(VoucherKM tk)
    {
    return x.UpdateData(tk);
    }
    
    public Boolean DeleteData(String MaVoucher, int MaGoiTap, int MaLoaiGoiTap)
    {
    return x.DeleteData(MaVoucher, MaGoiTap, MaLoaiGoiTap);
    }
    
}
