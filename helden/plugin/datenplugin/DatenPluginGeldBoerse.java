/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginMuenze;
import java.util.List;
import java.util.Vector;

public interface DatenPluginGeldBoerse {
    public void addMuenze(DatenPluginMuenze var1, int var2);

    public Vector<String> getGeldStrings();

    public int getMuenzAnzahl(DatenPluginMuenze var1);

    public List<DatenPluginMuenze> getMuenzenList();

    public void putMuenze(DatenPluginMuenze var1, int var2);
}

