/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.framework.held.O;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.B.void;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class null
extends JPanel {
    private JButton \u00d300000;
    private JButton null;
    private void \u00d200000;
    private JPanel String = null;
    private JTextField o00000 = null;
    private JSpinner \u00d800000 = null;
    private JSpinner \u00d600000 = null;
    private F \u00d500000;

    public null(O o, F f2) {
        this.\u00d500000 = f2;
        this.\u00d200000 = new void(o, f2, this);
        this.\u00d800000();
    }

    public void \u00f500000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d200000());
        jPanel.add(this.o00000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton o00000() {
        if (this.\u00d300000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00d300000 = new JButton("Abbrechen", imageIcon);
            this.\u00d300000.setName("Abbrechen");
            this.\u00d300000.addActionListener(this.\u00d200000);
        }
        return this.\u00d300000;
    }

    public void String() {
        return this.\u00d200000;
    }

    public JTextField null() {
        if (this.o00000 == null) {
            this.o00000 = new JTextField();
            this.o00000.setText(this.\u00d500000.OO0000());
            this.o00000.setEditable(false);
        }
        return this.o00000;
    }

    public JButton \u00d200000() {
        if (this.null == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.null = new JButton("OK", imageIcon);
            this.null.setName("OK");
            this.null.addActionListener(this.\u00d200000);
        }
        return this.null;
    }

    public JSpinner \u00d500000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JSpinner();
            this.\u00d800000.setModel(new SpinnerNumberModel(this.\u00d500000.\u00f500000() - 1, 1, this.\u00d500000.\u00f500000() - 1, 1));
            this.\u00d800000.addChangeListener(this.\u00d200000);
        }
        return this.\u00d800000;
    }

    public JSpinner \u00d300000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JSpinner();
            this.\u00d600000.setModel(new SpinnerNumberModel(1, 1, this.\u00d500000.\u00f500000() - 1, 1));
            this.\u00d600000.addChangeListener(this.\u00d200000);
        }
        return this.\u00d600000;
    }

    private JPanel \u00d600000() {
        if (this.String == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.fill = 2;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.gridy = 2;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.fill = 2;
            gridBagConstraints2.weightx = 1.0;
            gridBagConstraints2.gridy = 1;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints3.anchor = 13;
            gridBagConstraints3.weightx = 0.0;
            gridBagConstraints3.gridy = 2;
            JLabel jLabel = new JLabel();
            jLabel.setText("Teil 2:");
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 0;
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints4.anchor = 13;
            gridBagConstraints4.weightx = 0.0;
            gridBagConstraints4.gridy = 1;
            JLabel jLabel2 = new JLabel();
            jLabel2.setText("Teil 1:");
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.fill = 2;
            gridBagConstraints5.gridy = 0;
            gridBagConstraints5.weightx = 1.0;
            gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints5.gridx = 1;
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints6.anchor = 13;
            gridBagConstraints6.weightx = 0.0;
            gridBagConstraints6.gridy = 0;
            JLabel jLabel3 = new JLabel();
            jLabel3.setText("Name");
            this.String = new JPanel();
            this.String.setLayout(new GridBagLayout());
            this.String.add((Component)jLabel3, gridBagConstraints6);
            this.String.add((Component)this.null(), gridBagConstraints5);
            this.String.add((Component)jLabel2, gridBagConstraints4);
            this.String.add((Component)jLabel, gridBagConstraints3);
            this.String.add((Component)this.\u00d500000(), gridBagConstraints2);
            this.String.add((Component)this.\u00d300000(), gridBagConstraints);
        }
        return this.String;
    }

    private void \u00d800000() {
        this.setSize(230, 180);
        this.setLayout(new BorderLayout());
        this.add((Component)new JScrollPaneFast(this.\u00d600000()), "Center");
        this.\u00f500000();
    }
}

