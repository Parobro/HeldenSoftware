/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.datenxmlplugin.DatenAustauschImpl;
import helden.plugin.werteplugin2.PluginHeld2;
import helden.plugin.werteplugin3.PluginHeldenWerteWerkzeug3;
import java.util.ArrayList;
import javax.swing.JFrame;

@Deprecated
public interface HeldenWertePlugin3
extends HeldenPlugin {
    public static final String DATEN3 = "werte3 execute";

    public void doWork(JFrame var1, Integer var2, DatenAustauschImpl var3);

    public void doWork(JFrame var1, PluginHeld2[] var2, PluginHeldenWerteWerkzeug3 var3);

    public ArrayList<String> getUntermenus();
}

