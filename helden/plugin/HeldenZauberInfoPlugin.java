/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginZauberInfo;
import javax.swing.JFrame;

@Deprecated
public interface HeldenZauberInfoPlugin
extends HeldenPlugin {
    public static final String ZAUBERINFO = "zauberinfo execute";

    public void doWork(JFrame var1, PluginZauberInfo[] var2, PluginSonderfertigkeit[] var3);
}

