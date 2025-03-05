/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.jaeger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public class JaegerVariante
extends N {
    public JaegerVariante() {
        super("J\u00e4ger", "J\u00e4gerin", 0, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 8;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("D\u00e4mmerungssicht"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Flink"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Herausragender Sinn"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Raumangst"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 10;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
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
        k_02.o00000(b_0.void("AuP"), 2);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getSetting().getGelaendekunden());
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schleichen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verstecken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{5, 3, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fallen stellen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fischen/Angeln"));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Abrichten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Bogenbau"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fleischer"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Feuersteinbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schneidern"));
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                for (voidsuper voidsuper2 : helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000)) {
                    E e;
                    if (!(voidsuper2 instanceof E) || !(e = (E)voidsuper2).getKategorie(false).equals(s_0.o00000)) continue;
                    arrayList.add(e);
                }
                Object object = new int[]{4};
                return new m_0(arrayList, (int[])object);
            }
            case 7: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 6);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wettervorhersage"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"), 5);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                arrayList.addAll(this.getProfession().getSetting().getvSF(while.\u00f6\u00d5\u00d2000.toString()));
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

