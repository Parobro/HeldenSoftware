/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.B;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.C.H;
import helden.gui.super.C.float;
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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
extends JPanel {
    private JButton \u00d6O0000;
    private JButton \u00d300000;
    private JTextField class;
    private JCheckBox \u00f400000;
    private JTable \u00d200000;
    private JButton do;
    private JButton \u00d2O0000;
    private JButton \u00f800000;
    private JTextField \u00d400000;
    private JCheckBox \u00d800000;
    private JButton OO0000;
    private JButton \u00f600000;
    private JButton int;
    private float interface;
    private GridBagConstraints[] super;
    private H \u00d600000;
    private JComboBox \u00d4O0000;
    private JComboBox \u00d3O0000;

    public A(helden.framework.held.object.oooo_1 oooo_12, float float_) {
        this.interface = float_;
        this.setLayout(new BorderLayout());
        ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
        ImageIcon imageIcon2 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
        JPanel jPanel = new JPanel();
        this.\u00d600000();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        String[] stringArray = new String[]{B.super(B.\u00d300000), B.super(B.\u00f600000)};
        JLabel jLabel = new JLabel("Schild 1");
        this.super[0].gridy = 0;
        gridBagLayout.setConstraints(jLabel, this.super[0]);
        jPanel.add(jLabel);
        this.class = new JTextField();
        this.class.setPreferredSize(new Dimension(100, 20));
        this.class.setMinimumSize(new Dimension(100, 20));
        this.class.setEditable(false);
        this.super[1].gridy = 0;
        gridBagLayout.setConstraints(this.class, this.super[1]);
        jPanel.add(this.class);
        this.\u00f400000 = new JCheckBox("ist NKW");
        this.\u00f400000.setEnabled(false);
        this.super[2].gridy = 0;
        gridBagLayout.setConstraints(this.\u00f400000, this.super[2]);
        jPanel.add(this.\u00f400000);
        this.\u00d4O0000 = new JComboBox<String>(stringArray);
        this.super[6].gridy = 1;
        gridBagLayout.setConstraints(this.\u00d4O0000, this.super[6]);
        jPanel.add(this.\u00d4O0000);
        this.\u00d2O0000 = new JButton(imageIcon);
        this.\u00d2O0000.setName("ADD1");
        this.\u00d2O0000.addActionListener(float_);
        this.super[4].gridy = 0;
        this.super[4].anchor = 15;
        gridBagLayout.setConstraints(this.\u00d2O0000, this.super[4]);
        jPanel.add(this.\u00d2O0000);
        this.do = new JButton("I");
        this.do.setName("I2");
        this.do.addActionListener(float_);
        this.do.setEnabled(false);
        this.super[3].gridy = 0;
        gridBagLayout.setConstraints(this.do, this.super[3]);
        jPanel.add(this.do);
        this.\u00f800000 = new JButton(imageIcon2);
        this.\u00f800000.setName("REM1");
        this.super[4].anchor = 11;
        this.\u00f800000.addActionListener(float_);
        this.super[4].gridy = 1;
        gridBagLayout.setConstraints(this.\u00f800000, this.super[4]);
        jPanel.add(this.\u00f800000);
        this.\u00d200000 = new JTable(new int(oooo_12, "Schild", 0));
        this.\u00d200000.setRowHeight(oooo_1.o00000(20));
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d200000);
        jScrollPaneFast.setPreferredSize(new Dimension(300, 500));
        jScrollPaneFast.setMinimumSize(new Dimension(300, 500));
        jScrollPaneFast.setMaximumSize(new Dimension(300, 500));
        this.super[5].gridy = 0;
        gridBagLayout.setConstraints(jScrollPaneFast, this.super[5]);
        jPanel.add(jScrollPaneFast);
        this.\u00d400000 = new JTextField();
        this.\u00d400000.setPreferredSize(new Dimension(100, 20));
        this.\u00d400000.setMinimumSize(new Dimension(100, 20));
        this.\u00d400000.setEditable(false);
        this.super[1].gridy = 2;
        gridBagLayout.setConstraints(this.\u00d400000, this.super[1]);
        jPanel.add(this.\u00d400000);
        JLabel jLabel2 = new JLabel("Schild 2");
        this.super[0].gridy = 2;
        gridBagLayout.setConstraints(jLabel2, this.super[0]);
        jPanel.add(jLabel2);
        this.\u00d800000 = new JCheckBox("ist NKW");
        this.\u00d800000.setEnabled(false);
        this.super[2].gridy = 2;
        gridBagLayout.setConstraints(this.\u00d800000, this.super[2]);
        jPanel.add(this.\u00d800000);
        this.\u00d3O0000 = new JComboBox<String>(stringArray);
        this.super[6].gridy = 3;
        gridBagLayout.setConstraints(this.\u00d3O0000, this.super[6]);
        jPanel.add(this.\u00d3O0000);
        this.OO0000 = new JButton(imageIcon);
        this.OO0000.setName("ADD2");
        this.super[4].gridy = 2;
        this.super[4].anchor = 15;
        gridBagLayout.setConstraints(this.OO0000, this.super[4]);
        jPanel.add(this.OO0000);
        this.OO0000.addActionListener(float_);
        this.\u00f600000 = new JButton("I");
        this.\u00f600000.setName("I2");
        this.\u00f600000.setEnabled(false);
        this.super[3].gridy = 2;
        gridBagLayout.setConstraints(this.\u00f600000, this.super[3]);
        jPanel.add(this.\u00f600000);
        this.\u00f600000.addActionListener(float_);
        this.int = new JButton(imageIcon2);
        this.int.setName("REM2");
        this.super[4].gridy = 3;
        this.super[4].anchor = 11;
        gridBagLayout.setConstraints(this.int, this.super[4]);
        jPanel.add(this.int);
        this.int.addActionListener(float_);
        this.add((Component)jPanel, "Center");
        this.\u00d500000();
        this.o00000(oooo_12);
    }

    public void \u00d500000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d300000());
        jPanel.add(this.o00000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton o00000() {
        if (this.\u00d300000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00d300000 = new JButton("Abbrechen", imageIcon);
            this.\u00d300000.setName("Abbrechen");
            this.\u00d300000.addActionListener(this.interface);
        }
        return this.\u00d300000;
    }

    public JTable String() {
        return this.\u00d200000;
    }

    public JComboBox \u00d200000() {
        return this.\u00d4O0000;
    }

    public JComboBox \u00d800000() {
        return this.\u00d3O0000;
    }

    public JButton \u00d300000() {
        if (this.\u00d6O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d6O0000 = new JButton("OK", imageIcon);
            this.\u00d6O0000.setName("OK");
            this.\u00d6O0000.addActionListener(this.interface);
        }
        return this.\u00d6O0000;
    }

    public JTextField o00000(int n) {
        if (n == 0) {
            return this.class;
        }
        return this.\u00d400000;
    }

    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d200000.setRowHeight(18);
        this.\u00d600000 = new H(this.interface);
        TableColumnModel tableColumnModel = this.\u00d200000.getColumnModel();
        block5: for (int i2 = 0; i2 < this.\u00d200000.getColumnCount(); ++i2) {
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

    private void \u00d600000() {
        this.super = new GridBagConstraints[7];
        this.super[0] = new GridBagConstraints();
        this.super[0].gridx = 0;
        this.super[0].gridwidth = 1;
        this.super[0].gridheight = 2;
        this.super[0].fill = 0;
        this.super[0].weightx = 1.0;
        this.super[0].weighty = 1.0;
        this.super[0].anchor = 10;
        this.super[0].insets = new Insets(5, 5, 5, 5);
        this.super[1] = new GridBagConstraints();
        this.super[1].gridx = 1;
        this.super[1].gridwidth = 1;
        this.super[1].gridheight = 2;
        this.super[1].fill = 0;
        this.super[1].weightx = 1.0;
        this.super[1].weighty = 0.0;
        this.super[1].anchor = 10;
        this.super[1].insets = new Insets(5, 5, 5, 5);
        this.super[2] = new GridBagConstraints();
        this.super[2].gridx = 2;
        this.super[2].gridwidth = 1;
        this.super[2].gridheight = 1;
        this.super[2].fill = 0;
        this.super[2].weightx = 1.0;
        this.super[2].weighty = 0.0;
        this.super[2].anchor = 15;
        this.super[2].insets = new Insets(5, 5, 5, 5);
        this.super[3] = new GridBagConstraints();
        this.super[3].gridwidth = 1;
        this.super[3].gridheight = 2;
        this.super[3].fill = 0;
        this.super[3].weightx = 1.0;
        this.super[3].weighty = 1.0;
        this.super[3].anchor = 10;
        this.super[3].gridx = 3;
        this.super[4] = new GridBagConstraints();
        this.super[4].gridwidth = 1;
        this.super[4].gridheight = 1;
        this.super[4].fill = 0;
        this.super[4].weightx = 1.0;
        this.super[4].weighty = 1.0;
        this.super[4].anchor = 10;
        this.super[4].gridx = 4;
        this.super[5] = new GridBagConstraints();
        this.super[5].gridx = 5;
        this.super[5].gridwidth = 3;
        this.super[5].gridheight = 4;
        this.super[5].fill = 1;
        this.super[5].weightx = 1.0;
        this.super[5].weighty = 1.0;
        this.super[5].anchor = 11;
        this.super[5].insets = new Insets(5, 5, 5, 5);
        this.super[6] = new GridBagConstraints();
        this.super[6].gridx = 2;
        this.super[6].gridwidth = 1;
        this.super[6].gridheight = 1;
        this.super[6].fill = 0;
        this.super[6].weightx = 1.0;
        this.super[6].weighty = 1.0;
        this.super[6].anchor = 11;
        this.super[6].insets = new Insets(5, 5, 5, 5);
    }
}

