/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.gui.G.Q;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class float
extends JPanel {
    private Q \u00d400000;
    private JPanel \u00f400000;
    private GridBagLayout \u00d500000;
    private GridBagConstraints \u00f500000;
    private GridBagConstraints \u00d800000;
    private GridBagConstraints \u00d300000;
    private GridBagConstraints return;
    private int OO0000;
    private HashMap<String, JCheckBox> new;
    private JPanel o00000 = new JPanel();
    private Icon \u00f800000;
    private String if;

    public float(Q q) {
        this.\u00d400000 = q;
        this.setName("Talente-Panel");
        this.setLayout(new BorderLayout());
        this.new = new HashMap();
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d300000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        this.if = "";
    }

    public void o00000(String string) {
        this.\u00f500000.gridy = this.OO0000;
        JLabel jLabel = new JLabel(string);
        jLabel.setFont(new Font("Serif", 1, 30));
        this.\u00d800000.gridy = this.OO0000++;
        jLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        this.\u00d500000.setConstraints(jLabel, this.\u00d800000);
        this.\u00d300000().add(jLabel);
    }

    public void o00000(voidsuper voidsuper2, boolean bl, boolean bl2, int n) {
        JComponent jComponent;
        if (!voidsuper2.getArt().toString().equals(this.if)) {
            this.o00000(voidsuper2.getArt().toString());
            this.if = voidsuper2.getArt().toString();
        }
        this.\u00f500000.gridy = this.OO0000;
        if (bl2) {
            jComponent = this.o00000();
            this.\u00d500000.setConstraints(jComponent, this.\u00f500000);
            this.\u00d300000().add(jComponent);
        }
        jComponent = new JCheckBox(voidsuper2.toString());
        jComponent.setName(voidsuper2.toString());
        ((AbstractButton)jComponent).setSelected(bl);
        ((AbstractButton)jComponent).setEnabled(!bl2);
        ((AbstractButton)jComponent).addItemListener(this.\u00d400000);
        jComponent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        jComponent.setToolTipText("Talent aktivieren?");
        this.new.put(voidsuper2.toString(), (JCheckBox)jComponent);
        this.\u00d800000.gridy = this.OO0000;
        this.\u00d500000.setConstraints(jComponent, this.\u00d800000);
        this.\u00d300000().add(jComponent);
        this.\u00d300000.gridy = this.OO0000;
        JSpinner jSpinner = new JSpinner();
        if (voidsuper2 instanceof G) {
            jSpinner.setModel(new SpinnerNumberModel(0, 0, ((G)voidsuper2).\u00f5\u00f40000(), 1));
        } else {
            jSpinner.setModel(new SpinnerNumberModel(0, -10, 50, 1));
        }
        jSpinner.setName(voidsuper2.toString());
        jSpinner.addChangeListener(this.\u00d400000);
        jSpinner.setValue(n);
        jSpinner.setToolTipText("Talentwert");
        this.\u00d300000.insets.right = 5;
        this.\u00d500000.setConstraints(jSpinner, this.\u00d300000);
        this.\u00d300000().add(jSpinner);
        this.\u00d500000.setConstraints(this.o00000, this.\u00d300000);
        this.\u00d300000().add(this.o00000);
        if (voidsuper2 instanceof G) {
            int n2 = ((G)voidsuper2).\u00f5\u00f40000();
            JLabel jLabel = new JLabel("Max: " + n2);
            this.return.gridy = this.OO0000;
            if (n2 > 0) {
                this.\u00d500000.setConstraints(jLabel, this.return);
                this.\u00d300000().add(jLabel);
            }
        }
        ++this.OO0000;
    }

    public void \u00d200000() {
        this.\u00f500000.gridy = this.OO0000;
        JLabel jLabel = new JLabel("Aktiviert");
        JLabel jLabel2 = new JLabel("TaW");
        this.\u00d800000.gridy = this.OO0000;
        this.\u00d500000.setConstraints(jLabel, this.\u00d800000);
        this.\u00d300000().add(jLabel);
        this.\u00d300000.gridy = this.OO0000++;
        this.\u00d300000.insets.right = 5;
        this.\u00d500000.setConstraints(jLabel2, this.\u00d300000);
        this.\u00d300000().add(jLabel2);
        this.\u00d500000.setConstraints(this.o00000, this.\u00d300000);
        this.\u00d300000().add(this.o00000);
    }

    public JCheckBox \u00d200000(String string) {
        return this.new.get(string);
    }

    private JLabel o00000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/FingerRight.gif")));
        }
        JLabel jLabel = new JLabel(this.\u00f800000);
        jLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        jLabel.setToolTipText("empfohlen");
        return jLabel;
    }

    private JPanel \u00d300000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JPanel();
            this.\u00d500000 = new GridBagLayout();
            this.\u00f400000.setLayout(this.\u00d500000);
            this.\u00f400000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            this.\u00f500000 = new GridBagConstraints();
            this.\u00f500000.weightx = 0.0;
            this.\u00f500000.gridx = 0;
            this.\u00f500000.anchor = 17;
            this.\u00d800000 = new GridBagConstraints();
            this.\u00d800000.weightx = 1.0;
            this.\u00d800000.gridx = 1;
            this.\u00d800000.anchor = 17;
            this.\u00d300000 = new GridBagConstraints();
            this.\u00d300000.weightx = 0.5;
            this.\u00d300000.gridx = 2;
            this.\u00d300000.fill = 2;
            this.return = new GridBagConstraints();
            this.return.weightx = 0.0;
            this.return.gridx = 3;
            this.return.anchor = 17;
            this.OO0000 = 0;
        }
        return this.\u00f400000;
    }
}

