/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Einstellungen;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.J;
import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class K
extends G {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO returnclass;
    private int o\u00d80000 = 0;

    public K(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, 0);
    }

    public K(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.returnclass = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.o\u00d80000 = n;
    }

    @Override
    public void o00000(Graphics graphics) {
        int n = this.o\u00d80000;
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(Color.BLACK);
        String string = Einstellungen.getInstance().getSeitenEinstellungen(this.returnclass.\u00f4o0000()).getBackgroudPath();
        File file = new File(this.\u00d400000(string + "hszd2.JPG"));
        if (!file.exists()) {
            this.\u00f800000(graphics2D);
        } else {
            try {
                if (file.exists()) {
                    helden.framework.held.B.B.C.Object object = new helden.framework.held.B.B.C.Object(this.\u00d400000(string + "hszd2.JPG"));
                    object.o00000(graphics2D);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.\u00f5\u00d30000(graphics2D, 58);
            this.\u00d8\u00d30000(graphics2D, n);
            this.whilenew(graphics2D);
            this.StringObject(graphics2D, n);
            this.ifnew(graphics2D);
            this.O\u00d30000(graphics2D);
            this.\u00d4\u00d30000(graphics2D);
        }
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.returnclass.\u00f4o0000()).isDrucken(this.new())) {
            int n = this.\u00d800000();
            for (int i2 = 0; i2 < n; ++i2) {
                arrayList.add(new K(this.returnclass, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        if (this.returnclass.oo0000() || this.returnclass.\u00f5O0000().\u00d300000() || this.returnclass.\u00d500000().\u00f800000()) {
            int n;
            int n2 = 0;
            BufferedImage bufferedImage = new BufferedImage(440, 660, 10);
            Graphics graphics = bufferedImage.getGraphics();
            int n3 = 0;
            Iterator<P> iterator = this.returnclass.\u00f5O0000().iterator();
            int n4 = 0;
            int n5 = 348;
            int n6 = 642;
            String string = "";
            Font font = this.o00000(8);
            int n7 = 0;
            while (iterator.hasNext()) {
                P p2 = iterator.next();
                if (p2.returnnew()) {
                    ++n4;
                } else if (p2.new()) {
                    ++n3;
                }
                if (!p2.privatesuper() || p2.new() || p2.\u00d400000() == 6 || p2.\u00d400000() == 5 || p2.returnnew() || p2.\u00f8O0000()) continue;
                n = (int)graphics.getFontMetrics(font).getStringBounds(string, graphics).getWidth();
                String string2 = p2.toString();
                int n8 = (int)graphics.getFontMetrics(font).getStringBounds(string2 + ";  ", graphics).getWidth();
                if ((n = n + 3 + n8) < n6 - n5) {
                    string = string + string2 + ";  ";
                    continue;
                }
                string = string2 + ";  ";
                ++n7;
            }
            if (string.length() > 0) {
                ++n7;
            }
            int n9 = (n3 * 14 + n4 * 20) / 239;
            for (n = 0; n <= n9; ++n) {
                ++n2;
            }
            if (n2 < (n7 + 4) / 5) {
                n2 = (n7 + 4) / 5;
            }
            return n2;
        }
        return 0;
    }

    @Override
    public String \u00f400000() {
        return "Ritualbogen " + (this.o\u00d80000 + 1);
    }

    @Override
    public boolean \u00d400000() {
        return false;
    }

    private void \u00d4\u00d30000(Graphics2D graphics2D) {
        int n = 410;
        int n2 = 40;
        this.oO0000(graphics2D, n2, n);
        n2 = 348;
        graphics2D.drawString("MR", n2, n);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+KL+KO)/5", 390, n - 10);
        graphics2D.drawLine(388, n + 2, 432, n + 2);
        graphics2D.drawString("Modifikationen", 445, n - 10);
        graphics2D.drawLine(443, n + 2, 482, n + 2);
        graphics2D.drawString("Vor-/Nachteile", 500, n - 10);
        graphics2D.drawLine(498, n + 2, 535, n + 2);
        graphics2D.drawString("Sonderfertigkeiten", 550, n - 10);
        graphics2D.drawLine(548, n + 2, 600, n + 2);
        graphics2D.drawString("Aktuell", 620, n - 10);
        graphics2D.drawLine(618, n + 2, 642, n + 2);
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString("+", 435, n);
        graphics2D.drawString("+", 485, n);
        graphics2D.drawString("+", 538, n);
        graphics2D.drawString("=", 603, n);
    }

    private void \u00d5\u00d30000(Graphics2D graphics2D) {
        int n = 430;
        int n2 = 40;
        this.oO0000(graphics2D, n2, n);
        n2 = 348;
        graphics2D.drawString("MR", n2, n);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+KL+KO)/5", 390, n - 10);
        graphics2D.drawLine(388, n + 2, 432, n + 2);
        graphics2D.drawString("Modifikationen", 445, n - 10);
        graphics2D.drawLine(443, n + 2, 482, n + 2);
        graphics2D.drawString("Vor-/Nachteile", 500, n - 10);
        graphics2D.drawLine(498, n + 2, 535, n + 2);
        graphics2D.drawString("Sonderfertigkeiten", 550, n - 10);
        graphics2D.drawLine(548, n + 2, 600, n + 2);
        graphics2D.drawString("Aktuell", 620, n - 10);
        graphics2D.drawLine(618, n + 2, 642, n + 2);
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString("+", 435, n);
        graphics2D.drawString("+", 485, n);
        graphics2D.drawString("+", 538, n);
        graphics2D.drawString("=", 603, n);
        graphics2D.drawRoundRect(340, 410, 320, 30, 5, 5);
    }

    private void ifnew(Graphics2D graphics2D) {
        int n = 348;
        int n2 = 642;
        int n3 = 226;
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Artefakte / Tr\u00e4nke: ", n, n3 - 2);
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        n3 += 10;
        n3 = 280;
        graphics2D.drawString("Anmerkungen: ", n, n3 - 2);
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        n3 += 10;
    }

    private void \u00f8\u00d20000(Graphics2D graphics2D) {
        int n = 348;
        int n2 = 652;
        int n3 = 240;
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Artefakte / Tr\u00e4nke: ", n, n3 - 2);
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        n3 += 10;
        graphics2D.drawRoundRect(340, 230, 320, 50, 5, 5);
        n3 = 300;
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        graphics2D.drawLine(n, n3 += 10, n2, n3);
        n3 += 10;
        graphics2D.drawRoundRect(340, 290, 320, 50, 5, 5);
    }

    private void oO0000(Graphics2D graphics2D, int n, int n2) {
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+IN+CH)/2", 65, n2 - 10);
        graphics2D.drawLine(65, n2 + 2, 105, n2 + 2);
        graphics2D.drawString("Mod.", 115, n2 - 10);
        graphics2D.drawLine(113, n2 + 2, 127, n2 + 2);
        graphics2D.drawString("Vor-/Nachteile", 140, n2 - 10);
        graphics2D.drawLine(138, n2 + 2, 176, n2 + 2);
        graphics2D.drawString("SF", 190, n2 - 10);
        graphics2D.drawLine(188, n2 + 2, 199, n2 + 2);
        graphics2D.drawString("Med.", 210, n2 - 10);
        graphics2D.drawLine(208, n2 + 2, 222, n2 + 2);
        graphics2D.drawString("Zukauf", 235, n2 - 10);
        graphics2D.drawLine(233, n2 + 2, 253, n2 + 2);
        graphics2D.drawString("Max.", 263, n2 - 10);
        graphics2D.drawLine(261, n2 + 2, 276, n2 + 2);
        graphics2D.drawString("pAsP", 287, n2 - 10);
        graphics2D.drawLine(288, n2 + 2, 300, n2 + 2);
        graphics2D.drawString("Aktuell", 310, n2 - 10);
        graphics2D.drawLine(308, n2 + 2, 330, n2 + 2);
        graphics2D.setFont(this.o00000(11));
        int n3 = (this.returnclass.o00000(b_0.whilewhilesuper) + this.returnclass.o00000(b_0.\u00f8\u00f4\u00d2000) + this.returnclass.o00000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
        graphics2D.drawString("" + n3, 80, n2);
        graphics2D.drawString("" + (this.returnclass.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000) - this.returnclass.\u00d3\u00d30000().\u00d4O0000() - this.returnclass.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000)), 117, n2);
        int n4 = (this.returnclass.o00000(b_0.whilewhilesuper) + this.returnclass.o00000(b_0.\u00f8\u00f4\u00d2000) + this.returnclass.o00000(b_0.\u00d5\u00f4\u00d2000) + this.returnclass.o00000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
        if (!this.returnclass.new(while.\u00d3\u00d5\u00d6000.toString())) {
            n4 = n3;
        }
        graphics2D.drawString("" + (n4 - n3), 188, n2);
        graphics2D.drawString("" + this.returnclass.\u00d3\u00d30000().\u00d4O0000(), 215, n2);
        graphics2D.drawString("" + this.returnclass.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000), 245, n2);
        graphics2D.drawString(this.new("" + (this.returnclass.\u00d3\u00d30000().interface() - this.returnclass.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000))), 265, n2);
        graphics2D.drawString(this.new("" + -this.returnclass.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000)), 292, n2);
        graphics2D.drawString(this.new("" + this.returnclass.\u00d3\u00d30000().interface()), 312, n2);
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString("+", 106, n2);
        graphics2D.drawString("+", 130, n2);
        graphics2D.drawString("+", 179, n2);
        graphics2D.drawString("+", 201, n2);
        graphics2D.drawString("+", 224, n2);
        graphics2D.drawString("=", 254, n2);
        graphics2D.drawString("-", 280, n2);
        graphics2D.drawString("=", 302, n2);
        graphics2D.setFont(this.o00000(15));
        graphics2D.drawString("AE", n, n2);
    }

    private boolean \u00f5\u00d30000(Graphics2D graphics2D, int n) {
        Object object;
        Object object22;
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        for (Object object22 : this.returnclass.\u00f5O0000()) {
            if (((P)object22).\u00d400000() == 6) {
                string = string + ((P)object22).toString().substring(18, ((P)object22).toString().length()) + "; ";
            }
            if (((P)object22).\u00d400000() != 5) continue;
            string2 = string2 + ((P)object22).toString().substring(16, ((P)object22).toString().length()) + ";  ";
        }
        object22 = this.returnclass.\u00d500000().\u00d500000();
        while (object22.hasNext()) {
            object = (public)object22.next();
            if (((public)object).\u00f4O0000().equals(I.\u00f5\u00f6O000)) {
                string3 = string3 + ((public)object).oO0000().substring(23, ((public)object).oO0000().length()) + ";  ";
            }
            if (!((public)object).\u00f4O0000().equals(I.O\u00d4O000)) continue;
            string4 = string4 + ((public)object).oO0000().substring(26, ((public)object).oO0000().length()) + ";  ";
        }
        graphics2D.setFont(this.o00000(9));
        object = "";
        if (!string2.equals("")) {
            object = (String)object + "Repr\u00e4sentationen: " + string2;
        }
        if (!string3.equals("")) {
            object = (String)object + "Begabungen: " + string3;
        }
        if (!string.equals("")) {
            object = (String)object + "Merkmale: " + string;
        }
        if (!string4.equals("")) {
            object = (String)object + "Unf\u00e4higkeiten: " + string4;
        }
        boolean bl = false;
        if (!((String)object).equals("")) {
            String[] stringArray = ((String)object).split("; ");
            String string5 = "";
            String string6 = "";
            boolean bl2 = false;
            for (String string7 : stringArray) {
                if (this.o00000(string5 = string5 + string7 + "; ", graphics2D) < 597.0f) {
                    string6 = string5;
                    continue;
                }
                graphics2D.drawString(string6, 42, n - 2);
                graphics2D.drawLine(41, n + 1, 639, n + 1);
                n += 15;
                string6 = string5 = string7 + "; ";
                bl2 = true;
            }
            graphics2D.drawString(string6, 42, n - 2);
            graphics2D.drawLine(41, n + 1, 639, n + 1);
            if (!bl2) {
                graphics2D.drawLine(41, (n += 15) + 1, 639, n + 1);
            }
        } else {
            n += 15;
            bl = true;
        }
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("MU:", 42, n += 15);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.whilewhilesuper)), 77, n);
        graphics2D.drawString("KL:", 107, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.newwhilesuper)), 142, n);
        graphics2D.drawString("IN:", 172, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.\u00f8\u00f4\u00d2000)), 207, n);
        graphics2D.drawString("CH:", 237, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.\u00d5\u00f4\u00d2000)), 272, n);
        graphics2D.drawString("FF:", 302, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.O\u00f5\u00d2000)), 337, n);
        graphics2D.drawString("GE:", 367, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.\u00f4\u00f4\u00d2000)), 402, n);
        graphics2D.drawString("KO:", 432, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.returnwhilesuper)), 467, n);
        graphics2D.drawString("KK:", 497, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.privatedosuper)), 532, n);
        graphics2D.drawString("MR:", 562, n);
        graphics2D.drawString(this.new("" + this.returnclass.o00000(b_0.\u00d8\u00f5\u00d2000)), 597, n);
        return bl;
    }

    private void \u00f5\u00d20000(Graphics2D graphics2D) {
        boolean bl = this.\u00f5\u00d30000(graphics2D, 25);
        if (bl) {
            graphics2D.drawRoundRect(40, 40, 600, 22, 5, 5);
        } else {
            graphics2D.drawRoundRect(40, 10, 600, 50, 5, 5);
        }
    }

    private void O\u00d30000(Graphics2D graphics2D) {
        int n = 348;
        int n2 = 332;
        graphics2D.setFont(this.o00000(5));
        String[] stringArray = new String[]{"ALLGEMEIN:", "(A)", "Aufrechterhaltung,", "A:", "Aktion,", "AsP:", "Astralpunkt,", "Haus:", "Hauszauber,", "Komp:", "Komplexit\u00e4t,", "KR:", "Kampfrunde,", "Lern:"};
        this.o00000(graphics2D, stringArray, n, n2, n + 295);
        String[] stringArray2 = new String[]{"Lernschwierigkeit,", "Med:Gro\u00dfe", "Meditation,", "Mod", "Modifikation", "nach", "Rasse,", "Kultur", "und", "Profession,", "MR:", "Magieresistenz,", "pAsP:", "permanentetest"};
        this.o00000(graphics2D, stringArray2, n, n2 += 6, n + 295);
        String[] stringArray3 = new String[]{"AsP,", "Rep:", "Repr\u00e4sentation,", "SE", "Spezielle", "Erfahrung,", "SF:", "Sonderfertigkeit,", "SR:", "Spielrunde,", "WD:", "Wirkungsdauer,", "ZD:", "Zauberdauer,", "ZfP*:"};
        this.o00000(graphics2D, stringArray3, n, n2 += 6, n + 295);
        String[] stringArray4 = new String[]{"bei", "der", "Probe", "\u00fcbrig", "behaltene", "Zauberfertigkeitspunkte,", "ZfW:", "Zauberfertigkeitswert", "MERKMALE:", "Anti:", "Antimagie,", "Besw:", "Beschw\u00f6rung,"};
        this.o00000(graphics2D, stringArray4, n, n2 += 6, n + 295);
        String[] stringArray5 = new String[]{"D\u00e4mo:", "D\u00e4monisch,", "Eign:", "Eigenschaften,", "Einfl:", "Einfluss,", "Elem:", "Elementar,", "Form:", "Form,", "Geis:", "Geisterwesen,", "Heil:", "Heilung,", "Hell:"};
        this.o00000(graphics2D, stringArray5, n, n2 += 6, n + 295);
        String[] stringArray6 = new String[]{"Hellsicht", "Herr:", "Herrschaft,", "Illu:", "Illusion,", "Krft:", "Kraft,", "Limb:", "Limbus,", "Meta:", "Metamagie,", "Objk:", "Objekt,", "Rufe:", "Herbeirufung,", "Scha:", "Schaden,"};
        this.o00000(graphics2D, stringArray6, n, n2 += 6, n + 295);
        String[] stringArray7 = new String[]{"Tele:", "Telekinese,", "Temp:", "Temporal,", "Umwt:", "Umwelt,", "Vers:", "Verst\u00e4ndigung", "TRADITIONEN", "/", "REP\u00c4SENTATIONEN:", "Ach", "Achaz-Kristallomanten,"};
        this.o00000(graphics2D, stringArray7, n, n2 += 6, n + 295);
        String[] stringArray8 = new String[]{"Bor:", "Borbaradianer,", "Dru:", "Druiden,", "Elf:", "Elfen,", "Geo:", "Geoden,", "Hex:", "Hexen,", "Mag:", "Gildenmagier,", "Sch.", "Schelme,", "Srl: Scharlatane"};
        this.o00000(graphics2D, stringArray8, n, n2 += 6, n + 295);
    }

    private void o\u00d30000(Graphics2D graphics2D) {
        int n = 348;
        int n2 = 353;
        graphics2D.setFont(this.o00000(5));
        String[] stringArray = new String[]{"ALLGEMEIN:", "(A)", "Aufrechterhaltung,", "A:", "Aktion,", "AsP:", "Astralpunkt,", "Haus:", "Hauszauber,", "Komp:", "Komplexit\u00e4t,", "KR:", "Kampfrunde,", "Lern:"};
        this.o00000(graphics2D, stringArray, n, n2, n + 308);
        String[] stringArray2 = new String[]{"Lernschwierigkeit,", "Med:Gro\u00dfe", "Meditation,", "Mod", "Modifikation", "nach", "Rasse,", "Kultur", "und", "Profession,", "MR:", "Magieresistenz,", "pAsP:", "permanentetest"};
        this.o00000(graphics2D, stringArray2, n, n2 += 6, n + 308);
        String[] stringArray3 = new String[]{"AsP,", "Rep:", "Repr\u00e4sentation,", "SE", "Spezielle", "Erfahrung,", "SF:", "Sonderfertigkeit,", "SR:", "Spielrunde,", "WD:", "Wirkungsdauer,", "ZD:", "Zauberdauer,", "ZfP*:"};
        this.o00000(graphics2D, stringArray3, n, n2 += 6, n + 308);
        String[] stringArray4 = new String[]{"bei", "der", "Probe", "\u00fcbrig", "behaltene", "Zauberfertigkeitspunkte,", "ZfW:", "Zauberfertigkeitswert", "MERKMALE:", "Anti:", "Antimagie,", "Besw:", "Beschw\u00f6rung,"};
        this.o00000(graphics2D, stringArray4, n, n2 += 6, n + 308);
        String[] stringArray5 = new String[]{"D\u00e4mo:", "D\u00e4monisch,", "Eign:", "Eigenschaften,", "Einfl:", "Einfluss,", "Elem:", "Elementar,", "Form:", "Form,", "Geis:", "Geisterwesen,", "Heil:", "Heilung,", "Hell:"};
        this.o00000(graphics2D, stringArray5, n, n2 += 6, n + 308);
        String[] stringArray6 = new String[]{"Hellsicht", "Herr:", "Herrschaft,", "Illu:", "Illusion,", "Krft:", "Kraft,", "Limb:", "Limbus,", "Meta:", "Metamagie,", "Objk:", "Objekt,", "Rufe:", "Herbeirufung,", "Scha:", "Schaden,"};
        this.o00000(graphics2D, stringArray6, n, n2 += 6, n + 308);
        String[] stringArray7 = new String[]{"Tele:", "Telekinese,", "Temp:", "Temporal,", "Umwt:", "Umwelt,", "Vers:", "Verst\u00e4ndigung", "TRADITIONEN", "/", "REP\u00c4SENTATIONEN:", "Ach", "Achaz-Kristallomanten,"};
        this.o00000(graphics2D, stringArray7, n, n2 += 6, n + 308);
        String[] stringArray8 = new String[]{"Bor:", "Borbaradianer,", "Dru:", "Druiden,", "Elf:", "Elfen,", "Geo:", "Geoden,", "Hex:", "Hexen,", "Mag:", "Gildenmagier,", "Sch.", "Schelme,", "Srl: Scharlatane"};
        this.o00000(graphics2D, stringArray8, n, n2 += 6, n + 308);
        graphics2D.drawRoundRect(340, 345, 320, 55, 5, 5);
    }

    private void \u00f800000(Graphics graphics) {
        int n = this.o\u00d80000;
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.\u00f5\u00d20000(graphics2D);
        this.\u00f4\u00d30000(graphics2D, n);
        this.\u00d3\u00d30000(graphics2D);
        this.thisObject(graphics2D, n);
        this.\u00f8\u00d20000(graphics2D);
        this.o\u00d30000(graphics2D);
        this.\u00d5\u00d30000(graphics2D);
        graphics2D.drawRoundRect(5, 5, 660, 440, 5, 5);
    }

    private void \u00d8\u00d30000(Graphics2D graphics2D, int n) {
        P p2;
        int n2;
        Object object;
        int n3 = 120;
        int n4 = 40;
        int n5 = 330;
        graphics2D.setFont(this.o00000(14));
        graphics2D.drawString("Ritual", 155, n3);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawLine(n4, n3 + 2, n5, n3 + 2);
        graphics2D.drawString("Ritualname", 50, n3);
        graphics2D.drawString("Probe", n4 + 5, n3 += 12);
        graphics2D.drawString("Dauer", 160, n3);
        graphics2D.drawString("Kosten", 190, n3);
        graphics2D.drawString("Wirkung/Anmerkung", 240, n3);
        graphics2D.drawLine(n4, n3 + 2, n5, n3 + 2);
        graphics2D.drawLine(155, n3 - 8, 155, n3 + 2);
        graphics2D.drawLine(185, n3 - 8, 185, n3 + 2);
        graphics2D.drawLine(225, n3 - 8, 225, n3 + 2);
        n3 += 12;
        graphics2D.setFont(this.o00000(10));
        int n6 = 377;
        int n7 = 0;
        Iterator<P> iterator = this.returnclass.\u00f5O0000().iterator();
        while (iterator.hasNext() && n == 0) {
            object = iterator.next();
            if (((P)object).new()) {
                graphics2D.drawString("Ritualkenntnis ( " + ((P)object).toString().substring(16, ((P)object).toString().length()) + " ):", n4, n6 - 4);
                ++n7;
                graphics2D.setFont(this.o00000(8));
                try {
                    if (!((P)object).\u00d4\u00d20000()) {
                        graphics2D.drawString("" + this.returnclass.\u00d300000(helden.framework.OOoO.K.\u00d200000((P)object)), 178, n6 - 4);
                    }
                }
                catch (D d2) {
                    d2.printStackTrace();
                }
                for (n2 = 177; n2 <= n5; n2 += 12) {
                    graphics2D.drawRect(n2, n6 - 12, 10, 10);
                }
                graphics2D.drawLine(n4, n6 -= 14, n5, n6);
            }
            graphics2D.setFont(this.o00000(10));
        }
        graphics2D.drawLine(n4, n6 - 1, n5, n6 - 1);
        object = this.returnclass.\u00f5O0000().iterator();
        n2 = 12;
        n2 -= n7;
        while (n > 0 && object.hasNext()) {
            if (n2 < 1) {
                n2 = 12;
                --n;
                continue;
            }
            p2 = (P)object.next();
            if (!p2.returnnew()) continue;
            --n2;
        }
        while (object.hasNext() && n3 < n6 - 10) {
            p2 = (P)object.next();
            if (!p2.returnnew()) continue;
            graphics2D.drawString("" + p2.\u00d5o0000(), n4, n3 - 2);
            graphics2D.drawLine(n4, n3, n5, n3);
            helden.framework.D.D d3 = this.returnclass.o00000(p2);
            graphics2D.drawString(d3.o00000(), n4, (n3 += 10) - 2);
            graphics2D.drawString(d3.\u00d200000(), 158, n3 - 2);
            graphics2D.drawString(d3.\u00d400000(), 188, n3 - 2);
            graphics2D.drawString(d3.Object(), 228, n3 - 2);
            graphics2D.drawLine(155, n3 - 10, 155, n3);
            graphics2D.drawLine(185, n3 - 10, 185, n3);
            graphics2D.drawLine(225, n3 - 10, 225, n3);
            graphics2D.drawLine(n4, n3, n5, n3);
            n3 += 10;
        }
        while (n3 < n6 - 10) {
            graphics2D.drawLine(n4, n3, n5, n3);
            graphics2D.drawLine(155, (n3 += 10) - 10, 155, n3);
            graphics2D.drawLine(185, n3 - 10, 185, n3);
            graphics2D.drawLine(225, n3 - 10, 225, n3);
            graphics2D.drawLine(n4, n3, n5, n3);
            n3 += 10;
        }
    }

    private void \u00f4\u00d30000(Graphics2D graphics2D, int n) {
        int n2;
        Object object;
        int n3 = 85;
        int n4 = 20;
        int n5 = 330;
        graphics2D.setFont(this.o00000(14));
        graphics2D.drawString("Ritual", 155, n3);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Ritualname", 50, n3);
        graphics2D.drawLine(n4, n3 + 2, n5, n3 + 2);
        graphics2D.drawRoundRect(10, 70, 325, 330, 5, 5);
        graphics2D.drawString("Probe", n4 + 5, n3 += 12);
        graphics2D.drawString("Dauer", 160, n3);
        graphics2D.drawString("Kosten", 190, n3);
        graphics2D.drawString("Wirkung/Anmerkung", 240, n3);
        graphics2D.drawLine(155, n3 - 8, 155, n3 + 2);
        graphics2D.drawLine(185, n3 - 8, 185, n3 + 2);
        graphics2D.drawLine(225, n3 - 8, 225, n3 + 2);
        graphics2D.drawLine(n4, n3 + 2, n5, n3 + 2);
        n3 += 14;
        graphics2D.setFont(this.o00000(10));
        int n6 = 397;
        int n7 = 0;
        Iterator<P> iterator = this.returnclass.\u00f5O0000().iterator();
        while (iterator.hasNext() && n == 0) {
            object = iterator.next();
            if (((P)object).new()) {
                graphics2D.drawString("Ritualkenntnis ( " + ((P)object).toString().substring(16, ((P)object).toString().length()) + " ):", n4, n6 - 4);
                ++n7;
                graphics2D.setFont(this.o00000(8));
                try {
                    if (!((P)object).\u00d4\u00d20000()) {
                        graphics2D.drawString("" + this.returnclass.\u00d300000(helden.framework.OOoO.K.\u00d200000((P)object)), 178, n6 - 4);
                    }
                }
                catch (D d2) {
                    d2.printStackTrace();
                }
                for (n2 = 177; n2 <= n5; n2 += 12) {
                    graphics2D.drawRect(n2, n6 - 12, 10, 10);
                }
                graphics2D.drawLine(n4, n6 -= 14, n5, n6);
            }
            graphics2D.setFont(this.o00000(10));
        }
        graphics2D.setFont(this.o00000(9));
        object = this.returnclass.\u00f5O0000().iterator();
        n2 = 12;
        n2 -= n7;
        while (n > 0 && object.hasNext()) {
            if (n2 <= 1) {
                n2 = 12;
                --n;
                continue;
            }
            P p2 = (P)object.next();
            if (!p2.returnnew()) continue;
            --n2;
        }
        int n8 = 0;
        while (object.hasNext() && n3 < n6 - 10 && n8 < 13) {
            P p3 = (P)object.next();
            if (!p3.returnnew()) continue;
            ++n8;
            graphics2D.drawString("" + p3.\u00d5o0000(), n4, n3 - 2);
            graphics2D.drawLine(n4, n3, n5, n3);
            helden.framework.D.D d3 = this.returnclass.o00000(p3);
            graphics2D.drawString(d3.o00000(), n4, (n3 += 12) - 2);
            graphics2D.drawString(d3.\u00d200000(), 158, n3 - 2);
            graphics2D.drawString(d3.\u00d400000(), 188, n3 - 2);
            graphics2D.drawString(d3.Object(), 228, n3 - 2);
            graphics2D.drawLine(155, n3 - 10, 155, n3);
            graphics2D.drawLine(185, n3 - 10, 185, n3);
            graphics2D.drawLine(225, n3 - 10, 225, n3);
            graphics2D.drawLine(n4, n3, n5, n3);
            n3 += 12;
        }
        while (n3 < n6 - 10) {
            graphics2D.drawLine(n4, n3, n5, n3);
            graphics2D.drawLine(155, (n3 += 12) - 10, 155, n3);
            graphics2D.drawLine(185, n3 - 10, 185, n3);
            graphics2D.drawLine(225, n3 - 10, 225, n3);
            graphics2D.drawLine(n4, n3, n5, n3);
            n3 += 12;
        }
    }

    private void StringObject(Graphics2D graphics2D, int n) {
        int n2 = 348;
        int n3 = 642;
        int n4 = 170;
        String string = "";
        graphics2D.setFont(this.o00000(8));
        int n5 = 0;
        for (P p2 : this.returnclass.\u00f5O0000()) {
            if (!p2.privatesuper() || p2.new() || p2.\u00d400000() == 6 || p2.\u00d400000() == 5 || p2.returnnew() || p2.\u00f8O0000()) continue;
            String string2 = p2.toString();
            if (p2.\u00f8O0000()) {
                string2 = "ZS " + string2.substring("Zauberspezialisierung ".length());
            }
            int n6 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth();
            int n7 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string2 + ";  ", graphics2D).getWidth();
            if ((n6 = n6 + 3 + n7) < n3 - n2) {
                string = string + string2 + ";  ";
                continue;
            }
            if (5 * n <= n5 && 5 * n + 5 > n5) {
                graphics2D.drawString(string, n2, n4 - 2);
                graphics2D.drawLine(n2, n4, n3, n4);
                ++n5;
                n4 += 10;
            } else {
                ++n5;
            }
            string = string2 + ";  ";
        }
        if (5 * n <= n5 && 5 * n + 6 > n5) {
            graphics2D.drawString(string, n2, n4 - 2);
            graphics2D.drawLine(n2, n4, n3, n4);
            n4 += 10;
        }
        while (n4 < 210) {
            graphics2D.drawLine(n2, n4, n3, n4);
            n4 += 10;
        }
    }

    private void thisObject(Graphics2D graphics2D, int n) {
        int n2 = 348;
        int n3 = 652;
        int n4 = 170;
        String string = "";
        graphics2D.setFont(this.o00000(8));
        int n5 = 0;
        for (P p2 : this.returnclass.\u00f5O0000()) {
            int n6;
            if (!p2.privatesuper() || p2.new() || p2.\u00d400000() == 6 || p2.\u00d400000() == 5 || p2.returnnew() || p2.\u00f8O0000()) continue;
            int n7 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth();
            String string2 = p2.toString();
            if (p2.\u00f8O0000()) {
                string2 = "ZS " + string2.substring("Zauberspezialisierung ".length());
            }
            if ((n7 = n7 + 3 + (n6 = (int)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string2 + ";  ", graphics2D).getWidth())) < n3 - n2) {
                string = string + string2 + ";  ";
                continue;
            }
            if (5 * n <= n5 && 5 * n + 5 > n5) {
                graphics2D.drawString(string, n2, n4 - 2);
                graphics2D.drawLine(n2, n4, n3, n4);
                ++n5;
                n4 += 10;
            } else {
                ++n5;
            }
            string = string2 + ";  ";
        }
        if (5 * n <= n5 && 5 * n + 5 > n5) {
            graphics2D.drawString(string, n2, n4 - 2);
            graphics2D.drawLine(n2, n4, n3, n4);
            n4 += 10;
        }
        while (n4 < 220) {
            graphics2D.drawLine(n2, n4, n3, n4);
            n4 += 10;
        }
        graphics2D.drawRoundRect(340, 160, 320, 60, 5, 5);
    }

    private void whilenew(Graphics2D graphics2D) {
        int n = 348;
        int n2 = 642;
        int n3 = 115;
        String string = "";
        Iterator<public> iterator = this.returnclass.\u00d500000().\u00d500000();
        AttributedString attributedString = null;
        int n4 = 0;
        int n5 = 0;
        Font font = this.o00000(8);
        Font font2 = font.deriveFont(2);
        Vector<J> vector = new Vector<J>();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (public_.\u00f4O0000().Object() || public_.\u00f4O0000() == I.\u00f5\u00f6O000 || public_.\u00f4O0000() == I.O\u00d4O000) continue;
            String[] stringArray = new String[]{public_.oO0000()};
            if (public_ instanceof M) {
                stringArray = public_.oO0000().split(", ");
            }
            for (String string2 : stringArray) {
                int j2;
                String string3 = ", ";
                n5 = public_.\u00d500000() ? (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth() : (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                if ((n4 += n5) < n2 - n) {
                    int n6 = string.length();
                    j2 = string.length() + 2 + string2.length();
                    if (public_.\u00d500000()) {
                        vector.add(new J(n6, j2, false));
                        string = string + string2 + string3;
                        continue;
                    }
                    vector.add(new J(n6, j2, true));
                    string = string + string2 + string3;
                    continue;
                }
                attributedString = new AttributedString(string);
                for (J j3 : vector) {
                    if (j3.\u00d300000()) {
                        attributedString.addAttribute(TextAttribute.FONT, font, j3.o00000(), j3.new());
                        continue;
                    }
                    attributedString.addAttribute(TextAttribute.FONT, font2, j3.o00000(), j3.new());
                }
                vector = new Vector();
                graphics2D.drawString(attributedString.getIterator(), n, n3 - 3);
                graphics2D.drawLine(n, n3, n2, n3);
                j2 = 0;
                int n7 = 2 + string2.length();
                if (public_.\u00d500000()) {
                    vector.add(new J(j2, n7, false));
                    string = string + string2 + string3;
                    n5 = (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth();
                } else {
                    vector.add(new J(j2, n7, true));
                    string = string + string2 + string3;
                    n5 = (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                }
                string = string2 + string3;
                n3 += 10;
                n4 = n5;
            }
        }
        attributedString = new AttributedString(string);
        for (J j4 : vector) {
            if (j4.\u00d300000()) {
                attributedString.addAttribute(TextAttribute.FONT, font, j4.o00000(), j4.new());
                continue;
            }
            attributedString.addAttribute(TextAttribute.FONT, font2, j4.o00000(), j4.new());
        }
        if (attributedString.getIterator().getEndIndex() > 0) {
            graphics2D.drawString(attributedString.getIterator(), n, n3 - 3);
        }
        graphics2D.drawLine(n, n3, n2, n3);
        n3 += 10;
        while (n3 < 150) {
            graphics2D.drawLine(n, n3, n2, n3);
            n3 += 10;
        }
    }

    private void \u00d3\u00d30000(Graphics2D graphics2D) {
        int n = 348;
        int n2 = 652;
        int n3 = 80;
        graphics2D.drawRoundRect(340, 70, 320, 80, 5, 5);
        String string = "";
        Iterator<public> iterator = this.returnclass.\u00d500000().\u00d500000();
        AttributedString attributedString = null;
        int n4 = 0;
        int n5 = 0;
        Font font = this.o00000(8);
        Font font2 = font.deriveFont(2);
        Vector<J> vector = new Vector<J>();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (public_.\u00f4O0000().Object() || public_.\u00f4O0000() == I.\u00f5\u00f6O000 || public_.\u00f4O0000() == I.O\u00d4O000) continue;
            String[] stringArray = new String[]{public_.oO0000()};
            if (public_ instanceof M) {
                stringArray = public_.oO0000().split(", ");
            }
            for (String string2 : stringArray) {
                int j2;
                String string3 = ", ";
                n5 = public_.\u00d500000() ? (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth() : (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                if ((n4 += n5) < n2 - n) {
                    int n6 = string.length();
                    j2 = string.length() + 2 + string2.length();
                    if (public_.\u00d500000()) {
                        vector.add(new J(n6, j2, false));
                        string = string + string2 + string3;
                        continue;
                    }
                    vector.add(new J(n6, j2, true));
                    string = string + string2 + string3;
                    continue;
                }
                attributedString = new AttributedString(string);
                for (J j3 : vector) {
                    if (j3.\u00d300000()) {
                        attributedString.addAttribute(TextAttribute.FONT, font, j3.o00000(), j3.new());
                        continue;
                    }
                    attributedString.addAttribute(TextAttribute.FONT, font2, j3.o00000(), j3.new());
                }
                vector = new Vector();
                graphics2D.drawString(attributedString.getIterator(), n, n3 - 3);
                graphics2D.drawLine(n, n3, n2, n3);
                j2 = 0;
                int n7 = 2 + string2.length();
                if (public_.\u00d500000()) {
                    vector.add(new J(j2, n7, false));
                    string = string + string2 + string3;
                    n5 = (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth();
                } else {
                    vector.add(new J(j2, n7, true));
                    string = string + string2 + string3;
                    n5 = (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                }
                string = string2 + string3;
                n3 += 10;
                n4 = n5;
            }
        }
        attributedString = new AttributedString(string);
        for (J j4 : vector) {
            if (j4.\u00d300000()) {
                attributedString.addAttribute(TextAttribute.FONT, font, j4.o00000(), j4.new());
                continue;
            }
            attributedString.addAttribute(TextAttribute.FONT, font2, j4.o00000(), j4.new());
        }
        if (attributedString.getIterator().getEndIndex() > 0) {
            graphics2D.drawString(attributedString.getIterator(), n, n3 - 3);
        }
        graphics2D.drawLine(n, n3, n2, n3);
        n3 += 10;
        while (n3 < 150) {
            graphics2D.drawLine(n, n3, n2, n3);
            n3 += 10;
        }
    }
}

