/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.e.oooo;

/*
 * Renamed from helden.framework.E.OoOO.oOoO
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oooo_0 {
    private int \u00d400000 = 0;
    private int \u00d200000 = 0;
    private int \u00d300000 = 0;
    private int class = 0;
    private int super = 0;

    public oooo_0(double d2, double d3, double d4, double d5, double d6) {
        this.\u00d400000 = (int)Math.round(d2);
        this.\u00d200000 = (int)Math.round(d3);
        this.\u00d300000 = (int)Math.round(d4);
        this.class = (int)Math.round(d5);
        this.super = (int)Math.round(d6);
    }

    public oooo_0(int n, int n2, int n3, int n4, int n5) {
        this.\u00d400000 = n;
        this.\u00d200000 = n2;
        this.\u00d300000 = n3;
        this.class = n4;
        this.super = n5;
    }

    public oooo_0 o00000() throws CloneNotSupportedException {
        return (oooo_0)this.clone();
    }

    public int o00000(int n) {
        if (n == 0) {
            return this.\u00d400000;
        }
        if (n == 1) {
            return this.\u00d200000;
        }
        if (n == 2) {
            return this.\u00d300000;
        }
        if (n == 3) {
            return this.class;
        }
        if (n == 4) {
            return this.super;
        }
        return 0;
    }

    public oooo_0 o00000(double d2) {
        oooo_0 oooo_02 = new oooo_0((double)this.\u00d400000 * d2, (double)this.\u00d200000 * d2, (double)this.\u00d300000 * d2, (double)this.class * d2, (double)this.super * d2);
        return oooo_02;
    }

    public String toString() {
        return this.\u00d400000 + " / " + this.\u00d200000 + " / " + this.\u00d300000 + " / " + this.class + " / " + this.super;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new oooo_0(this.\u00d400000, this.\u00d200000, this.\u00d300000, this.class, this.super);
    }
}

