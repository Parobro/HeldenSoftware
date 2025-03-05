/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.C.H;
import helden.gui.super.C.class;
import helden.gui.super.C.int;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Oo0O
extends JPanel {
    private JTable \u00d6O0000;
    private JTextField \u00d500000;
    private JButton \u00d2O0000;
    private JButton \u00d3O0000;
    private JButton for;
    private JTextField String;
    private JButton \u00f800000;
    private JButton oO0000;
    private JButton \u00f500000;
    private JTextField \u00d300000;
    private JButton \u00d800000;
    private JButton \u00f600000;
    private JButton null;
    private JButton \u00f8O0000;
    private JButton \u00d200000;
    private GridBagConstraints[] o00000;
    private class private;
    private ImageIcon \u00d5O0000;
    private ImageIcon \u00d8O0000;
    private H \u00d600000;
    private JCheckBox \u00f6O0000;
    private JCheckBox \u00f5O0000;
    private JCheckBox newsuper;

    public Oo0O(helden.framework.held.object.oooo_1 oooo_12, class clazz) {
        this.private = clazz;
        this.setLayout(new BorderLayout());
        this.Object();
        this.\u00d5O0000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
        this.\u00d8O0000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
        JPanel jPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        this.\u00d6O0000 = new JTable(new int(oooo_12, "Fernkampfwaffe", 0));
        this.\u00d6O0000.setRowHeight(oooo_1.o00000(20));
        this.o00000(oooo_12);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d6O0000);
        jScrollPaneFast.setPreferredSize(new Dimension(300, 500));
        jScrollPaneFast.setMinimumSize(new Dimension(300, 500));
        jScrollPaneFast.setMaximumSize(new Dimension(300, 500));
        this.o00000[4].gridy = 0;
        gridBagLayout.setConstraints(jScrollPaneFast, this.o00000[4]);
        jPanel.add(jScrollPaneFast);
        this.\u00d500000 = new JTextField();
        this.\u00d500000.setEditable(false);
        this.\u00d500000.setPreferredSize(new Dimension(100, 20));
        this.\u00d500000.setMinimumSize(new Dimension(100, 20));
        this.o00000[1].gridy = 0;
        gridBagLayout.setConstraints(this.\u00d500000, this.o00000[1]);
        jPanel.add(this.\u00d500000);
        JLabel jLabel = new JLabel("FKW1");
        jLabel.setPreferredSize(new Dimension(50, 20));
        jLabel.setMinimumSize(new Dimension(50, 20));
        this.o00000[0].gridy = 0;
        gridBagLayout.setConstraints(jLabel, this.o00000[0]);
        jPanel.add(jLabel);
        this.\u00d2O0000 = new JButton("I");
        this.\u00d2O0000.setName("I1");
        this.\u00d2O0000.setPreferredSize(new Dimension(60, 20));
        this.\u00d2O0000.setMinimumSize(new Dimension(60, 20));
        this.\u00d2O0000.addActionListener(clazz);
        this.\u00d2O0000.setEnabled(true);
        this.o00000[2].gridy = 0;
        gridBagLayout.setConstraints(this.\u00d2O0000, this.o00000[2]);
        jPanel.add(this.\u00d2O0000);
        this.\u00f6O0000 = new JCheckBox("Jagdwaffe");
        this.\u00f6O0000.setName("Jagtwaffe1");
        this.\u00f6O0000.setPreferredSize(new Dimension(100, 20));
        this.\u00f6O0000.setMinimumSize(new Dimension(100, 20));
        this.\u00f6O0000.addActionListener(clazz);
        this.\u00f6O0000.setEnabled(false);
        this.o00000[5].gridy = 0;
        gridBagLayout.setConstraints(this.\u00f6O0000, this.o00000[5]);
        jPanel.add(this.\u00f6O0000);
        this.\u00d3O0000 = new JButton(this.\u00d5O0000);
        this.\u00d3O0000.setName("ADD1");
        this.\u00d3O0000.addActionListener(clazz);
        this.o00000[3].gridy = 0;
        this.o00000[3].anchor = 15;
        gridBagLayout.setConstraints(this.\u00d3O0000, this.o00000[3]);
        jPanel.add(this.\u00d3O0000);
        this.for = new JButton(this.\u00d8O0000);
        this.for.setName("REM1");
        this.for.addActionListener(clazz);
        this.o00000[3].gridy = 1;
        this.o00000[3].anchor = 11;
        gridBagLayout.setConstraints(this.for, this.o00000[3]);
        jPanel.add(this.for);
        JLabel jLabel2 = new JLabel("FKW2");
        jLabel2.setPreferredSize(new Dimension(50, 20));
        jLabel2.setMinimumSize(new Dimension(50, 20));
        this.o00000[0].gridy = 2;
        gridBagLayout.setConstraints(jLabel2, this.o00000[0]);
        jPanel.add(jLabel2);
        this.\u00f800000 = new JButton("I");
        this.\u00f800000.setName("I2");
        this.\u00f800000.setPreferredSize(new Dimension(60, 20));
        this.\u00f800000.setMinimumSize(new Dimension(60, 20));
        this.\u00f800000.addActionListener(clazz);
        this.\u00f800000.setEnabled(true);
        this.\u00f5O0000 = new JCheckBox("Jagdwaffe");
        this.\u00f5O0000.setName("Jagtwaffe2");
        this.\u00f5O0000.setPreferredSize(new Dimension(100, 20));
        this.\u00f5O0000.setMinimumSize(new Dimension(100, 20));
        this.\u00f5O0000.addActionListener(clazz);
        this.\u00f5O0000.setEnabled(false);
        this.o00000[5].gridy = 2;
        gridBagLayout.setConstraints(this.\u00f5O0000, this.o00000[5]);
        jPanel.add(this.\u00f5O0000);
        this.o00000[2].gridy = 2;
        gridBagLayout.setConstraints(this.\u00f800000, this.o00000[2]);
        jPanel.add(this.\u00f800000);
        this.String = new JTextField();
        this.String.setEditable(false);
        this.String.setPreferredSize(new Dimension(100, 20));
        this.String.setMinimumSize(new Dimension(100, 20));
        this.o00000[1].gridy = 2;
        gridBagLayout.setConstraints(this.String, this.o00000[1]);
        jPanel.add(this.String);
        this.oO0000 = new JButton(this.\u00d5O0000);
        this.oO0000.setName("ADD2");
        this.oO0000.addActionListener(clazz);
        this.o00000[3].gridy = 2;
        this.o00000[3].anchor = 15;
        gridBagLayout.setConstraints(this.oO0000, this.o00000[3]);
        jPanel.add(this.oO0000);
        this.\u00f500000 = new JButton(this.\u00d8O0000);
        this.\u00f500000.setName("REM2");
        this.\u00f500000.addActionListener(clazz);
        this.o00000[3].gridy = 3;
        this.o00000[3].anchor = 11;
        gridBagLayout.setConstraints(this.\u00f500000, this.o00000[3]);
        jPanel.add(this.\u00f500000);
        JLabel jLabel3 = new JLabel("FKW3");
        jLabel3.setPreferredSize(new Dimension(50, 20));
        jLabel3.setMinimumSize(new Dimension(50, 20));
        this.o00000[0].gridy = 4;
        gridBagLayout.setConstraints(jLabel3, this.o00000[0]);
        jPanel.add(jLabel3);
        this.\u00d800000 = new JButton("I");
        this.\u00d800000.setName("I3");
        this.\u00d800000.setPreferredSize(new Dimension(60, 20));
        this.\u00d800000.setMinimumSize(new Dimension(60, 20));
        this.\u00d800000.addActionListener(clazz);
        this.\u00d800000.setEnabled(true);
        this.o00000[2].gridy = 4;
        gridBagLayout.setConstraints(this.\u00d800000, this.o00000[2]);
        jPanel.add(this.\u00d800000);
        this.newsuper = new JCheckBox("Jagdwaffe");
        this.newsuper.setName("Jagtwaffe3");
        this.newsuper.setPreferredSize(new Dimension(100, 20));
        this.newsuper.setMinimumSize(new Dimension(100, 20));
        this.newsuper.addActionListener(clazz);
        this.newsuper.setEnabled(false);
        this.o00000[5].gridy = 4;
        gridBagLayout.setConstraints(this.newsuper, this.o00000[5]);
        jPanel.add(this.newsuper);
        this.\u00d300000 = new JTextField();
        this.\u00d300000.setEditable(false);
        this.o00000[1].gridy = 4;
        this.\u00d300000.setPreferredSize(new Dimension(100, 20));
        this.\u00d300000.setMinimumSize(new Dimension(100, 20));
        gridBagLayout.setConstraints(this.\u00d300000, this.o00000[1]);
        jPanel.add(this.\u00d300000);
        this.\u00f600000 = new JButton(this.\u00d5O0000);
        this.\u00f600000.setName("ADD3");
        this.\u00f600000.addActionListener(clazz);
        this.o00000[3].gridy = 4;
        this.o00000[3].anchor = 15;
        gridBagLayout.setConstraints(this.\u00f600000, this.o00000[3]);
        jPanel.add(this.\u00f600000);
        this.null = new JButton(this.\u00d8O0000);
        this.null.setName("REM3");
        this.null.addActionListener(clazz);
        this.o00000[3].gridy = 5;
        this.o00000[3].anchor = 11;
        gridBagLayout.setConstraints(this.null, this.o00000[3]);
        jPanel.add(this.null);
        this.add((Component)jPanel, "Center");
        this.\u00d200000();
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
        if (this.\u00d200000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00d200000 = new JButton("Abbrechen", imageIcon);
            this.\u00d200000.setName("Abbrechen");
            this.\u00d200000.addActionListener(this.private);
        }
        return this.\u00d200000;
    }

    public JTable \u00d400000() {
        return this.\u00d6O0000;
    }

    public JCheckBox o00000(int n) {
        if (n == 0) {
            return this.\u00f6O0000;
        }
        if (n == 1) {
            return this.\u00f5O0000;
        }
        return this.newsuper;
    }

    public JButton \u00d500000() {
        if (this.\u00f8O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00f8O0000 = new JButton("OK", imageIcon);
            this.\u00f8O0000.setName("OK");
            this.\u00f8O0000.addActionListener(this.private);
        }
        return this.\u00f8O0000;
    }

    public JTextField \u00d200000(int n) {
        if (n == 0) {
            return this.\u00d500000;
        }
        if (n == 1) {
            return this.String;
        }
        return this.\u00d300000;
    }

    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d6O0000.setRowHeight(18);
        this.\u00d600000 = new H(this.private);
        TableColumnModel tableColumnModel = this.\u00d6O0000.getColumnModel();
        block5: for (int i2 = 0; i2 < this.\u00d6O0000.getColumnCount(); ++i2) {
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

    private void Object() {
        this.o00000 = new GridBagConstraints[6];
        this.o00000[0] = new GridBagConstraints();
        this.o00000[0].gridx = 0;
        this.o00000[0].gridwidth = 1;
        this.o00000[0].gridheight = 2;
        this.o00000[0].fill = 2;
        this.o00000[0].weightx = 1.0;
        this.o00000[0].weighty = 1.0;
        this.o00000[0].anchor = 10;
        this.o00000[0].insets = new Insets(5, 5, 5, 5);
        this.o00000[1] = new GridBagConstraints();
        this.o00000[1].gridx = 1;
        this.o00000[1].gridwidth = 1;
        this.o00000[1].gridheight = 2;
        this.o00000[1].fill = 0;
        this.o00000[1].weightx = 1.0;
        this.o00000[1].weighty = 0.0;
        this.o00000[1].anchor = 10;
        this.o00000[1].insets = new Insets(5, 5, 5, 5);
        this.o00000[2] = new GridBagConstraints();
        this.o00000[2].gridx = 2;
        this.o00000[2].gridwidth = 1;
        this.o00000[2].gridheight = 2;
        this.o00000[2].fill = 0;
        this.o00000[2].weightx = 1.0;
        this.o00000[2].weighty = 0.0;
        this.o00000[2].anchor = 10;
        this.o00000[2].insets = new Insets(5, 5, 5, 5);
        this.o00000[3] = new GridBagConstraints();
        this.o00000[3].gridx = 4;
        this.o00000[3].gridwidth = 1;
        this.o00000[3].gridheight = 1;
        this.o00000[3].fill = 1;
        this.o00000[3].weightx = 1.0;
        this.o00000[3].weighty = 1.0;
        this.o00000[3].insets = new Insets(5, 5, 5, 5);
        this.o00000[4] = new GridBagConstraints();
        this.o00000[4].gridwidth = 1;
        this.o00000[4].gridheight = 6;
        this.o00000[4].fill = 0;
        this.o00000[4].weightx = 0.0;
        this.o00000[4].weighty = 0.0;
        this.o00000[4].anchor = 10;
        this.o00000[4].gridx = 5;
        this.o00000[4].insets = new Insets(10, 5, 5, 5);
        this.o00000[5] = new GridBagConstraints();
        this.o00000[5].gridx = 3;
        this.o00000[5].gridwidth = 1;
        this.o00000[5].gridheight = 2;
        this.o00000[5].fill = 0;
        this.o00000[5].weightx = 1.0;
        this.o00000[5].weighty = 0.0;
        this.o00000[5].anchor = 10;
        this.o00000[5].insets = new Insets(5, 5, 5, 5);
    }
}

