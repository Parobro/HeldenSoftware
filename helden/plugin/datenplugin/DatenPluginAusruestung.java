/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginFernkampfWaffe;
import helden.plugin.datenplugin.DatenPluginNahkampfWaffe;
import helden.plugin.datenplugin.DatenPluginRuestungsTeil;
import helden.plugin.datenplugin.DatenPluginSchildParadewaffe;

public interface DatenPluginAusruestung {
    public int getAusweichen();

    public DatenPluginFernkampfWaffe[] getFernkampfWaffen();

    public DatenPluginRuestungsTeil getGesammtRuestung();

    public int getGSNachBE();

    public int getIniNachBE();

    public int getKomboMitSchildParadewaffe(DatenPluginNahkampfWaffe var1);

    public DatenPluginNahkampfWaffe[] getNahkampfWaffen();

    public int getRaufenParade();

    public String getRaufenTP();

    public int getRauferAttacke();

    public int getRingenAttacke();

    public int getRingenParade();

    public String getRingenTP();

    public DatenPluginRuestungsTeil[] getRuestungsTeile();

    public DatenPluginSchildParadewaffe[] getSchildParadewaffe();

    public int getWundschwelle();

    public boolean istZonenRuestungsBerechnung();
}

