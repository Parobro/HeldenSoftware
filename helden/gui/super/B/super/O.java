/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.B;
import helden.framework.E.OoOO.C;
import helden.framework.E.OoOO.F;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.e.oooo.oooo_0;
import helden.framework.held.object.oooo_1;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O
extends JPanel {
    private JSpinner o00000 = null;
    private JComboBox float = null;
    private JSpinner \u00d5O0000 = null;
    private JSpinner \u00d4O0000 = null;
    private JSpinner \u00d2O0000 = null;
    private JSpinner oO0000 = null;
    private JSpinner OO0000 = null;
    private JSpinner \u00f600000 = null;
    private JComboBox public = null;
    private JSpinner Object = null;
    private JSpinner \u00f500000 = null;
    private JSpinner \u00f400000 = null;
    private JSpinner void = null;
    private JSpinner \u00d600000 = null;
    private JSpinner \u00d500000 = null;
    private oooo_1 \u00d200000;
    private helden.framework.E.C.E \u00d400000;
    private JList \u00d6O0000;

    public O(helden.framework.E.F f2, oooo_1 oooo_12) {
        this.\u00d200000 = oooo_12;
        this.\u00d400000 = (helden.framework.E.C.E)f2.o00000(B.class, 0);
        this.o00000();
        this.\u00d200000();
    }

    public boolean float() {
        if (this.\u00d5O0000().getSelectedValues().length < 1) {
            JOptionPane.showMessageDialog(this, "Es muss mindestens ein Talent gew\u00e4hlt werden", "Talent w\u00e4hlen!", 0);
            return false;
        }
        this.\u00d400000.\u00d5O0000((Integer)this.supersuper().getValue());
        this.\u00d400000.\u00d6O0000(this.Object().getSelectedIndex());
        this.\u00d400000.\u00f5o0000().clear();
        for (Object object : this.\u00d5O0000().getSelectedValues()) {
            this.\u00d400000.o00000((E)object);
        }
        int n = 6;
        String string = (String)this.\u00d400000().getSelectedItem();
        n = Integer.parseInt(string.substring(1));
        this.\u00d400000.\u00d200000(new F((Integer)this.void().getValue(), n, (Integer)this.\u00d6O0000().getValue()));
        this.\u00d400000.o00000(new oooo_0((Integer)this.\u00d500000().getValue(), (Integer)this.\u00d600000().getValue(), (Integer)this.\u00f400000().getValue(), (Integer)this.\u00f500000().getValue(), (Integer)this.\u00f600000().getValue()));
        this.\u00d400000.o00000(new C((Integer)this.OO0000().getValue(), (Integer)this.oO0000().getValue(), (Integer)this.\u00d2O0000().getValue(), (Integer)this.public().getValue(), (Integer)this.\u00d4O0000().getValue()));
        return true;
    }

    private JList \u00d5O0000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JList();
        }
        return this.\u00d6O0000;
    }

    private JSpinner supersuper() {
        if (this.o00000 == null) {
            this.o00000 = new JSpinner();
        }
        return this.o00000;
    }

    private JComboBox Object() {
        if (this.float == null) {
            this.float = new JComboBox();
        }
        return this.float;
    }

    private JSpinner \u00d500000() {
        if (this.\u00d5O0000 == null) {
            this.\u00d5O0000 = new JSpinner();
        }
        return this.\u00d5O0000;
    }

    private JSpinner \u00d600000() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JSpinner();
        }
        return this.\u00d4O0000;
    }

    private JSpinner \u00f400000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JSpinner();
        }
        return this.\u00d2O0000;
    }

    private JSpinner \u00f500000() {
        if (this.oO0000 == null) {
            this.oO0000 = new JSpinner();
        }
        return this.oO0000;
    }

    private JSpinner \u00f600000() {
        if (this.OO0000 == null) {
            this.OO0000 = new JSpinner();
        }
        return this.OO0000;
    }

    private JSpinner OO0000() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JSpinner();
        }
        return this.\u00f500000;
    }

    private JSpinner oO0000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JSpinner();
        }
        return this.\u00f400000;
    }

    private JSpinner \u00d2O0000() {
        if (this.void == null) {
            this.void = new JSpinner();
        }
        return this.void;
    }

    private JSpinner public() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JSpinner();
        }
        return this.\u00d600000;
    }

    private JSpinner \u00d4O0000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSpinner();
        }
        return this.\u00d500000;
    }

    private JSpinner void() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JSpinner();
        }
        return this.\u00f600000;
    }

    private JSpinner \u00d6O0000() {
        if (this.Object == null) {
            this.Object = new JSpinner();
        }
        return this.Object;
    }

    private JComboBox \u00d400000() {
        if (this.public == null) {
            this.public = new JComboBox();
        }
        return this.public;
    }

    private void o00000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridy = 4;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 4;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.gridy = 4;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 3;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.weighty = 1.0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridy = 4;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 2;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.weighty = 1.0;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.gridy = 4;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 1.0;
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.gridy = 4;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.weightx = 0.0;
        gridBagConstraints6.weighty = 1.0;
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.gridy = 4;
        JLabel jLabel = new JLabel();
        jLabel.setText("TP-Entfernung");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 5;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 0);
        gridBagConstraints7.weightx = 1.0;
        gridBagConstraints7.weighty = 1.0;
        gridBagConstraints7.fill = 2;
        gridBagConstraints7.gridy = 3;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 4;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.weightx = 1.0;
        gridBagConstraints8.weighty = 1.0;
        gridBagConstraints8.fill = 0;
        gridBagConstraints8.anchor = 10;
        gridBagConstraints8.gridy = 3;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("+");
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.fill = 2;
        gridBagConstraints9.gridy = 3;
        gridBagConstraints9.weightx = 1.0;
        gridBagConstraints9.gridwidth = 2;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.weighty = 1.0;
        gridBagConstraints9.gridx = 2;
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 1;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.weightx = 1.0;
        gridBagConstraints10.weighty = 1.0;
        gridBagConstraints10.fill = 2;
        gridBagConstraints10.gridy = 3;
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 0;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.weightx = 0.0;
        gridBagConstraints11.weighty = 1.0;
        gridBagConstraints11.fill = 2;
        gridBagConstraints11.gridy = 3;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Trefferpunkte");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridx = 0;
        gridBagConstraints12.insets = new Insets(5, 5, 0, 5);
        gridBagConstraints12.weightx = 0.0;
        gridBagConstraints12.weighty = 1.0;
        gridBagConstraints12.fill = 2;
        gridBagConstraints12.gridy = 5;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Talent");
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 5;
        gridBagConstraints13.weightx = 1.0;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 0);
        gridBagConstraints13.weighty = 1.0;
        gridBagConstraints13.fill = 2;
        gridBagConstraints13.gridy = 2;
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.gridx = 4;
        gridBagConstraints14.weightx = 1.0;
        gridBagConstraints14.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints14.weighty = 1.0;
        gridBagConstraints14.fill = 2;
        gridBagConstraints14.gridy = 2;
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.gridx = 3;
        gridBagConstraints15.weightx = 1.0;
        gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints15.weighty = 1.0;
        gridBagConstraints15.fill = 2;
        gridBagConstraints15.gridy = 2;
        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.gridx = 2;
        gridBagConstraints16.weightx = 1.0;
        gridBagConstraints16.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints16.weighty = 1.0;
        gridBagConstraints16.fill = 2;
        gridBagConstraints16.gridy = 2;
        GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
        gridBagConstraints17.gridx = 1;
        gridBagConstraints17.weightx = 1.0;
        gridBagConstraints17.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints17.weighty = 1.0;
        gridBagConstraints17.fill = 2;
        gridBagConstraints17.gridy = 2;
        GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
        gridBagConstraints18.gridx = 0;
        gridBagConstraints18.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints18.weightx = 0.0;
        gridBagConstraints18.weighty = 1.0;
        gridBagConstraints18.fill = 2;
        gridBagConstraints18.gridy = 2;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Reichweite");
        GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
        gridBagConstraints19.fill = 2;
        gridBagConstraints19.gridy = 1;
        gridBagConstraints19.weightx = 1.0;
        gridBagConstraints19.gridwidth = 5;
        gridBagConstraints19.insets = new Insets(5, 5, 5, 0);
        gridBagConstraints19.weighty = 1.0;
        gridBagConstraints19.gridx = 1;
        GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
        gridBagConstraints20.gridx = 0;
        gridBagConstraints20.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints20.weightx = 0.0;
        gridBagConstraints20.weighty = 1.0;
        gridBagConstraints20.fill = 2;
        gridBagConstraints20.gridy = 1;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Munition");
        GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
        gridBagConstraints21.gridx = 1;
        gridBagConstraints21.gridwidth = 2;
        gridBagConstraints21.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints21.weightx = 1.0;
        gridBagConstraints21.weighty = 1.0;
        gridBagConstraints21.fill = 2;
        gridBagConstraints21.gridy = 0;
        GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
        gridBagConstraints22.gridx = 0;
        gridBagConstraints22.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints22.weightx = 0.0;
        gridBagConstraints22.weighty = 1.0;
        gridBagConstraints22.fill = 2;
        gridBagConstraints22.gridy = 0;
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("Laden");
        this.setSize(457, 307);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 100};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
        gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
        this.setLayout(gridBagLayout);
        this.add((Component)jLabel7, gridBagConstraints22);
        this.add((Component)this.supersuper(), gridBagConstraints21);
        this.add((Component)jLabel6, gridBagConstraints20);
        this.add((Component)this.Object(), gridBagConstraints19);
        this.add((Component)jLabel5, gridBagConstraints18);
        this.add((Component)this.\u00d500000(), gridBagConstraints17);
        this.add((Component)this.\u00d600000(), gridBagConstraints16);
        this.add((Component)this.\u00f400000(), gridBagConstraints15);
        this.add((Component)this.\u00f500000(), gridBagConstraints14);
        this.add((Component)this.\u00f600000(), gridBagConstraints13);
        this.add((Component)jLabel4, gridBagConstraints12);
        this.add((Component)jLabel3, gridBagConstraints11);
        this.add((Component)this.void(), gridBagConstraints10);
        this.add((Component)this.\u00d400000(), gridBagConstraints9);
        this.add((Component)jLabel2, gridBagConstraints8);
        this.add((Component)this.\u00d6O0000(), gridBagConstraints7);
        this.add((Component)jLabel, gridBagConstraints6);
        this.add((Component)this.OO0000(), gridBagConstraints5);
        this.add((Component)this.oO0000(), gridBagConstraints4);
        this.add((Component)this.\u00d2O0000(), gridBagConstraints3);
        this.add((Component)this.public(), gridBagConstraints2);
        this.add((Component)this.\u00d4O0000(), gridBagConstraints);
        GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
        gridBagConstraints23.gridwidth = 5;
        gridBagConstraints23.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints23.fill = 1;
        gridBagConstraints23.gridx = 1;
        gridBagConstraints23.gridy = 5;
        this.add((Component)this.\u00d5O0000(), gridBagConstraints23);
    }

    private void \u00d200000() {
        this.supersuper().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d5o0000(), -1, 1000, 1));
        this.OO0000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00f6o0000().o00000(0), -50, 50, 1));
        this.oO0000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00f6o0000().o00000(1), -50, 50, 1));
        this.\u00d2O0000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00f6o0000().o00000(2), -50, 50, 1));
        this.public().setModel(new SpinnerNumberModel(this.\u00d400000.\u00f6o0000().o00000(3), -50, 50, 1));
        this.\u00d4O0000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00f6o0000().o00000(4), -50, 50, 1));
        this.\u00d500000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d6o0000().o00000(0), 0, 1000, 1));
        this.\u00d600000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d6o0000().o00000(1), 0, 1000, 1));
        this.\u00f400000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d6o0000().o00000(2), 0, 1000, 1));
        this.\u00f500000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d6o0000().o00000(3), 0, 1000, 1));
        this.\u00f600000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d6o0000().o00000(4), 0, 1000, 1));
        this.Object().removeAllItems();
        this.Object().addItem(helden.framework.E.C.F.\u00d8O0000(0));
        this.Object().addItem(helden.framework.E.C.F.\u00d8O0000(1));
        this.Object().addItem(helden.framework.E.C.F.\u00d8O0000(2));
        this.Object().addItem(helden.framework.E.C.F.\u00d8O0000(3));
        this.Object().addItem(helden.framework.E.C.F.\u00d8O0000(4));
        this.Object().setSelectedItem(helden.framework.E.C.F.\u00d8O0000(this.\u00d400000.whilesuper()));
        List<voidsuper> list = this.\u00d200000.\u00f600000();
        for (E object : this.\u00d400000.\u00f5o0000()) {
            if (!object.classclass()) continue;
            list.add(object);
        }
        Collections.sort(list);
        for (int i2 = 1; i2 < list.size(); ++i2) {
            if (!list.get(i2 - 1).toString().equals(list.get(i2).toString())) continue;
            list.remove(i2);
            --i2;
        }
        DefaultListModel<E> defaultListModel = new DefaultListModel<E>();
        for (voidsuper voidsuper2 : list) {
            E e;
            if (!(voidsuper2 instanceof E) || !(e = (E)voidsuper2).classclass()) continue;
            defaultListModel.addElement(e);
        }
        this.\u00d5O0000().setModel(defaultListModel);
        this.\u00d5O0000().setSelectionMode(2);
        for (E e : this.\u00d400000.\u00f5o0000()) {
            for (int i2 = 0; i2 < this.\u00d5O0000().getModel().getSize(); ++i2) {
                if (!e.equals(this.\u00d5O0000().getModel().getElementAt(i2)) || i2 == -1) continue;
                this.\u00d5O0000().addSelectionInterval(i2, i2);
            }
        }
        this.void().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d8o0000().\u00d400000(), 0, 100, 1));
        this.\u00d6O0000().setModel(new SpinnerNumberModel(this.\u00d400000.\u00d8o0000().o00000(), -5, 100, 1));
        this.\u00d400000().removeAllItems();
        this.\u00d400000().addItem("W2");
        this.\u00d400000().addItem("W3");
        this.\u00d400000().addItem("W4");
        this.\u00d400000().addItem("W5");
        this.\u00d400000().addItem("W6");
        this.\u00d400000().addItem("W8");
        this.\u00d400000().addItem("W10");
        this.\u00d400000().addItem("W20");
        this.\u00d400000().setSelectedItem("W" + this.\u00d400000.\u00d8o0000().Object());
    }
}

