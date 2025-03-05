/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2;

import helden.plugin.werteplugin.PluginHeldenWerteWerkzeug;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin.PluginVorteil;
import helden.plugin.werteplugin.PluginZauber;
import helden.plugin.werteplugin2.PluginAusruestung2;
import helden.plugin.werteplugin2.PluginGegenstand;
import helden.plugin.werteplugin2.PluginTreeNode;
import java.util.ArrayList;

public interface PluginHeldenWerteWerkzeug2
extends PluginHeldenWerteWerkzeug {
    public PluginAusruestung2 getAusruestung2();

    public String getBasisKomplexitaet(PluginZauber var1);

    public int getEingestzteAbenteuerpunkte();

    public PluginGegenstand[] getGegenstand(String var1);

    public int getGeschwindigkeit();

    public String[] getGruppenPath();

    public String getHeldenID();

    public ArrayList<String> getHeldenInventarAlsString();

    public String getKommentar(PluginSonderfertigkeit var1);

    public String getKommentar(PluginVorteil var1);

    public String getLernKomplexitaet(PluginZauber var1);

    public String getPfadZumPortrait();

    public String getSprachKomplexitaet(PluginTalent var1);

    public PluginTreeNode getTreeRoot();

    public int getVerfuegbareAbenteuerpunkte();
}

