/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2;

import helden.plugin.werteplugin.PluginFernkampfWaffe;
import helden.plugin.werteplugin.PluginRuestungsTeil;
import helden.plugin.werteplugin2.PluginNahkampfWaffe2;
import helden.plugin.werteplugin2.PluginSchildParadewaffe;

public interface PluginAusruestung2 {
    public int getAusweichen();

    public PluginFernkampfWaffe[] getFernkampfWaffen();

    public PluginRuestungsTeil getGesammtRuestung();

    public int getKomboMitSchildParadewaffe(PluginNahkampfWaffe2 var1);

    public PluginNahkampfWaffe2[] getNahkampfWaffen();

    public int getRaufenParade();

    public String getRaufenTP();

    public int getRauferAttacke();

    public int getRingenAttacke();

    public int getRingenParade();

    public String getRingenTP();

    public PluginRuestungsTeil[] getRuestungsTeile();

    public PluginSchildParadewaffe[] getSchildParadewaffe();

    public boolean istZonenRuestungsBerechnung();
}

