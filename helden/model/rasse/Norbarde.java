/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.kultur.Bornland;
import helden.model.kultur.Garetien;
import helden.model.kultur.Gjalskerlaender;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Nivesenstaemme;
import helden.model.kultur.Norbardensippe;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Thorwal;
import java.util.ArrayList;

public class Norbarde
extends o0oo_0 {
    private static final int \u00d4\u00d8OO00 = 158;
    private static final int \u00d5\u00d8OO00 = 100;

    public Norbarde() {
    }

    public Norbarde(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
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
        arrayList.add(new oooo_1("schwarz", 3, 20));
        arrayList.add(new oooo_1("dunkelbraun", 10, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 2, 20));
        arrayList.add(new oooo_1("blau", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 17, 20));
        arrayList.add(new oooo_1("kupferrot", 2, 20));
        arrayList.add(new oooo_1("blond", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R09";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Norbardensippe(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new Bornland(this.getGeschlecht()));
            arrayList.add(new Thorwal(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new Nivesenstaemme(this.getGeschlecht()));
            arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
        }
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
        return 158;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thissuper);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Norbarde";
        }
        return "Norbardin";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 158 + Wuerfel.w20() + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d5\u00f4\u00d2000, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 11);
        this.putModifikator(b_0.thispublicsuper, 10);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -4);
    }
}

