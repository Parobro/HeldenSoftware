/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
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
import helden.framework.oOoO.void;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Druide;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.FaehnrichFusskaemper;
import helden.model.profession.FaehnrichKavallerie;
import helden.model.profession.FaehnrichSee;
import helden.model.profession.Gardist;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geweihter;
import helden.model.profession.Hexe;
import helden.model.profession.Krieger;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.Stabsfaehnrich;
import java.util.ArrayList;

public class Bornland
extends OooO {
    public static final P \u00f8\u00f8\u00f6000 = new P("Landst\u00e4dte", 3, true);
    public static final P \u00f5\u00f8\u00f6000 = new P("K\u00fcstengebiete", 3, true);
    public static final P privatedoclass = new P("Landadel", 5, true);
    private int O0\u00f8000 = 0;

    public Bornland() {
    }

    public Bornland(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(privatedoclass);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.\u00d5\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 2);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
        if (this.istVariante(\u00f8\u00f8\u00f6000)) {
            this.addTalentwert(E.\u00d3\u00d6\u00d8000, 1);
            this.addTalentwert(E.\u00d8\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
        }
        if (this.istVariante(\u00f5\u00f8\u00f6000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(privatedoclass)) {
            this.addTalentwert(E.\u00d3\u00d6\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.privatedoObject, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K07";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Bornland";
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Bornl\u00e4ndische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O0\u00f8000) {
            case 0: {
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                int[] nArray = new int[]{6, 2};
                ++this.O0\u00f8000;
                if (!this.istVariante(\u00f8\u00f8\u00f6000)) {
                    ++this.O0\u00f8000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{2};
                ++this.O0\u00f8000;
                if (!this.istVariante(\u00f5\u00f8\u00f6000)) {
                    ++this.O0\u00f8000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{1};
                ++this.O0\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.nullnewsuper));
        arrayList.add(new for(while.\u00d2\u00d4O000));
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new FaehnrichFusskaemper(this.getGeschlecht(), g2, g3));
        arrayList.add(new FaehnrichKavallerie(this.getGeschlecht(), g2, g3));
        arrayList.add(new FaehnrichSee(this.getGeschlecht(), g2, g3));
        arrayList.add(new Stabsfaehnrich(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Krieger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        if (this.istVariante(privatedoclass)) {
            arrayList.add(new Ritter(this.getGeschlecht(), g2, g3));
        }
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        if (!this.istVariante(\u00f8\u00f8\u00f6000)) {
            arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        }
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getHaindruide());
        druide.addMoeglicheVariante(druide.getHueterderMacht());
        arrayList.add(druide);
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
        Magier magier = new Magier(this.getGeschlecht(), g2, g3);
        magier.addMoeglicheVariante(magier.getMendenaInitiator());
        magier.addMoeglicheVariante(magier.getMendenaInspirator());
        magier.addMoeglicheVariante(magier.getMendenaInstrukteuer());
        magier.addMoeglicheVariante(magier.getMendenaInvokator());
        magier.addMoeglicheVariante(magier.getYolGurmakF());
        magier.addMoeglicheVariante(magier.getYolGurmakH());
        magier.addMoeglicheVariante(magier.getYolGurmakU());
        magier.addMoeglicheVariante(magier.getYolGurmakW());
        arrayList.add(magier);
        Lehrmeister lehrmeister = new Lehrmeister(this.getGeschlecht(), g2, g3);
        lehrmeister.clearMoeglicheVarianten();
        lehrmeister.addMoeglicheVariante(lehrmeister.getKarasuk());
        arrayList.add(lehrmeister);
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.add12G();
        geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
        geweihter.addMoeglicheVariante(geweihter.getIfirn());
        geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
        arrayList.add(ordenskrieger);
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
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        if (!this.istVariante(privatedoclass)) {
            arrayList.add(I.\u00d5o\u00d2000);
        }
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d50\u00d3000));
        arrayList.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00f8\u00f8\u00f6000) || this.istVariante(\u00f5\u00f8\u00f6000)) {
            return this.O0\u00f8000 < 2;
        }
        if (this.istVariante(privatedoclass)) {
            return this.O0\u00f8000 < 3;
        }
        return this.O0\u00f8000 < 1;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Bornland");
        if (this.istVariante(privatedoclass)) {
            stringBuffer.append("/Landadel");
        }
        if (this.istVariante(\u00f5\u00f8\u00f6000)) {
            stringBuffer.append("/K\u00fcstengebiete");
        }
        if (this.istVariante(\u00f8\u00f8\u00f6000)) {
            stringBuffer.append("/Landst\u00e4dte");
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f8\u00f8\u00f6000);
        this.addAlleVarianten(\u00f5\u00f8\u00f6000);
        this.addAlleVarianten(privatedoclass);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f8\u00f8\u00f6000);
        this.addMoeglicheVariante(\u00f5\u00f8\u00f6000);
        this.addMoeglicheVariante(privatedoclass);
    }
}

