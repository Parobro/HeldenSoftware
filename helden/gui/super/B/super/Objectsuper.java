/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.C.K;
import helden.framework.E.F;
import helden.framework.OOoO.S;
import helden.framework.held.object.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooo_3;
import helden.gui.components.SpinnerNumberModelSafe;
import helden.gui.components.SpinnerValuesNumber;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Objectsuper
extends JPanel {
    private K \u00d200000;
    private HashMap<b_0, JSpinner> \u00d400000 = new HashMap();
    private JSpinner void;
    private JComboBox o00000;
    private JSpinner \u00d600000;
    private JTextField \u00f400000;
    private JTextField \u00d500000;
    private JSpinner Object;

    public Objectsuper(F f2) {
        this.\u00d200000 = (K)f2.o00000(B.\u00d200000, 0);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        this.setLayout(gridBagLayout);
        JLabel jLabel = new JLabel("Eigenschaften");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add((Component)jLabel, gridBagConstraints);
        JLabel jLabel2 = new JLabel("MU");
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        this.add((Component)jLabel2, gridBagConstraints2);
        JSpinner jSpinner = this.o00000("MU");
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridy = 1;
        gridBagConstraints3.fill = 2;
        this.add((Component)jSpinner, gridBagConstraints3);
        JSpinner jSpinner2 = this.o00000("LEP");
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints4.gridx = 6;
        gridBagConstraints4.gridy = 1;
        gridBagConstraints4.fill = 2;
        this.add((Component)jSpinner2, gridBagConstraints4);
        JLabel jLabel3 = new JLabel("KL");
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 2;
        this.add((Component)jLabel3, gridBagConstraints5);
        JSpinner jSpinner3 = this.o00000("KL");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints6.gridx = 1;
        gridBagConstraints6.gridy = 2;
        gridBagConstraints6.fill = 2;
        this.add((Component)jSpinner3, gridBagConstraints6);
        JLabel jLabel4 = new JLabel("LeP");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints7.gridx = 5;
        gridBagConstraints7.gridy = 1;
        this.add((Component)jLabel4, gridBagConstraints7);
        JSpinner jSpinner4 = this.o00000("ASP");
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints8.gridx = 6;
        gridBagConstraints8.gridy = 2;
        gridBagConstraints8.fill = 2;
        this.add((Component)jSpinner4, gridBagConstraints8);
        JLabel jLabel5 = new JLabel("IN");
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints9.gridx = 0;
        gridBagConstraints9.gridy = 3;
        this.add((Component)jLabel5, gridBagConstraints9);
        JSpinner jSpinner5 = this.o00000("IN");
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints10.gridx = 1;
        gridBagConstraints10.gridy = 3;
        gridBagConstraints10.fill = 2;
        this.add((Component)jSpinner5, gridBagConstraints10);
        JLabel jLabel6 = new JLabel("AsP");
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints11.gridx = 5;
        gridBagConstraints11.gridy = 2;
        this.add((Component)jLabel6, gridBagConstraints11);
        JLabel jLabel7 = new JLabel("AuP");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints12.gridx = 5;
        gridBagConstraints12.gridy = 3;
        this.add((Component)jLabel7, gridBagConstraints12);
        JSpinner jSpinner6 = this.o00000("AUP");
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints13.gridx = 6;
        gridBagConstraints13.gridy = 3;
        gridBagConstraints13.fill = 2;
        this.add((Component)jSpinner6, gridBagConstraints13);
        JLabel jLabel8 = new JLabel("CH");
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints14.gridx = 0;
        gridBagConstraints14.gridy = 4;
        this.add((Component)jLabel8, gridBagConstraints14);
        JSpinner jSpinner7 = this.o00000("CH");
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints15.gridx = 1;
        gridBagConstraints15.gridy = 4;
        gridBagConstraints15.fill = 2;
        this.add((Component)jSpinner7, gridBagConstraints15);
        JLabel jLabel9 = new JLabel("FF");
        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints16.gridx = 0;
        gridBagConstraints16.gridy = 5;
        this.add((Component)jLabel9, gridBagConstraints16);
        JSpinner jSpinner8 = this.o00000("FF");
        GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
        gridBagConstraints17.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints17.gridx = 1;
        gridBagConstraints17.gridy = 5;
        gridBagConstraints17.fill = 2;
        this.add((Component)jSpinner8, gridBagConstraints17);
        JLabel jLabel10 = new JLabel("INI");
        GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
        gridBagConstraints18.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints18.gridx = 5;
        gridBagConstraints18.gridy = 5;
        this.add((Component)jLabel10, gridBagConstraints18);
        this.void = this.o00000("INI-wanz");
        GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
        gridBagConstraints19.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints19.gridx = 6;
        gridBagConstraints19.gridy = 5;
        gridBagConstraints19.fill = 2;
        this.add((Component)this.void, gridBagConstraints19);
        this.o00000 = new JComboBox();
        this.o00000.setModel(new DefaultComboBoxModel<String>(new String[]{"W2", "W3", "W6", "W20"}));
        GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
        gridBagConstraints20.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints20.fill = 2;
        gridBagConstraints20.gridx = 7;
        gridBagConstraints20.gridy = 5;
        gridBagConstraints20.fill = 2;
        this.add((Component)this.o00000, gridBagConstraints20);
        JLabel jLabel11 = new JLabel("+");
        jLabel11.setLabelFor(this);
        GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
        gridBagConstraints21.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints21.gridx = 8;
        gridBagConstraints21.gridy = 5;
        this.add((Component)jLabel11, gridBagConstraints21);
        JLabel jLabel12 = new JLabel("GE");
        GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
        gridBagConstraints22.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints22.gridx = 0;
        gridBagConstraints22.gridy = 6;
        this.add((Component)jLabel12, gridBagConstraints22);
        JSpinner jSpinner9 = this.o00000("GE");
        GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
        gridBagConstraints23.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints23.gridx = 1;
        gridBagConstraints23.gridy = 6;
        gridBagConstraints23.fill = 2;
        this.add((Component)jSpinner9, gridBagConstraints23);
        this.\u00d600000 = this.o00000("INI-konstant");
        GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
        gridBagConstraints24.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints24.gridx = 9;
        gridBagConstraints24.gridy = 5;
        this.add((Component)this.\u00d600000, gridBagConstraints24);
        JLabel jLabel13 = new JLabel("KO");
        GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
        gridBagConstraints25.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints25.gridx = 0;
        gridBagConstraints25.gridy = 7;
        this.add((Component)jLabel13, gridBagConstraints25);
        JSpinner jSpinner10 = this.o00000("KO");
        GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
        gridBagConstraints26.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints26.gridx = 1;
        gridBagConstraints26.gridy = 7;
        gridBagConstraints26.fill = 2;
        this.add((Component)jSpinner10, gridBagConstraints26);
        JLabel jLabel14 = new JLabel("RS");
        GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
        gridBagConstraints27.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints27.gridx = 5;
        gridBagConstraints27.gridy = 7;
        this.add((Component)jLabel14, gridBagConstraints27);
        JSpinner jSpinner11 = this.o00000("RS");
        GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
        gridBagConstraints28.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints28.gridx = 6;
        gridBagConstraints28.gridy = 7;
        gridBagConstraints28.fill = 2;
        this.add((Component)jSpinner11, gridBagConstraints28);
        JLabel jLabel15 = new JLabel("KK");
        GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
        gridBagConstraints29.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints29.gridx = 0;
        gridBagConstraints29.gridy = 8;
        this.add((Component)jLabel15, gridBagConstraints29);
        JSpinner jSpinner12 = this.o00000("KK");
        GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
        gridBagConstraints30.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints30.gridx = 1;
        gridBagConstraints30.gridy = 8;
        gridBagConstraints30.fill = 2;
        this.add((Component)jSpinner12, gridBagConstraints30);
        JLabel jLabel16 = new JLabel("LO");
        GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
        gridBagConstraints31.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints31.gridx = 5;
        gridBagConstraints31.gridy = 9;
        this.add((Component)jLabel16, gridBagConstraints31);
        JSpinner jSpinner13 = this.o00000("LO");
        GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
        gridBagConstraints32.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints32.gridx = 6;
        gridBagConstraints32.gridy = 9;
        gridBagConstraints32.fill = 2;
        this.add((Component)jSpinner13, gridBagConstraints32);
        JLabel jLabel17 = new JLabel("MR");
        GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
        gridBagConstraints33.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints33.gridx = 0;
        gridBagConstraints33.gridy = 10;
        this.add((Component)jLabel17, gridBagConstraints33);
        JSpinner jSpinner14 = this.o00000("MR1");
        GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
        gridBagConstraints34.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints34.gridx = 1;
        gridBagConstraints34.gridy = 10;
        gridBagConstraints34.fill = 2;
        this.add((Component)jSpinner14, gridBagConstraints34);
        JSpinner jSpinner15 = this.o00000("MR2");
        GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
        gridBagConstraints35.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints35.gridx = 2;
        gridBagConstraints35.gridy = 10;
        gridBagConstraints35.fill = 2;
        this.add((Component)jSpinner15, gridBagConstraints35);
        JLabel jLabel18 = new JLabel("GS");
        GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
        gridBagConstraints36.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints36.gridx = 0;
        gridBagConstraints36.gridy = 11;
        this.add((Component)jLabel18, gridBagConstraints36);
        JSpinner jSpinner16 = this.o00000("GS1");
        GridBagConstraints gridBagConstraints37 = new GridBagConstraints();
        gridBagConstraints37.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints37.gridx = 1;
        gridBagConstraints37.fill = 2;
        gridBagConstraints37.gridy = 11;
        this.add((Component)jSpinner16, gridBagConstraints37);
        JSpinner jSpinner17 = this.o00000("GS2");
        GridBagConstraints gridBagConstraints38 = new GridBagConstraints();
        gridBagConstraints38.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints38.gridx = 2;
        gridBagConstraints38.gridy = 11;
        gridBagConstraints38.fill = 2;
        this.add((Component)jSpinner17, gridBagConstraints38);
        JSpinner jSpinner18 = this.o00000("GS3");
        GridBagConstraints gridBagConstraints39 = new GridBagConstraints();
        gridBagConstraints39.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints39.gridx = 3;
        gridBagConstraints39.gridy = 11;
        gridBagConstraints39.fill = 2;
        this.add((Component)jSpinner18, gridBagConstraints39);
        JLabel jLabel19 = new JLabel("GW");
        GridBagConstraints gridBagConstraints40 = new GridBagConstraints();
        gridBagConstraints40.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints40.gridx = 5;
        gridBagConstraints40.gridy = 11;
        this.add((Component)jLabel19, gridBagConstraints40);
        JSpinner jSpinner19 = this.o00000("GW");
        GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
        gridBagConstraints41.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints41.gridx = 6;
        gridBagConstraints41.fill = 2;
        gridBagConstraints41.gridy = 11;
        this.add((Component)jSpinner19, gridBagConstraints41);
        JLabel jLabel20 = new JLabel("Gr\u00f6\u00dfe");
        GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
        gridBagConstraints42.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints42.gridx = 0;
        gridBagConstraints42.gridy = 13;
        this.add((Component)jLabel20, gridBagConstraints42);
        this.Object = this.o00000("Gr\u00f6\u00dfe");
        GridBagConstraints gridBagConstraints43 = new GridBagConstraints();
        gridBagConstraints43.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints43.gridx = 1;
        gridBagConstraints43.fill = 2;
        gridBagConstraints43.gridy = 13;
        this.add((Component)this.Object, gridBagConstraints43);
        String string = "Tier";
        K k2 = (K)f2.o00000(A.o00000, 0);
        if (k2.newObject().equals((Object)K._o.\u00d600000)) {
            string = "Wesen";
        } else if (k2.newObject().equals((Object)K._o.Object)) {
            string = "Wesen";
        }
        JLabel jLabel21 = new JLabel(string + "familie");
        GridBagConstraints gridBagConstraints44 = new GridBagConstraints();
        gridBagConstraints44.insets = new Insets(0, 0, 2, 5);
        gridBagConstraints44.gridx = 0;
        gridBagConstraints44.gridy = 14;
        this.add((Component)jLabel21, gridBagConstraints44);
        this.\u00f400000 = new JTextField(60);
        GridBagConstraints gridBagConstraints45 = new GridBagConstraints();
        gridBagConstraints45.insets = new Insets(0, 0, 2, 5);
        gridBagConstraints45.gridx = 1;
        gridBagConstraints45.gridy = 14;
        gridBagConstraints45.gridwidth = 5;
        gridBagConstraints45.fill = 2;
        this.add((Component)this.\u00f400000, gridBagConstraints45);
        JLabel jLabel22 = new JLabel(string + "gattung");
        GridBagConstraints gridBagConstraints46 = new GridBagConstraints();
        gridBagConstraints46.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints46.gridx = 0;
        gridBagConstraints46.gridy = 15;
        this.add((Component)jLabel22, gridBagConstraints46);
        this.\u00d500000 = new JTextField(60);
        GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
        gridBagConstraints47.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints47.gridx = 1;
        gridBagConstraints47.gridy = 15;
        gridBagConstraints47.gridwidth = 5;
        gridBagConstraints47.fill = 2;
        this.add((Component)this.\u00d500000, gridBagConstraints47);
        JLabel jLabel23 = new JLabel("<html><body>\u00c4nderungen durch SF oder Vorteile finden keine automatische Ber\u00fccksichtigung!");
        GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
        gridBagConstraints48.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints48.gridx = 1;
        gridBagConstraints48.gridy = 16;
        gridBagConstraints48.gridheight = 1;
        gridBagConstraints48.gridwidth = 8;
        gridBagConstraints48.fill = 2;
        this.add((Component)jLabel23, gridBagConstraints48);
        this.new();
        this.\u00d300000();
    }

    public boolean o00000() {
        this.\u00d200000.o\u00d40000();
        for (Map.Entry<b_0, JSpinner> entry : this.\u00d400000.entrySet()) {
            this.\u00d200000.o00000(entry.getKey(), entry.getValue().getValue());
        }
        this.\u00d200000.o00000(new S((Integer)this.void.getValue(), Integer.parseInt(this.o00000.getSelectedItem().toString().substring(1)), (Integer)this.\u00d600000.getValue()));
        this.\u00d200000.\u00d300000(this.\u00f400000.getText());
        this.\u00d200000.\u00d200000(this.\u00d500000.getText());
        this.\u00d200000.returnsuper((Integer)this.Object.getValue());
        return true;
    }

    private JSpinner o00000(String string) {
        JSpinner jSpinner = new JSpinner();
        jSpinner.setMinimumSize(new Dimension(50, jSpinner.getPreferredSize().height));
        if (string.startsWith("INI-") || string.equals("Gr\u00f6\u00dfe")) {
            return jSpinner;
        }
        try {
            b_0 b_02 = oooo_3.void(string);
            this.\u00d400000.put(b_02, jSpinner);
        }
        catch (Exception exception) {
            oooo_0.\u00f500000("Not found" + string);
        }
        return jSpinner;
    }

    private void new() {
    }

    private void \u00d300000() {
        for (Map.Entry<b_0, JSpinner> entry : this.\u00d400000.entrySet()) {
            b_0 b_02 = entry.getKey();
            Number number = this.\u00d200000.o00000(b_02);
            int n = 0;
            int n2 = 50;
            if (b_02.equals(oooo_3.\u00f8\u00f5\u00d2000) || b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
                n = -10;
            }
            if (b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.thispublicsuper) || b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
                n2 = 100;
            }
            if (number instanceof Double || b_02.toString().startsWith("Geschwindigkeit")) {
                entry.getValue().setModel(new SpinnerValuesNumber(number, (double)n, (double)n2, 0.1));
                continue;
            }
            entry.getValue().setModel(new SpinnerValuesNumber((Integer)number, n, n2, 1));
        }
        S s = this.\u00d200000.returnObject();
        this.Object.setModel(new SpinnerNumberModelSafe(this.\u00d200000.\u00f5\u00d30000(), 0, 10000, 1));
        this.o00000.setSelectedItem("W" + s.Object());
        this.\u00d600000.setModel(new SpinnerNumberModelSafe(s.o00000(), -20, 20, 1));
        this.void.setModel(new SpinnerNumberModelSafe(s.\u00d400000(), 1, 20, 1));
        this.\u00f400000.setText(this.\u00d200000.\u00d2\u00d40000());
        this.\u00d500000.setText(this.\u00d200000.\u00d5\u00d30000());
    }
}

