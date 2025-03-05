/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.DDZKulturen.Dschungelstaemme;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZKulturen.Tocamuyac;
import helden.model.DDZKulturen.Tulamidenlande;
import helden.model.DDZKulturen.VerloreneStaemme;
import helden.model.kultur.Aranien;
import helden.model.kultur.Bukanier;
import helden.model.kultur.Horasreich;
import helden.model.kultur.TulamidischeStadtstaaten;
import helden.model.kultur.WaldinselUtulus;
import java.util.ArrayList;

public class Utulu
extends o0oo_0 {
    private static final int O\u00f8OO00 = 165;
    private static final int o\u00f8OO00 = 110;

    public Utulu() {
    }

    public Utulu(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnforObject, 2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
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
        arrayList.add(new oooo_1("hellbraun", 3, 20));
        arrayList.add(new oooo_1("dunkelbraun", 7, 20));
        arrayList.add(new oooo_1("schwarz", 10, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 17, 20));
        arrayList.add(new oooo_1("blauschwarz", 3, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R15";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new WaldinselUtulus(this.getGeschlecht()));
        helden.model.kultur.Dschungelstaemme dschungelstaemme = new helden.model.kultur.Dschungelstaemme(this.getGeschlecht());
        if (bl) {
            dschungelstaemme.removeMoeglicheVariante(helden.model.kultur.Dschungelstaemme.\u00f5\u00d4\u00f8000);
            dschungelstaemme.removeMoeglicheVariante(helden.model.kultur.Dschungelstaemme.privateinterfaceclass);
        }
        arrayList.add(dschungelstaemme);
        helden.model.kultur.VerloreneStaemme verloreneStaemme = new helden.model.kultur.VerloreneStaemme(this.getGeschlecht());
        if (bl) {
            verloreneStaemme.removeMoeglicheVariante(helden.model.kultur.VerloreneStaemme.\u00d8\u00f8\u00f6000);
        }
        arrayList.add(verloreneStaemme);
        arrayList.add(new helden.model.kultur.Suedaventurien(this.getGeschlecht()));
        arrayList.add(new Bukanier(this.getGeschlecht()));
        arrayList.add(new helden.model.DDZKulturen.WaldinselUtulus(this.getGeschlecht()));
        Dschungelstaemme dschungelstaemme2 = new Dschungelstaemme(this.getGeschlecht());
        if (bl) {
            dschungelstaemme2.clearMoeglicheVarianten();
            dschungelstaemme2.addMoeglicheVariante(helden.model.kultur.Dschungelstaemme.\u00d8\u00d4\u00f8000);
        }
        arrayList.add(dschungelstaemme2);
        VerloreneStaemme verloreneStaemme2 = new VerloreneStaemme(this.getGeschlecht());
        verloreneStaemme2.removeMoeglicheVariante(helden.model.kultur.VerloreneStaemme.\u00d8\u00f8\u00f6000);
        arrayList.add(verloreneStaemme2);
        if (!bl) {
            arrayList.add(new Horasreich(this.getGeschlecht()));
            arrayList.add(new Aranien(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Tocamuyac(this.getGeschlecht()));
            arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
            arrayList.add(new Tocamuyac(this.getGeschlecht()));
            arrayList.add(new Tulamidenlande(this.getGeschlecht()));
            arrayList.add(new Suedaventurien(this.getGeschlecht()));
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
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 165;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilenull);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.\u00f8\u00d40000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.nullObjectsuper));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Utulu";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 165 + Wuerfel.w20() + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 9;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00f4\u00f4\u00d2000, 1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 11);
        this.putModifikator(b_0.thispublicsuper, 12);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -6);
    }
}

