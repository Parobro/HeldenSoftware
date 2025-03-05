/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.OoOO.voidsuper;
import helden.gui.G.super;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class T
extends JPanel {
    private super \u00d300000;
    private JPanel \u00d800000;
    private GridBagLayout \u00d400000;
    private GridBagConstraints \u00f400000;
    private GridBagConstraints \u00d600000;
    private GridBagConstraints \u00d200000;
    private GridBagConstraints class;
    private int int;
    private JPanel super = new JPanel();

    public T(super super_) {
        this.\u00d300000 = super_;
        this.setName("Mirakeltalent-Auswahl");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.super());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void super(voidsuper voidsuper2, boolean bl, boolean bl2) {
        this.\u00f400000.gridy = this.int;
        JCheckBox jCheckBox = new JCheckBox(voidsuper2.toString());
        jCheckBox.setName(voidsuper2.toString());
        jCheckBox.setSelected(bl);
        jCheckBox.setEnabled(!bl2);
        jCheckBox.addItemListener(this.\u00d300000);
        jCheckBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        this.\u00d600000.gridy = this.int;
        this.\u00d400000.setConstraints(jCheckBox, this.\u00d600000);
        this.super().add(jCheckBox);
        this.\u00d200000.gridy = this.int;
        this.\u00d400000.setConstraints(this.super, this.\u00d200000);
        this.super().add(this.super);
        this.class.gridy = this.int++;
    }

    private JPanel super() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JPanel();
            this.\u00d400000 = new GridBagLayout();
            this.\u00d800000.setLayout(this.\u00d400000);
            this.\u00d800000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            this.\u00f400000 = new GridBagConstraints();
            this.\u00f400000.weightx = 0.0;
            this.\u00f400000.gridx = 0;
            this.\u00f400000.anchor = 17;
            this.\u00d600000 = new GridBagConstraints();
            this.\u00d600000.weightx = 1.0;
            this.\u00d600000.gridx = 1;
            this.\u00d600000.anchor = 17;
            this.\u00d200000 = new GridBagConstraints();
            this.\u00d200000.weightx = 0.5;
            this.\u00d200000.gridx = 2;
            this.\u00d200000.fill = 2;
            this.class = new GridBagConstraints();
            this.class.weightx = 0.0;
            this.class.gridx = 3;
            this.class.anchor = 17;
            this.int = 0;
        }
        return this.\u00d800000;
    }
}

