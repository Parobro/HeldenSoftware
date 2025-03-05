/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

import helden.plugin.werteplugin.PluginTalent;

public interface PluginFernkampfWaffe {
    public int getLaden();

    public String getMunitionsArt();

    public int[] getReichweite();

    public PluginTalent getTalent();

    public int[] getTrefferpunkte();

    public int[] getTrefferpunkteModifikation();

    public String toString();
}

