/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginMuenze;
import java.util.Iterator;

public interface DatenPluginWaehrung {
    public String getBezeichner();

    public DatenPluginWaehrung getClone();

    public Iterator<String> getMuenzBezeichner();

    public DatenPluginMuenze getMuenzen(String var1);

    public void setMuenzen(String var1, DatenPluginMuenze var2);
}

