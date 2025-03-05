/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.schiffskaempfer;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class SchiffskaempferVariante
extends N {
    public SchiffskaempferVariante() {
        super("Schiffsk\u00e4mpfer", "Schiffsk\u00e4mpferin", 0, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 9;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Balance"));
        arrayList.add(K.o00000("Herausragende Balance"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Gesucht"));
        arrayList.add(K.o00000("Goldgier"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("LeP"), 1);
        k_02.o00000(b_0.void("AuP"), 1);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Luftkundig"));
                arrayList.add(oooo_0.o00000(P.\u00d60\u00f8000));
                arrayList.add(oooo_0.o00000(P.\u00d3\u00d6\u00d3000));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Standfest"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Hiebwaffen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Speere"));
                int[] nArray = new int[]{5, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Bela"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Belagerungswaffen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfbeile"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfmesser"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{4, 2, 2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fesseln/Entfesseln"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fischen/Angeln"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wettervorhersage"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Seefahrt"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Flugger\u00e4te steuern"));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Mechanik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schneidern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Seiler"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sternkunde"));
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 8: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Kriegskunst"), 2);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

