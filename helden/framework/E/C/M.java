/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.C.O0OO;
import helden.framework.E.G;
import helden.framework.gmod.GMod;
import java.util.ArrayList;
import java.util.List;

public class M
implements G,
O0OO {
    private List<GMod> intnew = new ArrayList<GMod>();
    private Integer \u00f6\u00d20000;

    public void o00000(GMod gMod) {
        this.intnew.add(gMod);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        M m = new M();
        for (GMod gMod : this.intnew) {
            m.intnew.add((GMod)gMod.clone());
        }
        m.\u00f6\u00d20000 = this.\u00f6\u00d20000;
        return m;
    }

    @Override
    public A \u00d800000() {
        return B.super;
    }

    @Override
    public String \u00d600000() {
        return null;
    }

    public M \u00f8\u00d20000() throws CloneNotSupportedException {
        return (M)this.clone();
    }

    @Override
    public Integer \u00f6\u00d20000() {
        return this.\u00f6\u00d20000;
    }

    public List<GMod> fornew() {
        return this.intnew;
    }

    @Override
    public void o00000(Integer n) {
        this.\u00f6\u00d20000 = n;
    }
}

