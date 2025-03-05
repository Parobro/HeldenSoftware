/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.datenxmlplugin.DatenAustauschImpl;
import java.util.ArrayList;
import javax.swing.JFrame;

public interface HeldenXMLDatenPlugin
extends HeldenPlugin {
    public static final String DATEN = "DatenXMLPlugin";

    public void doWork(JFrame var1, Integer var2, DatenAustauschImpl var3);

    public ArrayList<String> getUntermenus();
}

