/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.gui.allgemein.VerbindungenController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VerbindungenPanel
extends JPanel {
    private JButton \u00f500000;
    private JButton OO0000;
    private GridBagLayout \u00d800000;
    private GridBagConstraints[] \u00d500000 = new GridBagConstraints[2];
    private VerbindungenController return;
    private JButton \u00d300000;
    private JButton if;
    private JButton \u00f800000;
    private JComboBox \u00d400000;
    private JTextField o00000;
    private JTextField new;
    private JTextField \u00f400000;

    public VerbindungenPanel(VerbindungenController verbindungenController) {
        this.return = verbindungenController;
        this.\u00d800000 = new GridBagLayout();
        this.super();
        this.setLayout(new BorderLayout());
        this.createBearbeitenPanel();
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d800000);
        this.\u00d400000 = new JComboBox();
        this.\u00d400000.setPreferredSize(new Dimension(200, 20));
        this.\u00d400000.setMinimumSize(new Dimension(200, 20));
        this.\u00d400000.setMaximumSize(new Dimension(200, 20));
        this.\u00d400000.addItemListener(this.return);
        JLabel jLabel = new JLabel("Verbindungen");
        this.\u00d500000[0].gridy = 0;
        this.\u00d800000.setConstraints(jLabel, this.\u00d500000[0]);
        jPanel.add(jLabel);
        this.\u00d500000[1].gridy = 0;
        this.\u00d800000.setConstraints(this.\u00d400000, this.\u00d500000[1]);
        jPanel.add(this.\u00d400000);
        JLabel jLabel2 = new JLabel("Name");
        this.\u00d500000[0].gridy = 1;
        this.\u00d800000.setConstraints(jLabel2, this.\u00d500000[0]);
        jPanel.add(jLabel2);
        this.o00000 = new JTextField();
        this.o00000.setEditable(false);
        this.o00000.setPreferredSize(new Dimension(200, 20));
        this.o00000.setMinimumSize(new Dimension(200, 20));
        this.o00000.setMaximumSize(new Dimension(200, 20));
        this.\u00d500000[1].gridy = 1;
        this.\u00d800000.setConstraints(this.o00000, this.\u00d500000[1]);
        jPanel.add(this.o00000);
        JLabel jLabel3 = new JLabel("Sozialstatus");
        this.\u00d500000[0].gridy = 2;
        this.\u00d800000.setConstraints(jLabel3, this.\u00d500000[0]);
        jPanel.add(jLabel3);
        this.new = new JTextField();
        this.new.setEditable(false);
        this.new.setPreferredSize(new Dimension(200, 20));
        this.new.setMinimumSize(new Dimension(200, 20));
        this.new.setMaximumSize(new Dimension(200, 20));
        this.\u00d500000[1].gridy = 2;
        this.\u00d800000.setConstraints(this.new, this.\u00d500000[1]);
        jPanel.add(this.new);
        JLabel jLabel4 = new JLabel("Beschreibung");
        this.\u00d500000[0].gridy = 3;
        this.\u00d800000.setConstraints(jLabel4, this.\u00d500000[0]);
        jPanel.add(jLabel4);
        this.\u00f400000 = new JTextField();
        this.\u00f400000.setEditable(false);
        this.\u00f400000.setPreferredSize(new Dimension(200, 20));
        this.\u00f400000.setMinimumSize(new Dimension(200, 20));
        this.\u00f400000.setMaximumSize(new Dimension(200, 20));
        this.\u00d500000[1].gridy = 3;
        this.\u00d800000.setConstraints(this.\u00f400000, this.\u00d500000[1]);
        jPanel.add(this.\u00f400000);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void createBearbeitenPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getEntfernenButton());
        jPanel.add(this.getBearbeitenButton());
        jPanel.add(this.getHinzfuegenButton());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "North");
    }

    public void createNavigationsPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getOkButton());
        jPanel.add(this.getAbbrechenButton());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton getAbbrechenButton() {
        if (this.OO0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.OO0000 = new JButton("Abbrechen", imageIcon);
            this.OO0000.setName("Abbrechen");
            this.OO0000.addActionListener(this.return);
        }
        return this.OO0000;
    }

    public JButton getBearbeitenButton() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JButton("Bearbeiten");
            this.\u00f800000.setName("Bearbeiten");
            this.\u00f800000.addActionListener(this.return);
        }
        return this.\u00f800000;
    }

    public JTextField getBeschreibung() {
        return this.\u00f400000;
    }

    public JButton getEntfernenButton() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JButton("Entfernen");
            this.\u00d300000.setName("Entfernen");
            this.\u00d300000.addActionListener(this.return);
        }
        return this.\u00d300000;
    }

    public JButton getHinzfuegenButton() {
        if (this.if == null) {
            this.if = new JButton("Hinzuf\u00fcgen");
            this.if.setName("Hinzf\u00fcgen");
            this.if.addActionListener(this.return);
        }
        return this.if;
    }

    public JTextField getNameFeld() {
        return this.o00000;
    }

    public JButton getOkButton() {
        if (this.\u00f500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00f500000 = new JButton("OK", imageIcon);
            this.\u00f500000.setName("OK");
            this.\u00f500000.addActionListener(this.return);
        }
        return this.\u00f500000;
    }

    public JTextField getSo() {
        return this.new;
    }

    public JComboBox getVerbindungen() {
        return this.\u00d400000;
    }

    private void super() {
        this.\u00d500000[0] = new GridBagConstraints();
        this.\u00d500000[0].gridx = 0;
        this.\u00d500000[0].anchor = 10;
        this.\u00d500000[0].insets.top = 3;
        this.\u00d500000[0].insets.bottom = 3;
        this.\u00d500000[0].insets.right = 3;
        this.\u00d500000[0].insets.left = 3;
        this.\u00d500000[0].anchor = 17;
        this.\u00d500000[1] = new GridBagConstraints();
        this.\u00d500000[1].gridx = 1;
        this.\u00d500000[1].anchor = 10;
        this.\u00d500000[1].insets.top = 3;
        this.\u00d500000[1].insets.bottom = 3;
        this.\u00d500000[1].insets.right = 3;
        this.\u00d500000[1].insets.left = 3;
    }
}

