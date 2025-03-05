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
import helden.model.DDZKulturen.Alhanien;
import helden.model.kultur.Aranien;
import helden.model.kultur.Ferkina;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Trollzacken;
import java.util.ArrayList;

public class Trollzacker
extends o0oo_0 {
    private static final int \u00f8\u00f5OO00 = 195;
    private static final int whilenewvoid = 215;
    private static final int \u00d3\u00f6OO00 = 100;
    private static final int o\u00f6OO00 = 95;
    public static final P O\u00f6OO00 = new P("Rochshaz", -1, true);

    public Trollzacker() {
    }

    public Trollzacker(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        if (this.istVariante(O\u00f6OO00)) {
            this.setTalentwert(voidsuper.ifforObject, 2);
        } else {
            this.setTalentwert(voidsuper.ifforObject, 1);
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
        arrayList.add(new oooo_1("schwarz", 16, 20));
        arrayList.add(new oooo_1("dunkelbraun", 1, 20));
        arrayList.add(new oooo_1("braun", 1, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f4\u00d40000);
        arrayList.add(I.newStringsuper);
        if (this.istVariante(O\u00f6OO00)) {
            arrayList.add(I.\u00f4\u00f8o000);
        }
        return arrayList;
    }

    @Override
    public int getGewicht() {
        if (this.istVariante(O\u00f6OO00)) {
            return this.getGroesse() - 95;
        }
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 15, 20));
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("mittelbraun", 1, 20));
        arrayList.add(new oooo_1("hellbraun", 1, 20));
        arrayList.add(new oooo_1("dunkelblond", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R12";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Trollzacken(this.getGeschlecht()));
        arrayList.add(new helden.model.DDZKulturen.Trollzacken(this.getGeschlecht()));
        if (!bl && !this.istVariante(O\u00f6OO00)) {
            arrayList.add(new Ferkina(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new Aranien(this.getGeschlecht()));
            arrayList.add(new Alhanien(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 20;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 20;
    }

    @Override
    public int getMinGewicht() {
        if (this.istVariante(O\u00f6OO00)) {
            return this.getMinGroesse() - 95;
        }
        return this.getMinGroesse() - 100;
    }

    @Override
    public int getMinGroesse() {
        if (this.istVariante(O\u00f6OO00)) {
            return 215;
        }
        return 195;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.thissuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.O\u00d20000);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.\u00d4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8o0000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        if (this.istVariante(O\u00f6OO00)) {
            J j3 = (J)K.o00000(I.o\u00f5O000);
            j3.oO0000(6);
            oo0O.\u00d300000(j3);
        }
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istVariante(O\u00f6OO00)) {
            return "Trollzacker/Rochshaz";
        }
        return "Trollzacker";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        if (this.istVariante(O\u00f6OO00)) {
            return 215 + Wuerfel.w20();
        }
        return 195 + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 7;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(O\u00f6OO00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, 2);
        this.putModifikator(b_0.newwhilesuper, -1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.privatedosuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 11);
        this.putModifikator(b_0.thispublicsuper, 18);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -5);
        if (this.istVariante(O\u00f6OO00)) {
            this.putModifikator(b_0.O\u00f5\u00d2000, -1);
            this.putModifikator(b_0.\u00f4\u00f4\u00d2000, -1);
            this.putModifikator(b_0.returnwhilesuper, 1);
            this.putModifikator(b_0.privatedosuper, 1);
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
            this.putModifikator(b_0.thispublicsuper, 2);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(O\u00f6OO00);
    }
}

