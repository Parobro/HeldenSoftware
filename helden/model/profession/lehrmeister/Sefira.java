/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class Sefira
extends LehrmeisterBase {
    public Sefira() {
        super("Sch\u00fcler der Sefiras", "Sch\u00fclerin der Sefiras", 24, false);
        this.\u00d4O\u00d2O00 = "schwarz";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000(I.O\u00d4O000, o00O.O\u00d30000));
        arrayList.add(helden.framework.C.K.o00000("Gutaussehend"));
        arrayList.add(helden.framework.C.K.o00000("Schulden"));
        arrayList.add(helden.framework.C.K.o00000("Verpflichtungen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d6000));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.StringwhileString));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(oooo_0.o00000(while.\u00d2oO000));
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000(while.privateifObject));
        arrayList.add(oooo_0.o00000(while.\u00d2oO000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zechen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Brett-/Kartenspiel"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 6);
        k_02.\u00d200000(G.whilewhileString, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Urtulamidya"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Tulamidya"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Urtulamidya"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Abrichten"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Viehzucht"), 2);
        k_02.\u00d200000(this.getZauber("Adlerschwinge"), 5);
        k_02.\u00d200000(this.getZauber("Blick aufs Wesen"), 5);
        k_02.\u00d200000(this.getZauber("Balsam"), 4);
        k_02.\u00d200000(this.getZauber("Chimaeroform"), 5);
        k_02.\u00d200000(this.getZauber("Paralysis"), 5);
        k_02.\u00d200000(this.getZauber("Salander"), 7);
        k_02.\u00d200000(this.getZauber("Transmutare"), 6);
        k_02.\u00d200000(this.getZauber("Analys"), 4);
        k_02.\u00d200000(this.getZauber("Armatrutz"), 3);
        k_02.\u00d200000(this.getZauber("Corpofesso"), 4);
        k_02.\u00d200000(this.getZauber("Unitatio"), 2);
        k_02.\u00d200000(this.getZauber("Klarum Purum"), 2);
        k_02.\u00d200000(this.getZauber("Pectetondo"), 2);
        k_02.\u00d200000(this.getZauber("Verwandlung beenden"), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Guter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Totenangst"));
        M m = (M)helden.framework.C.K.o00000(I.\u00f5\u00f6O000);
        m.o00000(o00O.\u00f4\u00d40000);
        arrayList.add(m);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        arrayList.addAll(for.\u00d200000("Blutmagie"));
        arrayList.add(new for(while.\u00d2\u00f8\u00f6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Randgruppe", "Chim\u00e4rologen"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verw\u00f6hnt", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 5));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00f8\u00d20000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.classnew, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d8o0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d8\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00f8\u00d3000, K.\u00f8O0000, ""));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Adlerschwinge"));
        arrayList.add(this.getZauber("Blick aufs Wesen"));
        arrayList.add(this.getZauber("Balsam"));
        arrayList.add(this.getZauber("Chimaeroform"));
        arrayList.add(this.getZauber("Paralysis"));
        arrayList.add(this.getZauber("Salander"));
        arrayList.add(this.getZauber("Transmutare"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

