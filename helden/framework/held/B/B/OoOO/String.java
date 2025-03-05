/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.C.H;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.S;
import helden.framework.OoOO.U;
import helden.framework.OoOO.classsuper;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.B.B.G;
import helden.framework.held.Object.C;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class String
extends G {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d2\u00d50000;
    private List<HashMap<java.lang.String, Boolean>> \u00d3\u00d50000;
    private List<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d5\u00d50000;
    private int StringString;
    private classsuper thisString;
    private S o\u00d50000;
    private H \u00f8\u00d40000;

    public String(List<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> list, List<HashMap<java.lang.String, Boolean>> list2) {
        this.\u00d5\u00d50000 = list;
        this.\u00d3\u00d50000 = list2;
        this.thisString = new classsuper();
        this.o\u00d50000 = new S();
        this.\u00f8\u00d40000 = new H();
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        int n = 15;
        graphics2D.setFont(this.o00000(16));
        graphics2D.drawString("Spielleiterbrief", n + 160, 25);
        this.StringString = 0;
        for (int i2 = 0; i2 < 5; ++i2) {
            if (i2 < this.\u00d5\u00d50000.size()) {
                int n2;
                this.\u00d2\u00d50000 = this.\u00d5\u00d50000.get(i2);
                if (this.\u00d3\u00d50000.get(this.StringString).size() > 0) {
                    n2 = this.\u00d3\u00d20000(graphics2D, n);
                    n2 = this.return(graphics2D, n, n2);
                    n2 = this.\u00d500000(graphics2D, n, n2);
                    n2 = this.\u00f400000(graphics2D, n, n2);
                    n2 = this.\u00d400000(graphics2D, n, n2);
                    n2 = this.\u00d300000(graphics2D, n, n2);
                    n2 = this.\u00f500000(graphics2D, n, n2);
                    this.\u00d800000(graphics2D, n, n2);
                } else {
                    n2 = this.\u00d3\u00d20000(graphics2D, n);
                    n2 = this.return(graphics2D, n, n2);
                    this.\u00d4\u00d20000(graphics2D, n);
                }
            } else {
                this.\u00d4\u00d20000(graphics2D, n);
            }
            n += 86;
            ++this.StringString;
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
    public java.lang.String \u00f400000() {
        return "Spielleiterbrief";
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private void \u00d800000(Graphics2D graphics2D, int n, int n2) {
        if (n2 < 650) {
            int n3 = n2 - 10;
            graphics2D.setFont(this.o00000(6));
            graphics2D.drawString("Anmerkungen", n + 17, n2 - 2);
            graphics2D.drawLine(n, n2, n + 76, n2);
            while (n2 < 660) {
                graphics2D.drawLine(n, n2 += 10, n + 76, n2);
            }
            graphics2D.drawRect(n, n3, 76, n2 - n3);
        }
    }

    private int return(Graphics2D graphics2D, int n, int n2) {
        graphics2D.drawRect(n, (n2 += 5) - 10, 76, 80);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("MU", n + 2, n2 - 2);
        graphics2D.drawLine(n + 19, n2 - 10, n + 19, n2 + 70);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.whilewhilesuper)), n + 23, n2 - 2);
        graphics2D.drawLine(n + 38, n2 - 10, n + 38, n2 + 70);
        graphics2D.drawString("LE", n + 40, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00d3\u00f4\u00d2000)), n + 61, n2 - 2);
        graphics2D.drawLine(n + 57, n2 - 10, n + 57, n2 + 70);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("KL", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.newwhilesuper)), n + 23, n2 - 2);
        graphics2D.drawString("AE", n + 40, n2 - 2);
        if (this.\u00d2\u00d50000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00f4\u00f5\u00d2000)), n + 61, n2 - 2);
        }
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("IN", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00f8\u00f4\u00d2000)), n + 23, n2 - 2);
        graphics2D.drawString("KE", n + 40, n2 - 2);
        if (this.\u00d2\u00d50000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00d4\u00f5\u00d2000)), n + 61, n2 - 2);
        }
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("CH", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00d5\u00f4\u00d2000)), n + 23, n2 - 2);
        graphics2D.drawString("AU", n + 40, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.thispublicsuper)), n + 61, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("GE", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00f4\u00f4\u00d2000)), n + 23, n2 - 2);
        graphics2D.drawString("INI", n + 40, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00f4\u00d8\u00d2000)), n + 61, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("FF", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.O\u00f5\u00d2000)), n + 23, n2 - 2);
        graphics2D.drawString("MR", n + 40, n2 - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.\u00d8\u00f5\u00d2000)), n + 61, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("KO", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.returnwhilesuper)), n + 23, n2 - 2);
        graphics2D.drawString("RS", n + 40, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString("KK", n + 2, (n2 += 10) - 2);
        graphics2D.drawString(this.new("" + this.\u00d2\u00d50000.o00000(b_0.privatedosuper)), n + 23, n2 - 2);
        graphics2D.drawString("BE", n + 40, n2 - 2);
        return n2 += 10;
    }

    private void \u00d4\u00d20000(Graphics2D graphics2D, int n) {
        int n2;
        int n3 = 45;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Helden-Name: ", n + 2, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawRect(n, (n3 += 10) - 20, 76, 20);
        graphics2D.drawRect(n, (n3 += 15) - 10, 76, 80);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("MU", n + 2, n3 - 2);
        graphics2D.drawLine(n + 19, n3 - 10, n + 19, n3 + 70);
        graphics2D.drawLine(n + 38, n3 - 10, n + 38, n3 + 70);
        graphics2D.drawString("LE", n + 40, n3 - 2);
        graphics2D.drawLine(n + 57, n3 - 10, n + 57, n3 + 70);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("KL", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("AE", n + 40, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("IN", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("KE", n + 40, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("CH", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("AU", n + 40, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("GE", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("INI", n + 40, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("FF", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("MR", n + 40, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("KO", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("RS", n + 40, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("KK", n + 2, (n3 += 10) - 2);
        graphics2D.drawString("BE", n + 40, n3 - 2);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Wunden", n + 27, (n3 += 10) - 2);
        graphics2D.drawOval(n + 4, n3 + 2, 8, 8);
        graphics2D.drawOval(n + 19, n3 + 2, 8, 8);
        graphics2D.drawOval(n + 34, n3 + 2, 8, 8);
        graphics2D.drawOval(n + 49, n3 + 2, 8, 8);
        graphics2D.drawOval(n + 64, n3 + 2, 8, 8);
        graphics2D.drawRect(n, (n3 += 25) - 10, 76, 50);
        graphics2D.drawString("Waffen", n + 27, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawLine(n + 18, n3, n + 18, n3 + 40);
        graphics2D.drawLine(n + 47, n3, n + 47, n3 + 40);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Art", n + 2, (n3 += 10) - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("At/Pa", n + 2, (n3 += 10) - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("DK", n + 2, (n3 += 10) - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawString("TP", n + 2, (n3 += 10) - 2);
        int n4 = (n3 += 15) - 10;
        graphics2D.drawString("Talente", n + 27, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        for (n2 = 0; n2 < 20; ++n2) {
            graphics2D.drawLine(n, n3 += 10, n + 76, n3);
        }
        graphics2D.drawRect(n, n4, 76, n3 - n4);
        graphics2D.drawLine(n + 64, n3, n + 64, n4 + 10);
        n4 = (n3 += 15) - 10;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Vor-/ Nachteile", n + 20, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        for (n2 = 0; n2 < 5; ++n2) {
            graphics2D.drawLine(n, n3 += 10, n + 76, n3);
        }
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawRect(n, n4, 76, n3 - n4);
        n4 = (n3 += 15) - 10;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Sonderfertigkeiten", n + 17, n3 - 2);
        graphics2D.drawLine(n, n3, n + 76, n3);
        for (n2 = 0; n2 < 5; ++n2) {
            graphics2D.drawLine(n, n3 += 10, n + 76, n3);
        }
        graphics2D.drawLine(n, n3, n + 76, n3);
        graphics2D.drawRect(n, n4, 76, n3 - n4);
        this.\u00d800000(graphics2D, n, n3 += 20);
    }

    private int \u00d3\u00d20000(Graphics2D graphics2D, int n) {
        int n2 = 45;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Helden-Name: ", n + 2, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        graphics2D.drawString(this.\u00d2\u00d50000.\u00f5o0000(), n + 2, (n2 += 10) - 2);
        graphics2D.drawRect(n, n2 - 20, 76, 20);
        return n2 += 10;
    }

    private int \u00f500000(Graphics2D graphics2D, int n, int n2) {
        int n3 = n2 - 10;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Sonderfertigkeiten", n + 17, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        for (P p2 : this.\u00d2\u00d50000.\u00f5O0000()) {
            if (!this.\u00d3\u00d50000.get(this.StringString).containsKey(p2.toString())) continue;
            graphics2D.drawString(this.o\u00d50000.o00000(p2.toString()), n + 2, (n2 += 10) - 2);
            graphics2D.drawLine(n, n2, n + 76, n2);
        }
        graphics2D.drawRect(n, n3, 76, n2 - n3);
        return n2 += 20;
    }

    private int \u00d400000(Graphics2D graphics2D, int n, int n2) {
        Object object;
        graphics2D.setFont(this.o00000(6));
        int n3 = n2 - 10;
        graphics2D.drawString("Talente", n + 27, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        Iterator<voidsuper> iterator = this.\u00d2\u00d50000.\u00f8O0000().super();
        graphics2D.setFont(this.o00000(6));
        while (iterator.hasNext()) {
            object = iterator.next();
            try {
                if (!this.\u00d3\u00d50000.get(this.StringString).containsKey(((U)object).toString() + this.\u00d2\u00d50000.\u00d300000((oo0o_0)object))) continue;
                n2 += 10;
                if (((U)object).getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) || ((U)object).getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000)) {
                    graphics2D.drawString(((U)object).toString().substring(16), n + 2, n2 - 2);
                    graphics2D.setFont(this.o00000(3));
                    graphics2D.drawString(((oo0o_0)object).getTalentprobe().toString(), n + 46, n2 - 2);
                    graphics2D.setFont(this.o00000(6));
                    graphics2D.drawString("" + this.\u00d2\u00d50000.\u00d300000((oo0o_0)object), n + 66, n2 - 2);
                    graphics2D.drawLine(n, n2, n + 76, n2);
                    continue;
                }
                graphics2D.drawString("" + this.\u00d2\u00d50000.\u00d300000((oo0o_0)object), n + 66, n2 - 2);
                graphics2D.setFont(this.o00000(3));
                graphics2D.drawString(((oo0o_0)object).getTalentprobe().toString(), n + 46, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawString(this.thisString.super(((U)object).toString()), n + 2, n2 - 2);
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
            catch (Exception exception) {}
        }
        try {
            if (this.\u00d3\u00d50000.get(this.StringString).containsKey("Ansitzjagd")) {
                graphics2D.drawString("" + C.\u00d600000(this.\u00d2\u00d50000), n + 66, (n2 += 10) - 2);
                graphics2D.drawString("Ansitzjagd", n + 2, n2 - 2);
                graphics2D.setFont(this.o00000(3));
                graphics2D.drawString("(MU/IN/GE)", n + 46, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
            if (this.\u00d3\u00d50000.get(this.StringString).containsKey("Pirschjagd")) {
                graphics2D.drawString("" + C.\u00d500000(this.\u00d2\u00d50000), n + 66, (n2 += 10) - 2);
                graphics2D.drawString("Pirschjagd", n + 2, n2 - 2);
                graphics2D.setFont(this.o00000(3));
                graphics2D.drawString("(MU/IN/GE)", n + 46, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
            if (this.\u00d3\u00d50000.get(this.StringString).containsKey("Nahrung sammeln")) {
                graphics2D.drawString("" + C.\u00f600000(this.\u00d2\u00d50000), n + 66, (n2 += 10) - 2);
                graphics2D.drawString("Nahrung sammeln", n + 2, n2 - 2);
                graphics2D.setFont(this.o00000(3));
                graphics2D.drawString("(MU/IN/FF)", n + 46, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
            if (this.\u00d3\u00d50000.get(this.StringString).containsKey("Kr\u00e4uter suchen")) {
                graphics2D.drawString("" + C.\u00f800000(this.\u00d2\u00d50000), n + 66, (n2 += 10) - 2);
                graphics2D.drawString("Kr\u00e4uter suchen", n + 2, n2 - 2);
                graphics2D.setFont(this.o00000(3));
                graphics2D.drawString("(MU/IN/FF)", n + 46, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
            if (this.\u00d3\u00d50000.get(this.StringString).containsKey("Wache halten")) {
                graphics2D.drawString("" + C.null(this.\u00d2\u00d50000), n + 66, (n2 += 10) - 2);
                graphics2D.drawString("Wache halten", n + 2, n2 - 2);
                graphics2D.setFont(this.o00000(3));
                graphics2D.drawString("(MU/IN/KO)", n + 46, n2 - 2);
                graphics2D.setFont(this.o00000(6));
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        object = this.\u00d2\u00d50000.\u00d5o0000().super();
        while (object.hasNext()) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)object.next();
            try {
                if (!this.\u00d3\u00d50000.get(this.StringString).containsKey(konkreterZauber.toString())) continue;
                graphics2D.drawString(this.thisString.super(konkreterZauber.toString()), n + 2, (n2 += 10) - 2);
                graphics2D.drawString("" + this.\u00d2\u00d50000.\u00d300000(konkreterZauber), n + 66, n2 - 2);
                graphics2D.drawLine(n, n2, n + 76, n2);
            }
            catch (Exception exception) {}
        }
        graphics2D.drawRect(n, n3, 76, n2 - n3);
        graphics2D.drawLine(n + 64, n2, n + 64, n3 + 10);
        return n2 += 15;
    }

    private int \u00d300000(Graphics2D graphics2D, int n, int n2) {
        int n3 = n2 - 10;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Vor-/ Nachteile", n + 20, n2 - 2);
        graphics2D.drawLine(n, n2, n + 76, n2);
        Iterator<public> iterator = this.\u00d2\u00d50000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!this.\u00d3\u00d50000.get(this.StringString).containsKey(public_.oO0000())) continue;
            graphics2D.drawString(this.\u00f8\u00d40000.o00000(public_.oO0000()), n + 2, (n2 += 10) - 2);
            graphics2D.drawLine(n, n2, n + 76, n2);
        }
        graphics2D.drawRect(n, n3, 76, n2 - n3);
        return n2 += 15;
    }

    private int \u00f400000(Graphics2D graphics2D, int n, int n2) {
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

    private int \u00d500000(Graphics2D graphics2D, int n, int n2) {
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Wunden", n + 27, n2 - 2);
        graphics2D.drawOval(n + 4, n2 + 2, 8, 8);
        graphics2D.drawOval(n + 19, n2 + 2, 8, 8);
        graphics2D.drawOval(n + 34, n2 + 2, 8, 8);
        graphics2D.drawOval(n + 49, n2 + 2, 8, 8);
        graphics2D.drawOval(n + 64, n2 + 2, 8, 8);
        return n2 += 25;
    }
}

