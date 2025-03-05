/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.handwerker;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.Geschlecht;
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
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public class HandwerkerVariante
extends N {
    private voidsuper oo\u00f5O00;

    public HandwerkerVariante(voidsuper voidsuper2) {
        super("Handwerker", "Handwerkerin", 0, false);
        this.oo\u00f5O00 = voidsuper2;
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.oo\u00f5O00.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.\u00d5o0000);
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Verpflichtungen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 10;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
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
                arrayList.addAll(oooo_0.o00000(this.oo\u00f5O00));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Meister der Improvisation"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
                int[] nArray = new int[]{3, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Singen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gassenwissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberzeugen"));
                int[] nArray = new int[]{3, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                int[] nArray = new int[]{5, 5, 3, 3, 3, 3, 3};
                return new m_0(arrayList, nArray, "Hilfs- oder verwandte Talente");
            }
            case 5: {
                for (voidsuper voidsuper2 : helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000)) {
                    E e;
                    if (!(voidsuper2 instanceof E) || !(e = (E)voidsuper2).getKategorie(false).equals(s_0.o00000)) continue;
                    arrayList.add(e);
                }
                Object object = new int[]{2};
                return new m_0(arrayList, (int[])object);
            }
            case 6: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechtskunde"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sch\u00e4tzen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Handel"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Hauswirtschaft"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(this.oo\u00f5O00, 7);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                for (P p2 : oooo_0.o00000(this.oo\u00f5O00)) {
                    arrayList.addAll(for.o00000(p2));
                }
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        return super.getVerbilligteSonderfertigkeitAuswahl(n);
    }

    @Override
    public String toString() {
        return this.oo\u00f5O00.toString();
    }
}

