/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H.B;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.object.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.held.object.oooo_0;
import helden.framework.int.L;
import helden.framework.int.String;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import java.util.Map;

public class B
extends o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 {
    private K \u00d4O0000;

    public B(K k2) {
        super(k2);
        this.\u00d4O0000 = k2;
    }

    public void o00000(L l2) {
        String string = l2.toString();
        floatsuper floatsuper2 = new floatsuper(this.\u00d4O0000);
        l2.bestimmeTalentwerte(0);
        for (Map.Entry<oo0o_0, Integer> object : l2.getTalente().o00000().entrySet()) {
            this.o00000((voidsuper)object.getKey(), (int)object.getValue(), string);
        }
        for (public public_ : l2.getVorteile().o00000().getListe()) {
            this.o00000(public_, string);
        }
        for (P p2 : l2.getSonderfertigkeiten()) {
            if (this.\u00d800000().new(p2.toString())) continue;
            this.o00000(p2, string);
        }
        for (helden.framework.oooo.a.b_0 b_02 : l2.getBedingteWerte()) {
            if (!floatsuper2.Object(b_02.\u00d200000())) continue;
            oooo_0.\u00f500000(b_02.Object() + " not supported");
        }
        if (l2.getModifikator(b_0.\u00f5\u00f5\u00d2000) != 0) {
            this.\u00d200000(l2.getModifikator(b_0.\u00f5\u00f5\u00d2000), string);
        }
        this.\u00d4O0000.\u00d800000().o00000(String._o.\u00d600000, l2);
    }
}

