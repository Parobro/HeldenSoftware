/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.druide;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public abstract class Druide
extends N {
    public Druide(String string, int n) {
        super(string, n);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kr\u00e4utersortiment (100D)");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Druide";
        }
        return "Druidin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.whilenull);
        arrayList.add(I.Stringdo);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ooO000);
        arrayList.add(I.O\u00f6o000);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.privatedo);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.\u00d8\u00d4O000);
        arrayList.add(I.\u00f5\u00d50000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    public super._o getKategorie() {
        return super._o.super;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.o00000(b_0.\u00f4\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00f800000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d2\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.privateforclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3o\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.forStringnew.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.o00000(voidsuper.returnforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.thisvoidObject, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d50\u00d8000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f80\u00d8000, 5);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.o00000(voidsuper.returnifObject, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.privateinterface);
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d4\u00d5o000));
        oo0O.\u00d300000(K.o00000(I.forsupersuper));
        oo0O.\u00d300000(K.o00000(I.O\u00d3O000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, helden.framework.OOoO.K.\u00f800000, this.getSetting()));
        return waehlbareZauber;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

