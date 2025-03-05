/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.gui.erschaffung.zustaende.LadenZustand;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LadenDialog
extends JPanel {
    private static final long serialVersionUID = 1L;
    private JButton \u00d600000 = null;
    private JButton \u00d200000 = null;
    private JList \u00d800000 = null;
    private JButton \u00d500000 = null;
    private LadenZustand String = null;
    private JPanel \u00d300000 = null;
    private JScrollPane o00000 = null;

    public LadenDialog(LadenZustand ladenZustand) {
        this.String = ladenZustand;
        this.\u00d300000();
        this.update();
    }

    public JList getJLadenList() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JList();
            this.\u00d800000.setSelectionMode(0);
        }
        return this.\u00d800000;
    }

    public void update() {
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
        for (String string : this.String.getListe()) {
            defaultListModel.addElement(string);
        }
        this.getJLadenList().setModel(defaultListModel);
    }

    private JPanel \u00d200000() {
        if (this.\u00d300000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 1;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridy = 1;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 1;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints3.gridy = 1;
            this.\u00d300000 = new JPanel();
            this.\u00d300000.setLayout(new GridBagLayout());
            this.\u00d300000.add((Component)this.o00000(), gridBagConstraints3);
            this.\u00d300000.add((Component)this.\u00d500000(), gridBagConstraints2);
            this.\u00d300000.add((Component)this.String(), gridBagConstraints);
        }
        return this.\u00d300000;
    }

    private JButton String() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JButton();
            this.\u00d500000.setText("Import");
            this.\u00d500000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    LadenDialog.this.String.importieren();
                }
            });
        }
        return this.\u00d500000;
    }

    private JButton \u00d500000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JButton();
            this.\u00d600000.setText("Laden");
            this.\u00d600000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    LadenDialog.this.String.laden();
                }
            });
        }
        return this.\u00d600000;
    }

    private JButton o00000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JButton();
            this.\u00d200000.setText("L\u00f6schen");
            this.\u00d200000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    LadenDialog.this.String.loeschen();
                }
            });
        }
        return this.\u00d200000;
    }

    private JScrollPane \u00d600000() {
        if (this.o00000 == null) {
            this.o00000 = new JScrollPane();
            this.o00000.setViewportView(this.getJLadenList());
        }
        return this.o00000;
    }

    private void \u00d300000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridx = 0;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.gridy = 0;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.weighty = 1.0;
        gridBagConstraints3.gridx = 0;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 1;
        gridBagConstraints4.gridy = 0;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.weighty = 1.0;
        gridBagConstraints4.gridx = 0;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 1;
        gridBagConstraints5.gridy = 0;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 1.0;
        gridBagConstraints5.gridx = 0;
        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(372, 259));
        this.add((Component)this.\u00d200000(), gridBagConstraints2);
        this.add((Component)this.\u00d600000(), gridBagConstraints);
    }
}

