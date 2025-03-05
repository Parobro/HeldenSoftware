/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.bosparanischermagier;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.bosparanischermagier.BasisBosMagier;
import java.util.ArrayList;

public class Legionsmagier
extends BasisBosMagier {
    public Legionsmagier() {
        super("Legionsmagier", 25);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Schwarzstahl Arm-/Beinschienen");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Legionsmagier";
        }
        return "Legionsmagierin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.returninterfacenew.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d5\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d3\u00d8\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d6\u00d6000);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.nullvoidObject, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.returnifObject, 2);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d4\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.forinterfacenew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d3\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f4\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d80\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.OO\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f5\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.ifwhilenew), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.forforclass));
        arrayList.add(new for(while.o\u00f5\u00f4000));
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        arrayList.add(new for(while.\u00d8\u00d2\u00d8000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.O\u00d4\u00d3000));
        arrayList.add(this.getZauber(Zauber.forinterfacenew));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d3\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d3\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00f4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d80\u00d3000));
        arrayList.add(this.getZauber(Zauber.OO\u00d4000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

