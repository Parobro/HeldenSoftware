/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.super;

import helden.framework.Einstellungen;
import helden.gui.components.JTextAreaWithRangeCheckUMenu;
import helden.gui.components.JTextFieldWithRangeCheckUMenu;
import helden.gui.super.OooO.super.o0OO;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OOoO
extends JPanel {
    private JPanel \u00f500000;
    private JPanel if;
    private JPanel \u00d4O0000;
    private JLabel return;
    private JLabel \u00d500000;
    private JLabel \u00d3O0000;
    private JLabel new;
    private JLabel o00000;
    private JLabel \u00d5O0000;
    private JComboBox \u00d800000;
    private JTextFieldWithRangeCheckUMenu \u00d400000;
    private JTextFieldWithRangeCheckUMenu \u00f400000;
    private JTextFieldWithRangeCheckUMenu thissuper;
    private JTextFieldWithRangeCheckUMenu OO0000;
    private JTextAreaWithRangeCheckUMenu \u00d300000;
    private JTextAreaWithRangeCheckUMenu while;
    private JLabel oO0000;
    private o0OO \u00f800000;

    public OOoO(o0OO o0OO2) {
        this.\u00f800000 = o0OO2;
        this.setBorder(new EtchedBorder(1, null, null));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{100, 60, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 14, 14, 14, 14, 14, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        this.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add((Component)this.\u00f600000(), gridBagConstraints);
        this.\u00d5O0000 = new JLabel("Kommentar:");
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        this.add((Component)this.\u00d5O0000, gridBagConstraints2);
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridy = 1;
        this.add((Component)this.int(), gridBagConstraints3);
        this.return = new JLabel("Anmerkung:");
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 2;
        this.add((Component)this.return, gridBagConstraints4);
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.gridy = 2;
        this.add((Component)this.\u00d3O0000(), gridBagConstraints5);
        this.new = new JLabel("Wirkungsdauer:");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 3;
        this.add((Component)this.new, gridBagConstraints6);
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.fill = 2;
        gridBagConstraints7.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints7.gridx = 1;
        gridBagConstraints7.gridy = 3;
        this.add((Component)this.\u00f400000(), gridBagConstraints7);
        this.\u00d3O0000 = new JLabel("Zauberdauer:");
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints8.gridx = 0;
        gridBagConstraints8.gridy = 4;
        this.add((Component)this.\u00d3O0000, gridBagConstraints8);
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.fill = 2;
        gridBagConstraints9.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.gridy = 4;
        this.add((Component)this.super(), gridBagConstraints9);
        this.\u00d500000 = new JLabel("Kosten:");
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints10.gridx = 0;
        gridBagConstraints10.gridy = 5;
        this.add((Component)this.\u00d500000, gridBagConstraints10);
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.fill = 2;
        gridBagConstraints11.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints11.gridx = 1;
        gridBagConstraints11.gridy = 5;
        this.add((Component)this.\u00d4O0000(), gridBagConstraints11);
        this.o00000 = new JLabel("Reichweite:");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints12.gridx = 0;
        gridBagConstraints12.gridy = 6;
        this.add((Component)this.o00000, gridBagConstraints12);
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints13.fill = 2;
        gridBagConstraints13.gridx = 1;
        gridBagConstraints13.gridy = 6;
        this.add((Component)this.do(), gridBagConstraints13);
    }

    public JPanel \u00d3O0000() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JPanel();
            this.\u00d4O0000.setBorder(new EtchedBorder(1, null, null));
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{369, 0};
            gridBagLayout.rowHeights = new int[]{0, 0};
            gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.\u00d4O0000.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.\u00d600000().setBorderPanel(this.\u00d4O0000);
            this.\u00d4O0000.add((Component)this.\u00d600000(), gridBagConstraints);
        }
        return this.\u00d4O0000;
    }

    public JTextAreaWithRangeCheckUMenu \u00d300000() {
        if (this.while == null) {
            this.while = new JTextAreaWithRangeCheckUMenu(380, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.while.setLineWrap(true);
            this.while.setRows(3);
            this.while.setColumns(10);
            this.while.setDragEnabled(true);
        }
        return this.while;
    }

    public JTextAreaWithRangeCheckUMenu \u00d600000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JTextAreaWithRangeCheckUMenu(250, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.\u00d300000.setColumns(10);
            this.\u00d300000.setLineWrap(true);
            this.\u00d300000.setDragEnabled(true);
        }
        return this.\u00d300000;
    }

    public JTextFieldWithRangeCheckUMenu \u00d4O0000() {
        if (this.OO0000 == null) {
            this.OO0000 = new JTextFieldWithRangeCheckUMenu(60, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.OO0000.setColumns(10);
            this.OO0000.setDragEnabled(true);
        }
        return this.OO0000;
    }

    public JTextFieldWithRangeCheckUMenu super() {
        if (this.thissuper == null) {
            this.thissuper = new JTextFieldWithRangeCheckUMenu(70, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.thissuper.setColumns(10);
            this.thissuper.setDragEnabled(true);
        }
        return this.thissuper;
    }

    public JTextFieldWithRangeCheckUMenu \u00f400000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JTextFieldWithRangeCheckUMenu(90, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.\u00f400000.setColumns(10);
            this.\u00f400000.setDragEnabled(true);
        }
        return this.\u00f400000;
    }

    public JTextFieldWithRangeCheckUMenu do() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JTextFieldWithRangeCheckUMenu(70, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.\u00d400000.setColumns(10);
            this.\u00d400000.setDragEnabled(true);
        }
        return this.\u00d400000;
    }

    public JComboBox OO0000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JComboBox();
            this.\u00d800000.addActionListener(this.\u00f800000);
        }
        return this.\u00d800000;
    }

    public JLabel class() {
        return this.oO0000;
    }

    public JLabel \u00f800000() {
        return this.\u00d5O0000;
    }

    public JLabel \u00d200000() {
        return this.return;
    }

    public JLabel \u00d400000() {
        return this.\u00d500000;
    }

    public JLabel \u00d2O0000() {
        return this.\u00d3O0000;
    }

    public JLabel interface() {
        return this.new;
    }

    public JLabel \u00d800000() {
        return this.o00000;
    }

    private JPanel \u00f600000() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{236, 60, 0};
            gridBagLayout.rowHeights = new int[]{0, 0};
            gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.\u00f500000.setLayout(gridBagLayout);
            this.oO0000 = new JLabel("NamedesZaubers");
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = 13;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.\u00f500000.add((Component)this.oO0000, gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.anchor = 13;
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            this.\u00f500000.add((Component)this.OO0000(), gridBagConstraints2);
        }
        return this.\u00f500000;
    }

    private JPanel int() {
        if (this.if == null) {
            this.if = new JPanel();
            this.if.setBorder(new EtchedBorder());
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0};
            gridBagLayout.columnWeights = new double[]{3.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.if.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.if.add((Component)this.\u00d300000(), gridBagConstraints);
        }
        return this.if;
    }
}

