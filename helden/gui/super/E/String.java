/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.E;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.E.A;
import helden.gui.super.E.OOoO;
import helden.gui.super.O0oO;
import helden.gui.super.OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.float;
import helden.gui.super.super;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class String
extends JPanel
implements float {
    private O0oO superObject;
    private JTable \u00f4\u00d30000;
    private A \u00d5\u00d30000;
    private JPanel \u00d4\u00d30000;
    private JComboBox \u00f5\u00d30000;
    private JTextField \u00d6\u00d30000 = null;
    private JTextField \u00f6\u00d30000 = null;

    public String(super super_) {
        this.setLayout(new BorderLayout());
        this.\u00d5\u00d30000 = new A(this, super_);
        this.superObject = new O0oO(this.\u00d5\u00d30000);
        this.\u00f5\u00d30000 = new JComboBox();
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00f6o0000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        this.add((Component)this.\u00d4o0000(), "North");
    }

    public void \u00d500000(helden.framework.held.object.oooo_1 oooo_12) {
        if (oooo_12 != null) {
            this.\u00d5o0000().setText(oooo_12.\u00d800000().\u00d400000() + " AP");
            this.\u00d6o0000().setText(oooo_12.\u00d800000().o\u00d30000() - oooo_12.\u00d800000().\u00d400000() + " AP");
        }
    }

    public JTextField \u00d6o0000() {
        if (this.\u00f6\u00d30000 == null) {
            this.\u00f6\u00d30000 = new JTextField();
            this.\u00f6\u00d30000.setEditable(false);
        }
        return this.\u00f6\u00d30000;
    }

    public JTextField \u00d5o0000() {
        if (this.\u00d6\u00d30000 == null) {
            this.\u00d6\u00d30000 = new JTextField();
            this.\u00d6\u00d30000.setEditable(false);
        }
        return this.\u00d6\u00d30000;
    }

    public voidsuper \u00f4o0000() {
        int n = this.\u00f6o0000().getSelectedRow();
        if (n < 0) {
            if (this.\u00f6o0000().getRowCount() > 0) {
                this.\u00f6o0000().setRowSelectionInterval(0, 0);
                n = 0;
            } else {
                return null;
            }
        }
        return (voidsuper)this.dosuper().getValueAt(n, 7);
    }

    public oo0o_0 \u00d200000(JButton jButton) {
        return this.superObject.o00000(jButton);
    }

    public JTable \u00f6o0000() {
        if (this.\u00f4\u00d30000 == null) {
            this.\u00f4\u00d30000 = new JTable();
            this.\u00f4\u00d30000.setSelectionMode(0);
            this.\u00f4\u00d30000.setDefaultRenderer(voidsuper.class, this.superObject);
            this.\u00f4\u00d30000.setRowHeight(oooo_1.o00000(20));
        }
        return this.\u00f4\u00d30000;
    }

    public OOoO dosuper() {
        return (OOoO)this.\u00f6o0000().getModel();
    }

    public helden.framework.held.object.oooo_1 \u00f5o0000() {
        return this.\u00d5\u00d30000.o00000();
    }

    @Override
    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d5\u00d30000.o00000(oooo_12);
        this.\u00d600000(oooo_12);
    }

    public void \u00d600000(helden.framework.held.object.oooo_1 oooo_12) {
        OOoO oOoO2 = new OOoO(oooo_12);
        this.\u00f5\u00d30000.setModel(new OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(oooo_12.\u00d800000()));
        this.\u00f6o0000().setRowHeight(oooo_1.o00000(20));
        this.\u00f6o0000().setModel(oOoO2);
        TableColumnModel tableColumnModel = this.\u00f4\u00d30000.getColumnModel();
        block10: for (int i2 = 0; i2 < this.\u00f6o0000().getColumnCount(); ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(20);
                    continue block10;
                }
                case 1: {
                    tableColumn.setPreferredWidth(80);
                    continue block10;
                }
                case 2: {
                    tableColumn.setPreferredWidth(280);
                    continue block10;
                }
                case 3: {
                    tableColumn.setPreferredWidth(30);
                    continue block10;
                }
                case 4: {
                    tableColumn.setPreferredWidth(120);
                    tableColumn.setCellEditor(new DefaultCellEditor(this.\u00f5\u00d30000));
                    continue block10;
                }
                case 5: {
                    tableColumn.setPreferredWidth(30);
                    continue block10;
                }
                case 6: {
                    tableColumn.setPreferredWidth(40);
                    continue block10;
                }
                case 7: {
                    tableColumn.setPreferredWidth(80);
                    tableColumn.setCellEditor(this.superObject);
                    continue block10;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 8 Spalten.");
                }
            }
        }
    }

    private JPanel \u00d4o0000() {
        if (this.\u00d4\u00d30000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.gridx = 3;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 2;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridy = 0;
            JLabel jLabel = new JLabel();
            jLabel.setText("Eingesetzte AP:");
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.fill = 2;
            gridBagConstraints3.gridy = 0;
            gridBagConstraints3.weightx = 1.0;
            gridBagConstraints3.gridx = 1;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 0;
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints4.gridy = 0;
            JLabel jLabel2 = new JLabel();
            jLabel2.setText("Freie AP:");
            this.\u00d4\u00d30000 = new JPanel();
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 5;
            gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints5.anchor = 13;
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.gridx = 6;
            gridBagConstraints6.anchor = 13;
            gridBagConstraints6.insets.top = 5;
            gridBagConstraints6.insets.bottom = 5;
            gridBagConstraints6.insets.right = 5;
            this.\u00d4\u00d30000.setName("Navigationspanel");
            this.\u00d4\u00d30000.setLayout(new GridBagLayout());
            this.\u00d4\u00d30000.setSize(new Dimension(554, 28));
            JButton jButton = new JButton("aktivieren");
            jButton.setName("Aktivierung");
            this.\u00d4\u00d30000.add((Component)new JLabel("Talent:"), gridBagConstraints5);
            this.\u00d4\u00d30000.add((Component)jButton, gridBagConstraints6);
            this.\u00d4\u00d30000.add((Component)jLabel2, gridBagConstraints4);
            jButton.addActionListener(this.\u00d5\u00d30000);
            this.\u00d4\u00d30000.add((Component)this.\u00d5o0000(), gridBagConstraints3);
            this.\u00d4\u00d30000.add((Component)jLabel, gridBagConstraints2);
            this.\u00d4\u00d30000.add((Component)this.\u00d6o0000(), gridBagConstraints);
        }
        return this.\u00d4\u00d30000;
    }
}

