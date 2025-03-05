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
import helden.model.DDZKulturen.AlMada;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.DiamantenesSultanat;
import helden.model.DDZKulturen.Elem;
import helden.model.DDZKulturen.Haranija;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZKulturen.Tulamidenlande;
import helden.model.DDZKulturen.Wuestenstaemme;
import helden.model.kultur.Almada;
import helden.model.kultur.Amazonenburg;
import helden.model.kultur.Aranien;
import helden.model.kultur.Bukanier;
import helden.model.kultur.Ferkina;
import helden.model.kultur.Garetien;
import helden.model.kultur.Maraskan;
import helden.model.kultur.Mhanadistan;
import helden.model.kultur.Novadis;
import helden.model.kultur.TulamidischeStadtstaaten;
import helden.model.kultur.Zahori;
import java.util.ArrayList;

public class Tulamide
extends o0oo_0 {
    private static final int thissupervoid = 155;
    private static final int \u00d8\u00d8OO00 = 105;

    public Tulamide() {
    }

    public Tulamide(Geschlecht geschlecht) {
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
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("dunkelbraun", 8, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        arrayList.add(new oooo_1("grau", 2, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 1, 20));
        arrayList.add(new oooo_1("blau", 1, 20));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 105;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 6, 20));
        arrayList.add(new oooo_1("dunkelbraun", 6, 20));
        arrayList.add(new oooo_1("mittelbraun", 2, 20));
        arrayList.add(new oooo_1("hellbraun", 3, 20));
        arrayList.add(new oooo_1("blond", 2, 20));
        arrayList.add(new oooo_1("rot", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R14";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Aranien(this.getGeschlecht()));
        arrayList.add(new Mhanadistan(this.getGeschlecht()));
        arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
        arrayList.add(new Novadis(this.getGeschlecht()));
        arrayList.add(new Ferkina(this.getGeschlecht()));
        arrayList.add(new Zahori(this.getGeschlecht()));
        arrayList.add(new Maraskan(this.getGeschlecht()));
        arrayList.add(new helden.model.kultur.Suedaventurien(this.getGeschlecht()));
        arrayList.add(new Bukanier(this.getGeschlecht()));
        arrayList.add(new DiamantenesSultanat(this.getGeschlecht()));
        arrayList.add(new Tulamidenlande(this.getGeschlecht()));
        arrayList.add(new Elem(this.getGeschlecht()));
        arrayList.add(new Haranija(this.getGeschlecht()));
        arrayList.add(new Wuestenstaemme(this.getGeschlecht()));
        arrayList.add(new AlMada(this.getGeschlecht()));
        arrayList.add(new Suedaventurien(this.getGeschlecht()));
        arrayList.add(new helden.model.DDZKulturen.Ferkina(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Almada(this.getGeschlecht()));
            if (!this.istMaennlich()) {
                arrayList.add(new Amazonenburg(this.getGeschlecht()));
            }
            BosparanischesReich bosparanischesReich = new BosparanischesReich(this.getGeschlecht());
            bosparanischesReich.clearMoeglicheVarianten();
            bosparanischesReich.addMoeglicheVariante(BosparanischesReich.\u00d5\u00d20O00);
            arrayList.add(bosparanischesReich);
            Nordprovinzen nordprovinzen = new Nordprovinzen(this.getGeschlecht());
            nordprovinzen.clearMoeglicheVarianten();
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00f8\u00d50O00);
            arrayList.add(nordprovinzen);
            arrayList.add(new Alhanien(this.getGeschlecht()));
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
        return this.getMinGroesse() - 105;
    }

    @Override
    public int getMinGroesse() {
        return 155;
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
            return "Tulamide";
        }
        return "Tulamidin";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 155 + Wuerfel.w20() + Wuerfel.w20();
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

