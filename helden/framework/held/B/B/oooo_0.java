/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.b.b;

import helden.framework.held.B.B.OoOO.String;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.spielleiterBrief.SpielleiterAuswahl;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from helden.framework.held.B.B.oooO
 */
public class oooo_0
implements Printable {
    private static final boolean \u00d200000 = false;
    private static final double \u00d400000 = 680.0;
    private static final double o00000 = 455.0;
    private List<SpielleiterAuswahl> Object;

    public oooo_0(List<SpielleiterAuswahl> list) {
        this.Object = list;
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
        if (n == 0 && this.Object != null) {
            graphics2D.scale(d3 / 455.0, d2 / 680.0);
            graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
            ArrayList<HashMap<java.lang.String, Boolean>> arrayList2 = new ArrayList<HashMap<java.lang.String, Boolean>>();
            for (int i2 = 0; i2 < this.Object.size() && i2 < 5; ++i2) {
                arrayList.add(this.Object.get(i2).getHeld());
                arrayList2.add(this.Object.get(i2).getAusgewaehlte());
            }
            String string = new String(arrayList, arrayList2);
            string.o00000((Graphics)graphics2D);
            this.o00000(graphics2D, true);
            return 0;
        }
        if (n == 1 && this.Object.size() > 5) {
            graphics2D.scale(d3 / 455.0, d2 / 680.0);
            graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
            ArrayList<HashMap<java.lang.String, Boolean>> arrayList3 = new ArrayList<HashMap<java.lang.String, Boolean>>();
            for (int i3 = 5; i3 < this.Object.size() && i3 < 10; ++i3) {
                arrayList.add(this.Object.get(i3).getHeld());
                arrayList3.add(this.Object.get(i3).getAusgewaehlte());
            }
            String string = new String(arrayList, arrayList3);
            string.o00000((Graphics)graphics2D);
            this.o00000(graphics2D, true);
            return 0;
        }
        return 1;
    }

    private void o00000(Graphics2D graphics2D, boolean bl) {
    }
}

