/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.OoOO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C {
    private int \u00d400000 = 0;
    private int new = 0;
    private int \u00d300000 = 0;
    private int \u00d500000 = 0;
    private int o00000 = 0;

    public C(int n, int n2, int n3, int n4, int n5) {
        this.\u00d400000 = n;
        this.new = n2;
        this.\u00d300000 = n3;
        this.\u00d500000 = n4;
        this.o00000 = n5;
    }

    public C o00000() throws CloneNotSupportedException {
        return (C)this.clone();
    }

    public int o00000(int n) {
        if (n == 0) {
            return this.\u00d400000;
        }
        if (n == 1) {
            return this.new;
        }
        if (n == 2) {
            return this.\u00d300000;
        }
        if (n == 3) {
            return this.\u00d500000;
        }
        if (n == 4) {
            return this.o00000;
        }
        return 0;
    }

    public String toString() {
        return this.\u00d400000 + " / " + this.new + " / " + this.\u00d300000 + " / " + this.\u00d500000 + " / " + this.o00000;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new C(this.\u00d400000, this.new, this.\u00d300000, this.\u00d500000, this.o00000);
    }
}

