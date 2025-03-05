/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.held.Object.private;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTabbedPane;

public class JTabbedPaneWithVisible
extends JTabbedPane {
    private HashMap<String, Component> \u00d200000 = new HashMap();
    private ArrayList<String> o00000 = new ArrayList();

    @Override
    public void addTab(String string, Component component) {
        super.addTab(string, component);
        this.\u00d200000.put(string, component);
        this.o00000.add(string);
    }

    public String getTabNameAt(int n) {
        return this.o00000.get(n);
    }

    public void setVisible(String string, Boolean bl) {
        Component component = this.\u00d200000.get(string);
        if (component == null) {
            private.\u00d200000("Tab " + string + " ist unbekannt", "alle");
            return;
        }
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.getTabCount(); ++i2) {
            if (!this.getComponent(i2).equals(component)) continue;
            bl2 = true;
            break;
        }
        if (bl2 == bl) {
            return;
        }
        if (bl.booleanValue()) {
            super.addTab(string, component);
        } else {
            super.remove(component);
        }
    }
}

