/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.wildniskrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class WildniskriegerVariante
extends N {
    public WildniskriegerVariante() {
        super("Wildniskrieger", "Wildniskriegerin", 10, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 10;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("D\u00e4mmerungssicht"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Flink"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Herausragender Sinn"));
        arrayList.add(K.o00000("Hitzeresistenz"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("K\u00e4lteresistenz"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Tierempathie (alle)"));
        arrayList.add(K.o00000("Tierempathie (speziell)"));
        arrayList.add(K.o00000("Tierfreund"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Beh\u00e4big"));
        arrayList.add(K.o00000("Blutrausch"));
        arrayList.add(K.o00000("Raumangst"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 9;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("LeP"), 2);
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getProfession().getSetting().getSF("Scharfsch\u00fctze"));
                arrayList.add(oooo_0.o00000("Ausweichen I"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getProfession().getSetting().getGelaendekunden());
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Aufmerksamkeit"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"));
                int[] nArray = new int[]{5, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schleichen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verstecken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{4, 2, 1, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("F\u00e4hrtensuchen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"));
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fallen stellen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fischen/Angeln"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wettervorhersage"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Abrichten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Bogenbau"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fleischer"));
                arrayList.add(voidsuper.Oo\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Feuersteinbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schneidern"));
                int[] nArray = new int[]{3, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 8: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 9: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"));
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                arrayList.addAll(for.\u00d200000("Ausweichen II"));
                arrayList.addAll(for.\u00d200000("Berittener Sch\u00fctze"));
                arrayList.addAll(for.\u00d200000("Finte"));
                arrayList.addAll(for.\u00d200000("Meisterparade"));
                arrayList.addAll(for.\u00d200000("Reiterkampf"));
                arrayList.addAll(for.\u00d200000("Wuchtschlag"));
                return new void(this.getProfession(), arrayList, 1);
            }
            case 1: {
                arrayList.addAll(this.getProfession().getSetting().getvSF("Meistersch\u00fctze"));
                arrayList.addAll(for.\u00d200000("Kampfreflexe"));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        return super.getVerbilligteSonderfertigkeitAuswahl(n);
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

