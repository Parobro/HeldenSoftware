/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B;

import helden.framework.DruckSeitenEintrag;
import helden.framework.Einstellungen;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.Object.Q;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class null
implements Printable {
    private static final boolean \u00d500000 = false;
    private static final double \u00d600000 = 680.0;
    private static final double \u00d300000 = 450.0;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO String;
    private boolean o00000 = false;
    private int \u00d800000 = 0;
    private oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d200000;

    public null(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, boolean bl, oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.String = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.o00000 = bl;
        this.\u00d200000 = oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    @Override
    public synchronized int print(Graphics graphics, PageFormat pageFormat, int n) throws PrinterException {
        Graphics2D graphics2D = (Graphics2D)graphics;
        double d2 = pageFormat.getImageableHeight();
        double d3 = pageFormat.getImageableWidth();
        graphics2D.setColor(Color.BLACK);
        graphics2D.setBackground(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        if (n != -1) {
            while (n + this.\u00d800000 < this.\u00d200000.\u00d400000().size()) {
                G g2 = this.\u00d200000.\u00d400000().get(n + this.\u00d800000);
                if (this.super(g2)) {
                    graphics2D.scale(d3 / 450.0, d2 / 680.0);
                    if (!g2.\u00d400000()) {
                        graphics2D.rotate(Math.toRadians(-90.0));
                        graphics2D.translate(-820.0 + (d3 - 450.0), 0.0);
                    }
                    graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                    if (!g2.\u00d300000()) {
                        this.super(graphics2D, true);
                    }
                    g2.o00000((Graphics)graphics2D);
                    this.\u00d200000(graphics2D, true);
                    return 0;
                }
                ++this.\u00d800000;
            }
            if (n + this.\u00d800000 >= this.\u00d200000.\u00d400000().size()) {
                return 1;
            }
        }
        return 0;
    }

    private void \u00d200000(Graphics2D graphics2D, boolean bl) {
    }

    private void super(Graphics2D graphics2D, boolean bl) {
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.String.\u00f4o0000()).isSignieren()) {
            graphics2D.setFont(G.new(10));
            graphics2D.scale(1.0, 0.97);
            if (bl) {
                graphics2D.drawString(this.String.\u00f5o0000(), 20, 690);
            } else {
                graphics2D.drawString(this.String.\u00f5o0000(), 20, 460);
            }
        }
    }

    private boolean super(G g2) {
        try {
            DruckSeitenEintrag druckSeitenEintrag = Einstellungen.getInstance().getSeitenEinstellungen(this.String.\u00f4o0000()).getSeitenEinstellungen(g2.new());
            if (druckSeitenEintrag == null) {
                druckSeitenEintrag = new DruckSeitenEintrag(g2.new(), true, "");
            }
            String string = druckSeitenEintrag.getLastPrintHash();
            BufferedImage bufferedImage = new BufferedImage(1000, 1000, 2);
            g2.o00000(true);
            g2.o00000(bufferedImage.getGraphics());
            g2.o00000(false);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)bufferedImage, "jpg", byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byte[] byArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            String string2 = Q.o00000(Q.o00000(byArray));
            if (this.o00000 && string.equals(string2)) {
                return false;
            }
            druckSeitenEintrag.setLastPrintHash(string2);
            Einstellungen.getInstance().getSeitenEinstellungen(this.String.\u00f4o0000()).getSet().add(druckSeitenEintrag);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }
}

