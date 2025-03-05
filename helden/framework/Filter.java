/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum Filter {
    o00000("Alle"),
    \u00d600000("Nur m\u00f6gliche"),
    void("Nur \u00fcbliche"),
    \u00d500000("Nur empfohlene"),
    \u00d200000("Auch ungeeignete");

    private String \u00d400000;

    private Filter(String string2) {
        this.\u00d400000 = string2;
    }

    public String toString() {
        return this.\u00d400000;
    }
}

