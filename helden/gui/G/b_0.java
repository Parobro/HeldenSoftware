/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.b
 */
public class b_0
extends JPanel {
    private JSpinner \u00d3O0000;
    private JSpinner class;
    private JSpinner \u00d2O0000;
    private JTextField \u00d300000;
    private GridBagLayout interface;
    private JSpinner \u00d200000;
    private JSpinner \u00f400000;
    private JTextField super;
    private JSpinner \u00d800000;
    private JSpinner int;
    private JComboBox \u00f600000;
    private JComboBox OO0000;
    private JCheckBox \u00d600000;
    private ChangeListener \u00f800000;
    private JRadioButton \u00d4O0000;
    private JRadioButton \u00d6O0000;
    private ActionListener do;
    private JSpinner \u00d400000;

    public b_0(ChangeListener changeListener, ActionListener actionListener) {
        this.\u00f800000 = changeListener;
        this.do = actionListener;
        this.setName("Person-Panel");
        this.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        this.interface = new GridBagLayout();
        jPanel.setLayout(this.interface);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        jPanel.add(this.\u00d5O0000());
        jPanel.add(this.\u00f600000());
        jPanel.add(this.\u00d3O0000());
        jPanel.add(this.o00000());
        jPanel.add(this.returnsuper());
        jPanel.add(this.\u00f8O0000());
        jPanel.add(this.oO0000());
        jPanel.add(this.\u00f800000());
        jPanel.add(this.\u00d6O0000());
        jPanel.add(this.\u00d8O0000());
        jPanel.add(this.\u00f5O0000());
        jPanel.add(this.\u00d300000());
        jPanel.add(this.for());
        jPanel.add(this.\u00d500000());
        jPanel.add(this.ifsuper());
        jPanel.add(this.private());
        jPanel.add(this.String());
        jPanel.add(this.\u00f500000());
        jPanel.add(this.\u00d600000());
        jPanel.add(this.newsuper());
        jPanel.add(this.\u00d3o0000());
        jPanel.add(this.\u00d2o0000());
        jPanel.add(this.\u00d2O0000());
        jPanel.add(this.oo0000());
        jPanel.add(this.\u00d200000());
        jPanel.add(this.\u00f6O0000());
        this.add((Component)jPanel, "Center");
    }

    public JSpinner \u00f6O0000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JSpinner();
            this.\u00d400000.setName("Alter");
            this.\u00d400000.addChangeListener(this.\u00f800000);
            this.\u00d400000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 13;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d400000, gridBagConstraints);
        }
        return this.\u00d400000;
    }

    public JSpinner \u00d300000() {
        if (this.int == null) {
            this.int = new JSpinner();
            this.int.setName("AP");
            this.int.addChangeListener(this.\u00f800000);
            this.int.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 6;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.int, gridBagConstraints);
        }
        return this.int;
    }

    public JSpinner \u00d8O0000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JSpinner();
            this.\u00d800000.setName("AP");
            this.\u00d800000.addChangeListener(this.\u00f800000);
            this.\u00d800000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d800000, gridBagConstraints);
        }
        return this.\u00d800000;
    }

    public JComboBox private() {
        if (this.OO0000 == null) {
            this.OO0000 = new JComboBox();
            this.OO0000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 8;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.OO0000, gridBagConstraints);
        }
        return this.OO0000;
    }

    public JSpinner oo0000() {
        if (this.\u00d3O0000 == null) {
            this.\u00d3O0000 = new JSpinner();
            this.\u00d3O0000.setName("Geburtsjahr");
            this.\u00d3O0000.addChangeListener(this.\u00f800000);
            this.\u00d3O0000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 12;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d3O0000, gridBagConstraints);
        }
        return this.\u00d3O0000;
    }

    public JSpinner newsuper() {
        if (this.class == null) {
            this.class = new JSpinner();
            this.class.setName("Geburtsmonat");
            this.class.addChangeListener(this.\u00f800000);
            this.class.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 10;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.class, gridBagConstraints);
        }
        return this.class;
    }

    public JSpinner \u00f500000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JSpinner();
            this.\u00d2O0000.setName("Geburtstag");
            this.\u00d2O0000.addChangeListener(this.\u00f800000);
            this.\u00d2O0000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 9;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d2O0000, gridBagConstraints);
        }
        return this.\u00d2O0000;
    }

    public JSpinner \u00f8O0000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JSpinner();
            this.\u00f400000.setName("gewicht");
            this.\u00f400000.addChangeListener(this.\u00f800000);
            this.\u00f400000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00f400000, gridBagConstraints);
        }
        return this.\u00f400000;
    }

    public JCheckBox \u00d2o0000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JCheckBox();
            this.\u00d600000.setName("G\u00f6ttergeschenke");
            this.\u00d600000.addChangeListener(this.\u00f800000);
            this.\u00d600000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 11;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d600000, gridBagConstraints);
        }
        return this.\u00d600000;
    }

    public JSpinner o00000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JSpinner();
            this.\u00d200000.setName("groesse");
            this.\u00d200000.addChangeListener(this.\u00f800000);
            this.\u00d200000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d200000, gridBagConstraints);
        }
        return this.\u00d200000;
    }

    public JComboBox \u00d500000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JComboBox();
            this.\u00f600000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 7;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00f600000, gridBagConstraints);
        }
        return this.\u00f600000;
    }

    public JRadioButton null() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JRadioButton("m\u00e4nnlich");
            this.\u00d4O0000.addActionListener(this.do);
        }
        return this.\u00d4O0000;
    }

    public JTextField \u00f600000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JTextField();
            this.\u00d300000.setColumns(20);
            this.\u00d300000.setName("textfeldname");
            this.\u00d300000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.\u00d300000, gridBagConstraints);
        }
        return this.\u00d300000;
    }

    public JTextField \u00f800000() {
        if (this.super == null) {
            this.super = new JTextField();
            this.super.setColumns(20);
            this.super.setEditable(false);
            this.super.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.interface.setConstraints(this.super, gridBagConstraints);
        }
        return this.super;
    }

    public JRadioButton \u00d800000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JRadioButton("weiblich");
            this.\u00d6O0000.addActionListener(this.do);
        }
        return this.\u00d6O0000;
    }

    private JLabel \u00d200000() {
        JLabel jLabel = new JLabel("Alter:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00f5O0000() {
        JLabel jLabel = new JLabel("Eingesetzte AP:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d6O0000() {
        JLabel jLabel = new JLabel("AP:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel ifsuper() {
        JLabel jLabel = new JLabel("Augenfarbe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d2O0000() {
        JLabel jLabel = new JLabel("Geburtsjahr:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d600000() {
        JLabel jLabel = new JLabel("Geburtsmonat:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel String() {
        JLabel jLabel = new JLabel("Geburtstag:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel returnsuper() {
        JLabel jLabel = new JLabel("Gewicht:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d3o0000() {
        JLabel jLabel = new JLabel("G\u00f6ttergeschenk:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d3O0000() {
        JLabel jLabel = new JLabel("Gr\u00f6\u00dfe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel for() {
        JLabel jLabel = new JLabel("Haarfarbe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d5O0000() {
        JLabel jLabel = new JLabel("Name:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel oO0000() {
        JLabel jLabel = new JLabel("Stufe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.interface.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }
}

