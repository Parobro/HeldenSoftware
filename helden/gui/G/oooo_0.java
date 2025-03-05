/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.gui.G.public;
import helden.gui.erschaffung.HauptDialog;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.OOoo
 */
public class oooo_0
extends JPanel {
    private JRadioButton \u00d400000;
    private JRadioButton \u00d500000;
    private public o00000;
    private JComboBox \u00d800000;
    private Settings new;
    private JPanel \u00d300000;
    private JLabel return;

    public oooo_0(public public_) {
        this.o00000 = public_;
        this.setName("Geschlecht-Panel");
        this.setLayout(new BorderLayout());
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.\u00d400000());
        buttonGroup.add(this.new());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        int n = 0;
        jPanel.add((Component)new JLabel(" "), HauptDialog.getConstraints(0, n, 1));
        jPanel.add((Component)this.\u00d400000, HauptDialog.getConstraints(0, ++n, 1));
        jPanel.add((Component)this.\u00d500000, HauptDialog.getConstraints(0, ++n, 1));
        JLabel jLabel = new JLabel("Ein sp\u00e4tere \u00c4nderung des Geschlechts ist nicht m\u00f6glich!");
        GridBagConstraints gridBagConstraints = HauptDialog.getConstraints(1, n, 2);
        gridBagConstraints.anchor = 13;
        jPanel.add((Component)jLabel, gridBagConstraints);
        jPanel.add((Component)new JLabel(" "), HauptDialog.getConstraints(0, ++n, 1));
        jPanel.add((Component)new JLabel("Regelbasis:"), HauptDialog.getConstraints(0, ++n, 1));
        jPanel.add((Component)this.\u00d500000(), HauptDialog.getConstraints(1, n, 1));
        this.\u00d500000().setEnabled(public_.\u00d600000().\u00f8O0000());
        jPanel.add((Component)new JLabel("Beschreibung:"), HauptDialog.getConstraints(0, ++n, 1));
        GridBagConstraints gridBagConstraints2 = HauptDialog.getConstraints(1, ++n, 2);
        gridBagConstraints2.fill = 1;
        jPanel.add((Component)this.\u00d300000(), gridBagConstraints2);
        jPanel.add((Component)new JLabel("Regelb\u00fccher:"), HauptDialog.getConstraints(0, ++n, 1));
        gridBagConstraints2 = HauptDialog.getConstraints(1, ++n, 2);
        gridBagConstraints2.fill = 1;
        jPanel.add((Component)this.return(), gridBagConstraints2);
        this.\u00d800000.setEnabled(public_.\u00d600000().\u00f8O0000());
        this.add((Component)jPanel, "North");
    }

    public JComboBox \u00d500000() {
        if (this.\u00d800000 == null) {
            Settings settings;
            this.new = settings = this.o00000.\u00d2O0000();
            ArrayList<Settings> arrayList = Settings.getHauptSettings();
            for (Settings settings2 : arrayList) {
                if (!settings2.getName().equals(settings.getName())) continue;
                arrayList.remove(settings2);
                break;
            }
            arrayList.add(settings);
            int n = 0;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                Settings settings3 = (Settings)arrayList.get(i2);
                if (!settings3.getName().equals(settings.getName())) continue;
                n = i2;
                break;
            }
            this.\u00d800000 = new JComboBox();
            for (Settings settings3 : arrayList) {
                this.\u00d800000.addItem(settings3);
            }
            this.\u00d800000.setSelectedIndex(n);
            this.\u00d800000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    oooo_0.this.new = (Settings)oooo_0.this.\u00d800000.getSelectedItem();
                    oooo_0.this.o00000.super(oooo_0.this.new);
                    oooo_0.this.o00000();
                }
            });
            this.\u00d800000.setSelectedIndex(n);
        }
        return this.\u00d800000;
    }

    public JRadioButton \u00d400000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JRadioButton("m\u00e4nnlich");
            this.\u00d400000.addActionListener(this.o00000);
        }
        return this.\u00d400000;
    }

    public JLabel \u00d300000() {
        if (this.return == null) {
            this.return = new JLabel();
        }
        return this.return;
    }

    public JRadioButton new() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JRadioButton("weiblich");
            this.\u00d500000.addActionListener(this.o00000);
        }
        return this.\u00d500000;
    }

    private void o00000() {
        Component component22;
        Component[] componentArray;
        for (Component component22 : componentArray = this.return().getComponents()) {
            this.\u00d300000.remove(component22);
        }
        this.\u00d300000.setLayout(new GridBagLayout());
        int n = 0;
        ++n;
        for (String string : this.new.getBuecher()) {
            component22 = new JCheckBox(string);
            ((AbstractButton)component22).setEnabled(false);
            ((AbstractButton)component22).setSelected(true);
            this.\u00d300000.add(component22, HauptDialog.getConstraints(0, ++n, 1));
        }
        for (Setting setting : this.new.getOptionaleSettings()) {
            ++n;
            component22 = new JCheckBox(setting.getBeschreibung());
            component22.setName(setting.getName());
            ((AbstractButton)component22).setEnabled(this.o00000.\u00d600000().\u00f8O0000());
            boolean bl = false;
            for (Setting setting2 : this.new.getIncludedSettings()) {
                if (!setting2.getName().equals(setting.getName())) continue;
                bl = true;
                break;
            }
            ((AbstractButton)component22).setSelected(bl);
            ((AbstractButton)component22).addChangeListener(new ChangeListener(){

                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    JCheckBox jCheckBox = (JCheckBox)changeEvent.getSource();
                    if (jCheckBox.isSelected()) {
                        oooo_0.this.new.addIncludeSetting(jCheckBox.getName());
                    } else {
                        oooo_0.this.new.removeIncludeSetting(jCheckBox.getName());
                    }
                }
            });
            this.\u00d300000.add(component22, HauptDialog.getConstraints(0, n, 1));
            for (String string : setting.getBuecher()) {
                JLabel jLabel = new JLabel("- " + string);
                this.\u00d300000.add((Component)jLabel, HauptDialog.getConstraints(0, ++n, 1));
                jLabel.setEnabled(this.o00000.\u00d600000().\u00f8O0000());
            }
        }
        this.\u00d300000().setText("<html><body>" + this.new.getBeschreibung().replace("\n", "<br>"));
    }

    private JPanel return() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JPanel();
        }
        return this.\u00d300000;
    }
}

