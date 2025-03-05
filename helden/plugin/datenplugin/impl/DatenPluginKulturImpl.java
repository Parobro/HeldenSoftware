/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.settings.Settings;
import helden.plugin.datenplugin.DatenPluginKultur;
import java.util.ArrayList;

public class DatenPluginKulturImpl
implements DatenPluginKultur {
    private OooO o00000;

    public DatenPluginKulturImpl(OooO oooO2) {
        this.o00000 = oooO2;
    }

    @Override
    public String getName() {
        return this.o00000.toString();
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
    public ArrayList<String> getVarianten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (P p2 : this.o00000.getAlleVarianten()) {
            arrayList.add(p2.toString());
        }
        return arrayList;
    }

    @Override
    public boolean istIntern() {
        return this.o00000.istIntern();
    }
}

