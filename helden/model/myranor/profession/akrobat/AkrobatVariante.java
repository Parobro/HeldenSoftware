/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.akrobat;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class AkrobatVariante
extends N {
    public AkrobatVariante() {
        super("Akrobat", "Akrobatin", 0, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Beidh\u00e4ndig"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Gl\u00fcck"));
        arrayList.add(K.o00000("Schlangenmensch"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 10;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 14;
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
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Ausweichen I"));
        arrayList.add(oooo_0.o00000("Standfest"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfbeile"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfmesser"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verstecken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Singen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gassenwissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schauspielerei"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sch\u00e4tzen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Abrichten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fahrzeug lenken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Flugger\u00e4te steuern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schneidern"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4, 2};
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
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Akrobatik"), 7);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 7);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Aufmerksamkeit"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

