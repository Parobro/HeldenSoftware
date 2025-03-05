/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hexe;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.hexe.BasisHexe;
import java.util.ArrayList;

public class FahrendeGemeinschaft
extends BasisHexe {
    public FahrendeGemeinschaft() {
        super("Schwester der Fahrenden Gemeinschaft", 15);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ochsen Karren");
        arrayList.add("Esel Karren");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schwester der Fahrenden Gemeinschaft";
        }
        return "Schwester der Fahrenden Gemeinschaft";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.\u00d4o0000);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 9;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.if;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d20000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.OO\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.\u00d200000(voidsuper.returnforObject, 4);
        k_02.\u00d200000(voidsuper.thisvoidObject, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.\u00d200000(voidsuper.whilenewObject, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d40\u00d8000);
        k_02.\u00d200000(voidsuper.nullObjectObject, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f4\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f4\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.ifprivatesuper), 4);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d3\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d2\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.returnwhilenew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d8\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d3\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d2\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f5\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f5\u00d4000), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.whilefor);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f5\u00d2\u00d6000));
        return arrayList;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d4000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d4000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thisinterfacenew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, K.if, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00f5\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3O\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifprivatesuper));
        arrayList.add(this.getZauber(Zauber.O\u00d3\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d2\u00d4000));
        arrayList.add(this.getZauber(Zauber.returnwhilenew));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

