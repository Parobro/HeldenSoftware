/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.plugin.datenplugin.DatenPluginZauber;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DatenPluginZauberImpl
implements DatenPluginZauber {
    private boolean o00000;
    private KonkreterZauber new;

    public DatenPluginZauberImpl(KonkreterZauber konkreterZauber, boolean bl) {
        this.o00000 = bl;
        this.new = konkreterZauber;
    }

    @Override
    public String getBezeichnung() {
        return this.new.toString();
    }

    @Override
    public String[] getMerkmale() {
        String[] stringArray = new String[this.new.getMerkmale().length];
        for (int i2 = 0; i2 < this.new.getMerkmale().length; ++i2) {
            stringArray[i2] = this.new.getMerkmale()[i2].toString();
        }
        return stringArray;
    }

    @Override
    public String[] getProbe() {
        String[] stringArray = new String[]{this.new.getTalentprobe().o00000(0).toString(), this.new.getTalentprobe().o00000(1).toString(), this.new.getTalentprobe().o00000(2).toString()};
        return stringArray;
    }

    @Override
    public String[] getRepraesentationen() {
        String[] stringArray = new String[this.new.getRepraesentationen().length];
        for (int i2 = 0; i2 < this.new.getRepraesentationen().length; ++i2) {
            stringArray[i2] = this.new.getRepraesentationen()[i2].toString();
        }
        return stringArray;
    }

    @Override
    public ArrayList<String> getSettings() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Settings settings : Settings.getSettings()) {
            if (!settings.contains(this.new)) continue;
            arrayList.add(settings.getName());
        }
        return arrayList;
    }

    @Override
    public Object getZauber() {
        return this.new;
    }

    @Override
    public boolean isHauszauber() {
        return this.o00000;
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    @Override
    public String toString() {
        return this.new.getZaubername();
    }
}

