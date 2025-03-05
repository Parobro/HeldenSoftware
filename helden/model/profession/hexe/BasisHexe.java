/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hexe;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public class BasisHexe
extends N {
    public BasisHexe(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f8oO000);
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f4\u00d6O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00f4\u00d60000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.ooO000);
        arrayList.add(I.\u00d8o\u00d2000);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.O\u00f6o000);
        arrayList.add(I.O\u00f6O000);
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00f4\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.if;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d80000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5o\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.thisforsuper.toString()));
        arrayList.add(oooo_0.o00000(while.newObjectString.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(voidsuper.\u00f4\u00f4\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 2);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.StringvoidObject, 3);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.returnifObject, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.o\u00f6\u00f6000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(2);
        J j2 = (J)helden.framework.C.K.o00000(I.o\u00f5O000);
        j2.oO0000(6);
        arrayList.add(j2);
        J j3 = (J)helden.framework.C.K.o00000(I.\u00d40O000);
        j3.oO0000(9);
        arrayList.add(j3);
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.privatedo, "Erdgebunden"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.if, this.getSetting()));
        return waehlbareZauber;
    }
}

