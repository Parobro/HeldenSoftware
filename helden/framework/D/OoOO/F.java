/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.C.I;
import helden.framework.D.OoOO.E;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class F
extends void<E> {
    private static Set<E> \u00d5\u00d40000() {
        HashSet<E> hashSet = new HashSet<E>();
        hashSet.add(new E(o00O.\u00d2\u00d20000, o00O.\u00d800000));
        hashSet.add(new E(o00O.super, o00O.\u00d4\u00d20000));
        hashSet.add(new E(o00O.\u00f6O0000, o00O.\u00d4O0000));
        return hashSet;
    }

    public F() {
        super(while.\u00d6\u00d2\u00f4000.toString(), 700, F.\u00d5\u00d40000(), 4);
    }

    private F(String string, int n, Set<E> set, int n2) {
        super(string, n, set, n2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        HashSet hashSet = new HashSet(this.privateprivateclass);
        HashSet<E> hashSet2 = new HashSet<E>(this.newinterfaceclass);
        HashMap hashMap = new HashMap(this.\u00d5\u00d3\u00f8000);
        F f2 = new F(this.\u00f500000(), this.o\u00d20000(), (Set<E>)hashSet2, this.\u00d400000());
        f2.privateprivateclass = hashSet;
        f2.\u00d5\u00d3\u00f8000 = hashMap;
        f2.o00000(this.\u00f5o0000());
        return f2;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.newwhilesuper, (Integer)15));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)15));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)12));
        bedingungsVerknuepfung.addBedingung(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.O\u00f6O000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00d3\u00f50000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00f8\u00d6o000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.whileString));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00d5\u00f8o000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00f4\u00f5o000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNichtBegabungDaemonisch());
        return bedingungsVerknuepfung;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    protected BedingungsVerknuepfung o00000(E e) {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(this.\u00f5o0000());
        bedingungsVerknuepfung.addBedingung(Bedingung.hatMKoderBegabung(e));
        return bedingungsVerknuepfung;
    }
}

