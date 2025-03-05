/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.kultur.AndergastNostria;
import helden.model.kultur.Bornland;
import helden.model.kultur.Bukanier;
import helden.model.kultur.Fjarninger;
import helden.model.kultur.Garetien;
import helden.model.kultur.Gjalskerlaender;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Suedaventurien;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Thorwal;
import helden.model.kultur.TulamidischeStadtstaaten;
import java.util.ArrayList;

public class Thorwaler
extends o0oo_0 {
    public static final P \u00f5\u00f6OO00 = new P("Gjalsker", 0, false);
    public static final P \u00f4\u00f6OO00 = new P("Thorwaler", 0, false);
    public static final P StringObjectvoid = new P("Hjaldinger", 0, false);
    public static final P \u00d8\u00f6OO00 = new P("Fjarninger", 0, false);
    private static final int thisObjectvoid = 168;
    private static final int \u00f8\u00f6OO00 = 95;

    public Thorwaler() {
    }

    public Thorwaler(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
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
        if (this.istVariante(\u00f5\u00f6OO00)) {
            arrayList.add(new oooo_1("dunkelbraun", 2, 20));
            arrayList.add(new oooo_1("braun", 8, 20));
            arrayList.add(new oooo_1("gr\u00fcn", 8, 20));
            arrayList.add(new oooo_1("blau", 2, 20));
        } else {
            arrayList.add(new oooo_1("dunkelbraun", 2, 20));
            arrayList.add(new oooo_1("braun", 5, 20));
            arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
            arrayList.add(new oooo_1("blau", 7, 20));
            arrayList.add(new oooo_1("grau", 2, 20));
        }
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d5\u00d40000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 95;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        if (this.istVariante(\u00f5\u00f6OO00)) {
            arrayList.add(new oooo_1("blond", 4, 20));
            arrayList.add(new oooo_1("rotblond", 4, 20));
            arrayList.add(new oooo_1("rot", 7, 20));
            arrayList.add(new oooo_1("braun", 2, 20));
            arrayList.add(new oooo_1("schwarz", 3, 20));
        } else {
            arrayList.add(new oooo_1("blond", 8, 20));
            arrayList.add(new oooo_1("rotblond", 5, 20));
            arrayList.add(new oooo_1("wei\u00dfblond", 2, 20));
            arrayList.add(new oooo_1("rot", 2, 20));
            arrayList.add(new oooo_1("dunkelblond", 1, 20));
            arrayList.add(new oooo_1("braun", 1, 20));
            arrayList.add(new oooo_1("schwarz", 1, 20));
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return "R11";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Thorwal(this.getGeschlecht()));
        arrayList.add(new Fjarninger(this.getGeschlecht()));
        arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Bornland(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new Suedaventurien(this.getGeschlecht()));
            arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
            arrayList.add(new Bukanier(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 40;
    }

    @Override
    public int getMaxGroesse() {
        int n = 40;
        if (this.istVariante(\u00d8\u00f6OO00)) {
            n += 5;
        }
        return this.getMinGroesse() + n;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 95;
    }

    @Override
    public int getMinGroesse() {
        return 168;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thissuper);
        arrayList.add(I.whilenull);
        arrayList.add(I.O\u00d20000);
        arrayList.add(I.\u00f8\u00d40000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.o\u00f5O000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Thorwaler";
        }
        return "Thorwalerin";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        int n = 168 + Wuerfel.w20() + Wuerfel.w20();
        if (this.istVariante(\u00d8\u00f6OO00)) {
            n += 5;
        }
        return n;
    }

    @Override
    protected int getBasisGPKosten() {
        return 5;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f4\u00f6OO00);
        this.addAlleVarianten(\u00d8\u00f6OO00);
        this.addAlleVarianten(\u00f5\u00f6OO00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, 1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.privatedosuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 11);
        this.putModifikator(b_0.thispublicsuper, 10);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -5);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f4\u00f6OO00);
        this.addMoeglicheVariante(\u00d8\u00f6OO00);
        this.addMoeglicheVariante(\u00f5\u00f6OO00);
    }
}

