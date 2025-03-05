/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.gossenschlaeger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.E;
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

public class GossenschlaegerVariante
extends N {
    public GossenschlaegerVariante() {
        super("Gossenschl\u00e4ger", "Gossenschl\u00e4gerin", 0, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Beidh\u00e4ndig"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Goldgier"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 12;
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
        k_02.o00000(b_0.void("LeP"), 1);
        k_02.o00000(b_0.void("AuP"), 2);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Ausweichen I"));
                arrayList.add(oooo_0.o00000("Linkhand"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Meisterparade"));
                arrayList.add(oooo_0.o00000("Finte"));
                arrayList.add(oooo_0.o00000("Wuchtschlag"));
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
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gassenwissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"));
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000));
                arrayList.remove(voidsuper.\u00d4\u00d2\u00d8000);
                arrayList.remove(voidsuper.\u00d4\u00f8\u00d5000);
                int[] nArray = new int[]{2, 2, 1, 1, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.\u00d5\u00d5\u00d6000);
                int[] nArray = new int[]{2, 1, 1, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000));
                arrayList.remove(E.\u00f4\u00d6\u00d8000);
                arrayList.remove(E.newnewString);
                int[] nArray = new int[]{5, 4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                arrayList.addAll(for.\u00d200000("Ausweichen I"));
                arrayList.addAll(for.\u00d200000("Linkhand"));
                return new void(this.getProfession(), arrayList, 1);
            }
            case 1: {
                arrayList.addAll(for.\u00d200000("Meisterparade"));
                arrayList.addAll(for.\u00d200000("Finte"));
                arrayList.addAll(for.\u00d200000("Wuchtschlag"));
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

