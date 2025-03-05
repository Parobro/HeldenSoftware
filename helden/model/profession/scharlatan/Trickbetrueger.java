/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.scharlatan;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.scharlatan.VarianteScharlatan;
import java.util.ArrayList;

public class Trickbetrueger
extends VarianteScharlatan {
    public Trickbetrueger() {
        super("Trickbetr\u00fcger", 14);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Trickbetr\u00fcger";
        }
        return "Trickbetr\u00fcgerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.\u00d4OO000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(this.getZauber(Zauber.\u00f5o\u00d3000));
                arrayList.add(this.getZauber(Zauber.whilenullnew));
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.OO\u00d6000, 5);
        k_02.\u00d200000(voidsuper.returnforObject, 1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 2);
        k_02.\u00d200000(voidsuper.whilenewObject, 3);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 4);
        k_02.\u00d200000(G.o\u00f8\u00f5000, 4);
        k_02.\u00d200000(voidsuper.O\u00d3\u00d6000, 4);
        k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, 1);
        k_02.o00000(this.getZauber(Zauber.newfornew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d3O\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.privateintnew), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00f5\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d8\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00f6\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8O\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.thisinterfacenew), 4);
        k_02.o00000(this.getZauber(Zauber.returnreturnnew), 3);
        return k_02;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(this.getZauber(Zauber.\u00f5o\u00d3000));
        waehlbareZauber.add(this.getZauber(Zauber.whilenullnew));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.newfornew));
        arrayList.add(this.getZauber(Zauber.\u00d3O\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        if (this.o\u00d4O000() != null) {
            arrayList.add(this.o\u00d4O000());
        }
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    private KonkreterZauber o\u00d4O000() {
        int n;
        int n2 = this.getWahlWert0(this.getZauber(Zauber.whilenullnew));
        if (n2 > (n = this.getWahlWert0(this.getZauber(Zauber.\u00f5o\u00d3000)))) {
            return this.getZauber(Zauber.whilenullnew);
        }
        if (n > n2) {
            return this.getZauber(Zauber.\u00f5o\u00d3000);
        }
        return null;
    }
}

