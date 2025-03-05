/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.makshamant;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.OoOO.A;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_6;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class MakshamantVariante
extends helden.framework.int.N {
    private boolean Oo\u00f5O00 = true;

    public MakshamantVariante() {
        super("Makshamant", "Makshamant", 14, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Verbindungen"));
        arrayList.add(K.o00000("Autorit\u00e4tsgl\u00e4ubig"));
        arrayList.add(K.o00000("Eitelkeit"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.Oo\u00f5O00 = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(voidsuper.newnewObject, 2));
        arrayList.add(new interface(voidsuper.\u00d4\u00d8\u00d6000, 2));
        arrayList.add(new interface(voidsuper.privateObjectObject, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatSfAuswahl(while.\u00d2o\u00f5000, "Bansumiter"));
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.returnintclass));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d2\u00d6000));
        A a2 = (A)oooo_0.o00000(while.\u00d2o\u00d2000);
        a2.new(new R("Makshamantim"));
        arrayList.add(a2);
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.add(voidsuper.oo\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
                int[] nArray = new int[]{2, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.remove(voidsuper.\u00d3\u00f4\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gaukeleien"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 2);
        k_02.\u00d200000(G.ifwhileString, 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.Oo\u00f5O00;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

