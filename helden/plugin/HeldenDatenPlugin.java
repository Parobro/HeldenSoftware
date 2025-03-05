/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenBasisPlugin;
import helden.plugin.datenplugin.DatenPluginHeldenWerkzeug;
import helden.plugin.werteplugin2.PluginHeld2;
import javax.swing.JFrame;

public interface HeldenDatenPlugin
extends HeldenBasisPlugin {
    public static final String HELDENDATEN = "daten execute";

    public void doWork(JFrame var1, PluginHeld2[] var2, DatenPluginHeldenWerkzeug var3);

    public void initTab(DatenPluginHeldenWerkzeug var1);
}

