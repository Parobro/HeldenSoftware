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
import helden.model.profession.magier.Donnerbach;
import java.util.ArrayList;

public class DonnerbachVerstaendigung
extends Donnerbach {
    public DonnerbachVerstaendigung() {
        super("Donnerbach: Verst\u00e4ndigung", 29);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.ifdoObject.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f4O\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f6\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d2\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f4\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.oo\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d5\u00d3000), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.Stringwhilenew));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4O\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4o\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f6\u00d4000));
    }

    @Override
    public String toString() {
        return "Seminar der elfischen Verst\u00e4ndigung zu Donnerbach";
    }
}

