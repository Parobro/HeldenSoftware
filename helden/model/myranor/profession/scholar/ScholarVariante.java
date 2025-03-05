/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.scholar;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public class ScholarVariante
extends N {
    public ScholarVariante() {
        super("Scholar", "Scholarin", 0, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Breitgef\u00e4cherte Bildung"));
        arrayList.add(K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schriftlicher Ausdruck"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberzeugen"));
                int[] nArray = new int[]{5, 3, 2, 2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                for (voidsuper voidsuper2 : helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
                    E e;
                    if (!(voidsuper2 instanceof E) || !(e = (E)voidsuper2).getKategorie(false).equals(s_0.o00000)) continue;
                    arrayList.add(e);
                }
                Object object = new int[]{2};
                return new m_0(arrayList, (int[])object);
            }
            case 3: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{8, 6};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{8, 4};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Alchimie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Drucker"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Feinmechanik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Handel"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Seele"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kartografie"));
                int[] nArray = new int[]{7, 5, 5, 4, 4, 4, 3, 3, 3, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(this.getProfession().getMuttersprache(), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Akademische Ausbildung (Gelehrter)"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

