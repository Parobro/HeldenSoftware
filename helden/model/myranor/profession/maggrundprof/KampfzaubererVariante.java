/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class KampfzaubererVariante
extends MagieVarianten {
    public KampfzaubererVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(b_0.\u00f4\u00f4\u00d2000, (Integer)12), Bedingung.hat(b_0.returnwhilesuper, (Integer)12));
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Explosion"));
        arrayList.add(oooo_0.o00000("Instruktion", "Fixierung"));
        arrayList.add(oooo_0.o00000("Instruktion", "Schadenszauber"));
        arrayList.add(oooo_0.o00000("Instruktion", "Schutz vor Quelle"));
        arrayList.add(oooo_0.o00000("Aufmerksamkeit"));
        arrayList.add(oooo_0.o00000("Konzentrationsst\u00e4rke"));
        arrayList.add(oooo_0.o00000("Verbotene Pforten"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("Bastardst\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Speere"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 1);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:(Un-)Element", 7);
        this.addWC(oooo_02, "HE:Carafai", 7);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.add(o00O.\u00d2\u00d50000);
        arrayList2.add(o00O.\u00f8O0000);
        arrayList2.addAll(o00O.\u00f400000());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 5);
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(2, this);
        arrayList.add(oooo_02);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.beliebigeQuelle(oooo_02, 4, 3);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 200;
    }
}

