/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.E.F;
import helden.framework.settings.Settings;
import helden.plugin.datenplugin.DatenPluginGegenstand;
import java.util.ArrayList;

public class DatenPluginGegenstandImpl
implements DatenPluginGegenstand {
    private F o00000;

    public DatenPluginGegenstandImpl(F f2) {
        this.o00000 = f2;
    }

    @Override
    public int getAnzahl() {
        return this.o00000.\u00f500000();
    }

    @Override
    public float getGesamtVolumen() {
        return 0.0f;
    }

    @Override
    public float getGewicht() {
        return this.o00000.Object();
    }

    @Override
    public float getInnenVolumen() {
        return 0.0f;
    }

    @Override
    public String getName() {
        return this.o00000.OO0000();
    }

    @Override
    public Object getObject() {
        return this.o00000;
    }

    @Override
    public int getPreis() {
        return this.o00000.oO0000();
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
    public float getTragkraft() {
        return 0.0f;
    }

    @Override
    public boolean isBehaelter() {
        return false;
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    @Override
    public boolean istModifiziert() {
        return false;
    }
}

