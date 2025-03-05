/*
 * Decompiled with CFR 0.152.
 */
package test.helper;

import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.model.KulturFabrik;
import java.util.ArrayList;

public class LeerRasse
extends o0oo_0 {
    private static final int \u00d4\u00d4oO00 = 100;
    private static final int \u00d5\u00d4oO00 = 100;

    public LeerRasse() {
    }

    public LeerRasse(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(35);
        arrayList.add(45);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(75);
        arrayList.add(80);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("braun", 7, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 2, 20));
        arrayList.add(new oooo_1("blau", 6, 20));
        arrayList.add(new oooo_1("grau", 2, 20));
        arrayList.add(new oooo_1("schwarz", 1, 20));
        return arrayList;
    }

    public int getGeschwindigkeit() {
        return 7;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 3, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        arrayList.add(new oooo_1("dunkelblond", 5, 20));
        arrayList.add(new oooo_1("blond", 4, 20));
        arrayList.add(new oooo_1("wei\u00dfblond", 2, 20));
        arrayList.add(new oooo_1("rot", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R00";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = KulturFabrik.getKulturen(this.getGeschlecht());
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 40;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 40;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 100;
    }

    @Override
    public int getMinGroesse() {
        return 100;
    }

    @Override
    public String toString() {
        return "Rassenlos";
    }

    @Override
    public int wurfeleAlter() {
        return 99;
    }

    @Override
    protected int erwuerfleGroesse() {
        return 100 + Wuerfel.w20() + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }
}

