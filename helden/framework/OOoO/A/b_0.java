/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo.a;

import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.E.F;
import helden.framework.OoOO.interface;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.held.object.oooo_0;
import helden.framework.zauber.ZauberMitWertUndHZ;
import java.util.ArrayList;

/*
 * Renamed from helden.framework.oOoO.A.B
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b_0 {
    private ArrayList<Object> \u00d300000;
    private AbstraktBedingung new;
    private String o00000;

    public b_0() {
        this.\u00d300000 = new ArrayList();
    }

    public b_0(Object object) {
        this(object, null);
    }

    public b_0(Object ... objectArray) {
        this.\u00d300000 = new ArrayList();
        for (Object object : objectArray) {
            this.o00000(object);
        }
    }

    public b_0(Object object, Bedingung bedingung) {
        this();
        this.new = bedingung;
        this.o00000(object);
    }

    public b_0(String string, Object ... objectArray) {
        this.o00000 = string;
        this.\u00d300000 = new ArrayList();
        for (Object object : objectArray) {
            this.o00000(object);
        }
    }

    public void o00000(Object object) {
        if (object == null) {
            oooo_0.\u00f500000("Nullpoint hinzugef\u00fcgt");
        }
        if (!this.\u00d300000.contains(object)) {
            if (object instanceof public || object instanceof P || object instanceof interface || object instanceof ZauberMitWertUndHZ || object instanceof for || object instanceof F) {
                this.\u00d300000.add(object);
            } else {
                oooo_0.\u00f500000("Unbekannter Typ: " + object.toString() + " " + object.getClass().toString());
                this.\u00d300000.add(object);
            }
        } else {
            oooo_0.\u00f400000(object + " doppelt!");
        }
    }

    public AbstraktBedingung \u00d200000() {
        return this.new;
    }

    public ArrayList<Object> Object() {
        return this.\u00d300000;
    }

    public String o00000() {
        return this.o00000;
    }

    public void \u00d200000(Object object) {
        this.\u00d300000.remove(object);
    }

    public void o00000(AbstraktBedingung abstraktBedingung) {
        this.new = abstraktBedingung;
    }

    public String toString() {
        if (this.o00000 != null) {
            return this.o00000;
        }
        String string = "";
        for (Object object : this.\u00d300000) {
            if (!string.equals("")) {
                string = string + ", ";
            }
            if (object instanceof M) {
                M m = (M)object;
                string = string + m.oO0000();
                continue;
            }
            string = string + object.toString();
        }
        return string;
    }
}

