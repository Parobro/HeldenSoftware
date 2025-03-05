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
import helden.model.profession.Amazone;
import helden.model.profession.Geweihter;
import helden.model.profession.Handwerker;
import helden.model.profession.Kundschafter;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;

public class Amazonenburg
extends OooO {
    private int \u00d8\u00f5\u00f6000 = 0;

    public Amazonenburg() {
    }

    public Amazonenburg(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00d3\u00d4\u00d8000, 2);
        this.setTalentwert(voidsuper.ifforObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 3);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, -2);
        this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.o\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.nullvoidObject, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public int getBasisGPKosten() {
        return 7;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K01";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Amazonen";
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Almadanische Namen");
        arrayList.add("Aranische Namen");
        arrayList.add("Garetische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8\u00f5\u00f6000) {
            case 0: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{4};
                ++this.\u00d8\u00f5\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{2};
                ++this.\u00d8\u00f5\u00f6000;
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
        arrayList.add(new Amazone(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        Tierbaendiger tierbaendiger = new Tierbaendiger(this.getGeschlecht(), g2, g3);
        tierbaendiger.clearMoeglicheVarianten();
        tierbaendiger.addMoeglicheVariante(tierbaendiger.getZureiter());
        arrayList.add(tierbaendiger);
        arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), g2, g3);
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getRondraAmazone());
        arrayList.add(geweihter);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
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
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d8\u00f50000);
        arrayList.add(I.\u00d4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d5\u00f60000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.thisdo);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d8\u00f5\u00f6000 < 2;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        return "Amazonenburg";
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 3);
    }
}

