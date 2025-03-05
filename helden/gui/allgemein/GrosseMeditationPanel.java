/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.GrosseMeditationController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GrosseMeditationPanel
extends JPanel {
    private JCheckBox \u00d300000;
    private JButton \u00d800000;
    private JButton int;
    private GridBagLayout class;
    private GridBagConstraints[] \u00d200000 = new GridBagConstraints[4];
    private GrosseMeditationController \u00d400000;
    private int \u00f400000;
    private JSpinner \u00d600000;
    private String super;

    public GrosseMeditationPanel(AbstractAction abstractAction, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, boolean bl) {
        this.class = new GridBagLayout();
        this.o00000();
        this.setLayout(new BorderLayout());
        this.\u00d400000 = new GrosseMeditationController(this, abstractAction, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, bl);
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.class);
        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("SE:"));
        this.\u00d300000 = new JCheckBox();
        this.\u00d300000.setName("gm");
        this.\u00d300000.setToolTipText("Inoffiziel");
        jPanel2.add(this.\u00d300000);
        this.\u00d200000[0].gridy = this.\u00f400000;
        this.class.setConstraints(jPanel2, this.\u00d200000[0]);
        jPanel.add(jPanel2);
        JLabel jLabel = new JLabel(this.super);
        this.\u00d200000[1].gridy = this.\u00f400000;
        this.class.setConstraints(jLabel, this.\u00d200000[1]);
        jPanel.add(jLabel);
        this.\u00d200000[2].gridy = this.\u00f400000++;
        this.class.setConstraints(this.\u00d600000, this.\u00d200000[2]);
        jPanel.add(this.\u00d600000);
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
        if (this.int == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.int = new JButton("Abbrechen", imageIcon);
            this.int.setName("Abbrechen");
            this.int.addActionListener(this.\u00d400000);
        }
        return this.int;
    }

    public GrosseMeditationController getController() {
        return this.\u00d400000;
    }

    public JButton getOkButton() {
        if (this.\u00d800000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d800000 = new JButton("OK", imageIcon);
            this.\u00d800000.setName("OK");
            this.\u00d800000.addActionListener(this.\u00d400000);
        }
        return this.\u00d800000;
    }

    public JSpinner getRkp() {
        return this.\u00d600000;
    }

    public JSpinner getRkPSppinner(int n) {
        this.\u00d600000 = new JSpinner();
        this.\u00d600000.setModel(new SpinnerNumberModel(0, 0, n, 1));
        return this.\u00d600000;
    }

    public JCheckBox getSeCheckBox() {
        return this.\u00d300000;
    }

    public void setTalentString(String string) {
        this.super = string;
    }

    private void o00000() {
        this.\u00f400000 = 0;
        this.\u00d200000[0] = new GridBagConstraints();
        this.\u00d200000[0].gridx = 0;
        this.\u00d200000[0].anchor = 13;
        this.\u00d200000[0].insets.top = 3;
        this.\u00d200000[0].insets.bottom = 2;
        this.\u00d200000[0].insets.right = 3;
        this.\u00d200000[0].insets.left = 5;
        this.\u00d200000[1] = new GridBagConstraints();
        this.\u00d200000[1].gridx = 1;
        this.\u00d200000[1].anchor = 13;
        this.\u00d200000[1].insets.top = 3;
        this.\u00d200000[1].insets.bottom = 2;
        this.\u00d200000[1].insets.right = 5;
        this.\u00d200000[2] = new GridBagConstraints();
        this.\u00d200000[2].gridx = 2;
        this.\u00d200000[2].anchor = 17;
        this.\u00d200000[2].insets.top = 3;
        this.\u00d200000[2].insets.bottom = 2;
        this.\u00d200000[2].insets.right = 1;
        this.\u00d200000[3] = new GridBagConstraints();
        this.\u00d200000[3].gridx = 3;
        this.\u00d200000[3].anchor = 17;
        this.\u00d200000[3].insets.top = 3;
        this.\u00d200000[3].insets.bottom = 2;
        this.\u00d200000[3].insets.right = 1;
    }
}

