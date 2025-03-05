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
import helden.model.myranor.kultur.BasisMyranorKultur;
import helden.model.myranor.profession.Akrobat;
import helden.model.myranor.profession.Athlet;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Dieb;
import helden.model.myranor.profession.Gladiator;
import helden.model.myranor.profession.Gossenschlaeger;
import helden.model.myranor.profession.Handwerker;
import helden.model.myranor.profession.Heiler;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Sammler;
import helden.model.myranor.profession.Schankdiener;
import helden.model.myranor.profession.Schiffskaempfer;
import helden.model.myranor.profession.Schwerstarbeiter;
import helden.model.myranor.profession.Shanwada;
import helden.model.myranor.profession.Streuner;
import helden.model.myranor.profession.Thulnail;
import helden.model.myranor.profession.UnabhaengigerMagier;
import helden.model.myranor.profession.Verkuender;
import helden.model.myranor.profession.Wanderhaendler;
import helden.model.myranor.profession.Wanderprediger;
import helden.model.myranor.profession.Wildniskrieger;
import helden.model.myranor.profession.Windfluesterer;
import helden.model.myranor.profession.Zaubertaenzer;
import helden.model.myranor.profession.Zharzhuri;
import java.util.ArrayList;

public class VagabundischeKultur
extends BasisMyranorKultur {
    public VagabundischeKultur() {
    }

    public VagabundischeKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Balance"));
        arrayList.add(K.o00000("Breitgef\u00e4cherte Bildung"));
        arrayList.add(K.o00000("Gl\u00fcck"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Goldgier"));
        arrayList.add(K.o00000("Impulsiv"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Neugier"));
        arrayList.add(K.o00000("Unstet"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K192";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 9;
    }

    @Override
    public void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Akrobatik"));
        arrayList.add(N.floatsuper().\u00d200000("Athletik"));
        arrayList.add(N.floatsuper().\u00d200000("Freies Fliegen"));
        arrayList.add(N.floatsuper().\u00d200000("Gaukeleien"));
        arrayList.add(N.floatsuper().\u00d200000("Klettern"));
        arrayList.add(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Reiten"));
        arrayList.add(N.floatsuper().\u00d200000("Schleichen"));
        arrayList.add(N.floatsuper().\u00d200000("Selbstbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verstecken"));
        arrayList.add(N.floatsuper().\u00d200000("Singen"));
        arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
        arrayList.add(voidsuper.returnwhileObject);
        arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
        arrayList.add(N.floatsuper().\u00d200000("Taschendiebstahl"));
        arrayList.add(N.floatsuper().\u00d200000("Zechen"));
        int[] nArray = new int[]{3, 2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Bet\u00f6ren"));
        arrayList.add(N.floatsuper().\u00d200000("Etikette"));
        arrayList.add(N.floatsuper().\u00d200000("Gassenwissen"));
        arrayList.add(N.floatsuper().\u00d200000("Menschenkenntnis"));
        arrayList.add(N.floatsuper().\u00d200000("Schauspielerei"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verkleiden"));
        arrayList.add(N.floatsuper().\u00d200000("\u00dcberreden"));
        int[] nArray2 = new int[]{2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"));
        arrayList.add(N.floatsuper().\u00d200000("Fesseln/Entfesseln"));
        arrayList.add(N.floatsuper().\u00d200000("Orientierung"));
        arrayList.add(N.floatsuper().\u00d200000("Wettervorhersage"));
        arrayList.add(N.floatsuper().\u00d200000("Wildnisleben"));
        int[] nArray3 = new int[]{2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.\u00f4o\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Geografie"));
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Heraldik"));
        arrayList.add(N.floatsuper().\u00d200000("Mechanik"));
        arrayList.add(N.floatsuper().\u00d200000("Rechnen"));
        arrayList.add(N.floatsuper().\u00d200000("Rechtskunde"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Sch\u00e4tzen"));
        arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray4 = new int[]{1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
        arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
        arrayList.add(N.floatsuper().\u00d200000("Flugger\u00e4te steuern"));
        arrayList.add(N.floatsuper().\u00d200000("Seefahrt"));
        int[] nArray5 = new int[]{3};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
        arrayList.add(N.floatsuper().\u00d200000("Bogenbau"));
        arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Kartografie"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Schl\u00f6sser knacken"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Seiler"));
        arrayList.add(N.floatsuper().\u00d200000("Stellmacher"));
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        int[] nArray6 = new int[]{1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray6));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        int[] nArray7 = new int[]{4, 4};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray7));
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Athlet(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gossenschlaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffskaempfer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wildniskrieger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Reiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sammler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Akrobat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Verkuender(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Heiler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schankdiener(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schwerstarbeiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderprediger(this.getGeschlecht(), g2, g3));
        arrayList.add(new BaLoa(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shanwada(this.getGeschlecht(), g2, g3));
        arrayList.add(new Thulnail(this.getGeschlecht(), g2, g3));
        arrayList.add(new UnabhaengigerMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Windfluesterer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Zaubertaenzer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Zharzhuri(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Vagabundische Kultur" + super.toString();
        }
        return "Vagabundische Kultur" + super.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    public boolean hatOptimatischeVariante() {
        return false;
    }
}

