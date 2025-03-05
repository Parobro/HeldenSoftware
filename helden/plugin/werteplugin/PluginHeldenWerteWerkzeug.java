/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

import helden.framework.geld.GeldBoerse;
import helden.framework.geld.WaehrungsCollection;
import helden.plugin.werteplugin.PluginAusruestung;
import helden.plugin.werteplugin.PluginHeld;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin.PluginVorteil;
import helden.plugin.werteplugin.PluginZauber;
import java.util.ArrayList;

public interface PluginHeldenWerteWerkzeug {
    public int getAttacke(PluginTalent var1);

    public PluginAusruestung getAusruestung();

    public String[] getEigenschaftsbezeichner();

    public int getEigenschaftswert(String var1);

    public GeldBoerse getGeldBoerse();

    public ArrayList<String> getInventarAlsString();

    public int getParade(PluginTalent var1);

    public int getRassenGeschwindigkeit();

    public PluginHeld getSelectesHeld();

    public PluginSonderfertigkeit getSonderfertigkeit(String var1);

    public String[] getSonderfertigkeitenAlsString();

    public PluginTalent getTalent(String var1);

    public String[] getTalenteAlsString();

    public int getTalentwert(PluginTalent var1);

    public PluginVorteil getVorteil(String var1);

    public String[] getVorteileAlsString();

    public WaehrungsCollection getWaehrungen();

    public PluginZauber getZauber(String var1, String var2);

    public String[][] getZauberAlsString();

    public int getZauberfertigkeitswert(PluginZauber var1);

    public void setAktivenHeld(PluginHeld var1);
}

