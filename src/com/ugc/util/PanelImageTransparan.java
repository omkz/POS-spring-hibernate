package com.ugc.util;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ngiwutz
 */
public class PanelImageTransparan extends JPanel {

    private Image img;

    public PanelImageTransparan() {

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
