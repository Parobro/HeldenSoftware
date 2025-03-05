/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.zauber.KonkreterZauber;
import helden.plugin.werteplugin.PluginZauber;

public class String
implements PluginZauber {
    private KonkreterZauber o00000;

    public String(KonkreterZauber konkreterZauber) {
        this.o00000 = konkreterZauber;
    }

    @Override
    public java.lang.String getBezeichnung() {
        return this.o00000.toString();
    }

    @Override
    public java.lang.String[] getMerkmale() {
        java.lang.String[] stringArray = new java.lang.String[this.o00000.getMerkmale().length];
        for (int i2 = 0; i2 < this.o00000.getMerkmale().length; ++i2) {
            stringArray[i2] = this.o00000.getMerkmale()[i2].toString();
        }
        return stringArray;
    }

    @Override
    public java.lang.String[] getProbe() {
        java.lang.String[] stringArray = new java.lang.String[]{this.o00000.getTalentprobe().o00000(0).toString(), this.o00000.getTalentprobe().o00000(1).toString(), this.o00000.getTalentprobe().o00000(2).toString()};
        return stringArray;
    }

    @Override
    public java.lang.String[] getRepraesentationen() {
        java.lang.String[] stringArray = new java.lang.String[this.o00000.getRepraesentationen().length];
        for (int i2 = 0; i2 < this.o00000.getRepraesentationen().length; ++i2) {
            stringArray[i2] = this.o00000.getRepraesentationen()[i2].toString();
        }
        return stringArray;
    }

    @Override
    public Object getZauber() {
        return this.o00000;
    }

    @Override
    public java.lang.String toString() {
        return this.o00000.toString();
    }
}

