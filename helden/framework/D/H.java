/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

public class H {
    private String o00000;

    public H(String string) {
        this.o00000 = string;
    }

    public boolean equals(Object object) {
        return this.toString().equals(object.toString());
    }

    public int hashCode() {
        return this.o00000.hashCode();
    }

    public String toString() {
        return this.o00000.toString();
    }
}

