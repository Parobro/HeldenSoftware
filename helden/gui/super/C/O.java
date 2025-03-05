/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.F;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.C.H;
import helden.gui.super.C.J;
import helden.gui.super.C.int;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O
extends JPanel {
    private JTable \u00d300000;
    private JTable null;
    private JButton String;
    private JButton \u00d500000;
    private J \u00d200000;
    private JButton \u00d800000;
    private JButton o00000;
    private H \u00d600000;

    public O(helden.framework.held.object.oooo_1 oooo_12, J j2, int n) {
        this.\u00d200000 = j2;
        this.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        this.\u00d300000 = new JTable(new int(oooo_12, "Getragene R\u00fcstung", n));
        this.\u00d300000.setRowHeight(oooo_1.o00000(20));
        this.String();
        this.\u00d300000.setSelectionMode(2);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d300000);
        jScrollPaneFast.setPreferredSize(new Dimension(300, 500));
        jScrollPaneFast.setMinimumSize(new Dimension(300, 500));
        jScrollPaneFast.setMaximumSize(new Dimension(300, 500));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jScrollPaneFast, gridBagConstraints);
        jPanel.add(jScrollPaneFast);
        this.null = new JTable(new int(oooo_12, "Ruestung", n));
        this.null.setRowHeight(oooo_1.o00000(20));
        this.o00000(oooo_12);
        this.null.setSelectionMode(2);
        JScrollPaneFast jScrollPaneFast2 = new JScrollPaneFast(this.null);
        jScrollPaneFast2.setPreferredSize(new Dimension(300, 500));
        jScrollPaneFast2.setMinimumSize(new Dimension(300, 500));
        jScrollPaneFast2.setMaximumSize(new Dimension(300, 500));
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jScrollPaneFast2, gridBagConstraints);
        jPanel.add(jScrollPaneFast2);
        ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
        this.String = new JButton(imageIcon);
        this.String.setName("ADD");
        this.String.addActionListener(j2);
        this.String.setAlignmentY(0.0f);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = 0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = 15;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(this.String, gridBagConstraints);
        jPanel.add(this.String);
        ImageIcon imageIcon2 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
        this.\u00d500000 = new JButton(imageIcon2);
        this.\u00d500000.setName("REM");
        this.\u00d500000.addActionListener(j2);
        this.\u00d500000.setAlignmentY(0.0f);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = 0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(this.\u00d500000, gridBagConstraints);
        jPanel.add(this.\u00d500000);
        this.add((Component)jPanel, "Center");
        this.setVisible(true);
        this.\u00d200000();
    }

    public void o00000(ArrayList<F> arrayList) {
        this.\u00d300000.removeAll();
        this.\u00d300000.setModel(new int(arrayList));
        this.String();
    }

    public void \u00d200000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d500000());
        jPanel.add(this.o00000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton o00000() {
        if (this.o00000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.o00000 = new JButton("Abbrechen", imageIcon);
            this.o00000.setName("Abbrechen");
            this.o00000.addActionListener(this.\u00d200000);
        }
        return this.o00000;
    }

    public JTable \u00d300000() {
        return this.null;
    }

    public JButton \u00d500000() {
        if (this.\u00d800000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d800000 = new JButton("OK", imageIcon);
            this.\u00d800000.setName("OK");
            this.\u00d800000.addActionListener(this.\u00d200000);
        }
        return this.\u00d800000;
    }

    public JTable \u00d600000() {
        return this.\u00d300000;
    }

    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        this.null.setRowHeight(18);
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new H(this.\u00d200000);
        }
        TableColumnModel tableColumnModel = this.null.getColumnModel();
        block5: for (int i2 = 0; i2 < this.null.getColumnCount(); ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(60);
                    tableColumn.setMinWidth(60);
                    tableColumn.setMaxWidth(60);
                    continue block5;
                }
                case 1: {
                    tableColumn.setPreferredWidth(180);
                    tableColumn.setMinWidth(180);
                    continue block5;
                }
                case 2: {
                    tableColumn.setPreferredWidth(60);
                    tableColumn.setMinWidth(60);
                    tableColumn.setMaxWidth(60);
                    tableColumn.setCellRenderer(this.\u00d600000);
                    tableColumn.setCellEditor(this.\u00d600000);
                    continue block5;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 3 Spalten.");
                }
            }
        }
    }

    public void String() {
        this.\u00d300000.setRowHeight(18);
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new H(this.\u00d200000);
        }
        TableColumnModel tableColumnModel = this.\u00d300000.getColumnModel();
        block5: for (int i2 = 0; i2 < this.\u00d300000.getColumnCount(); ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(60);
                    tableColumn.setMinWidth(60);
                    tableColumn.setMaxWidth(60);
                    continue block5;
                }
                case 1: {
                    tableColumn.setPreferredWidth(180);
                    tableColumn.setMinWidth(180);
                    continue block5;
                }
                case 2: {
                    tableColumn.setPreferredWidth(60);
                    tableColumn.setMinWidth(60);
                    tableColumn.setMaxWidth(60);
                    tableColumn.setCellRenderer(this.\u00d600000);
                    tableColumn.setCellEditor(this.\u00d600000);
                    continue block5;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 3 Spalten.");
                }
            }
        }
    }
}

