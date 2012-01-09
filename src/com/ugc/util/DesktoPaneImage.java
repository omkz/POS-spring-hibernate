/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugc.util;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author nia
 */
public class DesktoPaneImage extends JDesktopPane {

    private Image img;

    public DesktoPaneImage() {

        setOpaque(false);
//mengambil gambar
        img = new ImageIcon(getClass().getResource("/Image.jpg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
//menset transparansi
        g2.setComposite(AlphaComposite.SrcOver.derive(0.4F));
//melakukan penggambaran
        g2.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        g2.dispose();
    }
}
