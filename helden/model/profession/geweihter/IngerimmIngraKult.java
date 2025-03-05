/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Ingerimm;
import java.util.ArrayList;

public class IngerimmIngraKult
extends Ingerimm {
    public IngerimmIngraKult() {
        super("Ingerimm, Ingra-Kult", 12);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                int n2;
                ArrayList<P> arrayList = new ArrayList<P>();
                for (n2 = 0; n2 < voidsuper.\u00f5\u00d8\u00d5000.getSpezialisierungen().size(); ++n2) {
                    arrayList.add(K.o00000(voidsuper.\u00f5\u00d8\u00d5000, voidsuper.\u00f5\u00d8\u00d5000.getSpezialisierungen().get(n2)));
                }
                for (n2 = 0; n2 < voidsuper.\u00d8\u00d8\u00d6000.getSpezialisierungen().size(); ++n2) {
                    arrayList.add(K.o00000(voidsuper.\u00d8\u00d8\u00d6000, voidsuper.\u00d8\u00d8\u00d6000.getSpezialisierungen().get(n2)));
                }
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d80\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00d2\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00f5\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: 
            case 1: {
                return super.getTalentAuswahl(n);
            }
            case 2: {
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
                int[] nArray = new int[]{7, 6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 7);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.forObjectObject, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f80\u00d6000));
        arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.nullObjectsuper));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Ingerimm, Ingra-Kult des Nordens";
    }
}

