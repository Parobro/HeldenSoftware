/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.wildnislaeufer;

import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.wildnislaeufer.Wildnislauefer;
import java.util.ArrayList;

public class Schneelaeufer
extends Wildnislauefer {
    public Schneelaeufer() {
        super("Schneel\u00e4ufer", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            return "Schneel\u00e4ufer";
        }
        return "Schneel\u00e4uferin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 2);
        return k_02;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f4\u00d3000, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
        super.setzeLeittalente(arrayList);
        arrayList.add(voidsuper.\u00d8\u00d3\u00d8000);
        arrayList.add(voidsuper.thisclassObject);
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

