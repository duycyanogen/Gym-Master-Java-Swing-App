/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class NumberProcesser {

    public NumberProcesser() {
    }
    public Boolean CheckFloat(String number)
    {
        try {
            Float.parseFloat(number);
            
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public Boolean CheckInt(String number)
    {
        try {
            Integer.parseInt(number);
            
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    
    public String FloatToVND(Float number)
    {
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    return currencyVN.format(number);
    }
    
    public Float VNDToFloat (String VND)
    {
    String temp = VND.replace(" ₫", "");
    temp = temp.replace(".", "");
    
        //System.out.println(temp);
        String result = temp;    
    return Float.parseFloat(result);
    }
}
