/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.ProfessionenFabrik;
import helden.model.myranor.kultur.BasisMyranorKultur;
import helden.model.myranor.profession.Akrobat;
import helden.model.myranor.profession.Athlet;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Bashide;
import helden.model.myranor.profession.Biagha;
import helden.model.myranor.profession.Gladiator;
import helden.model.myranor.profession.Haendler;
import helden.model.myranor.profession.Handwerker;
import helden.model.myranor.profession.Jaeger;
import helden.model.myranor.profession.Landarbeiter;
import helden.model.myranor.profession.Matrose;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Runenmeister;
import helden.model.myranor.profession.Saithakenner;
import helden.model.myranor.profession.Schiffskaempfer;
import helden.model.myranor.profession.Scholar;
import helden.model.myranor.profession.Schreiber;
import helden.model.myranor.profession.Schwerstarbeiter;
import helden.model.myranor.profession.Taucher;
import helden.model.myranor.profession.UnabhaengigerMagier;
import helden.model.myranor.profession.Verkuender;
import helden.model.myranor.profession.Wanderhaendler;
import helden.model.myranor.profession.Wellenkind;
import java.util.ArrayList;

public class MaritimeKultur
extends BasisMyranorKultur {
    public MaritimeKultur() {
    }

    public MaritimeKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void setAuswahlen() {
        this.\u00f5o0O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Athletik"));
        arrayList.add(N.floatsuper().\u00d200000("Klettern"));
        arrayList.add(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Schleichen"));
        arrayList.add(N.floatsuper().\u00d200000("Selbstbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
        arrayList.add(N.floatsuper().\u00d200000("Zechen"));
        int[] nArray = new int[]{2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Fesseln/Entfesseln"));
        arrayList.add(N.floatsuper().\u00d200000("Fischen/Angeln"));
        arrayList.add(N.floatsuper().\u00d200000("Orientierung"));
        arrayList.add(N.floatsuper().\u00d200000("Wettervorhersage"));
        arrayList.add(N.floatsuper().\u00d200000("Wildnisleben"));
        int[] nArray2 = new int[]{3, 2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Geografie"));
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray3 = new int[]{2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
        arrayList.add(N.floatsuper().\u00d200000("Ackerbau"));
        arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
        arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
        arrayList.add(voidsuper.Oo\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
        arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Kartografie"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Seefahrt"));
        arrayList.add(N.floatsuper().\u00d200000("T\u00e4towieren"));
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        arrayList.add(N.floatsuper().\u00d200000("Zimmermann"));
        int[] nArray4 = new int[]{2, 2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        arrayList.remove(this.getMuttersprache());
        int[] nArray5 = new int[]{4, 4};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Raufen"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 3);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Balance"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000(I.ifif.toString(), new Object[]{"Sicht"}));
        arrayList.add(I.o\u00d8o000);
        arrayList.add(K.o00000("K\u00e4lteresistenz"));
        arrayList.add(K.o00000("Taucherlunge"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Landangst"));
        arrayList.add(K.o00000("Verpflichtungen"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K189";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Athlet(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffskaempfer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Landarbeiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Matrose(this.getGeschlecht(), g2, g3));
        arrayList.add(new Reiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Taucher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Akrobat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Verkuender(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scholar(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schreiber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schwerstarbeiter(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getMyranorProfessionenPriester(this.getGeschlecht(), g2, g3));
        arrayList.add(new BaLoa(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bashide(this.getGeschlecht(), g2, g3));
        arrayList.add(new Biagha(this.getGeschlecht(), g2, g3));
        arrayList.add(new Runenmeister(this.getGeschlecht(), g2, g3));
        arrayList.add(new Saithakenner(this.getGeschlecht(), g2, g3));
        arrayList.add(new UnabhaengigerMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wellenkind(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Maritime Kultur" + super.toString();
        }
        return "Maritime Kultur" + super.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    public boolean hatOptimatischeVariante() {
        return true;
    }
}

