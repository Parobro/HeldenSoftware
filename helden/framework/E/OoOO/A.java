/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.OoOO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A {
    private int super;
    private int \u00d200000;

    public A(int n, int n2) {
        this.super = n;
        this.\u00d200000 = n2;
    }

    public A new() throws CloneNotSupportedException {
        return (A)this.clone();
    }

    public int \u00d300000() {
        return this.super;
    }

    public int o00000(int n) {
        int n2 = 0;
        if (this.super <= 0 && this.\u00d200000 <= 0) {
            return n2;
        }
        if (n > 0) {
            n2 = (n - this.super) / this.\u00d200000;
        }
        return n2;
    }

    public int o00000() {
        return this.\u00d200000;
    }

    public String toString() {
        if (this.super <= 0 && this.\u00d200000 <= 0) {
            return "-/-";
        }
        return this.super + " / " + this.\u00d200000;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new A(this.super, this.\u00d200000);
    }
}

