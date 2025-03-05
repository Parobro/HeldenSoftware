/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.werteplugin2.PluginAusruestung2;
import helden.plugin.werteplugin2.PluginGegenstand;
import java.util.ArrayList;

@Deprecated
public interface PluginHeldenAusruestungWerkzeug {
    public PluginAusruestung2 getAusruestung2();

    public PluginGegenstand[] getGegenstand(String var1);

    public String getHeldenID();

    public ArrayList<String> getHeldenInventarAlsString();
}

