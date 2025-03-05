/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.sammler;

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

public class SammlerVariante
extends N {
    public SammlerVariante() {
        super("Sammler", "Sammlerin", 0, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Herausragender Sinn"));
        arrayList.add(K.o00000("Richtungssinn"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 10;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 10;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Bergbau"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("F\u00e4hrtensuchen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fallen stellen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fleischer"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geschichtswissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gesteinskunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("H\u00fcttenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechtskunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wettervorhersage"));
                return new returnsuper(this.getProfession(), arrayList, 45, 5);
            }
        }
        throw new c_1();
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
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                int[] nArray = new int[]{3};
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
                Object object = new int[]{3};
                return new m_0(arrayList, (int[])object);
            }
            case 4: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sch\u00e4tzen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"), 3);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

