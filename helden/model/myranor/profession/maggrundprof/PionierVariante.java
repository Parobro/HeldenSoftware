/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class PionierVariante
extends MagieVarianten {
    public PionierVariante() {
        super("Pionier/Wildniskundiger", "Pionier/Wildniskundiger", 0, false);
    }

    public PionierVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 11;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Raumangst"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 11;
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
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Ringen"));
                arrayList.add(N.floatsuper().\u00d200000("Raufen"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Bastardst\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Dolche"));
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Speere"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Bogen"));
                arrayList.add(N.floatsuper().\u00d200000("Bela"));
                arrayList.add(N.floatsuper().\u00d200000("Wurfspeere"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(N.floatsuper().\u00d200000("Fallen stellen"));
                arrayList.add(N.floatsuper().\u00d200000("Fischen/Angeln"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(N.floatsuper().\u00d200000("Gesteinskunde"));
                arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 8: {
                arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 9: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 10: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wettervorhersage"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Holzbearbeitung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kochen"), 2);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                ArrayList<P> arrayList2 = this.getProfession().getSetting().getGelaendekunden();
                for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                    arrayList.add(new for(P.new(arrayList2.get(i2).toString())));
                }
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

