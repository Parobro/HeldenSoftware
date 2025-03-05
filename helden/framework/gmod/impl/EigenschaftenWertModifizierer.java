/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod.impl;

import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.GmodFactory;
import helden.framework.gmod.impl.WertModifizierer;
import helden.framework.oooo.b_0;

public class EigenschaftenWertModifizierer
extends WertModifizierer<b_0> {
    public EigenschaftenWertModifizierer() {
        super(GModBezeichner.\u00d300000, (GModAuswahlen<T>[])new GModAuswahlen[]{GmodFactory.obj2Atome("Object", b_0.o\u00d60000())});
    }

    @Override
    public boolean isAktuellNutzbar(b_0 b_02) {
        return b_02.equals(this.getAuswahlByName("Object"));
    }
}

