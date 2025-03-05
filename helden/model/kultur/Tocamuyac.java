/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
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
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.Fischer;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Schamane;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Tierbaendiger;
import java.util.ArrayList;

public class Tocamuyac
extends OooO {
    protected int \u00f8\u00f6\u00f6000 = 0;

    public Tocamuyac() {
    }

    public Tocamuyac(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 3);
        this.setTalentwert(E.newnewString, 3);
        this.setTalentwert(E.o\u00d6\u00d8000, 2);
        this.setTalentwert(E.\u00d3\u00d5\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
        this.setTalentwert(voidsuper.returnprivateObject, 5);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, -2);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 4);
        this.setTalentwert(voidsuper.StringvoidObject, 4);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 3);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 3);
        this.setTalentwert(voidsuper.thisclassObject, 5);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.newnew);
        arrayList.add(I.whilereturn);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K38";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Tocamuyac";
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
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Tocamuyac Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f8\u00f6\u00f6000) {
            case 0: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.newwhileString);
                int[] nArray = new int[]{5};
                ++this.\u00f8\u00f6\u00f6000;
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
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getWaldmensch());
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getKanutepeku());
        arrayList.add(stammeskrieger);
        Fischer fischer = new Fischer(this.getGeschlecht(), g2, g3);
        fischer.addMoeglicheVariante(fischer.getBergungstaucher());
        fischer.addMoeglicheVariante(fischer.getHarpunier());
        arrayList.add(fischer);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.waehleVariante(schamane.getMedizinmannTocamuyac());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
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
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.ifinterfaceObject.toString()));
        oOOo.o00000(K.o00000(voidsuper.\u00f80\u00d6000, "Seefischerei"));
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
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.Stringvoidsuper);
        arrayList.add(I.\u00f4oo000);
        arrayList.add(I.\u00f4\u00d6o000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.newfor);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d5O\u00d2000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(helden.framework.C.K.o00000(I.\u00d8\u00f8O000, new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000.toString()}));
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d8\u00d80000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        M m = (M)helden.framework.C.K.o00000(I.\u00f4\u00d20000);
        m.\u00d2o0000();
        m.o00000(voidsuper.returnprivateObject);
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f8\u00d4O000));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)helden.framework.C.K.o00000(I.OOO000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        J j4 = (J)helden.framework.C.K.o00000(I.newnew);
        j4.oO0000(5);
        oo0O.\u00d300000(j4);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00f8\u00f6\u00f6000 < 1;
    }

    @Override
    public String toString() {
        return "Tocamuyac";
    }

    @Override
    protected int getBasisGPKosten() {
        return 9;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }
}

