/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o00o_0;
import helden.model.DDZKulturen.AlMada;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Goblinbande;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Orkland;
import helden.model.DDZKulturen.Yurach;
import helden.model.kultur.AndergastNostria;
import helden.model.kultur.Bornland;
import helden.model.kultur.FestumerGhetto;
import helden.model.kultur.Garetien;
import helden.model.kultur.Goblinstamm;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Svellttal;
import java.util.ArrayList;

public class Goblin
extends o0oo_0
implements for {
    private static final int \u00d5\u00f5OO00 = 135;
    private static final int returnnewvoid = 100;
    private public \u00d4\u00f5OO00;

    public Goblin() {
    }

    public Goblin(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.\u00d4\u00f5OO00 = public_;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, -1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.newnewObject, -1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 4);
        if (this.istMaennlich()) {
            this.setTalentwert(voidsuper.\u00d40\u00d6000, -1);
        } else {
            this.setTalentwert(voidsuper.\u00d40\u00d6000, -3);
        }
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, -1);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(42);
        arrayList.add(47);
        arrayList.add(50);
        arrayList.add(52);
        arrayList.add(1);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("gr\u00fcn", 1, 20));
        arrayList.add(new oooo_1("gelb", 4, 20));
        arrayList.add(new oooo_1("hellrot", 6, 20));
        arrayList.add(new oooo_1("dunkelrot", 6, 20));
        arrayList.add(new oooo_1("rotbraun", 2, 20));
        arrayList.add(new oooo_1("rotviolett", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.thissuper);
        arrayList.add(I.ifif);
        arrayList.add(I.\u00f4Oo000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d50o000);
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
        arrayList.add(new oooo_1("orangerot", 2, 20));
        arrayList.add(new oooo_1("feuerrot", 5, 20));
        arrayList.add(new oooo_1("rotbraun", 6, 20));
        arrayList.add(new oooo_1("dunkelrot", 5, 20));
        arrayList.add(new oooo_1("rot-grau", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R04";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Goblinstamm(this.getGeschlecht()));
        arrayList.add(new helden.model.kultur.Goblinbande(this.getGeschlecht()));
        arrayList.add(new FestumerGhetto(this.getGeschlecht()));
        arrayList.add(new Garetien(this.getGeschlecht()));
        arrayList.add(new Goblinbande(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Bornland(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Orkland(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Yurach(this.getGeschlecht()));
            arrayList.add(new Alhanien(this.getGeschlecht()));
            arrayList.add(new Nordprovinzen(this.getGeschlecht()));
            arrayList.add(new BosparanischesReich(this.getGeschlecht()));
            arrayList.add(new AlMada(this.getGeschlecht()));
            arrayList.add(new Orkland(this.getGeschlecht()));
            arrayList.add(new Yurach(this.getGeschlecht()));
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
        return 135;
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        ArrayList<public> arrayList = new ArrayList<public>();
        M m = (M)K.o00000(I.ifif);
        m.\u00d2o0000();
        ArrayList arrayList2 = m.\u00d200000(false);
        D<String> d2 = arrayList2.get(0);
        d2.o00000("Geh\u00f6r");
        D<String> d3 = arrayList2.get(1);
        d3.o00000("Geruch");
        arrayList.add(d2);
        arrayList.add(d3);
        return new o00o_0(this, arrayList, 1);
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.privateclasssuper);
        if (this.istMaennlich()) {
            arrayList.add(I.whilenull);
        }
        arrayList.add(I.o\u00d50000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.newif);
        arrayList.add(I.nullclass);
        arrayList.add(I.newfor);
        arrayList.add(I.OOO000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.istMaennlich()) {
            oo0O.\u00d300000(K.o00000(I.\u00f50O000));
        }
        J j2 = (J)K.o00000(I.forpublic);
        j2.oO0000(1);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00f60000));
        oo0O.\u00d300000(this.\u00d4\u00f5OO00);
        oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        if (!this.istMaennlich()) {
            oo0O.\u00d300000(K.o00000(I.\u00d5O0000));
        }
        M m = (M)K.o00000(I.\u00d4\u00f40000);
        m.\u00d2o0000();
        m.o00000("Biss (1W6)");
        oo0O.\u00d300000(m);
        J j3 = (J)K.o00000(I.ifwhile);
        j3.oO0000(1);
        oo0O.\u00d300000(j3);
        oo0O.\u00d300000(K.o00000(I.O\u00d20000));
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f5o000));
        return oo0O;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.\u00d4\u00f5OO00 == null;
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Goblin";
        }
        return "Goblinin";
    }

    @Override
    public int wurfeleAlter() {
        return 10 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 135 + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
    }

    @Override
    protected int getBasisGPKosten() {
        if (this.istMaennlich()) {
            return 3;
        }
        return 7;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, -1);
        this.putModifikator(b_0.newwhilesuper, -2);
        this.putModifikator(b_0.O\u00f5\u00d2000, 2);
        this.putModifikator(b_0.\u00f4\u00f4\u00d2000, 2);
        this.putModifikator(b_0.privatedosuper, -1);
        this.putModifikator(b_0.\u00f4\u00d8\u00d2000, 2);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 4);
        this.putModifikator(b_0.thispublicsuper, 12);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -5);
        if (!this.istMaennlich()) {
            this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 1);
        }
    }
}

