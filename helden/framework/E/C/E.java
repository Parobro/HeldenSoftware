/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.F;
import helden.framework.E.G;
import helden.framework.E.OoOO.C;
import helden.framework.e.oooo.oooo_0;
import java.util.ArrayList;
import java.util.List;

public class E
implements G {
    private helden.framework.E.OoOO.F \u00f4o0000;
    private oooo_0 \u00d8o0000;
    private C \u00d6o0000;
    private int floatsuper;
    private List<helden.framework.OoOO.E> \u00d4o0000 = new ArrayList<helden.framework.OoOO.E>();
    private int \u00d2o0000;
    private boolean \u00d3o0000;

    public E(helden.framework.E.OoOO.F f2, oooo_0 oooo_02, C c, int n, helden.framework.OoOO.E e, int n2) {
        this(f2, oooo_02, c, n, e, n2, false);
    }

    public E(helden.framework.E.OoOO.F f2, oooo_0 oooo_02, C c, int n, helden.framework.OoOO.E e, int n2, boolean bl) {
        this.\u00f4o0000 = f2;
        this.\u00d8o0000 = oooo_02;
        this.\u00d6o0000 = c;
        this.floatsuper = n;
        this.\u00d4o0000.add(e);
        this.\u00d2o0000 = n2;
        this.\u00d3o0000 = bl;
    }

    public E(helden.framework.E.OoOO.F f2, oooo_0 oooo_02, C c, int n, List<helden.framework.OoOO.E> list, int n2, boolean bl) {
        for (helden.framework.OoOO.E e : list) {
            this.\u00d4o0000.add(e);
        }
        this.\u00f4o0000 = f2;
        this.\u00d8o0000 = oooo_02;
        this.\u00d6o0000 = c;
        this.floatsuper = n;
        this.\u00d2o0000 = n2;
        this.\u00d3o0000 = bl;
    }

    public void o00000(helden.framework.OoOO.E e) {
        this.\u00d4o0000.add(e);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new E(this.\u00f4o0000.\u00d500000(), this.\u00d8o0000.o00000(), this.\u00d6o0000.o00000(), this.floatsuper, this.\u00d4o0000, this.\u00d2o0000, this.\u00d3o0000);
    }

    @Override
    public A \u00d800000() {
        return B.class;
    }

    @Override
    public String \u00d600000() {
        return null;
    }

    public F \u00f8o0000() throws CloneNotSupportedException {
        return (F)this.clone();
    }

    public int \u00d5o0000() {
        return this.floatsuper;
    }

    public int whilesuper() {
        return this.\u00d2o0000;
    }

    public oooo_0 \u00d6o0000() {
        return this.\u00d8o0000;
    }

    public List<helden.framework.OoOO.E> \u00f5o0000() {
        return this.\u00d4o0000;
    }

    public helden.framework.E.OoOO.F \u00d8o0000() {
        return this.\u00f4o0000;
    }

    public C \u00f6o0000() {
        return this.\u00d6o0000;
    }

    public boolean thisnew() {
        return this.\u00d3o0000;
    }

    public void \u00d200000(boolean bl) {
        this.\u00d3o0000 = bl;
    }

    public void \u00d5O0000(int n) {
        this.floatsuper = n;
    }

    public void \u00d6O0000(int n) {
        this.\u00d2o0000 = n;
    }

    public void o00000(oooo_0 oooo_02) {
        this.\u00d8o0000 = oooo_02;
    }

    public void \u00d200000(helden.framework.E.OoOO.F f2) {
        this.\u00f4o0000 = f2;
    }

    public void o00000(C c) {
        this.\u00d6o0000 = c;
    }
}

