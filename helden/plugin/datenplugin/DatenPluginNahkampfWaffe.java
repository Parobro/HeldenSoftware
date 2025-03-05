/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginTalent;
import java.util.ArrayList;

public interface DatenPluginNahkampfWaffe {
    public int getAttacke();

    public DatenPluginTalent getBenutztesTalent();

    public String getBezeichner();

    public int[] getBF();

    public String[] getDistanzklasse();

    public int[] getEndTP();

    public int getINIMod();

    public ArrayList<DatenPluginTalent> getKampfTalente();

    public int[] getKoerperkraftzuschlag();

    public String getName();

    public int getParade();

    public DatenPluginTalent[] getTalente();

    public int[] getTrefferpunkte();

    public int getWaffenNummer();

    public int getWmAT();

    public int getWmPA();

    public boolean isSchadensartAusdauer();

    public boolean istImprovisierteWaffe();

    public boolean istModifiziert();

    public String toString();
}

