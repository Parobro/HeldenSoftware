/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.ausruestungsplugin.PluginHeldenAusruestungWerkzeug2;
import helden.plugin.werteplugin2.PluginHeld2;
import javax.swing.JFrame;

@Deprecated
public interface HeldenAusruestungPlugin2
extends HeldenPlugin {
    public static final String AUSRUESTUNG = "ausruestung2 execute";

    public void doWork(JFrame var1, PluginHeld2[] var2, PluginHeldenAusruestungWerkzeug2 var3);
}

