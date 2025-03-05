/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.alchimist;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZRassen.Grolm;
import java.util.ArrayList;

public class GrolmischerGoldmacher
extends helden.framework.int.N {
    public GrolmischerGoldmacher() {
        super("Grolmischer Goldmacher", "Grolmischer Goldmacher", 11, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Alchemistische Ger\u00e4tschaften");
        arrayList.add("Fachb\u00fccher im Wert von 75D");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Astralmacht"));
        arrayList.add(helden.framework.C.K.o00000("Eisenaffine Aura"));
        arrayList.add(helden.framework.C.K.o00000("Gebildet"));
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(helden.framework.C.K.o00000("Herausragender Sinn"));
        arrayList.add(helden.framework.C.K.o00000("Hitzeresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Verbindungen"));
        arrayList.add(helden.framework.C.K.o00000("Feste Gewohnheit"));
        arrayList.add(helden.framework.C.K.o00000("Goldgier"));
        arrayList.add(helden.framework.C.K.o00000("Krankhafte Reinlichkeit"));
        arrayList.add(helden.framework.C.K.o00000("Neugier"));
        arrayList.add(helden.framework.C.K.o00000("Schulden"));
        arrayList.add(helden.framework.C.K.o00000("Sucht"));
        arrayList.add(helden.framework.C.K.o00000("\u00dcbler Geruch"));
        arrayList.add(helden.framework.C.K.o00000("Weltfremd bzgl."));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.addAll(oooo_0.o00000(voidsuper.\u00f5o\u00d6000));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Ritualkenntnis: Alchimist"));
        arrayList.add(oooo_0.o00000("Schalenzauber: Weihe der Schale"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(G.\u00d40\u00f6000);
                arrayList.add(G.o0\u00f6000);
                arrayList.add(G.nullObjectclass);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Brauer"));
                arrayList.add(N.floatsuper().\u00d200000("Schnaps brennen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hiebwaffen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gesteinskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("H\u00fcttenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Feinmechanik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Handel"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hauswirtschaft"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kochen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Stoffe f\u00e4rben"), 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d8000, 3);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.privateintnew, K.\u00d3\u00d20000, ""), 6);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.\u00d3\u00d20000, ""), 4);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00d3\u00d20000, ""), 5);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d3000, K.\u00d3\u00d20000, ""), 5);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00d3\u00d20000, ""), 5);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.\u00d3\u00d20000, ""), 4);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.\u00d3\u00d20000, ""), 2);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d8\u00d4\u00d4000, K.\u00d3\u00d20000, ""), 2);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, K.\u00d3\u00d20000, ""), 3);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d3000, K.\u00d3\u00d20000, ""), 3);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00f40\u00d4000, K.\u00d3\u00d20000, ""), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Astraler Block"));
        arrayList.add(helden.framework.C.K.o00000("Farbenblind"));
        arrayList.add(helden.framework.C.K.o00000("Niedrige Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Pechmagnet"));
        arrayList.add(helden.framework.C.K.o00000("Tollpatsch"));
        arrayList.add(helden.framework.C.K.o00000("Ungebildet"));
        arrayList.add(helden.framework.C.K.o00000("Unstet"));
        arrayList.add(helden.framework.C.K.o00000("Unvertr\u00e4glichkeit mit verarbeitetem Metall"));
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                ArrayList<String> arrayList2 = new ArrayList<String>();
                arrayList2.add("Haltbarmachung");
                arrayList.add(for.o00000(voidsuper.o\u00f6\u00d6000, arrayList2, 1));
                arrayList2 = new ArrayList();
                arrayList2.add("Tr\u00e4nke");
                arrayList.add(for.o00000(voidsuper.o\u00f6\u00d6000, arrayList2, 1));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Matrixregeneration I"));
        arrayList.addAll(for.\u00d200000("Meister der Improvisation"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<U> arrayList = new ArrayList<U>();
        arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
        arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
        arrayList.remove(voidsuper.\u00f5o\u00d6000);
        M<U> m = helden.framework.C.K.\u00d200000(arrayList);
        return o00o_0.o00000(this.getProfession(), m, 2);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        M<U> m = helden.framework.C.K.o00000();
        m.\u00d2o0000();
        m.o00000(voidsuper.\u00f5o\u00d6000);
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 5));
        return oo0O;
    }

    @Override
    public BedingungsVerknuepfung getWahlBedingung() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatRassenID(new Grolm().getID()));
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(KonkreterZauber.getZauber(Zauber.privateintnew, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00d3\u00d20000, ""));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

