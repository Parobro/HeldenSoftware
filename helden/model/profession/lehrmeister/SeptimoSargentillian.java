/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class SeptimoSargentillian
extends LehrmeisterBase {
    public SeptimoSargentillian() {
        super("Sch\u00fcler des Septimo Sargentillian", "Sch\u00fclerin des Septimo Sargentillian", 23, false);
        this.\u00d4O\u00d2O00 = "wei\u00df";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("nat\u00fcrliche Kugel");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Astralmacht"));
        arrayList.add(helden.framework.C.K.o00000("Ausdauernd"));
        arrayList.add(helden.framework.C.K.o00000("Ausdauernder Zauberer"));
        arrayList.add(helden.framework.C.K.o00000("Meisterhandwerk"));
        arrayList.add(helden.framework.C.K.o00000("Prophezeien"));
        arrayList.add(helden.framework.C.K.o00000("Artefaktgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Autorit\u00e4tsgl\u00e4ubig"));
        arrayList.add(helden.framework.C.K.o00000("Schulden"));
        arrayList.add(helden.framework.C.K.o00000("Verpflichtungen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 9;
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
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
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
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.thisifclass));
        arrayList.add(oooo_0.o00000(while.Stringifsuper));
        arrayList.add(oooo_0.o00000(while.StringwhileString));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000(while.oO\u00d8000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gesteinskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Garethi"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Nanduria"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Glaskunst"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Holzbearbeitung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 5);
        k_02.\u00d200000(voidsuper.StringfloatObject, 2);
        k_02.\u00d200000(this.getZauber("Adamantium"), 6);
        k_02.\u00d200000(this.getZauber("Hartes Schmelze"), 7);
        k_02.\u00d200000(this.getZauber("Objectofixo"), 5);
        k_02.\u00d200000(this.getZauber("Flim Flam"), 7);
        k_02.\u00d200000(this.getZauber("Dunkelheit"), 5);
        k_02.\u00d200000(this.getZauber("Objecto Obscuro"), 5);
        k_02.\u00d200000(this.getZauber("Reflectimago"), 7);
        k_02.\u00d200000(this.getZauber("Analys"), 3);
        k_02.\u00d200000(this.getZauber("Aureolus"), 6);
        k_02.\u00d200000(this.getZauber("Auris Nasus"), 4);
        k_02.\u00d200000(this.getZauber("Balsam"), 3);
        k_02.\u00d200000(this.getZauber("Blitz"), 3);
        k_02.\u00d200000(this.getZauber("Caldofrigo"), 5);
        k_02.\u00d200000(this.getZauber("Ignifaxius"), 2);
        k_02.\u00d200000(this.getZauber("Illusion aufl\u00f6sen"), 4);
        k_02.\u00d200000(this.getZauber("Motoricus"), 4);
        k_02.\u00d200000(this.getZauber("Objekt entzaubern"), 4);
        k_02.\u00d200000(this.getZauber("Odem"), 5);
        k_02.\u00d200000(this.getZauber("Penetrizzel"), 3);
        k_02.\u00d200000(this.getZauber("Reversalis"), 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Angst vor Feuer"));
        arrayList.add(helden.framework.C.K.o00000("Hitzeempfindlichkeit"));
        arrayList.add(helden.framework.C.K.o00000("Krankhafte Reinlichkeit"));
        arrayList.add(helden.framework.C.K.o00000("Kurzatmig"));
        arrayList.add(helden.framework.C.K.o00000("Lichtempfindlich"));
        arrayList.add(helden.framework.C.K.o00000("Tollpatsch"));
        arrayList.add(helden.framework.C.K.o00000("Unfrei"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        arrayList.add(new for(while.thisprivate));
        arrayList.add(new for(while.privateifObject));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(2);
        arrayList.add(helden.framework.C.K.o00000(I.privateclass, 5));
        arrayList.add(helden.framework.C.K.o00000(I.privateObjectsuper, 10));
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Hitzeresistenz"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 5));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f8\u00d5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f8\u00d5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.whilereturnnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ififnew, K.\u00f8O0000, ""));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Adamantium"));
        arrayList.add(this.getZauber("Hartes Schmelze"));
        arrayList.add(this.getZauber("Objectofixo"));
        arrayList.add(this.getZauber("Flim Flam"));
        arrayList.add(this.getZauber("Dunkelheit"));
        arrayList.add(this.getZauber("Objecto Obscuro"));
        arrayList.add(this.getZauber("Reflectimago"));
    }
}

