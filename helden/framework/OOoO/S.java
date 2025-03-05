/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

public class S {
    private int o00000;
    private int \u00d300000;
    private int \u00d200000;

    public S(int n, int n2, int n3) {
        this.o00000 = n;
        this.\u00d300000 = n2;
        this.\u00d200000 = n3;
    }

    public S \u00d200000() throws CloneNotSupportedException {
        return (S)this.clone();
    }

    public int \u00d400000() {
        return this.o00000;
    }

    public int o00000() {
        return this.\u00d200000;
    }

    public int Object() {
        return this.\u00d300000;
    }

    public String toString() {
        int n = this.\u00d200000;
        String string = "+";
        if (n < 0) {
            n = -n;
            string = "-";
        }
        if (this.\u00d300000 == 6) {
            return this.o00000 + "W" + string + n;
        }
        return this.o00000 + "W" + this.\u00d300000 + string + n;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new S(this.o00000, this.\u00d300000, this.\u00d200000);
    }
}

