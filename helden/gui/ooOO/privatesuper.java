/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.Version;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.oO00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class privatesuper
extends JPanel {
    private JPanel \u00d800000 = null;
    private JPanel \u00d5O0000 = null;
    private JPanel \u00f600000;
    private JButton \u00f6O0000;
    private JToggleButton \u00d2O0000;
    private JTextPane \u00d6O0000 = null;
    private JTextPane for;
    private JScrollPaneFast \u00d600000 = null;
    private JScrollPaneFast \u00f5O0000 = null;
    private JButton newsuper = null;
    private JButton \u00f800000 = null;
    private JButton \u00f500000 = null;
    private JButton null = null;
    private JButton private = null;
    private JButton \u00d3O0000 = null;
    private JButton \u00d200000 = null;
    private JButton \u00f8O0000 = null;
    private JButton \u00d8O0000 = null;
    private JButton \u00d500000 = null;
    private JButton \u00d300000 = null;
    private JButton o00000 = null;
    private String String = "Version: " + Version.getVersion() + "\nHomepage: http://www.helden-software.de" + "\nKontakt: helden@helden-software.de" + "\nForum: http://forum.helden-software.de" + "\nWiki: http://wiki.helden-software.de" + "\nKontakt: helden@helden-software.de" + "\n\nCopyright 2002-2013 Andreas Sch\u00f6nknecht, Maik Schiefer-Gehrke, Lutz Berthold,\n" + "Christian Kulenkampff, Sven Bursch-Osewold und das restliche Entwicklerteam." + "\n\nDieses Programm darf frei verteilt," + " jedoch nicht ver\u00e4ndert werden.\n\n" + "\n DAS SCHWARZE AUGE, AVENTURIEN, DERE, MYRANOR, THARUN, UTHURIA und RIESLAND " + "\nsind eingetragene Marken der Significant Fantasy Medienrechte GbR." + "Ohne vorherige schriftliche Genehmigung der Ulisses Medien und Spiel " + "Distribution GmbH ist eine Verwendung der genannten Markenzeichen " + "nicht gestattet.";
    private ActionListener oO0000;

    public privatesuper(JDialog jDialog) {
        this.oO0000 = new oO00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this, jDialog);
        this.\u00d200000();
    }

    public JButton int() {
        if (this.\u00d500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/steppenelf_krieger_icon.gif")));
            this.\u00d500000 = new JButton(imageIcon);
            this.\u00d500000.addActionListener(this.oO0000);
        }
        return this.\u00d500000;
    }

    public JButton \u00d4O0000() {
        if (this.\u00d300000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/mittelreichische_schelmin_icon.gif")));
            this.\u00d300000 = new JButton(imageIcon);
            this.\u00d300000.addActionListener(this.oO0000);
        }
        return this.\u00d300000;
    }

    public JButton \u00f8O0000() {
        if (this.o00000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/achaz_kristallomantin_icon.gif")));
            this.o00000 = new JButton(imageIcon);
            this.o00000.addActionListener(this.oO0000);
        }
        return this.o00000;
    }

    public JButton do() {
        if (this.newsuper == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/bardin_amber_Icon.gif")));
            this.newsuper = new JButton(imageIcon);
            this.newsuper.addActionListener(this.oO0000);
        }
        return this.newsuper;
    }

    public JButton Objectsuper() {
        if (this.\u00f800000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/magier_rothaar_Icon.gif")));
            this.\u00f800000 = new JButton(imageIcon);
            this.\u00f800000.addActionListener(this.oO0000);
        }
        return this.\u00f800000;
    }

    public JButton \u00d600000() {
        if (this.\u00f500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/draconiter_ordenskrieger.gif")));
            this.\u00f500000 = new JButton(imageIcon);
            this.\u00f500000.addActionListener(this.oO0000);
        }
        return this.\u00f500000;
    }

    public JButton \u00d2O0000() {
        if (this.null == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/hexe.gif")));
            this.null = new JButton(imageIcon);
            this.null.addActionListener(this.oO0000);
        }
        return this.null;
    }

    public JButton \u00f6O0000() {
        if (this.private == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/halbelfe_geheimagentin_icon.gif")));
            this.private = new JButton(imageIcon);
            this.private.addActionListener(this.oO0000);
        }
        return this.private;
    }

    public JButton \u00d800000() {
        if (this.\u00d3O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/mhanadistanischer_falkner_icon.gif")));
            this.\u00d3O0000 = new JButton(imageIcon);
            this.\u00d3O0000.addActionListener(this.oO0000);
        }
        return this.\u00d3O0000;
    }

    public JButton \u00d3O0000() {
        if (this.\u00d200000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/utulu-gladiatorin-Icon.gif")));
            this.\u00d200000 = new JButton(imageIcon);
            this.\u00d200000.addActionListener(this.oO0000);
        }
        return this.\u00d200000;
    }

    public JButton \u00f800000() {
        if (this.\u00f8O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/zwergenkrieger_Icon.gif")));
            this.\u00f8O0000 = new JButton(imageIcon);
            this.\u00f8O0000.addActionListener(this.oO0000);
        }
        return this.\u00f8O0000;
    }

    public JButton \u00d6O0000() {
        if (this.\u00d8O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/goblin_schamanin.gif")));
            this.\u00d8O0000 = new JButton(imageIcon);
            this.\u00d8O0000.addActionListener(this.oO0000);
        }
        return this.\u00d8O0000;
    }

    public JToggleButton super() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JToggleButton("Weitere Informationen");
            this.\u00d2O0000.setName("info");
            this.\u00d2O0000.addActionListener(this.oO0000);
        }
        return this.\u00d2O0000;
    }

    public JScrollPaneFast class() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JScrollPaneFast();
            this.\u00d600000.setViewportView(this.\u00d8O0000());
        }
        return this.\u00d600000;
    }

    public JTextPane \u00d8O0000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JTextPane();
            this.\u00d6O0000.setText(this.String);
            this.\u00d6O0000.setEditable(false);
        }
        return this.\u00d6O0000;
    }

    public JScrollPaneFast \u00f400000() {
        if (this.\u00f5O0000 == null) {
            this.\u00f5O0000 = new JScrollPaneFast(this.\u00f600000());
            this.\u00f5O0000.setPreferredSize(new Dimension(100, 25));
        }
        return this.\u00f5O0000;
    }

    public JButton interface() {
        if (this.\u00f6O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00f6O0000 = new JButton("OK", imageIcon);
            this.\u00f6O0000.setName("OK");
            this.\u00f6O0000.addActionListener(this.oO0000);
        }
        return this.\u00f6O0000;
    }

    public void \u00f4O0000() {
        this.\u00d8O0000().setText(this.String);
    }

    private JPanel \u00d400000() {
        if (this.\u00d5O0000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 5;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 3;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 4;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridy = 3;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 3;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints3.gridy = 3;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 2;
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints4.gridy = 3;
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 1;
            gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints5.gridy = 3;
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints6.gridy = 3;
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.gridx = 5;
            gridBagConstraints7.weightx = 1.0;
            gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints7.gridy = 2;
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.gridx = 4;
            gridBagConstraints8.weightx = 1.0;
            gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints8.gridy = 2;
            GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
            gridBagConstraints9.gridx = 3;
            gridBagConstraints9.weightx = 1.0;
            gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints9.gridy = 2;
            GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
            gridBagConstraints10.gridx = 2;
            gridBagConstraints10.weightx = 1.0;
            gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints10.gridy = 2;
            GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
            gridBagConstraints11.gridx = 1;
            gridBagConstraints11.weightx = 1.0;
            gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints11.gridy = 2;
            GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
            gridBagConstraints12.gridx = 0;
            gridBagConstraints12.weightx = 1.0;
            gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints12.gridy = 2;
            GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
            gridBagConstraints13.fill = 1;
            gridBagConstraints13.gridx = 0;
            gridBagConstraints13.gridy = 0;
            gridBagConstraints13.weightx = 1.0;
            gridBagConstraints13.weighty = 1.0;
            gridBagConstraints13.gridwidth = 6;
            gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
            this.\u00d5O0000 = new JPanel();
            this.\u00d5O0000.setLayout(new GridBagLayout());
            this.\u00d5O0000.add((Component)this.\u00f400000(), gridBagConstraints13);
            this.\u00d5O0000.add((Component)this.do(), gridBagConstraints12);
            this.\u00d5O0000.add((Component)this.Objectsuper(), gridBagConstraints11);
            this.\u00d5O0000.add((Component)this.\u00d600000(), gridBagConstraints10);
            this.\u00d5O0000.add((Component)this.\u00d2O0000(), gridBagConstraints9);
            this.\u00d5O0000.add((Component)this.\u00f6O0000(), gridBagConstraints8);
            this.\u00d5O0000.add((Component)this.\u00d800000(), gridBagConstraints7);
            this.\u00d5O0000.add((Component)this.\u00d3O0000(), gridBagConstraints6);
            this.\u00d5O0000.add((Component)this.\u00f800000(), gridBagConstraints5);
            this.\u00d5O0000.add((Component)this.\u00d6O0000(), gridBagConstraints4);
            this.\u00d5O0000.add((Component)this.int(), gridBagConstraints3);
            this.\u00d5O0000.add((Component)this.\u00d4O0000(), gridBagConstraints2);
            this.\u00d5O0000.add((Component)this.\u00f8O0000(), gridBagConstraints);
        }
        return this.\u00d5O0000;
    }

    private JTextPane \u00f600000() {
        if (this.for == null) {
            this.for = new JTextPane();
            this.for.setText("Illustration der folgenden Zeichnungen Copyright 2007 by Caryad\nNutzung der Bilder nur mit ausdr\u00fccklicher Genemigung durch die K\u00fcnstlerin");
            this.for.setEditable(false);
        }
        return this.for;
    }

    private JPanel OO0000() {
        if (this.\u00d800000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 1;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            this.\u00d800000 = new JPanel();
            this.\u00d800000.setLayout(new GridBagLayout());
            this.\u00d800000.setPreferredSize(new Dimension(100, 235));
            gridBagConstraints.gridwidth = 2;
            this.\u00d800000.add((Component)this.class(), gridBagConstraints);
        }
        return this.\u00d800000;
    }

    private JPanel \u00d300000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JPanel();
            this.\u00f600000.setLayout(new GridBagLayout());
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.weighty = 0.0;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.fill = 1;
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            gridBagConstraints2.weightx = 0.0;
            gridBagConstraints2.weighty = 0.0;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            this.\u00f600000.add((Component)this.interface(), gridBagConstraints);
            this.\u00f600000.add((Component)this.super(), gridBagConstraints2);
        }
        return this.\u00f600000;
    }

    private void \u00d200000() {
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(550, 450));
        this.add((Component)this.OO0000(), "North");
        this.add((Component)this.\u00d400000(), "Center");
        this.add((Component)this.\u00d300000(), "South");
    }
}

