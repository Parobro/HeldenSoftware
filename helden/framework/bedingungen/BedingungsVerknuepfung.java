/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.bedingungen;

import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.VerknuepfungsArt;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BedingungsVerknuepfung
extends AbstraktBedingung {
    private VerknuepfungsArt \u00d2o0000;
    private ArrayList<AbstraktBedingung> oo0000;

    public static BedingungsVerknuepfung AND(AbstraktBedingung ... abstraktBedingungArray) {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, abstraktBedingungArray);
    }

    public static BedingungsVerknuepfung OR(AbstraktBedingung ... abstraktBedingungArray) {
        return new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, abstraktBedingungArray);
    }

    public BedingungsVerknuepfung(VerknuepfungsArt verknuepfungsArt) {
        this.\u00d2o0000 = verknuepfungsArt;
        this.oo0000 = new ArrayList();
    }

    public BedingungsVerknuepfung(VerknuepfungsArt verknuepfungsArt, AbstraktBedingung ... abstraktBedingungArray) {
        this(verknuepfungsArt);
        for (AbstraktBedingung abstraktBedingung : abstraktBedingungArray) {
            this.addBedingung(abstraktBedingung);
        }
    }

    public void addBedingung(AbstraktBedingung abstraktBedingung) {
        this.oo0000.add(abstraktBedingung);
    }

    public ArrayList<AbstraktBedingung> getBedingungen() {
        return this.oo0000;
    }

    public VerknuepfungsArt getVerknuepfungsArt() {
        return this.\u00d2o0000;
    }

    public boolean isEmpty() {
        return this.oo0000.size() == 0;
    }

    @Override
    public String toString() {
        String string = "(";
        Iterator<AbstraktBedingung> iterator = this.oo0000.iterator();
        while (iterator.hasNext()) {
            AbstraktBedingung abstraktBedingung = iterator.next();
            string = string + abstraktBedingung.toString();
            if (!iterator.hasNext()) continue;
            if (this.\u00d2o0000 == VerknuepfungsArt.o00000) {
                string = string + " UND ";
                continue;
            }
            string = string + " ODER ";
        }
        string = string + ")";
        return string;
    }

    public String toStringFormatiert() {
        return this.toStringFormatiert(0);
    }

    @Override
    public String toStringFormatiertHTML() {
        return "<html><body>" + this.toStringFormatiert(0).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\n", "<br>").replace(" ", "&nbsp;");
    }

    @Override
    protected String toStringFormatiert(int n) {
        String string = this.super(n) + "(\n";
        Iterator<AbstraktBedingung> iterator = this.oo0000.iterator();
        while (iterator.hasNext()) {
            AbstraktBedingung abstraktBedingung = iterator.next();
            string = string + this.super(n + 1) + abstraktBedingung.toStringFormatiert(n + 1);
            if (!iterator.hasNext()) continue;
            if (this.\u00d2o0000 == VerknuepfungsArt.o00000) {
                string = string + " und\n";
                continue;
            }
            string = string + " oder\n";
        }
        string = string + "\n" + this.super(n) + ")";
        return string;
    }

    private String super(int n) {
        String string = "";
        for (int i2 = 0; i2 < n; ++i2) {
            string = string + " ";
        }
        return string;
    }
}

