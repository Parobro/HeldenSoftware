/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.B;
import helden.framework.E.OoOO.A;
import helden.framework.E.OoOO.F;
import helden.framework.E.OoOO.null;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.object.oooo_1;
import helden.gui.components.JScrollPaneFast;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Collections;
import java.util.HashMap;
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
public class M
extends JPanel {
    private JSpinner public = null;
    private JSpinner \u00f500000 = null;
    private JSpinner \u00d200000 = null;
    private JSpinner \u00d500000 = null;
    private JComboBox \u00d5O0000 = null;
    private JSpinner \u00f600000 = null;
    private JSpinner OO0000 = null;
    private JSpinner \u00d400000 = null;
    private JSpinner \u00d4O0000 = null;
    private JSpinner oO0000 = null;
    private JComboBox \u00d2O0000 = null;
    private JList void = null;
    private JList o00000 = null;
    private helden.framework.E.C.A \u00f400000;
    private HashMap<String, E> \u00d600000;
    private HashMap<String, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> float;
    private oooo_1 Object;

    public M(helden.framework.E.F f2, int n, oooo_1 oooo_12) {
        this.Object = oooo_12;
        this.\u00f400000 = (helden.framework.E.C.A)f2.o00000(B.\u00d400000, n);
        this.\u00f800000();
        this.super();
    }

    public boolean \u00d4O0000() {
        Object[] objectArray = this.\u00d800000().getSelectedValues();
        if (objectArray.length < 1) {
            JOptionPane.showMessageDialog(this, "Es muss mindestens ein Talent gew\u00e4hlt werden", "Talent w\u00e4hlen!", 0);
            return false;
        }
        this.\u00f400000.\u00f6\u00d40000().clear();
        for (Object object : objectArray) {
            this.\u00f400000.\u00d300000(this.\u00d600000.get(object));
        }
        Object[] objectArray2 = this.OO0000().getSelectedValues();
        if (objectArray2.length < 1) {
            JOptionPane.showMessageDialog(this, "Es muss mindestens eine Distanzklasse gew\u00e4hlt werden", "Distanzklasse w\u00e4hlen!", 0);
            return false;
        }
        this.\u00f400000.\u00d8\u00d50000().clear();
        for (Object object : objectArray2) {
            this.\u00f400000.\u00d8\u00d50000().add(this.float.get(object));
        }
        int n = 6;
        String string = (String)this.\u00d600000().getSelectedItem();
        n = Integer.parseInt(string.substring(1));
        this.\u00f400000.o00000(new F((Integer)this.\u00d300000().getValue(), n, (Integer)this.\u00f400000().getValue()));
        this.\u00f400000.o00000().new((Integer)this.int().getValue());
        this.\u00f400000.o00000().o00000((Integer)this.\u00d200000().getValue());
        this.\u00f400000.o00000((Integer)this.\u00d2O0000().getValue());
        this.\u00f400000.o00000(new null((Integer)this.\u00f600000().getValue(), (Integer)this.class().getValue()));
        this.\u00f400000.o00000(new A((Integer)this.do().getValue(), (Integer)this.\u00d400000().getValue()));
        if (this.\u00d3O0000().getSelectedItem().equals("Ausdauer")) {
            this.\u00f400000.String(true);
        } else {
            this.\u00f400000.String(false);
        }
        return true;
    }

    private JSpinner \u00d200000() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JSpinner();
        }
        return this.\u00f500000;
    }

    private JSpinner int() {
        if (this.public == null) {
            this.public = new JSpinner();
        }
        return this.public;
    }

    private JList OO0000() {
        if (this.o00000 == null) {
            this.o00000 = new JList();
        }
        return this.o00000;
    }

    private JSpinner \u00d2O0000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JSpinner();
        }
        return this.\u00d200000;
    }

    private JSpinner do() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JSpinner();
        }
        return this.\u00d400000;
    }

    private JComboBox \u00d3O0000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JComboBox();
            this.\u00d2O0000.addItem("Schaden");
            this.\u00d2O0000.addItem("Ausdauer");
            this.\u00d2O0000.setSelectedItem("Schaden");
        }
        return this.\u00d2O0000;
    }

    private JSpinner \u00d400000() {
        if (this.OO0000 == null) {
            this.OO0000 = new JSpinner();
        }
        return this.OO0000;
    }

    private JList \u00d800000() {
        if (this.void == null) {
            this.void = new JList();
        }
        return this.void;
    }

    private JSpinner \u00d300000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JSpinner();
        }
        return this.\u00f600000;
    }

    private JSpinner \u00f400000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSpinner();
        }
        return this.\u00d500000;
    }

    private JComboBox \u00d600000() {
        if (this.\u00d5O0000 == null) {
            this.\u00d5O0000 = new JComboBox();
            this.\u00d5O0000.addItem("W 6");
            this.\u00d5O0000.addItem("W 20");
            this.\u00d5O0000.setSelectedItem("W 6");
        }
        return this.\u00d5O0000;
    }

    private JSpinner \u00f600000() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JSpinner();
        }
        return this.\u00d4O0000;
    }

    private JSpinner class() {
        if (this.oO0000 == null) {
            this.oO0000 = new JSpinner();
        }
        return this.oO0000;
    }

    private void \u00f800000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 1;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.anchor = 11;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridy = 8;
        JLabel jLabel = new JLabel();
        jLabel.setText("Distanzklassen");
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.anchor = 11;
        gridBagConstraints3.gridy = 6;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Talent");
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.gridy = 6;
        gridBagConstraints4.weightx = 1.6;
        gridBagConstraints4.weighty = 1.0;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridwidth = 3;
        gridBagConstraints4.gridx = 1;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 1;
        gridBagConstraints5.gridy = 3;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 0.0;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridwidth = 3;
        gridBagConstraints5.gridx = 1;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridy = 3;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Schadensart");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 3;
        gridBagConstraints7.weightx = 1.0;
        gridBagConstraints7.weighty = 0.0;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.fill = 1;
        gridBagConstraints7.gridy = 5;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 2;
        gridBagConstraints8.weightx = 0.0;
        gridBagConstraints8.weighty = 0.0;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridy = 5;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("/");
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.weightx = 1.0;
        gridBagConstraints9.weighty = 0.0;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.fill = 1;
        gridBagConstraints9.gridy = 5;
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 0;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.gridy = 5;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("WM");
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 1;
        gridBagConstraints11.weightx = 1.0;
        gridBagConstraints11.weighty = 0.0;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.fill = 1;
        gridBagConstraints11.gridy = 4;
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridx = 2;
        gridBagConstraints12.weightx = 0.0;
        gridBagConstraints12.weighty = 0.0;
        gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints12.gridy = 4;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("/");
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 3;
        gridBagConstraints13.weightx = 1.0;
        gridBagConstraints13.weighty = 0.0;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints13.fill = 1;
        gridBagConstraints13.gridy = 4;
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.gridx = 0;
        gridBagConstraints14.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints14.gridy = 4;
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("TP/KK");
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.gridx = 1;
        gridBagConstraints15.weightx = 1.0;
        gridBagConstraints15.weighty = 0.0;
        gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints15.fill = 1;
        gridBagConstraints15.gridy = 2;
        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.gridx = 4;
        gridBagConstraints16.gridy = 2;
        JLabel jLabel8 = new JLabel();
        jLabel8.setText("+");
        GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
        gridBagConstraints17.fill = 1;
        gridBagConstraints17.gridy = 2;
        gridBagConstraints17.weightx = 1.0;
        gridBagConstraints17.weighty = 0.0;
        gridBagConstraints17.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints17.gridwidth = 2;
        gridBagConstraints17.gridx = 2;
        GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
        gridBagConstraints18.gridx = 5;
        gridBagConstraints18.weightx = 1.0;
        gridBagConstraints18.weighty = 0.0;
        gridBagConstraints18.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints18.fill = 1;
        gridBagConstraints18.gridy = 2;
        GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
        gridBagConstraints19.gridx = 0;
        gridBagConstraints19.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints19.gridy = 2;
        JLabel jLabel9 = new JLabel();
        jLabel9.setText("Trefferpunkte");
        GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
        gridBagConstraints20.gridx = 1;
        gridBagConstraints20.weightx = 1.0;
        gridBagConstraints20.weighty = 0.0;
        gridBagConstraints20.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints20.fill = 1;
        gridBagConstraints20.gridy = 1;
        GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
        gridBagConstraints21.gridx = 0;
        gridBagConstraints21.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints21.gridy = 1;
        JLabel jLabel10 = new JLabel();
        jLabel10.setText("INI-Mod");
        GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
        gridBagConstraints22.gridx = 5;
        gridBagConstraints22.weightx = 1.0;
        gridBagConstraints22.weighty = 0.0;
        gridBagConstraints22.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints22.fill = 1;
        gridBagConstraints22.gridy = 0;
        GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
        gridBagConstraints23.gridx = 3;
        gridBagConstraints23.weightx = 1.0;
        gridBagConstraints23.weighty = 0.0;
        gridBagConstraints23.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints23.gridwidth = 2;
        gridBagConstraints23.gridy = 0;
        JLabel jLabel11 = new JLabel();
        jLabel11.setText("aktuell");
        GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
        gridBagConstraints24.gridx = 1;
        gridBagConstraints24.weightx = 1.0;
        gridBagConstraints24.weighty = 0.0;
        gridBagConstraints24.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints24.fill = 1;
        gridBagConstraints24.gridy = 0;
        GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
        gridBagConstraints25.gridx = 0;
        gridBagConstraints25.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints25.gridy = 0;
        JLabel jLabel12 = new JLabel();
        jLabel12.setText("BF min");
        this.setSize(300, 326);
        this.setLayout(new GridBagLayout());
        this.add((Component)jLabel12, gridBagConstraints25);
        this.add((Component)this.int(), gridBagConstraints24);
        this.add((Component)jLabel11, gridBagConstraints23);
        this.add((Component)this.\u00d200000(), gridBagConstraints22);
        this.add((Component)jLabel10, gridBagConstraints21);
        this.add((Component)this.\u00d2O0000(), gridBagConstraints20);
        this.add((Component)jLabel9, gridBagConstraints19);
        this.add((Component)this.\u00f400000(), gridBagConstraints18);
        this.add((Component)this.\u00d600000(), gridBagConstraints17);
        this.add((Component)jLabel8, gridBagConstraints16);
        this.add((Component)this.\u00d300000(), gridBagConstraints15);
        this.add((Component)jLabel7, gridBagConstraints14);
        this.add((Component)this.\u00d400000(), gridBagConstraints13);
        this.add((Component)jLabel6, gridBagConstraints12);
        this.add((Component)this.do(), gridBagConstraints11);
        this.add((Component)jLabel5, gridBagConstraints10);
        this.add((Component)this.\u00f600000(), gridBagConstraints9);
        this.add((Component)jLabel4, gridBagConstraints8);
        this.add((Component)this.class(), gridBagConstraints7);
        this.add((Component)jLabel3, gridBagConstraints6);
        this.add((Component)this.\u00d3O0000(), gridBagConstraints5);
        this.add((Component)new JScrollPaneFast(this.\u00d800000()), gridBagConstraints4);
        this.add((Component)jLabel2, gridBagConstraints3);
        this.add((Component)jLabel, gridBagConstraints2);
        this.add((Component)new JScrollPaneFast(this.OO0000()), gridBagConstraints);
    }

    private void super() {
        this.int().setModel(new SpinnerNumberModel(this.\u00f400000.o00000().\u00d400000(), -10, 13, 1));
        this.\u00d200000().setModel(new SpinnerNumberModel(this.\u00f400000.o00000().\u00d300000(), -10, 13, 1));
        this.\u00d2O0000().setModel(new SpinnerNumberModel(this.\u00f400000.\u00d300000(), -20, 20, 1));
        this.\u00d300000().setModel(new SpinnerNumberModel(this.\u00f400000.o\u00d50000().\u00d400000(), 0, 100, 1));
        this.\u00f400000().setModel(new SpinnerNumberModel(this.\u00f400000.o\u00d50000().o00000(), -5, 100, 1));
        this.\u00d600000().removeAllItems();
        this.\u00d600000().addItem("W2");
        this.\u00d600000().addItem("W3");
        this.\u00d600000().addItem("W4");
        this.\u00d600000().addItem("W5");
        this.\u00d600000().addItem("W6");
        this.\u00d600000().addItem("W8");
        this.\u00d600000().addItem("W10");
        this.\u00d600000().addItem("W20");
        this.\u00d600000().setSelectedItem("W" + this.\u00f400000.o\u00d50000().Object());
        this.do().setModel(new SpinnerNumberModel(this.\u00f400000.\u00d200000().\u00d300000(), 0, 40, 1));
        this.\u00d400000().setModel(new SpinnerNumberModel(this.\u00f400000.\u00d200000().o00000(), 0, 10, 1));
        this.\u00f600000().setModel(new SpinnerNumberModel(this.\u00f400000.String().o00000(), -20, 20, 1));
        this.class().setModel(new SpinnerNumberModel(this.\u00f400000.String().new(), -99, 20, 1));
        this.\u00d3O0000().removeAllItems();
        this.\u00d3O0000().addItem("Ausdauer");
        this.\u00d3O0000().addItem("Schaden");
        if (this.\u00f400000.StringString()) {
            this.\u00d3O0000().setSelectedItem("Ausdauer");
        } else {
            this.\u00d3O0000().setSelectedItem("Schaden");
        }
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
        this.\u00d600000 = new HashMap();
        List<voidsuper> list = this.Object.\u00f600000();
        for (E object2 : this.\u00f400000.\u00f6\u00d40000()) {
            if (object2.classclass() || list.contains(object2)) continue;
            list.add(object2);
        }
        Collections.sort(list);
        for (voidsuper voidsuper2 : list) {
            E e;
            if (!(voidsuper2 instanceof E) || (e = (E)voidsuper2).classclass()) continue;
            this.\u00d600000.put(e.toString(), e);
            defaultListModel.addElement(e.toString());
        }
        this.\u00d800000().setModel(defaultListModel);
        this.\u00d800000().setSelectionMode(2);
        for (E e : this.\u00f400000.\u00f6\u00d40000()) {
            int n = defaultListModel.indexOf(e.toString());
            if (n == -1) continue;
            this.\u00d800000().addSelectionInterval(n, n);
        }
        DefaultListModel<String> defaultListModel2 = new DefaultListModel<String>();
        this.float = new HashMap();
        this.float.put(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000.\u00d200000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000);
        defaultListModel2.addElement(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000.\u00d200000());
        this.float.put(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000.\u00d200000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000);
        defaultListModel2.addElement(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000.\u00d200000());
        this.float.put(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null.\u00d200000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null);
        defaultListModel2.addElement(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null.\u00d200000());
        this.float.put(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000.\u00d200000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000);
        defaultListModel2.addElement(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000.\u00d200000());
        this.OO0000().setModel(defaultListModel2);
        this.OO0000().setSelectionMode(2);
        for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : this.\u00f400000.\u00d8\u00d50000()) {
            if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000.equals(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)) {
                this.OO0000().addSelectionInterval(0, 0);
            }
            if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000.equals(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)) {
                this.OO0000().addSelectionInterval(1, 1);
            }
            if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null.equals(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)) {
                this.OO0000().addSelectionInterval(2, 2);
            }
            if (!oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000.equals(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)) continue;
            this.OO0000().addSelectionInterval(3, 3);
        }
    }
}

