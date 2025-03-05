/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.ooOO.h;

public final class intnew
extends h {
    private static intnew \u00d400000;

    public static intnew o00000(A a2) {
        if (\u00d400000 == null) {
            \u00d400000 = new intnew("Font zum Drucken w\u00e4hlen", a2, true);
        }
        return \u00d400000;
    }

    private intnew(String string, A a2, boolean bl) {
        super(string, a2, bl);
    }
}

