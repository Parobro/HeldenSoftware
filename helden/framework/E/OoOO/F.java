/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.OoOO;

import helden.framework.OOoO.S;

public class F
extends S {
    public static F o00000(String string) {
        return null;
    }

    public F(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public F o00000(int n, int n2) {
        return new F(n, 10, n2);
    }

    public F Object(int n, int n2) {
        return new F(n, 20, n2);
    }

    public S \u00d200000(int n, int n2) {
        return new S(n, 6, n2);
    }

    public F \u00d500000() throws CloneNotSupportedException {
        return (F)this.clone();
    }

    public F o00000(int n) {
        return new F(this.\u00d400000(), this.Object(), this.o00000() + n);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new F(this.\u00d400000(), this.Object(), this.o00000());
    }
}

