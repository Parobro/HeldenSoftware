/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import java.awt.print.Printable;
import javax.swing.JFrame;

@Deprecated
public interface HeldenPrintablePlugin
extends HeldenPlugin {
    public static final String PRINTABLE = "printable execute";

    public void doWork(JFrame var1, Printable var2);
}

