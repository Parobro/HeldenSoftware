/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public interface HeldenBasisPlugin {
    public static final String BASIS = "basis execute";

    public int compareVersion(String var1);

    public void doWork(JFrame var1);

    public ImageIcon getIcon();

    public String getMenuName();

    public String getToolTipText();

    public String getType();

    public String getVersion();
}

