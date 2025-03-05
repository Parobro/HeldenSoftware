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
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Darna;
import helden.model.DDZKulturen.Dschungelstaemme;
import helden.model.DDZKulturen.Elem;
import helden.model.DDZKulturen.Haranija;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZKulturen.Tocamuyac;
import helden.model.DDZKulturen.Tulamidenlande;
import helden.model.DDZKulturen.VerloreneStaemme;
import helden.model.kultur.Aranien;
import helden.model.kultur.Bukanier;
import helden.model.kultur.Garetien;
import helden.model.kultur.Horasreich;
import helden.model.kultur.Miniwatu;
import helden.model.kultur.TulamidischeStadtstaaten;
import helden.model.kultur.WaldinselUtulus;
import java.util.ArrayList;

public class Waldmensch
extends o0oo_0 {
    public static final P \u00d8OoO00 = new P("Waldmensch", 2, false);
    public static final P Stringclassvoid = new P("Tocamuyac", 0, false);
    public static final P thisclassvoid = new P("Tapasuul", 2, false);
    private static final int \u00f8OoO00 = 142;
    private static final int \u00f5OoO00 = 152;
    private static final int \u00f4OoO00 = 201;
    private static final int OooO00 = 110;
    private static final int \u00d5OoO00 = 130;

    public Waldmensch() {
    }

    public Waldmensch(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 3);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        if (this.istVariante(\u00d8OoO00) || this.istVariante(thisclassvoid)) {
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
            this.setTalentwert(voidsuper.returnforObject, 2);
            if (this.istVariante(\u00d8OoO00)) {
                this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
            }
        }
        if (this.istVariante(Stringclassvoid)) {
            this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
            this.setTalentwert(voidsuper.returnprivateObject, 3);
        }
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
        arrayList.add(I.forpublic);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00d80\u00d2000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        if (this.istVariante(thisclassvoid)) {
            return this.getGroesse() - 130;
        }
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        if (this.istVariante(\u00d8OoO00)) {
            arrayList.add(new oooo_1("schwarz", 5, 20));
            arrayList.add(new oooo_1("blauschwarz", 14, 20));
            arrayList.add(new oooo_1("dunkelbraun", 1, 20));
        } else {
            arrayList.add(new oooo_1("blauschwarz", 2, 20));
            arrayList.add(new oooo_1("schwarz", 2, 20));
            arrayList.add(new oooo_1("dunkelbraun", 6, 20));
            arrayList.add(new oooo_1("mittelbraun", 10, 20));
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return "R17";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        if (this.istVariante(thisclassvoid)) {
            Dschungelstaemme dschungelstaemme = new Dschungelstaemme(this.getGeschlecht());
            if (bl) {
                dschungelstaemme.removeMoeglicheVariante(helden.model.kultur.Dschungelstaemme.\u00f5\u00d4\u00f8000);
                dschungelstaemme.removeMoeglicheVariante(helden.model.kultur.Dschungelstaemme.privateinterfaceclass);
                dschungelstaemme.removeMoeglicheVariante(helden.model.kultur.Dschungelstaemme.\u00d8\u00d4\u00f8000);
            }
            arrayList.add(dschungelstaemme);
        }
        if (this.istVariante(\u00d8OoO00)) {
            arrayList.add(new helden.model.kultur.Dschungelstaemme(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.VerloreneStaemme(this.getGeschlecht()));
            arrayList.add(new Miniwatu(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Darna(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Suedaventurien(this.getGeschlecht()));
            arrayList.add(new Bukanier(this.getGeschlecht()));
            arrayList.add(new Dschungelstaemme(this.getGeschlecht()));
            arrayList.add(new VerloreneStaemme(this.getGeschlecht()));
            arrayList.add(new Darna(this.getGeschlecht()));
            if (!bl) {
                arrayList.add(new Horasreich(this.getGeschlecht()));
                arrayList.add(new helden.model.kultur.Tocamuyac(this.getGeschlecht()));
                arrayList.add(new Aranien(this.getGeschlecht()));
                arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
                arrayList.add(new Tocamuyac(this.getGeschlecht()));
                arrayList.add(new Suedaventurien(this.getGeschlecht()));
                arrayList.add(new Tulamidenlande(this.getGeschlecht()));
                arrayList.add(new Elem(this.getGeschlecht()));
                arrayList.add(new BosparanischesReich(this.getGeschlecht()));
            }
        }
        if (this.istVariante(Stringclassvoid)) {
            arrayList.add(new helden.model.kultur.Tocamuyac(this.getGeschlecht()));
            arrayList.add(new Tocamuyac(this.getGeschlecht()));
            if (!bl) {
                arrayList.add(new helden.model.kultur.Dschungelstaemme(this.getGeschlecht()));
                arrayList.add(new Miniwatu(this.getGeschlecht()));
                arrayList.add(new WaldinselUtulus(this.getGeschlecht()));
                arrayList.add(new helden.model.kultur.Suedaventurien(this.getGeschlecht()));
                arrayList.add(new Bukanier(this.getGeschlecht()));
                arrayList.add(new Horasreich(this.getGeschlecht()));
                arrayList.add(new Aranien(this.getGeschlecht()));
                arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
                arrayList.add(new Garetien(this.getGeschlecht()));
                arrayList.add(new Dschungelstaemme(this.getGeschlecht()));
                arrayList.add(new helden.model.DDZKulturen.WaldinselUtulus(this.getGeschlecht()));
                arrayList.add(new Suedaventurien(this.getGeschlecht()));
                arrayList.add(new Tulamidenlande(this.getGeschlecht()));
                arrayList.add(new Haranija(this.getGeschlecht()));
                arrayList.add(new Alhanien(this.getGeschlecht()));
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
        if (this.istVariante(thisclassvoid)) {
            return this.getMinGroesse() - 130;
        }
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        int n = 0;
        n = this.istVariante(Stringclassvoid) ? 142 : (this.istVariante(thisclassvoid) ? 201 : 152);
        return n;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilenull);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.\u00f8\u00d40000);
        if (this.istVariante(Stringclassvoid)) {
            arrayList.add(I.\u00f5\u00f6o000);
        }
        if (this.istVariante(thisclassvoid)) {
            arrayList.add(I.O\u00d20000);
            arrayList.add(I.\u00f50\u00d2000);
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.istVariante(Stringclassvoid)) {
            oo0O.\u00d300000(K.o00000(I.O\u00d20000));
        }
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istVariante(Stringclassvoid)) {
            return "Tocamuyac";
        }
        if (this.istVariante(thisclassvoid)) {
            return "Tapasuul";
        }
        return "Waldmensch";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        int n = 0;
        int n2 = 0;
        n = this.istVariante(Stringclassvoid) ? 142 : (this.istVariante(thisclassvoid) ? 201 : 152);
        n2 = this.istVariante(thisclassvoid) ? n + Wuerfel.w20() : n + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
        return n2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(thisclassvoid);
        this.addAlleVarianten(\u00d8OoO00);
        this.addAlleVarianten(Stringclassvoid);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d5\u00f4\u00d2000, 1);
        this.putModifikator(b_0.\u00f4\u00f4\u00d2000, 1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.privatedosuper, -1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 8);
        this.putModifikator(b_0.thispublicsuper, 12);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -6);
        if (this.istVariante(thisclassvoid)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 2);
            this.putModifikator(b_0.thispublicsuper, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(thisclassvoid);
        this.addMoeglicheVariante(\u00d8OoO00);
        this.addMoeglicheVariante(Stringclassvoid);
    }
}

