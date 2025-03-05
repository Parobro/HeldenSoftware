/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.held.Object.A;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.class;
import helden.gui.oooo_1;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class T
extends JPanel {
    private JButton \u00d500000;
    private JPanel \u00d200000;
    private class o00000;
    private A String;
    private int \u00d300000;

    public T(int n, JDialog jDialog) {
        jDialog.setResizable(false);
        this.o00000 = new class(this, jDialog);
        this.String = new A("COPYRIGHT", n);
        this.\u00d300000 = n;
        this.new();
    }

    public JButton \u00d400000() {
        if (this.\u00d500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d500000 = new JButton("OK", imageIcon);
            this.\u00d500000.setName("OK");
            this.\u00d500000.addActionListener(this.o00000);
        }
        return this.\u00d500000;
    }

    private JPanel \u00d300000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JPanel();
            this.\u00d200000.add(this.\u00d400000());
        }
        return this.\u00d200000;
    }

    private Component o00000() {
        JPanel jPanel = new JPanel(){

            @Override
            protected void paintComponent(Graphics graphics) {
                float f2;
                float f3;
                super.paintComponent(graphics);
                Image image = T.this.String.o00000();
                if (image == null) {
                    return;
                }
                int n = this.getWidth();
                int n2 = this.getHeight();
                float f4 = image.getWidth(this);
                float f5 = f4 / (float)n;
                if (f5 > (f3 = (f2 = (float)image.getHeight(this)) / (float)n2)) {
                    f5 = (float)n * (f5 / f3);
                    f3 = n2;
                } else {
                    f3 = (float)n2 * (f3 / f5);
                    f5 = n;
                }
                graphics.drawImage(image, 0, 0, (int)f5, (int)f3, null);
                Composite composite = ((Graphics2D)graphics).getComposite();
                ((Graphics2D)graphics).setComposite(AlphaComposite.getInstance(3, 0.2f));
                int n3 = this.getSize().width;
                int n4 = this.getSize().height;
                FontRenderContext fontRenderContext = ((Graphics2D)graphics).getFontRenderContext();
                Font font = new Font("Times", 1, n3 / 25);
                String string = new String(" Helden-Software ");
                TextLayout textLayout = new TextLayout(string, font, fontRenderContext);
                AffineTransform affineTransform = new AffineTransform();
                ((Graphics2D)graphics).setColor(Color.BLACK);
                affineTransform.setToTranslation(0.0, 0.0);
                Shape shape = textLayout.getOutline(affineTransform);
                int n5 = 0;
                while (n5 < n4) {
                    int n6 = -n5;
                    while (n6 < n3) {
                        affineTransform.setToTranslation(n6, n5);
                        shape = textLayout.getOutline(affineTransform);
                        ((Graphics2D)graphics).draw(shape);
                        n6 = (int)((double)n6 + (shape.getBounds2D().getWidth() + 40.0));
                    }
                    n5 = (int)((double)n5 + (shape.getBounds2D().getHeight() + 40.0));
                }
                ((Graphics2D)graphics).setComposite(composite);
            }
        };
        if (this.\u00d300000 == 1) {
            jPanel.setPreferredSize(new Dimension(377, 626));
        } else if (this.\u00d300000 == 2) {
            jPanel.setPreferredSize(new Dimension(377, 598));
        } else if (this.\u00d300000 == 3) {
            jPanel.setPreferredSize(new Dimension(377, 536));
        } else if (this.\u00d300000 == 4) {
            jPanel.setPreferredSize(new Dimension(377, 536));
        } else if (this.\u00d300000 == 5) {
            jPanel.setPreferredSize(new Dimension(377, 809));
        } else if (this.\u00d300000 == 6) {
            jPanel.setPreferredSize(new Dimension(377, 702));
        } else if (this.\u00d300000 == 7) {
            jPanel.setPreferredSize(new Dimension(377, 627));
        } else if (this.\u00d300000 == 8) {
            jPanel.setPreferredSize(new Dimension(377, 446));
        } else if (this.\u00d300000 == 9) {
            jPanel.setPreferredSize(new Dimension(377, 559));
        } else if (this.\u00d300000 == 10) {
            jPanel.setPreferredSize(new Dimension(377, 561));
        } else if (this.\u00d300000 == 11) {
            jPanel.setPreferredSize(new Dimension(377, 996));
        } else if (this.\u00d300000 == 12) {
            jPanel.setPreferredSize(new Dimension(377, 471));
        }
        return jPanel;
    }

    private void new() {
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast();
        jScrollPaneFast.setHorizontalScrollBarPolicy(31);
        this.add((Component)jScrollPaneFast, "Center");
        this.add((Component)this.\u00d300000(), "South");
        jScrollPaneFast.setViewportView(this.o00000());
    }
}

