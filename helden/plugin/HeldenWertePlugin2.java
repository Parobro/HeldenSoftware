/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.werteplugin2.PluginHeld2;
import helden.plugin.werteplugin2.PluginHeldenWerteWerkzeug2;
import javax.swing.JFrame;

@Deprecated
public interface HeldenWertePlugin2
extends HeldenPlugin {
    public static final String DATEN2 = "werte2 execute";

    public void doWork(JFrame var1, PluginHeld2[] var2, PluginHeldenWerteWerkzeug2 var3);
}

