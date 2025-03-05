/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class MagischerKaempferVariante
extends MagieVarianten {
    public MagischerKaempferVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
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
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Eisenaffine Aura"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Talentschub"));
        arrayList.add(K.o00000("Kr\u00e4fteschub"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Blutrausch"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
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
                arrayList.add(oooo_0.o00000("Wuchtschlag"));
                arrayList.add(oooo_0.o00000("Finte"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Aufmerksamkeit"));
        arrayList.add(oooo_0.o00000("Ausweichen I"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(N.floatsuper().\u00d200000("Ringen"));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Bastardst\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Fechtwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("Speere"));
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Zweihandhiebwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"));
                int[] nArray = new int[]{6, 5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Wurfbeile"));
                arrayList.add(N.floatsuper().\u00d200000("Wurfmesser"));
                arrayList.add(N.floatsuper().\u00d200000("Wurfspeere"));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(N.floatsuper().\u00d200000("Sich verstecken"));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(N.floatsuper().\u00d200000("Schleichen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
                arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
                arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00d2\u00d3\u00f6000.toString())) {
            arrayList.addAll(for.\u00d200000("Wuchtschlag"));
        } else {
            arrayList.addAll(for.\u00d200000("Finte"));
        }
        arrayList.addAll(for.\u00d200000("Kampfreflexe"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

