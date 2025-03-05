/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.E;

import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.E.B;
import helden.gui.super.E.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.e.oooo_0;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class G
extends JPanel {
    private JComboBox \u00d600000 = null;
    private JTextField \u00d400000 = null;
    private JTextField void = null;
    private JButton \u00f500000 = null;
    private JScrollPaneFast \u00d200000 = null;
    private JList Object = null;
    private JScrollPaneFast OO0000 = null;
    private JTable o00000 = null;
    private oooo_0 \u00d500000;
    private JButton \u00f400000;
    private JButton float;
    private o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f600000;

    public G(JDialog jDialog, helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d500000 = new oooo_0(jDialog, this, oooo_12);
        this.\u00f600000 = new o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this.\u00d500000);
        this.void();
        this.o00000(oooo_12);
    }

    public void \u00f400000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d400000());
        jPanel.add(this.\u00d200000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton \u00d200000() {
        if (this.float == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.float = new JButton("Abbrechen", imageIcon);
            this.float.setName("Abbrechen");
            this.float.addActionListener(this.\u00d500000);
        }
        return this.float;
    }

    public DefaultListModel \u00d2O0000() {
        return (DefaultListModel)this.Object().getModel();
    }

    public JTextField \u00d500000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JTextField();
            this.\u00d400000.setEditable(false);
        }
        return this.\u00d400000;
    }

    public JTextField \u00d600000() {
        if (this.void == null) {
            this.void = new JTextField();
            this.void.setEditable(false);
        }
        return this.void;
    }

    public JButton \u00d400000() {
        if (this.\u00f400000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00f400000 = new JButton("OK", imageIcon);
            this.\u00f400000.setName("OK");
            this.\u00f400000.addActionListener(this.\u00d500000);
        }
        return this.\u00f400000;
    }

    public JButton float() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JButton();
            this.\u00f500000.setText("Letztes Talent l\u00f6schen");
            this.\u00f500000.addActionListener(this.\u00d500000);
        }
        return this.\u00f500000;
    }

    public JComboBox o00000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JComboBox();
            Iterator<String> iterator = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d500000().iterator();
            this.\u00d600000.addItem("Alle");
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000.toString()) || string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d3O0000.toString()) || string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.int.toString()) || string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d300000.toString()) || string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d200000.toString()) || string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d2O0000.toString()) || string.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f6O0000.toString())) continue;
                this.\u00d600000.addItem(string);
            }
            this.\u00d600000.setSelectedItem("Alle");
            this.\u00d600000.addActionListener(this.\u00d500000);
            this.\u00d600000.setMaximumRowCount(10);
        }
        return this.\u00d600000;
    }

    public B \u00f600000() {
        return (B)this.oO0000().getModel();
    }

    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        this.oO0000().setModel(new B(oooo_12));
        this.oO0000().setRowHeight(20);
        TableColumnModel tableColumnModel = this.oO0000().getColumnModel();
        block8: for (int i2 = 0; i2 < 6; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(20);
                    continue block8;
                }
                case 1: {
                    tableColumn.setPreferredWidth(250);
                    continue block8;
                }
                case 2: {
                    tableColumn.setPreferredWidth(150);
                    continue block8;
                }
                case 3: {
                    tableColumn.setPreferredWidth(30);
                    continue block8;
                }
                case 4: {
                    tableColumn.setPreferredWidth(30);
                    continue block8;
                }
                case 5: {
                    tableColumn.setPreferredWidth(80);
                    tableColumn.setCellRenderer(this.\u00f600000);
                    tableColumn.setCellEditor(this.\u00f600000);
                    continue block8;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 7 Spalten.");
                }
            }
        }
    }

    private JList Object() {
        if (this.Object == null) {
            this.Object = new JList();
            this.Object.setModel(new DefaultListModel());
        }
        return this.Object;
    }

    private JScrollPaneFast OO0000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JScrollPaneFast();
            this.\u00d200000.setViewportView(this.Object());
        }
        return this.\u00d200000;
    }

    private JScrollPaneFast \u00f500000() {
        if (this.OO0000 == null) {
            this.OO0000 = new JScrollPaneFast();
            this.OO0000.setViewportView(this.oO0000());
        }
        return this.OO0000;
    }

    private JTable oO0000() {
        if (this.o00000 == null) {
            this.o00000 = new JTable();
            this.o00000.setRowHeight(oooo_1.o00000(20));
        }
        return this.o00000;
    }

    private void void() {
        JPanel jPanel = new JPanel();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridx = 0;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridy = 3;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.gridwidth = 4;
        gridBagConstraints2.gridx = 0;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.gridwidth = 2;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridy = 2;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.gridy = 1;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridx = 3;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 2;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.anchor = 13;
        gridBagConstraints5.gridy = 1;
        JLabel jLabel = new JLabel();
        jLabel.setText("Eingesetzte AP");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.anchor = 13;
        gridBagConstraints6.gridy = 2;
        JLabel jLabel2 = new JLabel("Talentgruppe");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.anchor = 13;
        gridBagConstraints7.gridy = 1;
        JLabel jLabel3 = new JLabel("AP-Guthaben");
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridy = 2;
        gridBagConstraints8.weightx = 1.0;
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridx = 1;
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.fill = 2;
        gridBagConstraints9.weightx = 1.0;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.gridy = 1;
        jPanel.setLayout(new GridBagLayout());
        jPanel.setSize(new Dimension(406, 460));
        jPanel.add((Component)this.o00000(), gridBagConstraints8);
        jPanel.add((Component)this.\u00d500000(), gridBagConstraints9);
        jPanel.add((Component)jLabel3, gridBagConstraints7);
        jPanel.add((Component)jLabel2, gridBagConstraints6);
        jPanel.add((Component)jLabel, gridBagConstraints5);
        jPanel.add((Component)this.\u00d600000(), gridBagConstraints4);
        jPanel.add((Component)this.float(), gridBagConstraints3);
        jPanel.add((Component)this.OO0000(), gridBagConstraints2);
        jPanel.add((Component)this.\u00f500000(), gridBagConstraints);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(400, 600));
        this.add((Component)jPanel, "Center");
        this.\u00f400000();
    }
}

