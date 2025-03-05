/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_6;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.geweihter.Firun;
import java.util.ArrayList;

public class FirunWaldlaeufer
extends Firun {
    private boolean o\u00d4\u00f5O00 = true;

    public FirunWaldlaeufer() {
        super("Firun, Waldl\u00e4ufer", 23);
    }

    public FirunWaldlaeufer(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hundeschlitten mit Tieren");
        arrayList.add("Packtier mit Taschen");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Firun, Waldl\u00e4ufer";
        }
        return "Firun, Waldl\u00e4uferin";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.o\u00d4\u00f5O00 = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(voidsuper.returnprivateObject, 2));
        arrayList.add(new interface(voidsuper.\u00f8\u00f4\u00d6000, 2));
        arrayList.add(new interface(voidsuper.\u00d8\u00d3\u00d8000, 1));
        arrayList.add(new interface(voidsuper.\u00d5o\u00d8000, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.newdoString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d3\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        if (n > 5) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            switch (n) {
                case 6: {
                    arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                    arrayList.remove(this.getProfession().getMuttersprache());
                    int[] nArray = new int[]{5};
                    return new m_0(arrayList, nArray);
                }
            }
            throw new c_1();
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "st\u00e4dtisches Leben", 6));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Geselligkeit", 6));
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.o\u00d4\u00f5O00;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

