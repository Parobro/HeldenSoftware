/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.super;

import helden.gui.components.JListWithTooltip;
import helden.gui.components.JTextFieldWithMenu;
import helden.gui.ooOO.p;
import helden.gui.oooo_1;
import helden.gui.super.OooO.super.B;
import helden.gui.super.OooO.super.D;
import helden.gui.super.OooO.super.G;
import helden.gui.super.OooO.super.super;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends JPanel {
    private static final long \u00d500000 = 4909580608517719897L;
    private JListWithTooltip \u00d800000;
    private JListWithTooltip private;
    private JListWithTooltip \u00d600000;
    private JButton \u00d300000;
    private JButton returnsuper;
    private JPanel null;
    private JPanel \u00d2O0000;
    private JScrollPane String;
    private JComboBox oo0000;
    private JComboBox \u00f5O0000;
    private JTable \u00d6O0000;
    private B oO0000;
    private JScrollPane newsuper;
    private JScrollPane \u00f8O0000;
    private JScrollPane \u00f500000;
    private JButton \u00d3O0000;
    private JButton \u00f800000;
    private JTextField \u00f600000;
    private JButton o00000;
    private JButton \u00f6O0000;
    private JButton \u00d8O0000;
    private JPanel for;
    private JButton \u00d5O0000;
    private JScrollPane \u00d200000;

    public C(B b) {
        this.oO0000 = b;
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{337, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 100, 200, 65, 0};
        gridBagLayout.columnWeights = new double[]{1.0, 3.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
        this.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add((Component)this.oO0000(), gridBagConstraints);
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridheight = 2;
        gridBagConstraints2.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 0;
        this.add((Component)this.newsuper(), gridBagConstraints2);
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridheight = 3;
        gridBagConstraints3.insets = new Insets(5, 5, 0, 5);
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 1;
        this.add((Component)this.\u00d6O0000(), gridBagConstraints3);
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints4.gridx = 1;
        gridBagConstraints4.gridy = 2;
        this.add((Component)this.\u00f8O0000(), gridBagConstraints4);
        JPanel jPanel = new JPanel();
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.insets = new Insets(5, 5, 0, 0);
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.gridy = 3;
        this.add((Component)jPanel, gridBagConstraints5);
        GridBagLayout gridBagLayout2 = new GridBagLayout();
        gridBagLayout2.columnWidths = new int[]{173, 104, 68, 0};
        gridBagLayout2.rowHeights = new int[]{0, 23, 0};
        gridBagLayout2.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
        gridBagLayout2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        jPanel.setLayout(gridBagLayout2);
        this.\u00f6O0000 = new JButton("Infos als Vorlage speichern");
        this.\u00f6O0000.addActionListener(this.oO0000);
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 0;
        gridBagConstraints6.fill = 1;
        jPanel.add((Component)this.\u00f6O0000, gridBagConstraints6);
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints7.gridx = 1;
        gridBagConstraints7.gridy = 0;
        gridBagConstraints7.fill = 1;
        jPanel.add((Component)this.private(), gridBagConstraints7);
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints8.gridx = 2;
        gridBagConstraints8.gridy = 0;
        gridBagConstraints8.fill = 1;
        jPanel.add((Component)this.for(), gridBagConstraints8);
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints9.gridx = 0;
        gridBagConstraints9.gridy = 1;
        gridBagConstraints9.fill = 1;
        jPanel.add((Component)this.\u00d200000(), gridBagConstraints9);
        this.\u00d3O0000 = new JButton("In Held speichern");
        this.\u00d3O0000.addActionListener(this.oO0000);
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints10.gridx = 1;
        gridBagConstraints10.gridy = 1;
        gridBagConstraints10.fill = 1;
        jPanel.add((Component)this.\u00d3O0000, gridBagConstraints10);
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 2;
        gridBagConstraints11.gridy = 1;
        gridBagConstraints11.fill = 1;
        jPanel.add((Component)this.\u00d500000(), gridBagConstraints11);
    }

    public JList \u00d300000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JListWithTooltip(new DefaultListModel());
            this.\u00d600000.setCellRenderer(new super());
            this.\u00d600000.setDragEnabled(true);
            this.\u00d600000.getSelectionModel().setSelectionMode(0);
            this.\u00d600000.setTransferHandler(new D(this.\u00d600000, "Alle", "Alle"));
            this.\u00d600000.setDropMode(DropMode.INSERT);
        }
        return this.\u00d600000;
    }

    public JButton String() {
        return this.\u00f6O0000;
    }

    public JListWithTooltip \u00f5O0000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JListWithTooltip();
            this.\u00d800000.setCellRenderer(new super());
            this.\u00d800000.setSelectedIndex(0);
            this.\u00d800000.addListSelectionListener(new ListSelectionListener(){

                @Override
                public void valueChanged(ListSelectionEvent listSelectionEvent) {
                    if (listSelectionEvent.getValueIsAdjusting()) {
                        return;
                    }
                    ((G)C.this.\u00d8O0000().getModel()).new();
                }
            });
        }
        return this.\u00d800000;
    }

    public JButton \u00f6O0000() {
        return this.returnsuper;
    }

    public JButton \u00d800000() {
        return this.\u00d300000;
    }

    public JTextField null() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JTextFieldWithMenu();
            this.\u00f600000.setColumns(10);
            this.\u00f600000.addKeyListener(new KeyListener(){

                @Override
                public void keyPressed(KeyEvent keyEvent) {
                }

                @Override
                public void keyReleased(KeyEvent keyEvent) {
                    ((G)C.this.\u00d8O0000().getModel()).new();
                }

                @Override
                public void keyTyped(KeyEvent keyEvent) {
                }
            });
        }
        return this.\u00f600000;
    }

    public JButton \u00d200000() {
        if (this.\u00d8O0000 == null) {
            this.\u00d8O0000 = new JButton("In allen Helden speichern");
            this.\u00d8O0000.addActionListener(this.oO0000);
        }
        return this.\u00d8O0000;
    }

    public JComboBox o00000() {
        if (this.\u00f5O0000 == null) {
            this.\u00f5O0000 = new JComboBox();
            this.\u00f5O0000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    ((G)C.this.\u00d8O0000().getModel()).new();
                }
            });
        }
        return this.\u00f5O0000;
    }

    public JButton \u00d5O0000() {
        return this.\u00d3O0000;
    }

    public JComboBox \u00f500000() {
        if (this.oo0000 == null) {
            this.oo0000 = new JComboBox();
            this.oo0000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    ((G)C.this.\u00d8O0000().getModel()).new();
                    C.this.oO0000.\u00f800000();
                }
            });
        }
        return this.oo0000;
    }

    public JTable \u00d8O0000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JTable(new G(this.oO0000));
            this.\u00d6O0000.getSelectionModel().addListSelectionListener(this.oO0000);
            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>(this.\u00d6O0000.getModel());
            this.\u00d6O0000.setRowSorter(tableRowSorter);
            this.\u00d6O0000.getSelectionModel().setSelectionMode(0);
            this.\u00d6O0000.setRowHeight(oooo_1.o00000(20));
            TableColumnModel tableColumnModel = this.\u00d6O0000.getColumnModel();
            for (int i2 = 0; i2 < this.\u00d6O0000.getColumnCount(); ++i2) {
                TableColumn tableColumn = tableColumnModel.getColumn(i2);
                switch (i2) {
                    case 0: {
                        tableColumn.setPreferredWidth(150);
                        break;
                    }
                    case 1: {
                        tableColumn.setPreferredWidth(140);
                        break;
                    }
                    case 2: {
                        tableColumn.setPreferredWidth(60);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Es gibt nur 3 Spalten.");
                    }
                }
                if (this.\u00d6O0000.getRowCount() <= 0) continue;
                this.\u00d6O0000.getSelectionModel().setSelectionInterval(0, 0);
            }
        }
        return this.\u00d6O0000;
    }

    public JButton \u00d500000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JButton("schlie\u00dfen");
            this.\u00f800000.addActionListener(this.oO0000);
        }
        return this.\u00f800000;
    }

    public JButton private() {
        if (this.o00000 == null) {
            this.o00000 = new JButton("Vorlagen bearbeiten");
            this.o00000.addActionListener(this.oO0000);
        }
        return this.o00000;
    }

    public JList \u00d3O0000() {
        if (this.private == null) {
            this.private = new JListWithTooltip(new DefaultListModel());
            this.private.setCellRenderer(new super());
            this.private.setDragEnabled(true);
            this.private.getSelectionModel().setSelectionMode(0);
            int n = this.\u00d8O0000().getSelectedRow();
            if (n >= 0) {
                helden.gui.super.OooO.O0OO.B b = (helden.gui.super.OooO.O0OO.B)this.\u00d8O0000().getModel().getValueAt(n, 1);
                String string = b.toString();
                String string2 = b.null();
                D d2 = new D(this.private, string, string2);
                this.private.setTransferHandler(d2);
                this.private.setDropMode(DropMode.INSERT);
            } else {
                this.private.setEnabled(false);
            }
        }
        return this.private;
    }

    public JScrollPane newsuper() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JScrollPane();
            this.\u00f500000.setVerticalScrollBarPolicy(22);
            this.\u00f500000.setViewportView(this.\u00d8O0000());
        }
        return this.\u00f500000;
    }

    private JScrollPane \u00d2O0000() {
        if (this.newsuper == null) {
            this.newsuper = new JScrollPane();
            this.newsuper.setVerticalScrollBarPolicy(22);
            this.newsuper.setHorizontalScrollBarPolicy(31);
            this.newsuper.setViewportView(this.\u00d300000());
        }
        return this.newsuper;
    }

    private JButton for() {
        if (this.\u00d5O0000 == null) {
            this.\u00d5O0000 = new JButton(p.o00000(this));
        }
        return this.\u00d5O0000;
    }

    private JPanel oO0000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JPanel();
            this.\u00d2O0000.setBorder(new TitledBorder(new EtchedBorder(1, null, null), "Filter", 4, 2, null, null));
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0, 0};
            gridBagLayout.rowHeights = new int[]{0, 122, 0, 0, 0};
            gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
            this.\u00d2O0000.setLayout(gridBagLayout);
            JLabel jLabel = new JLabel("Helden");
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.anchor = 12;
            gridBagConstraints.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.\u00d2O0000.add((Component)jLabel, gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.insets = new Insets(0, 0, 0, 0);
            gridBagConstraints2.fill = 2;
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            this.\u00d2O0000.add((Component)this.null(), gridBagConstraints2);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.fill = 1;
            gridBagConstraints3.gridwidth = 2;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 0);
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy = 1;
            this.\u00d2O0000.add((Component)this.\u00f800000(), gridBagConstraints3);
            JLabel jLabel2 = new JLabel("Typ");
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints4.gridx = 0;
            gridBagConstraints4.gridy = 2;
            this.\u00d2O0000.add((Component)jLabel2, gridBagConstraints4);
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.insets = new Insets(5, 5, 5, 0);
            gridBagConstraints5.fill = 2;
            gridBagConstraints5.gridx = 1;
            gridBagConstraints5.gridy = 2;
            this.\u00d2O0000.add((Component)this.\u00f500000(), gridBagConstraints5);
            JLabel jLabel3 = new JLabel("Name");
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.insets = new Insets(5, 5, 0, 5);
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.gridy = 3;
            this.\u00d2O0000.add((Component)jLabel3, gridBagConstraints6);
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.fill = 2;
            gridBagConstraints7.insets = new Insets(5, 5, 0, 0);
            gridBagConstraints7.gridx = 1;
            gridBagConstraints7.gridy = 3;
            this.\u00d2O0000.add((Component)this.o00000(), gridBagConstraints7);
        }
        return this.\u00d2O0000;
    }

    private JScrollPane \u00f800000() {
        if (this.String == null) {
            this.String = new JScrollPane();
            this.String.setVerticalScrollBarPolicy(22);
            this.String.setHorizontalScrollBarPolicy(31);
            this.String.setViewportView(this.\u00f5O0000());
        }
        return this.String;
    }

    private JPanel \u00f600000() {
        if (this.for == null) {
            this.for = this.oO0000.\u00d300000().\u00f500000();
        }
        return this.for;
    }

    private JScrollPane \u00f8O0000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JScrollPane();
            this.\u00d200000.setVerticalScrollBarPolicy(22);
            this.\u00d200000.setHorizontalScrollBarPolicy(31);
            this.\u00d200000.setViewportView(this.\u00f600000());
        }
        return this.\u00d200000;
    }

    private JScrollPane \u00d600000() {
        if (this.\u00f8O0000 == null) {
            this.\u00f8O0000 = new JScrollPane();
            this.\u00f8O0000.setHorizontalScrollBarPolicy(31);
            this.\u00f8O0000.setVerticalScrollBarPolicy(22);
            this.\u00f8O0000.setViewportView(this.\u00d3O0000());
        }
        return this.\u00f8O0000;
    }

    private JPanel \u00d6O0000() {
        if (this.null == null) {
            this.null = new JPanel();
            this.null.setBorder(new TitledBorder(new EtchedBorder(1, null, null), "Zwischenablage", 4, 2, null, null));
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
            gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 2.0, 0.0, 2.0, Double.MIN_VALUE};
            this.null.setLayout(gridBagLayout);
            JLabel jLabel = new JLabel("Allgemein:");
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.anchor = 17;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.null.add((Component)jLabel, gridBagConstraints);
            this.returnsuper = new JButton("entfernen");
            this.returnsuper.addActionListener(this.oO0000);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.anchor = 13;
            gridBagConstraints2.gridwidth = 3;
            gridBagConstraints2.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            this.null.add((Component)this.returnsuper, gridBagConstraints2);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.fill = 1;
            gridBagConstraints3.gridwidth = 4;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 0);
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy = 1;
            this.null.add((Component)this.\u00d2O0000(), gridBagConstraints3);
            JLabel jLabel2 = new JLabel("Zauberspezifisch:");
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints4.gridx = 0;
            gridBagConstraints4.gridy = 2;
            this.null.add((Component)jLabel2, gridBagConstraints4);
            this.\u00d300000 = new JButton("entfernen");
            this.\u00d300000.addActionListener(this.oO0000);
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridwidth = 2;
            gridBagConstraints5.anchor = 13;
            gridBagConstraints5.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints5.gridx = 2;
            gridBagConstraints5.gridy = 2;
            this.null.add((Component)this.\u00d300000, gridBagConstraints5);
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.fill = 1;
            gridBagConstraints6.gridwidth = 4;
            gridBagConstraints6.insets = new Insets(5, 5, 0, 0);
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.gridy = 3;
            this.null.add((Component)this.\u00d600000(), gridBagConstraints6);
        }
        return this.null;
    }
}

