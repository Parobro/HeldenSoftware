/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OOoO.A;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.MyranischerZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class VerwandlungszaubererVariante
extends MagieVarianten {
    public VerwandlungszaubererVariante(String string, String string2, int n, boolean bl) {
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
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KO"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Antimagie"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Fixierung"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", A.\u00d400000.toString()));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Infektion"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Reinigung"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Transformation"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.remove(voidsuper.\u00d5\u00d3\u00d8000);
                arrayList.remove(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.remove(voidsuper.o\u00d5\u00d6000);
                arrayList.remove(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.remove(voidsuper.\u00d4\u00f6\u00d6000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.remove(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.removeAll(this.getProfession().getGewaehlteTalente());
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hiebwaffen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Abrichten"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        b_0 b_02;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.add(o00O.super);
        arrayList2.add(o00O.\u00f6o0000);
        this.addZauber(oooo_02, arrayList2, L.o00000, 7, true);
        this.removeGewaehlte(oooo_02);
        oooo_0 oooo_03 = oooo_02;
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (b_0 object : oooo_03.\u00d200000()) {
            ZauberMitWertUndHZ zauberMitWertUndHZ = (ZauberMitWertUndHZ)object.Object().get(0);
            b_02 = new b_0((Object)K.new(zauberMitWertUndHZ.getZauber(), A.\u00f5O0000.toString(), true), Bedingung.hat(zauberMitWertUndHZ.getZauber(), (Integer)7));
            oooo_02.o00000(b_02);
            b_02 = new b_0((Object)K.new(zauberMitWertUndHZ.getZauber(), A.Oo0000.toString(), true), Bedingung.hat(zauberMitWertUndHZ.getZauber(), (Integer)7));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.\u00f400000());
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.add(o00O.OO0000);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            b_02 = new b_0((Object)for.o00000(K.o00000(myranischerZauber, A.\u00f5O0000.toString())).get(0));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            b_02 = new b_0((Object)for.o00000(K.o00000(myranischerZauber, A.Oo0000.toString())).get(0));
            oooo_02.o00000(b_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Automatische Mitverwandlung"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 250;
    }
}

