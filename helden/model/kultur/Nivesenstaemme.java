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
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.Fischer;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Schamane;
import helden.model.profession.Seefahrer;
import helden.model.profession.Tierbaendiger;
import java.util.ArrayList;

public class Nivesenstaemme
extends OooO {
    public static final P \u00f4\u00d3\u00f8000 = new P("Halbsesshafte K\u00fcstenst\u00e4mme", 1, true);
    protected int \u00f5\u00d3\u00f8000 = 0;

    public Nivesenstaemme() {
    }

    public Nivesenstaemme(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.o\u00d6\u00d8000, 2);
        this.setTalentwert(E.\u00d5\u00d4\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d8\u00d3\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 1);
        this.setTalentwert(voidsuper.thisclassObject, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d5o\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
        this.setTalentwert(voidsuper.returnifObject, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 2);
        if (this.istVariante(\u00f4\u00d3\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.nullfloat);
        arrayList.add(I.OOO000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K28";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Nivesen";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public G getMuttersprache() {
        return G.nullsuperclass;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Nivesische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        if (this.\u00f5\u00d3\u00f8000 == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(G.\u00f8\u00f6\u00f5000);
            arrayList.add(G.whilewhileString);
            int[] nArray = new int[]{5};
            ++this.\u00f5\u00d3\u00f8000;
            return new o0oo_2(this, arrayList, nArray);
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Fischer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Jaeger jaeger = new Jaeger(this.getGeschlecht(), g2, g3);
        jaeger.removeMoeglicheVariante(jaeger.getWildhueter());
        arrayList.add(jaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getSammler());
        arrayList.add(prospektor);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getKjaskjua());
        arrayList.add(schamane);
        if (this.istVariante(\u00f4\u00d3\u00f8000)) {
            l2 = new Seefahrer(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Seefahrer)l2).getRobbenjaeger());
            arrayList.add(l2);
        }
        l2 = new Haendler(this.getGeschlecht(), g2, g3);
        l2.clearMoeglicheVarianten();
        l2.addMoeglicheVariante(((Haendler)l2).getTauschhaendler());
        arrayList.add(l2);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00d50\u00d3000));
        oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d8\u00f50000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for<String> for_ = for.o00000(voidsuper.\u00d5o\u00d8000, new ArrayList<String>(), 1);
        for_.add("Hundeschlitten");
        arrayList.add(for_);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.whilereturn);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00f5\u00d3\u00f8000 < 1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Nivesenst\u00e4mme");
        if (this.istVariante(\u00f4\u00d3\u00f8000)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00f4\u00d3\u00f8000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 10;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f4\u00d3\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 5);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f4\u00d3\u00f8000);
    }
}

