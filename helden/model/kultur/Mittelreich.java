/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
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
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Amazone;
import helden.model.profession.Bettler;
import helden.model.profession.Druide;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Einbrecher;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Hexe;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Spitzel;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Taugenichts;
import java.util.ArrayList;

public class Mittelreich
extends OooO {
    public static final helden.framework.int.P \u00d8\u00d8\u00f8000 = new helden.framework.int.P("K\u00fcstengebiete oder an gro\u00dfen Fl\u00fcssen", 3, true);
    public static final helden.framework.int.P forsuperreturn = new helden.framework.int.P("An einer wichtigen Handelsroute/Reichsstra\u00dfe", 2, true);
    public static final helden.framework.int.P \u00d4\u00d8\u00f8000 = new helden.framework.int.P("Weiden/Greifenfurt", 2, true);
    public static final helden.framework.int.P nullsuperreturn = new helden.framework.int.P("Gebirge", 1, true);
    public static final helden.framework.int.P \u00f8\u00d8\u00f8000 = new helden.framework.int.P("Fern der Zivilisation", 4, true);
    public static final helden.framework.int.P \u00d5\u00d8\u00f8000 = new helden.framework.int.P("Landadel", 3, true);
    public static final helden.framework.int.P privatesuperreturn = new helden.framework.int.P("Jilaskan", 4, true);
    public static final helden.framework.int.P \u00d3\u00d8\u00f8000 = new helden.framework.int.P("Borbaradianisch besetzte Gebiete", 0, true);
    private int \u00f5\u00d8\u00f8000 = 0;
    private P \u00f4\u00d8\u00f8000;

    public Mittelreich() {
    }

    public Mittelreich(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(\u00d5\u00d8\u00f8000);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
        if (this.istVariante(\u00d8\u00d8\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(forsuperreturn)) {
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5o\u00d8000, 1);
        }
        if (this.istVariante(\u00d4\u00d8\u00f8000)) {
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        }
        if (this.istVariante(nullsuperreturn)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        }
        if (this.istVariante(\u00f8\u00d8\u00f8000)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, -1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, -1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        }
        if (this.istVariante(\u00d5\u00d8\u00f8000)) {
            this.addTalentwert(E.thissuperString, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addTalentwert(G.\u00d8\u00d8\u00f5000, 2);
        }
        if (this.istVariante(privatesuperreturn)) {
            this.addTalentwert(E.nullsuperString, -1);
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
            this.addTalentwert(voidsuper.newnewObject, 2);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, -1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, -1);
            this.addTalentwert(voidsuper.oo\u00d6000, 2);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
        }
        if (this.istVariante(\u00d3\u00d8\u00f8000)) {
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.thisvoidObject, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, -1);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00d5o000);
        if (this.istVariante(\u00d3\u00d8\u00f8000)) {
            arrayList.add(I.thisintsuper);
            arrayList.add(I.\u00f5\u00f60000);
            arrayList.add(I.\u00d4\u00f8o000);
            arrayList.add(I.Stringdo);
            arrayList.add(I.o\u00f4o000);
            arrayList.add(I.\u00d3O0000);
            arrayList.add(I.nullclass);
            arrayList.add(I.forvoid);
            arrayList.add(I.privateclass);
            arrayList.add(I.\u00d4\u00d30000);
            arrayList.add(I.\u00d8\u00d60000);
            arrayList.add(I.\u00f4\u00f5o000);
            arrayList.add(I.\u00d3\u00d8o000);
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return "K27";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Mittelreich";
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Weidener Namen");
        arrayList.add("Albernische Namen");
        arrayList.add("Bornl\u00e4ndische Namen");
        arrayList.add("Garetische Namen");
        return arrayList;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        return new objectsuper_0(this, this.getSetting().getGelaendekunden(), 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        if (this.istVariante(\u00d5\u00d8\u00f8000) && this.\u00f5\u00d8\u00f8000 == 0) {
            ++this.\u00f5\u00d8\u00f8000;
        }
        switch (this.\u00f5\u00d8\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                ++this.\u00f5\u00d8\u00f8000;
                return new o0oo_2(this, arrayList, new int[]{1});
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
                ++this.\u00f5\u00d8\u00f8000;
                return new o0oo_2(this, arrayList, new int[]{2, 1});
            }
            case 2: {
                arrayList.add(G.newwhileString);
                arrayList.add(G.\u00d3\u00d4\u00f5000);
                arrayList.add(G.\u00d5\u00f8\u00f4000);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                if (this.istVariante(\u00f8\u00d8\u00f8000)) {
                    arrayList.add(G.nullsuperclass);
                    arrayList.add(G.\u00d5\u00d6\u00f5000);
                    arrayList.add(G.\u00d8\u00f4\u00f5000);
                }
                if (this.istVariante(\u00d3\u00d8\u00f8000)) {
                    arrayList.add(G.\u00d50\u00f5000);
                    arrayList.add(G.newprivateString);
                }
                ++this.\u00f5\u00d8\u00f8000;
                return new o0oo_2(this, arrayList, new int[]{3});
            }
            case 3: {
                if (this.istVariante(\u00d3\u00d8\u00f8000)) {
                    arrayList.add(G.\u00d50\u00f5000);
                    arrayList.add(G.newprivateString);
                }
                arrayList.add(G.newwhileString);
                arrayList.add(G.\u00d3\u00d4\u00f5000);
                arrayList.add(G.\u00d5\u00f8\u00f4000);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00f5\u00f5\u00f4000);
                arrayList.add(G.O\u00d8\u00f5000);
                ++this.\u00f5\u00d8\u00f8000;
                return new o0oo_2(this, arrayList, new int[]{2});
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        if (this.istMaennlich()) {
            arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
        }
        arrayList.remove(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Schwertgeselle(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Einbrecher(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Spitzel(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.removeMoeglicheVariante(druide.getSumupriester());
        druide.addMoeglicheVariante(druide.getEiselementarist());
        druide.addMoeglicheVariante(druide.getErzelementarist());
        druide.addMoeglicheVariante(druide.getFeuerelementarist());
        druide.addMoeglicheVariante(druide.getHumuselementarist());
        druide.addMoeglicheVariante(druide.getLuftelementarist());
        druide.addMoeglicheVariante(druide.getWasserelementarist());
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
        geweihter.addMoeglicheVariante(geweihter.getAves());
        geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
        geweihter.addMoeglicheVariante(geweihter.getIfirn());
        geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGaenseritter());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getSaebeltaenzer());
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
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(\u00f8\u00d8\u00f8000) && this.\u00f4\u00d8\u00f8000 != null) {
            oOOo.o00000(this.\u00f4\u00d8\u00f8000);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(privatesuperreturn)) {
            arrayList.add(new for(while.\u00f5\u00d5\u00d8000));
        }
        return arrayList;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.istVariante(\u00f8\u00d8\u00f8000) && this.\u00f4\u00d8\u00f8000 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(privatesuperreturn)) {
            return this.\u00f5\u00d8\u00f8000 < 2;
        }
        if (this.istVariante(forsuperreturn)) {
            return this.\u00f5\u00d8\u00f8000 < 4;
        }
        return this.\u00f5\u00d8\u00f8000 < 3;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Mittell\u00e4ndische Landbev\u00f6lkerung");
        if (this.istVariante(\u00d8\u00d8\u00f8000)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00d8\u00d8\u00f8000.toString());
        }
        if (this.istVariante(\u00d4\u00d8\u00f8000)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00d4\u00d8\u00f8000.toString());
        }
        if (this.istVariante(\u00d5\u00d8\u00f8000)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00d5\u00d8\u00f8000.toString());
        }
        if (this.istVariante(\u00d3\u00d8\u00f8000)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00d3\u00d8\u00f8000.toString());
        }
        if (this.istVariante(\u00f8\u00d8\u00f8000)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00f8\u00d8\u00f8000.toString());
        }
        if (this.istVariante(nullsuperreturn)) {
            stringBuffer.append(" - ");
            stringBuffer.append(nullsuperreturn.toString());
        }
        if (this.istVariante(forsuperreturn)) {
            stringBuffer.append(" - ");
            stringBuffer.append(forsuperreturn.toString());
        }
        if (this.istVariante(privatesuperreturn)) {
            stringBuffer.append(" - ");
            stringBuffer.append(privatesuperreturn.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00f4\u00d8\u00f8000 = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d8\u00d8\u00f8000);
        this.addAlleVarianten(forsuperreturn);
        this.addAlleVarianten(\u00d4\u00d8\u00f8000);
        this.addAlleVarianten(nullsuperreturn);
        this.addAlleVarianten(\u00f8\u00d8\u00f8000);
        this.addAlleVarianten(\u00d5\u00d8\u00f8000);
        this.addAlleVarianten(\u00d3\u00d8\u00f8000);
        this.addAlleVarianten(privatesuperreturn);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.istVariante(\u00d3\u00d8\u00f8000)) {
            this.putModifikator(b_0.whilewhilesuper, -1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d8\u00d8\u00f8000);
        this.addMoeglicheVariante(forsuperreturn);
        this.addMoeglicheVariante(\u00d4\u00d8\u00f8000);
        this.addMoeglicheVariante(nullsuperreturn);
        this.addMoeglicheVariante(\u00f8\u00d8\u00f8000);
        this.addMoeglicheVariante(\u00d5\u00d8\u00f8000);
        this.addMoeglicheVariante(\u00d3\u00d8\u00f8000);
        this.addMoeglicheVariante(privatesuperreturn);
    }
}

