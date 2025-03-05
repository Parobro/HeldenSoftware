/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.werteplugin.PluginHeld;
import helden.plugin.werteplugin.PluginHeldenWerteWerkzeug;
import javax.swing.JFrame;

@Deprecated
public interface HeldenWertePlugin
extends HeldenPlugin {
    public static final String DATEN = "werte execute";

    public void doWork(JFrame var1, PluginHeld[] var2, PluginHeldenWerteWerkzeug var3);
}

