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
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class ZaubertaenzerVariante
extends MagieVarianten {
    public ZaubertaenzerVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Balance"));
        arrayList.add(K.o00000("Gutaussehend"));
        arrayList.add(K.o00000("Schlangenmensch"));
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Eitelkeit"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Geistillusion"));
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Verh\u00fcllung"));
        arrayList.add(oooo_0.o00000("Ausweichen I"));
        arrayList.add(oooo_0.o00000("Standfest"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bet\u00f6ren"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Musizieren"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schneidern"), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Ausweichen II"));
        arrayList.addAll(for.\u00d200000("Ausweichen III"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

