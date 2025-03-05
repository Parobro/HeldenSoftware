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
import helden.model.myranor.profession.Gossenschlaeger;
import helden.model.myranor.profession.Haendler;
import helden.model.myranor.profession.Handwerker;
import helden.model.myranor.profession.Heiler;
import helden.model.myranor.profession.Makshamant;
import helden.model.myranor.profession.MinotaurenAnimist;
import helden.model.myranor.profession.Optimat;
import helden.model.myranor.profession.Ordnungshueter;
import helden.model.myranor.profession.Runenmeister;
import helden.model.myranor.profession.Sadhaka;
import helden.model.myranor.profession.Saithakenner;
import helden.model.myranor.profession.Satudur;
import helden.model.myranor.profession.Schankdiener;
import helden.model.myranor.profession.Schreiber;
import helden.model.myranor.profession.Schwerstarbeiter;
import helden.model.myranor.profession.Shanwada;
import helden.model.myranor.profession.Shindramatha;
import helden.model.myranor.profession.SibylleMantiker;
import helden.model.myranor.profession.Soldaten;
import helden.model.myranor.profession.Streuner;
import helden.model.myranor.profession.UnabhaengigerMagier;
import helden.model.myranor.profession.Verkuender;
import helden.model.myranor.profession.Wildniskrieger;
import java.util.ArrayList;

public class BaeuerlicheKultur
extends BasisMyranorKultur {
    public BaeuerlicheKultur() {
    }

    public BaeuerlicheKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void setAuswahlen() {
        this.\u00f5o0O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Raufen"));
        arrayList.add(N.floatsuper().\u00d200000("Ringen"));
        int[] nArray = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Athletik"));
        arrayList.add(N.floatsuper().\u00d200000("Klettern"));
        arrayList.add(N.floatsuper().\u00d200000("Selbstbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
        arrayList.add(N.floatsuper().\u00d200000("Zechen"));
        int[] nArray2 = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Etikette"));
        arrayList.add(N.floatsuper().\u00d200000("Lehren"));
        arrayList.add(N.floatsuper().\u00d200000("Menschenkenntnis"));
        arrayList.add(N.floatsuper().\u00d200000("\u00dcberreden"));
        int[] nArray3 = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray4 = new int[]{3, 2, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
        arrayList.add(N.floatsuper().\u00d200000("Ackerbau"));
        arrayList.add(N.floatsuper().\u00d200000("Brauer"));
        arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
        arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
        arrayList.add(N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
        arrayList.add(N.floatsuper().\u00d200000("Grobschmied"));
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
        arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Seiler"));
        arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        arrayList.add(N.floatsuper().\u00d200000("Webkunst"));
        arrayList.add(N.floatsuper().\u00d200000("Zimmermann"));
        int[] nArray5 = new int[]{3, 2, 2, 1, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000));
        int[] nArray6 = new int[]{2, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray6));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        arrayList.remove(this.getMuttersprache());
        int[] nArray7 = new int[]{4};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray7));
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Tierfreund"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Unfrei"));
        arrayList.add(K.o00000("Untertan"));
        arrayList.add(K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K187";
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
        arrayList.add(new Gossenschlaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Ordnungshueter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldaten(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wildniskrieger(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.add(new Akrobat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Verkuender(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Heiler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schankdiener(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schreiber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schwerstarbeiter(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getMyranorProfessionenPriester(this.getGeschlecht(), g2, g3));
        arrayList.add(new MinotaurenAnimist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Makshamant(this.getGeschlecht(), g2, g3));
        arrayList.add(new Optimat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Runenmeister(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sadhaka(this.getGeschlecht(), g2, g3));
        arrayList.add(new Saithakenner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Satudur(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shanwada(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shindramatha(this.getGeschlecht(), g2, g3));
        arrayList.add(new SibylleMantiker(this.getGeschlecht(), g2, g3));
        arrayList.add(new UnabhaengigerMagier(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "B\u00e4uerliche Kultur" + super.toString();
        }
        return "B\u00e4uerliche Kultur" + super.toString();
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

