/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Druide;
import helden.model.profession.Entdecker;
import helden.model.profession.Fernhaendler;
import helden.model.profession.Fischer;
import helden.model.profession.Geweihter;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Prospektor;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schiffer;
import helden.model.profession.Schmuggler;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Seefahrer;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import java.util.ArrayList;

public class Almada
extends OooO {
    public static final P \u00d8\u00f5\u00f8000 = new P("St\u00e4dte am Yaquir", 2, true);
    public static final P whilenewreturn = new P("Orte mit wichtigem Tempel/Pilgerst\u00e4tte", 2, true);
    public static final P \u00d5\u00f5\u00f8000 = new P("St\u00e4dtischer Adel", 2, true);
    public static final P \u00d3\u00f5\u00f8000 = new P("An einer wichtigen Handelsroute", 1, true);
    public static final P \u00f5\u00f5\u00f8000 = new P("Gebirge", 1, true);
    public static final P \u00d4\u00f5\u00f8000 = new P("Landadel", 2, true);
    private int \u00f4\u00f5\u00f8000 = 0;
    private voidsuper thisObjectreturn;

    public Almada() {
    }

    public Almada(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(\u00d5\u00f5\u00f8000) || this.istVariante(\u00d4\u00f5\u00f8000);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00d4\u00d5\u00d8000, 1);
        this.setTalentwert(E.\u00d8\u00d5\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d4\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, 2);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 1);
        this.setTalentwert(voidsuper.privateObjectObject, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        if (this.istVariante(\u00d8\u00f5\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(whilenewreturn)) {
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 2);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 2);
        }
        if (this.istVariante(\u00d5\u00f5\u00f8000)) {
            this.removeTalent(E.\u00d8\u00d5\u00d8000);
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 2);
            this.addTalentwert(G.\u00d8\u00d8\u00f5000, 2);
        }
        if (this.istVariante(\u00d3\u00f5\u00f8000)) {
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5o\u00d8000, 1);
        }
        if (this.istVariante(\u00f5\u00f5\u00f8000)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        }
        if (this.istVariante(\u00d4\u00f5\u00f8000)) {
            this.removeTalent(E.\u00d8\u00d5\u00d8000);
            this.addTalentwert(E.thissuperString, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addTalentwert(G.\u00d8\u00d8\u00f5000, 4);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K48";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Almada";
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Almadanische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f4\u00f5\u00f8000) {
            case 0: {
                arrayList.add(G.newwhileString);
                arrayList.add(G.\u00d3\u00d4\u00f5000);
                int[] nArray = new int[]{5};
                ++this.\u00f4\u00f5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                int[] nArray = new int[]{1};
                ++this.\u00f4\u00f5\u00f8000;
                if (!this.istVariante(whilenewreturn) && !this.istVariante(\u00d3\u00f5\u00f8000)) {
                    ++this.\u00f4\u00f5\u00f8000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getMuttersprache());
                arrayList.remove(this.thisObjectreturn);
                int[] nArray = null;
                if (this.istVariante(whilenewreturn)) {
                    nArray = new int[]{4};
                }
                if (this.istVariante(\u00d3\u00f5\u00f8000)) {
                    nArray = new int[]{2};
                }
                if (this.istVariante(whilenewreturn) && this.istVariante(\u00d3\u00f5\u00f8000)) {
                    nArray = new int[]{4, 2};
                }
                ++this.\u00f4\u00f5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{1};
                ++this.\u00f4\u00f5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        if (this.istMaennlich()) {
            arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
        }
        arrayList.remove(new Schwertgeselle(this.getGeschlecht(), g2, g3));
        Schwertgeselle schwertgeselle = new Schwertgeselle(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schwertgeselle.addMoeglicheVariante(schwertgeselle.getDonTalfans());
        arrayList.add(schwertgeselle);
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        if (this.istMaennlich()) {
            l2 = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Stammeskrieger)l2).getTarisharim());
            l2.addMoeglicheVariante(((Stammeskrieger)l2).getAlDrakorhim());
            l2.addMoeglicheVariante(((Stammeskrieger)l2).getBeniUchakani());
            arrayList.add(l2);
        }
        arrayList.add(new Entdecker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        l2 = new Druide(this.getGeschlecht(), g2, g3);
        l2.removeMoeglicheVariante(((Druide)l2).getHaindruide());
        l2.removeMoeglicheVariante(((Druide)l2).getSumupriester());
        arrayList.add(l2);
        Hexe hexe = new Hexe(this.getGeschlecht(), g2, g3);
        hexe.clearMoeglicheVarianten();
        hexe.addMoeglicheVariante(hexe.getVerschewiegeneSchwester());
        hexe.addMoeglicheVariante(hexe.getTochterDerErde());
        hexe.addMoeglicheVariante(hexe.getSeherenVonHeuteUndMorgen());
        arrayList.add(hexe);
        arrayList.add(new Magier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.add12G();
        geweihter.addMoeglicheVariante(geweihter.getAves());
        geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
        geweihter.addMoeglicheVariante(geweihter.getNandus());
        geweihter.addMoeglicheVariante(geweihter.getNandusMarktschreiber());
        geweihter.addMoeglicheVariante(geweihter.getNandusVolkslehrer());
        geweihter.addMoeglicheVariante(geweihter.getNandusRechtshelfer());
        geweihter.addMoeglicheVariante(geweihter.getNandusStratege());
        geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getSaebeltaenzer());
        arrayList.add(ordenskrieger);
        arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
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
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.newnew);
        arrayList.add(I.forObject);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00d5\u00f5\u00f8000)) {
            return this.\u00f4\u00f5\u00f8000 < 4;
        }
        if (this.istVariante(whilenewreturn) || this.istVariante(\u00d3\u00f5\u00f8000)) {
            return this.\u00f4\u00f5\u00f8000 < 3;
        }
        return this.\u00f4\u00f5\u00f8000 < 2;
    }

    public void setTalentauswahl(voidsuper voidsuper2, int n) {
        super.setTalentauswahl(voidsuper2, n);
        if (voidsuper2.equals(G.\u00d3\u00d4\u00f5000) || voidsuper2.equals(G.newwhileString)) {
            this.thisObjectreturn = voidsuper2;
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Almada");
        if (this.istVariante(\u00d8\u00f5\u00f8000)) {
            stringBuffer.append("/" + \u00d8\u00f5\u00f8000.toString());
        }
        if (this.istVariante(whilenewreturn)) {
            stringBuffer.append(", " + whilenewreturn.toString());
        }
        if (this.istVariante(\u00d5\u00f5\u00f8000)) {
            stringBuffer.append(", " + \u00d5\u00f5\u00f8000.toString());
        }
        if (this.istVariante(\u00d3\u00f5\u00f8000)) {
            stringBuffer.append(", " + \u00d3\u00f5\u00f8000.toString());
        }
        if (this.istVariante(\u00f5\u00f5\u00f8000)) {
            stringBuffer.append(", " + \u00f5\u00f5\u00f8000.toString());
        }
        if (this.istVariante(\u00d4\u00f5\u00f8000)) {
            stringBuffer.append(", " + \u00d4\u00f5\u00f8000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d8\u00f5\u00f8000);
        this.addAlleVarianten(whilenewreturn);
        this.addAlleVarianten(\u00d5\u00f5\u00f8000);
        this.addAlleVarianten(\u00d3\u00f5\u00f8000);
        this.addAlleVarianten(\u00f5\u00f5\u00f8000);
        this.addAlleVarianten(\u00d4\u00f5\u00f8000);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d8\u00f5\u00f8000);
        this.addMoeglicheVariante(whilenewreturn);
        this.addMoeglicheVariante(\u00d5\u00f5\u00f8000);
        this.addMoeglicheVariante(\u00d3\u00f5\u00f8000);
        this.addMoeglicheVariante(\u00f5\u00f5\u00f8000);
        this.addMoeglicheVariante(\u00d4\u00f5\u00f8000);
    }
}

