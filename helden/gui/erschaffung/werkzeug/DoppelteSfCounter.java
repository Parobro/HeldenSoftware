/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

public class DoppelteSfCounter {
    private int \u00d200000;
    private int Object;
    private int \u00d400000;
    private int o00000;

    public DoppelteSfCounter() {
        this.clear();
    }

    public void addAllg() {
        ++this.\u00d200000;
    }

    public void addGelaendekunden() {
        ++this.o00000;
    }

    public void addKulterkunde() {
        ++this.Object;
    }

    public void addOrtskenntnis() {
        ++this.\u00d400000;
    }

    public void clear() {
        this.\u00d200000 = 0;
        this.Object = 0;
        this.\u00d400000 = 0;
        this.o00000 = 0;
    }

    public int getAllg() {
        return this.\u00d200000;
    }

    public int getGelaendekunden() {
        return this.o00000;
    }

    public int getKulterkunde() {
        return this.Object;
    }

    public int getOrtskenntnis() {
        return this.\u00d400000;
    }
}

