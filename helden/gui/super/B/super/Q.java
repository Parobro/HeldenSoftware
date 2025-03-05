/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.F;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Q
extends JPanel {
    private JTextField \u00d300000 = null;
    private JSpinner \u00d200000 = null;
    private JSpinner \u00d500000 = null;
    private F String;
    private JSpinner o00000 = null;

    public Q(F f2) {
        this.String = f2;
        this.Object();
        this.\u00d400000();
    }

    public boolean \u00d200000() {
        boolean bl = true;
        if (this.\u00d500000().getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "Der neue Name muss mindestens 3 Zeichen enthalten", "Name zu kurz!", 0);
            bl = false;
        } else {
            this.String.o00000(this.\u00d500000().getText());
            this.String.o00000(((Double)this.void().getValue()).floatValue());
            this.String.\u00d500000((Integer)this.o00000().getValue());
            this.String.Object((Integer)this.\u00d600000().getValue());
        }
        return bl;
    }

    private JSpinner \u00d600000() {
        if (this.o00000 == null) {
            this.o00000 = new JSpinner();
        }
        return this.o00000;
    }

    private JSpinner void() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JSpinner();
        }
        return this.\u00d200000;
    }

    private JTextField \u00d500000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JTextField();
        }
        return this.\u00d300000;
    }

    private JSpinner o00000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSpinner();
        }
        return this.\u00d500000;
    }

    private void Object() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        JLabel jLabel = new JLabel();
        jLabel.setText("Anzahl");
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 3;
        gridBagConstraints2.gridy = 1;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("St\u00fcck");
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.weightx = 0.0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridy = 1;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.weightx = 0.2;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.gridy = 2;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 4;
        gridBagConstraints5.weightx = 0.2;
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.gridy = 2;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText(" ");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 3;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridy = 3;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Kreuzer");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 3;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.gridy = 2;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Unzen");
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 2;
        gridBagConstraints8.weightx = 0.1;
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridy = 3;
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 2;
        gridBagConstraints9.fill = 2;
        gridBagConstraints9.weightx = 0.1;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.gridy = 2;
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.fill = 1;
        gridBagConstraints10.gridy = 0;
        gridBagConstraints10.weightx = 1.0;
        gridBagConstraints10.gridwidth = 2;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.gridx = 2;
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 1;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.gridy = 3;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Preis");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridx = 1;
        gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints12.gridy = 0;
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("Name");
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 1;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints13.gridy = 2;
        JLabel jLabel8 = new JLabel();
        jLabel8.setText("Gewicht");
        JLabel jLabel9 = new JLabel();
        jLabel9.setText(" ");
        this.setSize(300, 200);
        this.setLayout(new GridBagLayout());
        this.add((Component)jLabel8, gridBagConstraints13);
        this.add((Component)jLabel7, gridBagConstraints12);
        this.add((Component)jLabel6, gridBagConstraints11);
        this.add((Component)this.\u00d500000(), gridBagConstraints10);
        this.add((Component)this.void(), gridBagConstraints9);
        this.add((Component)this.o00000(), gridBagConstraints8);
        this.add((Component)jLabel5, gridBagConstraints7);
        this.add((Component)jLabel4, gridBagConstraints6);
        this.add((Component)jLabel3, gridBagConstraints5);
        this.add((Component)jLabel9, gridBagConstraints4);
        this.add((Component)this.\u00d600000(), gridBagConstraints3);
        this.add((Component)jLabel2, gridBagConstraints2);
        this.add((Component)jLabel, gridBagConstraints);
    }

    private void \u00d400000() {
        this.\u00d500000().setText(this.String.OO0000());
        this.o00000().setModel(new SpinnerNumberModel(this.String.oO0000(), 0, 1000000000, 1));
        this.void().setModel(new SpinnerNumberModel(this.String.Object(), 0.0, 9.9999997952E10, 1.0));
        this.\u00d600000().setModel(new SpinnerNumberModel(this.String.\u00f500000(), 1, 1000, 1));
    }
}

