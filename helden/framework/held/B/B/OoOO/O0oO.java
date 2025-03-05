/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.void;
import helden.framework.Einstellungen;
import helden.framework.held.B.B.C.Object;
import helden.framework.held.B.B.C.String;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0oO
extends G {
    private int \u00f6\u00d60000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f5\u00d60000;
    private List<String> \u00f8\u00d60000 = new ArrayList<String>();

    public O0oO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00f5\u00d60000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00f6\u00d60000 = n;
        this.\u00d300000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setFont(this.o00000(10));
        java.lang.String string = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d60000.\u00f4o0000()).getBackgroudPath();
        File file = new File(this.\u00d400000(string + "hsnd1.JPG"));
        if (!file.exists()) {
            this.if(graphics2D);
        } else {
            try {
                Object object = new Object(this.\u00d400000(string + "hsnd1.JPG"));
                object.o00000(graphics2D);
            }
            catch (Exception exception) {
                // empty catch block
            }
            int n = 38;
            this.\u00d400000(graphics2D, n, 680 - n, 53, 410);
        }
    }

    public int \u00f8O0000() {
        int n = 38;
        return this.\u00d400000((Graphics2D)oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new(), n, 680 - n, 57, 440) + 1;
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00f5\u00d60000.\u00f4o0000()).isDrucken(this.new())) {
            if (this.\u00f8\u00d60000.size() <= 3) {
                return arrayList;
            }
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                arrayList.add(new O0oO(this.\u00f5\u00d60000, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        return this.\u00f8O0000();
    }

    @Override
    public java.lang.String \u00f400000() {
        return "Kommentarbogen " + (this.\u00f6\u00d60000 + 1);
    }

    @Override
    public boolean \u00d400000() {
        return false;
    }

    private List<String> \u00d300000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        java.lang.Object object;
        oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().o00000();
        Font font = this.o00000(13).deriveFont(1);
        Font font2 = this.o00000(9).deriveFont(1);
        this.\u00f8\u00d60000 = new ArrayList<String>();
        String string = new String("Vorteile", "", font);
        string.\u00d200000(640);
        this.\u00f8\u00d60000.add(string);
        boolean bl = false;
        Iterator<public> iterator = this.\u00f5\u00d60000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            java.lang.Object object2;
            public public_ = iterator.next();
            if (public_.\u00d500000() && !bl) {
                string = new String("Nachteile", "", font);
                string.\u00d200000(640);
                this.\u00f8\u00d60000.add(string);
                bl = true;
            }
            if (public_ instanceof M) {
                object = (M)public_;
                for (java.lang.Object t : ((private)object).intsuper()) {
                    object2 = this.\u00f5\u00d60000.Stringsuper().o00000(public_.toString() + " " + t.toString());
                    if (object2 == null) continue;
                    string = new String(public_.toString() + " (" + t.toString() + "):", (java.lang.String)object2, font2);
                    string.\u00d200000(640);
                    this.\u00f8\u00d60000.add(string);
                }
                continue;
            }
            if (public_ instanceof J) {
                object = (J)public_;
                object2 = this.\u00f5\u00d60000.Stringsuper().o00000(public_.toString());
                if (object2 == null) continue;
                string = new String(((J)object).oO0000(), (java.lang.String)object2, font2);
                string.\u00d200000(640);
                this.\u00f8\u00d60000.add(string);
                continue;
            }
            object2 = this.\u00f5\u00d60000.Stringsuper().o00000(public_.toString());
            if (object2 == null) continue;
            string = new String(public_.toString() + ":", (java.lang.String)object2, font2);
            string.\u00d200000(640);
            this.\u00f8\u00d60000.add(string);
        }
        string = new String("Sonderfertigkeiten", "", font);
        string.\u00d200000(640);
        this.\u00f8\u00d60000.add(string);
        for (java.lang.Object object2 : this.\u00f5\u00d60000.\u00f5O0000()) {
            if (object2 instanceof void) {
                object = (void)object2;
                for (java.lang.Object t : ((void)object).nullObject()) {
                    java.lang.String string2 = ((void)object).\u00f500000() + " (" + t.toString() + ")";
                    java.lang.String string3 = this.\u00f5\u00d60000.Stringsuper().o00000(string2);
                    this.new(((void)object).\u00f500000() + ":", " (" + t.toString() + ") ", string3);
                }
                continue;
            }
            object = this.\u00f5\u00d60000.Stringsuper().o00000(((P)object2).toString());
            this.new(((P)object2).toString() + ":", " ", (java.lang.String)object);
        }
        return this.\u00f8\u00d60000;
    }

    private int \u00d400000(Graphics2D graphics2D, int n, int n2, int n3, int n4) {
        Font font = this.o00000(9).deriveFont(0);
        int n5 = n3;
        graphics2D.setFont(font);
        int n6 = 0;
        for (String string : this.\u00f8\u00d60000) {
            string.o00000(graphics2D);
            int n7 = string.\u00d600000();
            if (n4 - n3 - (n7 * 10 + 5) < 0) {
                if (n6 == this.\u00f6\u00d60000) {
                    while (n3 < n4) {
                        graphics2D.drawLine(n, n3 += 10, n2, n3);
                    }
                }
                n3 = n5;
                ++n6;
            }
            if (n6 == this.\u00f6\u00d60000) {
                for (int i2 = 0; i2 < string.\u00d400000().size(); ++i2) {
                    n3 += 10;
                    int n8 = 0;
                    if (i2 == 0) {
                        graphics2D.setFont(string.Object());
                        graphics2D.drawString(string.\u00d400000().get(0), n, (n3 += 5) - 2);
                        n8 = (int)this.o00000(string.\u00d400000().get(0), graphics2D);
                        graphics2D.setFont(font);
                        graphics2D.drawString(string.\u00d400000().get(1), n + n8 + 5, n3 - 2);
                        graphics2D.drawLine(n, n3, n2, n3);
                        ++i2;
                        continue;
                    }
                    graphics2D.drawString(string.\u00d400000().get(i2), n, n3 - 2);
                    graphics2D.drawLine(n, n3, n2, n3);
                }
            } else {
                n3 += n7 * 10 + 5;
            }
            if (this.\u00f8\u00d60000.get(this.\u00f8\u00d60000.size() - 1) != string || n6 != this.\u00f6\u00d60000) continue;
            while (n3 < n4) {
                graphics2D.drawLine(n, n3 += 10, n2, n3);
            }
        }
        return n6;
    }

    private void if(Graphics graphics) {
        int n = 20;
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.\u00d400000(graphics2D, n, 680 - n, 25, 440);
        graphics2D.drawRoundRect(5, 5, 660, 440, 5, 5);
    }

    private void new(java.lang.String string, java.lang.String string2, java.lang.String string3) {
        Font font = this.o00000(9).deriveFont(1);
        if (string3 != null) {
            String string4 = new String(string, string2 + string3, font);
            string4.\u00d200000(640);
            this.\u00f8\u00d60000.add(string4);
        }
    }
}

