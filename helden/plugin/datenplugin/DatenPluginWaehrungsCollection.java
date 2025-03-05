/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginWaehrung;
import java.util.Collection;

public interface DatenPluginWaehrungsCollection {
    public Collection<DatenPluginWaehrung> getAllWaehrungen();

    public Collection<String> getAllWaehrungenBezeichner();

    public DatenPluginWaehrung getWaehrungen(String var1);
}

