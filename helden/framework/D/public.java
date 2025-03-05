/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.oO0O;

public final class public
extends oO0O {
    private boolean forprivateclass;
    private int o\u00d3\u00f8000;

    protected public(String string, int n, boolean bl) {
        super(string, n, 10);
        this.forprivateclass = bl;
        this.o\u00d3\u00f8000 = 0;
        if (n == 5) {
            this.o\u00d3\u00f8000 = -1;
        }
        if (n == 6) {
            this.o\u00d3\u00f8000 = -3;
        }
        if (n == 7) {
            this.o\u00d3\u00f8000 = -5;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        public public_ = new public(this.toString(), this.whilenew(), this.forprivateclass);
        public_.o00000(this.\u00f5o0000());
        return public_;
    }

    public int \u00d3\u00d30000() {
        return this.o\u00d3\u00f8000;
    }
}

