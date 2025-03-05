/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

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
import helden.model.profession.magier.Punin;
import java.util.ArrayList;

public class Punin2
extends Punin {
    public Punin2() {
        super("Punin II", 30);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d8\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f5\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.privateintnew), 6);
        k_02.o00000(this.getZauber(Zauber.nullpublicnew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f4\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d5\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00d8\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f8\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.newfornew), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.o0\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.O0\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d8O\u00d5000), 3);
        k_02.o00000(this.getZauber(Zauber.forpublicnew), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d6\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d50\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.oo\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d4\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d4000), 5);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.returnObjectnew));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00f6\u00f6000));
        arrayList.add(new for(while.thisifclass));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.privateintnew));
        arrayList.add(this.getZauber(Zauber.nullpublicnew));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return "Arcanes Institut Punin - Metamagie, magische Hellsicht, Kraftlinien, Artefakte";
    }
}

