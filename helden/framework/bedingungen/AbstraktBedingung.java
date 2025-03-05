/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.bedingungen;

public abstract class AbstraktBedingung {
    public String toString() {
        return "";
    }

    public abstract String toStringFormatiertHTML();

    protected String toStringFormatiert(int n) {
        return this.toString();
    }
}

