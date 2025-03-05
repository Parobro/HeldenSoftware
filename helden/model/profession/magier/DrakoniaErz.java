/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Drakonia;
import java.util.ArrayList;

public class DrakoniaErz
extends Drakonia {
    public DrakoniaErz() {
        super("Drakonia (Erz)");
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.\u00f40\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return null;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 5);
        k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 3);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d2\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d2\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.Oo\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 4);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.whilewhilenew, K.\u00f800000, ""), 2);
        k_02.o00000(this.getZauber(Zauber.returnStringnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d4\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d3\u00d3000), 4);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.o\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d2\u00d4000));
        arrayList.add(this.getZauber(Zauber.Oo\u00d4000));
    }

    @Override
    public String toString() {
        return "Konzil der Elemente zu Drakonia - Erzelementarist";
    }
}

