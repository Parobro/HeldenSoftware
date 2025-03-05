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
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Bauer;
import helden.model.profession.Derwisch;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Geweihter;
import helden.model.profession.Handwerker;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Jaeger;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Krieger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Prospektor;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schiffer;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Soeldner;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Wundarzt;
import helden.model.profession.Zaubertaenzer;
import java.util.ArrayList;

public class TulamidischeStadtstaaten
extends OooO {
    public static final P ifwhileclass = new P("Kasimit", 1, true);
    public static final P OO\u00f8000 = new P("See- oder Mhanadihafen", 3, true);
    public static final P \u00f80\u00f8000 = new P("Maraskanische Exilanten in Khunchom", 0, true);
    private G \u00f50\u00f8000 = null;
    private int oO\u00f8000 = 0;

    public TulamidischeStadtstaaten() {
    }

    public TulamidischeStadtstaaten(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.\u00f50\u00f8000 == null) {
            this.\u00f50\u00f8000 = g2;
            if (!this.istVariante(ifwhileclass)) {
                ArrayList<G> arrayList = new ArrayList<G>();
                arrayList.add(G.whilewhileString);
                this.setZweitLehrsprache(arrayList);
            }
            return;
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00f4\u00d4\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 2);
        this.setTalentwert(voidsuper.forclassObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f4o\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.privatedoObject, 1);
        if (this.istVariante(ifwhileclass)) {
            this.addTalentwert(E.newnewString, 2);
            this.addTalentwert(voidsuper.oo\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        }
        if (this.istVariante(\u00f80\u00f8000)) {
            this.addTalentwert(E.returnnewString, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.forclassObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.thisintObject, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d3\u00d6000, 1);
        }
        if (this.istVariante(OO\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f5\u00d50000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K40";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Tulamidenlande";
    }

    @Override
    public G getMuttersprache() {
        return G.newwhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Tulamidische Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3o\u00f5000);
        arrayList.add(G.\u00d8\u00d8\u00f5000);
        arrayList.add(G.whileStringclass);
        return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.oO\u00f8000) {
            case 0: {
                arrayList.add(voidsuper.whilenewObject);
                arrayList.add(voidsuper.OO\u00d6000);
                int[] nArray = new int[]{1};
                ++this.oO\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d5000);
                int[] nArray = new int[]{1};
                ++this.oO\u00f8000;
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
        if (this.istVariante(ifwhileclass)) {
            if (this.istMaennlich()) {
                arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
                arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
                Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                stammeskrieger.clearMoeglicheVarianten();
                stammeskrieger.addMoeglicheVariante(stammeskrieger.getBeniDervez());
                stammeskrieger.addMoeglicheVariante(stammeskrieger.getTarisharim());
                stammeskrieger.addMoeglicheVariante(stammeskrieger.getAlDrakorhim());
                stammeskrieger.addMoeglicheVariante(stammeskrieger.getBeniUchakani());
                arrayList.add(stammeskrieger);
                arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
                Schiffer schiffer = new Schiffer(this.getGeschlecht(), g2, g3);
                arrayList.remove(schiffer);
                schiffer.addMoeglicheVariante(schiffer.getFlusspirat());
                arrayList.add(schiffer);
                Strassenraeuber strassenraeuber = new Strassenraeuber(this.getGeschlecht(), g2, g3);
                arrayList.remove(strassenraeuber);
                strassenraeuber.addMoeglicheVariante(strassenraeuber.getThalusischerWegelagerer());
                arrayList.add(strassenraeuber);
                arrayList.remove(new Jaeger(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Kundschafter(this.getGeschlecht(), g2, g3));
                arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
                arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
                Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                arrayList.remove(handwerker);
                arrayList.add(handwerker);
                Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
                alchemist.clearMoeglicheVarianten();
                alchemist.addMoeglicheVariante(alchemist.getUnau());
                alchemist.addMoeglicheVariante(alchemist.getUnauNM());
                arrayList.add(alchemist);
                arrayList.add(new Derwisch(this.getGeschlecht(), g2, g3));
            } else {
                arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
                arrayList.add(new Bauer(this.getGeschlecht(), g2, g3));
                arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
                Zaubertaenzer zaubertaenzer = new Zaubertaenzer(this.getGeschlecht(), g2, g3);
                zaubertaenzer.clearMoeglicheVarianten();
                zaubertaenzer.addMoeglicheVariante(zaubertaenzer.getNovadischeSharisad());
                zaubertaenzer.addMoeglicheVariante(zaubertaenzer.getNovadischeSharisadMagisch());
                arrayList.add(zaubertaenzer);
                Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                stammeskrieger.clearMoeglicheVarianten();
                stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchmadSunni());
                arrayList.add(stammeskrieger);
                Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                prospektor.clearMoeglicheVarianten();
                prospektor.addMoeglicheVariante(prospektor.getSammler());
                arrayList.add(prospektor);
                arrayList.add(new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            }
        } else {
            L l2;
            L l3;
            if (this.istMaennlich()) {
                arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Ritter(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
                l3 = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                l3.clearMoeglicheVarianten();
                l3.addMoeglicheVariante(((Stammeskrieger)l3).getBeniDervez());
                l3.addMoeglicheVariante(((Stammeskrieger)l3).getTarisharim());
                l3.addMoeglicheVariante(((Stammeskrieger)l3).getAlDrakorhim());
                l3.addMoeglicheVariante(((Stammeskrieger)l3).getBeniUchakani());
                arrayList.add(l3);
                l2 = new Schwertgeselle(this.getGeschlecht(), g2, g3);
                arrayList.remove(l2);
                l2.addMoeglicheVariante(((Schwertgeselle)l2).getMarwan());
                arrayList.add(l2);
                arrayList.add(new Derwisch(this.getGeschlecht(), g2, g3));
            } else {
                arrayList.add(new Amazone(this.getGeschlecht(), g2, g3));
                arrayList.add(new Krieger(this.getGeschlecht(), g2, g3));
                l3 = new Schwertgeselle(this.getGeschlecht(), g2, g3);
                l3.addMoeglicheVariante(((Schwertgeselle)l3).getMarwan());
                l3.addMoeglicheVariante(((Schwertgeselle)l3).getIshannah());
                arrayList.add(l3);
                l2 = new Zaubertaenzer(this.getGeschlecht(), g2, g3);
                l2.clearMoeglicheVarianten();
                l2.addMoeglicheVariante(((Zaubertaenzer)l2).getTulamidischeSharisad());
                l2.addMoeglicheVariante(((Zaubertaenzer)l2).getTulamidischeSharisadMagisch());
                arrayList.add(l2);
            }
            arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
            l3 = new Schiffer(this.getGeschlecht(), g2, g3);
            arrayList.remove(l3);
            l3.addMoeglicheVariante(((Schiffer)l3).getFlusspirat());
            arrayList.add(l3);
            l2 = new Strassenraeuber(this.getGeschlecht(), g2, g3);
            arrayList.remove(l2);
            l2.addMoeglicheVariante(((Strassenraeuber)l2).getThalusischerWegelagerer());
            arrayList.add(l2);
            arrayList.remove(new Jaeger(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Kundschafter(this.getGeschlecht(), g2, g3));
            Karawanenfuehrer karawanenfuehrer = new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            arrayList.remove(karawanenfuehrer);
            karawanenfuehrer.addMoeglicheVariante(karawanenfuehrer.getSalzgaenger());
            arrayList.add(karawanenfuehrer);
            arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
            Hofkuenstler hofkuenstler = new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            arrayList.remove(hofkuenstler);
            hofkuenstler.addMoeglicheVariante(hofkuenstler.getKalligraph());
            arrayList.add(hofkuenstler);
            Gaukler gaukler = new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            arrayList.remove(gaukler);
            gaukler.addMoeglicheVariante(gaukler.getSchlangenbeschwoerer());
            arrayList.add(gaukler);
            arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
            arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
            Hexe hexe = new Hexe(this.getGeschlecht(), g2, g3);
            hexe.clearMoeglicheVarianten();
            hexe.addMoeglicheVariante(hexe.getSchoeneDerNacht());
            hexe.addMoeglicheVariante(hexe.getSeherenVonHeuteUndMorgen());
            arrayList.add(hexe);
            arrayList.add(new Magier(this.getGeschlecht(), g2, g3));
            Lehrmeister lehrmeister = new Lehrmeister(this.getGeschlecht(), g2, g3);
            lehrmeister.clearMoeglicheVarianten();
            lehrmeister.addMoeglicheVariante(lehrmeister.getRafimBey());
            lehrmeister.addMoeglicheVariante(lehrmeister.getDeveronMyst());
            lehrmeister.addMoeglicheVariante(lehrmeister.getDeveronSchatten());
            lehrmeister.addMoeglicheVariante(lehrmeister.getSefira());
            arrayList.add(lehrmeister);
            arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
            Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            geweihter.clearMoeglicheVarianten();
            geweihter.add12G();
            geweihter.addMoeglicheVariante(geweihter.getBoronAlAnfa());
            geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
            geweihter.removeMoeglicheVariante(geweihter.getFirunHueterDerJagd());
            geweihter.removeMoeglicheVariante(geweihter.getFirunWaldlaeufer());
            geweihter.addMoeglicheVariante(geweihter.getAves());
            geweihter.addMoeglicheVariante(geweihter.getNandus());
            geweihter.addMoeglicheVariante(geweihter.getNandusMarktschreiber());
            geweihter.addMoeglicheVariante(geweihter.getNandusVolkslehrer());
            geweihter.addMoeglicheVariante(geweihter.getNandusRechtshelfer());
            geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
            arrayList.add(geweihter);
            Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            ordenskrieger.clearMoeglicheVarianten();
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getSaebeltaenzer());
            arrayList.add(ordenskrieger);
        }
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return this.\u00f50\u00f8000;
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
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.forObject);
        arrayList.add(I.newnew);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(ifwhileclass)) {
            arrayList.add(new for(while.newint));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        if (this.istVariante(ifwhileclass)) {
            Oo0O oo0O = super.getVorteile();
            J j2 = (J)K.o00000(I.\u00d5\u00f60000);
            j2.oO0000(5);
            oo0O.\u00d300000(j2);
            return oo0O;
        }
        if (this.istVariante(\u00f80\u00f8000)) {
            Oo0O oo0O = super.getVorteile();
            J j3 = (J)K.o00000(I.thisdo);
            j3.oO0000(5);
            oo0O.\u00d300000(j3);
            J j4 = (J)K.o00000(I.\u00d50o000);
            j4.oO0000(5);
            oo0O.\u00d300000(j4);
            return oo0O;
        }
        return super.getVorteile();
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.\u00f50\u00f8000 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(OO\u00f8000)) {
            return this.oO\u00f8000 < 2;
        }
        return this.oO\u00f8000 < 1;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.\u00f50\u00f8000 = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Tulamidische Stadtstaaten");
        if (this.istVariante(ifwhileclass)) {
            stringBuffer.append("/");
            stringBuffer.append(ifwhileclass.toString());
        }
        if (this.istVariante(OO\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(OO\u00f8000.toString());
        }
        if (this.istVariante(\u00f80\u00f8000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00f80\u00f8000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(ifwhileclass);
        this.addAlleVarianten(OO\u00f8000);
        this.addAlleVarianten(\u00f80\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
        if (this.istVariante(\u00f80\u00f8000)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(ifwhileclass);
        this.addMoeglicheVariante(OO\u00f8000);
        this.addMoeglicheVariante(\u00f80\u00f8000);
    }
}

