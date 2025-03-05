/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.settings.Settings;
import helden.plugin.datenplugin.DatenPluginProfession;
import java.util.ArrayList;

public class DatenPluginProfessionImpl
implements DatenPluginProfession {
    private super o00000;

    public DatenPluginProfessionImpl(super super_) {
        this.o00000 = super_;
    }

    @Override
    public ArrayList<String> getNamen() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(this.o00000.toString());
        return arrayList;
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
    public ArrayList<String> getVarianten(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (P p2 : this.o00000.getGewaehlteVarianten()) {
            arrayList.add(p2.toString());
        }
        return arrayList;
    }

    @Override
    public boolean hatBreitgefaecherteBildung() {
        return false;
    }

    @Override
    public boolean hatLehrmeister() {
        return false;
    }

    @Override
    public boolean hatMagischeWeiterbilfung() {
        return this.o00000.istMagischeProfession();
    }

    @Override
    public boolean istIntern() {
        return this.o00000.istIntern();
    }
}

