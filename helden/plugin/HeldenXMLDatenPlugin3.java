/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import helden.plugin.datenxmlplugin.DatenAustausch3Interface;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;

public interface HeldenXMLDatenPlugin3
extends HeldenPlugin {
    public static final String DATEN = "DatenXMLPlugin3";

    public void click();

    public JComponent getPanel();

    public ArrayList<JComponent> getUntermenus();

    public boolean hatMenu();

    public boolean hatTab();

    public void init(DatenAustausch3Interface var1, JFrame var2);
}

