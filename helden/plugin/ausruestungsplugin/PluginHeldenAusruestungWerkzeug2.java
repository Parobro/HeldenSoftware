/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.ausruestungsplugin;

import helden.plugin.werteplugin2.PluginAusruestung2;
import helden.plugin.werteplugin2.PluginGegenstand;
import helden.plugin.werteplugin2.PluginHeld2;
import java.util.ArrayList;

public interface PluginHeldenAusruestungWerkzeug2 {
    public void entferneGegenstand(String var1);

    public ArrayList<PluginGegenstand> getAlleGegenstaende();

    public PluginAusruestung2 getAusruestung2();

    public PluginGegenstand[] getGegenstand(String var1);

    public String getHeldenID();

    public ArrayList<String> getHeldenInventarAlsString();

    public void hinzufuegenGegenstand(String var1);

    public boolean isGegenstandBekannt(String var1);

    public void setHeld(PluginHeld2 var1);
}

