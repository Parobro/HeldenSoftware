/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d;

import helden.framework.D.P;
import helden.framework.OOoO.o00O;

/*
 * Renamed from helden.framework.D.oOOO
 */
public class oooo_1
extends P {
    private o00O \u00d8\u00d2\u00f8000;

    private static int o00000(o00O o00O2) {
        return 100 * o00O2.oO0000();
    }

    protected oooo_1(String string, o00O o00O2) {
        super(string, oooo_1.o00000(o00O2), 6);
        this.\u00d8\u00d2\u00f8000 = o00O2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        oooo_1 oooo_12 = new oooo_1(this.toString(), this.\u00d8\u00d2\u00f8000);
        oooo_12.o00000(this.\u00f5o0000());
        return oooo_12;
    }

    public o00O \u00f4\u00d20000() {
        return this.\u00d8\u00d2\u00f8000;
    }

    public int \u00d8\u00d20000() {
        return this.\u00d8\u00d2\u00f8000.oO0000();
    }

    @Override
    public boolean Oo0000() {
        return this.toString().startsWith("Merkmalskenntnis: Elementar (");
    }
}

