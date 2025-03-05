/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.E.C.A;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Einstellungen;
import helden.framework.OoOO.E;
import helden.framework.held.B;
import helden.framework.held.B.B.G;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C
extends G {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f5\u00d40000;
    private int \u00f6\u00d40000;

    public C(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00f5\u00d40000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00f6\u00d40000 = n;
        if (this.\u00f6\u00d40000 == 0 && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(0).\u00d3O0000() && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(0).o00000()) {
            ++this.\u00f6\u00d40000;
        }
        if (this.\u00f6\u00d40000 == 1 && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(1).\u00d3O0000() && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(1).o00000()) {
            ++this.\u00f6\u00d40000;
        }
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        String string = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d40000.\u00f4o0000()).getBackgroudPath();
        File file = new File(this.\u00d400000(string + "hshb3.JPG"));
        if (!file.exists()) {
            this.\u00d400000(graphics2D);
        } else {
            try {
                if (file.exists()) {
                    helden.framework.held.B.B.C.Object object = new helden.framework.held.B.B.C.Object(this.\u00d400000(string + "hshb3.JPG"));
                    object.paint(graphics2D);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.oo0000(graphics2D);
            this.Oo0000(graphics2D);
            this.\u00d5o0000(graphics2D);
            this.\u00f4o0000(graphics2D);
            this.nullsuper(graphics2D);
            this.\u00d8o0000(graphics2D);
            this.\u00d4o0000(graphics2D);
            this.forsuper(graphics2D);
        }
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d40000.\u00f4o0000()).isDrucken(this.new())) {
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                arrayList.add(new C(this.\u00f5\u00d40000, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        int n = 0;
        if (this.\u00f5\u00d40000.o00000(0).\u00d3O0000() || this.\u00f5\u00d40000.o00000(0).o00000()) {
            ++n;
        }
        if (this.\u00f5\u00d40000.o00000(1).\u00d3O0000() || this.\u00f5\u00d40000.o00000(1).o00000()) {
            ++n;
        }
        if (this.\u00f5\u00d40000.o00000(2).\u00d3O0000() || this.\u00f5\u00d40000.o00000(2).o00000()) {
            ++n;
        }
        if (n == 0) {
            n = 1;
        }
        return n;
    }

    @Override
    public String \u00f400000() {
        return "Kampfbogen " + (this.\u00f6\u00d40000 + 1);
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    @Override
    protected void o00000(Graphics2D graphics2D, String string, int n, int n2, int n3) {
        int n4 = (n2 - n) / 2;
        int n5 = (int)this.o00000(string, graphics2D) / 2;
        graphics2D.drawString(string, n + n4 - n5, n3);
    }

    private void \u00d4o0000(Graphics2D graphics2D) {
        int n = 35;
        int n2 = 412;
        int n3 = 555;
        int n4 = n3 - 10;
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(b_0.\u00d5\u00f5\u00d2000), 80, n3 - 3);
        graphics2D.drawString("GS:" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).returnsuper(), 300, n3 - 3);
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000()), 104, (n3 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000() / 2), 126, n3 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000() / 3), 144, n3 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000() / 4), 163, n3 - 2);
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000()), 104, (n3 += 9) - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000() / 2), 126, n3 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000() / 3), 144, n3 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000() / 4), 163, n3 - 2);
        graphics2D.drawLine(95, n4, 95, n3);
        graphics2D.drawLine(121, n4, 121, n3);
        graphics2D.drawLine(139, n4, 139, n3);
        graphics2D.drawLine(157, n4, 157, n3);
        graphics2D.drawLine(175, n4, 175, n3);
        n3 = 599;
        n4 = n3 - 10;
        graphics2D.drawLine(n, n3, n2, n3);
        n3 += 10;
        if (this.\u00f5\u00d40000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().interface()), 104, n3 - 2);
        }
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawLine(95, n4, 95, n3 += 9);
        graphics2D.drawLine(121, n4, 121, n3);
        n3 = 643;
        graphics2D.drawLine(95, n3 - 9, 95, n3 - 1);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).private()), 80, n3 - 2);
        graphics2D.setFont(this.o00000(8));
        if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).newsuper()) {
            graphics2D.drawString("2", 193, n3 - 2);
        }
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawLine(255, n3 - 9, 255, n3 - 1);
    }

    private int \u00d8o0000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 25) - 15;
        int n6 = n2 - 10;
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawString("Wundschwelle: " + this.\u00f5\u00d40000.o00000(b_0.\u00d5\u00f5\u00d2000), n3 + 2, n2 - 2);
        graphics2D.drawString("GS:" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).returnsuper(), 300, n2 - 3);
        graphics2D.drawString("Max", 101, n2 - 2);
        graphics2D.drawString("1/2", 124, n2 - 2);
        graphics2D.drawString("1/3", 142, n2 - 2);
        graphics2D.drawString("1/4", 161, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Lebensenergie", n3 + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000()), 104, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000() / 2), 126, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000() / 3), 144, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().OO0000() / 4), 163, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawString("Ausdauer", n3 + 2, (n2 += 9) - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000()), 104, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000() / 2), 126, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000() / 3), 144, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d2O0000() / 4), 163, n2 - 2);
        graphics2D.drawLine(95, n6, 95, n2);
        graphics2D.drawLine(121, n6, 121, n2);
        graphics2D.drawLine(139, n6, 139, n2);
        graphics2D.drawLine(157, n6, 157, n2);
        graphics2D.drawLine(175, n6, 175, n2);
        graphics2D.drawRoundRect(10, n5, 430, n2 - n5 + 5, 5, 5);
        n5 = (n2 += 25) + -15;
        n6 = n2 - 10;
        graphics2D.drawString("Max", 102, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawString("Astralenergie", n3 + 2, (n2 += 10) - 2);
        if (this.\u00f5\u00d40000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().interface()), 104, n2 - 2);
        }
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawString("Karmaenergie", n3 + 2, (n2 += 9) - 2);
        if (this.\u00f5\u00d40000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d3O0000()), 104, n2 - 2);
        }
        graphics2D.drawLine(95, n6, 95, n2);
        graphics2D.drawLine(121, n6, 121, n2);
        graphics2D.drawRoundRect(10, n5, 430, n2 - n5 + 5, 5, 5);
        graphics2D.drawLine(65, (n2 += 25) - 9, 65, n2 - 1);
        graphics2D.drawString("Initiative " + this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).private()), n3, n2 - 2);
        graphics2D.drawString("INI-Basis - BE =", 70, n2 - 2);
        graphics2D.drawLine(125, n2, 145, n2);
        if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).newsuper()) {
            graphics2D.drawString("+MOD + 2 W6 =", 150, n2 - 2);
        } else {
            graphics2D.drawString("+MOD + W6 =", 150, n2 - 2);
        }
        graphics2D.drawLine(200, n2, 220, n2);
        graphics2D.drawLine(225, n2 - 9, 225, n2 - 1);
        graphics2D.drawRoundRect(10, n2 - 15, 430, 20, 5, 5);
        return n2;
    }

    private int newnew(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        graphics2D.setFont(this.o00000(8));
        int n4 = n2 - 15;
        int n5 = n3 + 145;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Ausweichen", n5, n2 - 2);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("PA-Basis -", n5, (n2 += 10) - 2);
        graphics2D.drawString("BE +", n5 + 40, n2 - 2);
        graphics2D.drawString("MOD =", n5 + 65, n2 - 2);
        graphics2D.setFont(this.o00000(14));
        graphics2D.drawString("-", n5 + 28, (n2 += 20) - 2);
        graphics2D.drawString("+", n5 + 50, n2 - 2);
        graphics2D.drawString("=", n5 + 85, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(b_0.ifwhilesuper)), n5 + 4, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d300000()), n5 + 36, n2 - 2);
        int n6 = 0;
        if (this.\u00f5\u00d40000.new(while.iffloatObject.toString())) {
            n6 += 3;
            if (this.\u00f5\u00d40000.new(while.\u00d2\u00d6\u00d6000.toString())) {
                n6 += 3;
                if (this.\u00f5\u00d40000.new(while.returnfloatObject.toString())) {
                    n6 += 3;
                }
            }
        }
        graphics2D.drawString("" + (n6 += this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000()), n5 + 67, n2 - 2);
        graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d2O0000(), n5 + 98, n2 - 2);
        graphics2D.drawLine(n5 + 2, n2, n5 + 20, n2);
        graphics2D.drawLine(n5 + 35, n2, n5 + 50, n2);
        graphics2D.drawLine(n5 + 60, n2, n5 + 80, n2);
        graphics2D.drawLine(n5 + 95, n2, n5 + 115, n2);
        graphics2D.drawRoundRect(n5 - 5, n4, 125, n2 - n4 + 5, 5, 5);
        return n2;
    }

    private void oo0000(Graphics2D graphics2D) {
        graphics2D.setFont(this.o00000(10));
        int n = 46;
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().int()), 113, n);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d600000()), 202, n);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00f600000()), 302, n);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).private()), 398, n);
    }

    private int \u00d3o0000(Graphics2D graphics2D) {
        graphics2D.setFont(this.o00000(9));
        int n = 20;
        graphics2D.drawString("Attacke-Basiswert: " + this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().int()), 38, n);
        graphics2D.drawString("Parade-Basiswert: " + this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d600000()), 130, n);
        graphics2D.drawString("Fernkampf-Basiswert: " + this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00f600000()), 230, n);
        graphics2D.drawString("Initiative-Basiswert: " + this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).private()), 330, n);
        graphics2D.drawRoundRect(30, 10, 390, 15, 5, 5);
        return n;
    }

    private void \u00d5o0000(Graphics2D graphics2D) {
        int n;
        int n2 = 35;
        int n3 = 412;
        int n4 = n = 212;
        graphics2D.drawLine(n2, n, n3, n);
        F[] fArray = new F[]{this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000(1), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000(2), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000(3)};
        for (int i2 = 0; i2 < 3; ++i2) {
            graphics2D.setFont(this.o00000(8));
            n += 11;
            if (fArray[i2] != null) {
                graphics2D.setFont(this.o00000(8));
                helden.framework.E.C.E e = (helden.framework.E.C.E)fArray[i2].o00000(helden.framework.E.B.class, 0);
                String string = fArray[i2].OO0000();
                if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f6O0000(i2 + 1)) {
                    string = string + " (J)";
                }
                if (e.thisnew()) {
                    string = string + " (i)";
                }
                graphics2D.drawString(string, 35, n - 2);
                graphics2D.setFont(this.o00000(6));
                if (e != null) {
                    graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f500000(i2 + 1).super().O\u00d80000() + " / " + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f500000(i2 + 1).super().superclass(), 120, n - 2);
                    graphics2D.setFont(this.o00000(8));
                    graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d8O0000(i2), 159, n - 2);
                    graphics2D.setFont(this.o00000(7));
                    this.o00000(graphics2D, this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).newsuper(i2), 185, 248, n - 2);
                    graphics2D.drawString(e.\u00f6o0000().toString(), 255, n - 2);
                    graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).null(i2)), 322, n - 2);
                }
            }
            graphics2D.drawLine(n2, n, n3, n);
        }
        while (n < 240) {
            graphics2D.drawLine(n2, n += 11, n3, n);
        }
        graphics2D.drawLine(117, n4 - 8, 117, n);
        graphics2D.drawLine(157, n4 - 8, 157, n);
        graphics2D.drawLine(185, n4 - 8, 185, n);
        graphics2D.drawLine(248, n4 - 8, 248, n);
        graphics2D.drawLine(317, n4 - 8, 317, n);
        graphics2D.drawLine(339, n4 - 8, 339, n);
        graphics2D.drawLine(348, n4, 348, n);
        graphics2D.drawLine(357, n4, 357, n);
        graphics2D.drawLine(366, n4, 366, n);
        graphics2D.drawLine(375, n4, 375, n);
        graphics2D.drawLine(384, n4, 384, n);
        graphics2D.drawLine(393, n4, 393, n);
        graphics2D.drawLine(402, n4, 402, n);
        n = 257;
        graphics2D.drawLine(n2, n, n3, n);
        graphics2D.setFont(this.o00000(8));
        String string = "";
        int n5 = 117;
        int n6 = n3 - (83 + n2);
        for (P p2 : this.\u00f5\u00d40000.\u00f5O0000()) {
            if (p2.\u00d400000() != 3) continue;
            int n7 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth();
            int n8 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(p2.toString() + ";  ", graphics2D).getWidth();
            if ((n7 = n7 + 3 + n8) < n6) {
                string = string + p2.toString() + ";  ";
                continue;
            }
            graphics2D.drawString(string, n5, n - 2);
            string = p2.toString() + ";  ";
            n += 11;
            n6 = n3 - n2;
            n5 = n2;
        }
        graphics2D.drawString(string, n5, n - 2);
    }

    private int \u00f8o0000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        graphics2D.setFont(this.o00000(9));
        int n5 = (n2 += 24) - 15;
        graphics2D.drawString("Fernkampfwaffe", 18, n2 - 2);
        graphics2D.drawString("TYP/eBE", 110, n2 - 2);
        graphics2D.drawString("TP", 162, n2 - 2);
        graphics2D.drawString("Entfernung", 190, n2 - 2);
        graphics2D.drawString("TP/Entfernung", 253, n2 - 2);
        graphics2D.drawString("FK", 320, n2 - 2);
        graphics2D.drawString("Anzahl Geschosse", 342, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        int n6 = n2;
        F[] fArray = new F[]{this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000(1), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000(2), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000(3)};
        for (int i2 = 0; i2 < 3; ++i2) {
            graphics2D.setFont(this.o00000(8));
            n2 += 11;
            if (fArray[i2] != null) {
                graphics2D.setFont(this.o00000(8));
                helden.framework.E.C.E e = (helden.framework.E.C.E)fArray[i2].o00000(helden.framework.E.B.class, 0);
                String string = fArray[i2].OO0000();
                if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f6O0000(i2 + 1)) {
                    string = string + " (J)";
                }
                if (e.thisnew()) {
                    string = string + " (i)";
                }
                graphics2D.drawString(string, 15, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                if (e != null) {
                    graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f500000(i2 + 1).super().O\u00d80000() + " / " + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f500000(i2 + 1).super().superclass(), 115, n2 - 2);
                    graphics2D.setFont(this.o00000(8));
                    graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d8O0000(i2), 157, n2 - 2);
                    graphics2D.setFont(this.o00000(6));
                    this.o00000(graphics2D, this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).newsuper(i2), 185, 248, n2 - 2);
                    graphics2D.setFont(this.o00000(7));
                    graphics2D.drawString(e.\u00f6o0000().toString(), 255, n2 - 2);
                    graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).null(i2)), 322, n2 - 2);
                }
            }
            graphics2D.drawLine(n3, n2, n4, n2);
        }
        graphics2D.drawLine(107, n6 - 8, 107, n2);
        graphics2D.drawLine(150, n6 - 8, 150, n2);
        graphics2D.drawLine(185, n6 - 8, 185, n2);
        graphics2D.drawLine(248, n6 - 8, 248, n2);
        graphics2D.drawLine(317, n6 - 8, 317, n2);
        graphics2D.drawLine(339, n6 - 8, 339, n2);
        graphics2D.drawLine(348, n6, 348, n2);
        graphics2D.drawLine(357, n6, 357, n2);
        graphics2D.drawLine(366, n6, 366, n2);
        graphics2D.drawLine(375, n6, 375, n2);
        graphics2D.drawLine(384, n6, 384, n2);
        graphics2D.drawLine(393, n6, 393, n2);
        graphics2D.drawLine(402, n6, 402, n2);
        graphics2D.drawLine(411, n6, 411, n2);
        graphics2D.drawLine(420, n6, 420, n2);
        graphics2D.drawLine(429, n6, 429, n2);
        graphics2D.drawRoundRect(10, n5, 430, n2 - n5 + 5, 5, 5);
        return n2;
    }

    private int o\u00d20000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = (n2 += 30) - 15;
        graphics2D.drawString("Nahkampfwaffe", 18, n2 - 2);
        graphics2D.drawString("TYP/eBE", 115, n2 - 2);
        graphics2D.drawString("DK", 160, n2 - 2);
        graphics2D.drawString("TP", 182, n2 - 2);
        graphics2D.drawString("TP/KK", 209, n2 - 2);
        graphics2D.drawString("INI", 244, n2 - 2);
        graphics2D.drawString("WM", 263, n2 - 2);
        graphics2D.drawString("AT", 285, n2 - 2);
        graphics2D.drawString("PA", 305, n2 - 2);
        graphics2D.drawString("TP", 331, n2 - 2);
        graphics2D.drawString("Bruchfaktor", 363, n2 - 2);
        int n4 = 15;
        int n5 = 435;
        int n6 = n2;
        graphics2D.drawLine(n4, n2, n5, n2);
        A[] aArray = new A[5];
        floatsuper floatsuper2 = new floatsuper((K)this.\u00f5\u00d40000);
        for (int i2 = 0; i2 < 5; ++i2) {
            n2 += 11;
            if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f8O0000(i2 + 1) != null) {
                aArray[i2] = this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d3O0000(i2 + 1).\u00d200000();
            }
            if (aArray[i2] != null) {
                graphics2D.setFont(this.o00000(8));
                String string = "";
                if (aArray[i2].nullString() != null && floatsuper2.\u00d200000(aArray[i2].nullString()) == floatsuper._o.\u00d400000) {
                    string = string + "X ";
                }
                string = string + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f8O0000(i2 + 1).OO0000();
                string = string + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d6O0000(i2);
                if (!aArray[i2].thisString().equals("")) {
                    string = string + " (" + aArray[i2].thisString() + ")";
                }
                if (aArray[i2].\u00d2\u00d50000()) {
                    string = string + " (i)";
                }
                if (aArray[i2].StringString()) {
                    string = string + " (A)";
                }
                if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d800000(i2 + 1) > 0) {
                    string = string + " (S" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d800000(i2 + 1) + ")";
                }
                graphics2D.drawString(string, 15, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d3O0000(i2 + 1).o00000().O\u00d80000() + " / " + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d3O0000(i2 + 1).o00000().superclass(), 115, n2 - 2);
                graphics2D.setFont(this.o00000(8));
                String string2 = "";
                for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : aArray[i2].\u00d8\u00d50000()) {
                    string2 = string2 + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d400000() + "";
                }
                graphics2D.drawString(string2, 162, n2 - 2);
                graphics2D.setFont(this.o00000(8));
                graphics2D.drawString(aArray[i2].\u00d500000().toString(), 180, n2 - 2);
                graphics2D.drawString(aArray[i2].\u00d200000().toString(), 213, n2 - 2);
                int n7 = aArray[i2].\u00d300000() + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).returnsuper(i2);
                graphics2D.drawString(this.new("" + n7), 245, n2 - 2);
                graphics2D.drawString(aArray[i2].String().toString(), 264, n2 - 2);
                graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).String(i2), 287, n2 - 2);
                try {
                    graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d200000(i2), 307, n2 - 2);
                }
                catch (B b) {
                    // empty catch block
                }
                String string3 = this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).o00000(i2, this.\u00f5\u00d40000);
                if (aArray[i2].StringString()) {
                    string3 = string3 + "(A)";
                }
                this.o00000(graphics2D, string3, 322, 357, n2 - 2);
                this.o00000(graphics2D, "" + aArray[i2].o00000().\u00d400000(), 357, 366, n2 - 2);
                this.o00000(graphics2D, "" + aArray[i2].o00000().\u00d300000(), 366, 375, n2 - 2);
            }
            graphics2D.drawLine(n4, n2, n5, n2);
        }
        graphics2D.drawLine(110, n6 - 8, 110, n2);
        graphics2D.drawLine(158, n6 - 8, 158, n2);
        graphics2D.drawLine(175, n6 - 8, 175, n2);
        graphics2D.drawLine(205, n6 - 8, 205, n2);
        graphics2D.drawLine(240, n6 - 8, 240, n2);
        graphics2D.drawLine(260, n6 - 8, 260, n2);
        graphics2D.drawLine(282, n6 - 8, 282, n2);
        graphics2D.drawLine(301, n6 - 8, 301, n2);
        graphics2D.drawLine(322, n6 - 8, 322, n2);
        graphics2D.drawLine(357, n6 - 8, 357, n2);
        graphics2D.drawLine(366, n6, 366, n2);
        graphics2D.drawLine(375, n6, 375, n2);
        graphics2D.drawLine(384, n6, 384, n2);
        graphics2D.drawLine(393, n6, 393, n2);
        graphics2D.drawLine(402, n6, 402, n2);
        graphics2D.drawLine(411, n6, 411, n2);
        graphics2D.drawLine(420, n6, 420, n2);
        graphics2D.drawLine(429, n6, 429, n2);
        graphics2D.drawRoundRect(10, n3, 430, n2 - n3 + 5, 5, 5);
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private void Oo0000(Graphics2D graphics2D) {
        int n = 103;
        int n2 = 35;
        int n3 = 412;
        int n4 = n;
        graphics2D.drawLine(n2, n, n3, n);
        A[] aArray = new A[5];
        floatsuper floatsuper2 = new floatsuper((K)this.\u00f5\u00d40000);
        for (int i2 = 0; i2 < 5; ++i2) {
            n += 11;
            if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f8O0000(i2 + 1) != null) {
                aArray[i2] = this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d3O0000(i2 + 1).\u00d200000();
            }
            if (aArray[i2] != null) {
                void object2;
                graphics2D.setFont(this.o00000(8));
                String string = "";
                if (aArray[i2].nullString() != null && floatsuper2.\u00d200000(aArray[i2].nullString()) == floatsuper._o.\u00d400000) {
                    string = string + "X ";
                }
                string = string + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f8O0000(i2 + 1).OO0000();
                string = string + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d6O0000(i2);
                if (!aArray[i2].thisString().equals("")) {
                    string = string + " (" + aArray[i2].thisString() + ")";
                }
                if (aArray[i2].StringString()) {
                    string = string + " (A)";
                }
                if (this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d800000(i2 + 1) > 0) {
                    string = string + " (S" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d800000(i2 + 1) + ")";
                }
                graphics2D.drawString(string, 35, n - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d3O0000(i2 + 1).o00000().O\u00d80000() + " / " + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d3O0000(i2 + 1).o00000().superclass(), 120, n - 2);
                graphics2D.setFont(this.o00000(8));
                String string2 = "";
                for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : aArray[i2].\u00d8\u00d50000()) {
                    string2 = string2 + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d400000() + "";
                }
                graphics2D.drawString(string2, 168, n - 2);
                graphics2D.setFont(this.o00000(8));
                graphics2D.drawString(aArray[i2].\u00d500000().toString(), 185, n - 2);
                graphics2D.drawString(aArray[i2].\u00d200000().toString(), 218, n - 2);
                graphics2D.drawString(this.new("" + aArray[i2].\u00d300000()), 250, n - 2);
                graphics2D.drawString(aArray[i2].String().toString(), 269, n - 2);
                graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).String(i2), 297, n - 2);
                try {
                    graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d200000(i2), 317, n - 2);
                }
                catch (B b) {
                    // empty catch block
                }
                String string3 = this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).o00000(i2, this.\u00f5\u00d40000);
                if (aArray[i2].StringString()) {
                    String string4 = string3 + "(A)";
                    graphics2D.setFont(this.o00000(6));
                }
                this.o00000(graphics2D, (String)object2, 328, 362, n - 2);
                graphics2D.setFont(this.o00000(8));
                graphics2D.drawString("" + aArray[i2].o00000().\u00d400000(), 362, n - 2);
                graphics2D.drawString("" + aArray[i2].o00000().\u00d300000(), 372, n - 2);
            }
            graphics2D.drawLine(n2, n, n3, n);
        }
        while (n < 150) {
            graphics2D.drawLine(n2, n += 11, n3, n);
        }
        graphics2D.drawLine(117, n4 - 8, 117, n);
        graphics2D.drawLine(163, n4 - 8, 163, n);
        graphics2D.drawLine(180, n4 - 8, 180, n);
        graphics2D.drawLine(212, n4 - 8, 212, n);
        graphics2D.drawLine(245, n4 - 8, 245, n);
        graphics2D.drawLine(265, n4 - 8, 265, n);
        graphics2D.drawLine(292, n4 - 8, 292, n);
        graphics2D.drawLine(312, n4 - 8, 312, n);
        graphics2D.drawLine(334, n4 - 8, 334, n);
        graphics2D.drawLine(360, n4 - 8, 360, n);
        graphics2D.drawLine(369, n4, 369, n);
        graphics2D.drawLine(378, n4, 378, n);
        graphics2D.drawLine(387, n4, 387, n);
        graphics2D.drawLine(396, n4, 396, n);
        graphics2D.drawLine(405, n4, 405, n);
        n = 169;
        graphics2D.drawLine(n2, n, n3, n);
        graphics2D.drawLine(n2, n + 11, n3, n + 11);
        graphics2D.setFont(this.o00000(8));
        String string = "";
        int n5 = 117;
        int n6 = n3 - (n2 + 83);
        for (P p2 : this.\u00f5\u00d40000.\u00f5O0000()) {
            if (p2.\u00d400000() != 2 || p2.toString().equals(while.\u00f50o000.toString()) || p2.toString().equals(while.thisforString.toString()) || p2.toString().equals(while.iffloatObject.toString()) || p2.toString().equals(while.\u00d2\u00d6\u00d6000.toString()) || p2.toString().equals(while.returnfloatObject.toString()) || p2.toString().equals(while.\u00d5\u00d4\u00d4000.toString()) || p2.toString().equals(while.\u00d8\u00d3\u00d2000.toString()) || p2.toString().equals(while.\u00d6\u00d3\u00d2000.toString()) || p2.toString().equals(while.\u00d5\u00d3\u00d2000.toString()) || p2.toString().equals(while.\u00f5\u00f4\u00d5000.toString()) || p2.toString().equals(while.\u00d8\u00f4\u00d5000.toString()) || p2.toString().equals(while.\u00f8\u00d3\u00d8000.toString()) || p2.toString().equals(while.\u00f6\u00d3\u00d8000.toString())) continue;
            int n7 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth();
            int n8 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(p2.toString() + ";  ", graphics2D).getWidth();
            if ((n7 = n7 + 3 + n8) < n6) {
                string = string + p2.toString() + ";  ";
                continue;
            }
            graphics2D.drawString(string, n5, n - 2);
            string = p2.toString() + ";  ";
            n += 11;
            n6 = n3 - n2;
            n5 = n2;
        }
        graphics2D.drawString(string, n5, n - 2);
    }

    private void \u00d400000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        int n = this.\u00d3o0000(graphics2D);
        n = this.o\u00d20000(graphics2D, n);
        n = this.forsuper(graphics2D, n);
        n = this.\u00f8o0000(graphics2D, n);
        n = this.\u00f5o0000(graphics2D, n);
        n = this.\u00d8o0000(graphics2D, n);
        int n2 = this.\u00d5o0000(graphics2D, n);
        n = this.newnew(graphics2D, n2);
        this.privatesuper(graphics2D, n);
        n = this.O\u00d20000(graphics2D, n2);
        this.\u00f4o0000(graphics2D, n);
    }

    private int \u00d5o0000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 35) - 9;
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawLine(n3, n2 += 11, n4, n2);
        graphics2D.drawLine(n3, n2 += 11, n4, n2);
        n2 += 9;
        graphics2D.setFont(this.o00000(12));
        String string = "R\u00fcstung nach Trefferzonen";
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d40000.\u00f4o0000()).isZonenRuestung()) {
            string = string + " (aktiv)";
        }
        graphics2D.drawString(string, n3, n5 - 2);
        graphics2D.setFont(this.o00000(8));
        int n6 = n2 - 22;
        int n7 = n3 + 65;
        helden.framework.E.C.B b = this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000();
        if (b != null) {
            graphics2D.drawString("Werte", n3, n6);
            graphics2D.drawString("" + b.\u00f8O0000(), n7, n6);
            graphics2D.drawString("" + b.\u00f800000(), n7 += 28, n6);
            graphics2D.drawString("" + b.newsuper(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00f6O0000(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00d6O0000(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00d8O0000(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00f500000(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00d5O0000(), n7 += 28, n6);
            graphics2D.drawString("" + b.oO0000(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00d2O0000(), n7 += 28, n6);
            graphics2D.drawString("" + b.\u00f600000(), n7 += 28, n6);
            graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d600000(), n7 += 28, n6);
            n7 += 28;
            n7 += 28;
        }
        n6 += 11;
        n7 = n3 + 65;
        n6 += 11;
        n7 = n3 + 65;
        graphics2D.setFont(this.o00000(9));
        int n8 = n3 + 60;
        graphics2D.drawString("Name", n3, n5 + 8);
        graphics2D.drawLine(n8, n2, n8, n5);
        graphics2D.drawString("Ko", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("Br", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("R\u00fc", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("Ba", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("LA", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("RA", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("LB", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("RB", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("Ges.", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("gRS", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("gBE", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("Gew", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 28, n2, n8, n5);
        graphics2D.drawString("Preis", n8 + 2, n5 + 8);
        n8 += 28;
        graphics2D.drawRoundRect(10, n2 - 55, 430, 60, 5, 5);
        graphics2D.setFont(this.o00000(8));
        int n9 = n2 += 25;
        int n10 = n2 - 15;
        F[] fArray = new F[]{this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(1), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(2), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(3), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(4), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(5)};
        for (int i2 = 0; i2 < 5; ++i2) {
            graphics2D.drawLine(n3, n2, n3 + 130, n2);
            n2 += 11;
            if (fArray[i2] == null) continue;
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[i2].OO0000(), 15, n2 - 2);
            helden.framework.E.C.B b2 = (helden.framework.E.C.B)fArray[i2].o00000(helden.framework.E.B.OO0000, 0);
            if (b2 == null) continue;
            if (b2.\u00d3O0000()) {
                graphics2D.drawString(this.new("*"), 114, n2 - 2);
                graphics2D.drawString(this.new("*"), 133, n2 - 2);
                continue;
            }
            graphics2D.drawString(this.new("" + b2.\u00d2O0000()), 114, n2 - 2);
            graphics2D.drawString(this.new("" + b2.\u00f600000()), 133, n2 - 2);
        }
        graphics2D.drawLine(n3, n2, n3 + 130, n2);
        graphics2D.drawString("Summe:", n3 + 60, (n2 += 11) - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).for()), 114, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d300000()), 133, n2 - 2);
        string = "R\u00fcstungsst\u00fcck";
        if (!Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d40000.\u00f4o0000()).isZonenRuestung()) {
            string = string + " (aktiv)";
        }
        graphics2D.drawString(string, n3 + 2, n9 - 2);
        graphics2D.drawString("RS", 114, n9 - 2);
        graphics2D.drawString("BE", 132, n9 - 2);
        graphics2D.drawLine(111, n9 - 8, 111, n2);
        graphics2D.drawLine(129, n9 - 8, 129, n2);
        graphics2D.drawRoundRect(10, n10, 140, n2 - n10 + 5, 5, 5);
        graphics2D.drawRoundRect(5, 5, 440, 660, 5, 5);
        return n9;
    }

    private void nullsuper(Graphics2D graphics2D) {
        F[] fArray;
        int n;
        int n2 = 35;
        int n3 = n = 378;
        F[] fArray2 = new F[]{this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f5O0000(1), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f5O0000(2)};
        graphics2D.drawLine(n2, n, n2 + 253, n);
        n += 10;
        if (fArray2[0] != null) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray2[0].OO0000(), 35, n - 2);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f600000(1).substring(0, 6), 120, n - 2);
            fArray = (F[])fArray2[0].o00000(helden.framework.E.B.\u00d300000, 0);
            if (fArray != null) {
                graphics2D.drawString(this.new("" + fArray.nullnew()), 160, n - 2);
                graphics2D.drawString(fArray.\u00f5\u00d20000().toString(), 185, n - 2);
                graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d600000(0)), 215, n - 2);
                graphics2D.drawString("" + fArray.\u00d8\u00d20000().\u00d400000(), 233, n - 2);
                graphics2D.drawString("" + fArray.\u00d8\u00d20000().\u00d300000(), 243, n - 2);
            }
        }
        graphics2D.drawLine(n2, n, n2 + 253, n);
        n += 10;
        if (fArray2[1] != null) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray2[1].OO0000(), 35, n - 2);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f600000(2).substring(0, 6), 120, n - 2);
            fArray = (void)fArray2[1].o00000(helden.framework.E.B.\u00d300000, 0);
            if (fArray != null) {
                graphics2D.drawString(this.new("" + fArray.nullnew()), 160, n - 2);
                graphics2D.drawString(fArray.\u00f5\u00d20000().toString(), 185, n - 2);
                graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d600000(1)), 215, n - 2);
                graphics2D.drawString("" + fArray.\u00d8\u00d20000().\u00d400000(), 233, n - 2);
                graphics2D.drawString("" + fArray.\u00d8\u00d20000().\u00d300000(), 243, n - 2);
            }
        }
        graphics2D.drawLine(n2, n, n2 + 253, n);
        graphics2D.drawLine(117, n3 - 8, 117, n);
        graphics2D.drawLine(150, n3 - 8, 150, n);
        graphics2D.drawLine(178, n3 - 8, 178, n);
        graphics2D.drawLine(208, n3 - 8, 208, n);
        graphics2D.drawLine(230, n3 - 8, 230, n);
        graphics2D.drawLine(240, n3, 240, n);
        graphics2D.drawLine(250, n3, 250, n);
        graphics2D.drawLine(260, n3, 260, n);
        graphics2D.drawLine(270, n3, 270, n);
        graphics2D.drawLine(280, n3, 280, n);
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.\u00d3\u00d30000().\u00d600000()), 160, 458);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d300000()), 190, 458);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d500000()), 249, 462);
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d2O0000(), 275, 458);
        graphics2D.setFont(this.o00000(8));
        n3 = n = 443;
        fArray = new F[]{this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(1), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(2), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(3), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(4), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000(5)};
        if (!Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d40000.\u00f4o0000()).isZonenRuestung()) {
            graphics2D.drawString("(aktiv)", 88, n - 3);
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            graphics2D.drawLine(n2, n, n2 + 110, n);
            n += 11;
            if (fArray[i2] == null) continue;
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[i2].OO0000(), 35, n - 2);
            helden.framework.E.C.B b = (helden.framework.E.C.B)fArray[i2].o00000(helden.framework.E.B.OO0000, 0);
            if (b == null) continue;
            if (b.\u00d3O0000()) {
                graphics2D.drawString(this.new("*"), 114, n - 2);
                graphics2D.drawString(this.new("*"), 133, n - 2);
                continue;
            }
            graphics2D.drawString(this.new("" + b.\u00d2O0000()), 114, n - 2);
            graphics2D.drawString(this.new("" + b.\u00f600000()), 133, n - 2);
        }
        graphics2D.drawLine(n2, n, n2 + 110, n);
        graphics2D.drawLine(n2, n += 11, n2 + 110, n);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).for()), 114, n - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d300000()), 133, n - 2);
        graphics2D.drawLine(111, n3 - 8, 111, n);
        graphics2D.drawLine(129, n3 - 8, 129, n + 10);
    }

    private int forsuper(Graphics2D graphics2D, int n) {
        String[] stringArray;
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 25) - 15;
        graphics2D.setFont(this.o00000(8));
        String string = "";
        Iterator<P> iterator = this.\u00f5\u00d40000.\u00f5O0000().iterator();
        StringBuilder stringBuilder = new StringBuilder("Sonderfertigkeiten: ");
        while (iterator.hasNext()) {
            stringArray = iterator.next();
            if (!stringArray.\u00f400000()) continue;
            stringBuilder.append(stringArray.toString());
            stringBuilder.append("; ");
        }
        stringArray = stringBuilder.toString().split(" ");
        String string2 = string;
        for (String string3 : stringArray) {
            if (this.o00000(string2 = string2 + string3 + " ", graphics2D) < (float)(n4 - n3)) {
                string = string2;
                continue;
            }
            graphics2D.drawString(string, n3, n2 - 1);
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 10;
            string = string2 = string3 + " ";
        }
        graphics2D.drawString(string, n3, n2 - 2);
        graphics2D.drawRoundRect(10, n5, 430, n2 - n5 + 5, 5, 5);
        return n2;
    }

    private void forsuper(Graphics2D graphics2D) {
        if (this.\u00f5\u00d40000.new(while.iffloatObject.toString())) {
            graphics2D.drawString("x", 210, 448);
        }
        if (this.\u00f5\u00d40000.new(while.\u00d2\u00d6\u00d6000.toString())) {
            graphics2D.drawString("x", 210, 453);
        }
        if (this.\u00f5\u00d40000.new(while.returnfloatObject.toString())) {
            graphics2D.drawString("x", 210, 458);
        }
        if (this.\u00f5\u00d40000.new(while.\u00d5\u00d4\u00d4000.toString())) {
            graphics2D.drawString("x", 37, 407);
        }
        if (this.\u00f5\u00d40000.new(while.\u00d8\u00d3\u00d2000.toString())) {
            graphics2D.drawString("x", 92, 517);
        }
        if (this.\u00f5\u00d40000.new(while.\u00d6\u00d3\u00d2000.toString())) {
            graphics2D.drawString("x", 103, 517);
        }
        if (this.\u00f5\u00d40000.new(while.\u00d5\u00d3\u00d2000.toString())) {
            graphics2D.drawString("x", 115, 517);
        }
        if (this.\u00f5\u00d40000.new(while.\u00f5\u00f4\u00d5000.toString())) {
            graphics2D.drawString("x", 102, 407);
        }
        if (this.\u00f5\u00d40000.new(while.\u00d8\u00f4\u00d5000.toString())) {
            graphics2D.drawString("x", 175, 407);
        }
        if (this.\u00f5\u00d40000.new(while.\u00f8\u00d3\u00d8000.toString())) {
            graphics2D.drawString("x", 218, 407);
        }
        if (this.\u00f5\u00d40000.new(while.\u00f6\u00d3\u00d8000.toString())) {
            graphics2D.drawString("x", 267, 407);
        }
    }

    private void \u00f4o0000(Graphics2D graphics2D) {
        int n = 35;
        int n2 = 290;
        int n3 = n2 - 10;
        int n4 = n + 253;
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawLine(n, n2, n + 253, n2);
        graphics2D.drawString("Raufen", n, (n2 += 10) - 2);
        graphics2D.drawString("10/3", 130, n2 - 2);
        graphics2D.drawString("+0", 170, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f6O0000()), 200, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d800000()), 230, n2 - 2);
        graphics2D.drawLine(n, n2, n + 253, n2);
        graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).null(), 253, n2 - 2);
        n2 += 10;
        if (this.\u00f5\u00d40000.\u00f8O0000().\u00d300000(E.newnewString)) {
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d5O0000()), 200, n2 - 2);
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).String()), 230, n2 - 2);
            graphics2D.drawString("Ringen", n, n2 - 2);
            graphics2D.drawString("10/3", 130, n2 - 2);
            graphics2D.drawString("+0", 170, n2 - 2);
            graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f600000(), 253, n2 - 2);
        }
        graphics2D.drawLine(n, n2, n + 253, n2);
        graphics2D.drawLine(122, n3, 122, n2);
        graphics2D.drawLine(155, n3, 155, n2);
        graphics2D.drawLine(190, n3, 190, n2);
        graphics2D.drawLine(220, n3, 220, n2);
        graphics2D.drawLine(250, n3, 250, n2);
        String string = "";
        int n5 = 117;
        int n6 = n4 - (83 + n);
        Iterator<P> iterator = this.\u00f5\u00d40000.\u00f5O0000().iterator();
        graphics2D.drawLine(n, n2 += 13, n + 253, n2);
        graphics2D.drawLine(n, n2 + 10, n + 253, n2 + 10);
        while (iterator.hasNext()) {
            P p2 = iterator.next();
            if (p2.\u00d400000() != 9) continue;
            int n7 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth();
            int n8 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(p2.toString() + ";  ", graphics2D).getWidth();
            if ((n7 = n7 + 3 + n8) < n6) {
                string = string + p2.toString() + ";  ";
                continue;
            }
            graphics2D.drawString(string, n5, n2 - 2);
            string = p2.toString() + ";  ";
            n2 += 11;
            n6 = n4 - n;
            n5 = n;
        }
        graphics2D.drawString(string, n5, n2 - 2);
    }

    private int \u00f5o0000(Graphics2D graphics2D, int n) {
        void void_;
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        graphics2D.setFont(this.o00000(9));
        int n5 = (n2 += 25) - 16;
        int n6 = n2 - 10;
        graphics2D.drawString("Waffenloser Kampf", n3 + 2, n2 - 2);
        graphics2D.drawString("TP/KK", 125, n2 - 2);
        graphics2D.drawString("INI", 168, n2 - 2);
        graphics2D.drawString("AT", 198, n2 - 2);
        graphics2D.drawString("PA", 228, n2 - 2);
        graphics2D.drawString("TP(A)", 253, n2 - 2);
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.drawString("Man\u00f6ver:", n3 + 275, n2 - 2);
        graphics2D.drawLine(n3 + 273, n2, n4, n2);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Raufen", n3, (n2 += 10) - 2);
        graphics2D.drawString("10/3", 130, n2 - 2);
        graphics2D.drawString("+0", 170, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f6O0000()), 200, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d800000()), 230, n2 - 2);
        graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).null(), 253, n2 - 2);
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.drawLine(n3 + 273, n2, n4, n2);
        n2 += 10;
        if (this.\u00f5\u00d40000.\u00f8O0000().\u00d300000(E.newnewString)) {
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d5O0000()), 200, n2 - 2);
            graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).String()), 230, n2 - 2);
            graphics2D.drawString("Ringen", n3, n2 - 2);
            graphics2D.drawString("10/3", 130, n2 - 2);
            graphics2D.drawString("+0", 170, n2 - 2);
            graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f600000(), 253, n2 - 2);
        }
        graphics2D.drawLine(n3 + 273, n2, n4, n2);
        graphics2D.drawLine(122, n6, 122, n2);
        graphics2D.drawLine(155, n6, 155, n2);
        graphics2D.drawLine(190, n6, 190, n2);
        graphics2D.drawLine(220, n6, 220, n2);
        graphics2D.drawLine(250, n6, 250, n2);
        graphics2D.drawRoundRect(10, n5, 270, n2 - n5 + 4, 5, 5);
        graphics2D.drawLine(n3 + 273, n2 += 9, n4, n2);
        int n7 = (n2 += 10) - 15;
        F[] fArray = new F[]{this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f5O0000(1), this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f5O0000(2)};
        graphics2D.drawString("Schild", n3 + 2, n2 - 2);
        graphics2D.drawString("Typ", 112, n2 - 2);
        graphics2D.drawString("INI", 159, n2 - 2);
        graphics2D.drawString("WM", 184, n2 - 2);
        graphics2D.drawString("PA", 214, n2 - 2);
        graphics2D.drawString("Bruchfaktor", 233, n2 - 2);
        n6 = n2;
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.drawLine(n3 + 273, n2, n4, n2);
        n2 += 10;
        if (fArray[0] != null) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[0].OO0000(), 15, n2 - 2);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f600000(1).substring(0, 6), 110, n2 - 2);
            void_ = (void)fArray[0].o00000(helden.framework.E.B.\u00d300000, 0);
            if (void_ != null) {
                graphics2D.drawString(this.new("" + void_.nullnew()), 160, n2 - 2);
                graphics2D.drawString(void_.\u00f5\u00d20000().toString(), 185, n2 - 2);
                graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d600000(0)), 215, n2 - 2);
                graphics2D.drawString("" + void_.\u00d8\u00d20000().\u00d400000(), 233, n2 - 2);
                graphics2D.drawString("" + void_.\u00d8\u00d20000().\u00d400000(), 243, n2 - 2);
            }
        }
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.drawLine(n3 + 273, n2, n4, n2);
        n2 += 10;
        if (fArray[1] != null) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[1].OO0000(), 15, n2 - 2);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f600000(2).substring(0, 6), 110, n2 - 2);
            void_ = (void)fArray[1].o00000(helden.framework.E.B.\u00d300000, 0);
            if (void_ != null) {
                graphics2D.drawString(this.new("" + void_.nullnew()), 160, n2 - 2);
                graphics2D.drawString(void_.\u00f5\u00d20000().toString(), 185, n2 - 2);
                graphics2D.drawString(this.new("" + this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00d600000(1)), 215, n2 - 2);
                graphics2D.drawString("" + void_.\u00d8\u00d20000().\u00d400000(), 233, n2 - 2);
                graphics2D.drawString("" + void_.\u00d8\u00d20000().\u00d400000(), 243, n2 - 2);
            }
        }
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.drawLine(n3 + 273, n2, n4, n2);
        graphics2D.drawLine(102, n6 - 8, 102, n2);
        graphics2D.drawLine(152, n6 - 8, 152, n2);
        graphics2D.drawLine(178, n6 - 8, 178, n2);
        graphics2D.drawLine(208, n6 - 8, 208, n2);
        graphics2D.drawLine(230, n6 - 8, 230, n2);
        graphics2D.drawLine(240, n6, 240, n2);
        graphics2D.drawLine(250, n6, 250, n2);
        graphics2D.drawLine(260, n6, 260, n2);
        graphics2D.drawLine(270, n6, 270, n2);
        graphics2D.drawRoundRect(10, n7 + 4, 270, (n2 += 2) - n7 + 1, 5, 5);
        graphics2D.drawRoundRect(283, n5, 157, n2 - n5 + 5, 5, 5);
        return n2;
    }

    private void privatesuper(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 160;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Wunden", n3, (n2 += 22) - 2);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(AT,PA,GE,INI)-2, GS-1", n3 + 45, n2 - 2);
        graphics2D.drawOval(n3 + 2, n2 + 2, 12, 12);
        graphics2D.drawOval(n3 + 18, n2 + 2, 12, 12);
        graphics2D.drawOval(n3 + 34, n2 + 2, 12, 12);
        graphics2D.drawOval(n3 + 50, n2 + 2, 12, 12);
        graphics2D.drawOval(n3 + 66, n2 + 2, 12, 12);
        graphics2D.drawOval(n3 + 82, n2 + 2, 12, 12);
        graphics2D.drawOval(n3 + 98, n2 + 2, 12, 12);
        graphics2D.drawRoundRect(n3 - 5, (n2 += 18) - 31, 125, 32, 5, 5);
    }

    private int O\u00d20000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = n;
        int n4 = 435;
        int n5 = 290;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Links", n5 + 40, n2 - 2);
        graphics2D.drawString("Rechts", n5 + 93, n2 - 2);
        graphics2D.drawLine(n5, n2, n4, n2);
        graphics2D.drawString("Beine", n5 + 2, (n2 += 13) - 2);
        graphics2D.drawLine(n5, n2, n4, n2);
        graphics2D.drawOval(n5 + 45, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 57, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 69, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 102, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 114, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 126, n2 - 11, 8, 8);
        graphics2D.drawString("Arme", n5 + 2, (n2 += 13) - 2);
        graphics2D.drawLine(n5, n2, n4, n2);
        graphics2D.drawLine(n5 + 88, n3 - 8, n5 + 88, n2);
        graphics2D.drawOval(n5 + 45, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 57, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 69, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 102, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 114, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 126, n2 - 11, 8, 8);
        graphics2D.drawString("H\u00fcfte", n5 + 2, (n2 += 13) - 2);
        graphics2D.drawLine(n5, n2, n4, n2);
        graphics2D.drawOval(n5 + 72, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 84, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 96, n2 - 11, 8, 8);
        graphics2D.drawString("Brust", n5 + 2, (n2 += 13) - 2);
        graphics2D.drawLine(n5, n2, n4, n2);
        graphics2D.drawOval(n5 + 72, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 84, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 96, n2 - 11, 8, 8);
        graphics2D.drawString("Kopf", n5 + 2, (n2 += 13) - 2);
        graphics2D.drawOval(n5 + 72, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 84, n2 - 11, 8, 8);
        graphics2D.drawOval(n5 + 96, n2 - 11, 8, 8);
        graphics2D.drawLine(n5 + 35, n3 - 8, n5 + 35, n2);
        graphics2D.drawRoundRect(n5 - 5, n3 - 15, 155, n2 - n3 + 21, 5, 5);
        return n2;
    }

    private void \u00d8o0000(Graphics2D graphics2D) {
        helden.framework.E.C.B b = this.\u00f5\u00d40000.o00000(this.\u00f6\u00d40000).\u00f800000();
        graphics2D.setFont(this.o00000(10));
        if (b != null) {
            graphics2D.drawString("" + b.\u00f8O0000(), 363, 314);
            graphics2D.drawString("" + b.\u00f800000(), 353, 354);
            graphics2D.drawString("" + b.newsuper(), 367, 354);
            graphics2D.drawString("" + b.oO0000(), 318, 310);
            graphics2D.drawString("" + b.\u00f6O0000(), 355, 408);
            graphics2D.drawString("" + b.\u00d6O0000(), 410, 404);
            graphics2D.drawString("" + b.\u00d8O0000(), 303, 395);
            graphics2D.drawString("" + b.\u00f500000(), 395, 500);
            graphics2D.drawString("" + b.\u00d5O0000(), 335, 500);
            graphics2D.drawString("" + b.\u00f600000(), 372, 520);
        }
        graphics2D.setFont(this.o00000(8));
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d40000.\u00f4o0000()).isZonenRuestung()) {
            graphics2D.drawString("(aktiv)", 355, 505);
        }
    }

    private void \u00f4o0000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        graphics2D.drawString("Ausr\u00fcstung, Zubeh\u00f6r und Werkzeuge", n3 + 2, n2 += 23);
        graphics2D.drawRoundRect(10, n2 - 13, 430, 670 - n2 + 3, 5, 5);
        n2 += 12;
        while (n2 < 650) {
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 12;
        }
    }
}

