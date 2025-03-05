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
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Druide;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Gardist;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Haendler;
import helden.model.profession.Herold;
import helden.model.profession.Hexe;
import helden.model.profession.Hoefling;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Schamane;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.Taugenichts;
import java.util.ArrayList;

public class Svellttal
extends OooO {
    public static final helden.framework.int.P \u00d3o\u00f8000 = new helden.framework.int.P("Stadt", 0, true);
    public static final helden.framework.int.P forpublicclass = new helden.framework.int.P("Kleinst\u00e4dte", -1, true);
    public static final helden.framework.int.P Oo\u00f8000 = new helden.framework.int.P("K\u00fcstengebiete oder an gro\u00dfen Fl\u00fcssen", 2, true);
    public static final helden.framework.int.P \u00d4o\u00f8000 = new helden.framework.int.P("Fern der Zivilisation", 2, true);
    public static final helden.framework.int.P \u00f8O\u00f8000 = new helden.framework.int.P("Fl\u00fcchtlinge aus Glorania", -1, true);
    private int Stringpublicclass = 0;
    private G \u00d5o\u00f8000 = null;
    private G oo\u00f8000 = null;
    private P nullpublicclass = null;

    public Svellttal() {
    }

    public Svellttal(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.\u00d5o\u00f8000 == null) {
            this.\u00d5o\u00f8000 = g2;
            if (g2.equals(G.whilewhileString) || g2.equals(G.\u00d8\u00d3\u00f5000)) {
                this.oo\u00f8000 = G.\u00d8\u00d8\u00f5000;
            }
            if (g2.equals(G.nullsuperclass)) {
                this.oo\u00f8000 = null;
            }
        } else {
            this.oo\u00f8000 = g2;
        }
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d3\u00d6\u00d8000, 1);
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.o\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        if (this.istVariante(\u00d3o\u00f8000) || this.istVariante(forpublicclass)) {
            this.addTalentwert(E.o\u00d6\u00d8000, -1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, -1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.removeTalent(voidsuper.\u00d5\u00d6\u00d5000);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
        }
        if (this.istVariante(\u00d3o\u00f8000)) {
            this.addTalentwert(E.\u00d8\u00d5\u00d8000, 1);
        }
        if (this.istVariante(forpublicclass) || this.istVariante(Oo\u00f8000)) {
            this.addTalentwert(E.\u00d3\u00d6\u00d8000, -1);
        }
        if (this.istVariante(Oo\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        }
        if (this.istVariante(\u00d4o\u00f8000)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5o\u00d8000, 1);
        }
        if (this.istVariante(\u00f8O\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.\u00d8\u00d3\u00d8000, 2);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, -1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.newnew);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K35";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Svellttal";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public G getMuttersprache() {
        return this.\u00d5o\u00f8000;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000("Svellttal");
        U u3 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u3.\u00d500000("Nordlande");
        arrayList.add(u2);
        arrayList.add(u3);
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        if (this.\u00d5o\u00f8000 == null) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.whilewhileString);
            arrayList.add(G.\u00f8\u00f6\u00f5000);
            arrayList.add(G.nullsuperclass);
            arrayList.add(G.\u00d8\u00d3\u00f5000);
            return new oo0o_2(this, arrayList, 1, "Muttersprache w\u00e4hlen");
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d8\u00d8\u00f5000);
        arrayList.add(G.Stringsuperclass);
        return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.Stringpublicclass) {
            case 0: {
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                arrayList.add(voidsuper.thisclassObject);
                int[] nArray = new int[]{1};
                ++this.Stringpublicclass;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.whilewhileString);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.O\u00d8\u00f5000);
                arrayList.add(G.\u00d5\u00d6\u00f5000);
                arrayList.add(G.\u00d5\u00f8\u00f4000);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                arrayList.remove(this.getMuttersprache());
                ++this.Stringpublicclass;
                return new o0oo_2(this, arrayList, new int[]{4});
            }
            case 2: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.\u00f80\u00d6000);
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.oo\u00d8000);
                ++this.Stringpublicclass;
                return new o0oo_2(this, arrayList, new int[]{1});
            }
            case 3: {
                int[] nArray = new int[]{1};
                if (this.istVariante(forpublicclass)) {
                    arrayList.add(E.\u00d3\u00d6\u00d8000);
                    arrayList.add(E.\u00d4\u00d6\u00d8000);
                    arrayList.add(E.\u00d5\u00d6\u00d8000);
                }
                if (this.istVariante(Oo\u00f8000)) {
                    arrayList.add(E.\u00d3\u00d6\u00d8000);
                    arrayList.add(E.\u00d5\u00d4\u00d8000);
                    arrayList.add(E.\u00d3\u00d5\u00d8000);
                }
                if (this.istVariante(\u00d4o\u00f8000)) {
                    arrayList.add(G.\u00f8\u00f6\u00f5000);
                    arrayList.add(G.whilewhileString);
                    arrayList.add(G.nullsuperclass);
                    arrayList.add(G.O\u00d8\u00f5000);
                    arrayList.add(G.\u00d5\u00d6\u00f5000);
                    arrayList.add(G.\u00d5\u00f8\u00f4000);
                    arrayList.add(G.\u00d8\u00d3\u00f5000);
                    arrayList.add(G.\u00d8\u00f4\u00f5000);
                    arrayList.remove(this.getMuttersprache());
                    nArray[0] = 2;
                }
                ++this.Stringpublicclass;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                ++this.Stringpublicclass;
                return new o0oo_2(this, arrayList, new int[]{1});
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        Gladiator gladiator = new Gladiator(this.getGeschlecht(), g2, g3);
        gladiator.clearMoeglicheVarianten();
        gladiator.addMoeglicheVariante(gladiator.getSchaukaempfer());
        arrayList.add(gladiator);
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Herold(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hofkuenstler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hoefling(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
        if (!this.istVariante(\u00d3o\u00f8000)) {
            arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        }
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.removeMoeglicheVariante(druide.getEiselementarist());
        druide.removeMoeglicheVariante(druide.getErzelementarist());
        druide.removeMoeglicheVariante(druide.getFeuerelementarist());
        druide.removeMoeglicheVariante(druide.getHumuselementarist());
        druide.removeMoeglicheVariante(druide.getLuftelementarist());
        druide.removeMoeglicheVariante(druide.getWasserelementarist());
        arrayList.add(druide);
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
        arrayList.add(new Magier(this.getGeschlecht(), g2, g3));
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
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getGraveshPriester());
        schamane.addMoeglicheVariante(schamane.getGraveshPriesterGeweiht());
        arrayList.add(schamane);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return this.oo\u00f8000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        if (this.istVariante(\u00f8O\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00d50\u00d3000));
        }
        if (this.nullpublicclass != null) {
            oOOo.o00000(this.nullpublicclass);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
        arrayList.add(new for(while.\u00f5\u00d30000));
        if (!this.istVariante(\u00f8O\u00f8000)) {
            arrayList.add(new for(while.nullnewsuper));
        }
        return arrayList;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.nullpublicclass == null;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.\u00d5o\u00f8000 == null || this.oo\u00f8000 == null && !this.\u00d5o\u00f8000.equals(G.nullsuperclass);
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(Oo\u00f8000)) {
            return this.Stringpublicclass < 4;
        }
        if (this.istVariante(forpublicclass)) {
            return this.Stringpublicclass < 5;
        }
        if (this.istVariante(\u00d4o\u00f8000)) {
            return this.Stringpublicclass < 4;
        }
        return this.Stringpublicclass < 3;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return true;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersprache(G g2) {
        this.\u00d5o\u00f8000 = g2;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.oo\u00f8000 = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Svellttal und Nordlande");
        if (this.istVariante(\u00d3o\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d3o\u00f8000.toString());
        }
        if (this.istVariante(Oo\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(Oo\u00f8000.toString());
        }
        if (this.istVariante(\u00d4o\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d4o\u00f8000.toString());
        }
        if (this.istVariante(forpublicclass)) {
            stringBuffer.append("/");
            stringBuffer.append(forpublicclass.toString());
        }
        if (this.istVariante(\u00f8O\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00f8O\u00f8000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.nullpublicclass = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 7;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d3o\u00f8000);
        this.addAlleVarianten(forpublicclass);
        this.addAlleVarianten(Oo\u00f8000);
        this.addAlleVarianten(\u00d4o\u00f8000);
        this.addAlleVarianten(\u00f8O\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        if (!this.istVariante(\u00f8O\u00f8000)) {
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        }
        if (this.istVariante(\u00f8O\u00f8000)) {
            this.putModifikator(b_0.whilewhilesuper, -1);
        }
        this.putModifikator(b_0.thispublicsuper, 2);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d3o\u00f8000);
        this.addMoeglicheVariante(forpublicclass);
        this.addMoeglicheVariante(Oo\u00f8000);
        this.addMoeglicheVariante(\u00d4o\u00f8000);
        this.addMoeglicheVariante(\u00f8O\u00f8000);
    }
}

