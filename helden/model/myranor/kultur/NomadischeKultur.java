/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.model.myranor.kultur.BasisMyranorKultur;
import helden.model.myranor.profession.Akrobat;
import helden.model.myranor.profession.Athlet;
import helden.model.myranor.profession.Aygon;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Falschgesicht;
import helden.model.myranor.profession.Handwerker;
import helden.model.myranor.profession.Heiler;
import helden.model.myranor.profession.Jaeger;
import helden.model.myranor.profession.Leibwaechter;
import helden.model.myranor.profession.LeonirAnimist;
import helden.model.myranor.profession.Lichtweberin;
import helden.model.myranor.profession.Matrose;
import helden.model.myranor.profession.Medizinmann;
import helden.model.myranor.profession.Monddeuter;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Sammler;
import helden.model.myranor.profession.Schankdiener;
import helden.model.myranor.profession.Schreiber;
import helden.model.myranor.profession.Schwerstarbeiter;
import helden.model.myranor.profession.Sherkumar;
import helden.model.myranor.profession.Stammespriester;
import helden.model.myranor.profession.Sternensaenger;
import helden.model.myranor.profession.Verkuender;
import helden.model.myranor.profession.Viehtreiber;
import helden.model.myranor.profession.Wanderhaendler;
import helden.model.myranor.profession.Wanderprediger;
import helden.model.myranor.profession.Wildniskrieger;
import helden.model.myranor.profession.Zharzhuri;
import java.util.ArrayList;

public class NomadischeKultur
extends BasisMyranorKultur {
    public NomadischeKultur() {
    }

    public NomadischeKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Reiten"), 3);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000(I.ifif.toString(), new Object[]{"Sicht"}));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000(I.privatesuper));
        arrayList.add(K.o00000(I.\u00d8O\u00d2000));
        arrayList.add(K.o00000("Tierfreund"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Neugier"));
        arrayList.add(K.o00000("Raumangst"));
        arrayList.add(K.o00000("Verpflichtungen"));
        arrayList.add(K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K190";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public void setAuswahlen() {
        Object object;
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Raufen"));
        arrayList.add(N.floatsuper().\u00d200000("Ringen"));
        int[] nArray = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Athletik"));
        arrayList.add(N.floatsuper().\u00d200000("Freies Fliegen"));
        arrayList.add(N.floatsuper().\u00d200000("Klettern"));
        arrayList.add(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Reiten"));
        arrayList.add(N.floatsuper().\u00d200000("Schleichen"));
        arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
        arrayList.add(N.floatsuper().\u00d200000("Selbstbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verstecken"));
        arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
        arrayList.add(N.floatsuper().\u00d200000("Skifahren"));
        arrayList.add(voidsuper.returnwhileObject);
        int[] nArray2 = new int[]{3, 2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Geografie"));
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Heraldik"));
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Sch\u00e4tzen"));
        arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray3 = new int[]{2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
        arrayList.add(N.floatsuper().\u00d200000("Bogenbau"));
        arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
        arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
        arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
        arrayList.add(N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Kartografie"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Stellmacher"));
        arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        int[] nArray4 = new int[]{3, 2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        for (voidsuper object22 : N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
            if (!(object22 instanceof E) || !((E)(object = (E)object22)).getKategorie(false).equals(s_0.o00000)) continue;
            arrayList.add((oo0o_0)object);
        }
        Object object3 = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, (int[])object3));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        arrayList.remove(this.getMuttersprache());
        int[] nArray5 = new int[]{5};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000));
        object = new int[]{3, 2, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, (int[])object));
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Athlet(this.getGeschlecht(), g2, g3));
        arrayList.add(new Leibwaechter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wildniskrieger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Matrose(this.getGeschlecht(), g2, g3));
        arrayList.add(new Reiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sammler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Viehtreiber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Akrobat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Verkuender(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Heiler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schankdiener(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schreiber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schwerstarbeiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Stammespriester(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderprediger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Aygon(this.getGeschlecht(), g2, g3));
        arrayList.add(new BaLoa(this.getGeschlecht(), g2, g3));
        arrayList.add(new Falschgesicht(this.getGeschlecht(), g2, g3));
        arrayList.add(new Lichtweberin(this.getGeschlecht(), g2, g3));
        arrayList.add(new Medizinmann(this.getGeschlecht(), g2, g3));
        arrayList.add(new Monddeuter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sherkumar(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sternensaenger(this.getGeschlecht(), g2, g3));
        arrayList.add(new LeonirAnimist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Zharzhuri(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Nomadische Kultur" + super.toString();
        }
        return "Nomadische Kultur" + super.toString();
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

