/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import java.util.HashSet;
import java.util.Set;

public class B
extends void<E> {
    public B(String string, int n, Set<E> set) {
        super(string.toString(), n, set, 3);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        HashSet hashSet = new HashSet(this.nullObject());
        HashSet<E> hashSet2 = new HashSet<E>(this.\u00f8\u00d30000());
        B b = new B(this.\u00f500000(), this.o\u00d20000(), hashSet2);
        b.o00000(hashSet);
        b.o00000(this.\u00f5o0000());
        return b;
    }

    @Override
    public void \u00d500000(String string) {
        for (E e : this.\u00f8\u00d30000()) {
            if (!e.toString().equals(string)) continue;
            this.\u00d400000(e);
        }
    }

    protected BedingungsVerknuepfung o00000(E e) {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        if (this.\u00f500000().equals(while.\u00f6\u00d5\u00d2000.toString())) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(e, (Integer)7));
        }
        if (this.\u00f500000().equals(while.\u00f6O\u00f5000.toString())) {
            B b = (B)oooo_0.o00000(while.\u00f6\u00d5\u00d2000.toString());
            b.\u00d500000(e.toString());
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(e, (Integer)15));
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b));
        }
        if (this.\u00f500000().equals(while.newpublicnew.toString())) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.O\u00f5\u00d2000, (Integer)12));
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.privatedosuper, (Integer)12));
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(e, (Integer)7));
        }
        return bedingungsVerknuepfung;
    }
}

