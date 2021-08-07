/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Admin
 */
public class PhanQuyen {
    private int LoaiTK;
    private String Quyen;

    public PhanQuyen(int LoaiTK, String Quyen) {
        this.LoaiTK = LoaiTK;
        this.Quyen = Quyen;
    }

    public int getLoaiTK() {
        return LoaiTK;
    }

    public void setLoaiTK(int LoaiTK) {
        this.LoaiTK = LoaiTK;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public PhanQuyen() {
    }
    
     public Object[] toArray()
    {
    return new Object[]{LoaiTK,Quyen};
    }
}
