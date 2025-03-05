/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod.impl;

import helden.framework.OOoO.K;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.GmodFactory;
import helden.framework.gmod.impl.SpaltenVerschiebung;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;

public class ZauberSpaltenVerschiebung
extends SpaltenVerschiebung<Object> {
    public ZauberSpaltenVerschiebung() {
        super(GModBezeichner.\u00f500000, (GModAuswahlen<T>[])new GModAuswahlen[]{GmodFactory.obj2Atome("Zaubername", ZauberFabrik.getInstance().getAlleZauber()), GmodFactory.obj2Atome("Repr\u00e4sentation", K.\u00d400000())});
    }

    @Override
    public boolean isAktuellNutzbar(int n, Object object) {
        Zauber zauber = (Zauber)this.getAuswahlByName("Zaubername");
        K k2 = (K)this.getAuswahlByName("Repr\u00e4sentation");
        KonkreterZauber konkreterZauber = (KonkreterZauber)object;
        return n >= this.getVon() && n < this.getBis() && konkreterZauber.getZauber().equals(zauber) && konkreterZauber.getRep().equals(k2);
    }

    @Override
    public String toString() {
        if (this.getAuswahl() == null) {
            return super.toString();
        }
        return String.format("%s (%d/%d) %s", this.getAuswahlByName("Zaubername") + "(" + this.getAuswahlByName("Repr\u00e4sentation") + ")", this.getAuswahlByName("Von"), this.getAuswahlByName("Bis"), this.getFormatiertAuswahlByName("Spaltenverschiebung"));
    }
}

