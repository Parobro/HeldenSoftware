/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

import helden.framework.OOoO.o00O;
import helden.framework.held.Object.O0OO;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.G.B.D;
import helden.gui.G.B.E;
import helden.gui.G.B.F;
import helden.gui.G.B.Object;
import helden.gui.G.B.oOOO;
import helden.gui.G.B.oOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
extends JPanel {
    private JComboBox \u00f500000 = null;
    private JScrollPaneFast String = null;
    private JScrollPaneFast \u00d300000 = null;
    private JTable \u00d600000 = null;
    private JTable \u00f600000 = null;
    private Object \u00d800000;
    private JList \u00d200000 = null;
    private F<Zauber> \u00f800000;
    private oOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO null;
    private oOOO o00000;
    private F<KonkreterZauber> \u00d500000;

    public B() {
        this.\u00f600000();
    }

    public B(Object object, O0OO o0OO2) {
        this.\u00d800000 = object;
        this.\u00f800000 = new F(object, "+");
        this.\u00d500000 = new F(object, "-");
        this.o00000 = new oOOO(object, o0OO2);
        this.null = new oOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(object, o0OO2);
        this.\u00f600000();
        this.super(o0OO2);
        this.\u00d200000(o0OO2);
    }

    public oOOO int() {
        return this.o00000;
    }

    public E \u00d800000() {
        return (E)this.\u00f800000().getModel();
    }

    public DefaultListModel \u00d400000() {
        return (DefaultListModel)this.OO0000().getModel();
    }

    public D \u00f400000() {
        return (D)this.\u00f600000.getModel();
    }

    public JComboBox class() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JComboBox();
            this.\u00f500000.addItem("Alle");
            this.\u00f500000.addItem("Beherrschte");
            Iterator<o00O> iterator = o00O.\u00d200000();
            while (iterator.hasNext()) {
                this.\u00f500000.addItem(iterator.next().toString());
            }
            this.\u00f500000.addActionListener(this.\u00d800000);
        }
        return this.\u00f500000;
    }

    public KonkreterZauber super() {
        Zauber zauber = this.\u00d800000().\u00d400000();
        return KonkreterZauber.getZauber(zauber, this.null.o00000(zauber), "");
    }

    public void super(O0OO o0OO2) {
        this.\u00f800000().setModel(new E(o0OO2));
        this.\u00f800000().setRowHeight(oooo_1.o00000(20));
        TableColumnModel tableColumnModel = this.\u00d600000.getColumnModel();
        block6: for (int i2 = 0; i2 < 4; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(250);
                    continue block6;
                }
                case 1: {
                    tableColumn.setPreferredWidth(70);
                    tableColumn.setCellRenderer(this.null);
                    tableColumn.setCellEditor(this.null);
                    continue block6;
                }
                case 2: {
                    tableColumn.setPreferredWidth(150);
                    continue block6;
                }
                case 3: {
                    tableColumn.setPreferredWidth(60);
                    tableColumn.setCellRenderer(this.\u00f800000);
                    tableColumn.setCellEditor(this.\u00f800000);
                    continue block6;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 7 Spalten.");
                }
            }
        }
    }

    public void \u00d200000(O0OO o0OO2) {
        this.\u00d600000().setModel(new D(o0OO2));
        this.\u00d600000().setRowHeight(oooo_1.o00000(20));
        TableColumnModel tableColumnModel = this.\u00f600000.getColumnModel();
        block6: for (int i2 = 0; i2 < 4; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(250);
                    continue block6;
                }
                case 1: {
                    tableColumn.setPreferredWidth(30);
                    continue block6;
                }
                case 2: {
                    tableColumn.setPreferredWidth(150);
                    tableColumn.setCellRenderer(this.o00000);
                    tableColumn.setCellEditor(this.o00000);
                    continue block6;
                }
                case 3: {
                    tableColumn.setPreferredWidth(80);
                    tableColumn.setCellRenderer(this.\u00d500000);
                    tableColumn.setCellEditor(this.\u00d500000);
                    continue block6;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 7 Spalten.");
                }
            }
        }
    }

    private JList OO0000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JList();
            this.\u00d200000.setModel(new DefaultListModel());
        }
        return this.\u00d200000;
    }

    private JTable \u00f800000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JTable();
        }
        return this.\u00d600000;
    }

    private JTable \u00d600000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JTable();
        }
        return this.\u00f600000;
    }

    private JScrollPaneFast \u00d200000() {
        if (this.String == null) {
            this.String = new JScrollPaneFast();
            this.String.setViewportView(this.\u00f800000());
        }
        return this.String;
    }

    private JScrollPaneFast \u00d300000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JScrollPaneFast();
            this.\u00d300000.setViewportView(this.\u00d600000());
        }
        return this.\u00d300000;
    }

    private void \u00f600000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridy = 4;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 0;
        gridBagConstraints2.gridy = 2;
        gridBagConstraints2.weightx = 0.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridx = 3;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 0;
        gridBagConstraints3.gridy = 3;
        gridBagConstraints3.weightx = 0.0;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridx = 3;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.gridy = 6;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.weighty = 1.0;
        gridBagConstraints4.gridwidth = 4;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridx = 0;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 1;
        gridBagConstraints5.gridy = 1;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 1.0;
        gridBagConstraints5.gridwidth = 4;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridx = 0;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.fill = 1;
        gridBagConstraints6.gridy = 4;
        gridBagConstraints6.weightx = 1.0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridx = 1;
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.anchor = 13;
        gridBagConstraints7.fill = 3;
        gridBagConstraints7.gridy = 4;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.fill = 1;
        gridBagConstraints8.gridy = 3;
        gridBagConstraints8.weightx = 1.0;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridx = 1;
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.fill = 1;
        gridBagConstraints9.gridy = 2;
        gridBagConstraints9.weightx = 1.0;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.gridx = 1;
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 0;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.anchor = 13;
        gridBagConstraints10.gridy = 3;
        JLabel jLabel = new JLabel();
        jLabel.setText("Merkmal");
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 0;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.anchor = 13;
        gridBagConstraints11.gridy = 2;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        jPanel.add((Component)jLabel, gridBagConstraints10);
        jPanel.add((Component)this.class(), gridBagConstraints8);
        jPanel.add((Component)this.\u00d200000(), gridBagConstraints5);
        jPanel.add((Component)this.\u00d300000(), gridBagConstraints4);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(400, 600));
        this.add((Component)jPanel, "Center");
    }
}

