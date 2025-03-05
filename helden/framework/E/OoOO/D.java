/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.OoOO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
implements Cloneable {
    private int super;
    private int \u00d200000;
    private boolean \u00d300000;

    public D(int n) {
        this.super = n;
        this.\u00d200000 = n;
        this.\u00d300000 = false;
    }

    public D(int n, int n2, boolean bl) {
        this.super = n;
        this.\u00d200000 = n2;
        this.\u00d300000 = bl;
    }

    public int \u00d300000() {
        return this.\u00d200000;
    }

    public D new() throws CloneNotSupportedException {
        return (D)this.clone();
    }

    public int \u00d400000() {
        return this.super;
    }

    public boolean o00000() {
        return this.\u00d300000;
    }

    public void o00000(int n) {
        this.\u00d200000 = n;
    }

    public void new(int n) {
        this.super = n;
    }

    public void \u00d500000() {
        this.\u00d300000 = true;
    }

    public void o00000(boolean bl) {
        this.\u00d300000 = bl;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new D(this.super, this.\u00d200000, this.\u00d300000);
    }
}

