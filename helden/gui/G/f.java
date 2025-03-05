/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.gui.g.l_0;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class f
extends JPanel {
    private JCheckBox \u00d200000;
    private GridBagLayout Object;
    private l_0 o00000;

    public f(l_0 l_02) {
        this.o00000 = l_02;
        this.setName("Startdialog");
        this.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        this.Object = new GridBagLayout();
        jPanel.setLayout(this.Object);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 0;
        this.o00000("Dieser Editor erlaubt die Ver\u00e4nderung des Helden,", gridBagConstraints, jPanel);
        this.o00000("ohne Einsatz von Abenteuerpunkten.", gridBagConstraints, jPanel);
        this.o00000(" ", gridBagConstraints, jPanel);
        this.o00000(" ", gridBagConstraints, jPanel);
        this.o00000("Mit Hilfe des erweiterten Editors k\u00f6nnen nachtr\u00e4glich noch", gridBagConstraints, jPanel);
        this.o00000("weitere Dinge (Rasse, Profession, Kultur) ge\u00e4ndert werden,", gridBagConstraints, jPanel);
        this.o00000("die im normalen Modus nicht ge\u00e4ndert werden k\u00f6nnen.", gridBagConstraints, jPanel);
        this.\u00d200000 = new JCheckBox("Erweiterter Editor aktivieren");
        this.Object.setConstraints(this.\u00d200000, gridBagConstraints);
        jPanel.add(this.\u00d200000);
        this.o00000(" ", gridBagConstraints, jPanel);
        this.o00000(" ", gridBagConstraints, jPanel);
        this.o00000("Zur Sicherheit, wird eine Kopie des unver\u00e4nderten Helden angelegt.", gridBagConstraints, jPanel);
        this.\u00d200000.addChangeListener(this.o00000);
        this.add((Component)jPanel, "Center");
    }

    public JCheckBox o00000() {
        return this.\u00d200000;
    }

    public void o00000(JCheckBox jCheckBox) {
        this.\u00d200000 = jCheckBox;
    }

    private void o00000(String string, GridBagConstraints gridBagConstraints, JPanel jPanel) {
        JLabel jLabel = new JLabel(string);
        this.Object.setConstraints(jLabel, gridBagConstraints);
        jPanel.add(jLabel);
        ++gridBagConstraints.gridy;
    }
}

