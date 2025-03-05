/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.gui.allgemein.new.H;
import helden.gui.allgemein.new.I;
import helden.gui.allgemein.new.K;
import helden.gui.allgemein.new.class;
import helden.gui.allgemein.new.if;
import helden.gui.allgemein.new.o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.new.oo0o_0;
import helden.gui.components.JScrollPaneFast;
import helden.gui.return;
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
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Object
extends JPanel {
    private JButton \u00f4O0000;
    private JButton \u00d5O0000 = null;
    private JButton \u00d400000;
    private JComboBox public = null;
    private JComboBox \u00f500000 = null;
    private JComboBox float = null;
    private JSpinner OO0000 = null;
    private JSpinner \u00d6O0000 = null;
    private JTree Object = null;
    private JScrollPaneFast supersuper = null;
    private K \u00f400000 = null;
    private JScrollPaneFast \u00f600000;
    private JButton \u00d200000;
    private JButton \u00f5O0000;
    private class oO0000;
    private DefaultTreeModel \u00d2O0000;
    private if \u00d4O0000;
    private return \u00d600000;
    private JButton o00000 = null;
    private JCheckBox \u00d500000 = null;
    private JComboBox void = null;

    public Object() {
        this.new();
    }

    public Object(class clazz, DefaultTreeModel defaultTreeModel, return return_) {
        this.oO0000 = clazz;
        this.\u00d2O0000 = this.o00000(defaultTreeModel);
        this.\u00d600000 = return_;
        this.\u00d4O0000 = new if(this, return_);
        this.\u00d4O0000.o00000();
        this.new();
    }

    public void \u00d3O0000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.OO0000());
        jPanel.add(this.\u00d8O0000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton \u00d8O0000() {
        if (this.\u00d200000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Delete.gif"));
            this.\u00d200000 = new JButton("Abbrechen", imageIcon);
            this.\u00d200000.setName("Abbrechen");
            this.\u00d200000.addActionListener(this.oO0000);
        }
        return this.\u00d200000;
    }

    public JButton \u00d800000() {
        if (this.\u00d5O0000 == null) {
            this.\u00d5O0000 = new JButton("Held hinzuf\u00fcgen", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/User.gif")));
            this.\u00d5O0000.setText("Held hinzuf\u00fcgen");
            this.\u00d5O0000.addActionListener(this.\u00d4O0000);
        }
        return this.\u00d5O0000;
    }

    public JComboBox \u00d400000() {
        if (this.void == null) {
            this.void = new JComboBox();
            this.void.addItem("Rasse/Kultur/Profession");
            this.void.addItem("Profession/Stufe");
            this.void.addItem("Kultur/Profession");
            this.void.addItem("Vorteile/Nachteile");
            this.void.addItem("Sonderfertigkeiten");
            this.void.addItem("Alle M\u00f6glichkeiten");
            this.void.setSelectedItem("Alle M\u00f6glichkeiten");
        }
        return this.void;
    }

    public JButton \u00d500000() {
        if (this.o00000 == null) {
            this.o00000 = new JButton("Automatisch Verteilen", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Automatisch.gif")));
            this.o00000.addActionListener(this.\u00d4O0000);
        }
        return this.o00000;
    }

    public JButton \u00f800000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JButton("Gruppe anlegen", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/UsersPlus.gif")));
            this.\u00d400000.addActionListener(this.\u00d4O0000);
        }
        return this.\u00d400000;
    }

    public K o00000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new K();
        }
        return this.\u00f400000;
    }

    public JTree thissuper() {
        if (this.Object == null) {
            this.Object = new JTree(this.\u00d2O0000);
            o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this.\u00d600000);
            o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.setOpenIcon(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/UsersMinus.gif")));
            o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.setClosedIcon(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/UsersPlus.gif")));
            o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.setLeafIcon(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/User.gif")));
            this.Object.getSelectionModel().setSelectionMode(1);
            this.Object.setCellEditor(new oo0o_0(this.Object, o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2));
            this.Object.setCellRenderer(o00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
            this.Object.setEditable(false);
            H h2 = new H(this.Object, this.\u00d600000);
            this.Object.addMouseListener(h2);
            this.Object.setSelectionRow(0);
        }
        return this.Object;
    }

    public JComboBox \u00f500000() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JComboBox();
            this.\u00f500000.addActionListener(this.\u00d4O0000);
        }
        return this.\u00f500000;
    }

    public JSpinner oO0000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JSpinner();
            this.\u00d6O0000.addChangeListener(this.\u00d4O0000);
        }
        return this.\u00d6O0000;
    }

    public JSpinner if() {
        if (this.OO0000 == null) {
            this.OO0000 = new JSpinner();
            this.OO0000.addChangeListener(this.\u00d4O0000);
        }
        return this.OO0000;
    }

    public JCheckBox while() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JCheckBox();
            this.\u00d500000.setText("verteilte Helden filtern");
            this.\u00d500000.addActionListener(this.\u00d4O0000);
        }
        return this.\u00d500000;
    }

    public JButton OO0000() {
        if (this.\u00f5O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Check.gif"));
            this.\u00f5O0000 = new JButton("OK", imageIcon);
            this.\u00f5O0000.setName("OK");
            this.\u00f5O0000.addActionListener(this.oO0000);
        }
        return this.\u00f5O0000;
    }

    public JComboBox \u00d300000() {
        if (this.float == null) {
            this.float = new JComboBox();
            this.float.addActionListener(this.\u00d4O0000);
        }
        return this.float;
    }

    public JComboBox return() {
        if (this.public == null) {
            this.public = new JComboBox();
            this.public.addActionListener(this.\u00d4O0000);
        }
        return this.public;
    }

    public JButton \u00d4O0000() {
        if (this.\u00f4O0000 == null) {
            this.\u00f4O0000 = new JButton("entfernen", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Delete.gif")));
            this.\u00f4O0000.addActionListener(this.\u00d4O0000);
        }
        return this.\u00f4O0000;
    }

    public void new(DefaultTreeModel defaultTreeModel) {
        I i2 = (I)this.\u00d2O0000.getRoot();
        defaultTreeModel.setRoot(i2);
    }

    private JScrollPaneFast \u00d5O0000() {
        if (this.supersuper == null) {
            this.supersuper = new JScrollPaneFast();
            this.supersuper.setViewportView(this.o00000());
        }
        return this.supersuper;
    }

    private JScrollPaneFast \u00f400000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JScrollPaneFast();
            this.\u00f600000.setViewportView(this.thissuper());
            this.\u00f600000.setMinimumSize(new Dimension(200, 400));
        }
        return this.\u00f600000;
    }

    private DefaultTreeModel o00000(DefaultTreeModel defaultTreeModel) {
        I i2 = (I)defaultTreeModel.getRoot();
        I i3 = new I(i2.toString(), true);
        for (int i4 = 0; i4 < i2.getChildCount(); ++i4) {
            if (i2.getChildAt(i4).isLeaf()) {
                i3.add(new I((I)i2.getChildAt(i4)));
                continue;
            }
            i3.add(this.o00000((I)i2.getChildAt(i4)));
        }
        return new DefaultTreeModel(i3);
    }

    private I o00000(I i2) {
        I i3 = new I(i2.toString(), true);
        for (int i4 = 0; i4 < i2.getChildCount(); ++i4) {
            if (i2.getChildAt(i4).isLeaf()) {
                i3.add(new I((I)i2.getChildAt(i4)));
                continue;
            }
            i3.add(this.o00000((I)i2.getChildAt(i4)));
        }
        return i3;
    }

    private void new() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 3;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 4;
        gridBagConstraints2.fill = 3;
        gridBagConstraints2.weightx = 0.2;
        gridBagConstraints2.anchor = 13;
        gridBagConstraints2.gridwidth = 2;
        gridBagConstraints2.gridy = 4;
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(1);
        borderLayout.setVgap(1);
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridwidth = 2;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.gridy = 5;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.gridy = 6;
        gridBagConstraints4.weightx = 0.5;
        gridBagConstraints4.weighty = 1.0;
        gridBagConstraints4.gridheight = 3;
        gridBagConstraints4.gridwidth = 5;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridx = 1;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 3;
        gridBagConstraints5.gridy = 1;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 1.0;
        gridBagConstraints5.gridheight = 9;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridx = 0;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 5;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.weightx = 0.2;
        gridBagConstraints6.gridy = 1;
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 5;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.fill = 2;
        gridBagConstraints7.weightx = 0.2;
        gridBagConstraints7.gridy = 3;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 4;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.fill = 0;
        gridBagConstraints8.anchor = 13;
        gridBagConstraints8.gridy = 3;
        JLabel jLabel = new JLabel();
        jLabel.setText("Max Stufe");
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 4;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.fill = 0;
        gridBagConstraints9.anchor = 13;
        gridBagConstraints9.gridy = 1;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Min Stufe");
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.fill = 1;
        gridBagConstraints10.gridy = 4;
        gridBagConstraints10.weightx = 0.5;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.gridx = 3;
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.fill = 1;
        gridBagConstraints11.gridy = 3;
        gridBagConstraints11.weightx = 0.5;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.gridx = 3;
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.fill = 1;
        gridBagConstraints12.gridy = 1;
        gridBagConstraints12.weightx = 0.5;
        gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints12.gridx = 3;
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 2;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints13.fill = 0;
        gridBagConstraints13.anchor = 13;
        gridBagConstraints13.gridy = 4;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Profession");
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.gridx = 2;
        gridBagConstraints14.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints14.fill = 0;
        gridBagConstraints14.anchor = 13;
        gridBagConstraints14.gridy = 3;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Kultur");
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.gridx = 2;
        gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints15.fill = 0;
        gridBagConstraints15.anchor = 13;
        gridBagConstraints15.gridy = 1;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Rasse");
        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.gridx = 1;
        gridBagConstraints16.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints16.fill = 2;
        gridBagConstraints16.anchor = 17;
        gridBagConstraints16.gridy = 1;
        GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
        gridBagConstraints17.gridx = 1;
        gridBagConstraints17.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints17.fill = 2;
        gridBagConstraints17.anchor = 17;
        gridBagConstraints17.gridy = 4;
        GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
        gridBagConstraints18.gridx = 1;
        gridBagConstraints18.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints18.fill = 2;
        gridBagConstraints18.anchor = 17;
        gridBagConstraints18.gridy = 3;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        jPanel.setSize(new Dimension(800, 600));
        jPanel.add((Component)this.\u00d4O0000(), gridBagConstraints18);
        jPanel.add((Component)this.\u00d800000(), gridBagConstraints17);
        jPanel.add((Component)this.\u00f800000(), gridBagConstraints16);
        jPanel.add((Component)jLabel5, gridBagConstraints15);
        jPanel.add((Component)jLabel4, gridBagConstraints14);
        jPanel.add((Component)jLabel3, gridBagConstraints13);
        jPanel.add((Component)this.return(), gridBagConstraints12);
        jPanel.add((Component)this.\u00f500000(), gridBagConstraints11);
        jPanel.add((Component)this.\u00d300000(), gridBagConstraints10);
        jPanel.add((Component)jLabel2, gridBagConstraints9);
        jPanel.add((Component)jLabel, gridBagConstraints8);
        jPanel.add((Component)this.oO0000(), gridBagConstraints7);
        jPanel.add((Component)this.if(), gridBagConstraints6);
        jPanel.add((Component)this.\u00d5O0000(), gridBagConstraints4);
        jPanel.add((Component)this.\u00d500000(), gridBagConstraints3);
        jPanel.add((Component)this.while(), gridBagConstraints2);
        jPanel.add((Component)this.\u00d400000(), gridBagConstraints);
        JSplitPane jSplitPane = new JSplitPane();
        jSplitPane.add((Component)this.\u00f400000(), "left");
        jSplitPane.setOrientation(1);
        jSplitPane.add((Component)jPanel, "right");
        jSplitPane.setOneTouchExpandable(true);
        jSplitPane.setDividerLocation(200);
        this.setLayout(borderLayout);
        this.add((Component)jSplitPane, "Center");
        this.setSize(800, 600);
        this.\u00d3O0000();
    }
}

