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
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Druide;
import helden.model.profession.Geweihter;
import helden.model.profession.Hexe;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import java.util.ArrayList;

public class Garetien
extends OooO {
    public static final P newwhileclass = new P("Hafenst\u00e4dte und St\u00e4dte an gro\u00dfen Fl\u00fcssen", 3, true);
    public static final P \u00d40\u00f8000 = new P("St\u00e4dte mit wichtigem Tempel/Pilgerst\u00e4tte", 2, true);
    public static final P \u00d30\u00f8000 = new P("Siedlerst\u00e4dte des Nordens", 1, true);
    public static final P returnwhileclass = new P("St\u00e4dtischer Adel", 1, true);
    public static final P o0\u00f8000 = new P("Kannem\u00fcnde / Mhanerhaven", 3, true);
    public static final P \u00d80\u00f8000 = new P("Fl\u00fcchtlinge aus borbaradianisch besetzten St\u00e4dten", 0, true);
    public static final P \u00d50\u00f8000 = new P("Maraskanische Exilanten in Festum", 2, true);
    private int \u00f40\u00f8000 = 0;

    public Garetien() {
    }

    public Garetien(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(returnwhileclass);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00d8\u00d5\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.o\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        if (this.istVariante(newwhileclass)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(\u00d40\u00f8000)) {
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 2);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 2);
        }
        if (this.istVariante(\u00d30\u00f8000)) {
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        }
        if (this.istVariante(returnwhileclass)) {
            this.addTalentwert(E.\u00d8\u00d5\u00d8000, -1);
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.removeTalent(voidsuper.O\u00f6\u00d5000);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 2);
            this.addTalentwert(G.\u00d8\u00d8\u00f5000, 2);
        }
        if (this.istVariante(o0\u00f8000)) {
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        }
        if (this.istVariante(\u00d80\u00f8000)) {
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.thisvoidObject, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, -1);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
        }
        if (this.istVariante(\u00d50\u00f8000)) {
            this.addTalentwert(E.returnnewString, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.forclassObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.thisintObject, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d3\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        if (this.istVariante(\u00d80\u00f8000)) {
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
        return "K19";
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
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(returnwhileclass)) {
            return this.\u00f40\u00f8000 < 5;
        }
        if (this.istVariante(o0\u00f8000)) {
            return this.\u00f40\u00f8000 < 4;
        }
        return this.\u00f40\u00f8000 < 3;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f40\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00f40\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                if (!this.istVariante(o0\u00f8000)) {
                    if (this.istVariante(\u00d30\u00f8000)) {
                        arrayList.add(G.nullsuperclass);
                        arrayList.add(G.\u00f8\u00f6\u00f5000);
                        arrayList.add(G.\u00d5\u00d6\u00f5000);
                    } else {
                        if (this.istVariante(\u00d80\u00f8000)) {
                            arrayList.add(G.\u00d50\u00f5000);
                            arrayList.add(G.newprivateString);
                        }
                        arrayList.add(G.newwhileString);
                        arrayList.add(G.\u00d3\u00d4\u00f5000);
                        arrayList.add(G.\u00d8\u00d3\u00f5000);
                    }
                    int[] nArray = this.istVariante(\u00d40\u00f8000) ? new int[]{4, 3} : new int[]{3};
                    ++this.\u00f40\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                ++this.\u00f40\u00f8000;
            }
            case 2: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                int[] nArray = new int[]{1};
                ++this.\u00f40\u00f8000;
                if (this.istVariante(o0\u00f8000)) {
                    this.\u00f40\u00f8000 = 3;
                }
                if (this.istVariante(returnwhileclass)) {
                    this.\u00f40\u00f8000 = 4;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00f80\u00d6000);
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                int[] nArray = new int[]{1};
                ++this.\u00f40\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{1};
                ++this.\u00f40\u00f8000;
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
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        if (this.istMaennlich()) {
            arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
        }
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getMehrerderMacht());
        arrayList.add(druide);
        arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
        Hexe hexe = new Hexe(this.getGeschlecht(), g2, g3);
        hexe.clearMoeglicheVarianten();
        hexe.addMoeglicheVariante(hexe.getSchoeneDerNacht());
        hexe.addMoeglicheVariante(hexe.getSchwesterDesWissens());
        hexe.addMoeglicheVariante(hexe.getSeherenVonHeuteUndMorgen());
        arrayList.add(hexe);
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
        geweihter.addMoeglicheVariante(geweihter.getNandus());
        geweihter.addMoeglicheVariante(geweihter.getNandusMarktschreiber());
        geweihter.addMoeglicheVariante(geweihter.getNandusVolkslehrer());
        geweihter.addMoeglicheVariante(geweihter.getNandusRechtshelfer());
        geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGaenseritter());
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
        oOOo.o00000(oooo_0.o00000(while.\u00d30\u00d2000, "Stadtteil/Kleinstadt"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.forObject);
        arrayList.add(I.newnew);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(o0\u00f8000)) {
            for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
            for_.add("Tulamidenlande");
            arrayList.add(for_);
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        if (this.istVariante(\u00d50\u00f8000)) {
            Oo0O oo0O = super.getVorteile();
            J j2 = (J)K.o00000(I.thisdo);
            j2.oO0000(5);
            oo0O.\u00d300000(j2);
            J j3 = (J)K.o00000(I.\u00d50o000);
            j3.oO0000(5);
            oo0O.\u00d300000(j3);
            return oo0O;
        }
        return super.getVorteile();
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        if (this.istVariante(o0\u00f8000) || this.istVariante(\u00d50\u00f8000)) {
            arrayList.add(G.newwhileString);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Mittell\u00e4ndische St\u00e4dte");
        if (this.istVariante(newwhileclass)) {
            stringBuffer.append("/");
            stringBuffer.append(newwhileclass.toString());
        }
        if (this.istVariante(\u00d40\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d40\u00f8000.toString());
        }
        if (this.istVariante(\u00d30\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d30\u00f8000.toString());
        }
        if (this.istVariante(returnwhileclass)) {
            stringBuffer.append("/");
            stringBuffer.append(returnwhileclass.toString());
        }
        if (this.istVariante(\u00d80\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d80\u00f8000.toString());
        }
        if (this.istVariante(o0\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(o0\u00f8000.toString());
        }
        if (this.istVariante(\u00d50\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d50\u00f8000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(newwhileclass);
        this.addAlleVarianten(\u00d40\u00f8000);
        this.addAlleVarianten(\u00d30\u00f8000);
        this.addAlleVarianten(returnwhileclass);
        this.addAlleVarianten(\u00d80\u00f8000);
        this.addAlleVarianten(o0\u00f8000);
        this.addAlleVarianten(\u00d50\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.istVariante(\u00d80\u00f8000)) {
            this.putModifikator(b_0.whilewhilesuper, -1);
        }
        if (this.istVariante(\u00d50\u00f8000)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(newwhileclass);
        this.addMoeglicheVariante(\u00d40\u00f8000);
        this.addMoeglicheVariante(\u00d30\u00f8000);
        this.addMoeglicheVariante(returnwhileclass);
        this.addMoeglicheVariante(\u00d80\u00f8000);
        this.addMoeglicheVariante(o0\u00f8000);
        this.addMoeglicheVariante(\u00d50\u00f8000);
    }
}

