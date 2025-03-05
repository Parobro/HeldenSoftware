/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;
import java.util.HashMap;

public class InstitutDerArkanenAnalysen
extends StandardMagierVariante {
    public InstitutDerArkanenAnalysen() {
        super("InstitutDerArkanenAnalysen", 0);
        this.oO\u00d2O00 = "keine";
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.forforclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d8\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d8\u00d3000.toString()));
        return arrayList;
    }

    public HashMap<oo0o_0, Integer> getTalentVoraussetzungen() {
        HashMap<oo0o_0, Integer> hashMap = new HashMap<oo0o_0, Integer>();
        hashMap.put(voidsuper.thisinterfaceObject, 8);
        hashMap.put(voidsuper.\u00f5\u00f5\u00d5000, 14);
        hashMap.put(voidsuper.\u00f5\u00d2\u00d6000, 8);
        hashMap.put(voidsuper.\u00d5\u00f5\u00d5000, 4);
        hashMap.put(G.\u00d3\u00f8\u00f5000, 10);
        hashMap.put(G.\u00d8\u00d8\u00f5000, 8);
        return hashMap;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 0);
        k_02.o00000(voidsuper.StringclassObject, 0);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 0);
        k_02.o00000(voidsuper.oo\u00d6000, 0);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d6000, 0);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 0);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 0);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 0);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 0);
        k_02.o00000(G.\u00f5\u00f6\u00f5000, 0);
        k_02.o00000(G.\u00f4\u00d3\u00f5000, 0);
        k_02.o00000(G.\u00d5\u00f8\u00f4000, 0);
        k_02.o00000(G.\u00d50\u00f5000, 0);
        k_02.o00000(G.\u00f8\u00f8\u00f4000, 0);
        k_02.o00000(G.\u00d5\u00d4\u00f5000, 0);
        k_02.o00000(G.\u00f8\u00f5\u00f5000, 0);
        k_02.o00000(G.\u00d40\u00f6000, 0);
        k_02.o00000(G.nullpublicString, 0);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 0);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.nullpublicnew), 0);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f4\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d5\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d5\u00d3000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00d8\u00d3000), 0);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 0);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00f4\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.o\u00f5\u00d3000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d3\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.ifthisObject), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d50\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d4\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 0);
        k_02.o00000(this.getZauber(Zauber.privatepublicnew), 0);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 0);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d5000), 0);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d4000), 0);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        return oo0O;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.nullpublicnew));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return "Institut der Arkanen Analysen zu Kuslik";
    }
}

