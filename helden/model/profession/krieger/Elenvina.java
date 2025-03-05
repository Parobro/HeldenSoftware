/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Elenvina
extends BasisKrieger {
    public Elenvina() {
        super("Elenvina", 24);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Lang"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Leichte Platte"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Garether Platte"));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullifString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d3\u00d2000.toString()));
        arrayList.remove(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Lang"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 7);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.thissuperString, 6);
        k_02.\u00d200000(E.ifthisString, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, -1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return "Herz\u00f6gliche Kriegerakademie zu Elenvina";
    }
}

