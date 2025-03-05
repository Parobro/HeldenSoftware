/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

import helden.plugin.werteplugin.PluginTalent;
import java.util.ArrayList;

public interface PluginNahkampfWaffe {
    public String[] getDistanzklasse();

    public ArrayList<PluginTalent> getKampfTalente();

    public int[] getKoerperkraftzuschlag();

    public PluginTalent[] getTalente();

    public int[] getTrefferpunkte();

    public int getWmAT();

    public int getWmPA();

    public boolean isSchadensartAusdauer();

    public String toString();
}

