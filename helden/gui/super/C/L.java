/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.gui.super.C.OoOO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class L
extends JPanel {
    private JButton \u00d800000 = null;
    private JButton \u00d200000 = null;
    private JSpinner \u00d500000 = null;
    private JSpinner \u00d300000 = null;
    private JTextField String = null;
    private JComboBox \u00d600000 = null;
    private OoOO o00000;

    public L(OoOO ooOO2) {
        this.o00000 = ooOO2;
        this.null();
    }

    public JButton \u00d200000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JButton();
            this.\u00d200000.addActionListener(this.o00000);
            this.\u00d200000.setText("Abbrechen");
        }
        return this.\u00d200000;
    }

    public JSpinner \u00f500000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JSpinner();
        }
        return this.\u00d300000;
    }

    public JSpinner \u00d600000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSpinner();
        }
        return this.\u00d500000;
    }

    public JPanel \u00d500000() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanel.add((Component)this.String(), null);
        jPanel.add((Component)this.\u00d200000(), null);
        return jPanel;
    }

    public JButton String() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JButton();
            this.\u00d800000.addActionListener(this.o00000);
            this.\u00d800000.setText("OK");
        }
        return this.\u00d800000;
    }

    public JComboBox \u00d800000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JComboBox();
        }
        return this.\u00d600000;
    }

    public JTextField o00000() {
        if (this.String == null) {
            this.String = new JTextField();
            this.String.setEditable(false);
        }
        return this.String;
    }

    private JPanel \u00d300000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridx = 2;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 3;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.anchor = 13;
        gridBagConstraints2.gridy = 1;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 4;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridy = 1;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 2;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.gridy = 1;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.anchor = 13;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridy = 0;
        JLabel jLabel = new JLabel();
        jLabel.setText("Kampftalent:");
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("akt. BF:");
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("min. BF:");
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Waffe:");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        jPanel.add((Component)jLabel4, gridBagConstraints5);
        gridBagConstraints5.gridy = 1;
        jPanel.add((Component)jLabel3, gridBagConstraints5);
        gridBagConstraints5.gridy = 2;
        jPanel.add((Component)this.\u00d600000(), gridBagConstraints4);
        jPanel.add((Component)this.\u00f500000(), gridBagConstraints3);
        jPanel.add((Component)jLabel2, gridBagConstraints2);
        jPanel.add((Component)this.o00000(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        jPanel.add((Component)this.\u00d800000(), gridBagConstraints);
        jPanel.add((Component)jLabel, gridBagConstraints5);
        return jPanel;
    }

    private void null() {
        this.setLayout(new BorderLayout());
        this.setSize(300, 200);
        this.add((Component)this.\u00d300000(), "Center");
        this.add((Component)this.\u00d500000(), "South");
    }
}

