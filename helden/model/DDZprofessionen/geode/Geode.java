/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.geode;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public abstract class Geode
extends N {
    public Geode(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Geode";
        }
        return "Geodin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.\u00f8o0000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d8o\u00d2000);
        arrayList.add(I.O\u00f8o000);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.privatedo);
        arrayList.add(I.\u00f8\u00d6O000);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d4\u00d30000);
        arrayList.add(I.\u00d8\u00f8O000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        ArrayList<I> arrayList = super.getEntfernteKutlurVorteile();
        arrayList.add(I.privateclass);
        arrayList.add(I.Stringsuper);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 2);
        return k_02;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f5O0000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = this.getProfession().getSetting().getGelaendekunden();
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d5o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d2o000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d2O000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.returnforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 2);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.o00000(G.\u00d80\u00f6000, 7);
        k_02.o00000(G.o\u00d5\u00f5000, 4);
        k_02.o00000(voidsuper.\u00f80\u00d8000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.StringObjectObject, 5);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.whilereturn);
        arrayList.add(I.whilefor);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00d3O000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f5O0000, this.getSetting()));
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

