/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public interface HeldenPlugin {
    public static final String SIMPLE = "simple execute";

    public void doWork(JFrame var1);

    public ImageIcon getIcon();

    public String getMenuName();

    public String getToolTipText();

    public String getType();
}

