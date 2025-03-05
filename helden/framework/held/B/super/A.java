/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super;

import helden.framework.held.b.super.super.oooo_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A {
    private final String \u00d200000;
    private final String[] \u00d300000;
    private final oooo_0 o00000;

    public A(String string, String[] stringArray, oooo_0 oooo_02) {
        if (oooo_02.\u00d500000() > stringArray.length) {
            throw new IllegalArgumentException("Die Anzahl der Spaltenklassen und der Spalten muss gleich sein.\nAnzahl Spaltenklassen: " + stringArray.length + "\n" + "Anzahl Spalten: " + oooo_02.\u00d500000());
        }
        this.\u00d200000 = string;
        this.\u00d300000 = stringArray;
        this.o00000 = oooo_02;
    }

    public String super(int n, int n2) {
        return this.o00000.o00000(n, n2);
    }

    public String super(int n) {
        return this.\u00d300000[n];
    }

    public String \u00d200000(int n) {
        String string = this.o00000.Object()[n];
        if (string.equals("")) {
            string = null;
        }
        return string;
    }

    public int \u00d400000() {
        return this.o00000.\u00d500000();
    }

    public String \u00d300000() {
        return this.\u00d200000;
    }

    public int super() {
        return this.o00000.o00000();
    }

    public boolean \u00d200000() {
        return this.o00000.\u00d400000();
    }
}

