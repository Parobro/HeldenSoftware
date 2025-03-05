/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.gui.G.g;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from helden.gui.G.o0Oo
 */
public class o0oo_0
extends JPanel {
    public static final String \u00d200000 = "Alle";
    public static final String String = "Nur m\u00f6gliche";
    public static final String \u00d500000 = "Nur \u00fcbliche";
    private JList \u00d600000;
    private JPanel o00000;
    private Map<String, JCheckBox> \u00d300000;

    public o0oo_0() {
        this.setName("Modifizierer-Panel");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d200000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        this.add((Component)this.o00000(), "South");
        this.\u00d300000 = new HashMap<String, JCheckBox>();
    }

    public void o00000(String string, String string2) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        JCheckBox jCheckBox = new JCheckBox(string2);
        jCheckBox.setName(string);
        jPanel.setBorder(new EmptyBorder(2, 5, 3, 10));
        jPanel.add((Component)jCheckBox, "Center");
        this.o00000().add(jPanel);
        this.\u00d300000.put(string, jCheckBox);
    }

    public void \u00d300000(String string) {
        this.\u00d300000.get(string).setEnabled(true);
    }

    public void String(String string) {
        JCheckBox jCheckBox = this.\u00d300000.get(string);
        jCheckBox.setEnabled(false);
        jCheckBox.setSelected(false);
    }

    public JCheckBox \u00d200000(String string) {
        return this.\u00d300000.get(string);
    }

    public JList \u00d200000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JList();
            this.\u00d600000.setSelectionMode(0);
            this.\u00d600000.setCellRenderer(new g());
        }
        return this.\u00d600000;
    }

    public boolean o00000(String string) {
        JCheckBox jCheckBox = this.\u00d300000.get(string);
        return jCheckBox.isSelected();
    }

    private JPanel o00000() {
        if (this.o00000 == null) {
            this.o00000 = new JPanel();
            this.o00000.setLayout(new BoxLayout(this.o00000, 1));
        }
        return this.o00000;
    }
}

