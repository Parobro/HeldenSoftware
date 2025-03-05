/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B;

import helden.framework.DruckSeitenEintrag;
import helden.framework.Einstellungen;
import helden.framework.held.B.B.A.J;
import helden.framework.held.B.B.B;
import helden.framework.held.B.B.C.Object;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class G
extends B {
    private static int \u00d5O0000;
    private static Map<Integer, Font> newsuper;
    protected OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d6O0000 = null;
    private boolean \u00d8O0000 = false;

    public static Font new(int n) {
        int n2;
        Integer n3;
        Font font;
        if (newsuper == null || Einstellungen.getInstance().getFontGroesse() != \u00d5O0000) {
            newsuper = new HashMap<Integer, Font>();
        }
        if ((font = newsuper.get(n3 = new Integer(n2 = n + Einstellungen.getInstance().getFontGroesse()))) == null) {
            if (Einstellungen.getInstance().istEmbeddedFont()) {
                font = new Font("VollkornNum", 0, n2);
            } else {
                String string = Einstellungen.getInstance().getDruckFont().getFontName();
                font = new Font(string, 0, n2);
            }
            newsuper.put(n3, font);
        }
        return font;
    }

    public G() {
        \u00d5O0000 = Einstellungen.getInstance().getFontGroesse();
    }

    public String \u00d400000(String string) {
        File file = new File(string);
        if (file.exists()) {
            return string;
        }
        String string2 = string.substring(0, string.lastIndexOf("."));
        String string3 = string.substring(string.lastIndexOf("."));
        String string4 = string2 + string3.toLowerCase();
        file = new File(string4);
        if (file.exists()) {
            return string4;
        }
        string4 = string2 + string3.toUpperCase();
        file = new File(string4);
        if (file.exists()) {
            return string4;
        }
        return string;
    }

    public void o00000(Graphics2D graphics2D) {
        if (this.return()) {
            DruckSeitenEintrag druckSeitenEintrag = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).getSeitenEinstellungen(this.new());
            Object object = new Object(druckSeitenEintrag.getBildpath());
            if (this.\u00d400000()) {
                object.paint(graphics2D);
            } else {
                object.o00000(graphics2D);
            }
        }
    }

    public abstract void o00000(Graphics var1);

    public void new(Graphics2D graphics2D) {
        if (this.\u00f500000()) {
            return;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DateFormat dateFormat = DateFormat.getDateInstance(3);
        String string = "" + this.\u00d6O0000.\u00f5o0000() + " " + dateFormat.format(gregorianCalendar.getTime());
        if (this instanceof J) {
            string = string + " " + ((K)this.\u00d6O0000).o\u00d40000().toString();
        }
        if (this.\u00d400000()) {
            graphics2D.setFont(this.o00000(5));
            graphics2D.drawString(string, 15, 675);
        } else {
            graphics2D.setFont(this.o00000(5));
            graphics2D.drawString(string, 15, 450);
        }
    }

    public abstract List<G> \u00d500000();

    public abstract int \u00d800000();

    public abstract String \u00f400000();

    public String new() {
        int n = this.\u00f400000().lastIndexOf(" ");
        if (n == -1) {
            return this.\u00f400000();
        }
        return this.\u00f400000().substring(0, n);
    }

    public boolean return() {
        if (this.\u00d6O0000 == null) {
            return false;
        }
        try {
            DruckSeitenEintrag druckSeitenEintrag = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).getSeitenEinstellungen(this.new());
            if (druckSeitenEintrag != null && !druckSeitenEintrag.getBildpath().trim().equals("")) {
                File file = new File(druckSeitenEintrag.getBildpath());
                return file.exists();
            }
            return false;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public boolean \u00d300000() {
        return false;
    }

    public abstract boolean \u00d400000();

    public boolean \u00f500000() {
        return this.\u00d8O0000;
    }

    public void o00000(Graphics2D graphics2D, int n, int n2, int n3, int n4) {
        this.o00000(graphics2D, n, n2, n3, n4, 10, 10);
    }

    public void o00000(Graphics2D graphics2D, int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.return()) {
            graphics2D.setPaint(Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).getBlockfarbe());
            graphics2D.fillRoundRect(n, n2, n3, n4, n5, n6);
            graphics2D.setPaint(Color.BLACK);
        } else {
            graphics2D.drawRoundRect(n, n2, n3, n4, n5, n6);
            graphics2D.setPaint(Color.BLACK);
        }
    }

    public void o00000(boolean bl) {
        this.\u00d8O0000 = bl;
    }

    protected void new(String string, Graphics2D graphics2D) {
        try {
            Object object = new Object(string);
            object.paint(graphics2D);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected boolean \u00d300000(String string) {
        File file = new File(string);
        return file.exists();
    }

    protected String new(String string) {
        if (string.length() == 1) {
            return " " + string;
        }
        return string;
    }

    static {
        newsuper = null;
    }
}

