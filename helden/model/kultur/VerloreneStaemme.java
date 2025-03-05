/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.Bauer;
import helden.model.profession.Fischer;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Schamane;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Tageloehner;
import helden.model.profession.Tierbaendiger;
import java.util.ArrayList;

public class VerloreneStaemme
extends OooO {
    public static final P \u00d8\u00f8\u00f6000 = new P("Chirakah", -2, true);
    public static final P fordoclass = new P("Shokubunga", -1, true);
    private int \u00f4\u00f8\u00f6000 = 0;

    public VerloreneStaemme() {
    }

    public VerloreneStaemme(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 3);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.o\u00d6\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
        this.setTalentwert(voidsuper.returnforObject, 4);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 3);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, -2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 4);
        this.setTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 4);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        if (this.istVariante(fordoclass)) {
            this.addTalentwert(voidsuper.newnewObject, 1);
            this.addTalentwert(voidsuper.privateObjectObject, 2);
        }
        if (this.istVariante(\u00d8\u00f8\u00f6000)) {
            this.addTalentwert(E.newnewString, -1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, -1);
            this.addTalentwert(voidsuper.returnforObject, -2);
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.thisvoidObject, -2);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, -2);
            this.removeTalent(voidsuper.\u00d5\u00f6\u00d5000);
            this.addTalentwert(voidsuper.StringvoidObject, -2);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, -1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, -1);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.newnew);
        arrayList.add(I.whilereturn);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K41";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Waldmenschen";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d5o\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f4\u00f8\u00f6000) {
            case 0: {
                if (!this.istVariante(\u00d8\u00f8\u00f6000)) {
                    arrayList.add(E.\u00d4\u00d4\u00d8000);
                }
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                if (this.istVariante(\u00d8\u00f8\u00f6000)) {
                    nArray[0] = 3;
                }
                ++this.\u00f4\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.newwhileString);
                int[] nArray = new int[]{4};
                ++this.\u00f4\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                ++this.\u00f4\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (this.istVariante(\u00d8\u00f8\u00f6000)) {
            arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        }
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.waehleVariante(stammeskrieger.getWaldmensch());
        arrayList.add(stammeskrieger);
        Soeldner soeldner = new Soeldner(this.getGeschlecht(), g2, g3);
        arrayList.add(soeldner);
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        Hirte hirte = new Hirte(this.getGeschlecht(), g2, g3);
        arrayList.add(hirte);
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        if (!this.istVariante(\u00d8\u00f8\u00f6000)) {
            bauer.clearMoeglicheVarianten();
            bauer.addMoeglicheVariante(bauer.getFeldsklave());
        }
        arrayList.add(bauer);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        Tageloehner tageloehner = new Tageloehner(this.getGeschlecht(), g2, g3);
        if (!this.istVariante(\u00d8\u00f8\u00f6000)) {
            tageloehner.clearMoeglicheVarianten();
        }
        tageloehner.addMoeglicheVariante(tageloehner.getLastentraeger());
        arrayList.add(tageloehner);
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.waehleVariante(schamane.getMedizinmannVerloreneStaemme());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00f8\u00f6O000));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.Stringvoidsuper);
        arrayList.add(I.\u00f4oo000);
        arrayList.add(I.\u00f4\u00d6o000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.newfor);
        arrayList.add(I.privateclass);
        arrayList.add(I.OOO000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        arrayList.add(I.whilenewsuper);
        arrayList.add(K.o00000(I.\u00d8\u00f8O000, new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000.toString()}));
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add("S\u00fcdaventurien");
        arrayList.add(for_);
        arrayList.add(new for(while.\u00d8\u00d80000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00f60000));
        if (!this.istVariante(fordoclass)) {
            oo0O.\u00d300000(K.o00000(I.nullObjectsuper));
        }
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.O\u00f4O000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        J j4 = (J)K.o00000(I.\u00f5\u00f6o000);
        j4.oO0000(5);
        oo0O.\u00d300000(j4);
        J j5 = (J)K.o00000(I.\u00d50o000);
        j5.oO0000(5);
        oo0O.\u00d300000(j5);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00d8\u00f8\u00f6000)) {
            return this.\u00f4\u00f8\u00f6000 < 3;
        }
        return this.\u00f4\u00f8\u00f6000 < 2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Verlorene St\u00e4mme");
        if (this.istVariante(\u00d8\u00f8\u00f6000)) {
            stringBuffer.append("/Chirakah");
        }
        if (this.istVariante(fordoclass)) {
            stringBuffer.append("/Shokubunga");
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 12;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d8\u00f8\u00f6000);
        this.addAlleVarianten(fordoclass);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.istVariante(\u00d8\u00f8\u00f6000)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d8\u00f8\u00f6000);
        this.addMoeglicheVariante(fordoclass);
    }
}

