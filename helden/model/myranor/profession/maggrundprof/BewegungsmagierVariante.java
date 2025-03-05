/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class BewegungsmagierVariante
extends MagieVarianten {
    public BewegungsmagierVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Fixierung"));
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
        arrayList.add(oooo_0.o00000("Instruktion", "Objektbewegung"));
        arrayList.add(oooo_0.o00000("Instruktion", "\u00dcber Element gehen"));
        arrayList.add(oooo_0.o00000("Apport"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.remove(voidsuper.nullObjectObject);
                arrayList.remove(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.remove(voidsuper.\u00d3\u00d6\u00d5000);
                arrayList.removeAll(this.getProfession().getGewaehlteTalente());
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(N.floatsuper().\u00d200000("Handel"));
                arrayList.add(N.floatsuper().\u00d200000("Seefahrt"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:(Un-)Element", 7);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:(Un-)Element", 6);
        this.addWC(oooo_02, "W:(Un-)Element", 5);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:(Un-)Element", 5);
        this.addWC(oooo_02, "W:(Un-)Element", 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:(Un-)Element", 4);
        this.addWC(oooo_02, "W:(Un-)Element", 3);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.beliebigeQuelle(oooo_02, 4, 3);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        for (P p2 : this.getSetting().getGelaendekunden()) {
            arrayList.addAll(for.o00000(p2));
        }
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

