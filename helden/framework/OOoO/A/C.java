/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OooO.A;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C {
    private String \u00d300000;
    private double \u00d200000;
    private double super;

    public C(String string, double d2, double d3) {
        this.o00000(string);
        this.\u00d200000(d2);
        this.o00000(d3);
    }

    public double \u00d300000() {
        return this.\u00d200000;
    }

    public double \u00d200000() {
        return this.super;
    }

    public String o00000() {
        return this.\u00d300000;
    }

    public void \u00d200000(double d2) {
        this.\u00d200000 = d2;
    }

    public void o00000(double d2) {
        this.super = d2;
    }

    public void o00000(String string) {
        this.\u00d300000 = string;
    }

    public String toString() {
        return String.format(" %6.2f %s ", this.\u00d300000(), this.o00000());
    }
}

