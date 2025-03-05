/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.A;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.Einstellungen;
import helden.framework.OOoO.K;
import helden.framework.held.B.B.G;
import helden.framework.held.L;
import helden.framework.held.Object.public;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends G {
    private int \u00d6\u00f50000;
    private int \u00d8\u00f50000 = -1;

    public oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00d6O0000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d6\u00f50000 = n;
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.o00000(graphics2D);
        this.\u00f4\u00d30000(graphics2D);
        this.StringObject(graphics2D);
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isAspLeiste()) {
            this.\u00f5\u00d30000(graphics2D);
        }
        if (!this.return()) {
            graphics2D.drawRoundRect(5, 5, 440, 665, 5, 5);
        }
        this.new(graphics2D);
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isDrucken(this.new())) {
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                arrayList.add(new oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this.\u00d6O0000, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        L l2 = this.\u00d6O0000.\u00d5o0000();
        List<KonkreterZauber> list = l2.\u00d200000();
        if (list.size() == 0) {
            return 0;
        }
        Collections.sort(list, public.o00000());
        Iterator<KonkreterZauber> iterator = list.iterator();
        int n = 1;
        int n2 = this.\u00d3o0000();
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            int n3 = this.o00000(konkreterZauber);
            if (n2 - n3 < 0) {
                n2 = this.\u00d3o0000() - n3;
                ++n;
                continue;
            }
            n2 -= n3;
        }
        return n;
    }

    @Override
    public String \u00f400000() {
        return "ZauberbogenN " + (this.\u00d6\u00f50000 + 1);
    }

    @Override
    public boolean \u00d300000() {
        return true;
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private void \u00f5\u00d30000(Graphics2D graphics2D) {
        this.o00000(graphics2D, 10, 640, 430, 25, 5, 5);
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString("Asp: ", 20, 654);
        graphics2D.setFont(this.o00000(8));
        for (int i2 = 40; i2 <= 415; i2 += 13) {
            graphics2D.drawRect(i2, 645, 11, 11);
        }
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface()), 41, 654);
    }

    private int \u00f4\u00d30000(Graphics2D graphics2D) {
        String string;
        Object object;
        Object object22;
        graphics2D.setFont(this.o00000(12));
        int n = 25;
        this.o00000(graphics2D, 30, 12, 390, 43, 5, 5);
        graphics2D.drawString("MU:" + this.new("" + this.\u00d6O0000.o00000(b_0.whilewhilesuper)), 35, n);
        graphics2D.drawString("KL:" + this.new("" + this.\u00d6O0000.o00000(b_0.newwhilesuper)), 76, n);
        graphics2D.drawString("IN:" + this.new("" + this.\u00d6O0000.o00000(b_0.\u00f8\u00f4\u00d2000)), 117, n);
        graphics2D.drawString("CH:" + this.new("" + this.\u00d6O0000.o00000(b_0.\u00d5\u00f4\u00d2000)), 158, n);
        graphics2D.drawString("FF:" + this.new("" + this.\u00d6O0000.o00000(b_0.O\u00f5\u00d2000)), 199, n);
        graphics2D.drawString("GE:" + this.new("" + this.\u00d6O0000.o00000(b_0.\u00f4\u00f4\u00d2000)), 240, n);
        graphics2D.drawString("KO:" + this.new("" + this.\u00d6O0000.o00000(b_0.returnwhilesuper)), 281, n);
        graphics2D.drawString("KK:" + this.new("" + this.\u00d6O0000.o00000(b_0.privatedosuper)), 322, n);
        n += 12;
        String string2 = "";
        String string3 = "";
        String string4 = "";
        String string5 = "";
        for (Object object22 : this.\u00d6O0000.\u00f5O0000()) {
            if (((P)object22).\u00d400000() == 6) {
                string2 = string2 + ((P)object22).toString().substring(18, ((P)object22).toString().length()) + "; ";
            }
            if (((P)object22).\u00d400000() != 5) continue;
            string3 = string3 + ((P)object22).toString().substring(16, ((P)object22).toString().length()) + ";  ";
        }
        object22 = this.\u00d6O0000.\u00d500000().\u00d500000();
        while (object22.hasNext()) {
            object = (helden.framework.C.public)object22.next();
            if (((helden.framework.C.public)object).\u00f4O0000().equals(I.\u00f5\u00f6O000)) {
                string4 = string4 + ((helden.framework.C.public)object).oO0000().substring(23, ((helden.framework.C.public)object).oO0000().length()) + ";  ";
            }
            if (!((helden.framework.C.public)object).\u00f4O0000().equals(I.O\u00d4O000)) continue;
            string5 = string5 + ((helden.framework.C.public)object).oO0000().substring("Unf\u00e4higkeit f\u00fcr [Merkmal]".length(), ((helden.framework.C.public)object).oO0000().length()).replace("(", "").replace(")", "") + ";  ";
        }
        graphics2D.setFont(this.o00000(8));
        object = "";
        if (!string3.equals("")) {
            object = (String)object + "\nRepr\u00e4sentationen: " + string3;
        }
        if (!string4.equals("")) {
            object = (String)object + "\nBegabungen: " + string4;
        }
        if (!string2.equals("")) {
            object = (String)object + "\nMerkmale: " + string2;
        }
        if (!string5.equals("")) {
            object = (String)object + "\nUnf\u00e4higkeiten: " + string5;
        }
        int n2 = 35;
        int n3 = 412;
        String[] stringArray = ((String)object).toString().split(" ");
        String string6 = string = "";
        for (String string7 : stringArray) {
            if (this.o00000(string6 = string6 + string7 + " ", graphics2D) < (float)(n3 - n2)) {
                string = string6;
                continue;
            }
            String[] stringArray2 = string.split(" ");
            int n4 = n2;
            for (String string8 : stringArray2) {
                if (string8.contains("\n")) {
                    string8 = string8.trim();
                    graphics2D.setFont(this.o00000(8).deriveFont(1));
                    graphics2D.drawString(string8.trim(), n4, n - 1);
                    n4 = (int)((float)n4 + this.o00000(string8, graphics2D));
                    graphics2D.setFont(this.o00000(8));
                    continue;
                }
                graphics2D.drawString(string8.trim() + " ", n4, n - 1);
                n4 = (int)((float)n4 + this.o00000(string8 + " ", graphics2D));
            }
            graphics2D.drawLine(n2, n, n3, n);
            n += 10;
            string = string6 = string7 + " ";
        }
        String[] stringArray3 = string.split(" ");
        int n5 = n2;
        for (String string9 : stringArray3) {
            if (string9.contains("\n")) {
                string9 = string9.trim();
                graphics2D.setFont(this.o00000(8).deriveFont(1));
                graphics2D.drawString(string9.trim(), n5, n - 1);
                n5 = (int)((float)n5 + this.o00000(string9, graphics2D));
                graphics2D.setFont(this.o00000(8));
                continue;
            }
            graphics2D.drawString(string9.trim() + " ", n5, n - 1);
            n5 = (int)((float)n5 + this.o00000(string9 + " ", graphics2D));
        }
        graphics2D.drawLine(n2, n, n3, n);
        return n += 10;
    }

    private void StringObject(Graphics2D graphics2D) {
        graphics2D.setFont(this.o00000(7));
        int n = 15;
        int n2 = 435;
        int n3 = 75;
        int n4 = -9;
        int n5 = n3;
        this.o00000(graphics2D, 10, 60, 430, 25 + this.\u00d3o0000(), 5, 5);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawString("Zaubername", 65, n5 - 2);
        graphics2D.drawLine(160, n5, 160, n5 - 10);
        graphics2D.drawString("Probe", 165, n5 - 2);
        graphics2D.setFont(this.o00000(7));
        graphics2D.drawLine(220, n5, 220, n5 + n4);
        this.o00000(graphics2D, "ZfW", 220, 238, n5 - 2);
        graphics2D.drawLine(238, n5, 238, n5 + n4);
        graphics2D.drawLine(257, n5, 257, n5 + n4);
        graphics2D.drawString("LCD", 269, n5 - 2);
        graphics2D.drawLine(298, n5, 298, n5 + n4);
        graphics2D.setFont(this.o00000(9));
        graphics2D.drawString("Merkmale", 301, n5 - 2);
        graphics2D.drawLine(360, n5, 360, n5 + n4);
        graphics2D.drawString("K", 364, n5 - 2);
        graphics2D.drawLine(375, n5, 375, n5 + n4);
        graphics2D.drawString("Rep", 377, n5 - 2);
        graphics2D.drawLine(395, n5, 395, n5 + n4);
        graphics2D.drawString("H", 398, n5 - 2);
        graphics2D.drawLine(410, n5, 410, n5 + n4);
        graphics2D.drawString("L", 414, n5 - 2);
        graphics2D.drawLine(425, n5, 425, n5 + n4);
        graphics2D.drawLine(n, n5, n2, n5);
        this.o00000(graphics2D, "Kosten", n, n + 100, (n5 += 11) - 2, 9);
        graphics2D.drawLine(n + 100, n5, n + 100, n5 - 10);
        this.o00000(graphics2D, "Reichweite", n + 100, n + 200, n5 - 2, 9);
        graphics2D.drawLine(n + 200, n5, n + 200, n5 - 10);
        this.o00000(graphics2D, "Zauberdauer", n + 200, n + 300, n5 - 2, 9);
        graphics2D.drawLine(n + 300, n5, n + 300, n5 - 10);
        this.o00000(graphics2D, "Wirkungsdauer", n + 300, n + 400, n5 - 2, 9);
        graphics2D.drawLine(n, n5, n2, n5);
        graphics2D.drawLine(n, n5 + 1, n2, n5 + 1);
        L l2 = this.\u00d6O0000.\u00d5o0000();
        List<KonkreterZauber> list = l2.\u00d200000();
        Collections.sort(list, public.o00000());
        int n6 = this.\u00d3o0000();
        KonkreterZauber konkreterZauber = null;
        int n7 = 0;
        ListIterator<KonkreterZauber> listIterator = list.listIterator();
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        while (listIterator.hasNext()) {
            konkreterZauber = listIterator.next();
            int n8 = this.o00000(konkreterZauber);
            if (n6 - n8 < 0) {
                n6 = this.\u00d3o0000() - n8;
                ++n7;
            } else {
                n6 -= n8;
            }
            if (n7 != this.\u00d6\u00f50000) continue;
            arrayList.add(konkreterZauber);
        }
        ListIterator listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            String[] stringArray;
            Object object;
            n5 += 14;
            graphics2D.setFont(this.o00000(11));
            konkreterZauber = (KonkreterZauber)listIterator2.next();
            graphics2D.setFont(this.o00000(9).deriveFont(1));
            String string = konkreterZauber.getZaubername();
            if (!konkreterZauber.getVariante().equals("")) {
                string = string + " [" + konkreterZauber.getVariante() + "]";
            }
            this.o00000(graphics2D, string, 15, 160, n5 - 1, 9, 1);
            graphics2D.setFont(this.o00000(9).deriveFont(1));
            graphics2D.drawLine(160, n5, 160, n5 + n4);
            String string2 = konkreterZauber.toStringKomplett();
            string2 = string2.substring(string2.length() - 10, string2.length());
            graphics2D.setFont(this.o00000(7).deriveFont(1));
            this.o00000(graphics2D, string2 + "" + konkreterZauber.getModMR(), 160, 220, n5 - 2, 7);
            graphics2D.drawLine(220, n5, 220, n5 + n4);
            graphics2D.setFont(this.o00000(9).deriveFont(1));
            try {
                this.o00000(graphics2D, "" + l2.\u00d400000(konkreterZauber), 220, 238, n5 - 2);
            }
            catch (Exception exception) {
                graphics2D.drawString("?", 205, n5 - 2);
            }
            graphics2D.setFont(this.o00000(9));
            graphics2D.drawLine(238, n5, 238, n5 + n4);
            graphics2D.drawLine(257, n5, 257, n5 + n4);
            if (konkreterZauber.getQuelle().length() > 5 && !((String)(object = konkreterZauber.getQuelle().replace(":", " "))).trim().equals("0") && !((String)object).trim().equals("")) {
                this.o00000(graphics2D, (String)object, 258, 297, n5 - 3, 9);
            }
            graphics2D.drawLine(298, n5, 298, n5 + n4);
            this.new(graphics2D, konkreterZauber.getMerkmaleString(), 300, 360, n5 - 2, 8);
            graphics2D.drawLine(360, n5, 360, n5 + n4);
            graphics2D.setFont(this.o00000(9));
            this.o00000(graphics2D, konkreterZauber.getSteigernKategorie().toString(), 360, 375, n5 - 2);
            graphics2D.drawLine(375, n5, 375, n5 + n4);
            object = konkreterZauber.getRep();
            this.o00000(graphics2D, ((K)object).super(), 374, 395, n5 - 2, 9);
            graphics2D.drawLine(395, n5, 395, n5 + n4);
            if (l2.\u00d200000(konkreterZauber)) {
                this.o00000(graphics2D, "X", 395, 410, n5 - 2);
            }
            graphics2D.drawLine(410, n5, 410, n5 + n4);
            String string3 = this.\u00d6O0000.new(konkreterZauber).toString();
            if (string3.equals("A+")) {
                stringArray = this.\u00d6O0000.new(konkreterZauber);
                int n9 = 1;
                while (stringArray.\u00d400000() < 0) {
                    ++n9;
                    stringArray = stringArray.\u00d300000();
                }
                string3 = "A";
                graphics2D.setFont(this.o00000(9));
                this.o00000(graphics2D, string3, 410, 420, n5 - 2, 9);
                if (n9 > 1) {
                    graphics2D.setFont(this.o00000(6));
                    graphics2D.drawString("+" + n9, 417, n5 - 5);
                } else {
                    graphics2D.setFont(this.o00000(6));
                    graphics2D.drawString("+", 418, n5 - 5);
                }
            } else {
                graphics2D.setFont(this.o00000(9));
                this.o00000(graphics2D, string3, 410, 425, n5 - 2, 9);
            }
            graphics2D.drawLine(425, n5, 425, n5 + n4);
            if (this.\u00d300000(konkreterZauber) || Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isZauberkommentar()) {
                graphics2D.drawLine(n, n5, n2, n5);
                stringArray = this.\u00d6O0000.\u00d5o0000().\u00d600000(konkreterZauber);
                this.o00000(graphics2D, stringArray.getKosten(), n, n + 100, (n5 += 11) - 2, 9);
                graphics2D.drawLine(n + 100, n5, n + 100, n5 - 10);
                this.o00000(graphics2D, stringArray.getReichweite(), n + 100, n + 200, n5 - 2, 9);
                graphics2D.drawLine(n + 200, n5, n + 200, n5 - 10);
                this.o00000(graphics2D, stringArray.getZauberdauer(), n + 200, n + 300, n5 - 2, 9);
                graphics2D.drawLine(n + 300, n5, n + 300, n5 - 10);
                this.o00000(graphics2D, stringArray.getWirkungsdauer(), n + 300, n + 400, n5 - 2, 9);
            }
            if (this.new(konkreterZauber)) {
                graphics2D.drawLine(n, n5, n2, n5);
                n5 += 11;
                graphics2D.setFont(this.o00000(9));
                stringArray = this.\u00d400000(konkreterZauber).split(" ");
                String string4 = "";
                String string5 = "";
                for (String string6 : stringArray) {
                    if (this.o00000(string4 = string4 + string6 + " ", graphics2D) < (float)(n2 - n)) {
                        string5 = string4;
                        continue;
                    }
                    graphics2D.drawString(string5, n, n5 - 1);
                    graphics2D.drawLine(n, n5, n2, n5);
                    n5 += 10;
                    string5 = string4 = string6 + " ";
                }
                graphics2D.drawString(string5, n, n5 - 1);
                graphics2D.drawLine(n, n5, n2, n5);
                n5 += 5;
            }
            graphics2D.setStroke(new BasicStroke(1.7f));
            graphics2D.drawLine(n, n5, n2, n5);
            graphics2D.setStroke(new BasicStroke(1.0f));
        }
        while (n5 < 60 + this.\u00d3o0000()) {
            graphics2D.drawLine(160, n5 += 14, 160, n5 - 10);
            graphics2D.drawLine(220, n5, 220, n5 + n4);
            graphics2D.drawLine(238, n5, 238, n5 + n4);
            graphics2D.drawLine(257, n5, 257, n5 + n4);
            graphics2D.drawLine(298, n5, 298, n5 + n4);
            graphics2D.drawLine(360, n5, 360, n5 + n4);
            graphics2D.drawLine(375, n5, 375, n5 + n4);
            graphics2D.drawLine(395, n5, 395, n5 + n4);
            graphics2D.drawLine(410, n5, 410, n5 + n4);
            graphics2D.drawLine(425, n5, 425, n5 + n4);
            graphics2D.drawLine(n, n5, n2, n5);
        }
    }

    private String \u00d400000(KonkreterZauber konkreterZauber) {
        String string = "";
        Iterator<String> iterator = this.\u00d6O0000.\u00f5O0000().o00000(konkreterZauber).iterator();
        while (iterator.hasNext()) {
            string = string + iterator.next() + "; ";
        }
        ZauberInfos zauberInfos = this.\u00d6O0000.\u00d5o0000().\u00d600000(konkreterZauber);
        string = string + " " + zauberInfos.getAnmerkungen();
        string = string + " " + zauberInfos.getKommentar();
        return string;
    }

    private int \u00d3o0000() {
        if (this.\u00d8\u00f50000 == -1) {
            this.\u00d8\u00f50000 = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isAspLeiste() ? 550 : 580;
        }
        return this.\u00d8\u00f50000;
    }

    private boolean new(KonkreterZauber konkreterZauber) {
        ZauberInfos zauberInfos = this.\u00d6O0000.\u00d5o0000().\u00d600000(konkreterZauber);
        int n = this.\u00d6O0000.\u00f5O0000().o00000(konkreterZauber).size();
        if (n != 0) {
            return true;
        }
        if (!zauberInfos.getKommentar().trim().equals("")) {
            return true;
        }
        return !zauberInfos.getAnmerkungen().trim().equals("");
    }

    private boolean \u00d300000(KonkreterZauber konkreterZauber) {
        ZauberInfos zauberInfos = this.\u00d6O0000.\u00d5o0000().\u00d600000(konkreterZauber);
        if (!zauberInfos.getKosten().trim().equals("")) {
            return true;
        }
        if (!zauberInfos.getReichweite().trim().equals("")) {
            return true;
        }
        if (!zauberInfos.getWirkungsdauer().trim().equals("")) {
            return true;
        }
        return !zauberInfos.getZauberdauer().trim().equals("");
    }

    private int o00000(KonkreterZauber konkreterZauber) {
        int n = 14;
        Graphics2D graphics2D = (Graphics2D)helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new();
        int n2 = 410;
        if (this.\u00d300000(konkreterZauber) || Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isZauberkommentar()) {
            n += 11;
        }
        if (this.new(konkreterZauber)) {
            n += 11;
            String[] stringArray = this.\u00d400000(konkreterZauber).split(" ");
            String string = "";
            for (String string2 : stringArray) {
                if (this.o00000(string = string + string2 + " ", graphics2D) < (float)n2) continue;
                n += 10;
                string = string2 + " ";
            }
            n += 5;
        }
        return n;
    }
}

