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

public class Rashdul
extends BasisKophta {
    public Rashdul() {
        super("Rashdul", 24);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Pandjashtra zu Rashdul";
        }
        return "Pandjashtra zu Rashdul";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d8\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d5\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 5);
        k_02.\u00d200000(voidsuper.StringclassObject, 3);
        k_02.\u00d200000(voidsuper.whileStringObject, 3);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 5);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.newreturnObject, 1);
        k_02.\u00d200000(this.getZauber(Zauber.privateObjectnew), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.O0\u00d5000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d2\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.whilewhilenew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d8\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.Oo\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00d3\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.nullvoidnew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 1);
        k_02.\u00d200000(this.getZauber(Zauber.Stringsupernew), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d5000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8oO000));
        arrayList.add(new for(while.ifdoclass));
        arrayList.add(new for(while.\u00d30\u00d8000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.privateObjectnew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d2000));
        arrayList.add(this.getZauber(Zauber.O0\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d2\u00d4000));
        arrayList.add(this.getZauber(Zauber.whilewhilenew));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.Oo\u00d4000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

