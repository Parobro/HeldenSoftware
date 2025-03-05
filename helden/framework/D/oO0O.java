/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.P;

public class oO0O
extends P {
    private int \u00f8\u00d2\u00f8000;

    private static int \u00d300000(int n) {
        return 50 * n;
    }

    protected oO0O(String string, int n, int n2) {
        super(string, oO0O.\u00d300000(n), n2);
        this.\u00f8\u00d2\u00f8000 = n;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        oO0O oO0O2 = new oO0O(this.toString(), this.\u00f8\u00d2\u00f8000, this.\u00d400000());
        oO0O2.o00000(this.\u00f5o0000());
        return oO0O2;
    }

    public int whilenew() {
        return this.\u00f8\u00d2\u00f8000;
    }
}

