/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2.oOOO;

import helden.framework.E.F;
import helden.plugin.werteplugin2.PluginGegenstand;

public class H
implements PluginGegenstand {
    private F o00000;

    public H(F f2) {
        this.o00000 = f2;
    }

    @Override
    public int getAnzahl() {
        return this.o00000.\u00f500000();
    }

    @Override
    public float getGewicht() {
        return this.o00000.Object();
    }

    @Override
    public String getName() {
        return this.o00000.OO0000();
    }

    @Override
    public int getPreis() {
        return this.o00000.oO0000();
    }

    @Override
    public String toString() {
        return this.o00000.toString();
    }
}

