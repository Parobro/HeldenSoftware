/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.druide;

import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.druide.Druide;
import java.util.ArrayList;

public class HueterderMacht
extends Druide {
    public HueterderMacht() {
        super("H\u00fcter der Macht", 20);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "H\u00fcter der Macht";
        }
        return "H\u00fcterin der Macht";
    }

    @Override
    public ArrayList<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        OOOo oOOo = this.getProfession().getGewaehlteSonderfertigkeiten();
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!oOOo.\u00d200000(while.\u00d8\u00d4\u00d5000.toString())) {
            arrayList.add(new for(while.\u00d8\u00d4\u00d5000));
        }
        if (!oOOo.\u00d200000(while.\u00f8\u00f6\u00d2000.toString())) {
            arrayList.add(new for(while.\u00f8\u00f6\u00d2000));
        }
        if (!oOOo.\u00d200000(while.\u00d6\u00d5O000.toString())) {
            arrayList.add(new for(while.\u00d6\u00d5O000));
        }
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        switch (n) {
            case 0: {
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d2000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d6\u00d5O000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                arrayList.add(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d2\u00d4O000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d30\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d5\u00d6\u00d5000);
                arrayList.add(voidsuper.\u00f80\u00d6000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.newreturnnew));
                arrayList.add(this.getZauber(Zauber.ifStringnew));
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d5\u00d8000, 2);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d2000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f4\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.forintnew), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f5\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 4);
        k_02.\u00d200000(this.getZauber(Zauber.whilenewnew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.o0\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d3\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d50\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d4000), 1);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.\u00d3\u00f8\u00d2000));
        arrayList.add(this.getZauber(Zauber.o\u00f4\u00d4000));
        arrayList.add(this.getZauber(Zauber.forintnew));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.nullinterfacesuper));
        arrayList.add(this.getZauber(Zauber.whilenewnew));
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.newreturnnew))) {
            arrayList.add(this.getZauber(Zauber.newreturnnew));
        }
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.ifStringnew))) {
            arrayList.add(this.getZauber(Zauber.ifStringnew));
        }
    }
}

