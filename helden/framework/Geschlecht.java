/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum Geschlecht {
    \u00d400000("m\u00e4nnlich"),
    \u00d300000("weiblich");

    private String o00000;

    public static Geschlecht getGeschlecht(String string) {
        if (string.equals(\u00d400000.toString())) {
            return \u00d400000;
        }
        return \u00d300000;
    }

    private Geschlecht(String string2) {
        this.o00000 = string2;
    }

    public boolean istMaennlich() {
        return this.equals((Object)\u00d400000);
    }

    public String toString() {
        return this.o00000;
    }
}

