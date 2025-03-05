/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.allgemein.BildEinstellungenController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.$A;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BildEinstellungenPanel
extends JPanel {
    private JButton \u00f400000;
    private JButton oO0000;
    private GridBagLayout \u00d500000;
    private GridBagConstraints[] Object = new GridBagConstraints[3];
    private BildEinstellungenController \u00d400000;
    private int OO0000;
    private JSlider void;
    private JSlider \u00d2O0000;
    private JTextField \u00f500000;
    private JTextField \u00d600000;
    private JLabel float;
    private JLabel \u00f600000;
    private JToggleButton o00000;
    private JToggleButton \u00d200000;

    public BildEinstellungenPanel($A $A) {
        this.\u00d500000 = new GridBagLayout();
        this.o00000();
        this.setLayout(new BorderLayout());
        this.\u00d400000 = new BildEinstellungenController(this, $A);
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d500000);
        this.float = new JLabel();
        this.float.setText("Aufl\u00f6sung: ");
        this.Object[0].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.float, this.Object[0]);
        jPanel.add(this.float);
        this.Object[1].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.getAufloesung(), this.Object[1]);
        jPanel.add(this.getAufloesung());
        this.Object[2].gridy = this.OO0000++;
        this.\u00d500000.setConstraints(this.getAufloesungText(), this.Object[2]);
        jPanel.add(this.getAufloesungText());
        this.\u00f600000 = new JLabel();
        this.\u00f600000.setText("Quallit\u00e4t: ");
        this.Object[0].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.\u00f600000, this.Object[0]);
        jPanel.add(this.\u00f600000);
        this.Object[1].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.getQuallitaet(), this.Object[1]);
        jPanel.add(this.getQuallitaet());
        this.Object[2].gridy = this.OO0000++;
        this.\u00d500000.setConstraints(this.getQuallitaetText(), this.Object[2]);
        jPanel.add(this.getQuallitaetText());
        this.\u00f600000 = new JLabel();
        this.\u00f600000.setText("Grau oder Farbe");
        this.Object[0].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.\u00f600000, this.Object[0]);
        jPanel.add(this.\u00f600000);
        this.Object[1].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.getGrauToggleButton(), this.Object[1]);
        jPanel.add(this.getGrauToggleButton());
        this.Object[2].gridy = this.OO0000;
        this.\u00d500000.setConstraints(this.getFarbeToggleButton(), this.Object[2]);
        jPanel.add(this.getFarbeToggleButton());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void createNavigationsPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getOkButton());
        jPanel.add(this.getAbbrechenButton());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton getAbbrechenButton() {
        if (this.oO0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.oO0000 = new JButton("Abbrechen", imageIcon);
            this.oO0000.setName("Abbrechen");
            this.oO0000.addActionListener(this.\u00d400000);
        }
        return this.oO0000;
    }

    public JSlider getAufloesung() {
        if (this.void == null) {
            this.void = new JSlider();
            this.void.setName("Aufl\u00f6sung");
            this.void.setOrientation(0);
            this.void.setMaximum(3);
            this.void.setMinimum(1);
            this.void.setValue(1);
            this.void.setMinorTickSpacing(1);
            this.void.setSnapToTicks(true);
            this.void.setPaintTicks(true);
            this.void.addChangeListener(this.\u00d400000);
        }
        return this.void;
    }

    public JTextField getAufloesungText() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JTextField("800 x 600", 7);
            this.\u00f500000.setText("800 x 600");
            this.\u00f500000.setEditable(false);
            this.\u00f500000.setHorizontalAlignment(0);
        }
        return this.\u00f500000;
    }

    public BildEinstellungenController getController() {
        return this.\u00d400000;
    }

    public JToggleButton getFarbeToggleButton() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JToggleButton();
            this.\u00d200000.setName("Farbe");
            this.\u00d200000.setText("Farbe");
            this.\u00d200000.setSelected(!this.getGrauToggleButton().isSelected());
            this.\u00d200000.addChangeListener(this.\u00d400000);
        }
        return this.\u00d200000;
    }

    public JToggleButton getGrauToggleButton() {
        if (this.o00000 == null) {
            this.o00000 = new JToggleButton();
            this.o00000.setName("Grau");
            this.o00000.setText("Grau");
            this.o00000.setSelected(Einstellungen.getInstance().getGrau());
            this.o00000.addChangeListener(this.\u00d400000);
        }
        return this.o00000;
    }

    public JButton getOkButton() {
        if (this.\u00f400000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00f400000 = new JButton("OK", imageIcon);
            this.\u00f400000.setName("OK");
            this.\u00f400000.addActionListener(this.\u00d400000);
        }
        return this.\u00f400000;
    }

    public JSlider getQuallitaet() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JSlider();
            this.\u00d2O0000.setName("Quallit\u00e4t");
            this.\u00d2O0000.setOrientation(0);
            this.\u00d2O0000.setMaximum(3);
            this.\u00d2O0000.setMinimum(1);
            this.\u00d2O0000.setValue(1);
            this.\u00d2O0000.setMinorTickSpacing(1);
            this.\u00d2O0000.setSnapToTicks(true);
            this.\u00d2O0000.setPaintTicks(true);
            this.\u00d2O0000.addChangeListener(this.\u00d400000);
        }
        return this.\u00d2O0000;
    }

    public JTextField getQuallitaetText() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JTextField("niedrig", 7);
            this.\u00d600000.setText("niedrig");
            this.\u00d600000.setEditable(false);
            this.\u00d600000.setHorizontalAlignment(0);
        }
        return this.\u00d600000;
    }

    private void o00000() {
        this.OO0000 = 0;
        this.Object[0] = new GridBagConstraints();
        this.Object[0].gridx = 0;
        this.Object[0].anchor = 17;
        this.Object[0].insets.top = 3;
        this.Object[0].insets.bottom = 2;
        this.Object[0].insets.right = 5;
        this.Object[0].insets.left = 5;
        this.Object[1] = new GridBagConstraints();
        this.Object[1].weightx = 1.0;
        this.Object[1].gridx = 2;
        this.Object[1].fill = 17;
        this.Object[1].insets.top = 3;
        this.Object[1].insets.bottom = 2;
        this.Object[1].insets.right = 5;
        this.Object[2] = new GridBagConstraints();
        this.Object[2].gridx = 3;
        this.Object[2].weightx = 1.0;
        this.Object[2].anchor = 17;
        this.Object[2].insets.top = 3;
        this.Object[2].insets.bottom = 2;
        this.Object[2].fill = 13;
    }
}

