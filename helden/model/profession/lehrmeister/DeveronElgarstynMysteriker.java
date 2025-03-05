/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.lehrmeister.DeveronElgarstynBase;
import java.util.ArrayList;

public class DeveronElgarstynMysteriker
extends DeveronElgarstynBase {
    public DeveronElgarstynMysteriker() {
        super("Mystiker der Obskuromantie", "Mystikerin der Obskuromantie", 24, false);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Auszug aus De Obscuromantica");
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Astrale Meditation"));
        arrayList.add(oooo_0.o00000("Regeneration I"));
        arrayList.add(K.o00000(voidsuper.\u00f5\u00f5\u00d5000, "Obskuromantie"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 5);
        k_02.\u00d200000(this.getZauber("Pandaemonium"), 3);
        k_02.\u00d200000(this.getZauber("Serpentialis"), 4);
        k_02.\u00d200000(this.getZauber("Analys"), 3);
        k_02.\u00d200000(this.getZauber("Favilludo"), 4);
        k_02.\u00d200000(this.getZauber("Nuntiovolo"), 3);
        k_02.\u00d200000(this.getZauber("Odem"), 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Regeneration II"));
        arrayList.addAll(for.\u00d200000("Zauberkontrolle"));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Pandaemonium"));
        arrayList.add(this.getZauber("Serpentialis"));
    }
}

