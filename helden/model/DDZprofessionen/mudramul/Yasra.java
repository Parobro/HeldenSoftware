/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.mudramul;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.mudramul.BasisMudramul;
import java.util.ArrayList;

public class Yasra
extends BasisMudramul {
    public Yasra() {
        super("Chamib Al'Mahmoud zu Yasra", 21);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Chamib Al'Mahmoud zu Yasra";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00f5\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.newObjectsuper.toString()));
        arrayList.add(oooo_0.o00000(while.StringreturnObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d5O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.\u00d200000(G.thissuperclass, 4);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.\u00d200000(this.getZauber(Zauber.privateintnew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d5000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d4\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4o\u00d5000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4o\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f8\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.returnnewnew), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.nullpublicnew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.privatesupernew), 1);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.ifnewnew), 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.Stringwhilenew));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.privatenullsuper));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.privateintnew));
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4o\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f4o\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.returnnewnew));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

