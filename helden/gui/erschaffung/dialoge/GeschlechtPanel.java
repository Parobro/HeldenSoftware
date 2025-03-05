/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.gui.components.SpinnerNumberModelSafe;
import helden.gui.erschaffung.HauptDialog;
import helden.gui.erschaffung.zustaende.GeschlechtZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GeschlechtPanel
extends JPanel {
    private JRadioButton \u00d300000;
    private JRadioButton class;
    private GeschlechtZustand super;
    private JSpinner \u00d600000;
    private JSpinner \u00d400000;
    private JSpinner \u00d200000;

    public GeschlechtPanel(GeschlechtZustand geschlechtZustand) {
        this.super = geschlechtZustand;
        this.setLayout(new BorderLayout());
        this.add((Component)this.\u00d200000(), "Center");
    }

    public JSpinner getEigenschaftsMax() {
        if (this.\u00d200000 == null) {
            SpinnerNumberModelSafe spinnerNumberModelSafe = new SpinnerNumberModelSafe(Einstellungen.getInstance().getEigenschaftenMaximum(), 12, 18, 1);
            this.\u00d200000 = new JSpinner(spinnerNumberModelSafe);
            this.\u00d200000.setName("GPEigenschaftsMax");
            this.\u00d200000.setPreferredSize(new Dimension(140, 22));
            this.\u00d200000.addChangeListener(new ChangeListener(){

                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    GeschlechtPanel.this.super.setMaxEigenschaft((Integer)GeschlechtPanel.this.\u00d200000.getValue());
                }
            });
            this.super.setMaxEigenschaft(Einstellungen.getInstance().getEigenschaftenMaximum());
        }
        return this.\u00d200000;
    }

    public JSpinner getGP() {
        if (this.\u00d400000 == null) {
            SpinnerNumberModelSafe spinnerNumberModelSafe = new SpinnerNumberModelSafe(Einstellungen.getInstance().getGPStartwert(), 80, 160, 1);
            this.\u00d400000 = new JSpinner(spinnerNumberModelSafe);
            this.\u00d400000.setName("GPSpinner");
            this.\u00d400000.setPreferredSize(new Dimension(140, 22));
            this.\u00d400000.addChangeListener(new ChangeListener(){

                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    GeschlechtPanel.this.super.setMaxGP((Integer)GeschlechtPanel.this.\u00d400000.getValue());
                }
            });
            this.super.setMaxGP(Einstellungen.getInstance().getGPStartwert());
        }
        return this.\u00d400000;
    }

    public JRadioButton getMaennlichButton() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JRadioButton("m\u00e4nnlich");
            this.\u00d300000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    GeschlechtPanel.this.super.setGeschlecht(Geschlecht.\u00d400000);
                }
            });
        }
        return this.\u00d300000;
    }

    public JRadioButton getWeiblichButton() {
        if (this.class == null) {
            this.class = new JRadioButton("weiblich");
            this.class.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    GeschlechtPanel.this.super.setGeschlecht(Geschlecht.\u00d300000);
                }
            });
        }
        return this.class;
    }

    private JSpinner super() {
        if (this.\u00d600000 == null) {
            SpinnerNumberModelSafe spinnerNumberModelSafe = new SpinnerNumberModelSafe(Einstellungen.getInstance().getMaxEigenschaftenGP(), 80, 160, 1);
            this.\u00d600000 = new JSpinner(spinnerNumberModelSafe);
            this.\u00d600000.setName("maxgpeigenschaften");
            this.\u00d600000.setPreferredSize(new Dimension(140, 22));
            this.\u00d600000.addChangeListener(new ChangeListener(){

                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    GeschlechtPanel.this.super.setMaxGPEigenscahft((Integer)GeschlechtPanel.this.\u00d600000.getValue());
                }
            });
            this.super.setMaxGPEigenscahft(Einstellungen.getInstance().getMaxEigenschaftenGP());
        }
        return this.\u00d600000;
    }

    private JPanel \u00d200000() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.getMaennlichButton());
        buttonGroup.add(this.getWeiblichButton());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        int n = 1;
        jPanel.add((Component)new JLabel("Einstellungen f\u00fcr die Erschaffung:"), HauptDialog.getConstraints(0, n, 3));
        jPanel.add((Component)new JLabel("max GP:"), HauptDialog.getConstraints(0, ++n, 1));
        GridBagConstraints gridBagConstraints = HauptDialog.getConstraints(1, n, 1);
        gridBagConstraints.anchor = 10;
        jPanel.add((Component)this.getGP(), gridBagConstraints);
        jPanel.add((Component)new JLabel("Standard: 110"), HauptDialog.getConstraints(2, n, 1));
        jPanel.add((Component)new JLabel("max Eigenschaft-GP:"), HauptDialog.getConstraints(0, ++n, 1));
        GridBagConstraints gridBagConstraints2 = HauptDialog.getConstraints(1, n, 1);
        gridBagConstraints2.anchor = 10;
        jPanel.add((Component)this.super(), gridBagConstraints2);
        jPanel.add((Component)new JLabel("Standard: 100"), HauptDialog.getConstraints(2, n, 1));
        jPanel.add((Component)new JLabel("Eigenschaftsmax:"), HauptDialog.getConstraints(0, ++n, 1));
        GridBagConstraints gridBagConstraints3 = HauptDialog.getConstraints(1, n, 1);
        gridBagConstraints3.anchor = 10;
        jPanel.add((Component)this.getEigenschaftsMax(), gridBagConstraints3);
        jPanel.add((Component)new JLabel("Standard: 14"), HauptDialog.getConstraints(2, n, 1));
        jPanel.add((Component)new JLabel(" "), HauptDialog.getConstraints(2, ++n, 1));
        jPanel.add((Component)new JLabel(" "), HauptDialog.getConstraints(2, ++n, 1));
        jPanel.add((Component)new JLabel("W\u00e4hle das Geschlecht f\u00fcr deinen Helden:"), HauptDialog.getConstraints(0, ++n, 3));
        jPanel.add((Component)this.\u00d300000, HauptDialog.getConstraints(0, ++n, 1));
        jPanel.add((Component)this.class, HauptDialog.getConstraints(0, ++n, 1));
        return jPanel;
    }
}

