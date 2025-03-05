/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.kophta;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.kophta.BasisKophta;
import java.util.ArrayList;

public class YolFassar
extends BasisKophta {
    public YolFassar() {
        super("Yol-Fassar", 24);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Al'Achami-Akademie zu Yol-Fassar";
        }
        return "Al'Achami-Akademie zu Yol-Fassar";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d500000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.StringclassObject, 5);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisintObject, 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        k_02.\u00d200000(this.getZauber(Zauber.o0\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00d2\u00d5000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f80\u00d5000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.oO\u00d5000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f6\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.forintnew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d8\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.Stringsupernew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d5000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.O0\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f5\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d3000), 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00d20000));
        arrayList.add(new for(while.\u00d8\u00d2\u00d8000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.o0\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d3O\u00d5000));
        arrayList.add(this.getZauber(Zauber.o\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f80\u00d5000));
        arrayList.add(this.getZauber(Zauber.oO\u00d5000));
        arrayList.add(this.getZauber(Zauber.O\u00f6\u00d3000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

