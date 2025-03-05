/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.OoOO.voidsuper;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.G.B;
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
public class Oo0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends JPanel {
    private B \u00d300000;
    private JPanel \u00d800000;
    private GridBagLayout String;
    private GridBagConstraints null;
    private GridBagConstraints \u00d600000;
    private GridBagConstraints \u00d200000;
    private GridBagConstraints \u00d500000;
    private int \u00f500000;
    private JPanel o00000 = new JPanel();

    public Oo0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(B b) {
        this.\u00d300000 = b;
        this.setName("Leittalent-Auswahl");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.o00000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void o00000(KonkreterZauber konkreterZauber, boolean bl, boolean bl2) {
        this.null.gridy = this.\u00f500000;
        JCheckBox jCheckBox = new JCheckBox(konkreterZauber.toString());
        jCheckBox.setName(konkreterZauber.toString());
        jCheckBox.setSelected(bl);
        jCheckBox.setEnabled(!bl2);
        jCheckBox.addItemListener(this.\u00d300000);
        jCheckBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        this.\u00d600000.gridy = this.\u00f500000;
        this.String.setConstraints(jCheckBox, this.\u00d600000);
        this.o00000().add(jCheckBox);
        this.\u00d200000.gridy = this.\u00f500000;
        this.String.setConstraints(this.o00000, this.\u00d200000);
        this.o00000().add(this.o00000);
        this.\u00d500000.gridy = this.\u00f500000++;
    }

    public void o00000(voidsuper voidsuper2, boolean bl, boolean bl2) {
        this.null.gridy = this.\u00f500000;
        JCheckBox jCheckBox = new JCheckBox(voidsuper2.toString());
        jCheckBox.setName(voidsuper2.toString());
        jCheckBox.setSelected(bl);
        jCheckBox.setEnabled(!bl2);
        jCheckBox.addItemListener(this.\u00d300000);
        jCheckBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        this.\u00d600000.gridy = this.\u00f500000;
        this.String.setConstraints(jCheckBox, this.\u00d600000);
        this.o00000().add(jCheckBox);
        this.\u00d200000.gridy = this.\u00f500000;
        this.String.setConstraints(this.o00000, this.\u00d200000);
        this.o00000().add(this.o00000);
        this.\u00d500000.gridy = this.\u00f500000++;
    }

    private JPanel o00000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JPanel();
            this.String = new GridBagLayout();
            this.\u00d800000.setLayout(this.String);
            this.\u00d800000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            this.null = new GridBagConstraints();
            this.null.weightx = 0.0;
            this.null.gridx = 0;
            this.null.anchor = 17;
            this.\u00d600000 = new GridBagConstraints();
            this.\u00d600000.weightx = 1.0;
            this.\u00d600000.gridx = 1;
            this.\u00d600000.anchor = 17;
            this.\u00d200000 = new GridBagConstraints();
            this.\u00d200000.weightx = 0.5;
            this.\u00d200000.gridx = 2;
            this.\u00d200000.fill = 2;
            this.\u00d500000 = new GridBagConstraints();
            this.\u00d500000.weightx = 0.0;
            this.\u00d500000.gridx = 3;
            this.\u00d500000.anchor = 17;
            this.\u00f500000 = 0;
        }
        return this.\u00d800000;
    }
}

