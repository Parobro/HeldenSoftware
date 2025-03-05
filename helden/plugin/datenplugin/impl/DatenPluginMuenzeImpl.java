/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.geld.Muenze;
import helden.plugin.datenplugin.DatenPluginMuenze;

public class DatenPluginMuenzeImpl
implements DatenPluginMuenze {
    private Muenze o00000;

    public DatenPluginMuenzeImpl(Muenze muenze) {
        this.o00000 = muenze;
    }

    @Override
    public String getBezeichner() {
        return this.o00000.getBezeichner();
    }

    @Override
    public DatenPluginMuenze getClone() {
        return new DatenPluginMuenzeImpl(this.o00000.getClone());
    }

    @Override
    public float getFaktorHoch() {
        return this.o00000.getFaktorHoch();
    }

    @Override
    public float getFaktorRunter() {
        return this.o00000.getFaktorRunter();
    }

    @Override
    public float getGewichtProStueck() {
        return this.o00000.getGewichtProStueck();
    }

    @Override
    public String getKurzString() {
        return this.o00000.getKurzString();
    }

    @Override
    public Object getObject() {
        return this.o00000;
    }

    @Override
    public String getWaehrungsBezeichner() {
        return this.o00000.getWaehrungsBezeichner();
    }

    @Override
    public float getWertInSilberstuecke() {
        return this.o00000.getWertInSilberstuecke();
    }
}

