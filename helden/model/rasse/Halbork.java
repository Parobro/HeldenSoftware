/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.Gjalskerlaender;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Nortreisch;
import helden.model.DDZKulturen.Yurach;
import helden.model.kultur.Bornland;
import helden.model.kultur.Garetien;
import helden.model.kultur.Svellttal;
import helden.model.kultur.SvellttalOkkupanten;
import java.util.ArrayList;

public class Halbork
extends o0oo_0 {
    private static final int \u00d8\u00f5OO00 = 160;
    private static final int \u00f4\u00f5OO00 = 100;

    public Halbork() {
    }

    public Halbork(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.newnewObject, -2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(48);
        arrayList.add(54);
        arrayList.add(58);
        arrayList.add(60);
        arrayList.add(2);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("rot", 5, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 3, 20));
        arrayList.add(new oooo_1("braun", 5, 20));
        arrayList.add(new oooo_1("schwarz", 7, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00f4\u00d40000);
        arrayList.add(I.newStringsuper);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blond", 2, 20));
        arrayList.add(new oooo_1("rot", 4, 20));
        arrayList.add(new oooo_1("braun", 6, 20));
        arrayList.add(new oooo_1("schwarz", 8, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R06";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new helden.model.kultur.Yurach(this.getGeschlecht()));
        arrayList.add(new Yurach(this.getGeschlecht()));
        arrayList.add(new Nortreisch(this.getGeschlecht()));
        Nordprovinzen nordprovinzen = new Nordprovinzen(this.getGeschlecht());
        nordprovinzen.clearMoeglicheVarianten();
        nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00f5\u00d50O00);
        nordprovinzen.addMoeglicheVariante(Nordprovinzen.thisintreturn);
        nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00d3\u00d60O00);
        arrayList.add(nordprovinzen);
        if (!bl) {
            arrayList.add(new SvellttalOkkupanten(this.getGeschlecht()));
            arrayList.add(new Bornland(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Gjalskerlaender(this.getGeschlecht()));
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 24;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 24;
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
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.newfor);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d4O000));
        oo0O.\u00d300000(K.o00000(I.ifreturn));
        J j2 = (J)K.o00000(I.o\u00f5O000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        return oo0O;
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Halbork";
        }
        return "Halborkin";
    }

    @Override
    public int wurfeleAlter() {
        return 13 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 160 + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
    }

    @Override
    protected int getBasisGPKosten() {
        return 1;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, 1);
        this.putModifikator(b_0.newwhilesuper, -1);
        this.putModifikator(b_0.\u00d5\u00f4\u00d2000, -2);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.privatedosuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 11);
        this.putModifikator(b_0.thispublicsuper, 15);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -6);
    }
}

