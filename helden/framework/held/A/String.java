/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.A;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class String {
    private java.lang.String super;
    private int \u00d200000;
    private java.lang.String \u00d300000;

    public String(java.lang.String string, int n, java.lang.String string2) {
        this.super = string;
        this.\u00d200000 = n;
        this.\u00d300000 = string2;
    }

    public java.lang.String new() {
        return this.\u00d300000;
    }

    public String \u00d400000() throws CloneNotSupportedException {
        return (String)this.clone();
    }

    public java.lang.String \u00d300000() {
        return this.super;
    }

    public int o00000() {
        return this.\u00d200000;
    }

    public void new(java.lang.String string) {
        this.\u00d300000 = string;
    }

    public void o00000(java.lang.String string) {
        this.super = string;
    }

    public void o00000(int n) {
        this.\u00d200000 = n;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new String(this.super, this.\u00d200000, this.\u00d300000);
    }
}

