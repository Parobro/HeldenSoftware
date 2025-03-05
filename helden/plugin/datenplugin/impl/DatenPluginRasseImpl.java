/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.held.a.oooo_1;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.settings.Settings;
import helden.plugin.datenplugin.DatenPluginRasse;
import java.util.ArrayList;

public class DatenPluginRasseImpl
implements DatenPluginRasse {
    private o0oo_0 o00000;

    public DatenPluginRasseImpl(o0oo_0 o0oo_02) {
        this.o00000 = o0oo_02;
    }

    @Override
    public ArrayList<String> getAugenfarben() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (oooo_1 oooo_12 : this.o00000.getAugenfarben()) {
            arrayList.add(oooo_12.String());
        }
        return arrayList;
    }

    @Override
    public ArrayList<String> getHaarfarben() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (oooo_1 oooo_12 : this.o00000.getHaarfarben()) {
            arrayList.add(oooo_12.String());
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.o00000.getMaxGewicht();
    }

    @Override
    public int getMaxGroesse() {
        return this.o00000.getMaxGroesse();
    }

    @Override
    public int getMinGewicht() {
        return this.o00000.getMinGewicht();
    }

    @Override
    public int getMinGroesse() {
        return this.o00000.getMinGroesse();
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

