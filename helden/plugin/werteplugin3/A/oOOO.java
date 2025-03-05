/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin3.A;

import helden.framework.zauber.KonkreterZauber;
import helden.plugin.werteplugin3.PluginZauber3;

public class oOOO
implements PluginZauber3 {
    private KonkreterZauber \u00d200000;
    private boolean \u00d300000;

    public oOOO(KonkreterZauber konkreterZauber, boolean bl) {
        this.\u00d200000 = konkreterZauber;
        this.\u00d300000 = bl;
    }

    @Override
    public String getBezeichnung() {
        return this.\u00d200000.toString();
    }

    @Override
    public String[] getMerkmale() {
        String[] stringArray = new String[this.\u00d200000.getMerkmale().length];
        for (int i2 = 0; i2 < this.\u00d200000.getMerkmale().length; ++i2) {
            stringArray[i2] = this.\u00d200000.getMerkmale()[i2].toString();
        }
        return stringArray;
    }

    @Override
    public String[] getProbe() {
        String[] stringArray = new String[]{this.\u00d200000.getTalentprobe().o00000(0).toString(), this.\u00d200000.getTalentprobe().o00000(1).toString(), this.\u00d200000.getTalentprobe().o00000(2).toString()};
        return stringArray;
    }

    @Override
    public String[] getRepraesentationen() {
        String[] stringArray = new String[this.\u00d200000.getRepraesentationen().length];
        for (int i2 = 0; i2 < this.\u00d200000.getRepraesentationen().length; ++i2) {
            stringArray[i2] = this.\u00d200000.getRepraesentationen()[i2].toString();
        }
        return stringArray;
    }

    @Override
    public Object getZauber() {
        return this.\u00d200000;
    }

    @Override
    public boolean isHauszauber() {
        return this.\u00d300000;
    }

    @Override
    public String toString() {
        return this.\u00d200000.toString();
    }
}

