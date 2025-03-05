/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod.impl;

import helden.framework.OOoO.R;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.GmodFactory;
import java.util.ArrayList;

public class SpaltenVerschiebung<T>
extends GMod {
    public static GModAuswahlen[] createParamter(GModAuswahlen ... gModAuswahlenArray) {
        ArrayList<GModAuswahlen> arrayList = new ArrayList<GModAuswahlen>();
        arrayList.add(GmodFactory.getStufen("Von", "Von %d", -1, 30, 1));
        arrayList.add(GmodFactory.getStufen("Bis", "Bis %d", 0, 30, 1));
        arrayList.add(GmodFactory.getKategorien("Spaltenverschiebung", -3, 3));
        for (GModAuswahlen gModAuswahlen : gModAuswahlenArray) {
            arrayList.add(gModAuswahlen);
        }
        return arrayList.toArray(new GModAuswahlen[0]);
    }

    public SpaltenVerschiebung(GModBezeichner gModBezeichner, GModAuswahlen<T> ... gModAuswahlenArray) {
        super(gModBezeichner, SpaltenVerschiebung.createParamter(gModAuswahlenArray));
    }

    public Integer getBis() {
        return (Integer)this.getAuswahl().o00000(1);
    }

    public T getElement() {
        return (T)this.getAuswahl().o00000(3);
    }

    public Integer getVerschiebung() {
        return (Integer)this.getAuswahl().o00000(2);
    }

    public Integer getVon() {
        return (Integer)this.getAuswahl().o00000(0);
    }

    public boolean isAktuellNutzbar(int n, T t) {
        return n >= this.getVon() && n < this.getBis() && t.equals(this.getElement());
    }

    @Override
    public boolean isGueltig() {
        return this.getVon() <= this.getBis();
    }

    public void setAuswahl(int n, int n2, T t, int n3) {
        R r = new R(new Integer(n), new Integer(n2), new Integer(n3), t);
        this.setAuswahl(r);
    }

    @Override
    public String toString() {
        if (this.getAuswahl() == null) {
            return super.toString();
        }
        return String.format("%s (%d/%d) %s", this.getAuswahlByName("Object"), this.getAuswahlByName("Von"), this.getAuswahlByName("Bis"), this.getFormatiertAuswahlByName("Spaltenverschiebung"));
    }
}

