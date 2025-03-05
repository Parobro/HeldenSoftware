/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.kultur.Almada;
import helden.model.kultur.Amazonenburg;
import helden.model.kultur.AndergastNostria;
import helden.model.kultur.Aranien;
import helden.model.kultur.Bornland;
import helden.model.kultur.Bukanier;
import helden.model.kultur.Garetien;
import helden.model.kultur.Horasreich;
import helden.model.kultur.Maraskan;
import helden.model.kultur.Mhanadistan;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Suedaventurien;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Thorwal;
import helden.model.kultur.TulamidischeStadtstaaten;
import helden.model.kultur.Zyklopeninseln;
import java.util.ArrayList;

public class Mittellaender
extends o0oo_0 {
    private static final int newnewvoid = 160;
    private static final int \u00d3\u00f5OO00 = 100;

    public Mittellaender() {
    }

    public Mittellaender(Geschlecht geschlecht) {
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
        return "R07";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Garetien(this.getGeschlecht()));
        arrayList.add(new Mittelreich(this.getGeschlecht()));
        arrayList.add(new AndergastNostria(this.getGeschlecht()));
        arrayList.add(new Bornland(this.getGeschlecht()));
        arrayList.add(new Svellttal(this.getGeschlecht()));
        arrayList.add(new Almada(this.getGeschlecht()));
        arrayList.add(new Horasreich(this.getGeschlecht()));
        arrayList.add(new Zyklopeninseln(this.getGeschlecht()));
        arrayList.add(new Maraskan(this.getGeschlecht()));
        arrayList.add(new Suedaventurien(this.getGeschlecht()));
        arrayList.add(new Bukanier(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Aranien(this.getGeschlecht()));
            arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
            arrayList.add(new Thorwal(this.getGeschlecht()));
            arrayList.add(new Mhanadistan(this.getGeschlecht()));
            if (!this.istMaennlich()) {
                arrayList.add(new Amazonenburg(this.getGeschlecht()));
            }
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
        return 160;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thissuper);
        arrayList.add(I.\u00f8\u00d40000);
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Mittell\u00e4nder";
        }
        return "Mittell\u00e4nderin";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 160 + Wuerfel.w20() + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 10);
        this.putModifikator(b_0.thispublicsuper, 10);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -4);
    }
}

