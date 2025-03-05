/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.framework.held.K;
import helden.framework.held.O;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.B.A;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class P
extends JPanel {
    private JButton \u00f400000;
    private JButton void;
    private A \u00d500000;
    private JPanel \u00f600000 = null;
    private JRadioButton[] \u00d600000 = null;
    private JTextField[] \u00f500000 = null;
    private JTextField[] Object = null;
    private JPanel \u00d200000;
    private int o00000;
    private ButtonGroup \u00d400000;

    public P(O o, K k2, F[] fArray) {
        this.o00000 = fArray.length;
        this.\u00d600000 = new JRadioButton[this.o00000];
        this.\u00f500000 = new JTextField[this.o00000];
        this.Object = new JTextField[this.o00000];
        this.setSize(300, 200);
        this.setLayout(new BorderLayout());
        this.\u00d500000 = new A(o, k2, fArray, this);
        this.add((Component)this.\u00d300000(), "South");
    }

    public JPanel \u00d300000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JPanel();
            this.\u00d200000.setName("Navigationspanel");
            this.\u00d200000.setLayout(new FlowLayout());
            this.\u00d200000.add(this.\u00d400000());
            this.\u00d200000.add(this.super());
            this.\u00d200000.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
        return this.\u00d200000;
    }

    public JButton super() {
        if (this.\u00f400000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00f400000 = new JButton("Abbrechen", imageIcon);
            this.\u00f400000.setName("Abbrechen");
            this.\u00f400000.addActionListener(this.\u00d500000);
        }
        return this.\u00f400000;
    }

    public void super(F[] fArray) {
        this.\u00d400000 = new ButtonGroup();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 2;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.weightx = 0.8;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridx = 1;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridy = 1;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 2;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridy = 0;
        JLabel jLabel = new JLabel();
        jLabel.setText("Anzahl");
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridy = 0;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Name");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridy = 0;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Wahl");
        this.\u00f600000 = new JPanel();
        this.\u00f600000.setLayout(new GridBagLayout());
        this.\u00f600000.add((Component)jLabel3, gridBagConstraints6);
        this.\u00f600000.add((Component)jLabel2, gridBagConstraints5);
        this.\u00f600000.add((Component)jLabel, gridBagConstraints4);
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            gridBagConstraints3.gridy = i2 + 1;
            gridBagConstraints2.gridy = i2 + 1;
            gridBagConstraints.gridy = i2 + 1;
            this.\u00f600000.add((Component)this.super(i2), gridBagConstraints3);
            this.\u00d400000.add(this.super(i2));
            this.\u00f600000.add((Component)this.\u00d300000(i2), gridBagConstraints2);
            this.\u00d300000(i2).setText(fArray[i2].OO0000());
            this.\u00f600000.add((Component)this.\u00d200000(i2), gridBagConstraints);
            this.\u00d200000(i2).setText("" + fArray[i2].\u00f500000());
        }
        this.add((Component)new JScrollPaneFast(this.\u00f600000), "Center");
    }

    public A \u00d200000() {
        return this.\u00d500000;
    }

    public JButton \u00d400000() {
        if (this.void == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.void = new JButton("OK", imageIcon);
            this.void.setName("OK");
            this.void.addActionListener(this.\u00d500000);
        }
        return this.void;
    }

    public JRadioButton super(int n) {
        if (this.\u00d600000[n] == null) {
            this.\u00d600000[n] = new JRadioButton();
            this.\u00d600000[n].addActionListener(this.\u00d500000);
        }
        return this.\u00d600000[n];
    }

    private JTextField \u00d200000(int n) {
        if (this.Object[n] == null) {
            this.Object[n] = new JTextField();
            this.Object[n].setEditable(false);
        }
        return this.Object[n];
    }

    private JTextField \u00d300000(int n) {
        if (this.\u00f500000[n] == null) {
            this.\u00f500000[n] = new JTextField();
            this.\u00f500000[n].setEditable(false);
        }
        return this.\u00f500000[n];
    }
}

