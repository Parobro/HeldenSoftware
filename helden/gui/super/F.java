/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.Einstellungen;
import helden.gui.components.JScrollPaneFast;
import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;

public class F
extends JPanel {
    public void o00000(JComponent jComponent) {
        this.o00000(jComponent, null);
    }

    public void o00000(JComponent jComponent, Object object) {
        if (!(jComponent instanceof JButton || jComponent instanceof JTextField || jComponent instanceof JTextArea)) {
            jComponent.setOpaque(false);
        }
        if (jComponent instanceof JScrollPaneFast) {
            JScrollPaneFast jScrollPaneFast = (JScrollPaneFast)jComponent;
            JViewport jViewport = jScrollPaneFast.getViewport();
            jViewport.setOpaque(false);
        }
        super.add((Component)jComponent, object);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        float f2;
        float f3;
        super.paintComponent(graphics);
        BufferedImage bufferedImage = Einstellungen.getInstance().getHintergundFuerGUI();
        if (bufferedImage == null) {
            return;
        }
        int n = this.getWidth();
        int n2 = this.getHeight();
        float f4 = bufferedImage.getWidth(this);
        float f5 = f4 / (float)n;
        if (f5 > (f3 = (f2 = (float)bufferedImage.getHeight(this)) / (float)n2)) {
            f5 = (float)n * (f5 / f3);
            f3 = n2;
        } else {
            f3 = (float)n2 * (f3 / f5);
            f5 = n;
        }
        Composite composite = ((Graphics2D)graphics).getComposite();
        ((Graphics2D)graphics).setComposite(AlphaComposite.getInstance(3, 0.2f));
        graphics.drawImage(bufferedImage, 0, 0, (int)f5, (int)f3, null);
        ((Graphics2D)graphics).setComposite(composite);
    }
}

