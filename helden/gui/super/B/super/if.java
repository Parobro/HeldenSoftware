/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.B;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.framework.E.OoOO.null;
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
 */
public class if
extends JPanel {
    private JSpinner super = null;
    private JSpinner \u00d600000 = null;
    private JSpinner \u00d400000 = null;
    private JSpinner \u00d200000 = null;
    private JSpinner \u00d300000 = null;
    private void class;

    public if(F f2) {
        this.class = (void)f2.o00000(B.\u00d300000, 0);
        this.\u00d800000();
        this.null();
    }

    public boolean o00000() {
        this.class.\u00f8O0000((Integer)this.\u00d500000().getValue());
        this.class.\u00d200000(new null((Integer)this.\u00d200000().getValue(), (Integer)this.String().getValue()));
        this.class.\u00d8\u00d20000().new((Integer)this.\u00d600000().getValue());
        this.class.\u00d8\u00d20000().o00000((Integer)this.\u00d300000().getValue());
        return true;
    }

    private JSpinner \u00d300000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JSpinner();
        }
        return this.\u00d300000;
    }

    private JSpinner \u00d600000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JSpinner();
        }
        return this.\u00d200000;
    }

    private JSpinner \u00d500000() {
        if (this.super == null) {
            this.super = new JSpinner();
        }
        return this.super;
    }

    private JSpinner \u00d200000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JSpinner();
        }
        return this.\u00d600000;
    }

    private JSpinner String() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JSpinner();
        }
        return this.\u00d400000;
    }

    private void \u00d800000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridy = 3;
        JLabel jLabel = new JLabel();
        jLabel.setText(" ");
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 5;
        gridBagConstraints2.weightx = 0.2;
        gridBagConstraints2.gridy = 0;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText(" ");
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridy = 5;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText(" ");
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 1;
        gridBagConstraints4.gridy = 1;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText(" ");
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 4;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.weightx = 0.3;
        gridBagConstraints5.gridy = 7;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 2;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.weightx = 0.3;
        gridBagConstraints6.gridy = 7;
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 4;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.fill = 2;
        gridBagConstraints7.weightx = 0.3;
        gridBagConstraints7.gridy = 4;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 2;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.weightx = 0.3;
        gridBagConstraints8.gridy = 4;
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 2;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.fill = 2;
        gridBagConstraints9.weightx = 0.3;
        gridBagConstraints9.gridy = 0;
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 3;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.gridy = 4;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("PA");
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 1;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.gridy = 4;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("AT");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridx = 1;
        gridBagConstraints12.gridwidth = 4;
        gridBagConstraints12.anchor = 17;
        gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints12.gridy = 2;
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("Waffen Modifikation");
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 1;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints13.gridy = 0;
        JLabel jLabel8 = new JLabel();
        jLabel8.setText("INI-Mod");
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.gridx = 3;
        gridBagConstraints14.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints14.gridy = 7;
        JLabel jLabel9 = new JLabel();
        jLabel9.setText("Aktuell");
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.gridx = 1;
        gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints15.gridy = 7;
        JLabel jLabel10 = new JLabel();
        jLabel10.setText("Min");
        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.gridx = 1;
        gridBagConstraints16.gridwidth = 3;
        gridBagConstraints16.anchor = 17;
        gridBagConstraints16.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints16.gridy = 6;
        JLabel jLabel11 = new JLabel();
        jLabel11.setText("Bruchfaktor");
        this.setSize(252, 200);
        this.setLayout(new GridBagLayout());
        this.add((Component)jLabel11, gridBagConstraints16);
        this.add((Component)jLabel10, gridBagConstraints15);
        this.add((Component)jLabel9, gridBagConstraints14);
        this.add((Component)jLabel8, gridBagConstraints13);
        this.add((Component)jLabel7, gridBagConstraints12);
        this.add((Component)jLabel6, gridBagConstraints11);
        this.add((Component)jLabel5, gridBagConstraints10);
        this.add((Component)this.\u00d500000(), gridBagConstraints9);
        this.add((Component)this.\u00d200000(), gridBagConstraints8);
        this.add((Component)this.String(), gridBagConstraints7);
        this.add((Component)this.\u00d600000(), gridBagConstraints6);
        this.add((Component)this.\u00d300000(), gridBagConstraints5);
        this.add((Component)jLabel4, gridBagConstraints4);
        this.add((Component)jLabel3, gridBagConstraints3);
        this.add((Component)jLabel2, gridBagConstraints2);
        this.add((Component)jLabel, gridBagConstraints);
    }

    private void null() {
        this.\u00d500000().setModel(new SpinnerNumberModel(this.class.nullnew(), -20, 20, 1));
        this.\u00d200000().setModel(new SpinnerNumberModel(this.class.\u00f5\u00d20000().o00000(), -20, 20, 1));
        this.String().setModel(new SpinnerNumberModel(this.class.\u00f5\u00d20000().new(), -20, 20, 1));
        this.\u00d600000().setModel(new SpinnerNumberModel(this.class.\u00d8\u00d20000().\u00d400000(), -99, 13, 1));
        this.\u00d300000().setModel(new SpinnerNumberModel(this.class.\u00d8\u00d20000().\u00d300000(), -99, 13, 1));
    }
}

