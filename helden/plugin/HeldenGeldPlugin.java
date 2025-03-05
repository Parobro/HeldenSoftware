/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.framework.geld.GeldBoerse;
import helden.framework.geld.WaehrungsCollection;
import helden.plugin.HeldenPlugin;
import javax.swing.JFrame;

@Deprecated
public interface HeldenGeldPlugin
extends HeldenPlugin {
    public static final String GELD = "Geld plugin";

    public void doWork(JFrame var1, GeldBoerse var2, WaehrungsCollection var3);
}

