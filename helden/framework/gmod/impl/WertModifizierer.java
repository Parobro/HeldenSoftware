/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod.impl;

import helden.framework.gmod.GMod;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.GmodFactory;
import java.util.ArrayList;

public abstract class WertModifizierer<T>
extends GMod {
    public static GModAuswahlen[] createParamter(GModAuswahlen ... gModAuswahlenArray) {
        ArrayList<GModAuswahlen<Integer>> arrayList = new ArrayList<GModAuswahlen<Integer>>();
        for (GModAuswahlen gModAuswahlen : gModAuswahlenArray) {
            arrayList.add(gModAuswahlen);
        }
        arrayList.add(GmodFactory.getStufen("Modifikator", "Mod %d", -30, 30, 1));
        return arrayList.toArray(new GModAuswahlen[0]);
    }

    public WertModifizierer(GModBezeichner gModBezeichner, GModAuswahlen<T> ... gModAuswahlenArray) {
        super(gModBezeichner, WertModifizierer.createParamter(gModAuswahlenArray));
    }

    public T getElement() {
        return (T)this.getAuswahl().o00000(0);
    }

    public Integer getWert() {
        return (Integer)this.getAuswahlByName("Modifikator");
    }

    public abstract boolean isAktuellNutzbar(T var1);

    @Override
    public String toString() {
        if (this.getAuswahl() == null) {
            return super.toString();
        }
        return String.format("%s %s", this.getAuswahlByName("Object"), this.getFormatiertAuswahlByName("Modifikator"));
    }
}

