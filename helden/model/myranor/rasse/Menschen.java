/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.KulturFabrik;
import java.util.ArrayList;

public class Menschen
extends o0oo_0 {
    private static final int \u00f4\u00f80O00 = 95;
    private static final int \u00d8\u00f80O00 = 152;
    private static final int thisdoreturn = 3;
    private static final int \u00d5\u00f80O00 = 0;

    public Menschen() {
    }

    public Menschen(Geschlecht geschlecht) {
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
        arrayList.add(new oooo_1("violett", 1, 20));
        arrayList.add(new oooo_1("dunkelblau", 2, 20));
        arrayList.add(new oooo_1("obsidianschwarz", 3, 20));
        arrayList.add(new oooo_1("dunkelbraun", 3, 20));
        arrayList.add(new oooo_1("mittelbraun", 3, 20));
        arrayList.add(new oooo_1("hellbraun", 2, 20));
        arrayList.add(new oooo_1("dunkelrot", 1, 20));
        arrayList.add(new oooo_1("stahlgrau", 1, 20));
        arrayList.add(new oooo_1("blaugrau", 1, 20));
        arrayList.add(new oooo_1("hellblau", 1, 20));
        arrayList.add(new oooo_1("blaugr\u00fcn", 1, 20));
        arrayList.add(new oooo_1("seegr\u00fcn", 1, 20));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 95;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelblau", 1, 20));
        arrayList.add(new oooo_1("glanzviolett", 1, 20));
        arrayList.add(new oooo_1("glanzschwarz", 2, 20));
        arrayList.add(new oooo_1("mattschwarz", 2, 20));
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("mittelbraun", 3, 20));
        arrayList.add(new oooo_1("hellbraun", 2, 20));
        arrayList.add(new oooo_1("dunkelblond", 2, 20));
        arrayList.add(new oooo_1("kupferrot", 2, 20));
        arrayList.add(new oooo_1("rotblond", 1, 20));
        arrayList.add(new oooo_1("blond", 1, 20));
        arrayList.add(new oooo_1("wei\u00dfblond", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R37";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.addAll(KulturFabrik.getKulturen(this.getSetting(), this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 95;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + Wuerfel.max(20, 3) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 95;
    }

    @Override
    public int getMinGroesse() {
        return 152;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Mensch";
        }
        return "Mensch";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 152 + Wuerfel.sum(20, 3) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

