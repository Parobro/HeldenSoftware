/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod.impl;

import helden.framework.OOoO.o00O;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.GmodFactory;
import helden.framework.gmod.impl.SpaltenVerschiebung;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;

public class MerkmalSpaltenVerschiebung
extends SpaltenVerschiebung<Object> {
    public MerkmalSpaltenVerschiebung() {
        super(GModBezeichner.\u00d500000, (GModAuswahlen<T>[])new GModAuswahlen[]{GmodFactory.obj2Atome("Merkmal", (ArrayList)o00O.o00000())});
    }

    @Override
    public boolean isAktuellNutzbar(int n, Object object) {
        KonkreterZauber konkreterZauber = (KonkreterZauber)object;
        o00O o00O2 = (o00O)this.getAuswahlByName("Merkmal");
        boolean bl = konkreterZauber.hatMerkmal(o00O2) || o00O2.equals(o00O.\u00f4\u00d40000) && konkreterZauber.hatElementaresMerkmal() || o00O2.equals(o00O.\u00f8\u00d20000) && konkreterZauber.hatDaemonischesMerkmal();
        return bl && n >= this.getVon() && n < this.getBis();
    }

    @Override
    public String toString() {
        if (this.getAuswahl() == null) {
            return super.toString();
        }
        return String.format("%s (%d/%d) %s", this.getAuswahlByName("Merkmal"), this.getAuswahlByName("Von"), this.getAuswahlByName("Bis"), this.getFormatiertAuswahlByName("Spaltenverschiebung"));
    }
}

