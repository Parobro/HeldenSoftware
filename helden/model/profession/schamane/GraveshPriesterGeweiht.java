/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schamane.GraveshPriester;
import java.util.ArrayList;
import java.util.Vector;

public class GraveshPriesterGeweiht
extends GraveshPriester {
    public GraveshPriesterGeweiht() {
        super("GraveshGeweiht", 5);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Geweihter Gravesh-Priester";
        }
        return "Geweihte Gravesh-Priesterin";
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>(4);
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.O\u00f5\u00d2000);
        vector.add(b_0.returnwhilesuper);
        vector.add(b_0.privatedosuper);
        return vector;
    }

    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00d4\u00f8\u00d5000);
        vector.add(voidsuper.\u00d30\u00d8000);
        vector.add(voidsuper.\u00d50\u00d8000);
        vector.add(voidsuper.\u00f40\u00d8000);
        vector.add(voidsuper.\u00f4\u00f6\u00d5000);
        vector.add(voidsuper.\u00f5\u00d2\u00d6000);
        vector.add(voidsuper.O\u00f4\u00d5000);
        vector.add(voidsuper.\u00f80\u00d8000);
        vector.add(voidsuper.\u00f5\u00d8\u00d5000);
        vector.add(voidsuper.\u00d3\u00d8\u00d5000);
        vector.add(voidsuper.\u00d4\u00d4\u00d5000);
        vector.add(voidsuper.\u00f8\u00f8\u00d6000);
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d8\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d5\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6oo000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d80\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00d2\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00d3\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3o000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d8\u00f8o000));
        return oo0O;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

