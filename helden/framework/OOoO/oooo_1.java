/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

/*
 * Renamed from helden.framework.OOoO.oOoO
 */
public class oooo_1 {
    public static final String \u00d300000 = "A149 Esche und Kork";
    private int o00000;
    private String \u00d200000;

    public oooo_1(String string, int n) {
        this.\u00d200000 = string;
        this.o00000 = n;
    }

    public String \u00d200000() {
        return this.\u00d200000;
    }

    public oooo_1 o00000() throws CloneNotSupportedException {
        return (oooo_1)this.clone();
    }

    public int Object() {
        return this.o00000;
    }

    public void o00000(String string) {
        this.\u00d200000 = string;
    }

    public void o00000(int n) {
        this.o00000 = n;
    }

    public String toString() {
        return this.\u00d200000 + ": " + this.o00000;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new oooo_1(this.\u00d200000, this.o00000);
    }
}

