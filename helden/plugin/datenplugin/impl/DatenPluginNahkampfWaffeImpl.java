/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.E.C.A;
import helden.plugin.datenplugin.DatenPluginNahkampfWaffe;
import helden.plugin.datenplugin.DatenPluginTalent;
import java.util.ArrayList;

public class DatenPluginNahkampfWaffeImpl
implements DatenPluginNahkampfWaffe {
    private A o00000;

    public DatenPluginNahkampfWaffeImpl(A a2) {
        this.o00000 = a2;
    }

    @Override
    public int getAttacke() {
        return 0;
    }

    @Override
    public DatenPluginTalent getBenutztesTalent() {
        return null;
    }

    @Override
    public String getBezeichner() {
        return this.o00000.thisString();
    }

    @Override
    public int[] getBF() {
        return null;
    }

    @Override
    public String[] getDistanzklasse() {
        return null;
    }

    @Override
    public int[] getEndTP() {
        return null;
    }

    @Override
    public int getINIMod() {
        return this.o00000.\u00d300000();
    }

    @Override
    public ArrayList<DatenPluginTalent> getKampfTalente() {
        return null;
    }

    @Override
    public int[] getKoerperkraftzuschlag() {
        return null;
    }

    @Override
    public String getName() {
        return this.o00000.thisString();
    }

    @Override
    public int getParade() {
        return 0;
    }

    @Override
    public DatenPluginTalent[] getTalente() {
        return null;
    }

    @Override
    public int[] getTrefferpunkte() {
        return null;
    }

    @Override
    public int getWaffenNummer() {
        return 0;
    }

    @Override
    public int getWmAT() {
        return this.o00000.\u00d5\u00d50000().o00000();
    }

    @Override
    public int getWmPA() {
        return this.o00000.\u00d5\u00d50000().new();
    }

    @Override
    public boolean isSchadensartAusdauer() {
        return this.o00000.StringString();
    }

    @Override
    public boolean istImprovisierteWaffe() {
        return this.o00000.\u00d2\u00d50000();
    }

    @Override
    public boolean istModifiziert() {
        return false;
    }
}

