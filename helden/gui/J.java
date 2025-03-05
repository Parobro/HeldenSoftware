/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.Version;
import helden.gui.B;
import helden.gui.N;
import helden.gui.allgemein.Utils;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class J
extends JWindow
implements MouseListener {
    private static final long class = 1L;
    private static final String \u00d400000 = "helden/gui/icons/splash_back.png";
    private static final Rectangle super = new Rectangle(82, 195, 217, 16);
    private static J \u00d300000;
    private BufferedImage \u00d200000;

    public static void super() {
        \u00d300000 = new J();
    }

    public static void \u00d300000() {
        if (\u00d300000 != null) {
            \u00d300000.setVisible(false);
        }
    }

    private J() {
        this.setSize(380, 256);
        this.addMouseListener(this);
        try {
            this.\u00d200000 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource(\u00d400000));
            this.setSize(this.\u00d200000.getWidth(), this.\u00d200000.getHeight());
            Utils.zentriere(this);
            BufferedImage bufferedImage = new Robot().createScreenCapture(this.getBounds());
            N n = new N(new Random().nextInt(12) + 1);
            n.paint(bufferedImage.getGraphics());
            bufferedImage.getGraphics().drawImage(this.\u00d200000, 0, 0, null);
            this.\u00d200000 = bufferedImage;
            Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            Stroke stroke = graphics2D.getStroke();
            graphics2D.setStroke(new BasicStroke(3.0f, 1, 1));
            FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();
            Font font = new Font("Times", 1, 12);
            String string = new String("Version: " + Version.getVersion());
            TextLayout textLayout = new TextLayout(string, font, fontRenderContext);
            AffineTransform affineTransform = new AffineTransform();
            graphics2D.setColor(Color.white);
            graphics2D.setFont(font);
            affineTransform.setToTranslation(160.0, 280.0);
            Shape shape = textLayout.getOutline(affineTransform);
            graphics2D.setColor(new Color(221, 205, 165, 200));
            graphics2D.draw(shape);
            graphics2D.setStroke(stroke);
            graphics2D.setColor(new Color(255, 255, 255, 200));
            graphics2D.drawString(string, 160, 280);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.\u00d200000();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        \u00d300000.setVisible(false);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    private void \u00d200000() {
        this.setLayout(new BorderLayout());
        _o _o2 = new _o();
        _o2.setBounds(super);
        _Oo _Oo2 = new _Oo();
        this.add((Component)_Oo2, "Center");
        _Oo2.add(_o2);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    private final class _o
    extends JProgressBar {
        private static final long \u00d300000 = 1L;
        private final Color new;

        public _o() {
            super(B.\u00d200000().super().getModel());
            this.new = new Color(41, 45, 142);
            this.getModel().addChangeListener(new ChangeListener(){

                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    _o.this.repaint();
                }
            });
            this.setBorder(null);
            this.setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            graphics.setColor(this.new);
            graphics.fill3DRect(0, 0, (int)((float)(this.getWidth() * (this.getValue() + 1)) / (float)(this.getMaximum() - 1)), this.getHeight(), true);
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    private class _Oo
    extends JPanel {
        public _Oo() {
            this.setOpaque(true);
            this.setLayout(null);
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            if (J.this.\u00d200000 != null) {
                graphics.drawImage(J.this.\u00d200000, 0, 0, null);
            }
        }
    }
}

