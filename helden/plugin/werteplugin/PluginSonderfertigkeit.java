/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

import helden.plugin.werteplugin.PluginTalent;

public interface PluginSonderfertigkeit {
    public int getArt();

    public String getSpezialisierung();

    public PluginTalent getTSTalent();

    public boolean istElfenlied();

    public boolean istFernkampfsonderfertigkeit();

    public boolean istGelaendekunde();

    public boolean istHexenfluch();

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

