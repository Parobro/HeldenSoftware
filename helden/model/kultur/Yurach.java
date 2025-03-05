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
import helden.model.profession.Bauer;
import helden.model.profession.Gladiator;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Soeldner;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Tageloehner;
import java.util.ArrayList;

public class Yurach
extends OooO {
    private int o\u00f5\u00f6000 = 0;

    public Yurach() {
    }

    public Yurach(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 3);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00d3\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.nullObjectObject, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        this.setTalentwert(G.whilewhileString, 3);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K45";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Orks";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 3;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d5\u00d6\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Orkische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.o\u00f5\u00f6000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                ++this.o\u00f5\u00f6000;
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
        Gladiator gladiator = new Gladiator(this.getGeschlecht(), g2, g3);
        gladiator.clearMoeglicheVarianten();
        gladiator.addMoeglicheVariante(gladiator.getAlAnfa());
        arrayList.add(gladiator);
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getFeldsklave());
        arrayList.add(bauer);
        arrayList.add(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tageloehner(this.getGeschlecht(), g2, g3));
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
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(K.o00000(I.\u00f4\u00d20000, voidsuper.\u00d5\u00d5\u00d5000, voidsuper.O0\u00d6000, voidsuper.O\u00f6\u00d5000, voidsuper.\u00d8\u00d5\u00d6000, voidsuper.thisinterfaceObject, voidsuper.newnullObject, voidsuper.forpublicObject, voidsuper.forclassObject, voidsuper.\u00d30\u00d8000, voidsuper.StringclassObject));
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d5oo000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.o\u00f5\u00f6000 < 1;
    }

    @Override
    public String toString() {
        return "Yurach";
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, -1);
    }
}

