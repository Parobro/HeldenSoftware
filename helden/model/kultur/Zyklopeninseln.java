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
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Druide;
import helden.model.profession.Geweihter;
import helden.model.profession.Hexe;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Stammeskrieger;
import java.util.ArrayList;

public class Zyklopeninseln
extends OooO {
    public static final P \u00d3O\u00f8000 = new P("Landadel", 2, true);
    private G whilewhileclass = null;

    public Zyklopeninseln() {
    }

    public Zyklopeninseln(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        this.whilewhileclass = g2;
        ArrayList<G> arrayList = new ArrayList<G>();
        if (g2.equals(G.whilewhileString)) {
            arrayList.add(G.\u00f5\u00f5\u00f4000);
        } else {
            arrayList.add(G.whilewhileString);
        }
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(\u00d3O\u00f8000);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00f5\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.thisintObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.thisclassObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        if (this.istVariante(\u00d3O\u00f8000)) {
            this.removeTalent(E.\u00f5\u00d5\u00d8000);
            this.setTalentwert(E.\u00d3\u00d6\u00d8000, 1);
            this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.setTalentwert(voidsuper.O0\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.setTalentwert(voidsuper.o\u00f4\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.setTalentwert(G.\u00d8\u00d8\u00f5000, 2);
        } else {
            this.setTalentwert(E.\u00f5\u00d5\u00d8000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K47";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Zyklopeninseln";
    }

    @Override
    public G getMuttersprache() {
        return this.whilewhileclass;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Zyklop\u00e4ische Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.\u00f5\u00f5\u00f4000);
        return new oo0o_2(this, arrayList, 1, "Muttersprache, nicht gew\u00e4hlte Sprache wird zur Zeitsprache");
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
        arrayList.remove(new Ritter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getHaindruide());
        arrayList.add(druide);
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
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
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
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
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d5O\u00d2000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.ifinterfaceObject));
        return arrayList;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.whilewhileclass == null;
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
        this.whilewhileclass = g2;
    }

    @Override
    public String toString() {
        if (this.istVariante(\u00d3O\u00f8000)) {
            return "Zyklopeninseln/Landadel";
        }
        return "Zyklopeninseln";
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d3O\u00f8000);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d3O\u00f8000);
    }
}

