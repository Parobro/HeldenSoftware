/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.held.B.B.G;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class L
extends G {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d2\u00d80000;
    private HashMap<String, String>[] \u00d3\u00d80000;
    private Vector<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d5\u00d80000;
    private int ifclass;

    public L(Vector<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> vector, HashMap<String, String>[] hashMapArray) {
        this.\u00d5\u00d80000 = vector;
        this.\u00d3\u00d80000 = hashMapArray;
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        int n = 15;
        int n2 = 45;
        graphics2D.setFont(this.o00000(16));
        graphics2D.drawString("Kampfbogen", n + 160, 25);
        this.ifclass = 0;
        for (int i2 = 0; i2 < 5; ++i2) {
            this.\u00d2\u00d80000 = this.\u00d5\u00d80000.elementAt(i2);
            if (this.\u00d2\u00d80000 != null && this.\u00d3\u00d80000[this.ifclass].size() > 0) {
                int n3 = n2;
                n3 = this.\u00f8\u00d30000(graphics2D, n3);
                n3 = this.\u00d3O0000(graphics2D, n, n3);
                n3 = this.while(graphics2D, n + 125, n2);
            }
            n2 += 100;
            ++this.ifclass;
        }
        graphics2D.drawRoundRect(5, 5, 440, 660, 5, 5);
    }

    @Override
    public List<G> \u00d500000() {
        return new ArrayList<G>();
    }

    @Override
    public int \u00d800000() {
        return 1;
    }

    @Override
    public String \u00f400000() {
        return "Spielleiterkampfbogen";
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private int \u00d3O0000(Graphics2D graphics2D, int n, int n2) {
        graphics2D.drawRect(n, n2 - 10, 120, 40);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("MU", n + 2, n2 - 2);
        graphics2D.drawLine(n + 15, n2 - 10, n + 15, n2 + 30);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.whilewhilesuper)), n + 18, n2 - 2);
        graphics2D.drawLine(n + 30, n2 - 10, n + 30, n2 + 30);
        graphics2D.drawString("GE", n + 32, n2 - 2);
        graphics2D.drawLine(n + 45, n2 - 10, n + 45, n2 + 30);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00f4\u00f4\u00d2000)), n + 48, n2 - 2);
        graphics2D.drawLine(n + 60, n2 - 10, n + 60, n2 + 30);
        graphics2D.drawString("INI", n + 62, n2 - 2);
        graphics2D.drawLine(n + 75, n2 - 10, n + 75, n2 + 30);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00f4\u00d8\u00d2000)), n + 78, n2 - 2);
        graphics2D.drawLine(n + 90, n2 - 10, n + 90, n2 + 30);
        graphics2D.drawString("LE", n + 92, n2 - 2);
        graphics2D.drawLine(n + 105, n2 - 10, n + 105, n2 + 30);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00d3\u00f4\u00d2000)), n + 108, n2 - 2);
        graphics2D.drawLine(n, n2, n + 120, n2);
        graphics2D.drawString("KL", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.newwhilesuper)), n + 18, n2 - 2);
        graphics2D.drawString("FF", n + 32, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.O\u00f5\u00d2000)), n + 48, n2 - 2);
        graphics2D.drawString("MR", n + 62, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00d8\u00f5\u00d2000)), n + 78, n2 - 2);
        graphics2D.drawString("AE", n + 92, n2 - 2);
        if (this.\u00d2\u00d80000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00f4\u00f5\u00d2000)), n + 108, n2 - 2);
        }
        graphics2D.drawLine(n, n2, n + 120, n2);
        graphics2D.drawString("IN", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00f8\u00f4\u00d2000)), n + 18, n2 - 2);
        graphics2D.drawString("KO", n + 32, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.returnwhilesuper)), n + 48, n2 - 2);
        graphics2D.drawString("RS", n + 62, n2 - 2);
        graphics2D.drawString("KE", n + 92, n2 - 2);
        if (this.\u00d2\u00d80000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00d4\u00f5\u00d2000)), n + 108, n2 - 2);
        }
        graphics2D.drawLine(n, n2, n + 120, n2);
        graphics2D.drawString("CH", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.\u00d5\u00f4\u00d2000)), n + 18, n2 - 2);
        graphics2D.drawString("KK", n + 32, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.privatedosuper)), n + 48, n2 - 2);
        graphics2D.drawString("BE", n + 62, n2 - 2);
        graphics2D.drawString("AU", n + 92, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d80000.o00000(b_0.thispublicsuper)), n + 108, n2 - 2);
        return n2 += 15;
    }

    private int \u00f8\u00d30000(Graphics2D graphics2D, int n) {
        int n2 = 15;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Helden-Name: " + this.\u00d2\u00d80000.\u00f5o0000(), n2 + 2, n - 2);
        graphics2D.drawLine(n2, n, n2 + 76, n);
        graphics2D.drawRect(n2, n - 10, 120, 10);
        graphics2D.setFont(this.o00000(6));
        return n += 10;
    }

    private int while(Graphics2D graphics2D, int n, int n2) {
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawRect(n, n2 - 10, 76, 50);
        graphics2D.drawString("Waffen", n + 27, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawLine(n + 18, n2, n + 18, n2 + 40);
        graphics2D.drawLine(n + 47, n2, n + 47, n2 + 40);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Art", n + 2, (n2 += 10) - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("At/Pa", n + 2, (n2 += 10) - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("DK", n + 2, (n2 += 10) - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("TP", n + 2, (n2 += 10) - 2);
        return n2 += 15;
    }
}

