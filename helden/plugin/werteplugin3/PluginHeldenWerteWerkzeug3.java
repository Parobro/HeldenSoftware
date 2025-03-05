/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin3;

import helden.framework.geld.GeldBoerse;
import helden.framework.geld.WaehrungsCollection;
import helden.plugin.werteplugin.PluginAusruestung;
import helden.plugin.werteplugin.PluginHeld;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin.PluginVorteil;
import helden.plugin.werteplugin.PluginZauberInfo;
import helden.plugin.werteplugin2.PluginAusruestung2;
import helden.plugin.werteplugin2.PluginGegenstand;
import helden.plugin.werteplugin2.PluginTreeNode;
import helden.plugin.werteplugin3.PluginZauber3;
import java.util.ArrayList;

public interface PluginHeldenWerteWerkzeug3 {
    public int getAttacke(PluginTalent var1);

    public PluginAusruestung getAusruestung();

    public PluginAusruestung2 getAusruestung2();

    public String getBasisKomplexitaet(PluginZauber3 var1);

    public String[] getEigenschaftsbezeichner();

    public int getEigenschaftswert(String var1);

    public int getEingestzteAbenteuerpunkte();

    public PluginGegenstand[] getGegenstand(String var1);

    public GeldBoerse getGeldBoerse();

    public int getGeschwindigkeit();

    public String[] getGruppenPath();

    public String getHeldenID();

    public ArrayList<String> getHeldenInventarAlsString();

    public ArrayList<String> getInventarAlsString();

    public String getKommentar(PluginSonderfertigkeit var1);

    public String getKommentar(PluginVorteil var1);

    public String getLernKomplexitaet(PluginZauber3 var1);

    public int getParade(PluginTalent var1);

    public String getPfadZumPortrait();

    public int getRassenGeschwindigkeit();

    public PluginHeld getSelectesHeld();

    public PluginSonderfertigkeit getSonderfertigkeit(String var1);

    public String[] getSonderfertigkeitenAlsString();

    public String getSprachKomplexitaet(PluginTalent var1);

    public PluginTalent getTalent(String var1);

    public String[] getTalenteAlsString();

    public int getTalentwert(PluginTalent var1);

    public PluginTreeNode getTreeRoot();

    public int getVerfuegbareAbenteuerpunkte();

    public PluginVorteil getVorteil(String var1);

    public String[] getVorteileAlsString();

    public WaehrungsCollection getWaehrungen();

    public PluginZauber3 getZauber(String var1, String var2);

    public String[][] getZauberAlsString();

    public PluginZauberInfo getZauberInfo(PluginZauber3 var1);

    public void setAktivenHeld(PluginHeld var1);
}

