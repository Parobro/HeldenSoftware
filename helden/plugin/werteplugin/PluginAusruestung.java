/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

import helden.plugin.werteplugin.PluginFernkampfWaffe;
import helden.plugin.werteplugin.PluginNahkampfWaffe;
import helden.plugin.werteplugin.PluginParadeWaffe;
import helden.plugin.werteplugin.PluginRuestungsTeil;
import helden.plugin.werteplugin.PluginSchild;

public interface PluginAusruestung {
    public PluginFernkampfWaffe[] getFernkampfWaffen();

    public PluginRuestungsTeil getGesammtRuestung(PluginRuestungsTeil[] var1);

    public PluginNahkampfWaffe[] getNahkampfWaffen();

    public PluginParadeWaffe[] getParadeWaffen();

    public PluginRuestungsTeil[] getRuestungsTeile();

    public PluginSchild[] getSchilde();
}

