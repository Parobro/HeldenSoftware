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
import helden.model.profession.Bettler;
import helden.model.profession.Dieb;
import helden.model.profession.Einbrecher;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Schmuggler;
import helden.model.profession.Soeldner;
import helden.model.profession.Strassenraeuber;
import java.util.ArrayList;

public class Goblinbande
extends OooO {
    private int StringObjectreturn = 0;

    public Goblinbande() {
    }

    public Goblinbande(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.\u00d3\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 3);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.ifreturn);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K21";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Goblins";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 3;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d8\u00f4\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Goblinische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.StringObjectreturn) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                ++this.StringObjectreturn;
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
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Einbrecher(this.getGeschlecht(), g2, g3));
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
        oOOo.o00000(oooo_0.o00000(while.\u00d30\u00d2000, "Jagdrevier"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f5\u00d50000);
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
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        arrayList.add(G.whilewhileString);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.StringObjectreturn < 1;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        if (this.getGeschlecht().istMaennlich()) {
            return false;
        }
        return super.istMagiedilletantErlaubt();
    }

    @Override
    public void setSprachen(int n, boolean bl) {
        super.setSprachen(n, bl);
    }

    @Override
    public String toString() {
        return "Goblinbande";
    }

    @Override
    protected int getBasisGPKosten() {
        return 1;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, -1);
    }
}

