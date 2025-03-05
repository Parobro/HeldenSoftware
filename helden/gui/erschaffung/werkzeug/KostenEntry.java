/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.gui.erschaffung.werkzeug.KostenArt;

public class KostenEntry {
    public int Object;
    public Object \u00d200000;
    public int \u00d600000;
    public KostenArt \u00d500000;
    public int \u00d400000;
    public kostenBereich o00000;

    public KostenEntry(kostenBereich kostenBereich2, KostenArt kostenArt, int n, Object object) {
        this.\u00d500000 = kostenArt;
        this.\u00d400000 = n;
        this.o00000 = kostenBereich2;
        this.\u00d200000 = object;
        this.\u00d600000 = 0;
        this.Object = n;
    }

    public KostenEntry(kostenBereich kostenBereich2, KostenArt kostenArt, int n, Object object, int n2) {
        this.\u00d500000 = kostenArt;
        this.\u00d400000 = n;
        this.o00000 = kostenBereich2;
        this.\u00d200000 = object;
        this.\u00d600000 = n2;
        this.Object = n;
    }

    public KostenArt getArt() {
        return this.\u00d500000;
    }

    public kostenBereich getBereich() {
        return this.o00000;
    }

    public int getKosten() {
        return this.\u00d400000;
    }

    public Object getKostengegenstand() {
        return this.\u00d200000;
    }

    public void restoreKosten() {
        this.\u00d400000 = this.Object;
    }

    public void setArt(KostenArt kostenArt) {
        this.\u00d500000 = kostenArt;
    }

    public void setBereich(kostenBereich kostenBereich2) {
        this.o00000 = kostenBereich2;
    }

    public void setKosten(int n) {
        this.\u00d400000 = n;
    }

    public void setKostengegenstand(Object object) {
        this.\u00d200000 = object;
    }

    public String toString() {
        return this.\u00d500000 + " " + this.\u00d400000 + " " + (Object)((Object)this.o00000) + " " + this.\u00d200000 + " " + this.\u00d600000 + " " + this.Object;
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum kostenBereich {
        \u00d600000,
        super,
        \u00d400000,
        \u00d300000,
        \u00f400000,
        class,
        \u00d800000;

    }
}

