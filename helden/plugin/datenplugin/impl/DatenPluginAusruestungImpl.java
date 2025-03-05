/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.held.oO0O;
import helden.plugin.datenplugin.DatenPluginAusruestung;
import helden.plugin.datenplugin.DatenPluginFernkampfWaffe;
import helden.plugin.datenplugin.DatenPluginNahkampfWaffe;
import helden.plugin.datenplugin.DatenPluginRuestungsTeil;
import helden.plugin.datenplugin.DatenPluginSchildParadewaffe;

public class DatenPluginAusruestungImpl
implements DatenPluginAusruestung {
    private oO0O o00000;

    public DatenPluginAusruestungImpl(oO0O oO0O2) {
        this.o00000 = oO0O2;
    }

    @Override
    public int getAusweichen() {
        return this.o00000.\u00d2O0000();
    }

    @Override
    public DatenPluginFernkampfWaffe[] getFernkampfWaffen() {
        return null;
    }

    @Override
    public DatenPluginRuestungsTeil getGesammtRuestung() {
        return null;
    }

    @Override
    public int getGSNachBE() {
        return this.o00000.returnsuper();
    }

    @Override
    public int getIniNachBE() {
        return this.o00000.private();
    }

    @Override
    public int getKomboMitSchildParadewaffe(DatenPluginNahkampfWaffe datenPluginNahkampfWaffe) {
        return 0;
    }

    @Override
    public DatenPluginNahkampfWaffe[] getNahkampfWaffen() {
        return null;
    }

    @Override
    public int getRaufenParade() {
        return this.o00000.\u00d800000();
    }

    @Override
    public String getRaufenTP() {
        return this.o00000.null();
    }

    @Override
    public int getRauferAttacke() {
        return this.o00000.\u00f6O0000();
    }

    @Override
    public int getRingenAttacke() {
        return this.o00000.\u00d5O0000();
    }

    @Override
    public int getRingenParade() {
        return this.o00000.String();
    }

    @Override
    public String getRingenTP() {
        return this.o00000.\u00f600000();
    }

    @Override
    public DatenPluginRuestungsTeil[] getRuestungsTeile() {
        return null;
    }

    @Override
    public DatenPluginSchildParadewaffe[] getSchildParadewaffe() {
        return null;
    }

    @Override
    public int getWundschwelle() {
        return 0;
    }

    @Override
    public boolean istZonenRuestungsBerechnung() {
        return this.o00000.\u00d200000();
    }
}

