/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.C.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class M
extends JPanel {
    private JButton[] super;
    private JButton[] \u00d8O0000;
    private O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d6o0000;
    private GridBagConstraints[] \u00d4O0000;
    private String[] \u00d8o0000 = new String[]{"rechts", "links"};
    private JComboBox[] do;
    private JButton Objectsuper;
    private JButton O\u00d20000;
    private ImageIcon interface = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
    private ImageIcon \u00f4O0000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
    private JRadioButton \u00f6O0000 = null;
    private JRadioButton \u00d3O0000 = null;
    private JRadioButton \u00f8o0000 = null;
    private JRadioButton \u00f800000 = null;
    private JRadioButton \u00f600000 = null;
    private JRadioButton \u00f6o0000 = null;
    private JRadioButton int = null;
    private JRadioButton publicsuper = null;
    private JRadioButton \u00d600000 = null;
    private JRadioButton \u00f4o0000 = null;
    private JRadioButton floatsuper = null;
    private JRadioButton class = null;
    private JButton voidsuper = null;
    private JButton \u00f8O0000 = null;
    private JButton \u00d3o0000 = null;
    private JButton \u00d2o0000 = null;
    private JButton Oo0000 = null;
    private JTextField \u00f400000 = null;
    private JTextField \u00d4o0000 = null;
    private JTextField \u00d6O0000 = null;
    private JTextField \u00d2O0000 = null;
    private JTextField \u00d300000 = null;
    private JScrollPaneFast \u00d200000 = null;
    private JTable \u00d800000 = null;
    private helden.framework.held.object.oooo_1 OO0000;
    private JCheckBox[] \u00d400000;

    public M(helden.framework.held.object.oooo_1 oooo_12, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.super = new JButton[5];
        this.\u00d8O0000 = new JButton[5];
        this.\u00d400000 = new JCheckBox[2];
        this.do = new JComboBox[5];
        this.OO0000 = oooo_12;
        this.\u00d6o0000 = o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00f8O0000();
    }

    public void \u00d6O0000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d6o0000());
        jPanel.add(this.\u00d2O0000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton \u00d2O0000() {
        if (this.O\u00d20000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.O\u00d20000 = new JButton("Abbrechen", imageIcon);
            this.O\u00d20000.setName("Abbrechen");
            this.O\u00d20000.addActionListener(this.\u00d6o0000);
        }
        return this.O\u00d20000;
    }

    public JButton o00000(int n) {
        if (this.super[n] == null) {
            this.super[n] = new JButton(this.interface);
            this.super[n].setName("ADD" + n);
            this.super[n].addActionListener(this.\u00d6o0000);
        }
        return this.super[n];
    }

    public JCheckBox String(int n) {
        if (this.\u00d400000[n] == null) {
            this.\u00d400000[n] = new JCheckBox("Beidh\u00e4ndiger Kampf: ");
            this.\u00d400000[n].setHorizontalTextPosition(10);
            this.\u00d400000[n].setName("bk" + n);
            this.\u00d400000[n].addActionListener(this.\u00d6o0000);
            if (n == 0) {
                this.\u00d400000[n].setToolTipText("Waffe 1 und Waffe 2 werden zur Berechnung unter\nber\u00fccksichtigung von beidh\u00e4ndigen Kampf benutzt.");
            } else {
                this.\u00d400000[n].setToolTipText("Waffe 3 und Waffe 4 werden zur Berechnung unter\nber\u00fccksichtigung von beidh\u00e4ndigen Kampf benutzt.");
            }
        }
        return this.\u00d400000[n];
    }

    public JComboBox \u00d200000(int n) {
        if (this.do[n] == null) {
            this.do[n] = new JComboBox<String>(this.\u00d8o0000);
            this.do[n].setName("hand" + n);
            this.do[n].addActionListener(this.\u00d6o0000);
        }
        return this.do[n];
    }

    public JTable \u00f600000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JTable(new int(this.OO0000, "Nahkampfwaffe", 0));
            this.\u00d800000.setRowHeight(oooo_1.o00000(20));
            this.\u00d500000();
        }
        return this.\u00d800000;
    }

    public JRadioButton \u00d5o0000() {
        if (this.\u00f6O0000 == null) {
            this.\u00f6O0000 = new JRadioButton();
            this.\u00f6O0000.addActionListener(this.\u00d6o0000);
            this.\u00f6O0000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00f6O0000;
    }

    public JRadioButton null() {
        if (this.\u00d3O0000 == null) {
            this.\u00d3O0000 = new JRadioButton();
            this.\u00d3O0000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00d3O0000;
    }

    public JRadioButton \u00d5O0000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JRadioButton();
            this.\u00f800000.addActionListener(this.\u00d6o0000);
            this.\u00f800000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00f800000;
    }

    public JRadioButton \u00d600000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JRadioButton();
            this.\u00f600000.addActionListener(this.\u00d6o0000);
            this.\u00f600000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00f600000;
    }

    public JRadioButton \u00d3o0000() {
        if (this.int == null) {
            this.int = new JRadioButton();
            this.int.addActionListener(this.\u00d6o0000);
            this.int.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.int;
    }

    public JRadioButton newsuper() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JRadioButton();
            this.\u00d600000.addActionListener(this.\u00d6o0000);
            this.\u00d600000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00d600000;
    }

    public JRadioButton \u00d800000() {
        if (this.class == null) {
            this.class = new JRadioButton();
            this.class.addActionListener(this.\u00d6o0000);
            this.class.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.class;
    }

    public JRadioButton \u00f800000() {
        if (this.\u00f8o0000 == null) {
            this.\u00f8o0000 = new JRadioButton();
            this.\u00f8o0000.addActionListener(this.\u00d6o0000);
            this.\u00f8o0000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00f8o0000;
    }

    public JRadioButton \u00d200000() {
        if (this.\u00f6o0000 == null) {
            this.\u00f6o0000 = new JRadioButton();
            this.\u00f6o0000.addActionListener(this.\u00d6o0000);
            this.\u00f6o0000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00f6o0000;
    }

    public JRadioButton oo0000() {
        if (this.publicsuper == null) {
            this.publicsuper = new JRadioButton();
            this.publicsuper.addActionListener(this.\u00d6o0000);
            this.publicsuper.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.publicsuper;
    }

    public JRadioButton oO0000() {
        if (this.\u00f4o0000 == null) {
            this.\u00f4o0000 = new JRadioButton();
            this.\u00f4o0000.addActionListener(this.\u00d6o0000);
            this.\u00f4o0000.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.\u00f4o0000;
    }

    public JRadioButton String() {
        if (this.floatsuper == null) {
            this.floatsuper = new JRadioButton();
            this.floatsuper.addActionListener(this.\u00d6o0000);
            this.floatsuper.setToolTipText("Legt fest mit welcher Waffe das jeweilige Schild bzw.\ndie jeweilige Parierwaffe genutzt werden soll.");
        }
        return this.floatsuper;
    }

    public JTextField ifsuper() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JTextField();
        }
        return this.\u00f400000;
    }

    public JTextField \u00f500000() {
        if (this.\u00d4o0000 == null) {
            this.\u00d4o0000 = new JTextField();
        }
        return this.\u00d4o0000;
    }

    public JTextField \u00f6O0000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JTextField();
        }
        return this.\u00d6O0000;
    }

    public JTextField \u00d300000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JTextField();
        }
        return this.\u00d2O0000;
    }

    public JTextField \u00d8O0000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JTextField();
        }
        return this.\u00d300000;
    }

    public JButton \u00d6o0000() {
        if (this.Objectsuper == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.Objectsuper = new JButton("OK", imageIcon);
            this.Objectsuper.setName("OK");
            this.Objectsuper.addActionListener(this.\u00d6o0000);
        }
        return this.Objectsuper;
    }

    public JButton \u00d300000(int n) {
        if (this.\u00d8O0000[n] == null) {
            this.\u00d8O0000[n] = new JButton(this.\u00f4O0000);
            this.\u00d8O0000[n].setName("REM" + n);
            this.\u00d8O0000[n].addActionListener(this.\u00d6o0000);
        }
        return this.\u00d8O0000[n];
    }

    public void \u00d500000(int n) {
        if (this.\u00d200000(n - 1).getSelectedIndex() == 0) {
            this.\u00d200000(n).setSelectedIndex(1);
        } else {
            this.\u00d200000(n).setSelectedIndex(0);
        }
    }

    public void \u00d500000() {
        this.\u00d800000.setRowHeight(18);
        TableColumnModel tableColumnModel = this.\u00d800000.getColumnModel();
        block5: for (int i2 = 0; i2 < this.\u00d800000.getColumnCount(); ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(20);
                    tableColumn.setMinWidth(20);
                    tableColumn.setMaxWidth(20);
                    continue block5;
                }
                case 1: {
                    tableColumn.setPreferredWidth(60);
                    tableColumn.setMinWidth(60);
                    continue block5;
                }
                case 2: {
                    tableColumn.setPreferredWidth(0);
                    tableColumn.setMinWidth(0);
                    tableColumn.setMaxWidth(0);
                    continue block5;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 3 Spalten.");
                }
            }
        }
    }

    private JButton o00000() {
        if (this.voidsuper == null) {
            this.voidsuper = new JButton();
            this.voidsuper.setName("I0");
            this.voidsuper.setText("I");
            this.voidsuper.addActionListener(this.\u00d6o0000);
        }
        return this.voidsuper;
    }

    private JButton \u00d2o0000() {
        if (this.\u00f8O0000 == null) {
            this.\u00f8O0000 = new JButton();
            this.\u00f8O0000.setText("I");
            this.\u00f8O0000.setName("I1");
            this.\u00f8O0000.addActionListener(this.\u00d6o0000);
        }
        return this.\u00f8O0000;
    }

    private JButton returnsuper() {
        if (this.\u00d3o0000 == null) {
            this.\u00d3o0000 = new JButton();
            this.\u00d3o0000.setText("I");
            this.\u00d3o0000.setName("I2");
            this.\u00d3o0000.addActionListener(this.\u00d6o0000);
        }
        return this.\u00d3o0000;
    }

    private JButton \u00f5O0000() {
        if (this.\u00d2o0000 == null) {
            this.\u00d2o0000 = new JButton();
            this.\u00d2o0000.setText("I");
            this.\u00d2o0000.setName("I3");
            this.\u00d2o0000.addActionListener(this.\u00d6o0000);
        }
        return this.\u00d2o0000;
    }

    private JButton \u00d3O0000() {
        if (this.Oo0000 == null) {
            this.Oo0000 = new JButton();
            this.Oo0000.setText("I");
            this.Oo0000.setName("I4");
            this.Oo0000.addActionListener(this.\u00d6o0000);
        }
        return this.Oo0000;
    }

    private JScrollPane private() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JScrollPaneFast();
            this.\u00d200000.setViewportView(this.\u00f600000());
            this.\u00d200000.setPreferredSize(new Dimension(200, 40));
            this.\u00d200000.setSize(new Dimension(200, 40));
        }
        return this.\u00d200000;
    }

    private GridBagConstraints o00000(int n, int n2, int n3, int n4, double d2) {
        this.\u00d4O0000[n].gridy = n2;
        this.\u00d4O0000[n].gridheight = n3;
        this.\u00d4O0000[n].weighty = d2;
        this.\u00d4O0000[n].gridwidth = n4;
        return this.\u00d4O0000[n];
    }

    private void for() {
        this.\u00d4O0000 = new GridBagConstraints[8];
        this.\u00d4O0000[0] = new GridBagConstraints();
        this.\u00d4O0000[0].gridx = 0;
        this.\u00d4O0000[0].insets = new Insets(5, 5, 5, 5);
        this.\u00d4O0000[0].anchor = 13;
        this.\u00d4O0000[0].weightx = 0.0;
        this.\u00d4O0000[1] = new GridBagConstraints();
        this.\u00d4O0000[1].fill = 2;
        this.\u00d4O0000[1].weightx = 5.0;
        this.\u00d4O0000[1].insets = new Insets(5, 5, 5, 5);
        this.\u00d4O0000[1].gridx = 1;
        this.\u00d4O0000[2] = new GridBagConstraints();
        this.\u00d4O0000[2].fill = 2;
        this.\u00d4O0000[2].weightx = 1.0;
        this.\u00d4O0000[2].insets = new Insets(5, 5, 5, 5);
        this.\u00d4O0000[2].gridx = 2;
        this.\u00d4O0000[3] = new GridBagConstraints();
        this.\u00d4O0000[3].gridx = 3;
        this.\u00d4O0000[3].fill = 0;
        this.\u00d4O0000[3].insets = new Insets(5, 5, 5, 5);
        this.\u00d4O0000[3].weightx = 0.0;
        this.\u00d4O0000[4] = new GridBagConstraints();
        this.\u00d4O0000[4].gridx = 4;
        this.\u00d4O0000[4].insets = new Insets(5, 5, 5, 5);
        this.\u00d4O0000[4].weightx = 0.0;
        this.\u00d4O0000[5] = new GridBagConstraints();
        this.\u00d4O0000[5].gridx = 5;
        this.\u00d4O0000[5].insets = new Insets(5, 5, 5, 5);
        this.\u00d4O0000[5].weightx = 0.0;
        this.\u00d4O0000[6] = new GridBagConstraints();
        this.\u00d4O0000[6].gridx = 7;
        this.\u00d4O0000[6].insets = new Insets(1, 5, 1, 5);
        this.\u00d4O0000[6].fill = 0;
        this.\u00d4O0000[7] = new GridBagConstraints();
        this.\u00d4O0000[7].fill = 1;
        this.\u00d4O0000[7].weightx = 0.1;
        this.\u00d4O0000[7].gridx = 8;
        this.\u00d4O0000[7].insets = new Insets(5, 5, 5, 5);
    }

    private void \u00f8O0000() {
        this.for();
        JLabel jLabel = new JLabel();
        jLabel.setText("Waffe5");
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Waffe4");
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Waffe3");
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Waffe2");
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Waffe1");
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("keine");
        JLabel jLabel7 = new JLabel();
        jLabel7.setText("S/P2");
        jLabel7.setToolTipText("Legt fest mit welcher Waffe das zweite Schild bzw.\ndie zweite Parierwaffe genutzt werden soll.");
        JLabel jLabel8 = new JLabel();
        jLabel8.setText("S/P1");
        jLabel8.setToolTipText("Legt fest mit welcher Waffe das erste Schild bzw.\ndie erste Parierwaffe genutzt werden soll.");
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(500, 400));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.\u00d5o0000());
        buttonGroup.add(this.\u00d5O0000());
        buttonGroup.add(this.\u00d600000());
        buttonGroup.add(this.\u00d3o0000());
        buttonGroup.add(this.newsuper());
        buttonGroup.add(this.\u00d800000());
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(this.null());
        buttonGroup2.add(this.\u00f800000());
        buttonGroup2.add(this.\u00d200000());
        buttonGroup2.add(this.oo0000());
        buttonGroup2.add(this.oO0000());
        buttonGroup2.add(this.String());
        jPanel.add((Component)jLabel8, this.o00000(4, 0, 1, 1, 0.5));
        jPanel.add((Component)jLabel7, this.o00000(5, 0, 1, 1, 0.5));
        jPanel.add((Component)this.private(), this.o00000(7, 0, 24, 1, 24.0));
        jPanel.add((Component)this.\u00d5o0000(), this.o00000(4, 1, 1, 1, 0.5));
        jPanel.add((Component)this.null(), this.o00000(5, 1, 1, 1, 0.5));
        jPanel.add((Component)jLabel6, this.o00000(6, 1, 1, 1, 0.5));
        jPanel.add((Component)this.o00000(0), this.o00000(6, 3, 1, 1, 0.5));
        jPanel.add((Component)jLabel5, this.o00000(0, 3, 2, 1, 1.0));
        jPanel.add((Component)this.ifsuper(), this.o00000(1, 3, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d200000(0), this.o00000(2, 3, 2, 1, 1.0));
        jPanel.add((Component)this.o00000(), this.o00000(3, 3, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d5O0000(), this.o00000(4, 3, 2, 1, 1.0));
        jPanel.add((Component)this.\u00f800000(), this.o00000(5, 3, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d300000(0), this.o00000(6, 4, 1, 1, 0.5));
        jPanel.add((Component)this.String(0), this.o00000(0, 5, 1, 3, 0.5));
        jPanel.add((Component)new JLabel(" "), this.o00000(3, 5, 1, 4, 0.5));
        jPanel.add((Component)this.o00000(1), this.o00000(6, 7, 1, 1, 0.5));
        jPanel.add((Component)jLabel4, this.o00000(0, 7, 2, 1, 1.0));
        jPanel.add((Component)this.\u00f500000(), this.o00000(1, 7, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d200000(1), this.o00000(2, 7, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d2o0000(), this.o00000(3, 7, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d600000(), this.o00000(4, 7, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d200000(), this.o00000(5, 7, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d300000(1), this.o00000(6, 8, 1, 1, 0.5));
        jPanel.add((Component)new JLabel(" "), this.o00000(0, 9, 1, 7, 0.5));
        jPanel.add((Component)this.o00000(2), this.o00000(6, 11, 1, 1, 0.5));
        jPanel.add((Component)jLabel3, this.o00000(0, 11, 2, 1, 1.0));
        jPanel.add((Component)this.\u00f6O0000(), this.o00000(1, 11, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d200000(2), this.o00000(2, 11, 2, 1, 1.0));
        jPanel.add((Component)this.returnsuper(), this.o00000(3, 11, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d3o0000(), this.o00000(4, 11, 2, 1, 1.0));
        jPanel.add((Component)this.oo0000(), this.o00000(5, 11, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d300000(2), this.o00000(6, 12, 1, 1, 0.5));
        jPanel.add((Component)this.String(1), this.o00000(0, 13, 1, 3, 0.5));
        jPanel.add((Component)new JLabel(" "), this.o00000(3, 13, 1, 4, 0.5));
        jPanel.add((Component)this.o00000(3), this.o00000(6, 15, 1, 1, 0.5));
        jPanel.add((Component)jLabel2, this.o00000(0, 15, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d300000(), this.o00000(1, 15, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d200000(3), this.o00000(2, 15, 2, 1, 1.0));
        jPanel.add((Component)this.\u00f5O0000(), this.o00000(3, 15, 2, 1, 1.0));
        jPanel.add((Component)this.newsuper(), this.o00000(4, 15, 2, 1, 1.0));
        jPanel.add((Component)this.oO0000(), this.o00000(5, 15, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d300000(3), this.o00000(6, 16, 1, 1, 0.5));
        jPanel.add((Component)new JLabel(" "), this.o00000(0, 17, 1, 7, 0.5));
        jPanel.add((Component)this.o00000(4), this.o00000(6, 19, 1, 1, 0.5));
        jPanel.add((Component)jLabel, this.o00000(0, 19, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d8O0000(), this.o00000(1, 19, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d200000(4), this.o00000(2, 19, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d3O0000(), this.o00000(3, 19, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d800000(), this.o00000(4, 19, 2, 1, 1.0));
        jPanel.add((Component)this.String(), this.o00000(5, 19, 2, 1, 1.0));
        jPanel.add((Component)this.\u00d300000(4), this.o00000(6, 20, 1, 1, 0.5));
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        this.add((Component)jScrollPaneFast, "Center");
        this.\u00d6O0000();
    }
}

