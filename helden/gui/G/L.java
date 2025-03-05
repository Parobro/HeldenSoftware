/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.gui.G.P;
import helden.gui.components.JScrollPaneFast;
import helden.model.profession.KeineWahl;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class L
extends JPanel {
    private JPanel void;
    private JPanel Object;
    private Map<JToggleButton, helden.framework.int.P> \u00d500000;
    private Map<JToggleButton, helden.framework.int.P> \u00d200000;
    private ArrayList<ButtonGroup> \u00d600000;
    private P o00000;
    private JScrollPaneFast \u00d400000;

    public L(P p2) {
        this.o00000 = p2;
        this.\u00d500000 = new HashMap<JToggleButton, helden.framework.int.P>();
        this.\u00d200000 = new HashMap<JToggleButton, helden.framework.int.P>();
        this.\u00d600000 = new ArrayList();
        this.setName("Varianten-Panel");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d200000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        this.\u00d400000 = new JScrollPaneFast(this.\u00d400000());
        this.add((Component)this.\u00d400000, "East");
        this.\u00d400000.setVisible(false);
    }

    public void super(helden.framework.int.P p2, boolean bl) {
        this.super(p2, 0, bl);
    }

    public void super(helden.framework.int.P p2, int n, boolean bl) {
        JToggleButton jToggleButton;
        while (n >= this.\u00d600000.size()) {
            this.\u00d600000.add(new ButtonGroup());
        }
        boolean bl2 = this.\u00d600000.get(n).getButtonCount() == 0;
        StringBuffer stringBuffer = new StringBuffer(p2.toString());
        stringBuffer.append(" (");
        stringBuffer.append(p2.getGPKosten());
        stringBuffer.append(" GP)");
        String string = stringBuffer.toString();
        if (p2.istOptional()) {
            jToggleButton = new JCheckBox(string);
        } else {
            jToggleButton = new JRadioButton(string);
            this.\u00d600000.get(n).add(jToggleButton);
        }
        jToggleButton.setSelected(bl);
        jToggleButton.addActionListener(this.o00000);
        jToggleButton.setName(p2.toString());
        jToggleButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        if (n == 0) {
            this.\u00d200000().add(jToggleButton);
            this.\u00d500000.put(jToggleButton, p2);
        } else {
            if (bl2) {
                JLabel jLabel = p2.istOptional() ? new JLabel("Optionale Varianten: ") : new JLabel("Eine Varianten muss gew\u00e4hlt werden: ");
                int n2 = 25;
                if (n == 1) {
                    n2 = 5;
                }
                jLabel.setBorder(BorderFactory.createEmptyBorder(n2, 5, 5, 0));
                this.\u00d400000().add(jLabel);
            }
            this.\u00d400000.setVisible(true);
            this.\u00d400000().add(jToggleButton);
            this.\u00d200000.put(jToggleButton, p2);
        }
        if (!p2.istOptional() && bl2) {
            jToggleButton.setSelected(true);
            jToggleButton.doClick();
        }
    }

    public void super() {
        this.\u00d400000().removeAll();
        while (this.\u00d600000.size() > 1) {
            this.\u00d600000.remove(1);
        }
        this.\u00d200000.clear();
        this.\u00d400000.setVisible(false);
    }

    public void class() {
        JLabel jLabel = new JLabel(" ");
        jLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        this.\u00d200000().add(jLabel);
    }

    public Vector<helden.framework.int.P> \u00d300000() {
        helden.framework.int.P p2;
        Vector<helden.framework.int.P> vector = new Vector<helden.framework.int.P>();
        for (JToggleButton jToggleButton : this.\u00d500000.keySet()) {
            if (!jToggleButton.isSelected()) continue;
            p2 = this.\u00d200000(jToggleButton);
            vector.addElement(p2);
        }
        for (JToggleButton jToggleButton : this.\u00d200000.keySet()) {
            if (!jToggleButton.isSelected() || (p2 = this.\u00d200000(jToggleButton)) instanceof KeineWahl) continue;
            vector.addElement(p2);
        }
        return vector;
    }

    public helden.framework.int.P \u00d200000(JToggleButton jToggleButton) {
        helden.framework.int.P p2 = this.\u00d500000.get(jToggleButton);
        if (p2 == null) {
            p2 = this.\u00d200000.get(jToggleButton);
        }
        return p2;
    }

    public boolean super(JToggleButton jToggleButton) {
        return this.\u00d500000.get(jToggleButton) != null;
    }

    private JPanel \u00d400000() {
        if (this.Object == null) {
            this.Object = new JPanel();
            this.Object.setLayout(new BoxLayout(this.Object, 1));
            this.Object.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
        return this.Object;
    }

    private JPanel \u00d200000() {
        if (this.void == null) {
            this.void = new JPanel();
            this.void.setLayout(new BoxLayout(this.void, 1));
            this.void.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
        return this.void;
    }
}

