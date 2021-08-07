/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ImagePanel extends JPanel {
  Image img;
public ImagePanel(String url ) {
img = new ImageIcon(getClass( ).getResource(url)).getImage( );
}
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D gd = (Graphics2D)g.create( );
gd.drawImage(img, 0, 0, getWidth( ),getHeight( ),null);
gd.dispose( );
}  
}
