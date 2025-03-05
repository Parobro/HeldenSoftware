/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JComponent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DruckVorschauKomponente
extends JComponent {
    private static final float o00000 = 1.2f;
    private Printable \u00d300000;
    private int \u00d400000;
    private PageFormat new;

    public DruckVorschauKomponente() {
        this.o00000();
        this.o00000(true);
        this.\u00d400000 = 0;
    }

    @Override
    public void paint(Graphics graphics) {
        try {
            Graphics2D graphics2D = (Graphics2D)graphics;
            graphics2D.setBackground(Color.WHITE);
            graphics2D.clearRect(0, 0, this.getWidth(), this.getHeight());
            graphics2D.scale(1.2f, 1.2f);
            if (!Einstellungen.getInstance().getBuchdruck() && this.\u00d400000 != -1 && !oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000().get(this.\u00d400000).\u00d400000()) {
                graphics2D.rotate(Math.toRadians(90.0));
                graphics2D.translate(0, -766);
            }
            this.o00000();
            if (this.\u00d300000 != null) {
                this.\u00d300000.print(graphics2D, this.new, this.\u00d400000);
            }
        }
        catch (PrinterException printerException) {
            printerException.printStackTrace();
        }
    }

    public void setPrintable(Printable printable) {
        this.\u00d300000 = printable;
        if (!Einstellungen.getInstance().getBuchdruck()) {
            this.o00000(true);
        }
        this.repaint();
    }

    public void setSeite(int n) {
        this.\u00d400000 = n;
        if (!Einstellungen.getInstance().getBuchdruck() && n > 0) {
            if (n >= oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000().size()) {
                n = 0;
            }
            this.o00000(oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000().get(n).\u00d400000());
        }
        this.repaint();
    }

    private void o00000(boolean bl) {
        float f2;
        float f3;
        if (bl) {
            f3 = (float)this.new.getWidth();
            f2 = (float)this.new.getHeight();
        } else {
            f3 = (float)this.new.getHeight();
            f2 = (float)this.new.getWidth();
        }
        this.setPreferredSize(new Dimension(Math.round(f3 *= 1.2f), Math.round(f2 *= 1.2f)));
    }

    private void o00000() {
        this.new = new PageFormat();
        Paper paper = this.new.getPaper();
        if (!Einstellungen.getInstance().getBuchdruck()) {
            this.new.setOrientation(1);
            paper.setImageableArea(0.0, 0.0, paper.getWidth(), paper.getHeight());
            this.new.setPaper(paper);
        } else {
            this.new.setOrientation(0);
            paper.setImageableArea(0.0, 0.0, paper.getWidth(), paper.getHeight());
            this.new.setPaper(paper);
        }
    }
}

