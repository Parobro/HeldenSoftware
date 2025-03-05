/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginTalent;
import helden.plugin.datenplugin.DatenPluginZauber;
import java.util.ArrayList;

public interface DatenPluginSonderfertigkeit {
    public int getArt();

    public ArrayList<String> getSettings();

    public String getSpezialisierung();

    public DatenPluginTalent getTSTalent();

    public DatenPluginZauber getTSZauber();

    public boolean istElfenlied();

    public boolean istFernkampfsonderfertigkeit();

    public boolean istGelaendekunde();

    public boolean istHexenfluch();

    public boolean istIntern();

    public boolean istKampfSonderfertigkeit();

    public boolean istKlerikal();

    public boolean istLiturgie();

    public boolean istLiturgiekenntnis();

    public boolean istMagisch();

    public boolean istManoever();

    public boolean istMerkmalskenntnis();

    public boolean istNahkampfsonderfertigkeit();

    public boolean istRepraesentation();

    public boolean istRitual();

    public boolean istSchamanenRitualkenntnis();

    public boolean istTalentspezialisierung();

    public boolean istWaffenloseKampfstil();

    public String toString();
}

