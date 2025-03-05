/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.C.I;
import helden.framework.Monat;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.a.oooo_2;
import helden.gui.allgemein.AussehenBarbeitenController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.Oo00;
import helden.gui.oooo_1;
import helden.model.rasse.Achaz;
import helden.model.rasse.Goblin;
import helden.model.rasse.Ork;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AussehenBearbeitenPanel
extends JPanel {
    private JTextField[] o00000;
    private JButton \u00f400000;
    private JButton OO0000;
    private GridBagLayout \u00d500000;
    private GridBagConstraints[] \u00d200000 = new GridBagConstraints[4];
    private AussehenBarbeitenController \u00d400000;
    private int float;
    private JComboBox[] \u00f500000;
    private JSpinner[] \u00d600000;
    private JSpinner[] void;
    private JSpinner oO0000;
    private JCheckBox Object = new JCheckBox();
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f600000;

    public AussehenBearbeitenPanel(Oo00 oo00, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00d500000 = new GridBagLayout();
        this.o00000();
        this.\u00f500000 = new JComboBox[4];
        this.\u00d600000 = new JSpinner[2];
        this.void = new JSpinner[2];
        this.o00000 = new JTextField[13];
        this.setLayout(new BorderLayout());
        this.\u00d400000 = new AussehenBarbeitenController(this, oo00, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.\u00f600000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.addInhalt();
        this.createNavigationsPanel();
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o\u00d20000() instanceof Ork || oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o\u00d20000() instanceof Achaz || oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o\u00d20000() instanceof Goblin) {
            this.Object.setEnabled(false);
        }
    }

    public void addInhalt() {
        JLabel jLabel;
        int n;
        JPanel jPanel = new JPanel();
        this.getComboBox(1);
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d500000);
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Tag");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel2, this.\u00d200000[0]);
        jPanel.add(jLabel2);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getGeburtstagSpinner(0), this.\u00d200000[1]);
        jPanel.add(this.getGeburtstagSpinner(0));
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Monat");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel3, this.\u00d200000[0]);
        jPanel.add(jLabel3);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getComboBox(3), this.\u00d200000[1]);
        jPanel.add(this.getComboBox(3));
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Jahr");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel4, this.\u00d200000[0]);
        jPanel.add(jLabel4);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getGeburtstagSpinner(1), this.\u00d200000[1]);
        jPanel.add(this.getGeburtstagSpinner(1));
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Kalender");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel5, this.\u00d200000[0]);
        jPanel.add(jLabel5);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getComboBox(2), this.\u00d200000[1]);
        jPanel.add(this.getComboBox(2));
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Alter");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel6, this.\u00d200000[0]);
        jPanel.add(jLabel6);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getAlterSpinner(), this.\u00d200000[1]);
        jPanel.add(this.getAlterSpinner());
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("Gr\u00f6\u00dfe");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel7, this.\u00d200000[0]);
        jPanel.add(jLabel7);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getGroessenSpinner(0), this.\u00d200000[1]);
        jPanel.add(this.getGroessenSpinner(0));
        JLabel jLabel8 = new JLabel();
        jLabel8.setText("Gewicht");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel8, this.\u00d200000[0]);
        jPanel.add(jLabel8);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getGroessenSpinner(1), this.\u00d200000[1]);
        jPanel.add(this.getGroessenSpinner(1));
        JLabel jLabel9 = new JLabel();
        jLabel9.setText("Haarfarbe");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel9, this.\u00d200000[0]);
        jPanel.add(jLabel9);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getComboBox(0), this.\u00d200000[1]);
        jPanel.add(this.getComboBox(0));
        JLabel jLabel10 = new JLabel();
        jLabel10.setText("Alternative Farben");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel10, this.\u00d200000[0]);
        jPanel.add(jLabel10);
        this.\u00d200000[1].gridy = this.float++;
        this.Object.setText("Farbauswahl von Jolinar aktivieren");
        this.Object.addActionListener(this.\u00d400000);
        this.\u00d500000.setConstraints(this.Object, this.\u00d200000[1]);
        jPanel.add(this.Object);
        JLabel jLabel11 = new JLabel();
        jLabel11.setText("Augenfarbe");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel11, this.\u00d200000[0]);
        jPanel.add(jLabel11);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getComboBox(1), this.\u00d200000[1]);
        jPanel.add(this.getComboBox(1));
        JLabel jLabel12 = new JLabel();
        jLabel12.setText("Tarnidentit\u00e4t");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel12, this.\u00d200000[0]);
        jPanel.add(jLabel12);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getTextField(12), this.\u00d200000[1]);
        this.getTextField(12).setName("Tarnidentit\u00e4t");
        this.getTextField(12).setText(this.\u00f600000.thissuper().\u00d300000());
        jPanel.add(this.getTextField(12));
        JLabel jLabel13 = new JLabel();
        jLabel13.setText("Stand");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel13, this.\u00d200000[0]);
        jPanel.add(jLabel13);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getTextField(0), this.\u00d200000[1]);
        this.getTextField(0).setName("Stand");
        this.getTextField(0).setText(this.\u00f600000.thissuper().getStand());
        jPanel.add(this.getTextField(0));
        JLabel jLabel14 = new JLabel();
        jLabel14.setText("Titel");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel14, this.\u00d200000[0]);
        jPanel.add(jLabel14);
        this.\u00d200000[1].gridy = this.float++;
        this.\u00d500000.setConstraints(this.getTextField(1), this.\u00d200000[1]);
        jPanel.add(this.getTextField(1));
        this.getTextField(1).setName("Titel");
        this.getTextField(1).setText(this.\u00f600000.thissuper().getTitel());
        String[] stringArray = this.\u00f600000.thissuper().getAussehenText();
        for (n = 1; n < 5; ++n) {
            jLabel = new JLabel();
            jLabel.setText("Aussehen " + n);
            this.\u00d200000[0].gridy = this.float;
            this.\u00d500000.setConstraints(jLabel, this.\u00d200000[0]);
            jPanel.add(jLabel);
            this.\u00d200000[1].gridy = this.float++;
            this.\u00d500000.setConstraints(this.getTextField(n + 1), this.\u00d200000[1]);
            this.getTextField(n + 1).setText(stringArray[n - 1]);
            this.getTextField(n + 1).setName("Aussehen " + n);
            jPanel.add(this.getTextField(n + 1));
        }
        stringArray = this.\u00f600000.thissuper().getFamilieText();
        for (n = 1; n < 7; ++n) {
            jLabel = new JLabel();
            jLabel.setText("Familie / Herkunft" + n);
            this.\u00d200000[0].gridy = this.float;
            this.\u00d500000.setConstraints(jLabel, this.\u00d200000[0]);
            jPanel.add(jLabel);
            this.\u00d200000[1].gridy = this.float++;
            this.\u00d500000.setConstraints(this.getTextField(n + 5), this.\u00d200000[1]);
            this.getTextField(n + 5).setText(stringArray[n - 1]);
            this.getTextField(n + 5).setName("Familie / Herkunft" + n);
            jPanel.add(this.getTextField(n + 5));
        }
        JLabel jLabel15 = new JLabel();
        jLabel15.setText("GP-Werte:");
        this.\u00d200000[0].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel15, this.\u00d200000[0]);
        jPanel.add(jLabel15);
        jLabel = new JLabel();
        jLabel.setText(this.\u00f600000.thissuper().getGpWerte());
        this.\u00d200000[1].gridy = this.float;
        this.\u00d500000.setConstraints(jLabel, this.\u00d200000[1]);
        jPanel.add(jLabel);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void addJolinarFarben() {
        this.\u00f500000[0].removeAllItems();
        String[] stringArray = new String[]{"wei\u00df-blond", "blond", "gold-blond", "Aschblond", "rot-blond", "dunkelblond", "hellbraun", "nussbraun", "feuerrot", "kirschrot", "mittelbraun", "braun-rot", "Mahagoni", "dunkelbraun", "schwarz", "schwarz-blau", "schwarz-rot", "wei\u00df", "silber", "silbergrau", "grau", "dunkelgrau", "blausilbern", "cremefarben", "strohblond", "kastanienbraun"};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.\u00f500000[0].addItem(stringArray[i2]);
            if (!this.\u00f600000.thissuper().getHaarFarbe().equals(stringArray[i2])) continue;
            this.\u00f500000[0].setSelectedIndex(i2);
        }
        if (!this.\u00f500000[0].getSelectedItem().equals(this.\u00f600000.thissuper().getHaarFarbe())) {
            this.\u00f500000[0].addItem(this.\u00f600000.thissuper().getHaarFarbe());
            this.\u00f500000[0].setSelectedItem(this.\u00f600000.thissuper().getHaarFarbe());
        }
        String[] stringArray2 = new String[]{"blau", "gr\u00fcn", "grau", "schwarz", "braun", "dunkelbraun", "braungr\u00fcn", "graublau", "veilchenblau", "saphirblau", "smaragdgr\u00fcn", "amethystfarben", "bernsteingelb", "silbergrau", "eisgrau", "goldgesprenkelt", "rubinrot", "violett", "citringelb", "granat(dunkel)rot"};
        for (int i3 = 0; i3 < stringArray2.length; ++i3) {
            this.\u00f500000[1].addItem(stringArray2[i3]);
            if (!this.\u00f600000.thissuper().getAugenFarbe().equals(stringArray2[i3])) continue;
            this.\u00f500000[1].setSelectedIndex(i3);
        }
        if (!this.\u00f500000[1].getSelectedItem().equals(this.\u00f600000.thissuper().getAugenFarbe())) {
            this.\u00f500000[1].addItem(this.\u00f600000.thissuper().getAugenFarbe());
            this.\u00f500000[1].setSelectedItem(this.\u00f600000.thissuper().getAugenFarbe());
        }
        if (this.\u00f600000.\u00d500000().\u00d400000(I.\u00f40O000)) {
            this.\u00f500000[0].addItem("wei\u00df");
            this.\u00f500000[0].setSelectedItem("wei\u00df");
            this.\u00f500000[0].setEditable(false);
        }
    }

    public void addRassenFarben() {
        this.\u00f500000[0].removeAllItems();
        ArrayList<helden.framework.held.a.oooo_1> arrayList = this.\u00d400000.getHeld().o\u00d20000().getHaarfarben();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            this.\u00f500000[0].addItem(arrayList.get(i2).String());
            if (!this.\u00f600000.thissuper().getHaarFarbe().equals(arrayList.get(i2).String())) continue;
            this.\u00f500000[0].setSelectedIndex(i2);
        }
        if (arrayList.isEmpty()) {
            this.\u00f500000[0].addItem("-");
        }
        this.\u00f500000[0].setName("haarfarbe");
        if (!this.\u00f500000[0].getSelectedItem().equals(this.\u00f600000.thissuper().getHaarFarbe())) {
            this.\u00f500000[0].addItem(this.\u00f600000.thissuper().getHaarFarbe());
            this.\u00f500000[0].setSelectedItem(this.\u00f600000.thissuper().getHaarFarbe());
        }
        this.\u00f500000[1].removeAllItems();
        ArrayList<helden.framework.held.a.oooo_1> arrayList2 = this.\u00d400000.getHeld().o\u00d20000().getAugenfarben();
        for (int i3 = 0; i3 < arrayList2.size(); ++i3) {
            this.\u00f500000[1].addItem(arrayList2.get(i3).String());
            if (!this.\u00f600000.thissuper().getAugenFarbe().equals(arrayList2.get(i3).String())) continue;
            this.\u00f500000[1].setSelectedIndex(i3);
        }
        if (arrayList.isEmpty()) {
            this.\u00f500000[1].addItem("-");
        }
        if (this.\u00f600000.\u00d500000().\u00d400000(I.\u00f40O000)) {
            this.\u00f500000[0].addItem("wei\u00df");
            this.\u00f500000[0].setSelectedItem("wei\u00df");
            this.\u00f500000[0].setEditable(false);
            this.\u00f500000[0].setEnabled(false);
            this.\u00f500000[1].addItem("rot");
            this.\u00f500000[1].setSelectedItem("rot");
            this.\u00f500000[1].setEditable(false);
            this.\u00f500000[1].setEnabled(false);
        }
        this.\u00f500000[1].setName("augenfarbe");
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
        if (this.OO0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.OO0000 = new JButton("Abbrechen", imageIcon);
            this.OO0000.setName("Abbrechen");
            this.OO0000.addActionListener(this.\u00d400000);
        }
        return this.OO0000;
    }

    public JSpinner getAlterSpinner() {
        if (this.oO0000 == null) {
            this.oO0000 = new JSpinner();
            this.oO0000.setModel(new SpinnerNumberModel(this.\u00f600000.thissuper().\u00d200000(), this.\u00f600000.thissuper().\u00d200000(), 400, 1));
        }
        return this.oO0000;
    }

    public JCheckBox getAuswahlBox() {
        return this.Object;
    }

    public JComboBox getComboBox(int n) {
        if (this.\u00f500000[n] == null) {
            this.\u00f500000[n] = new JComboBox();
            if (n == 0) {
                this.addRassenFarben();
            }
            if (n == 1) {
                ArrayList<helden.framework.held.a.oooo_1> arrayList = this.\u00d400000.getHeld().o\u00d20000().getAugenfarben();
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    this.\u00f500000[n].addItem(arrayList.get(i2).String());
                    if (!this.\u00f600000.thissuper().getAugenFarbe().equals(arrayList.get(i2).String())) continue;
                    this.\u00f500000[n].setSelectedIndex(i2);
                }
                if (arrayList.isEmpty()) {
                    this.\u00f500000[n].addItem("-");
                }
                if (this.\u00f600000.\u00d500000().\u00d400000(I.\u00f40O000)) {
                    this.\u00f500000[n].addItem("rot");
                    this.\u00f500000[n].setSelectedItem("rot");
                    this.\u00f500000[n].setEditable(false);
                    this.\u00f500000[n].setEnabled(false);
                }
                this.\u00f500000[n].setName("augenfarbe");
            }
            if (n == 2) {
                this.\u00f500000[2].addItem(oooo_2.\u00d800000.toString());
                this.\u00f500000[2].addItem(oooo_2.\u00d400000.toString());
                this.\u00f500000[2].addItem(oooo_2.new.toString());
                this.\u00f500000[2].addItem(oooo_2.return.toString());
                this.\u00f500000[2].addItem(oooo_2.if.toString());
                this.\u00f500000[2].addItem(oooo_2.\u00f400000.toString());
                this.\u00f500000[2].setSelectedItem(this.\u00f600000.thissuper().super().Object().toString());
                this.\u00f500000[2].setName("kalender");
                this.\u00f500000[2].addActionListener(this.\u00d400000);
            }
            if (n == 3) {
                for (int i3 = 0; i3 < 12; ++i3) {
                    this.\u00f500000[3].addItem(Monat.get(i3 + 1).toString());
                }
                this.\u00f500000[3].addItem("Namenlose Tage");
                String string = this.\u00f600000.thissuper().super().\u00d200000().toString();
                if (string.equals(Monat.\u00d400000.toString())) {
                    this.\u00f500000[3].setSelectedItem("Namenlose Tage");
                } else {
                    this.\u00f500000[3].setSelectedItem(string);
                }
                this.\u00f500000[3].setName("monat");
                if (this.\u00f600000.\u00d500000().if()) {
                    this.\u00f500000[3].setEnabled(false);
                    this.\u00f500000[3].setToolTipText("Sie haben ein G\u00f6ttergeschenk");
                }
            }
        }
        return this.\u00f500000[n];
    }

    public AussehenBarbeitenController getController() {
        return this.\u00d400000;
    }

    public JSpinner getGeburtstagSpinner(int n) {
        if (this.void[n] == null) {
            if (n == 0) {
                this.void[n] = new JSpinner();
                this.void[n].setModel(new SpinnerNumberModel(this.\u00f600000.thissuper().super().o00000(), 1, 30, 1));
                this.void[n].setName("Tag");
                if (this.\u00f600000.\u00d500000().if()) {
                    this.void[n].setEnabled(false);
                    this.void[n].setToolTipText("Sie haben ein G\u00f6ttergeschenk");
                }
            } else {
                this.void[n] = new JSpinner();
                this.void[n].setModel(new SpinnerNumberModel(this.\u00f600000.thissuper().super().\u00d400000(), -10000, 10000, 1));
                this.void[n].setName("Jahr");
            }
        }
        return this.void[n];
    }

    public JSpinner getGroessenSpinner(int n) {
        if (this.\u00d600000[n] == null) {
            if (n == 0) {
                this.\u00d600000[n] = new JSpinner();
                this.\u00d600000[n].setModel(new SpinnerNumberModel(this.\u00f600000.thissuper().getGroesse(), this.\u00f600000.o\u00d20000().getMinGroesse(), this.\u00f600000.o\u00d20000().getMaxGroesse(), 1));
                this.\u00d600000[n].setName("Gr\u00f6\u00dfe");
            } else {
                this.\u00d600000[n] = new JSpinner();
                if (this.\u00f600000.o00000(I.\u00f8\u00d2o000)) {
                    this.\u00d600000[n].setModel(new SpinnerNumberModel(this.\u00f600000.thissuper().getGewicht(true), (int)((double)this.\u00f600000.o\u00d20000().getMinGewicht() * 1.75), (int)((double)this.\u00f600000.o\u00d20000().getMaxGewicht() * 1.75), 1));
                } else {
                    this.\u00d600000[n].setModel(new SpinnerNumberModel(this.\u00f600000.thissuper().getGewicht(false), this.\u00f600000.o\u00d20000().getMinGewicht(), this.\u00f600000.o\u00d20000().getMaxGewicht(), 1));
                }
                this.\u00d600000[n].setName("Gewicht");
            }
        }
        return this.\u00d600000[n];
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

    public JTextField getTextField(int n) {
        if (this.o00000[n] == null) {
            this.o00000[n] = new JTextField();
        }
        return this.o00000[n];
    }

    private void o00000() {
        this.float = 0;
        this.\u00d200000[0] = new GridBagConstraints();
        this.\u00d200000[0].gridx = 0;
        this.\u00d200000[0].anchor = 13;
        this.\u00d200000[0].insets.top = 3;
        this.\u00d200000[0].insets.bottom = 2;
        this.\u00d200000[0].insets.right = 3;
        this.\u00d200000[0].insets.left = 5;
        this.\u00d200000[1] = new GridBagConstraints();
        this.\u00d200000[1].weightx = 1.0;
        this.\u00d200000[1].gridx = 1;
        this.\u00d200000[1].anchor = 17;
        this.\u00d200000[1].fill = 1;
        this.\u00d200000[1].insets.top = 3;
        this.\u00d200000[1].insets.bottom = 2;
        this.\u00d200000[1].insets.right = 5;
        this.\u00d200000[2] = new GridBagConstraints();
        this.\u00d200000[2].weightx = 1.0;
        this.\u00d200000[2].gridx = 1;
        this.\u00d200000[2].anchor = 17;
        this.\u00d200000[2].insets.top = 3;
        this.\u00d200000[2].insets.bottom = 2;
        this.\u00d200000[2].insets.right = 1;
        this.\u00d200000[3] = new GridBagConstraints();
        this.\u00d200000[3].weightx = 1.0;
        this.\u00d200000[3].gridx = 3;
        this.\u00d200000[3].anchor = 17;
        this.\u00d200000[3].insets.top = 3;
        this.\u00d200000[3].insets.bottom = 2;
        this.\u00d200000[3].insets.right = 1;
    }
}

