/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.gui.H.B;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OO
extends JPanel {
    private P \u00d300000;
    private Map<JToggleButton, P> \u00d500000;
    private ButtonGroup \u00d400000;
    private JButton return;
    private JButton new;
    private B o00000;

    public O0OO(AbstractAction abstractAction, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, super super_) {
        this.setLayout(new BorderLayout());
        this.\u00d500000 = new HashMap<JToggleButton, P>();
        this.\u00d400000 = new ButtonGroup();
        this.o00000 = new B(this, abstractAction, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.super(super_);
        this.\u00d300000();
        this.\u00d300000 = null;
    }

    public void super(super super_) {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        ArrayList<P> arrayList = super_.getAlleVarianten();
        Collections.sort(arrayList);
        for (P object2 : arrayList) {
            StringBuffer stringBuffer = new StringBuffer(object2.toString());
            String string = stringBuffer.toString();
            JRadioButton jRadioButton = new JRadioButton(string);
            this.\u00d400000.add(jRadioButton);
            jRadioButton.addActionListener(this.o00000);
            jRadioButton.setName(object2.toString());
            this.\u00d500000.put(jRadioButton, object2);
            jRadioButton.setSelected(true);
            jRadioButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
            jPanel.add(jRadioButton);
        }
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void \u00d300000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.class());
        jPanel.add(this.super());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton super() {
        if (this.new == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.new = new JButton("Abbrechen", imageIcon);
            this.new.setName("Abbrechen");
            this.new.addActionListener(this.o00000);
        }
        return this.new;
    }

    public P \u00d600000() {
        return this.\u00d300000;
    }

    public P \u00d400000() {
        for (JToggleButton jToggleButton : this.\u00d500000.keySet()) {
            if (!jToggleButton.isSelected()) continue;
            return this.\u00d500000.get(jToggleButton);
        }
        return null;
    }

    public B \u00d800000() {
        return this.o00000;
    }

    public JButton class() {
        if (this.return == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.return = new JButton("OK", imageIcon);
            this.return.setName("OK");
            this.return.addActionListener(this.o00000);
        }
        return this.return;
    }

    public void \u00d200000() {
        this.\u00d300000 = this.\u00d400000();
    }
}

