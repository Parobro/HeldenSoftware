/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.lehrmeister.DeveronElgarstynBase;
import java.util.ArrayList;

public class DeveronElgarstynSchatten
extends DeveronElgarstynBase {
    public DeveronElgarstynSchatten() {
        super("Anw\u00e4rter der Schatten", "Anw\u00e4rterin der Schatten", 24, false);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("f\u00fcnf geschw\u00e4rzte und besonders hochwertige Borndorne (TP +1 in Nah- und Fernkampf, BF-3");
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("GE"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Finte"));
        arrayList.add(oooo_0.o00000("Gezielter Stich"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wurfmesser"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Klettern"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schleichen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 1);
        k_02.\u00d200000(this.getZauber("Blick in die Gedanken"), 3);
        k_02.\u00d200000(this.getZauber("Sensattacco"), 4);
        k_02.\u00d200000(this.getZauber("Armatrutz"), 4);
        k_02.\u00d200000(this.getZauber("Tlalucs Odem"), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Blick in die Gedanken"));
        arrayList.add(this.getZauber("Sensattacco"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

