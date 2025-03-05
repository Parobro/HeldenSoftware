/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.plugin.datenplugin.DatenPluginTalent;
import java.util.ArrayList;

public class DatenPluginTalentImpl
implements DatenPluginTalent {
    private oo0o_0 o00000;

    public DatenPluginTalentImpl(oo0o_0 oo0o_02) {
        this.o00000 = oo0o_02;
    }

    @Override
    public String getBehinderung() {
        if (this.o00000 instanceof voidsuper) {
            voidsuper voidsuper2 = (voidsuper)this.o00000;
            return voidsuper2.superclass();
        }
        return "";
    }

    @Override
    public String getBezeichnung() {
        return this.o00000.toString();
    }

    @Override
    public String[] getProbe() {
        String[] stringArray = new String[]{this.o00000.getTalentprobe().o00000(0).toString(), this.o00000.getTalentprobe().o00000(1).toString(), this.o00000.getTalentprobe().o00000(2).toString()};
        return stringArray;
    }

    @Override
    public ArrayList<String> getSettings() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Settings settings : Settings.getSettings()) {
            if (!settings.contains(this.o00000)) continue;
            arrayList.add(settings.getName());
        }
        return arrayList;
    }

    @Override
    public Object getTalent() {
        return this.o00000;
    }

    @Override
    public String getTalentart() {
        return this.o00000.getArt().toString();
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    @Override
    public String toString() {
        return this.o00000.toString();
    }
}

