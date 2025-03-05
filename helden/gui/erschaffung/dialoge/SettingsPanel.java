/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.erschaffung.HauptDialog;
import helden.gui.erschaffung.zustaende.SettingsZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SettingsPanel
extends JPanel {
    private SettingsZustand o00000;
    private JLabel \u00d500000;
    private Settings \u00d200000;
    private JPanel Object;
    private JComboBox \u00d600000;
    private JEditorPane \u00d400000;

    public SettingsPanel(SettingsZustand settingsZustand) {
        this.o00000 = settingsZustand;
        this.setLayout(new BorderLayout());
        this.add((Component)this.\u00d200000(), "Center");
    }

    public JComboBox getCombobox() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JComboBox<Object>(Settings.getHauptSettings().toArray());
            this.\u00d600000.setName("SettingsAuswahl");
            this.\u00d600000.setPreferredSize(new Dimension(140, 22));
            this.\u00d600000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    SettingsPanel.this.\u00d200000 = (Settings)SettingsPanel.this.\u00d600000.getSelectedItem();
                    SettingsPanel.this.o00000.setSettings(SettingsPanel.this.\u00d200000);
                    SettingsPanel.this.super();
                }
            });
        }
        return this.\u00d600000;
    }

    public JEditorPane getJEditorPane() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new TextAreaWithHyperlinkSupport("");
        }
        return this.\u00d400000;
    }

    public JLabel getTextArea() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JLabel();
        }
        return this.\u00d500000;
    }

    private void super() {
        Component component2;
        Component[] componentArray;
        for (Component component2 : componentArray = this.Object.getComponents()) {
            this.Object.remove(component2);
        }
        this.Object.setLayout(new GridBagLayout());
        int n = 0;
        ++n;
        for (String string : this.\u00d200000.getBuecher()) {
            component2 = new JCheckBox(string);
            ((AbstractButton)component2).setEnabled(false);
            ((AbstractButton)component2).setSelected(true);
            this.Object.add(component2, HauptDialog.getConstraints(0, ++n, 1));
        }
        for (Setting setting : this.\u00d200000.getOptionaleSettings()) {
            component2 = new JCheckBox(setting.getBeschreibung());
            component2.setName(setting.getName());
            ((AbstractButton)component2).addChangeListener(new ChangeListener(){

                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    JCheckBox jCheckBox = (JCheckBox)changeEvent.getSource();
                    if (jCheckBox.isSelected()) {
                        SettingsPanel.this.\u00d200000.addIncludeSetting(jCheckBox.getName());
                    } else {
                        SettingsPanel.this.\u00d200000.removeIncludeSetting(jCheckBox.getName());
                    }
                }
            });
            this.Object.add(component2, HauptDialog.getConstraints(0, ++n, 1));
            for (String string : setting.getBuecher()) {
                this.Object.add((Component)new JLabel("- " + string), HauptDialog.getConstraints(0, ++n, 1));
            }
        }
        this.getJEditorPane().setText("<html><body>" + this.\u00d200000.getBeschreibung().replace("\n", "<br>"));
    }

    private JPanel \u00d300000() {
        if (this.Object == null) {
            this.Object = new JPanel();
        }
        return this.Object;
    }

    private JScrollPane \u00d200000() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        int n = 1;
        jPanel.add((Component)new JLabel("Regelbasis:"), HauptDialog.getConstraints(0, n, 1));
        jPanel.add((Component)this.getCombobox(), HauptDialog.getConstraints(1, n, 1));
        jPanel.add((Component)new JLabel("Beschreibung:"), HauptDialog.getConstraints(0, ++n, 1));
        GridBagConstraints gridBagConstraints = HauptDialog.getConstraints(1, ++n, 2);
        gridBagConstraints.fill = 1;
        jPanel.add((Component)this.getJEditorPane(), gridBagConstraints);
        jPanel.add((Component)new JLabel("Regelb\u00fccher:"), HauptDialog.getConstraints(0, ++n, 1));
        gridBagConstraints = HauptDialog.getConstraints(1, ++n, 2);
        gridBagConstraints.fill = 1;
        jPanel.add((Component)this.\u00d300000(), gridBagConstraints);
        this.\u00d600000.setSelectedIndex(0);
        return new JScrollPane(jPanel);
    }
}

