/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.Einstellungen;
import helden.framework.OOoO.K;
import helden.framework.held.B.B.G;
import helden.framework.held.L;
import helden.framework.held.Object.public;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.s_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
extends G {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d6\u00d40000;
    private int \u00d5\u00d40000;

    public A(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00d6\u00d40000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d5\u00d40000 = n;
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(Color.BLACK);
        String string = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).getBackgroudPath();
        File file = new File(this.\u00d400000(string + "hszd1.JPG"));
        if (!file.exists()) {
            this.new((Graphics)graphics2D);
        } else {
            try {
                if (file.exists()) {
                    helden.framework.held.B.B.C.Object object = new helden.framework.held.B.B.C.Object(this.\u00d400000(string + "hszd1.JPG"));
                    object.o00000(graphics2D);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.Oo0000(graphics2D, 58);
            this.oO0000(graphics2D);
            this.OO0000(graphics2D);
        }
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isDrucken(this.new())) {
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                arrayList.add(new A(this.\u00d6\u00d40000, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        int n = this.\u00d6\u00d40000.\u00d5o0000().\u00d300000();
        int n2 = 11;
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
            n2 = 7;
        }
        int n3 = 0;
        for (int i2 = n; i2 > 0; i2 -= n2) {
            ++n3;
        }
        return n3;
    }

    @Override
    public String \u00f400000() {
        return "Zauberbogen " + (this.\u00d5\u00d40000 + 1);
    }

    @Override
    public boolean \u00d400000() {
        return false;
    }

    private void OO0000(Graphics2D graphics2D) {
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString("Asp: ", 40, 413);
        graphics2D.setFont(this.o00000(8));
        for (int i2 = 65; i2 <= 630; i2 += 11) {
            graphics2D.drawRect(i2, 404, 11, 11);
        }
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.\u00d3\u00d30000().interface()), 67, 413);
    }

    private void \u00f500000(Graphics2D graphics2D) {
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString("Asp: ", 20, 423);
        graphics2D.setFont(this.o00000(8));
        for (int i2 = 40; i2 <= 645; i2 += 13) {
            graphics2D.drawRect(i2, 414, 11, 11);
        }
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.\u00d3\u00d30000().interface()), 41, 423);
        graphics2D.drawRoundRect(10, 405, 650, 30, 5, 5);
    }

    private void Oo0000(Graphics2D graphics2D, int n) {
        Object object;
        Object object22;
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        for (Object object22 : this.\u00d6\u00d40000.\u00f5O0000()) {
            if (((P)object22).\u00d400000() == 6) {
                string = string + ((P)object22).toString().substring(18, ((P)object22).toString().length()) + "; ";
            }
            if (((P)object22).\u00d400000() != 5) continue;
            string2 = string2 + ((P)object22).toString().substring(16, ((P)object22).toString().length()) + ";  ";
        }
        object22 = this.\u00d6\u00d40000.\u00d500000().\u00d500000();
        while (object22.hasNext()) {
            object = (helden.framework.C.public)object22.next();
            if (((helden.framework.C.public)object).\u00f4O0000().equals(I.\u00f5\u00f6O000)) {
                string3 = string3 + ((helden.framework.C.public)object).oO0000().substring(23, ((helden.framework.C.public)object).oO0000().length()) + ";  ";
            }
            if (!((helden.framework.C.public)object).\u00f4O0000().equals(I.O\u00d4O000)) continue;
            string4 = string4 + ((helden.framework.C.public)object).oO0000().substring(26, ((helden.framework.C.public)object).oO0000().length()) + ";  ";
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
        String[] stringArray = ((String)object).split("; ");
        String string5 = "";
        String string6 = "";
        boolean bl = false;
        for (String string7 : stringArray) {
            if (this.o00000(string5 = string5 + string7 + "; ", graphics2D) < 597.0f) {
                string6 = string5;
                continue;
            }
            graphics2D.drawString(string6, 42, n - 2);
            graphics2D.drawLine(41, n + 1, 639, n + 1);
            n += 15;
            string6 = string5 = string7 + "; ";
            bl = true;
        }
        graphics2D.drawString(string6, 42, n - 2);
        graphics2D.drawLine(41, n + 1, 639, n + 1);
        if (!bl) {
            graphics2D.drawLine(41, (n += 15) + 1, 639, n + 1);
        }
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("MU:", 42, n += 15);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.whilewhilesuper)), 77, n);
        graphics2D.drawString("KL:", 107, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.newwhilesuper)), 142, n);
        graphics2D.drawString("IN:", 172, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.\u00f8\u00f4\u00d2000)), 207, n);
        graphics2D.drawString("CH:", 237, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.\u00d5\u00f4\u00d2000)), 272, n);
        graphics2D.drawString("FF:", 302, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.O\u00f5\u00d2000)), 337, n);
        graphics2D.drawString("GE:", 367, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.\u00f4\u00f4\u00d2000)), 402, n);
        graphics2D.drawString("KO:", 432, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.returnwhilesuper)), 467, n);
        graphics2D.drawString("KK:", 497, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.privatedosuper)), 532, n);
        graphics2D.drawString("MR:", 562, n);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d40000.o00000(b_0.\u00d8\u00f5\u00d2000)), 597, n);
    }

    private void \u00f800000(Graphics2D graphics2D) {
        this.Oo0000(graphics2D, 25);
        graphics2D.drawRoundRect(40, 10, 600, 50, 5, 5);
    }

    private void new(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.\u00f800000(graphics2D);
        this.if(graphics2D);
        this.\u00f500000(graphics2D);
        graphics2D.drawRoundRect(5, 5, 660, 440, 5, 5);
    }

    private void oO0000(Graphics2D graphics2D) {
        KonkreterZauber konkreterZauber;
        graphics2D.setFont(this.o00000(7));
        int n = 40;
        int n2 = 640;
        int n3 = 118;
        int n4 = -9;
        graphics2D.drawString("SE", n + 3, n3 - 2);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawString("Zaubername", 65, n3 - 2);
        graphics2D.drawLine(240, n3, 240, n3 - 10);
        graphics2D.drawString("Probe", 245, n3 - 2);
        graphics2D.setFont(this.o00000(7));
        graphics2D.drawLine(320, n3, 320, n3 + n4);
        this.o00000(graphics2D, "ZfW", 320, 338, n3 - 2);
        graphics2D.drawLine(338, n3, 338, n3 + n4);
        graphics2D.drawLine(357, n3, 357, n3 + n4);
        graphics2D.drawLine(376, n3, 376, n3 + n4);
        graphics2D.drawLine(395, n3, 395, n3 + n4);
        graphics2D.setFont(this.o00000(9));
        this.o00000(graphics2D, "ZD", 395, 475, n3 - 2);
        graphics2D.drawLine(475, n3, 475, n3 + n4);
        graphics2D.drawString("Merkmale", 480, n3 - 2);
        graphics2D.drawLine(580, n3, 580, n3 + n4);
        graphics2D.drawString("K", 583, n3 - 2);
        graphics2D.drawLine(590, n3, 590, n3 + n4);
        graphics2D.drawString("Rep", 595, n3 - 2);
        graphics2D.drawLine(620, n3, 620, n3 + n4);
        graphics2D.drawString("H", 623, n3 - 2);
        graphics2D.drawLine(630, n3, 630, n3 + n4);
        graphics2D.drawString("L", 633, n3 - 2);
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Spezialisierung", 65, (n3 += 11) - 2);
        graphics2D.drawLine(n + 130, n3, n + 130, n3 - 11);
        this.o00000(graphics2D, "Kosten", n + 130, n + 200, n3 - 2);
        graphics2D.drawLine(n + 200, n3, n + 200, n3 - 11);
        this.o00000(graphics2D, "Reichweite", n + 200, n + 280, n3 - 2);
        graphics2D.drawLine(n + 280, n3, n + 280, n3 - 11);
        this.o00000(graphics2D, "WD", n + 280, 395, n3 - 2);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawLine(395, n3, 395, n3 - 11);
        graphics2D.drawString("Anmerkungen", 400, n3 - 2);
        int n5 = 11;
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
            graphics2D.drawLine(n, n3, n2, n3);
            n5 = 7;
            graphics2D.drawLine(n + 20, (n3 += 12) - 11, n + 20, n3 - 21);
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n, n3 + 1, n2, n3 + 1);
            ++n3;
        } else {
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 20, n3 - 11, n + 20, n3 - 21);
            graphics2D.drawLine(n, n3 + 1, n2, n3 + 1);
        }
        L l2 = this.\u00d6\u00d40000.\u00d5o0000();
        List<KonkreterZauber> list = l2.\u00d200000();
        Collections.sort(list, public.o00000());
        Iterator<KonkreterZauber> iterator = list.iterator();
        int n6 = this.\u00d5\u00d40000;
        int n7 = 0;
        while (n6 > 0) {
            konkreterZauber = iterator.next();
            if (++n7 < n5) continue;
            --n6;
            n7 = 0;
        }
        int n8 = 0;
        while (n8 < n5 && iterator.hasNext()) {
            Object object;
            ++n8;
            n3 += 11;
            graphics2D.setFont(this.o00000(11));
            konkreterZauber = iterator.next();
            if (this.\u00d6\u00d40000.\u00d5o0000().\u00d400000(konkreterZauber).booleanValue()) {
                graphics2D.drawString("X", n, n3 - 2);
            }
            graphics2D.setFont(this.o00000(9));
            String string = konkreterZauber.getZaubername();
            if (!konkreterZauber.getVariante().equals("")) {
                string = string + " [" + konkreterZauber.getVariante() + "]";
            }
            graphics2D.drawString(string, 65, n3 - 2);
            graphics2D.drawLine(240, n3, 240, n3 + n4);
            String string2 = konkreterZauber.toStringKomplett();
            string2 = string2.substring(string2.length() - 10, string2.length());
            this.o00000(graphics2D, string2 + " " + konkreterZauber.getModMR(), 240, 320, n3 - 2);
            graphics2D.drawLine(320, n3, 320, n3 + n4);
            try {
                this.o00000(graphics2D, "" + l2.\u00d400000(konkreterZauber), 320, 338, n3 - 2);
            }
            catch (Exception exception) {
                graphics2D.drawString("?", 205, n3 - 2);
            }
            ZauberInfos zauberInfos = this.\u00d6\u00d40000.\u00d5o0000().\u00d600000(konkreterZauber);
            graphics2D.drawLine(338, n3, 338, n3 + n4);
            graphics2D.drawLine(357, n3, 357, n3 + n4);
            graphics2D.drawLine(376, n3, 376, n3 + n4);
            graphics2D.drawLine(395, n3, 395, n3 + n4);
            this.o00000(graphics2D, zauberInfos.getZauberdauer(), 470, n3 - 2);
            graphics2D.drawLine(475, n3, 475, n3 + n4);
            graphics2D.drawString("" + konkreterZauber.getMerkmaleString(), 480, n3 - 2);
            graphics2D.drawLine(580, n3, 580, n3 + n4);
            graphics2D.drawString(konkreterZauber.getSteigernKategorie().toString(), 583, n3 - 2);
            graphics2D.drawLine(590, n3, 590, n3 + n4);
            K k2 = konkreterZauber.getRep();
            graphics2D.drawString("" + k2.super(), 595, n3 - 2);
            graphics2D.drawLine(620, n3, 620, n3 + n4);
            if (l2.\u00d200000(konkreterZauber)) {
                graphics2D.drawString("X", 622, n3 - 2);
            }
            graphics2D.drawLine(630, n3, 630, n3 + n4);
            String string3 = this.\u00d6\u00d40000.new(konkreterZauber).toString();
            if (string3.equals("A+")) {
                object = this.\u00d6\u00d40000.new(konkreterZauber);
                int n9 = 1;
                while (((s_0)object).\u00d400000() < 0) {
                    ++n9;
                    object = ((s_0)object).\u00d300000();
                }
                string3 = "A";
                if (n9 > 1) {
                    graphics2D.setFont(this.o00000(5));
                    graphics2D.drawString("" + n9, 639, n3 - 5);
                } else {
                    graphics2D.setFont(this.o00000(6));
                    graphics2D.drawString("+", 639, n3 - 5);
                }
                graphics2D.setFont(this.o00000(9));
                graphics2D.drawString(string3, 633, n3 - 2);
            } else {
                graphics2D.drawString(string3, 633, n3 - 2);
            }
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.setFont(this.o00000(8));
            n3 += 12;
            object = "";
            Iterator<String> iterator2 = this.\u00d6\u00d40000.\u00f5O0000().o00000(konkreterZauber).iterator();
            while (iterator2.hasNext()) {
                object = (String)object + iterator2.next() + "; ";
            }
            graphics2D.drawString((String)object, n + 3, n3 - 2);
            graphics2D.drawLine(n + 130, n3, n + 130, n3 - 11);
            this.o00000(graphics2D, zauberInfos.getKosten(), n + 195, n3 - 2);
            graphics2D.drawLine(n + 200, n3, n + 200, n3 - 11);
            this.o00000(graphics2D, zauberInfos.getReichweite(), n + 275, n3 - 2);
            graphics2D.drawLine(n + 280, n3, n + 280, n3 - 11);
            this.o00000(graphics2D, zauberInfos.getWirkungsdauer(), 390, n3 - 2);
            graphics2D.drawLine(395, n3, 395, n3 - 11);
            String string4 = zauberInfos.getAnmerkungen();
            if (Einstellungen.getInstance().isZauberQuelledrucken()) {
                string4 = konkreterZauber.getQuelle() + " " + string4;
            }
            graphics2D.drawString(string4, 398, n3 - 2);
            if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
                graphics2D.drawLine(n, n3, n2, n3);
                this.o00000(graphics2D, zauberInfos.getKommentar(), n2, (n3 += 11) - 2);
                graphics2D.drawLine(n + 20, n3 - 23, n + 20, n3 - 34);
                graphics2D.drawLine(n, n3, n2, n3);
                continue;
            }
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 20, n3 - 12, n + 20, n3 - 21);
        }
        while (n3 < 380) {
            graphics2D.drawLine(240, n3 += 11, 240, n3 + n4);
            graphics2D.drawLine(320, n3, 320, n3 + n4);
            graphics2D.drawLine(338, n3, 338, n3 + n4);
            graphics2D.drawLine(357, n3, 357, n3 + n4);
            graphics2D.drawLine(376, n3, 376, n3 + n4);
            graphics2D.drawLine(395, n3, 395, n3 + n4);
            graphics2D.drawLine(435, n3, 435, n3 + n4);
            graphics2D.drawLine(475, n3, 475, n3 + n4);
            graphics2D.drawLine(620, n3, 620, n3 + n4);
            graphics2D.drawLine(630, n3, 630, n3 + n4);
            graphics2D.drawLine(n + 20, n3, n2, n3);
            graphics2D.drawLine(n + 100, n3 += 12, n + 100, n3 - 11);
            graphics2D.drawLine(n + 200, n3, n + 200, n3 - 11);
            graphics2D.drawLine(n + 280, n3, n + 280, n3 - 11);
            graphics2D.drawLine(395, n3, 395, n3 - 11);
            if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
                graphics2D.drawLine(n, n3, n2, n3);
                graphics2D.drawLine(n + 20, (n3 += 11) - 23, n + 20, n3 - 34);
                graphics2D.drawLine(n, n3, n2, n3);
                continue;
            }
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 20, n3 - 12, n + 20, n3 - 21);
        }
    }

    private void if(Graphics2D graphics2D) {
        KonkreterZauber konkreterZauber;
        graphics2D.setFont(this.o00000(7));
        int n = 15;
        int n2 = 655;
        int n3 = 85;
        int n4 = -9;
        graphics2D.drawString("SE", n + 3, n3 - 2);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawString("Zaubername", 65, n3 - 2);
        graphics2D.drawLine(240, n3, 240, n3 - 10);
        graphics2D.drawString("Probe", 245, n3 - 2);
        graphics2D.setFont(this.o00000(7));
        graphics2D.drawLine(320, n3, 320, n3 + n4);
        this.o00000(graphics2D, "ZfW", 320, 338, n3 - 2);
        graphics2D.drawLine(338, n3, 338, n3 + n4);
        graphics2D.drawLine(357, n3, 357, n3 + n4);
        graphics2D.drawLine(376, n3, 376, n3 + n4);
        graphics2D.drawLine(395, n3, 395, n3 + n4);
        graphics2D.setFont(this.o00000(9));
        this.o00000(graphics2D, "ZD", 395, 475, n3 - 2);
        graphics2D.drawLine(475, n3, 475, n3 + n4);
        graphics2D.drawString("Merkmale", 480, n3 - 2);
        graphics2D.drawLine(590, n3, 590, n3 + n4);
        graphics2D.drawString("K", 593, n3 - 2);
        graphics2D.drawLine(600, n3, 600, n3 + n4);
        graphics2D.drawString("Rep", 605, n3 - 2);
        graphics2D.drawLine(630, n3, 630, n3 + n4);
        graphics2D.drawString("H", 633, n3 - 2);
        graphics2D.drawLine(640, n3, 640, n3 + n4);
        graphics2D.drawString("L", 643, n3 - 2);
        graphics2D.drawLine(n, n3, n2, n3);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("Spezialisierung", 65, (n3 += 11) - 2);
        graphics2D.drawLine(n + 155, n3, n + 155, n3 - 11);
        this.o00000(graphics2D, "Kosten", n + 155, n + 225, n3 - 2);
        graphics2D.drawLine(n + 225, n3, n + 225, n3 - 11);
        this.o00000(graphics2D, "Reichweite", n + 225, n + 305, n3 - 2);
        graphics2D.drawLine(n + 305, n3, n + 305, n3 - 11);
        this.o00000(graphics2D, "WD", n + 305, 395, n3 - 2);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawLine(395, n3, 395, n3 - 11);
        graphics2D.drawString("Anmerkungen", 400, n3 - 2);
        int n5 = 11;
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
            graphics2D.drawLine(n, n3, n2, n3);
            n5 = 7;
            graphics2D.drawLine(n + 20, (n3 += 12) - 11, n + 20, n3 - 21);
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n, n3 + 1, n2, n3 + 1);
            ++n3;
        } else {
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 20, n3 - 11, n + 20, n3 - 21);
            graphics2D.drawLine(n, n3 + 1, n2, n3 + 1);
        }
        L l2 = this.\u00d6\u00d40000.\u00d5o0000();
        List<KonkreterZauber> list = l2.\u00d200000();
        Collections.sort(list, public.o00000());
        Iterator<KonkreterZauber> iterator = list.iterator();
        int n6 = 0;
        int n7 = this.\u00d5\u00d40000;
        while (n7 > 0) {
            konkreterZauber = iterator.next();
            if (++n6 < n5) continue;
            --n7;
            n6 = 0;
        }
        int n8 = 0;
        while (n8 < n5 && iterator.hasNext()) {
            Object object;
            ++n8;
            n3 += 14;
            graphics2D.setFont(this.o00000(11));
            konkreterZauber = iterator.next();
            if (this.\u00d6\u00d40000.\u00d5o0000().\u00d400000(konkreterZauber).booleanValue()) {
                graphics2D.drawString("X", n, n3 - 2);
            }
            graphics2D.setFont(this.o00000(9));
            String string = konkreterZauber.getZaubername();
            if (!konkreterZauber.getVariante().equals("")) {
                string = string + " [" + konkreterZauber.getVariante() + "]";
            }
            graphics2D.drawString(string, 65, n3 - 2);
            graphics2D.drawLine(240, n3, 240, n3 + n4);
            String string2 = konkreterZauber.toStringKomplett();
            string2 = string2.substring(string2.length() - 10, string2.length());
            this.o00000(graphics2D, string2 + " " + konkreterZauber.getModMR(), 240, 320, n3 - 2);
            graphics2D.drawLine(320, n3, 320, n3 + n4);
            try {
                this.o00000(graphics2D, "" + l2.\u00d400000(konkreterZauber), 320, 338, n3 - 2);
            }
            catch (Exception exception) {
                graphics2D.drawString("?", 205, n3 - 2);
            }
            ZauberInfos zauberInfos = this.\u00d6\u00d40000.\u00d5o0000().\u00d600000(konkreterZauber);
            graphics2D.drawLine(338, n3, 338, n3 + n4);
            graphics2D.drawLine(357, n3, 357, n3 + n4);
            graphics2D.drawLine(376, n3, 376, n3 + n4);
            graphics2D.drawLine(395, n3, 395, n3 + n4);
            this.o00000(graphics2D, zauberInfos.getZauberdauer(), 473, n3 - 2);
            graphics2D.drawLine(475, n3, 475, n3 + n4);
            graphics2D.drawString("" + konkreterZauber.getMerkmaleString(), 478, n3 - 2);
            graphics2D.drawLine(590, n3, 590, n3 + n4);
            graphics2D.drawString(konkreterZauber.getSteigernKategorie().toString(), 593, n3 - 2);
            graphics2D.drawLine(600, n3, 600, n3 + n4);
            K k2 = konkreterZauber.getRep();
            graphics2D.drawString("" + k2.super(), 605, n3 - 2);
            graphics2D.drawLine(630, n3, 630, n3 + n4);
            if (l2.\u00d200000(konkreterZauber)) {
                graphics2D.drawString("X", 632, n3 - 2);
            }
            graphics2D.drawLine(640, n3, 640, n3 + n4);
            String string3 = this.\u00d6\u00d40000.new(konkreterZauber).toString();
            if (string3.equals("A+")) {
                object = this.\u00d6\u00d40000.new(konkreterZauber);
                int n9 = 1;
                while (((s_0)object).\u00d400000() < 0) {
                    ++n9;
                    object = ((s_0)object).\u00d300000();
                }
                string3 = "A";
                if (n9 > 1) {
                    string3 = "A";
                    graphics2D.setFont(this.o00000(5));
                    graphics2D.drawString("" + n9, 649, n3 - 5);
                } else {
                    graphics2D.setFont(this.o00000(6));
                    graphics2D.drawString("+", 649, n3 - 5);
                }
                graphics2D.setFont(this.o00000(9));
                graphics2D.drawString(string3, 643, n3 - 2);
            } else {
                graphics2D.drawString(string3, 643, n3 - 2);
            }
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.setFont(this.o00000(8));
            n3 += 12;
            object = "";
            Iterator<String> iterator2 = this.\u00d6\u00d40000.\u00f5O0000().o00000(konkreterZauber).iterator();
            while (iterator2.hasNext()) {
                object = (String)object + iterator2.next() + "; ";
            }
            graphics2D.setFont(this.o00000(9));
            graphics2D.drawLine(395, n3, 395, n3 - 11);
            graphics2D.drawString((String)object, n + 3, n3 - 2);
            graphics2D.drawLine(n + 155, n3, n + 155, n3 - 11);
            this.o00000(graphics2D, zauberInfos.getKosten(), n + 223, n3 - 2);
            graphics2D.drawLine(n + 225, n3, n + 225, n3 - 11);
            this.o00000(graphics2D, zauberInfos.getReichweite(), n + 303, n3 - 2);
            graphics2D.drawLine(n + 305, n3, n + 305, n3 - 11);
            this.o00000(graphics2D, zauberInfos.getWirkungsdauer(), 393, n3 - 2);
            graphics2D.drawLine(395, n3, 395, n3 - 11);
            String string4 = zauberInfos.getAnmerkungen();
            if (Einstellungen.getInstance().isZauberQuelledrucken()) {
                string4 = konkreterZauber.getQuelle() + " " + string4;
            }
            graphics2D.drawString(string4, 398, n3 - 2);
            if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
                graphics2D.drawLine(n, n3, n2, n3);
                this.o00000(graphics2D, zauberInfos.getKommentar(), n2, (n3 += 11) - 2);
                graphics2D.drawLine(n + 20, n3 - 23, n + 20, n3 - 34);
                graphics2D.drawLine(n, n3, n2, n3);
                continue;
            }
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 20, n3 - 12, n + 20, n3 - 21);
        }
        while (n3 < 380) {
            graphics2D.drawLine(240, n3 += 14, 240, n3 - 10);
            graphics2D.drawLine(320, n3, 320, n3 + n4);
            graphics2D.drawLine(338, n3, 338, n3 + n4);
            graphics2D.drawLine(357, n3, 357, n3 + n4);
            graphics2D.drawLine(376, n3, 376, n3 + n4);
            graphics2D.drawLine(395, n3, 395, n3 + n4);
            graphics2D.drawLine(475, n3, 475, n3 + n4);
            graphics2D.drawLine(590, n3, 590, n3 + n4);
            graphics2D.drawLine(600, n3, 600, n3 + n4);
            graphics2D.drawLine(630, n3, 630, n3 + n4);
            graphics2D.drawLine(640, n3, 640, n3 + n4);
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 155, n3 += 12, n + 155, n3 - 11);
            graphics2D.drawLine(n + 225, n3, n + 225, n3 - 11);
            graphics2D.drawLine(n + 305, n3, n + 305, n3 - 11);
            graphics2D.drawLine(395, n3, 395, n3 - 11);
            if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d40000.\u00f4o0000()).isZauberkommentar()) {
                graphics2D.drawLine(n, n3, n2, n3);
                graphics2D.drawLine(n + 20, (n3 += 12) - 23, n + 20, n3 - 34);
                graphics2D.drawLine(n, n3, n2, n3);
                continue;
            }
            graphics2D.drawLine(n, n3, n2, n3);
            graphics2D.drawLine(n + 20, n3 - 12, n + 20, n3 - 21);
        }
        graphics2D.drawRoundRect(10, 70, 650, 320, 5, 5);
    }
}

