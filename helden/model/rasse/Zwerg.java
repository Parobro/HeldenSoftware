/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Brillantzwerge;
import helden.model.DDZKulturen.Brobim;
import helden.model.DDZKulturen.DiamantenesSultanat;
import helden.model.DDZKulturen.Erzzwerge;
import helden.model.DDZKulturen.Koschzwerge;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.kultur.Almada;
import helden.model.kultur.Ambosszwerge;
import helden.model.kultur.AndergastNostria;
import helden.model.kultur.Bornland;
import helden.model.kultur.Garetien;
import helden.model.kultur.Horasreich;
import helden.model.kultur.Huegelzwerge;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Thorwal;
import helden.model.kultur.TulamidischeStadtstaaten;
import java.util.ArrayList;

public class Zwerg
extends o0oo_0
implements for {
    public static final P \u00d5\u00f8OO00 = new P("Brillantzwerge", 0, false);
    public static final P \u00f4\u00f8OO00 = new P("Erz-/H\u00fcgelzwerge", 0, false);
    public static final P \u00d8\u00f8OO00 = new P("Erz-/Koschzwerge", 0, false);
    public static final P \u00d4\u00f8OO00 = new P("Ambosszwerge", 4, false);
    public static final P forObjectvoid = new P("Wilde Zwerge", 4, false);
    private static final int \u00d3\u00f8OO00 = 128;
    private static final int \u00f5\u00f8OO00 = 80;
    private Oo0O nullObjectvoid;

    public Zwerg() {
    }

    public Zwerg(Geschlecht geschlecht) {
        super(geschlecht);
        this.nullObjectvoid = new Oo0O();
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.nullObjectvoid.\u00d300000(public_);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.o\u00d2\u00d8000, -3);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, -1);
        this.setTalentwert(voidsuper.returnprivateObject, -3);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d50\u00d8000, 1);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(80);
        arrayList.add(130);
        arrayList.add(180);
        arrayList.add(220);
        arrayList.add(260);
        arrayList.add(290);
        arrayList.add(25);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("blau", 1, 20));
        arrayList.add(new oooo_1("grau", 4, 20));
        arrayList.add(new oooo_1("schwarz", 6, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.whilenull);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d5O0000);
        arrayList.add(I.\u00f4Oo000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.o00000);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.newStringsuper);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 80;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blond", 5, 20));
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("dunkelgrau", 2, 20));
        arrayList.add(new oooo_1("hellgrau", 2, 20));
        arrayList.add(new oooo_1("salzwei\u00df", 1, 20));
        arrayList.add(new oooo_1("silberwei\u00df", 1, 20));
        arrayList.add(new oooo_1("feuerrot", 2, 20));
        arrayList.add(new oooo_1("kupferrot", 3, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R18";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Ambosszwerge(this.getGeschlecht()));
        arrayList.add(new helden.model.kultur.Erzzwerge(this.getGeschlecht()));
        arrayList.add(new Huegelzwerge(this.getGeschlecht()));
        arrayList.add(new helden.model.kultur.Brillantzwerge(this.getGeschlecht()));
        if (this.istVariante(\u00d8\u00f8OO00)) {
            arrayList.add(new Erzzwerge(this.getGeschlecht()));
            arrayList.add(new Koschzwerge(this.getGeschlecht()));
        }
        if (this.istVariante(\u00d4\u00f8OO00)) {
            arrayList.add(new helden.model.DDZKulturen.Ambosszwerge(this.getGeschlecht()));
        }
        if (this.istVariante(\u00d5\u00f8OO00)) {
            arrayList.add(new Brillantzwerge(this.getGeschlecht()));
        }
        if (this.istVariante(forObjectvoid)) {
            arrayList.add(new helden.model.kultur.Brobim(this.getGeschlecht()));
            arrayList.add(new Brobim(this.getGeschlecht()));
        }
        if (!bl && !this.istVariante(forObjectvoid)) {
            Nordprovinzen nordprovinzen;
            OooO oooO2;
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new Almada(this.getGeschlecht()));
            arrayList.add(new Horasreich(this.getGeschlecht()));
            arrayList.add(new Bornland(this.getGeschlecht()));
            arrayList.add(new Thorwal(this.getGeschlecht()));
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new TulamidischeStadtstaaten(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            if (this.istVariante(\u00d8\u00f8OO00)) {
                arrayList.add(new helden.model.DDZKulturen.Ambosszwerge(this.getGeschlecht()));
                arrayList.add(new Brillantzwerge(this.getGeschlecht()));
                oooO2 = new BosparanischesReich(this.getGeschlecht());
                oooO2.clearMoeglicheVarianten();
                oooO2.addMoeglicheVariante(BosparanischesReich.\u00d5\u00d20O00);
                arrayList.add(oooO2);
                nordprovinzen = new Nordprovinzen(this.getGeschlecht());
                nordprovinzen.clearMoeglicheVarianten();
                nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00d5\u00d50O00);
                nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00d3\u00d60O00);
                arrayList.add(nordprovinzen);
            }
            if (this.istVariante(\u00d5\u00f8OO00)) {
                arrayList.add(new helden.model.DDZKulturen.Ambosszwerge(this.getGeschlecht()));
                arrayList.add(new Erzzwerge(this.getGeschlecht()));
                arrayList.add(new Koschzwerge(this.getGeschlecht()));
                arrayList.add(new Alhanien(this.getGeschlecht()));
                oooO2 = new Nordprovinzen(this.getGeschlecht());
                oooO2.clearMoeglicheVarianten();
                oooO2.addMoeglicheVariante(Nordprovinzen.thisintreturn);
                arrayList.add(oooO2);
            }
            if (this.istVariante(\u00d4\u00f8OO00)) {
                arrayList.add(new Brillantzwerge(this.getGeschlecht()));
                arrayList.add(new Erzzwerge(this.getGeschlecht()));
                arrayList.add(new Koschzwerge(this.getGeschlecht()));
                arrayList.add(new DiamantenesSultanat(this.getGeschlecht()));
                oooO2 = new BosparanischesReich(this.getGeschlecht());
                oooO2.clearMoeglicheVarianten();
                oooO2.addMoeglicheVariante(BosparanischesReich.\u00d5\u00d20O00);
                arrayList.add(oooO2);
                nordprovinzen = new Nordprovinzen(this.getGeschlecht());
                nordprovinzen.clearMoeglicheVarianten();
                nordprovinzen.addMoeglicheVariante(Nordprovinzen.thisintreturn);
                nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00d3\u00d60O00);
                arrayList.add(nordprovinzen);
            }
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 12;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 12;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 80;
    }

    @Override
    public int getMinGroesse() {
        return 128;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.thissuper);
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.nullclass);
        arrayList.add(I.newfor);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d4\u00d8o000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f50O000));
        M m = (M)K.o00000(I.\u00d5\u00d50000);
        m.\u00d2o0000();
        m.o00000("mineralische Gifte");
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(K.o00000(I.o\u00f4o000));
        oo0O.\u00d300000(K.o00000(I.Stringsuper));
        J j2 = (J)K.o00000(I.privateclass);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        M m2 = (M)K.o00000(I.fordo);
        m2.\u00d2o0000();
        m2.o00000(voidsuper.returnprivateObject);
        oo0O.\u00d300000(m2);
        oo0O.\u00d300000(K.o00000(I.\u00f50\u00d2000));
        if (this.istVariante(forObjectvoid)) {
            oo0O.\u00d300000(K.o00000(I.o\u00d50000));
        }
        if (this.nullObjectvoid != null) {
            oo0O.new(this.nullObjectvoid);
        }
        return oo0O;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Zwerg";
        }
        return "Zwergin";
    }

    @Override
    public int wurfeleAlter() {
        return 35 + Wuerfel.w(6);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 128 + Wuerfel.w6() + Wuerfel.w6();
    }

    @Override
    protected int getBasisGPKosten() {
        return 12;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d4\u00f8OO00);
        this.addAlleVarianten(\u00d5\u00f8OO00);
        this.addAlleVarianten(\u00f4\u00f8OO00);
        this.addAlleVarianten(\u00d8\u00f8OO00);
        this.addAlleVarianten(forObjectvoid);
    }

    @Override
    protected void setzeModifikationen() {
        if (!this.istVariante(forObjectvoid)) {
            this.putModifikator(b_0.O\u00f5\u00d2000, 1);
        }
        this.putModifikator(b_0.\u00f4\u00f4\u00d2000, -1);
        this.putModifikator(b_0.returnwhilesuper, 2);
        this.putModifikator(b_0.privatedosuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 10);
        this.putModifikator(b_0.thispublicsuper, 18);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -4);
        if (this.istVariante(\u00d4\u00f8OO00) || this.istVariante(forObjectvoid)) {
            this.putModifikator(b_0.privatedosuper, 1);
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 2);
        }
        if (this.istVariante(\u00f4\u00f8OO00) || this.istVariante(\u00d8\u00f8OO00)) {
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
            this.putModifikator(b_0.thispublicsuper, -3);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d4\u00f8OO00);
        this.addMoeglicheVariante(\u00d5\u00f8OO00);
        this.addMoeglicheVariante(\u00f4\u00f8OO00);
        this.addMoeglicheVariante(\u00d8\u00f8OO00);
        this.addMoeglicheVariante(forObjectvoid);
    }
}

