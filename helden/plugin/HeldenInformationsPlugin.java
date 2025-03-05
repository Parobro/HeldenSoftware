/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.informationsplugin.DatenContainer;
import java.util.ArrayList;
import javax.swing.JFrame;

@Deprecated
public interface HeldenInformationsPlugin
extends HeldenPlugin {
    public static final String DATEN = "DatenPlugin";

    public void doWork(JFrame var1, ArrayList<DatenContainer> var2, Integer var3, Integer var4);

    public boolean getAlleHelden();

    public ArrayList<String> getUntermenus();
}

