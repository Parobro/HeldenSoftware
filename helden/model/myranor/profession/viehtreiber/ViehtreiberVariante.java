/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.viehtreiber;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public class ViehtreiberVariante
extends N {
    public ViehtreiberVariante() {
        super("Viehtreiber", "Viehtreiberin", 0, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Tierfreund"));
        arrayList.add(K.o00000("Raumangst"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 10;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 11;
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
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fahrzeug lenken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Flugger\u00e4te steuern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Handel"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sch\u00e4tzen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schrift der Muttersprache"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"));
                return new returnsuper(this.getProfession(), arrayList, 10, 3);
            }
        }
        throw new c_1();
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getProfession().getSetting().getGelaendekunden());
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
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Skifahren"));
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fleischer"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{5, 2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                for (voidsuper voidsuper2 : helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
                    E e;
                    if (voidsuper2 instanceof E && (e = (E)voidsuper2).getKategorie(false).equals(s_0.o00000)) {
                        arrayList.add(e);
                    }
                    arrayList.remove(E.nullsuperString);
                    arrayList.remove(E.\u00f4\u00d6\u00d8000);
                }
                Object object = new int[]{3, 1};
                return new m_0(arrayList, (int[])object);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Schleichen"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Abrichten"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Viehzucht"), 6);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

