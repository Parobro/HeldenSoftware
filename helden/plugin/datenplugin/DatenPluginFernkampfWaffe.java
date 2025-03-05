/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginTalent;
import java.util.List;

public interface DatenPluginFernkampfWaffe {
    public int getLaden();

    public String getMunitionsArt();

    public String getName();

    public int[] getReichweite();

    @Deprecated
    public DatenPluginTalent getTalent();

    public List<DatenPluginTalent> getTalente();

    public int[] getTrefferpunkte();

    public int[] getTrefferpunkteModifikation();

    public boolean istImprovisierteWaffe();

    public boolean istModifiziert();

    public String toString();
}

