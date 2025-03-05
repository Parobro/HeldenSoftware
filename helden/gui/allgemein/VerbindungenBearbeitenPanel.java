/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.gui.allgemein.VerbindungenBearbeitenController;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VerbindungenBearbeitenPanel
extends JPanel {
    private VerbindungenBearbeitenController \u00d200000;
    private JButton null;
    private JButton o00000;
    private GridBagLayout String;
    private GridBagConstraints[] \u00d800000 = new GridBagConstraints[2];
    private JTextField \u00d300000;
    private JSpinner \u00d500000;
    private JTextField \u00d600000;

    public VerbindungenBearbeitenPanel(VerbindungenBearbeitenController verbindungenBearbeitenController) {
        this.\u00d200000 = verbindungenBearbeitenController;
        this.String = new GridBagLayout();
        this.o00000();
        this.setLayout(new BorderLayout());
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.String);
        JLabel jLabel = new JLabel("Name");
        this.\u00d800000[0].gridy = 1;
        this.String.setConstraints(jLabel, this.\u00d800000[0]);
        jPanel.add(jLabel);
        this.\u00d300000 = new JTextField();
        this.\u00d300000.setPreferredSize(new Dimension(200, 20));
        this.\u00d300000.setMinimumSize(new Dimension(200, 20));
        this.\u00d300000.setMaximumSize(new Dimension(200, 20));
        this.\u00d800000[1].gridy = 1;
        this.String.setConstraints(this.\u00d300000, this.\u00d800000[1]);
        jPanel.add(this.\u00d300000);
        JLabel jLabel2 = new JLabel("Sozialstatus");
        this.\u00d800000[0].gridy = 2;
        this.String.setConstraints(jLabel2, this.\u00d800000[0]);
        jPanel.add(jLabel2);
        this.\u00d500000 = new JSpinner();
        this.\u00d500000.setModel(new SpinnerNumberModel(1, 1, 30, 1));
        this.\u00d500000.setPreferredSize(new Dimension(200, 20));
        this.\u00d500000.setMinimumSize(new Dimension(200, 20));
        this.\u00d500000.setMaximumSize(new Dimension(200, 20));
        this.\u00d800000[1].gridy = 2;
        this.String.setConstraints(this.\u00d500000, this.\u00d800000[1]);
        jPanel.add(this.\u00d500000);
        JLabel jLabel3 = new JLabel("Beschreibung");
        this.\u00d800000[0].gridy = 3;
        this.String.setConstraints(jLabel3, this.\u00d800000[0]);
        jPanel.add(jLabel3);
        this.\u00d600000 = new JTextField();
        this.\u00d600000.setPreferredSize(new Dimension(200, 20));
        this.\u00d600000.setMinimumSize(new Dimension(200, 20));
        this.\u00d600000.setMaximumSize(new Dimension(200, 20));
        this.\u00d800000[1].gridy = 3;
        this.String.setConstraints(this.\u00d600000, this.\u00d800000[1]);
        jPanel.add(this.\u00d600000);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
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
        if (this.o00000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.o00000 = new JButton("Abbrechen", imageIcon);
            this.o00000.setName("Abbrechen");
            this.o00000.addActionListener(this.\u00d200000);
        }
        return this.o00000;
    }

    public JTextField getBeschreibung() {
        return this.\u00d600000;
    }

    public JTextField getNameFeld() {
        return this.\u00d300000;
    }

    public JButton getOkButton() {
        if (this.null == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.null = new JButton("OK", imageIcon);
            this.null.setName("OK");
            this.null.addActionListener(this.\u00d200000);
        }
        return this.null;
    }

    public JSpinner getSo() {
        return this.\u00d500000;
    }

    private void o00000() {
        this.\u00d800000[0] = new GridBagConstraints();
        this.\u00d800000[0].gridx = 0;
        this.\u00d800000[0].anchor = 10;
        this.\u00d800000[0].insets.top = 3;
        this.\u00d800000[0].insets.bottom = 3;
        this.\u00d800000[0].insets.right = 3;
        this.\u00d800000[0].insets.left = 3;
        this.\u00d800000[0].anchor = 17;
        this.\u00d800000[1] = new GridBagConstraints();
        this.\u00d800000[1].gridx = 1;
        this.\u00d800000[1].anchor = 10;
        this.\u00d800000[1].insets.top = 3;
        this.\u00d800000[1].insets.bottom = 3;
        this.\u00d800000[1].insets.right = 3;
        this.\u00d800000[1].insets.left = 3;
    }
}

