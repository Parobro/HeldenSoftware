/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.for;
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
import helden.model.DDZKulturen.Elem;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.kultur.ArchaischeAchaz;
import helden.model.kultur.StammesAchaz;
import java.util.ArrayList;

public class Achaz
extends o0oo_0 {
    public static final P \u00d50oO00 = new P("Echsensumpf-Achaz", 9, false);
    public static final P \u00d40oO00 = new P("Orkland-Achaz", 4, false);
    public static final P newStringvoid = new P("Waldinsel-Achaz", 0, false);
    public static final P o0oO00 = new P("Maraskan-Achaz", 11, false);
    private static final int returnStringvoid = 167;
    private static final int \u00f8\u00f8OO00 = 159;
    private static final int \u00d80oO00 = 207;
    private static final int privateObjectvoid = 172;
    private static final int O0oO00 = 120;
    private static final int \u00d30oO00 = 130;

    public Achaz() {
    }

    public Achaz(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 5);
        this.setTalentwert(voidsuper.newnewObject, -3);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 5);
        this.setTalentwert(voidsuper.returnwhileObject, -3);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, -1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.privateObjectObject, -3);
        if (!this.istVariante(o0oO00)) {
            this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        }
        if (this.istVariante(o0oO00)) {
            this.removeTalent(E.\u00f4\u00d6\u00d8000);
            this.setTalentwert(voidsuper.returnprivateObject, 3);
            this.setTalentwert(voidsuper.o\u00d3\u00d6000, 7);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        }
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(35);
        arrayList.add(50);
        arrayList.add(65);
        arrayList.add(80);
        arrayList.add(100);
        arrayList.add(120);
        arrayList.add(30);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("golden", 2, 20));
        arrayList.add(new oooo_1("gelb", 2, 20));
        arrayList.add(new oooo_1("hellgr\u00fcn", 5, 20));
        arrayList.add(new oooo_1("olivgr\u00fcn", 5, 20));
        arrayList.add(new oooo_1("dunkel gr\u00fcn", 3, 20));
        arrayList.add(new oooo_1("hellbraun", 2, 20));
        arrayList.add(new oooo_1("kupfern", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.thissuper);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.\u00f4Oo000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.O\u00f6o000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.\u00d40o000);
        arrayList.add(I.\u00f4\u00d40000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        if (this.istVariante(newStringvoid)) {
            return this.getGroesse() - 130;
        }
        return this.getGroesse() - 120;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("hellgr\u00fcn", 5, 20));
        arrayList.add(new oooo_1("olivgr\u00fcn", 5, 20));
        arrayList.add(new oooo_1("dunkelgr\u00fcn", 5, 20));
        arrayList.add(new oooo_1("braungr\u00fcn", 3, 20));
        arrayList.add(new oooo_1("braun", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R01";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        StammesAchaz stammesAchaz = new StammesAchaz(this.getGeschlecht());
        stammesAchaz.clearMoeglicheVarianten();
        if (this.istVariante(\u00d40oO00)) {
            stammesAchaz.waehleVariante(StammesAchaz.\u00f4O0O00);
            arrayList.add(stammesAchaz);
        } else {
            arrayList.add(stammesAchaz);
            arrayList.add(new ArchaischeAchaz(this.getGeschlecht()));
            if (!bl) {
                arrayList.add(new helden.model.kultur.Suedaventurien(this.getGeschlecht()));
                arrayList.add(new Suedaventurien(this.getGeschlecht()));
                arrayList.add(new Elem(this.getGeschlecht()));
            }
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 18;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 18;
    }

    @Override
    public int getMinGewicht() {
        if (this.istVariante(newStringvoid)) {
            return this.getMinGroesse() - 130;
        }
        return this.getMinGroesse() - 120;
    }

    @Override
    public int getMinGroesse() {
        int n = 0;
        if (this.istVariante(\u00d50oO00)) {
            n = 167;
        }
        if (this.istVariante(\u00d40oO00)) {
            n = 159;
        }
        if (this.istVariante(newStringvoid)) {
            n = 207;
        }
        if (this.istVariante(o0oO00)) {
            n = 172;
        }
        return n;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d5O0000.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000.toString()));
        if (this.istVariante(o0oO00)) {
            oOOo.o00000(K.o00000(voidsuper.o\u00d3\u00d6000, "Geruch"));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f800000);
        arrayList.add(helden.framework.C.K.o00000(I.ifif, "Tastsinn", "Geh\u00f6r"));
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.O\u00d20000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00f40\u00d2000);
        arrayList.add(I.\u00f5\u00d6O000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d2\u00f6\u00d4000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5O0000));
        M m = (M)helden.framework.C.K.o00000(I.\u00f4\u00d20000);
        m.\u00d2o0000();
        m.o00000(voidsuper.returnprivateObject);
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.ifnullsuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f50O000));
        M m2 = (M)helden.framework.C.K.o00000(I.ifif);
        m2.\u00d2o0000();
        m2.o00000("Geruch");
        oo0O.\u00d300000(m2);
        J j2 = (J)helden.framework.C.K.o00000(I.ifwhile);
        if (this.istVariante(\u00d40oO00)) {
            j2.oO0000(1);
        } else {
            j2.oO0000(2);
        }
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f8\u00d4O000));
        M m3 = (M)helden.framework.C.K.o00000(I.\u00d800000);
        m3.\u00d2o0000();
        m3.o00000("Schwanz");
        oo0O.\u00d300000(m3);
        M m4 = (M)helden.framework.C.K.o00000(I.\u00d4\u00f40000);
        m4.\u00d2o0000();
        m4.o00000("Biss (1W6 (A))");
        m4.o00000("Schwanz (1W6 (A))");
        oo0O.\u00d300000(m4);
        if (this.istVariante(o0oO00)) {
            helden.framework.C.K.o00000(I.\u00d8O\u00d2000);
        }
        J j3 = (J)helden.framework.C.K.o00000(I.nullclass);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        M m5 = (M)helden.framework.C.K.o00000(I.O\u00d40000);
        m5.\u00d2o0000();
        m5.o00000("Geh\u00f6r");
        oo0O.\u00d300000(m5);
        if (!this.istVariante(\u00d40oO00)) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00f6o000));
        }
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d8\u00d40000));
        M m6 = (M)helden.framework.C.K.o00000(I.fordo);
        m6.\u00d2o0000();
        m6.o00000(voidsuper.newnewObject);
        m6.o00000(voidsuper.returnwhileObject);
        m6.o00000(voidsuper.privateObjectObject);
        oo0O.\u00d300000(m6);
        return oo0O;
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Achaz");
        if (this.varianteGewaehlt()) {
            stringBuffer.append("/");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public int wurfeleAlter() {
        return 20 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        int n = 0;
        if (this.istVariante(\u00d50oO00)) {
            n = 167;
        }
        if (this.istVariante(\u00d40oO00)) {
            n = 159;
        }
        if (this.istVariante(newStringvoid)) {
            n = 207;
        }
        if (this.istVariante(o0oO00)) {
            n = 172;
        }
        return n + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
    }

    @Override
    protected int getBasisGPKosten() {
        return 5;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d50oO00);
        this.addAlleVarianten(\u00d40oO00);
        this.addAlleVarianten(newStringvoid);
        this.addAlleVarianten(o0oO00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, -1);
        this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 2);
        this.putModifikator(b_0.O\u00f5\u00d2000, 1);
        this.putModifikator(b_0.\u00f4\u00f4\u00d2000, 1);
        this.putModifikator(b_0.privatedosuper, -1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 8);
        this.putModifikator(b_0.thispublicsuper, 7);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -2);
        if (this.istVariante(\u00d50oO00)) {
            this.putModifikator(b_0.returnwhilesuper, 1);
        }
        if (this.istVariante(newStringvoid)) {
            this.putModifikator(b_0.O\u00f5\u00d2000, -3);
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, -1);
        }
        if (this.istVariante(o0oO00)) {
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, -1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d50oO00);
        this.addMoeglicheVariante(\u00d40oO00);
        this.addMoeglicheVariante(newStringvoid);
        this.addMoeglicheVariante(o0oO00);
    }
}

