/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.b.super.super;

import helden.framework.held.K;

/*
 * Renamed from helden.framework.held.B.super.super.ooOo
 */
public abstract class oooo_0 {
    private final String[] o00000;
    protected final K \u00d200000;

    public oooo_0(K k2, String[] stringArray) {
        this.\u00d200000 = k2;
        this.o00000 = this.o00000(stringArray);
    }

    public abstract String o00000(int var1, int var2);

    public K \u00d200000() {
        return this.\u00d200000;
    }

    public String[] Object() {
        return this.o00000(this.o00000);
    }

    public int \u00d500000() {
        return this.o00000.length;
    }

    public abstract int o00000();

    public boolean \u00d400000() {
        return this.o00000() == 0;
    }

    private String[] o00000(String[] stringArray) {
        int n = stringArray.length;
        String[] stringArray2 = new String[n];
        System.arraycopy(stringArray, 0, stringArray2, 0, n);
        return stringArray2;
    }
}

