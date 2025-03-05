/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B;

import helden.framework.held.B.B.OoOO.int;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OO
implements Printable {
    private static final boolean \u00d300000 = false;
    private static final double \u00d400000 = 680.0;
    private static final double \u00d200000 = 455.0;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> super;

    public O0OO(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        this.super = arrayList;
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
        if (n == 0 && this.super != null) {
            graphics2D.scale(d3 / 455.0, d2 / 680.0);
            graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            int intVal = new int(this.super, n);
            intVal.o00000((Graphics)graphics2D);
            this.o00000(graphics2D, true);
            return 0;
        }
        int n2 = this.super.size();
        int n3 = (n2 + 15) / 16;
        if (n < n3) {
            graphics2D.scale(d3 / 455.0, d2 / 680.0);
            graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            int intVal = new int(this.super, n);
            intVal.o00000((Graphics)graphics2D);
            this.o00000(graphics2D, true);
            return 0;
        }
        return 1;
    }

    private void o00000(Graphics2D graphics2D, boolean bl) {
    }
}

