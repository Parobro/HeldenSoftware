/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Riva;
import java.util.ArrayList;

public class RivaBerater
extends Riva {
    public RivaBerater() {
        super("Magischer Berater", 23);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d5o0000);
        arrayList.add(I.\u00d4oo000);
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                arrayList.removeAll(this.getProfession().getGewaehlteTalente());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.forpublicObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d40\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d50\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f8\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d3\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8O\u00d5000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 2);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.returninterfacenew));
        arrayList.add(new for(while.\u00f5\u00d2\u00d6000));
        return new void(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d50\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
    }
}

