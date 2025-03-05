/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
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
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.Bauer;
import helden.model.profession.Druide;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Schamane;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import java.util.ArrayList;
import java.util.List;

public class Trollzacken
extends OooO {
    protected int O\u00f8\u00f8000 = 0;
    private Bedingung \u00f8\u00f6\u00f8000;

    public Trollzacken() {
    }

    public Trollzacken(Geschlecht geschlecht) {
        super(geschlecht);
        this.\u00f8\u00f6\u00f8000 = Bedingung.hatRassenID("R12");
        this.\u00f8\u00f6\u00f8000.setVariante("Rochshaz");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 3);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00f5\u00d5\u00d8000, 2);
        this.setTalentwert(E.\u00d5\u00d4\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.thisvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, -1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 4);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(G.whilewhileString, 4);
        this.setTalentwert(G.\u00d8\u00d2\u00f5000, 4);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K39";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Trollzacker";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public G getMuttersprache() {
        return G.newprivateString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Trollzacker Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00f8\u00f8000) {
            case 0: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{3, 1};
                ++this.O\u00f8\u00f8000;
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
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getTrollzacker());
        arrayList.add(stammeskrieger);
        if (floatsuper2 != null && floatsuper2.Object((AbstraktBedingung)this.\u00f8\u00f6\u00f8000)) {
            return arrayList;
        }
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bauer(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getHueterderMacht());
        arrayList.add(druide);
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getShochzul());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        haendler.clearMoeglicheVarianten();
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
        oOOo.o00000(oooo_0.o00000(while.\u00f6o\u00d5000));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.newfor);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d8\u00f50000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.whilereturn);
        arrayList.add(K.o00000(I.\u00d8\u00f8O000, new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000.toString()}));
        return arrayList;
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        List<for> list = super.getVerbilligteSonderfertigkeiten();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add("Trolle");
        list.add(for_);
        return list;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(K.o00000(I.newStringsuper));
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.O\u00f8\u00f8000 < 1;
    }

    @Override
    public String toString() {
        return "Trollzacken";
    }

    @Override
    protected int getBasisGPKosten() {
        return 10;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 2);
    }
}

