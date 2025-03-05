/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginFernkampfWaffe;
import helden.plugin.datenplugin.DatenPluginGegenstand;
import helden.plugin.datenplugin.DatenPluginNahkampfWaffe;
import helden.plugin.datenplugin.DatenPluginRuestungsTeil;
import helden.plugin.datenplugin.DatenPluginSchildParadewaffe;
import helden.plugin.datenplugin.DatenPluginTalent;
import java.util.ArrayList;

public interface DatenPluginAusreustungWerkzeug {
    public boolean addGegenstand(DatenPluginGegenstand var1, int var2);

    public boolean addRuestungsteil(int var1, DatenPluginRuestungsTeil var2);

    public boolean aendereAnzahl(DatenPluginGegenstand var1, int var2);

    public ArrayList<DatenPluginFernkampfWaffe> getFernkampfwaffen(DatenPluginGegenstand var1);

    public ArrayList<DatenPluginNahkampfWaffe> getNahkampfwaffen(DatenPluginGegenstand var1);

    public ArrayList<DatenPluginRuestungsTeil> getRuestungsteil(DatenPluginGegenstand var1);

    public ArrayList<DatenPluginSchildParadewaffe> getSchildParadewaffe(DatenPluginGegenstand var1);

    public boolean removeGegenstand(DatenPluginGegenstand var1, int var2);

    public boolean removeRuestungsteil(int var1, DatenPluginRuestungsTeil var2);

    public boolean setBeidhaendigerKampfSlot12(int var1, boolean var2);

    public boolean setBeidhaendigerKampfSlot34(int var1, boolean var2);

    public boolean setBenutzeHand(int var1, int var2, boolean var3);

    public boolean setFernkampfWaffe(int var1, int var2, DatenPluginFernkampfWaffe var3);

    public boolean setKombination(int var1, int var2, int var3, boolean var4);

    public boolean setNahkampfWaffe(int var1, int var2, DatenPluginNahkampfWaffe var3);

    public boolean setSchildParadefWaffe(int var1, int var2, DatenPluginSchildParadewaffe var3);

    public boolean waehleSchildParadewaffeArt(boolean var1);

    public boolean weahleNahkampftalent(int var1, int var2, DatenPluginTalent var3);

    public boolean wirdBenutzt(DatenPluginGegenstand var1);
}

