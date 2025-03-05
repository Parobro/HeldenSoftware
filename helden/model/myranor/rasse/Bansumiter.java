/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.KulturFabrik;
import java.util.ArrayList;

public class Bansumiter
extends o0oo_0 {
    private static final int privatepublicreturn = 100;
    private static final int \u00f5\u00d2OO00 = 156;
    private static final int \u00f4\u00d2OO00 = 2;
    private static final int \u00d8\u00d2OO00 = 0;

    public Bansumiter() {
    }

    public Bansumiter(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
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
        arrayList.add(new oooo_1("obsidianschwarz", 7, 20));
        arrayList.add(new oooo_1("dunkelblau", 8, 20));
        arrayList.add(new oooo_1("violett", 5, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Hitzeresistenz"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("mattschwarz", 4, 20));
        arrayList.add(new oooo_1("glanzschwarz", 8, 20));
        arrayList.add(new oooo_1("nachtblau", 5, 20));
        arrayList.add(new oooo_1("dunkelblau", 3, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R27";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.addAll(KulturFabrik.getKulturen(this.getSetting(), this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 100;
    }

    @Override
    public int getMaxGroesse() {
        return 156 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 100;
    }

    @Override
    public int getMinGroesse() {
        return 158;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Bansumiter";
        }
        return "Bansumiterin";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 156 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("KO"), 1);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

