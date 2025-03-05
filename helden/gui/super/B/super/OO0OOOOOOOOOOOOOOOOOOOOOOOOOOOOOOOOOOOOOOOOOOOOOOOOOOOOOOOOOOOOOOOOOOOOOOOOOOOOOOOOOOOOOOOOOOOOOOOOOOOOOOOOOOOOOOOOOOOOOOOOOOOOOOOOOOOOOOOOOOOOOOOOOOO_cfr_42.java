/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.B;
import helden.framework.E.C.F;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends JPanel {
    private JSpinner String = null;
    private JSpinner \u00d300000 = null;
    private JComboBox \u00d200000 = null;
    private F o00000;

    public OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(helden.framework.E.F f2) {
        this.o00000 = (F)f2.o00000(B.\u00f800000, 0);
        this.\u00d200000();
        this.\u00d300000();
    }

    public boolean super() {
        this.o00000.\u00f6O0000((Integer)this.\u00d400000().getValue());
        this.o00000.\u00f5O0000((Integer)this.class().getValue());
        if (this.\u00d600000().getSelectedItem().equals("Ausdauer")) {
            this.o00000.\u00d300000(true);
        } else {
            this.o00000.\u00d300000(false);
        }
        return true;
    }

    private JSpinner \u00d400000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JSpinner();
        }
        return this.\u00d300000;
    }

    private JComboBox \u00d600000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JComboBox();
        }
        return this.\u00d200000;
    }

    private JSpinner class() {
        if (this.String == null) {
            this.String = new JSpinner();
        }
        return this.String;
    }

    private void \u00d200000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridy = 1;
        JLabel jLabel = new JLabel();
        jLabel.setText(" ");
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 4;
        gridBagConstraints2.weightx = 0.2;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.gridy = 1;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText(" ");
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 3;
        gridBagConstraints3.weightx = 1.7;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridy = 0;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText(" ");
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.gridy = 2;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.gridwidth = 2;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridx = 2;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridy = 2;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Schadensart");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 2;
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.weightx = 0.3;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridy = 1;
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 1;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.gridy = 1;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Reichweite");
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 2;
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.weightx = 0.3;
        gridBagConstraints8.gridy = 0;
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.gridy = 0;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Trefferpunkte");
        this.setSize(300, 200);
        this.setLayout(new GridBagLayout());
        this.add((Component)jLabel6, gridBagConstraints9);
        this.add((Component)this.class(), gridBagConstraints8);
        this.add((Component)jLabel5, gridBagConstraints7);
        this.add((Component)this.\u00d400000(), gridBagConstraints6);
        this.add((Component)jLabel4, gridBagConstraints5);
        this.add((Component)this.\u00d600000(), gridBagConstraints4);
        this.add((Component)jLabel3, gridBagConstraints3);
        this.add((Component)jLabel2, gridBagConstraints2);
        this.add((Component)jLabel, gridBagConstraints);
    }

    private void \u00d300000() {
        this.class().setModel(new SpinnerNumberModel(this.o00000.\u00d5\u00d20000(), -100, 100, 1));
        this.\u00d400000().setModel(new SpinnerNumberModel(this.o00000.\u00d2\u00d20000(), -100, 1000, 1));
        this.\u00d600000().removeAllItems();
        this.\u00d600000().addItem("Ausdauer");
        this.\u00d600000().addItem("Schaden");
        if (this.o00000.Stringnew()) {
            this.\u00d600000().setSelectedItem("Ausdauer");
        } else {
            this.\u00d600000().setSelectedItem("Schaden");
        }
    }
}

