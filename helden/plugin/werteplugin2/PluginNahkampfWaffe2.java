/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2;

import helden.plugin.werteplugin.PluginNahkampfWaffe;
import helden.plugin.werteplugin.PluginTalent;

public interface PluginNahkampfWaffe2
extends PluginNahkampfWaffe {
    public int getAttacke();

    public PluginTalent getBenutztesTalent();

    public int[] getBF();

    public int[] getEndTP();

    public int getINIMod();

    public String getName();

    public int getParade();

    public int getWaffenNummer();
}

