/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.b.super;

import helden.framework.E.C.B;
import helden.framework.E.F;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.super.B.super.OoOO
 */
public class oooo_0
extends JPanel {
    private JSpinner \u00d200000 = null;
    private JSpinner \u00d300000 = null;
    private JSpinner \u00d500000 = null;
    private JSpinner oO0000 = null;
    private JSpinner for = null;
    private JSpinner \u00f600000 = null;
    private JSpinner \u00d2O0000 = null;
    private JSpinner o00000 = null;
    private JSpinner \u00f500000 = null;
    private JSpinner String = null;
    private JSpinner null = null;
    private B \u00d600000;
    private JSpinner \u00f800000 = null;
    private JSpinner \u00d800000 = null;

    public oooo_0(F f2) {
        this.\u00d600000 = (B)f2.o00000(helden.framework.E.B.OO0000, 0);
        this.\u00f800000();
        this.super();
    }

    public boolean \u00d2O0000() {
        this.\u00d600000.\u00d300000((Integer)this.\u00d400000().getValue());
        this.\u00d600000.oO0000((Integer)this.\u00d4O0000().getValue());
        this.\u00d600000.\u00d2O0000((Integer)this.OO0000().getValue());
        this.\u00d600000.\u00d800000((Integer)this.\u00f400000().getValue());
        this.\u00d600000.\u00f800000((Integer)this.class().getValue());
        this.\u00d600000.\u00f500000((Integer)this.\u00d200000().getValue());
        this.\u00d600000.\u00d200000((Integer)this.\u00d3O0000().getValue());
        this.\u00d600000.String((Integer)this.\u00d800000().getValue());
        this.\u00d600000.\u00d500000((Integer)this.int().getValue());
        this.\u00d600000.\u00f600000((Integer)this.do().getValue());
        this.\u00d600000.null((Integer)this.\u00d300000().getValue());
        this.\u00d600000.\u00d600000((Integer)this.\u00d600000().getValue());
        this.\u00d600000.for((Integer)this.\u00f600000().getValue());
        return true;
    }

    private JSpinner OO0000() {
        if (this.for == null) {
            this.for = new JSpinner();
        }
        return this.for;
    }

    private JSpinner do() {
        if (this.null == null) {
            this.null = new JSpinner();
        }
        return this.null;
    }

    private JSpinner \u00d4O0000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JSpinner();
        }
        return this.\u00d300000;
    }

    private JSpinner int() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JSpinner();
        }
        return this.\u00f500000;
    }

    private JSpinner \u00d400000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JSpinner();
        }
        return this.\u00d200000;
    }

    private JSpinner \u00d800000() {
        if (this.o00000 == null) {
            this.o00000 = new JSpinner();
        }
        return this.o00000;
    }

    private JSpinner class() {
        if (this.oO0000 == null) {
            this.oO0000 = new JSpinner();
        }
        return this.oO0000;
    }

    private JSpinner \u00f400000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSpinner();
        }
        return this.\u00d500000;
    }

    private JSpinner \u00d3O0000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JSpinner();
        }
        return this.\u00d2O0000;
    }

    private JSpinner \u00d200000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JSpinner();
        }
        return this.\u00f600000;
    }

    private JSpinner \u00d600000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JSpinner();
        }
        return this.\u00f800000;
    }

    private JSpinner \u00f600000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JSpinner();
        }
        return this.\u00d800000;
    }

    private JSpinner \u00d300000() {
        if (this.String == null) {
            this.String = new JSpinner();
        }
        return this.String;
    }

    private void \u00f800000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 8;
        JLabel jLabel = new JLabel();
        jLabel.setText("\u03a3 Teile");
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 1;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 0;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Sterne *");
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 4;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.weightx = 0.1;
        gridBagConstraints5.gridy = 10;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 5;
        gridBagConstraints6.gridwidth = 2;
        gridBagConstraints6.anchor = 17;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridy = 10;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Gesamt BE");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 3;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.fill = 2;
        gridBagConstraints7.weightx = 0.1;
        gridBagConstraints7.gridy = 9;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 1;
        gridBagConstraints8.gridwidth = 4;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridy = 8;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("gesamt Zonen RS");
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.fill = 2;
        gridBagConstraints9.weightx = 0.1;
        gridBagConstraints9.gridy = 10;
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 0;
        gridBagConstraints10.gridwidth = 1;
        gridBagConstraints10.anchor = 13;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.gridy = 10;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Gesamt RS");
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 0;
        gridBagConstraints11.gridy = 7;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText(" ");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridx = 4;
        gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints12.fill = 2;
        gridBagConstraints12.weightx = 0.1;
        gridBagConstraints12.gridy = 6;
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 1;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints13.fill = 2;
        gridBagConstraints13.weightx = 0.1;
        gridBagConstraints13.gridy = 6;
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.gridx = 5;
        gridBagConstraints14.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints14.anchor = 17;
        gridBagConstraints14.gridy = 6;
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("Linkes Bein");
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.gridx = 0;
        gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints15.anchor = 13;
        gridBagConstraints15.gridy = 6;
        JLabel jLabel8 = new JLabel();
        jLabel8.setText("Rechtes Bein");
        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.gridx = 5;
        gridBagConstraints16.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints16.fill = 2;
        gridBagConstraints16.weightx = 0.0;
        gridBagConstraints16.gridy = 1;
        GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
        gridBagConstraints17.gridx = 5;
        gridBagConstraints17.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints17.gridy = 0;
        JLabel jLabel9 = new JLabel();
        jLabel9.setText("R\u00fccken");
        GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
        gridBagConstraints18.gridx = 3;
        gridBagConstraints18.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints18.fill = 2;
        gridBagConstraints18.weightx = 0.1;
        gridBagConstraints18.gridy = 5;
        GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
        gridBagConstraints19.gridx = 1;
        gridBagConstraints19.gridwidth = 4;
        gridBagConstraints19.gridy = 4;
        JLabel jLabel10 = new JLabel();
        jLabel10.setText("Bauch");
        GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
        gridBagConstraints20.gridx = 4;
        gridBagConstraints20.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints20.fill = 2;
        gridBagConstraints20.weightx = 0.1;
        gridBagConstraints20.gridy = 3;
        GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
        gridBagConstraints21.gridx = 5;
        gridBagConstraints21.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints21.anchor = 17;
        gridBagConstraints21.gridy = 3;
        JLabel jLabel11 = new JLabel();
        jLabel11.setText("Linker Arm");
        GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
        gridBagConstraints22.gridx = 0;
        gridBagConstraints22.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints22.anchor = 13;
        gridBagConstraints22.gridy = 3;
        JLabel jLabel12 = new JLabel();
        jLabel12.setText("Rechter Arm");
        GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
        gridBagConstraints23.gridx = 1;
        gridBagConstraints23.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints23.fill = 2;
        gridBagConstraints23.weightx = 0.1;
        gridBagConstraints23.gridy = 3;
        GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
        gridBagConstraints24.gridx = 3;
        gridBagConstraints24.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints24.fill = 2;
        gridBagConstraints24.weightx = 0.1;
        gridBagConstraints24.gridy = 3;
        GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
        gridBagConstraints25.gridx = 1;
        gridBagConstraints25.gridwidth = 4;
        gridBagConstraints25.gridy = 2;
        JLabel jLabel13 = new JLabel();
        jLabel13.setText("Brust");
        GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
        gridBagConstraints26.gridx = 3;
        gridBagConstraints26.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints26.fill = 2;
        gridBagConstraints26.weightx = 0.1;
        gridBagConstraints26.gridy = 1;
        GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
        gridBagConstraints27.gridx = 1;
        gridBagConstraints27.gridwidth = 4;
        gridBagConstraints27.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints27.gridy = 0;
        JLabel jLabel14 = new JLabel();
        jLabel14.setText("Kopf");
        this.setSize(300, 298);
        this.setLayout(new GridBagLayout());
        this.add((Component)jLabel14, gridBagConstraints27);
        this.add((Component)this.\u00d400000(), gridBagConstraints26);
        this.add((Component)jLabel13, gridBagConstraints25);
        this.add((Component)this.\u00d4O0000(), gridBagConstraints24);
        this.add((Component)this.\u00f400000(), gridBagConstraints23);
        this.add((Component)jLabel12, gridBagConstraints22);
        this.add((Component)jLabel11, gridBagConstraints21);
        this.add((Component)this.class(), gridBagConstraints20);
        this.add((Component)jLabel10, gridBagConstraints19);
        this.add((Component)this.OO0000(), gridBagConstraints18);
        this.add((Component)jLabel9, gridBagConstraints17);
        this.add((Component)this.\u00d200000(), gridBagConstraints16);
        this.add((Component)jLabel8, gridBagConstraints15);
        this.add((Component)jLabel7, gridBagConstraints14);
        this.add((Component)this.\u00d3O0000(), gridBagConstraints13);
        this.add((Component)this.\u00d800000(), gridBagConstraints12);
        this.add((Component)jLabel6, gridBagConstraints11);
        this.add((Component)jLabel5, gridBagConstraints10);
        this.add((Component)this.int(), gridBagConstraints9);
        this.add((Component)jLabel4, gridBagConstraints8);
        this.add((Component)this.\u00d300000(), gridBagConstraints7);
        this.add((Component)jLabel3, gridBagConstraints6);
        this.add((Component)this.do(), gridBagConstraints5);
        this.add((Component)jLabel2, gridBagConstraints4);
        this.add((Component)this.\u00d600000(), gridBagConstraints3);
        this.add((Component)jLabel, gridBagConstraints2);
        this.add((Component)this.\u00f600000(), gridBagConstraints);
    }

    private void super() {
        if (this.\u00d600000.\u00f5O0000()) {
            this.\u00d600000().setModel(new SpinnerNumberModel(this.\u00d600000.null(), 0, 1, 1));
            this.\u00f600000().setModel(new SpinnerNumberModel(this.\u00d600000.for(), 1, 10, 1));
            this.\u00f600000().setEnabled(true);
        } else {
            this.\u00d600000().setModel(new SpinnerNumberModel(this.\u00d600000.null(), -10, 10, 1));
            this.\u00f600000().setModel(new SpinnerNumberModel(1, 1, 1, 1));
            this.\u00f600000().setEnabled(false);
        }
        this.\u00d400000().setModel(new SpinnerNumberModel(this.\u00d600000.\u00f8O0000(), 0, 20, 1));
        this.\u00d4O0000().setModel(new SpinnerNumberModel(this.\u00d600000.\u00f800000(), 0, 20, 1));
        this.\u00f400000().setModel(new SpinnerNumberModel(this.\u00d600000.\u00d8O0000(), 0, 20, 1));
        this.class().setModel(new SpinnerNumberModel(this.\u00d600000.\u00d6O0000(), 0, 20, 1));
        this.OO0000().setModel(new SpinnerNumberModel(this.\u00d600000.\u00f6O0000(), 0, 20, 1));
        this.\u00d200000().setModel(new SpinnerNumberModel(this.\u00d600000.newsuper(), 0, 20, 1));
        this.\u00d3O0000().setModel(new SpinnerNumberModel(this.\u00d600000.\u00d5O0000(), 0, 20, 1));
        this.\u00d800000().setModel(new SpinnerNumberModel(this.\u00d600000.\u00f500000(), 0, 20, 1));
        this.int().setModel(new SpinnerNumberModel(this.\u00d600000.\u00d2O0000(), 0, 25, 1));
        this.\u00d300000().setModel(new SpinnerNumberModel(this.\u00d600000.oO0000(), 0, 25, 1));
        this.do().setModel(new SpinnerNumberModel(this.\u00d600000.\u00f600000(), 0, 25, 1));
    }
}

