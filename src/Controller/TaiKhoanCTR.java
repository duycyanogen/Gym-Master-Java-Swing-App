/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TaiKhoanMOD;
import Object.TaiKhoan;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TaiKhoanCTR {
    public TaiKhoanMOD tk = new TaiKhoanMOD();
    
    public ArrayList getData()
    {
    return tk.getData();
    }
    
    public TaiKhoan getData(String TenDN)
    {
    return tk.getData(TenDN);
    }
    
    public Boolean AddData(TaiKhoan tkObj)
    {
    return tk.AddData(tkObj);
    }
    
     public Boolean checkPass(String TenDN, String Password)
    {
    return tk.checkPass(TenDN, Password);
    }
    
    public Boolean UpdateData(TaiKhoan tkObj)
    {
    return tk.UpdateData(tkObj);
    }
    
    
    public Boolean DeleteData(String TenDN)
    {
    return tk.DeleteData(TenDN);
    }
    
    public int Login(String TenDN, String PassWord)
    {
    return tk.Login(TenDN, PassWord);
    }
    
    public boolean ResetPassword(String TenDangNhap, String Email)
    {
    return tk.ResetPassword(TenDangNhap, Email);
    }
    
    public ArrayList<Object[]> getDataJoinNVAndTaiKhoan()
    {
    return tk.getDataJoinNVAndTaiKhoan();
    }
    
    public Object[] getDataJoinNVAndTaiKhoan(String TenDangNhap)
    {
    return tk.getDataJoinNVAndTaiKhoan(TenDangNhap);
    }
}
