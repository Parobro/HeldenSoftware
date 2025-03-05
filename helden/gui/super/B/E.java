/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.Object;
import helden.framework.Einstellungen;
import helden.gui.components.JComboCheckBox;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.B.D;
import helden.gui.super.B.F;
import helden.gui.super.B.K;
import helden.gui.super.B.M;
import helden.gui.super.B.int;
import helden.gui.super.B.interface;
import helden.gui.super.b.oo0o_0;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class E
extends JPanel
implements interface {
    private JList \u00f6\u00f80000 = null;
    private JList floatnull = null;
    private JScrollPaneFast dovoid = null;
    private JTable o\u00f80000 = null;
    private JTextField O\u00f80000 = null;
    private JButton \u00d6\u00f80000 = null;
    private JButton \u00d2\u00f80000 = null;
    private JButton \u00d5\u00f80000 = null;
    private JButton interfacevoid = null;
    private JPanel \u00f6\u00f60000 = null;
    private JPanel \u00f5\u00f60000 = null;
    private JSplitPane \u00f5\u00f80000 = null;
    private helden.framework.held.object.oooo_1 \u00f4\u00f60000;
    private K Objectnull;
    private JButton O0O000;
    private F \u00d6\u00f60000;
    private int \u00d4\u00f80000;
    private D voidnull;
    private M \u00d5\u00f60000;
    private JComboCheckBox \u00f4\u00f80000;

    public E(int n, helden.framework.held.object.oooo_1 oooo_12) {
        this.Objectnull = new K(this, n, oooo_12);
        this.\u00f4\u00f60000 = oooo_12;
        this.\u00f5\u00d50000();
        this.\u00d6\u00f60000 = new F(this);
        this.\u00d4\u00f80000 = new int(this.\u00d6\u00f60000);
        this.\u00d6\u00f60000.o00000(this.\u00d4\u00f80000);
        this.voidnull = new D(this.\u00d6\u00f60000);
        this.\u00d6\u00f60000.o00000(this.voidnull);
        this.\u00d5\u00f60000 = new M(this.\u00d6\u00f60000);
        this.\u00d6\u00f60000.o00000(this.\u00d5\u00f60000);
        this.\u00d6\u00f60000.o00000(this.\u00f4\u00f60000.\u00d800000());
        this.\u00d5\u00f60000.super(this.\u00f4\u00f60000);
        this.\u00f400000(this.\u00f4\u00f60000);
        this.\u00d6\u00f60000.o00000(this.\u00f5\u00d60000());
        this.Objectnull.String();
    }

    public JButton \u00f4\u00d60000() {
        if (this.\u00d2\u00f80000 == null) {
            this.\u00d2\u00f80000 = new JButton(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/openchain.gif"))));
            this.\u00d2\u00f80000.setText("Teilen");
            this.\u00d2\u00f80000.addActionListener(this.Objectnull);
            this.\u00d2\u00f80000.setEnabled(false);
        }
        return this.\u00d2\u00f80000;
    }

    public JButton \u00d2\u00d60000() {
        if (this.\u00d5\u00f80000 == null) {
            this.\u00d5\u00f80000 = new JButton(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/EditBCard.gif"))));
            this.\u00d5\u00f80000.setText("Editieren");
            this.\u00d5\u00f80000.addActionListener(this.Objectnull);
        }
        return this.\u00d5\u00f80000;
    }

    public K publicString() {
        return this.Objectnull;
    }

    public JList \u00d6\u00d60000() {
        if (this.floatnull == null) {
            ArrayList<helden.framework.E.F> arrayList = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().Object();
            Collections.sort(arrayList);
            this.floatnull = new JList<helden.framework.E.F>(arrayList.toArray(new helden.framework.E.F[0]));
            this.floatnull.setSelectionMode(0);
            this.floatnull.addListSelectionListener(this.Objectnull);
        }
        return this.floatnull;
    }

    public JList \u00d4\u00d60000() {
        if (this.\u00f6\u00f80000 == null) {
            Object[] objectArray = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().\u00d500000();
            this.\u00f6\u00f80000 = new JList<Object>(objectArray);
            this.\u00f6\u00f80000.setSelectionInterval(0, objectArray.length);
            this.\u00f6\u00f80000.addListSelectionListener(this.Objectnull);
        }
        return this.\u00f6\u00f80000;
    }

    public JButton o\u00d80000() {
        if (this.\u00d6\u00f80000 == null) {
            this.\u00d6\u00f80000 = new JButton();
            this.\u00d6\u00f80000.addActionListener(this.Objectnull);
            this.\u00d6\u00f80000.setText("Hinzuf\u00fcgen");
        }
        return this.\u00d6\u00f80000;
    }

    public JTable \u00f5\u00d60000() {
        if (this.o\u00f80000 == null) {
            this.o\u00f80000 = new JTable();
            this.o\u00f80000.getSelectionModel().addListSelectionListener(this.Objectnull);
            this.o\u00f80000.setRowHeight(oooo_1.o00000(20));
        }
        return this.o\u00f80000;
    }

    public JButton superclass() {
        if (this.O0O000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.O0O000 = new JButton("Ende", imageIcon);
            this.O0O000.setName("OK");
            this.O0O000.addActionListener(this.Objectnull);
        }
        return this.O0O000;
    }

    public JComboBox classclass() {
        return this.floatString();
    }

    public JTextField \u00f6\u00d60000() {
        if (this.O\u00f80000 == null) {
            this.O\u00f80000 = new JTextField();
            this.O\u00f80000.addKeyListener(this.Objectnull);
        }
        return this.O\u00f80000;
    }

    public JButton \u00f6\u00d50000() {
        if (this.interfacevoid == null) {
            this.interfacevoid = new JButton(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/chain.gif"))));
            this.interfacevoid.setText("Verbinden");
            this.interfacevoid.addActionListener(this.Objectnull);
            this.interfacevoid.setEnabled(false);
        }
        return this.interfacevoid;
    }

    @Override
    public void o00000() {
        if (this.\u00f4\u00f60000 != null) {
            this.\u00f400000(this.\u00f4\u00f60000);
            this.\u00d6\u00f60000.o00000(this.\u00f4\u00f60000.\u00d800000());
            this.\u00d6\u00f60000.o00000(this.\u00f5\u00d60000());
        }
        this.repaint();
    }

    public void o00000(JComboCheckBox jComboCheckBox) {
        this.\u00f4\u00f80000 = jComboCheckBox;
    }

    public void o00000(helden.framework.held.K k2) {
    }

    public void \u00f400000(helden.framework.held.object.oooo_1 oooo_12) {
        oo0o_0 oo0o_02 = new oo0o_0(oooo_12);
        this.\u00f5\u00d60000().setRowHeight(20);
        this.\u00f5\u00d60000().setModel(oo0o_02);
        TableColumnModel tableColumnModel = this.\u00f5\u00d60000().getColumnModel();
        block9: for (int i2 = 0; i2 < this.\u00f5\u00d60000().getColumnCount(); ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(20);
                    continue block9;
                }
                case 1: {
                    tableColumn.setPreferredWidth(200);
                    continue block9;
                }
                case 2: {
                    tableColumn.setPreferredWidth(80);
                    continue block9;
                }
                case 3: {
                    tableColumn.setPreferredWidth(30);
                    continue block9;
                }
                case 4: {
                    tableColumn.setCellRenderer(this.\u00d4\u00f80000);
                    tableColumn.setCellEditor(this.\u00d4\u00f80000);
                    tableColumn.setPreferredWidth(50);
                    continue block9;
                }
                case 5: {
                    tableColumn.setCellRenderer(this.voidnull);
                    tableColumn.setCellEditor(this.voidnull);
                    tableColumn.setPreferredWidth(50);
                    continue block9;
                }
                case 6: {
                    tableColumn.setCellRenderer(this.\u00d5\u00f60000);
                    tableColumn.setCellEditor(this.\u00d5\u00f60000);
                    tableColumn.setPreferredWidth(50);
                    continue block9;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 4 Spalten.");
                }
            }
        }
    }

    private JComboCheckBox floatString() {
        if (this.\u00f4\u00f80000 == null) {
            this.\u00f4\u00f80000 = new JComboCheckBox();
        }
        return this.\u00f4\u00f80000;
    }

    private JSplitPane o\u00d60000() {
        if (this.\u00f5\u00f80000 == null) {
            this.\u00f5\u00f80000 = new JSplitPane();
            this.\u00f5\u00f80000.setDividerLocation(200);
            this.\u00f5\u00f80000.setOneTouchExpandable(true);
            this.\u00f5\u00f80000.setLeftComponent(this.O\u00d80000());
            this.\u00f5\u00f80000.setRightComponent(this.O\u00d60000());
        }
        return this.\u00f5\u00f80000;
    }

    private JPanel O\u00d60000() {
        if (this.\u00f5\u00f60000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridx = 0;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.fill = 1;
            gridBagConstraints2.gridheight = 1;
            gridBagConstraints2.gridwidth = 4;
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.gridy = 1;
            gridBagConstraints2.weightx = 1.0;
            gridBagConstraints2.weighty = 1.0;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints3.gridy = 2;
            gridBagConstraints3.weightx = 1.0;
            gridBagConstraints3.gridx = 0;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints4.gridy = 2;
            gridBagConstraints4.weightx = 1.0;
            gridBagConstraints4.gridx = 3;
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints5.gridy = 2;
            gridBagConstraints5.weightx = 1.0;
            gridBagConstraints5.gridx = 1;
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints6.gridy = 2;
            gridBagConstraints6.weightx = 1.0;
            gridBagConstraints6.gridx = 2;
            JLabel jLabel = new JLabel();
            jLabel.setText("Inventar");
            this.\u00f5\u00f60000 = new JPanel();
            this.\u00f5\u00f60000.setLayout(new GridBagLayout());
            this.\u00f5\u00f60000.add((Component)this.\u00f6\u00d50000(), gridBagConstraints6);
            this.\u00f5\u00f60000.add((Component)this.superclass(), gridBagConstraints4);
            this.\u00f5\u00f60000.add((Component)this.\u00f4\u00d60000(), gridBagConstraints5);
            this.\u00f5\u00f60000.add((Component)this.\u00d2\u00d60000(), gridBagConstraints3);
            this.\u00f5\u00f60000.add((Component)this.\u00d5\u00d60000(), gridBagConstraints2);
            this.\u00f5\u00f60000.add((Component)jLabel, gridBagConstraints);
        }
        return this.\u00f5\u00f60000;
    }

    private JScrollPaneFast \u00d5\u00d60000() {
        if (this.dovoid == null) {
            this.dovoid = new JScrollPaneFast();
            this.dovoid.setViewportView(this.\u00f5\u00d60000());
        }
        return this.dovoid;
    }

    private JPanel O\u00d80000() {
        if (this.\u00f6\u00f60000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 8;
            gridBagConstraints.gridx = 0;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.fill = 1;
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.gridy = 6;
            gridBagConstraints2.weightx = 0.0;
            gridBagConstraints2.weighty = 1.0;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy = 5;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.fill = 2;
            gridBagConstraints4.gridx = 0;
            gridBagConstraints4.gridy = 4;
            gridBagConstraints4.weightx = 1.0;
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints5.gridy = 3;
            gridBagConstraints5.gridx = 0;
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.fill = 1;
            gridBagConstraints6.gridheight = 2;
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.gridy = 2;
            gridBagConstraints6.weightx = 1.0;
            gridBagConstraints6.weighty = 1.0;
            gridBagConstraints6.insets = new Insets(5, 5, 0, 0);
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.insets = new Insets(5, 5, 5, 0);
            gridBagConstraints7.gridy = 1;
            gridBagConstraints7.gridx = 0;
            JLabel jLabel = new JLabel();
            jLabel.setText("Gegenst\u00e4nde");
            JLabel jLabel2 = new JLabel();
            jLabel2.setText("Kategorien");
            JLabel jLabel3 = new JLabel();
            jLabel3.setText("Suche");
            JPanel jPanel = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWeights = new double[]{1.0};
            jPanel.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints8.fill = 2;
            gridBagConstraints8.gridx = 0;
            gridBagConstraints8.gridy = 0;
            if (Einstellungen.getInstance().isTestMode()) {
                this.floatString().setVisible(true);
            } else {
                this.floatString().setVisible(false);
            }
            jPanel.add((Component)this.floatString(), gridBagConstraints8);
            jPanel.add((Component)jLabel2, gridBagConstraints7);
            jPanel.add((Component)new JScrollPaneFast(this.\u00d4\u00d60000()), gridBagConstraints6);
            JPanel jPanel2 = new JPanel();
            jPanel2.setLayout(new GridBagLayout());
            jPanel2.add((Component)jLabel3, gridBagConstraints5);
            jPanel2.add((Component)this.\u00f6\u00d60000(), gridBagConstraints4);
            jPanel2.add((Component)jLabel, gridBagConstraints3);
            jPanel2.add((Component)new JScrollPaneFast(this.\u00d6\u00d60000()), gridBagConstraints2);
            jPanel2.add((Component)this.o\u00d80000(), gridBagConstraints);
            JSplitPane jSplitPane = new JSplitPane();
            jSplitPane.setDividerLocation(200);
            jSplitPane.setOrientation(0);
            jSplitPane.setOneTouchExpandable(true);
            jSplitPane.setTopComponent(jPanel);
            jSplitPane.setBottomComponent(jPanel2);
            this.\u00f6\u00f60000 = new JPanel();
            this.\u00f6\u00f60000.setLayout(new BorderLayout());
            this.\u00f6\u00f60000.add((Component)jSplitPane, "Center");
        }
        return this.\u00f6\u00f60000;
    }

    private void \u00f5\u00d50000() {
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(800, 580));
        this.add((Component)this.o\u00d60000(), "Center");
    }
}

