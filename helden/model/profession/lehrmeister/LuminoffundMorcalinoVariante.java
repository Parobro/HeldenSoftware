/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class LuminoffundMorcalinoVariante
extends LehrmeisterBase {
    public LuminoffundMorcalinoVariante() {
        super("Sch\u00fcler von Luminoff und Morcalino", "Sch\u00fclerin von Luminoff und Morcalino", 27, false);
        this.\u00d4O\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Kochutensilien (-7)");
        arrayList.add("Reitpferd");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Ausr\u00fcstungsvorteil"));
        arrayList.add(helden.framework.C.K.o00000(I.ifif, new Object[]{"Geruch"}));
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(helden.framework.C.K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(helden.framework.C.K.o00000("Zeitgef\u00fchl"));
        arrayList.add(helden.framework.C.K.o00000("Arroganz"));
        arrayList.add(helden.framework.C.K.o00000("Beh\u00e4big"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Fettleibig"));
        arrayList.add(helden.framework.C.K.o00000("Krankhafte Reinlichkeit"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
        arrayList.add(helden.framework.C.K.o00000("Schulden"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("FF"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
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
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringwhileString));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.oO\u00d8000));
        arrayList.add(helden.framework.d.oooo_0.o00000("Zauberkontrolle"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.ififObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zechen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 5);
        k_02.\u00d200000(G.\u00d40\u00f6000, 3);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Isdira"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hauswirtschaft"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kochen"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        k_02.\u00d200000(this.getZauber("Abvenenum"), 7);
        k_02.\u00d200000(this.getZauber("Aeolitus"), 5);
        k_02.\u00d200000(this.getZauber("Caldofrigo"), 6);
        k_02.\u00d200000(this.getZauber("Delicioso"), 7);
        k_02.\u00d200000(this.getZauber("Klarum Purum"), 5);
        k_02.\u00d200000(this.getZauber("Motoricus"), 5);
        k_02.\u00d200000(this.getZauber("Unitatio"), 5);
        k_02.\u00d200000(this.getZauber("Adlerauge"), 2);
        k_02.\u00d200000(this.getZauber("Analys"), 2);
        k_02.\u00d200000(this.getZauber("Animatio"), 3);
        k_02.\u00d200000(this.getZauber("Balsam"), 2);
        k_02.\u00d200000(this.getZauber("Claudibus"), 3);
        k_02.\u00d200000(this.getZauber("Corpofrigo"), 2);
        k_02.\u00d200000(this.getZauber("Flim Flam"), 2);
        k_02.\u00d200000(this.getZauber("Manifesto"), 5);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d4000, K.\u00f4o0000, ""), 4);
        k_02.\u00d200000(this.getZauber("Nihilogravo"), 2);
        k_02.\u00d200000(this.getZauber("Odem"), 3);
        k_02.\u00d200000(this.getZauber("Sapefacta"), 4);
        k_02.\u00d200000(this.getZauber("Unber\u00fchrt"), 5);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.forObject);
        arrayList.add(helden.framework.C.K.o00000(I.O\u00d40000, new Object[]{"Geruch"}));
        arrayList.add(helden.framework.C.K.o00000("Krankheitsanf\u00e4llig"));
        arrayList.add(helden.framework.C.K.o00000("Raumangst"));
        arrayList.add(helden.framework.C.K.o00000("\u00dcbler Geruch"));
        arrayList.add(helden.framework.C.K.o00000("Unfrei"));
        arrayList.add(helden.framework.C.K.o00000("Vorurteile gegen"));
        arrayList.add(helden.framework.C.K.o00000("Vorurteile gegen (stark)"));
        arrayList.add(helden.framework.C.K.o00000("Widerw\u00e4rtiges Aussehen"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (P p2 : helden.framework.d.oooo_0.o00000(voidsuper.o\u00f6\u00d6000)) {
            oooo_02.o00000(new b_0((Object)p2));
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.add(new for(while.\u00d3\u00f5\u00d3000));
        arrayList.addAll(for.\u00d200000("Meister der Improvisation"));
        arrayList.addAll(for.\u00d200000("Meisterliche Zauberkontrolle I"));
        arrayList.addAll(for.\u00d200000("Meisterliche Zauberkontrolle II"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Eitelkeit", 5));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(18);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(6, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d4\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullsupernew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d8\u00d4000, K.\u00f8O0000, ""));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Abvenenum"));
        arrayList.add(this.getZauber("Aeolitus"));
        arrayList.add(this.getZauber("Caldofrigo"));
        arrayList.add(this.getZauber("Delicioso"));
        arrayList.add(this.getZauber("Klarum Purum"));
        arrayList.add(this.getZauber("Motoricus"));
        arrayList.add(this.getZauber("Unitatio"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

