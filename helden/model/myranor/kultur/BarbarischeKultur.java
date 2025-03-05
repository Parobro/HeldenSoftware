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
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Falschgesicht;
import helden.model.myranor.profession.Handwerker;
import helden.model.myranor.profession.Heiler;
import helden.model.myranor.profession.Jaeger;
import helden.model.myranor.profession.LeonirAnimist;
import helden.model.myranor.profession.Matrose;
import helden.model.myranor.profession.Medizinmann;
import helden.model.myranor.profession.MinotaurenAnimist;
import helden.model.myranor.profession.Monddeuter;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Saithakenner;
import helden.model.myranor.profession.Saithyar;
import helden.model.myranor.profession.Sammler;
import helden.model.myranor.profession.Satudur;
import helden.model.myranor.profession.Schankdiener;
import helden.model.myranor.profession.Schwerstarbeiter;
import helden.model.myranor.profession.Shanwada;
import helden.model.myranor.profession.Sherkumar;
import helden.model.myranor.profession.Shurhokach;
import helden.model.myranor.profession.Stammespriester;
import helden.model.myranor.profession.Sternensaenger;
import helden.model.myranor.profession.Taucher;
import helden.model.myranor.profession.Verkuender;
import helden.model.myranor.profession.Wanderhaendler;
import helden.model.myranor.profession.Wanderprediger;
import helden.model.myranor.profession.Weihertaenzer;
import helden.model.myranor.profession.Wildniskrieger;
import helden.model.myranor.profession.Windfluesterer;
import helden.model.myranor.profession.Yachzuq;
import java.util.ArrayList;

public class BarbarischeKultur
extends BasisMyranorKultur {
    public BarbarischeKultur() {
    }

    public BarbarischeKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Hitzeresistenz"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("K\u00e4lteresistenz"));
        arrayList.add(K.o00000("Resistenz gegen Krankheiten"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Barbarische Sitten"));
        arrayList.add(K.o00000("Verpflichtungen"));
        arrayList.add(K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K186";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Raufen"));
        arrayList.add(N.floatsuper().\u00d200000("Ringen"));
        int[] nArray = new int[]{2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Athletik"));
        arrayList.add(N.floatsuper().\u00d200000("Freies Fliegen"));
        arrayList.add(N.floatsuper().\u00d200000("Klettern"));
        arrayList.add(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Reiten"));
        arrayList.add(N.floatsuper().\u00d200000("Schleichen"));
        arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verstecken"));
        arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
        arrayList.add(N.floatsuper().\u00d200000("Skifahren"));
        arrayList.add(N.floatsuper().\u00d200000("Zechen"));
        int[] nArray2 = new int[]{2, 2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray3 = new int[]{2};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
        arrayList.add(N.floatsuper().\u00d200000("Bogenbau"));
        arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
        arrayList.add(N.floatsuper().\u00d200000("Brauer"));
        arrayList.add(N.floatsuper().\u00d200000("Feuersteinbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
        arrayList.add(N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
        arrayList.add(N.floatsuper().\u00d200000("Grobschmied"));
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(voidsuper.ififObject);
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
        int[] nArray4 = new int[]{2, 2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        for (voidsuper object2 : N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
            E e;
            if (!(object2 instanceof E) || !(e = (E)object2).getKategorie(false).equals(s_0.o00000)) continue;
            arrayList.add(e);
        }
        Object object3 = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, (int[])object3));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000));
        int[] nArray5 = new int[]{3, 2, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Athlet(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wildniskrieger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Matrose(this.getGeschlecht(), g2, g3));
        arrayList.add(new Reiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sammler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Taucher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Akrobat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Verkuender(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Heiler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schankdiener(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schwerstarbeiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Stammespriester(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderprediger(this.getGeschlecht(), g2, g3));
        arrayList.add(new BaLoa(this.getGeschlecht(), g2, g3));
        arrayList.add(new Falschgesicht(this.getGeschlecht(), g2, g3));
        arrayList.add(new MinotaurenAnimist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Medizinmann(this.getGeschlecht(), g2, g3));
        arrayList.add(new Monddeuter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Weihertaenzer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Saithakenner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Saithyar(this.getGeschlecht(), g2, g3));
        arrayList.add(new Satudur(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shanwada(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sherkumar(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shurhokach(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sternensaenger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Windfluesterer(this.getGeschlecht(), g2, g3));
        arrayList.add(new LeonirAnimist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Yachzuq(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Barbarische Kultur" + super.toString();
        }
        return "Barbarische Kultur" + super.toString();
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

