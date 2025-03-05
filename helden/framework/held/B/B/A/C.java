/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.A;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.E.C.A;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Einstellungen;
import helden.framework.OoOO.E;
import helden.framework.d.oooo.a_0;
import helden.framework.held.B;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.OoOO.M;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends G {
    private int \u00d2o0000;

    public C(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00d6O0000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d2o0000 = n;
        if (this.\u00d2o0000 == 0 && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(0).\u00d3O0000() && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(0).o00000()) {
            ++this.\u00d2o0000;
        }
        if (this.\u00d2o0000 == 1 && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(1).\u00d3O0000() && !oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(1).o00000()) {
            ++this.\u00d2o0000;
        }
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.o00000(graphics2D);
        int n = this.\u00d300000(graphics2D);
        n = this.return(graphics2D, n);
        int n2 = n = this.\u00f500000(graphics2D, n);
        n = this.\u00d500000(graphics2D, n);
        this.\u00f400000(graphics2D, n2);
        this.o00000(graphics2D, n2);
        int n3 = n = this.\u00d800000(graphics2D, n);
        n = this.\u00d400000(graphics2D, n);
        n = this.new(graphics2D, n3 + 25);
        n = this.\u00d300000(graphics2D, n);
        if (!this.return()) {
            graphics2D.drawRoundRect(5, 5, 440, 660, 5, 5);
        }
        this.new(graphics2D);
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isDrucken(this.new())) {
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                arrayList.add(new C(this.\u00d6O0000, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        int n = 0;
        if (this.\u00d6O0000.o00000(0).\u00d3O0000() || this.\u00d6O0000.o00000(0).o00000()) {
            ++n;
        }
        if (this.\u00d6O0000.o00000(1).\u00d3O0000() || this.\u00d6O0000.o00000(1).o00000()) {
            ++n;
        }
        if (this.\u00d6O0000.o00000(2).\u00d3O0000() || this.\u00d6O0000.o00000(2).o00000()) {
            ++n;
        }
        if (n == 0) {
            n = 1;
        }
        return n;
    }

    @Override
    public String \u00f400000() {
        return "KampfbogenN " + (this.\u00d2o0000 + 1);
    }

    @Override
    public boolean \u00d300000() {
        return true;
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private int \u00d800000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 25) - 15;
        int n6 = n2 - 10;
        this.o00000(graphics2D, 10, 326, 430, 20, 5, 5);
        this.o00000(graphics2D, 10, n5, 430, 315 - n5 + 5, 5, 5);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawString("Wundschwelle: " + this.\u00d6O0000.o00000(b_0.\u00d5\u00f5\u00d2000), n3 + 2, n2 - 2);
        graphics2D.drawString("Max", 101, n2 - 2);
        this.o00000(graphics2D, "1/2", 121, 139, n2 - 2);
        this.o00000(graphics2D, "1/3", 139, 157, n2 - 2);
        this.o00000(graphics2D, "1/4", 157, 175, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Lebensenergie", n3 + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().OO0000()), 104, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().OO0000() / 2), 126, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().OO0000() / 3), 144, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().OO0000() / 4), 163, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawString("Ausdauer", n3 + 2, (n2 += 11) - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d2O0000()), 104, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d2O0000() / 2), 126, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d2O0000() / 3), 144, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d2O0000() / 4), 163, n2 - 2);
        graphics2D.drawLine(95, n6, 95, n2);
        graphics2D.drawLine(121, n6, 121, n2);
        graphics2D.drawLine(139, n6, 139, n2);
        graphics2D.drawLine(157, n6, 157, n2);
        graphics2D.drawLine(175, n6, 175, n2);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawString("Astralenergie", n3 + 2, (n2 += 13) - 2);
        if (this.\u00d6O0000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface()), 104, n2 - 2);
        }
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawString("Karmaenergie", n3 + 2, (n2 += 9) - 2);
        if (this.\u00d6O0000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d3O0000()), 104, n2 - 2);
        }
        graphics2D.drawLine(95, n6, 95, n2);
        graphics2D.drawLine(121, n6, 121, n2);
        graphics2D.drawLine(65, (n2 += 25) - 9, 65, n2 - 1);
        graphics2D.drawString("Initiative " + this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).private()), n3, n2 - 2);
        graphics2D.drawString("INI-Basis - BE =", 70, n2 - 2);
        graphics2D.drawLine(125, n2, 145, n2);
        if (this.\u00d6O0000.o00000(this.\u00d2o0000).newsuper()) {
            graphics2D.drawString("+MOD + 2 W6 =", 150, n2 - 2);
        } else {
            graphics2D.drawString("+MOD + W6 =", 150, n2 - 2);
        }
        graphics2D.drawLine(200, n2, 220, n2);
        graphics2D.drawLine(225, n2 - 9, 225, n2 - 1);
        return n2;
    }

    private int \u00f400000(Graphics2D graphics2D, int n) {
        int n2 = n + 25;
        int n3 = 145;
        graphics2D.setFont(this.o00000(8));
        int n4 = n2 - 16;
        int n5 = n3 + 145;
        this.o00000(graphics2D, n5 - 5, n4, 155, 49, 5, 5);
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
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(b_0.ifwhilesuper)), n5 + 4, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d300000()), n5 + 36, n2 - 2);
        int n6 = 0;
        if (this.\u00d6O0000.new(while.iffloatObject.toString())) {
            n6 += 3;
            if (this.\u00d6O0000.new(while.\u00d2\u00d6\u00d6000.toString())) {
                n6 += 3;
                if (this.\u00d6O0000.new(while.returnfloatObject.toString())) {
                    n6 += 3;
                }
            }
        }
        graphics2D.drawString("" + (n6 += this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d500000()), n5 + 67, n2 - 2);
        graphics2D.drawString("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d2O0000(), n5 + 98, n2 - 2);
        graphics2D.drawLine(n5 + 2, n2, n5 + 20, n2);
        graphics2D.drawLine(n5 + 35, n2, n5 + 50, n2);
        graphics2D.drawLine(n5 + 60, n2, n5 + 80, n2);
        graphics2D.drawLine(n5 + 95, n2, n5 + 115, n2);
        return n2;
    }

    private int \u00d300000(Graphics2D graphics2D) {
        this.o00000(graphics2D, 20, 10, 410, 15, 5, 5);
        graphics2D.setFont(this.o00000(9));
        int n = 20;
        String string = "Attacke-Basiswert: " + this.\u00d6O0000.\u00d3\u00d30000().int() + "  " + "Parade-Basiswert: " + this.\u00d6O0000.\u00d3\u00d30000().\u00d600000() + "  " + "Fernkampf-Basiswert: " + this.\u00d6O0000.\u00d3\u00d30000().\u00f600000() + "  " + "Initiative-Basiswert: " + this.\u00d6O0000.o00000(this.\u00d2o0000).private() + "  " + "GS:" + this.\u00d6O0000.o00000(this.\u00d2o0000).returnsuper() + "  " + "BE:" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d300000() + "  ";
        this.o00000(graphics2D, string, 25, 425, n, 9);
        return n;
    }

    private int \u00f500000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        graphics2D.setFont(this.o00000(9));
        int n5 = (n2 += 24) - 15;
        this.o00000(graphics2D, 10, n5, 430, 162 - n5 + 5, 5, 5);
        graphics2D.drawString("Fernkampfwaffe", 18, n2 - 2);
        graphics2D.drawString("TYP/eBE", 110, n2 - 2);
        graphics2D.drawString("TP", 162, n2 - 2);
        graphics2D.drawString("Entfernung", 190, n2 - 2);
        graphics2D.drawString("TP/Entfernung", 253, n2 - 2);
        this.o00000(graphics2D, "FK", 315, 339, n2 - 2);
        graphics2D.drawString("Anzahl Geschosse", 342, n2 - 2);
        graphics2D.drawLine(n3, n2, n4, n2);
        int n6 = n2;
        F[] fArray = new F[]{this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d500000(1), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d500000(2), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d500000(3)};
        for (int i2 = 0; i2 < 3; ++i2) {
            graphics2D.setFont(this.o00000(8));
            n2 += 11;
            if (fArray[i2] != null) {
                graphics2D.setFont(this.o00000(8));
                helden.framework.E.C.E e = (helden.framework.E.C.E)fArray[i2].o00000(helden.framework.E.B.class, 0);
                String string = fArray[i2].OO0000();
                if (this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f6O0000(i2 + 1)) {
                    string = string + " (J)";
                }
                if (e.thisnew()) {
                    string = string + " (i)";
                }
                graphics2D.drawString(string, 15, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                if (e != null) {
                    this.o00000(graphics2D, this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f500000(i2 + 1).super().O\u00d80000() + " / " + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f500000(i2 + 1).super().superclass(), 107, 150, n2 - 2, 7);
                    graphics2D.setFont(this.o00000(8));
                    this.o00000(graphics2D, this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d8O0000(i2), 150, 185, n2 - 2, 8);
                    graphics2D.setFont(this.o00000(6));
                    this.o00000(graphics2D, this.\u00d6O0000.o00000(this.\u00d2o0000).newsuper(i2), 185, 248, n2 - 2, 8);
                    graphics2D.setFont(this.o00000(7));
                    this.o00000(graphics2D, e.\u00f6o0000().toString(), 248, 317, n2 - 2, 8);
                    this.o00000(graphics2D, this.\u00d6O0000.o00000(this.\u00d2o0000).null(i2) + "", 317, 339, n2 - 2, 8);
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
        return n2;
    }

    private int return(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = (n2 += 30) - 15;
        this.o00000(graphics2D, 10, n3, 430, 105 - n3 + 5, 5, 5);
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
        floatsuper floatsuper2 = new floatsuper((K)this.\u00d6O0000);
        for (int i2 = 0; i2 < 5; ++i2) {
            n2 += 11;
            if (this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f8O0000(i2 + 1) != null) {
                aArray[i2] = this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d3O0000(i2 + 1).\u00d200000();
            }
            if (aArray[i2] != null) {
                graphics2D.setFont(this.o00000(8));
                String string = "";
                if (aArray[i2].nullString() != null && floatsuper2.\u00d200000(aArray[i2].nullString()) == floatsuper._o.\u00d400000) {
                    string = string + "X ";
                }
                string = string + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f8O0000(i2 + 1).OO0000();
                string = string + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d6O0000(i2);
                if (!aArray[i2].thisString().equals("")) {
                    string = string + " (" + aArray[i2].thisString() + ")";
                }
                if (aArray[i2].\u00d2\u00d50000()) {
                    string = string + " (i)";
                }
                if (aArray[i2].StringString()) {
                    string = string + " (A)";
                }
                if (this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d800000(i2 + 1) > 0) {
                    string = string + " (S" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d800000(i2 + 1) + ")";
                }
                graphics2D.drawString(string, 15, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                this.o00000(graphics2D, this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d3O0000(i2 + 1).o00000().O\u00d80000() + " / " + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d3O0000(i2 + 1).o00000().superclass(), 110, 158, n2 - 2, 7);
                graphics2D.setFont(this.o00000(8));
                String string2 = "";
                for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : aArray[i2].\u00d8\u00d50000()) {
                    string2 = string2 + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d400000() + "";
                }
                this.o00000(graphics2D, string2, 158, 175, n2 - 2);
                graphics2D.setFont(this.o00000(8));
                this.o00000(graphics2D, aArray[i2].\u00d500000().toString(), 175, 205, n2 - 2, 8);
                this.o00000(graphics2D, aArray[i2].\u00d200000().toString(), 205, 240, n2 - 2, 8);
                int n7 = aArray[i2].\u00d300000() + this.\u00d6O0000.o00000(this.\u00d2o0000).returnsuper(i2);
                this.o00000(graphics2D, "" + n7, 240, 260, n2 - 2, 8);
                this.o00000(graphics2D, aArray[i2].String().toString(), 260, 282, n2 - 2, 8);
                this.o00000(graphics2D, "" + this.\u00d6O0000.o00000(this.\u00d2o0000).String(i2), 282, 301, n2 - 2, 8);
                try {
                    this.o00000(graphics2D, "" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d200000(i2), 301, 322, n2 - 2, 8);
                }
                catch (B b) {
                    // empty catch block
                }
                String string3 = this.\u00d6O0000.o00000(this.\u00d2o0000).o00000(i2, this.\u00d6O0000);
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
        return n2;
    }

    private int \u00d400000(Graphics2D graphics2D, int n) {
        boolean bl = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isZonenRuestung();
        int n2 = n;
        int n3 = 15;
        int n4 = 270;
        int n5 = (n2 += 35) - 9;
        this.o00000(graphics2D, 10, 350, 270, 62, 5, 5);
        this.o00000(graphics2D, 10, 418, 270, 75, 5, 5);
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.drawLine(n3, n2 += 11, n4, n2);
        graphics2D.drawLine(n3, n2 += 11, n4, n2);
        n2 += 9;
        graphics2D.setFont(this.o00000(10));
        String string = "R\u00fcstung nach Trefferzonen";
        graphics2D.drawString(string, n3, n5 - 2);
        graphics2D.setFont(this.o00000(8));
        string = bl ? " (Berechnet mit Zonensystem)" : " (Berechnet mit normalen System)";
        graphics2D.drawString(string, n3 + 140, n5 - 3);
        graphics2D.setFont(this.o00000(8));
        int n6 = n2 - 22;
        int n7 = n3 + 5;
        helden.framework.E.C.B b = this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000();
        if (b != null) {
            graphics2D.drawString("" + b.\u00f8O0000(), n7, n6);
            graphics2D.drawString("" + b.\u00f800000(), n7 += 20, n6);
            graphics2D.drawString("" + b.newsuper(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00f6O0000(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00d6O0000(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00d8O0000(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00f500000(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00d5O0000(), n7 += 20, n6);
            graphics2D.drawString("" + b.oO0000(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00d2O0000(), n7 += 20, n6);
            graphics2D.drawString("" + b.\u00f600000(), n7 += 20, n6);
            graphics2D.drawString("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d600000(), n7 += 20, n6);
            n7 += 20;
            n7 += 28;
        }
        n6 += 11;
        n7 = n3 + 65;
        n6 += 11;
        n7 = n3 + 65;
        graphics2D.setFont(this.o00000(9));
        int n8 = n3;
        graphics2D.drawString("Ko", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("Br", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("R\u00fc", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("Ba", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("LA", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("RA", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("LB", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("RB", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("Ges.", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("gRS", n8 + 2, n5 + 8);
        graphics2D.drawLine(n8 += 20, n2, n8, n5);
        graphics2D.drawString("gBE", n8 + 2, n5 + 8);
        graphics2D.setFont(this.o00000(8));
        int n9 = n2 += 25;
        F[] fArray = new F[]{this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(1), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(2), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(3), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(4), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(5), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(6), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(7), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(8), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(9), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f800000(10)};
        int n10 = n3;
        int n11 = n2;
        for (int i2 = 0; i2 < 10; ++i2) {
            if (i2 == 5) {
                n10 += 133;
                n2 = n11 - 11;
            } else {
                graphics2D.drawLine(n10, n2, n10 + 130, n2);
            }
            n2 += 11;
            if (fArray[i2] == null) continue;
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[i2].OO0000(), n10, n2 - 2);
            helden.framework.E.C.B b2 = (helden.framework.E.C.B)fArray[i2].o00000(helden.framework.E.B.OO0000, 0);
            if (b2 == null) continue;
            if (b2.\u00d3O0000()) {
                graphics2D.drawString(this.new("*"), 99 + n10, n2 - 2);
                graphics2D.drawString(this.new("*"), 118 + n10, n2 - 2);
                continue;
            }
            graphics2D.drawString(this.new("" + b2.\u00d2O0000()), 99 + n10, n2 - 2);
            graphics2D.drawString(this.new("" + b2.\u00f600000()), 118 + n10, n2 - 2);
        }
        graphics2D.drawLine(n10, n2, n10 + 130, n2);
        graphics2D.drawString("Summe:", n10 + 60, (n2 += 11) - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).for()), 247, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d300000()), 266, n2 - 2);
        string = "R\u00fcstungsst\u00fcck";
        graphics2D.drawString(string, n3 + 2, n9 - 2);
        graphics2D.drawString("RS", 114, n9 - 2);
        graphics2D.drawString("BE", 132, n9 - 2);
        graphics2D.drawLine(111, n9 - 8, 111, n2);
        graphics2D.drawLine(129, n9 - 8, 129, n2);
        graphics2D.drawLine(244, n9 - 8, 244, n2);
        graphics2D.drawLine(262, n9 - 8, 262, n2);
        return n9;
    }

    private int \u00d300000(Graphics2D graphics2D, int n) {
        String string;
        P p2;
        Object object;
        Object object2;
        Object object3;
        int n2 = n;
        int n3 = 15;
        int n4 = 432;
        int n5 = (n2 += 2) - 3;
        this.o00000(graphics2D, 10, n5, 430, 660 - n5, 5, 5);
        graphics2D.setFont(this.o00000(8));
        String string2 = "";
        Iterator<P> iterator = this.\u00d6O0000.\u00f5O0000().iterator();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            if (!((P)object3).oo0000() || ((P)object3).\u00d4o0000() || ((P)object3).\u00f8O0000() || object3 instanceof a_0) continue;
            stringBuilder2.append(((P)object3).toString());
            stringBuilder2.append("; ");
        }
        if (stringBuilder2.length() > 0) {
            stringBuilder.append("\nNahkampf: ");
            stringBuilder.append((CharSequence)stringBuilder2);
        }
        iterator = this.\u00d6O0000.\u00f5O0000().iterator();
        object3 = new StringBuilder();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            if (!((P)object2).\u00f4o0000() || ((P)object2).\u00d4o0000() || ((P)object2).\u00f8O0000() || object2 instanceof a_0) continue;
            ((StringBuilder)object3).append(((P)object2).toString());
            ((StringBuilder)object3).append("; ");
        }
        if (((StringBuilder)object3).length() > 0) {
            stringBuilder.append("\nFernkampf: ");
            stringBuilder.append((CharSequence)object3);
        }
        iterator = this.\u00d6O0000.\u00f5O0000().iterator();
        object2 = new StringBuilder();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (object instanceof helden.framework.D.K && ((helden.framework.D.K)(p2 = (helden.framework.D.K)object)).o\u00d30000() instanceof E) {
                string = p2.toString();
                if (string.startsWith("Talentspezialisierung ")) {
                    string = string.substring("Talentspezialisierung ".length(), string.length());
                }
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append("; ");
            }
            if (!(object instanceof a_0)) continue;
            ((StringBuilder)object2).append(((P)object).toString());
            ((StringBuilder)object2).append("; ");
        }
        if (((StringBuilder)object2).length() > 0) {
            stringBuilder.append("\nTalentspezialisierung: ");
            stringBuilder.append((CharSequence)object2);
        }
        iterator = this.\u00d6O0000.\u00f5O0000().iterator();
        object = new StringBuilder();
        while (iterator.hasNext()) {
            p2 = iterator.next();
            if (!p2.\u00d4o0000()) continue;
            ((StringBuilder)object).append(p2.toString());
            ((StringBuilder)object).append("; ");
        }
        if (((StringBuilder)object).length() > 0) {
            stringBuilder.append("\nMan\u00f6ver: ");
            stringBuilder.append((CharSequence)object);
        }
        p2 = stringBuilder.toString().split(" ");
        string = string2;
        for (int i2 = 0; i2 < ((P)p2).length; ++i2) {
            string = string + (String)((Object)p2[i2]) + " ";
            if (i2 != 0 && !((String)((Object)p2[i2])).startsWith("\n") && this.o00000(string, graphics2D) < (float)(n4 - n3)) {
                string2 = string;
                continue;
            }
            if (string2.startsWith("\n")) {
                string2 = string2.trim();
                String[] stringArray = string2.split(" ", 2);
                graphics2D.setFont(this.o00000(8).deriveFont(1));
                graphics2D.drawString(stringArray[0], n3, n2 - 1);
                graphics2D.drawLine(n3, n2, n4, n2);
                graphics2D.setFont(this.o00000(8));
                graphics2D.drawString(stringArray[1], n3, (n2 += 10) - 1);
            } else {
                graphics2D.drawString(string2.trim(), n3, n2 - 1);
            }
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 10;
            string2 = string = (String)((Object)p2[i2]) + " ";
        }
        if (string2.startsWith("\n")) {
            string2 = string2.trim();
            String[] stringArray = string2.split(" ", 2);
            graphics2D.setFont(this.o00000(8).deriveFont(1));
            graphics2D.drawString(stringArray[0], n3, n2 - 1);
            float f2 = this.o00000(stringArray[0], graphics2D);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(stringArray[1], (float)n3 + f2, (float)(n2 - 1));
        } else {
            graphics2D.drawString(string2, n3, n2 - 2);
        }
        while (n2 < 660) {
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 10;
        }
        return n2;
    }

    private int \u00d500000(Graphics2D graphics2D, int n) {
        void void_;
        int n2 = n;
        int n3 = 15;
        graphics2D.setFont(this.o00000(9));
        int n4 = (n2 += 25) - 16;
        int n5 = n2 - 10;
        this.o00000(graphics2D, 10, n4, 270, 248 - n4 + 5 - 42, 5, 5);
        this.o00000(graphics2D, 10, n4 + 45, 270, 248 - n4 + 5 - 45, 5, 5);
        graphics2D.drawString("Waffenloser Kampf", n3 + 2, n2 - 2);
        graphics2D.drawString("TP/KK", 125, n2 - 2);
        graphics2D.drawString("INI", 168, n2 - 2);
        graphics2D.drawString("AT", 198, n2 - 2);
        graphics2D.drawString("PA", 228, n2 - 2);
        graphics2D.drawString("TP(A)", 253, n2 - 2);
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Raufen", n3, (n2 += 10) - 2);
        graphics2D.drawString("10/3", 130, n2 - 2);
        graphics2D.drawString("+0", 170, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f6O0000()), 200, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d800000()), 230, n2 - 2);
        graphics2D.drawString(this.\u00d6O0000.o00000(this.\u00d2o0000).null(), 253, n2 - 2);
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        n2 += 10;
        if (this.\u00d6O0000.\u00f8O0000().\u00d300000(E.newnewString)) {
            graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d5O0000()), 200, n2 - 2);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).String()), 230, n2 - 2);
            graphics2D.drawString("Ringen", n3, n2 - 2);
            graphics2D.drawString("10/3", 130, n2 - 2);
            graphics2D.drawString("+0", 170, n2 - 2);
            graphics2D.drawString(this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f600000(), 253, n2 - 2);
        }
        graphics2D.drawLine(122, n5, 122, n2);
        graphics2D.drawLine(155, n5, 155, n2);
        graphics2D.drawLine(190, n5, 190, n2);
        graphics2D.drawLine(220, n5, 220, n2);
        graphics2D.drawLine(250, n5, 250, n2);
        n2 += 9;
        F[] fArray = new F[]{this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f5O0000(1), this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f5O0000(2)};
        graphics2D.drawString("Schild", n3 + 2, (n2 += 10) - 2);
        graphics2D.drawString("Typ", 112, n2 - 2);
        graphics2D.drawString("INI", 159, n2 - 2);
        graphics2D.drawString("WM", 184, n2 - 2);
        graphics2D.drawString("PA", 214, n2 - 2);
        graphics2D.drawString("Bruchfaktor", 233, n2 - 2);
        n5 = n2;
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        n2 += 10;
        if (fArray[0] != null) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[0].OO0000(), 15, n2 - 2);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f600000(1).substring(0, 6), 110, n2 - 2);
            void_ = (void)fArray[0].o00000(helden.framework.E.B.\u00d300000, 0);
            if (void_ != null) {
                graphics2D.drawString(this.new("" + void_.nullnew()), 160, n2 - 2);
                graphics2D.drawString(void_.\u00f5\u00d20000().toString(), 185, n2 - 2);
                graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d600000(0)), 215, n2 - 2);
                this.o00000(graphics2D, "" + void_.\u00d8\u00d20000().\u00d400000(), 230, 240, n2 - 2, 8);
                this.o00000(graphics2D, "" + void_.\u00d8\u00d20000().\u00d400000(), 240, 250, n2 - 2, 8);
            }
        }
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        n2 += 10;
        if (fArray[1] != null) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(fArray[1].OO0000(), 15, n2 - 2);
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.\u00d6O0000.o00000(this.\u00d2o0000).\u00f600000(2).substring(0, 6), 110, n2 - 2);
            void_ = (void)fArray[1].o00000(helden.framework.E.B.\u00d300000, 0);
            if (void_ != null) {
                graphics2D.drawString(this.new("" + void_.nullnew()), 160, n2 - 2);
                graphics2D.drawString(void_.\u00f5\u00d20000().toString(), 185, n2 - 2);
                graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(this.\u00d2o0000).\u00d600000(1)), 215, n2 - 2);
                this.o00000(graphics2D, "" + void_.\u00d8\u00d20000().\u00d400000(), 230, 240, n2 - 2, 8);
                this.o00000(graphics2D, "" + void_.\u00d8\u00d20000().\u00d400000(), 240, 250, n2 - 2, 8);
            }
        }
        graphics2D.drawLine(n3, n2, n3 + 263, n2);
        graphics2D.drawLine(102, n5 - 8, 102, n2);
        graphics2D.drawLine(152, n5 - 8, 152, n2);
        graphics2D.drawLine(178, n5 - 8, 178, n2);
        graphics2D.drawLine(208, n5 - 8, 208, n2);
        graphics2D.drawLine(230, n5 - 8, 230, n2);
        graphics2D.drawLine(240, n5, 240, n2);
        graphics2D.drawLine(250, n5, 250, n2);
        graphics2D.drawLine(260, n5, 260, n2);
        graphics2D.drawLine(270, n5, 270, n2);
        return n2 += 2;
    }

    private void o00000(Graphics2D graphics2D, int n) {
        int n2 = n + 52;
        int n3 = 295;
        this.o00000(graphics2D, n3 - 10, n2 + 10, 155, 28, 5, 5);
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
        n2 += 18;
    }

    private int new(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = n;
        int n4 = 435;
        int n5 = 290;
        this.o00000(graphics2D, n5 - 5, n3 - 15, 155, 497 - n3 + 11, 5, 5);
        String string = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).getWundmaennchenPfad();
        File file = new File(string);
        if (file.exists()) {
            M m = new M(string);
            m.o00000(graphics2D, n5, n2 - 10, 145, 131);
            graphics2D.drawRect(n5, n2 - 10, 145, 131);
            n2 += 65;
        } else {
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
        }
        return n2 += 68;
    }
}

