/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.C.O0OO;
import helden.framework.E.G;
import helden.framework.OOoO.o0Oo;

public class I
implements G,
O0OO {
    private o0Oo \u00f8\u00d20000;
    private _o donew;
    private Integer O\u00d30000;

    public I(o0Oo o0Oo2) {
        this.\u00f8\u00d20000 = o0Oo2;
        this.donew = _o.o00000;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        I i2 = new I(this.o\u00d30000());
        i2.donew = this.donew;
        i2.O\u00d30000 = this.O\u00d30000;
        return i2;
    }

    @Override
    public A \u00d800000() {
        return B.int;
    }

    @Override
    public String \u00d600000() {
        return this.O\u00d30000 + "; " + (Object)((Object)this.donew);
    }

    public I \u00d2\u00d30000() throws CloneNotSupportedException {
        return (I)this.clone();
    }

    @Override
    public Integer \u00f6\u00d20000() {
        return this.O\u00d30000;
    }

    public o0Oo o\u00d30000() {
        return this.\u00f8\u00d20000;
    }

    public _o \u00d3\u00d30000() {
        return this.donew;
    }

    @Override
    public void o00000(Integer n) {
        this.O\u00d30000 = n;
    }

    public void o00000(_o _o2) {
        this.donew = _o2;
    }

    public String toString() {
        return this.\u00f8\u00d20000.toString();
    }

    public static enum _o {
        o00000("Verf\u00fcgbar"),
        String("Besitz");

        private String \u00d200000;

        private _o(String string2) {
            this.\u00d200000 = string2;
        }

        public String toString() {
            return this.\u00d200000;
        }
    }
}

