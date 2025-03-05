/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
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
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.FaehnrichFusskaemper;
import helden.model.profession.FaehnrichKavallerie;
import helden.model.profession.FaehnrichSee;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Geweihter;
import helden.model.profession.Hexe;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schiffer;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Stabsfaehnrich;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Zaubertaenzer;
import java.util.ArrayList;

public class Aranien
extends OooO {
    public static final P \u00d4\u00f8\u00f6000 = new P("Stadt", 2, true);
    public static final P nulldoclass = new P("K\u00fcstengebiete oder am Barun-Ulah", 2, true);
    public static final P \u00d3\u00f8\u00f6000 = new P("Adel", 2, true);
    protected int \u00d5\u00f8\u00f6000 = 0;
    private G o\u00f8\u00f6000 = null;
    private G O\u00f8\u00f6000 = null;

    public Aranien() {
    }

    public Aranien(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.o\u00f8\u00f6000 == null) {
            this.o\u00f8\u00f6000 = g2;
            if (g2.equals(G.whilewhileString)) {
                this.O\u00f8\u00f6000 = G.\u00d8\u00d8\u00f5000;
                ArrayList<G> arrayList = new ArrayList<G>();
                arrayList.add(G.newwhileString);
                this.setZweitLehrsprache(arrayList);
            } else {
                ArrayList<G> arrayList = new ArrayList<G>();
                arrayList.add(G.whilewhileString);
                this.setZweitLehrsprache(arrayList);
            }
        } else {
            this.O\u00f8\u00f6000 = g2;
        }
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(\u00d3\u00f8\u00f6000);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.\u00f4\u00d4\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f4o\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.privatedoObject, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        if (!this.istMaennlich()) {
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        }
        if (this.istVariante(\u00d4\u00f8\u00f6000)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        }
        if (this.istVariante(nulldoclass)) {
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
        }
        if (this.istVariante(\u00d3\u00f8\u00f6000)) {
            this.addTalentwert(E.\u00f4\u00d4\u00d8000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K04";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Aranien";
    }

    @Override
    public G getMuttersprache() {
        return this.o\u00f8\u00f6000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Aranische Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        if (this.o\u00f8\u00f6000 == null) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.whilewhileString);
            arrayList.add(G.newwhileString);
            return new oo0o_2(this, arrayList, 1, "Muttersprache, nicht gew\u00e4hlte Sprache wird zur Zweitsprache");
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3o\u00f5000);
        arrayList.add(G.\u00d8\u00d8\u00f5000);
        arrayList.add(G.whileStringclass);
        return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d5\u00f8\u00f6000) {
            case 0: {
                arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.add(voidsuper.thisintObject);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00d8\u00d8\u00f5000);
                arrayList.add(G.\u00d3o\u00f5000);
                int[] nArray = new int[]{3};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                arrayList.add(voidsuper.newreturnObject);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                if (!this.istMaennlich()) {
                    ++this.\u00d5\u00f8\u00f6000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 5: {
                arrayList.add(G.\u00d8\u00d8\u00f5000);
                arrayList.add(G.\u00d3o\u00f5000);
                int[] nArray = new int[]{2};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        L l3;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Ritter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        if (this.getGeschlecht().istMaennlich()) {
            arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
            arrayList.remove(new FaehnrichFusskaemper(this.getGeschlecht(), g2, g3));
            arrayList.remove(new FaehnrichKavallerie(this.getGeschlecht(), g2, g3));
            arrayList.remove(new FaehnrichSee(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Stabsfaehnrich(this.getGeschlecht(), g2, g3));
            l3 = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getTarisharim());
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getAlDrakorhim());
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getBeniUchakani());
            arrayList.add(l3);
        }
        if (!this.istMaennlich()) {
            l3 = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getAssada());
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getFayar());
            arrayList.add(l3);
        }
        l3 = new Schwertgeselle(this.getGeschlecht(), g2, g3);
        arrayList.remove(l3);
        l3.addMoeglicheVariante(((Schwertgeselle)l3).getMarwan());
        if (!this.getGeschlecht().istMaennlich()) {
            l3.addMoeglicheVariante(((Schwertgeselle)l3).getIshannah());
        }
        arrayList.add(l3);
        Gardist gardist = new Gardist(this.getGeschlecht(), g2, g3);
        arrayList.remove(gardist);
        gardist.addMoeglicheVariante(gardist.getAranischerSippenkrieger());
        arrayList.add(gardist);
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        Schiffer schiffer = new Schiffer(this.getGeschlecht(), g2, g3);
        arrayList.remove(schiffer);
        schiffer.addMoeglicheVariante(schiffer.getFlusspirat());
        arrayList.add(schiffer);
        Strassenraeuber strassenraeuber = new Strassenraeuber(this.getGeschlecht(), g2, g3);
        arrayList.remove(strassenraeuber);
        strassenraeuber.addMoeglicheVariante(strassenraeuber.getThalusischerWegelagerer());
        arrayList.add(strassenraeuber);
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
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
        arrayList.add(new Magier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        Lehrmeister lehrmeister = new Lehrmeister(this.getGeschlecht(), g2, g3);
        lehrmeister.clearMoeglicheVarianten();
        lehrmeister.addMoeglicheVariante(lehrmeister.getRafimBey());
        lehrmeister.addMoeglicheVariante(lehrmeister.getKhelbara());
        lehrmeister.addMoeglicheVariante(lehrmeister.getNiobara());
        lehrmeister.addMoeglicheVariante(lehrmeister.getNachtwind());
        lehrmeister.addMoeglicheVariante(lehrmeister.getIlarist());
        lehrmeister.addMoeglicheVariante(lehrmeister.getErbederGraeber());
        arrayList.add(lehrmeister);
        if (this.istMaennlich()) {
            l2 = new Zaubertaenzer(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Zaubertaenzer)l2).getMajuna());
            l2.addMoeglicheVariante(((Zaubertaenzer)l2).getMajunaMagisch());
            arrayList.add(l2);
        } else {
            l2 = new Zaubertaenzer(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Zaubertaenzer)l2).getTulamidischeSharisad());
            l2.addMoeglicheVariante(((Zaubertaenzer)l2).getTulamidischeSharisadMagisch());
            arrayList.add(l2);
        }
        l2 = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        l2.clearMoeglicheVarianten();
        ((Geweihter)l2).add12G();
        l2.addMoeglicheVariante(((Geweihter)l2).getAves());
        l2.addMoeglicheVariante(((Geweihter)l2).getGolgaritGeweiht());
        l2.addMoeglicheVariante(((Geweihter)l2).getNandus());
        l2.addMoeglicheVariante(((Geweihter)l2).getNandusMarktschreiber());
        l2.addMoeglicheVariante(((Geweihter)l2).getNandusVolkslehrer());
        l2.addMoeglicheVariante(((Geweihter)l2).getNandusRechtshelfer());
        l2.addMoeglicheVariante(((Geweihter)l2).getBundDesWahrenGlaubens());
        arrayList.add(l2);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getSaebeltaenzer());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
        arrayList.add(ordenskrieger);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return this.O\u00f8\u00f6000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(\u00d4\u00f8\u00f6000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00d30\u00d2000, "Stadtteil/Kleinstadt"));
        }
        return oOOo;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.o\u00f8\u00f6000 == null || this.O\u00f8\u00f6000 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00d3\u00f8\u00f6000)) {
            return this.\u00d5\u00f8\u00f6000 < 6;
        }
        if (this.istMaennlich()) {
            return this.\u00d5\u00f8\u00f6000 < 4;
        }
        return this.\u00d5\u00f8\u00f6000 < 3;
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
        this.o\u00f8\u00f6000 = g2;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.O\u00f8\u00f6000 = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Aranien");
        if (this.istVariante(\u00d4\u00f8\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d4\u00f8\u00f6000.toString());
        }
        if (this.istVariante(nulldoclass)) {
            stringBuffer.append("/");
            stringBuffer.append(nulldoclass.toString());
        }
        if (this.istVariante(\u00d3\u00f8\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d3\u00f8\u00f6000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d4\u00f8\u00f6000);
        this.addAlleVarianten(nulldoclass);
        this.addAlleVarianten(\u00d3\u00f8\u00f6000);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d4\u00f8\u00f6000);
        this.addMoeglicheVariante(nulldoclass);
        this.addMoeglicheVariante(\u00d3\u00f8\u00f6000);
    }
}

