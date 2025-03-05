/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Baliho2
extends BasisKrieger {
    public Baliho2() {
        super("Baliho", 27);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KK"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Reiterkampf"));
        arrayList.add(oooo_0.o00000("Turnierreiterei"));
        arrayList.remove(oooo_0.o00000("Schildkampf I"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hiebwaffen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kettenwaffen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lanzenreiten"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schwerter"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Reiten"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), -2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zechen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Abrichten"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lederarbeiten"), 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Kriegsreiterei"));
        arrayList.addAll(for.\u00d200000("Niederwerfen"));
        arrayList.addAll(for.\u00d200000("Schildkampf I"));
        arrayList.addAll(for.\u00d200000("Turnierreiterei"));
        arrayList.addAll(for.\u00d200000("Wuchtschlag"));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Akademie 'Schwert und Schild' zu Baliho (2)";
    }
}

