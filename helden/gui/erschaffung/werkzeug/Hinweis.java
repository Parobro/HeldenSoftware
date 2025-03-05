/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

public class Hinweis {
    private String \u00d200000;
    private HinweisArt o00000;

    public Hinweis(String string) {
        this(string, HinweisArt.o00000);
    }

    public Hinweis(String string, HinweisArt hinweisArt) {
        this.\u00d200000 = string;
        this.o00000 = hinweisArt;
    }

    public HinweisArt getHinweisart() {
        return this.o00000;
    }

    public String toString() {
        return this.\u00d200000;
    }

    public static enum HinweisArt {
        o00000,
        Object,
        \u00d200000;

    }
}

