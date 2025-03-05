/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.PluginHeldenAusruestungWerkzeug;
import helden.plugin.werteplugin.PluginHeld;
import javax.swing.JFrame;

@Deprecated
public interface HeldenAusruestungPlugin
extends HeldenPlugin {
    public static final String DATEN = "werte execute";

    public void doWork(JFrame var1, PluginHeld[] var2, PluginHeldenAusruestungWerkzeug var3);
}

