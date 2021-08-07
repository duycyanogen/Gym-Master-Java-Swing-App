/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class ImageScaler {
    public ImageIcon ImageScaler (String linkImage, int w, int h) 
    {
    try {
        BufferedImage image = ImageIO.read(new File(linkImage));
 
        int x = w;
        int y = h;
        int ix = image.getWidth();
        int iy = image.getHeight();
        int dx = 0, dy = 0;
 
        if (x / y > ix / iy) {
            dy = y;
            dx = dy * ix / iy;
        } else {
            dx = x;
            dy = dx * iy / ix;
        }
 
        return new ImageIcon(image.getScaledInstance(dx, dy,image.SCALE_SMOOTH));
 
    } catch (IOException e) {
 
        e.printStackTrace();
    }
 
    return null;
}
}
