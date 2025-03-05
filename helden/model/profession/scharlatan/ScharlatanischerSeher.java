/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.scharlatan;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.scharlatan.VarianteScharlatan;
import java.util.ArrayList;

public class ScharlatanischerSeher
extends VarianteScharlatan {
    public ScharlatanischerSeher() {
        super("Scharlatanischer Seher", 14);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Scharlatanischer Seher";
        }
        return "Scharlatanische Seherin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.O\u00d30000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00f4\u00f5\u00d2000, 2);
        return k_02;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        if (zauber.equals(Zauber.\u00d3\u00d3\u00d5000)) {
            return K.\u00f8O0000;
        }
        if (zauber.equals(Zauber.\u00d3o\u00d3000) || zauber.equals(Zauber.whilethisnew)) {
            return K.\u00d8o0000;
        }
        return K.\u00d300000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.thisifclass.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(1);
            }
            case 1: {
                return super.getTalentAuswahl(2);
            }
            case 2: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.OO\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.returnwhileObject, 3);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 4);
        k_02.\u00d200000(voidsuper.StringclassObject, 3);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 2);
        k_02.o00000(G.\u00f5\u00f6\u00f5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.returnifObject, 3);
        k_02.o00000(this.getZauber(Zauber.newfornew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d6\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.newwhilenew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d4O\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00f5\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.whilethisnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d80\u00d5000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d4\u00d8000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.newfornew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3o\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.newwhilenew));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

