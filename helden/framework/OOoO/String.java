/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class String<A, B, C> {
    private A \u00d300000;
    private B \u00d200000;
    private C o00000;

    public String(A a2, B b) {
        this.\u00d300000 = a2;
        this.\u00d200000 = b;
        this.o00000 = null;
    }

    public String(A a2, B b, C c) {
        this.\u00d300000 = a2;
        this.\u00d200000 = b;
        this.o00000 = c;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof String)) {
            return false;
        }
        String string = (String)object;
        return this.\u00d300000().equals(string.\u00d300000()) && this.new().equals(string.new());
    }

    public A \u00d300000() {
        return this.\u00d300000;
    }

    public B new() {
        return this.\u00d200000;
    }

    public C o00000() {
        return this.o00000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public void \u00d300000(A a2) {
        this.\u00d300000 = a2;
    }

    public void new(B b) {
        this.\u00d200000 = b;
    }

    public void o00000(C c) {
        this.o00000 = c;
    }

    public java.lang.String toString() {
        return this.\u00d300000 + " " + this.\u00d200000 + " " + this.o00000;
    }
}

