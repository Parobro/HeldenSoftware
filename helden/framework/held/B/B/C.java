/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B;

import helden.framework.Einstellungen;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageOutputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C {
    private static int \u00f500000;
    private static int o00000;
    private static float \u00d600000;
    private static final double \u00d500000 = 680.0;
    private static final double \u00d800000 = 450.0;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO null;
    private BufferedImage String;
    private BufferedImage \u00d200000;
    private String \u00d300000;

    private static void o00000(ImageWriter imageWriter, ImageWriteParam imageWriteParam, IIOImage iIOImage, String string) throws IOException {
        float f2 = \u00d600000;
        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File(string));
        imageWriteParam.setCompressionQuality(f2);
        imageWriter.setOutput(imageOutputStream);
        imageWriter.write(null, iIOImage, imageWriteParam);
        imageOutputStream.flush();
        imageOutputStream.close();
    }

    public C(String string, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n, float f2) {
        this.null = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        \u00f500000 = 400 * (n + 1);
        o00000 = 300 * (n + 1);
        \u00d600000 = f2;
        this.\u00d300000 = string;
        if (Einstellungen.getInstance().getGrau()) {
            this.String = new BufferedImage(o00000, \u00f500000, 10);
            this.\u00d200000 = new BufferedImage(\u00f500000, o00000, 10);
        } else {
            this.String = new BufferedImage(o00000, \u00f500000, 1);
            this.\u00d200000 = new BufferedImage(\u00f500000, o00000, 1);
        }
    }

    public synchronized boolean o00000(int n) {
        if (n >= oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000().size()) {
            return false;
        }
        G g2 = oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000().get(n);
        Graphics2D graphics2D = null;
        if (g2.\u00d400000()) {
            graphics2D = this.String.createGraphics();
            graphics2D.setColor(Color.WHITE);
            graphics2D.fillRect(0, 0, o00000, \u00f500000);
        } else {
            graphics2D = this.\u00d200000.createGraphics();
            graphics2D.setColor(Color.WHITE);
            graphics2D.fillRect(0, 0, \u00f500000, o00000);
        }
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0, 0, 800, 800);
        graphics2D.setColor(Color.BLACK);
        graphics2D.setBackground(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Iterator<ImageWriter> iterator = ImageIO.getImageWritersByFormatName("jpeg");
        if (!iterator.hasNext()) {
            throw new IllegalStateException("No writers for jpeg?!");
        }
        ImageWriter imageWriter = iterator.next();
        ImageWriteParam imageWriteParam = imageWriter.getDefaultWriteParam();
        imageWriteParam.setCompressionMode(2);
        imageWriteParam.setProgressiveMode(1);
        List<? extends BufferedImage> list = null;
        if (g2.\u00d400000()) {
            graphics2D.scale((double)o00000 / 450.0, (double)\u00f500000 / 680.0);
        } else {
            graphics2D.scale((double)\u00f500000 / 680.0, (double)o00000 / 450.0);
        }
        g2.o00000((Graphics)graphics2D);
        IIOImage iIOImage = g2.\u00d400000() ? new IIOImage(this.String, list, (IIOMetadata)null) : new IIOImage(this.\u00d200000, list, (IIOMetadata)null);
        try {
            C.o00000(imageWriter, imageWriteParam, iIOImage, this.\u00d300000 + this.null.\u00f5o0000().replaceAll("\\W+", "") + "_" + g2.\u00f400000() + ".JPG");
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return true;
    }
}

