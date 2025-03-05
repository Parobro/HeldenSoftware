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
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Bauer;
import helden.model.profession.Derwisch;
import helden.model.profession.Druide;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.FaehnrichFusskaemper;
import helden.model.profession.FaehnrichKavallerie;
import helden.model.profession.FaehnrichSee;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geweihter;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Herold;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Krieger;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Prospektor;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schiffer;
import helden.model.profession.Schriftsteller;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soeldner;
import helden.model.profession.Stabsfaehnrich;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Wundarzt;
import helden.model.profession.Zaubertaenzer;
import java.util.ArrayList;

public class Mhanadistan
extends OooO {
    public static final P \u00d5\u00f6\u00f6000 = new P("An wichtigen Handelsrouten", 1, true);
    public static final P \u00d8\u00f6\u00f6000 = new P("Fern der Zivilisation", 1, true);
    public static final P \u00f4\u00f6\u00f6000 = new P("K\u00fcstengebiete oder an gro\u00dfen Fl\u00fcssen", 3, true);
    public static final P Stringdoclass = new P("Tulamidische Nomadenst\u00e4mme", 2, true);
    public static final P thisdoclass = new P("Kasimit", 1, true);
    private G \u00d4\u00f6\u00f6000 = null;
    private int \u00f5\u00f6\u00f6000 = 0;

    public Mhanadistan() {
    }

    public Mhanadistan(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.\u00d4\u00f6\u00f6000 == null) {
            this.\u00d4\u00f6\u00f6000 = g2;
            if (!(this.istVariante(\u00d8\u00f6\u00f6000) || this.istVariante(thisdoclass) || this.istVariante(Stringdoclass))) {
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
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4o\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 2);
        if (this.istVariante(\u00d5\u00f6\u00f6000)) {
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        }
        if (this.istVariante(\u00d8\u00f6\u00f6000)) {
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, -1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        }
        if (this.istVariante(\u00f4\u00f6\u00f6000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
        }
        if (this.istVariante(Stringdoclass)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.removeTalent(voidsuper.O0\u00d6000);
            this.removeTalent(voidsuper.\u00d30\u00d8000);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.removeTalent(voidsuper.\u00d5\u00d2\u00d6000);
        }
        if (this.istVariante(thisdoclass)) {
            this.addTalentwert(E.newnewString, 2);
            this.addTalentwert(voidsuper.oo\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K25";
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
        if (this.\u00d4\u00f6\u00f6000 == null) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.\u00d3o\u00f5000);
            arrayList.add(G.\u00d8\u00d8\u00f5000);
            arrayList.add(G.whileStringclass);
            return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        if (this.istVariante(Stringdoclass)) {
            arrayList.add(G.whilenewclass);
        }
        arrayList.add(G.whilewhileString);
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = null;
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f5\u00f6\u00f6000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                o0oo_22 = new o0oo_2(this, arrayList, nArray);
                break;
            }
            case 1: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                int[] nArray = new int[]{1};
                o0oo_22 = new o0oo_2(this, arrayList, nArray);
                break;
            }
            case 2: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                if (this.istVariante(\u00d8\u00f6\u00f6000)) {
                    arrayList.add(E.\u00d5\u00d5\u00d8000);
                }
                int[] nArray = new int[]{1};
                o0oo_22 = new o0oo_2(this, arrayList, nArray);
                break;
            }
            case 3: {
                arrayList.add(voidsuper.ifforObject);
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                int[] nArray = new int[]{1};
                o0oo_22 = new o0oo_2(this, arrayList, nArray);
                break;
            }
            case 4: {
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d5000);
                int[] nArray = new int[]{1};
                o0oo_22 = new o0oo_2(this, arrayList, nArray);
                break;
            }
            default: {
                throw new c_1();
            }
        }
        while (this.\u00f5\u00f6\u00f6000 < 5) {
            ++this.\u00f5\u00f6\u00f6000;
            if (this.\u00f5\u00f6\u00f6000 != 1 && (this.\u00f5\u00f6\u00f6000 != 2 || !this.istVariante(\u00d8\u00f6\u00f6000) && !this.istVariante(Stringdoclass)) && (this.\u00f5\u00f6\u00f6000 != 3 || !this.istVariante(\u00d8\u00f6\u00f6000)) && (this.\u00f5\u00f6\u00f6000 != 4 || !this.istVariante(\u00f4\u00f6\u00f6000))) continue;
            break;
        }
        return o0oo_22;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (this.istVariante(thisdoclass)) {
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
                arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Herold(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Schriftsteller(this.getGeschlecht(), g2, g3));
                arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
                Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
                alchemist.clearMoeglicheVarianten();
                alchemist.addMoeglicheVariante(alchemist.getUnau());
                alchemist.addMoeglicheVariante(alchemist.getUnauNM());
                arrayList.add(alchemist);
                arrayList.add(new Derwisch(this.getGeschlecht(), g2, g3));
                Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
                arrayList.remove(haendler);
                arrayList.add(haendler);
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
            L l4;
            if (this.istMaennlich()) {
                arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
                arrayList.remove(new FaehnrichFusskaemper(this.getGeschlecht(), g2, g3));
                arrayList.remove(new FaehnrichKavallerie(this.getGeschlecht(), g2, g3));
                arrayList.remove(new FaehnrichSee(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Stabsfaehnrich(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Ritter(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
                l4 = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                l4.clearMoeglicheVarianten();
                l4.addMoeglicheVariante(((Stammeskrieger)l4).getBeniDervez());
                l4.addMoeglicheVariante(((Stammeskrieger)l4).getTarisharim());
                l4.addMoeglicheVariante(((Stammeskrieger)l4).getAlDrakorhim());
                l4.addMoeglicheVariante(((Stammeskrieger)l4).getBeniUchakani());
                arrayList.add(l4);
                l3 = new Schwertgeselle(this.getGeschlecht(), g2, g3);
                arrayList.remove(l3);
                l3.addMoeglicheVariante(((Schwertgeselle)l3).getMarwan());
                arrayList.add(l3);
            } else {
                arrayList.add(new Amazone(this.getGeschlecht(), g2, g3));
                arrayList.add(new Krieger(this.getGeschlecht(), g2, g3));
                l4 = new Schwertgeselle(this.getGeschlecht(), g2, g3);
                l4.addMoeglicheVariante(((Schwertgeselle)l4).getMarwan());
                l4.addMoeglicheVariante(((Schwertgeselle)l4).getIshannah());
                arrayList.add(l4);
                if (this.istVariante(\u00d8\u00f6\u00f6000)) {
                    l3 = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
                    l3.clearMoeglicheVarianten();
                    l3.addMoeglicheVariante(((Stammeskrieger)l3).getAssada());
                    l3.addMoeglicheVariante(((Stammeskrieger)l3).getFayar());
                    arrayList.add(l3);
                }
            }
            arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
            l4 = new Schiffer(this.getGeschlecht(), g2, g3);
            arrayList.remove(l4);
            l4.addMoeglicheVariante(((Schiffer)l4).getFlusspirat());
            arrayList.add(l4);
            l3 = new Strassenraeuber(this.getGeschlecht(), g2, g3);
            arrayList.remove(l3);
            l3.addMoeglicheVariante(((Strassenraeuber)l3).getThalusischerWegelagerer());
            arrayList.add(l3);
            if (!this.istMaennlich()) {
                arrayList.remove(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
                arrayList.remove(new Seefahrer(this.getGeschlecht(), g2, g3));
            }
            arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
            Hofkuenstler hofkuenstler = new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            arrayList.remove(hofkuenstler);
            hofkuenstler.addMoeglicheVariante(hofkuenstler.getKalligraph());
            arrayList.add(hofkuenstler);
            Gaukler gaukler = new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            arrayList.remove(gaukler);
            gaukler.addMoeglicheVariante(gaukler.getSchlangenbeschwoerer());
            arrayList.add(gaukler);
            arrayList.remove(new Herold(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Schriftsteller(this.getGeschlecht(), g2, g3));
            arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
            arrayList.remove(new Rattenfaenger(this.getGeschlecht(), g2, g3));
            Druide druide = new Druide(this.getGeschlecht(), g2, g3);
            druide.addMoeglicheVariante(druide.getFeuerelementarist());
            druide.addMoeglicheVariante(druide.getHumuselementarist());
            druide.addMoeglicheVariante(druide.getWasserelementarist());
            druide.addMoeglicheVariante(druide.getLuftelementarist());
            druide.addMoeglicheVariante(druide.getErzelementarist());
            druide.addMoeglicheVariante(druide.getEiselementarist());
            arrayList.add(druide);
            arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
            arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
            if (!this.istMaennlich()) {
                l2 = new Zaubertaenzer(this.getGeschlecht(), g2, g3);
                l2.clearMoeglicheVarianten();
                l2.addMoeglicheVariante(l2.getTulamidischeSharisad());
                l2.addMoeglicheVariante(l2.getTulamidischeSharisadMagisch());
                arrayList.add(l2);
            } else {
                arrayList.add(new Derwisch(this.getGeschlecht(), g2, g3));
            }
            l2 = new Magier(this.getGeschlecht(), g2, g3);
            arrayList.add(l2);
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
            geweihter.removeMoeglicheVariante(geweihter.getFirunHueterDerJagd());
            geweihter.removeMoeglicheVariante(geweihter.getFirunWaldlaeufer());
            geweihter.addMoeglicheVariante(geweihter.getAves());
            geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
            geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
            arrayList.add(geweihter);
            Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            ordenskrieger.clearMoeglicheVarianten();
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getSaebeltaenzer());
            ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
            arrayList.add(ordenskrieger);
            Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
            arrayList.remove(haendler);
            haendler.addMoeglicheVariante(haendler.getTauschhaendler());
            arrayList.add(haendler);
        }
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return this.\u00d4\u00f6\u00f6000;
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
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(thisdoclass)) {
            arrayList.add(new for(while.newint));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        if (this.istVariante(thisdoclass)) {
            Oo0O oo0O = super.getVorteile();
            J j2 = (J)K.o00000(I.\u00d5\u00f60000);
            j2.oO0000(5);
            oo0O.\u00d300000(j2);
            return oo0O;
        }
        return super.getVorteile();
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.\u00d4\u00f6\u00f6000 == null || this.getZweitLehrsprache().size() == 0 && this.istVariante(Stringdoclass);
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00f5\u00f6\u00f6000 < 5;
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
        this.\u00d4\u00f6\u00f6000 = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Mhanadistan");
        if (this.istVariante(\u00d8\u00f6\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d8\u00f6\u00f6000.toString());
        }
        if (this.istVariante(\u00d5\u00f6\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d5\u00f6\u00f6000.toString());
        }
        if (this.istVariante(thisdoclass)) {
            stringBuffer.append("/");
            stringBuffer.append(thisdoclass.toString());
        }
        if (this.istVariante(\u00f4\u00f6\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00f4\u00f6\u00f6000.toString());
        }
        if (this.istVariante(Stringdoclass)) {
            stringBuffer.append("/");
            stringBuffer.append(Stringdoclass.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(thisdoclass);
        this.addAlleVarianten(\u00d5\u00f6\u00f6000);
        this.addAlleVarianten(\u00d8\u00f6\u00f6000);
        this.addAlleVarianten(\u00f4\u00f6\u00f6000);
        this.addAlleVarianten(Stringdoclass);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(thisdoclass);
        this.addMoeglicheVariante(\u00d5\u00f6\u00f6000);
        this.addMoeglicheVariante(\u00d8\u00f6\u00f6000);
        this.addMoeglicheVariante(\u00f4\u00f6\u00f6000);
        this.addMoeglicheVariante(Stringdoclass);
    }
}

