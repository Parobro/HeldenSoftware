/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class HeilerVariante
extends MagieVarianten {
    public HeilerVariante(String string, String string2, int n, boolean bl) {
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
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    public ArrayList<oooo_0> getAuswahlenFuerHZ() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:Elementar (Humus)", 7);
        this.addWC(oooo_02, "HE:Khalyanar", 7);
        this.addWC(oooo_02, "HE:Mishkarya", 7);
        this.addWC(oooo_02, "HE:Wahnsinn", 7);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Elementar (Humus)", 5);
        this.addWC(oooo_02, "E:Khalyanar", 5);
        this.addWC(oooo_02, "E:Mishkarya", 5);
        this.addWC(oooo_02, "E:Wahnsinn", 5);
        arrayList.removeAll(this.getProfession().getGewaehlteTalente());
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Harmonie", 4);
        this.addWC(oooo_02, "E:Darcalya", 4);
        this.addWC(oooo_02, "E:Kraft", 3);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addZauber(oooo_02, o00O.\u00f400000(), L.\u00d500000, 3);
        this.addZauber(oooo_02, o00O.\u00f400000(), L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.beliebigeQuelle(oooo_02, 4, 3);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5OO000);
        arrayList.add(I.\u00f4Oo000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.while);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Infektion"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verwandlung"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(helden.framework.d.oooo_0.o00000(voidsuper.\u00f4\u00d5\u00d6000));
                arrayList.addAll(helden.framework.d.oooo_0.o00000(voidsuper.\u00f5\u00f5\u00d6000));
                arrayList.addAll(helden.framework.d.oooo_0.o00000(voidsuper.StringObjectObject));
                arrayList.addAll(helden.framework.d.oooo_0.o00000(voidsuper.\u00d5\u00d5\u00d6000));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Heilung/Wiederherstellung"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Reinigung"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(N.floatsuper().\u00d200000("Ringen"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Alchimie"));
                arrayList.add(N.floatsuper().\u00d200000("Kochen"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Seele"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                int[] nArray = new int[]{6, 4, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zechen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 2);
        return k_02;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<public> arrayList = new ArrayList<public>(4);
                arrayList.add(K.o00000(I.o\u00f4o000));
                M m = (M)K.o00000(I.\u00d5\u00d50000);
                for (public public_ : m.\u00f4\u00d20000()) {
                    if (public_.supersuper() != 7) continue;
                    arrayList.add(public_);
                }
                return new o00o_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

