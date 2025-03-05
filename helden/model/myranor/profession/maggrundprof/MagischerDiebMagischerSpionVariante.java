/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class MagischerDiebMagischerSpionVariante
extends MagieVarianten {
    public MagischerDiebMagischerSpionVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Verh\u00fcllte Aura"));
        arrayList.add(K.o00000("Zeitgef\u00fchl"));
        arrayList.add(K.o00000("Goldgier"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)13), Bedingung.hat(b_0.O\u00f5\u00d2000, (Integer)13));
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Illusion"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kommunikation"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verwandlung"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Objektbewegung"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kommunikation"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Hellsicht"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Wesen"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Geistillusion"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verh\u00fcllung"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(N.floatsuper().\u00d200000("Ringen"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(N.floatsuper().\u00d200000("Klettern"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Bet\u00f6ren"));
                arrayList.add(N.floatsuper().\u00d200000("Etikette"));
                arrayList.add(N.floatsuper().\u00d200000("Gassenwissen"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5, 5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schleichen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verstecken"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Taschendiebstahl"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schl\u00f6sser knacken"), 4);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:Erfolg", 7);
        this.addWC(oooo_02, "HE:Erkenntnis", 7);
        this.addWC(oooo_02, "HE:Xolovar", 7);
        this.addWC(oooo_02, "HE:Iryabaar", 7);
        this.addWC(oooo_02, "HE:Elementar (Erz)", 7);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.add(o00O.\u00f4\u00d30000);
        arrayList2.add(o00O.O\u00d20000);
        arrayList2.add(o00O.\u00f4\u00d20000);
        arrayList2.add(o00O.\u00d8\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(3, this);
        arrayList.add(oooo_02);
        arrayList2.addAll(o00O.\u00f400000());
        arrayList2.add(o00O.\u00f4\u00d30000);
        arrayList2.add(o00O.O\u00d20000);
        arrayList2.add(o00O.\u00f4\u00d20000);
        arrayList2.add(o00O.\u00d8\u00d30000);
        arrayList2.add(o00O.\u00f8\u00d30000);
        arrayList2.add(o00O.class);
        arrayList2.add(o00O.supernew);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Eiserner Wille I"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 200;
    }
}

