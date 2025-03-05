/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.kultur.AndergastNostria;
import helden.model.kultur.Garetien;
import helden.model.kultur.Orkland;
import helden.model.kultur.Suedaventurien;
import helden.model.kultur.Svellttal;
import helden.model.kultur.SvellttalOkkupanten;
import helden.model.kultur.Thorwal;
import helden.model.kultur.Yurach;
import java.util.ArrayList;

public class Ork
extends o0oo_0 {
    public static final P \u00d4\u00f4OO00 = new P("keine Variante", 0, false);
    public static final P \u00f5\u00f4OO00 = new P("Zholochai", 0, false);
    public static final P O\u00f4OO00 = new P("Olochtai", 0, false);
    public static final P \u00d8\u00f4OO00 = new P("Mokolash", 0, false);
    public static final P privatesupervoid = new P("Korogai", 0, false);
    public static final P \u00f8\u00f4OO00 = new P("Orichai", 0, false);
    public static final P o\u00f4OO00 = new P("Truanzhai", 0, false);
    public static final P \u00d5\u00f4OO00 = new P("Tscharshai", 0, false);
    public static final P \u00f4\u00f4OO00 = new P("Orkfrau", -10, false);
    private static final int nullsupervoid = 150;
    private static final int forsupervoid = 145;
    private static final int \u00d3\u00f4OO00 = 95;
    private static final int \u00f8\u00d8OO00 = 90;

    public Ork() {
    }

    public Ork(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.newnewObject, -2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
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
        arrayList.add(new oooo_1("gelb", 4, 20));
        arrayList.add(new oooo_1("rot", 8, 20));
        arrayList.add(new oooo_1("grau", 4, 20));
        arrayList.add(new oooo_1("schwarz", 4, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f4Oo000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00f4\u00d40000);
        arrayList.add(I.newStringsuper);
        arrayList.add(I.\u00d8\u00f8O000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        int n = 0;
        n = !this.istMaennlich() ? 90 : 95;
        return this.getGroesse() - n;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        if (this.istVariante(\u00d8\u00f4OO00)) {
            arrayList.add(new oooo_1("braun", 20, 20));
        }
        if (this.istVariante(O\u00f4OO00)) {
            arrayList.add(new oooo_1("grau", 20, 20));
        }
        if (this.istVariante(\u00f5\u00f4OO00)) {
            arrayList.add(new oooo_1("braun-schwarz", 3, 20));
            arrayList.add(new oooo_1("tiefschwarz", 8, 20));
            arrayList.add(new oooo_1("blauschwarz", 9, 20));
        } else {
            arrayList.add(new oooo_1("dunkelbraun", 5, 20));
            arrayList.add(new oooo_1("braun-schwarz", 6, 20));
            arrayList.add(new oooo_1("tiefschwarz", 8, 20));
            arrayList.add(new oooo_1("blauschwarz", 1, 20));
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return "R10";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Orkland(this.getGeschlecht()));
        arrayList.add(new Yurach(this.getGeschlecht()));
        arrayList.add(new SvellttalOkkupanten(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Suedaventurien(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new Thorwal(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 40;
    }

    @Override
    public int getMaxGroesse() {
        int n = 18;
        if (this.istVariante(\u00f5\u00f4OO00)) {
            n += 6;
        }
        return this.getMinGroesse() + n;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 95;
    }

    @Override
    public int getMinGroesse() {
        return 150;
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
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.ooO000);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.newfor);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d4\u00f5o000);
        arrayList.add(I.forsuper);
        arrayList.add(I.\u00f4\u00d6o000);
        arrayList.add(I.forObject);
        arrayList.add(I.\u00f5\u00f4O000);
        arrayList.add(I.\u00f5o0000);
        arrayList.add(I.\u00f4oo000);
        arrayList.add(I.Stringvoidsuper);
        arrayList.add(I.\u00d5O\u00d2000);
        arrayList.add(I.nullclass);
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.newnew);
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f50O000));
        oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        J j2 = (J)K.o00000(I.ifwhile);
        j2.oO0000(1);
        oo0O.\u00d300000(j2);
        M m = (M)K.o00000(I.\u00d4\u00f40000);
        m.\u00d2o0000();
        m.o00000("Biss (1W6+1)");
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d4O000));
        oo0O.\u00d300000(K.o00000(I.ifreturn));
        if (this.istMaennlich()) {
            J j3 = (J)K.o00000(I.o\u00f5O000);
            j3.oO0000(6);
            oo0O.\u00d300000(j3);
        }
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(K.o00000(I.\u00d8\u00d40000));
        if (!this.istMaennlich()) {
            oo0O.\u00d300000(K.o00000(I.\u00d8\u00f8O000.toString(), new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.class.toString()}));
        }
        return oo0O;
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = null;
        stringBuffer = this.istMaennlich() ? new StringBuffer("Ork") : new StringBuffer("Orkin");
        if (this.istVariante(\u00f5\u00f4OO00)) {
            stringBuffer.append("/Zholochai");
        }
        if (this.istVariante(privatesupervoid)) {
            stringBuffer.append("/Korogai");
        }
        if (this.istVariante(\u00d8\u00f4OO00)) {
            stringBuffer.append("/Mokolash");
        }
        if (this.istVariante(\u00f8\u00f4OO00)) {
            stringBuffer.append("/Orichai");
        }
        if (this.istVariante(O\u00f4OO00)) {
            stringBuffer.append("/Olochtai");
        }
        if (this.istVariante(o\u00f4OO00)) {
            stringBuffer.append("/Truanzhai");
        }
        if (this.istVariante(\u00d5\u00f4OO00)) {
            stringBuffer.append("/Tscharshai");
        }
        if (this.istVariante(\u00f4\u00f4OO00)) {
            stringBuffer.append("/Orkfrau");
        } else {
            stringBuffer.append("");
        }
        return stringBuffer.toString();
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        int n = 0;
        n = !this.istMaennlich() ? 145 : 150;
        int n2 = n + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
        if (this.istVariante(\u00f5\u00f4OO00)) {
            n2 += Wuerfel.w6();
        }
        return n2;
    }

    @Override
    protected int getBasisGPKosten() {
        if (this.istMaennlich()) {
            return 12;
        }
        return 2;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d4\u00f4OO00);
        this.addAlleVarianten(\u00f5\u00f4OO00);
        this.addAlleVarianten(privatesupervoid);
        this.addAlleVarianten(\u00d8\u00f4OO00);
        this.addAlleVarianten(O\u00f4OO00);
        this.addAlleVarianten(\u00f8\u00f4OO00);
        this.addAlleVarianten(o\u00f4OO00);
        this.addAlleVarianten(\u00d5\u00f4OO00);
        this.addAlleVarianten(\u00f4\u00f4OO00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.newwhilesuper, -2);
        this.putModifikator(b_0.\u00d5\u00f4\u00d2000, -2);
        this.putModifikator(b_0.O\u00f5\u00d2000, -1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.privatedosuper, 1);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -7);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 10);
        this.putModifikator(b_0.thispublicsuper, 15);
        if (this.istMaennlich()) {
            this.putModifikator(b_0.whilewhilesuper, 2);
            this.putModifikator(b_0.returnwhilesuper, 1);
            this.putModifikator(b_0.privatedosuper, 1);
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 2);
            this.putModifikator(b_0.thispublicsuper, 3);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d4\u00f4OO00);
        this.addMoeglicheVariante(\u00f5\u00f4OO00);
        this.addMoeglicheVariante(privatesupervoid);
        this.addMoeglicheVariante(\u00d8\u00f4OO00);
        this.addMoeglicheVariante(O\u00f4OO00);
        this.addMoeglicheVariante(\u00f8\u00f4OO00);
        this.addMoeglicheVariante(o\u00f4OO00);
        this.addMoeglicheVariante(\u00d5\u00f4OO00);
    }
}

