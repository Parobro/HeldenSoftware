/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.stammespriester;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.E;
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
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public class StammespriesterVariante
extends N {
    public StammespriesterVariante() {
        super("Stammespriester", "Stammespriesterin", 0, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 9;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(K.o00000("Karmatiker"));
        arrayList.add(K.o00000("Prophezeien"));
        arrayList.add(K.o00000("Viertelzauberer"));
        arrayList.add(K.o00000("Aberglaube"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d2\u00d6o000));
                arrayList.add(oooo_0.o00000(while.o\u00f8\u00f5000));
                arrayList.addAll(this.getProfession().getSetting().getGelaendekunden());
                arrayList.addAll(this.getSetting().getSF(while.\u00d3\u00d40000.toString()));
                arrayList.addAll(this.getSetting().getSF(while.\u00d30\u00d2000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(oooo_0.o00000(voidsuper.\u00d5\u00d5\u00d6000));
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
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Singen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("F\u00e4hrtensuchen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fallen stellen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wettervorhersage"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                for (voidsuper voidsuper2 : helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
                    E e;
                    if (!(voidsuper2 instanceof E) || !(e = (E)voidsuper2).getKategorie(false).equals(s_0.o00000)) continue;
                    arrayList.add(e);
                }
                arrayList.remove(E.nullsuperString);
                Object object = new int[]{3};
                return new m_0(arrayList, (int[])object);
            }
            case 6: {
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
                arrayList.add(voidsuper.StringObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                int[] nArray = new int[]{4, 2, 2, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 8: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper));
                arrayList.remove(voidsuper.\u00d8\u00d5\u00d6000);
                arrayList.remove(voidsuper.thisinterfaceObject);
                arrayList.remove(voidsuper.StringclassObject);
                int[] nArray = new int[]{2};
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
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberzeugen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 6);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"), 6);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

