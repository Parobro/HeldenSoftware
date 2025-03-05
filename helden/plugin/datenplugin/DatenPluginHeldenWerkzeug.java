/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginAusreustungWerkzeug;
import helden.plugin.datenplugin.DatenPluginAusruestung;
import helden.plugin.datenplugin.DatenPluginEreignisWerkzeug;
import helden.plugin.datenplugin.DatenPluginGegenstand;
import helden.plugin.datenplugin.DatenPluginGeldBoerse;
import helden.plugin.datenplugin.DatenPluginHeld;
import helden.plugin.datenplugin.DatenPluginSonderfertigkeit;
import helden.plugin.datenplugin.DatenPluginSteigernWerkzeug;
import helden.plugin.datenplugin.DatenPluginTalent;
import helden.plugin.datenplugin.DatenPluginTreeNode;
import helden.plugin.datenplugin.DatenPluginVorteil;
import helden.plugin.datenplugin.DatenPluginWaehrungsCollection;
import helden.plugin.datenplugin.DatenPluginZauber;
import helden.plugin.datenplugin.DatenPluginZauberInfo;
import java.util.ArrayList;
import java.util.HashMap;

public interface DatenPluginHeldenWerkzeug {
    public ArrayList<DatenPluginGegenstand> getAlleGegenstaende(boolean var1);

    public ArrayList<DatenPluginSonderfertigkeit> getAlleSonderfertigkeiten(boolean var1);

    public ArrayList<DatenPluginTalent> getAlleTalente(boolean var1);

    public ArrayList<DatenPluginVorteil> getAlleVorteile(boolean var1);

    public ArrayList<DatenPluginZauber> getAlleZauber(boolean var1);

    public int getAnzahlAusruestungen();

    public int getAttacke(DatenPluginTalent var1);

    public DatenPluginAusreustungWerkzeug getAusreustungWerkzeug(DatenPluginHeld var1);

    public DatenPluginAusruestung getAusruestung(int var1);

    public String getBasisKomplexitaet(DatenPluginZauber var1);

    public HashMap<String, String> getDatenVomHeld(DatenPluginHeld var1);

    public String[] getEigenschaftsbezeichner();

    public int getEigenschaftswert(String var1);

    public int getEingestzteAbenteuerpunkte();

    public DatenPluginEreignisWerkzeug getEreignisWerkzeug(DatenPluginHeld var1);

    public ArrayList<DatenPluginGegenstand> getGegenstaende();

    public DatenPluginGeldBoerse getGeldBoerse();

    public int getGeschwindigkeit();

    public String[] getGruppenPath();

    public String getHeldenID();

    public ArrayList<String> getInventarAlsString();

    public String getKommentar(DatenPluginSonderfertigkeit var1);

    public String getKommentar(DatenPluginVorteil var1);

    public String getLernKomplexitaet(DatenPluginZauber var1);

    public int getParade(DatenPluginTalent var1);

    public String getPfadZumPortrait();

    public int getRassenGeschwindigkeit();

    public DatenPluginHeld getSelectesHeld();

    public DatenPluginSonderfertigkeit getSonderfertigkeit(String var1);

    public String[] getSonderfertigkeitenAlsString();

    public String getSprachKomplexitaet(DatenPluginTalent var1);

    public DatenPluginSteigernWerkzeug getSteigernWerkzeug(DatenPluginHeld var1);

    public DatenPluginTalent getTalent(String var1);

    public String[] getTalenteAlsString();

    public int getTalentwert(DatenPluginTalent var1);

    public DatenPluginTreeNode getTreeRoot();

    public int getVerfuegbareAbenteuerpunkte();

    public DatenPluginVorteil getVorteil(String var1);

    public String[] getVorteileAlsString();

    public DatenPluginWaehrungsCollection getWaehrungen();

    public DatenPluginZauber getZauber(String var1, String var2);

    public String[][] getZauberAlsString();

    public DatenPluginZauberInfo getZauberInfo(DatenPluginZauber var1);

    public boolean legeDatenZumHeld(HashMap<String, String> var1, DatenPluginHeld var2);

    public void setAktivenHeld(DatenPluginHeld var1);

    public void setKommentar(DatenPluginSonderfertigkeit var1, String var2);

    public void setKommentar(DatenPluginVorteil var1, String var2);

    public boolean wirdGegenstandBenutzt(DatenPluginGegenstand var1);
}

