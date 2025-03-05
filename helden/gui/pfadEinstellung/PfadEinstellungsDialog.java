/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.pfadEinstellung;

import helden.gui.pfadEinstellung.JPfadTextField;
import helden.gui.pfadEinstellung.PfadEinstellungsController;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PfadEinstellungsDialog
extends JDialog {
    private PfadEinstellungsController Oo0000 = null;
    private JPanel \u00d3o0000 = null;
    private JButton \u00f5O0000 = null;
    private JButton forsuper = null;
    private JPfadTextField \u00d800000 = null;
    private JButton \u00f4o0000 = null;
    private JPfadTextField \u00d8O0000 = null;
    private JButton new = null;
    private JButton \u00f800000 = null;
    private JPanel \u00f500000 = null;
    private JLabel oo0000 = null;
    private JLabel \u00d3O0000 = null;
    private JLabel while = null;
    private JLabel oO0000 = null;
    private JPfadTextField nullsuper = null;
    private JLabel OO0000 = null;
    private JLabel \u00f400000 = null;
    private JButton \u00d5O0000 = null;
    private JButton \u00d400000 = null;
    private JPfadTextField return = null;
    private JPfadTextField privatesuper = null;
    private JLabel \u00d500000 = null;
    private JPfadTextField \u00f5o0000 = null;
    private JButton \u00d4O0000 = null;
    private JLabel \u00d5o0000 = null;
    private JPfadTextField o00000 = null;
    private JButton \u00d8o0000 = null;
    private JButton \u00f4O0000 = null;
    private JButton Stringsuper = null;
    private JLabel \u00d300000;
    private JPfadTextField \u00d4o0000;
    private JButton thissuper;
    private JPfadTextField \u00f8O0000;
    private JButton if;
    private JLabel \u00f8o0000;

    public PfadEinstellungsDialog(PfadEinstellungsController pfadEinstellungsController, JFrame jFrame) {
        super(jFrame);
        this.Oo0000 = pfadEinstellungsController;
        this.o00000();
    }

    public PfadEinstellungsDialog getDialog() {
        return this;
    }

    public JButton getJallButton() {
        if (this.\u00f4O0000 == null) {
            this.\u00f4O0000 = new JButton();
            this.\u00f4O0000.setText("Alle Speicherpfade");
            this.\u00f4O0000.addActionListener(this.Oo0000);
        }
        return this.\u00f4O0000;
    }

    public JButton getJBilderButton() {
        if (this.\u00d5O0000 == null) {
            this.\u00d5O0000 = new JButton();
            this.\u00d5O0000.setText("...");
            this.\u00d5O0000.addActionListener(this.Oo0000);
        }
        return this.\u00d5O0000;
    }

    public JPfadTextField getJBildPfadTextField() {
        if (this.return == null) {
            this.return = new JPfadTextField();
        }
        return this.return;
    }

    public JButton getJDatenButton() {
        if (this.thissuper == null) {
            this.thissuper = new JButton("...");
            this.thissuper.addActionListener(this.Oo0000);
        }
        return this.thissuper;
    }

    public JPfadTextField getJDatenPfadTextField() {
        if (this.\u00d4o0000 == null) {
            this.\u00d4o0000 = new JPfadTextField();
            this.\u00d4o0000.setColumns(10);
        }
        return this.\u00d4o0000;
    }

    public JButton getJHeldenButton() {
        if (this.\u00f4o0000 == null) {
            this.\u00f4o0000 = new JButton();
            this.\u00f4o0000.setText("...");
            this.\u00f4o0000.addActionListener(this.Oo0000);
        }
        return this.\u00f4o0000;
    }

    public JPfadTextField getJHeldenPfadTextField() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JPfadTextField();
            this.\u00d800000.setToolTipText("Speicherort der Helden");
        }
        return this.\u00d800000;
    }

    public JButton getJHilfeButton() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JButton();
            this.\u00d400000.setText("...");
            this.\u00d400000.addActionListener(this.Oo0000);
        }
        return this.\u00d400000;
    }

    public JPfadTextField getJHilfePfadTextField() {
        if (this.privatesuper == null) {
            this.privatesuper = new JPfadTextField();
            this.privatesuper.setToolTipText("Die unter Hilfe zu finden Texte, werden dort abgelegt");
        }
        return this.privatesuper;
    }

    public JButton getJHintergrundButton() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JButton();
            this.\u00f800000.setText("...");
            this.\u00f800000.addActionListener(this.Oo0000);
        }
        return this.\u00f800000;
    }

    public JPfadTextField getJHintergrundPfadTextField() {
        if (this.nullsuper == null) {
            this.nullsuper = new JPfadTextField();
            this.nullsuper.setToolTipText("In diesem Ordner werden die Hintergr\u00fcnde gesucht");
        }
        return this.nullsuper;
    }

    public JButton getJLogButton() {
        if (this.if == null) {
            this.if = new JButton("...");
        }
        return this.if;
    }

    public JPfadTextField getJLogsPfadTextField() {
        if (this.\u00f8O0000 == null) {
            this.\u00f8O0000 = new JPfadTextField();
            this.\u00f8O0000.setColumns(10);
        }
        return this.\u00f8O0000;
    }

    public JButton getJModsButton() {
        if (this.\u00d8o0000 == null) {
            this.\u00d8o0000 = new JButton();
            this.\u00d8o0000.setText("...");
            this.\u00d8o0000.addActionListener(this.Oo0000);
        }
        return this.\u00d8o0000;
    }

    public JPfadTextField getJModsPfadTextField() {
        if (this.o00000 == null) {
            this.o00000 = new JPfadTextField();
        }
        return this.o00000;
    }

    public JButton getJPluginButton() {
        if (this.new == null) {
            this.new = new JButton();
            this.new.setText("...");
            this.new.addActionListener(this.Oo0000);
        }
        return this.new;
    }

    public JPfadTextField getJPluginPfadTextField() {
        if (this.\u00d8O0000 == null) {
            this.\u00d8O0000 = new JPfadTextField();
            this.\u00d8O0000.setToolTipText("In diesem Ordner werden die Plugin gesucht");
        }
        return this.\u00d8O0000;
    }

    public JButton getJProfiButton() {
        if (this.Stringsuper == null) {
            this.Stringsuper = new JButton();
            this.Stringsuper.setText("Experte");
            this.Stringsuper.addActionListener(this.Oo0000);
        }
        return this.Stringsuper;
    }

    public JButton getJSaveButton() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JButton();
            this.\u00d4O0000.setText("...");
            this.\u00d4O0000.addActionListener(this.Oo0000);
        }
        return this.\u00d4O0000;
    }

    public JPfadTextField getJSavePfadTextField() {
        if (this.\u00f5o0000 == null) {
            this.\u00f5o0000 = new JPfadTextField();
            this.\u00f5o0000.setToolTipText("In diesem Ordner werden, die w\u00e4hrend der Erschaffung gespeicherten, Helden gespeichert");
        }
        return this.\u00f5o0000;
    }

    public JButton getJSpeichernButton() {
        if (this.\u00f5O0000 == null) {
            this.\u00f5O0000 = new JButton();
            this.\u00f5O0000.setText("speichern");
            this.\u00f5O0000.addActionListener(this.Oo0000);
        }
        return this.\u00f5O0000;
    }

    public JLabel getLogsLabel() {
        if (this.\u00f8o0000 == null) {
            this.\u00f8o0000 = new JLabel("Logs");
        }
        return this.\u00f8o0000;
    }

    public void setLabelVisible(boolean bl) {
        this.\u00d3O0000.setVisible(bl);
        this.while.setVisible(bl);
        this.oO0000.setVisible(bl);
        this.OO0000.setVisible(bl);
        this.\u00f400000.setVisible(bl);
        this.\u00d500000.setVisible(bl);
        this.\u00d5o0000.setVisible(bl);
        this.getLogsLabel().setVisible(bl);
        this.\u00d300000.setVisible(bl);
    }

    private JButton new() {
        if (this.forsuper == null) {
            this.forsuper = new JButton();
            this.forsuper.setText("schlie\u00dfen");
            this.forsuper.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    PfadEinstellungsDialog.this.getDialog().setVisible(false);
                }
            });
        }
        return this.forsuper;
    }

    private JPanel \u00d400000() {
        if (this.\u00d3o0000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 0;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridy = 0;
            this.\u00d3o0000 = new JPanel();
            this.\u00d3o0000.setLayout(new GridBagLayout());
            this.\u00d3o0000.add((Component)this.getJSpeichernButton(), gridBagConstraints2);
            this.\u00d3o0000.add((Component)this.new(), gridBagConstraints);
        }
        return this.\u00d3o0000;
    }

    private JPanel \u00d300000() {
        if (this.\u00f500000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 1;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.insets = new Insets(6, 5, 5, 5);
            gridBagConstraints2.gridy = 1;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 2;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints3.gridy = 8;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.fill = 2;
            gridBagConstraints4.gridy = 8;
            gridBagConstraints4.weightx = 1.0;
            gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints4.gridx = 1;
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints5.gridx = 0;
            gridBagConstraints5.gridy = 8;
            this.\u00d5o0000 = new JLabel();
            this.\u00d5o0000.setText("Mods (Rassen, Talente,...)");
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.gridx = 2;
            gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints6.gridy = 7;
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.fill = 2;
            gridBagConstraints7.gridy = 7;
            gridBagConstraints7.weightx = 1.0;
            gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints7.gridx = 1;
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.gridx = 0;
            gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints8.gridy = 7;
            this.\u00d500000 = new JLabel();
            this.\u00d500000.setText("Erschaffungssaves");
            GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
            gridBagConstraints9.fill = 2;
            gridBagConstraints9.gridy = 6;
            gridBagConstraints9.weightx = 1.0;
            gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints9.gridx = 1;
            GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
            gridBagConstraints10.fill = 2;
            gridBagConstraints10.gridy = 5;
            gridBagConstraints10.weightx = 1.0;
            gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints10.gridx = 1;
            GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
            gridBagConstraints11.gridx = 2;
            gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints11.gridy = 6;
            GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
            gridBagConstraints12.gridx = 2;
            gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints12.gridy = 5;
            GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
            gridBagConstraints13.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints13.gridx = 0;
            gridBagConstraints13.gridy = 6;
            this.\u00f400000 = new JLabel();
            this.\u00f400000.setText("HilfeTexte");
            GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
            gridBagConstraints14.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints14.gridx = 0;
            gridBagConstraints14.gridy = 5;
            this.OO0000 = new JLabel();
            this.OO0000.setText("Heldenbilder");
            GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
            gridBagConstraints15.fill = 2;
            gridBagConstraints15.gridy = 4;
            gridBagConstraints15.weightx = 1.0;
            gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints15.gridx = 1;
            GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
            gridBagConstraints16.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints16.gridx = 0;
            gridBagConstraints16.gridy = 4;
            this.oO0000 = new JLabel();
            this.oO0000.setText("Hintergr\u00fcnde");
            GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
            gridBagConstraints17.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints17.gridx = 0;
            gridBagConstraints17.gridy = 3;
            this.while = new JLabel();
            this.while.setText("Plugins");
            GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
            gridBagConstraints18.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints18.gridx = 0;
            gridBagConstraints18.gridy = 2;
            this.\u00d3O0000 = new JLabel();
            this.\u00d3O0000.setText("Helden.zip.hld");
            GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
            gridBagConstraints19.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints19.gridx = 0;
            gridBagConstraints19.gridy = 1;
            this.oo0000 = new JLabel();
            this.oo0000.setText("Alle Pfade \u00e4ndern");
            GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
            gridBagConstraints20.insets = new Insets(5, 5, 0, 0);
            gridBagConstraints20.gridx = 0;
            gridBagConstraints20.gridy = 11;
            gridBagConstraints20.gridheight = 2;
            gridBagConstraints20.gridwidth = 4;
            GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
            gridBagConstraints21.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints21.gridy = 4;
            gridBagConstraints21.gridx = 2;
            GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
            gridBagConstraints22.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints22.gridy = 3;
            gridBagConstraints22.gridx = 2;
            GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
            gridBagConstraints23.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints23.gridy = 2;
            gridBagConstraints23.gridx = 2;
            GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
            gridBagConstraints24.gridx = 0;
            gridBagConstraints24.gridy = 4;
            GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
            gridBagConstraints25.gridx = 0;
            gridBagConstraints25.gridy = 3;
            GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
            gridBagConstraints26.fill = 2;
            gridBagConstraints26.gridx = 1;
            gridBagConstraints26.gridy = 3;
            gridBagConstraints26.weightx = 1.0;
            gridBagConstraints26.insets = new Insets(5, 5, 5, 5);
            GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
            gridBagConstraints27.fill = 2;
            gridBagConstraints27.gridx = 1;
            gridBagConstraints27.gridy = 2;
            gridBagConstraints27.weightx = 1.0;
            gridBagConstraints27.insets = new Insets(5, 5, 5, 5);
            GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
            gridBagConstraints28.gridx = 0;
            gridBagConstraints28.gridy = 2;
            GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
            gridBagConstraints29.insets = new Insets(5, 50, 5, 50);
            gridBagConstraints29.gridy = 0;
            gridBagConstraints29.gridx = 1;
            GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
            gridBagConstraints30.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints30.gridy = 1;
            gridBagConstraints30.gridx = 0;
            this.\u00f500000 = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0};
            this.\u00f500000.setLayout(gridBagLayout);
            this.\u00f500000.add((Component)this.getJHeldenPfadTextField(), gridBagConstraints27);
            this.\u00f500000.add((Component)this.getJPluginPfadTextField(), gridBagConstraints26);
            this.\u00f500000.add((Component)this.getJHeldenButton(), gridBagConstraints23);
            this.\u00f500000.add((Component)this.getJPluginButton(), gridBagConstraints22);
            this.\u00f500000.add((Component)this.getJHintergrundButton(), gridBagConstraints21);
            GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
            gridBagConstraints31.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints31.gridx = 0;
            gridBagConstraints31.gridy = 9;
            this.\u00f500000.add((Component)this.\u00d500000(), gridBagConstraints31);
            GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
            gridBagConstraints32.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints32.fill = 2;
            gridBagConstraints32.gridx = 1;
            gridBagConstraints32.gridy = 9;
            this.\u00f500000.add((Component)this.getJDatenPfadTextField(), gridBagConstraints32);
            GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
            gridBagConstraints33.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints33.gridx = 2;
            gridBagConstraints33.gridy = 9;
            this.\u00f500000.add((Component)this.getJDatenButton(), gridBagConstraints33);
            GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
            gridBagConstraints34.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints34.gridx = 0;
            gridBagConstraints34.gridy = 10;
            this.\u00f500000.add((Component)this.getLogsLabel(), gridBagConstraints34);
            GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
            gridBagConstraints35.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints35.fill = 2;
            gridBagConstraints35.gridx = 1;
            gridBagConstraints35.gridy = 10;
            this.\u00f500000.add((Component)this.getJLogsPfadTextField(), gridBagConstraints35);
            GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
            gridBagConstraints36.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints36.gridx = 2;
            gridBagConstraints36.gridy = 10;
            this.\u00f500000.add((Component)this.getJLogButton(), gridBagConstraints36);
            this.\u00f500000.add((Component)this.\u00d400000(), gridBagConstraints20);
            this.\u00f500000.add((Component)this.oo0000, gridBagConstraints19);
            this.\u00f500000.add((Component)this.\u00d3O0000, gridBagConstraints18);
            this.\u00f500000.add((Component)this.while, gridBagConstraints17);
            this.\u00f500000.add((Component)this.oO0000, gridBagConstraints16);
            this.\u00f500000.add((Component)this.getJHintergrundPfadTextField(), gridBagConstraints15);
            this.\u00f500000.add((Component)this.OO0000, gridBagConstraints14);
            this.\u00f500000.add((Component)this.\u00f400000, gridBagConstraints13);
            this.\u00f500000.add((Component)this.getJBilderButton(), gridBagConstraints12);
            this.\u00f500000.add((Component)this.getJHilfeButton(), gridBagConstraints11);
            this.\u00f500000.add((Component)this.getJBildPfadTextField(), gridBagConstraints10);
            this.\u00f500000.add((Component)this.getJHilfePfadTextField(), gridBagConstraints9);
            this.\u00f500000.add((Component)this.\u00d500000, gridBagConstraints8);
            this.\u00f500000.add((Component)this.getJSavePfadTextField(), gridBagConstraints7);
            this.\u00f500000.add((Component)this.getJSaveButton(), gridBagConstraints6);
            this.\u00f500000.add((Component)this.\u00d5o0000, gridBagConstraints5);
            this.\u00f500000.add((Component)this.getJModsPfadTextField(), gridBagConstraints4);
            this.\u00f500000.add((Component)this.getJModsButton(), gridBagConstraints3);
            this.\u00f500000.add((Component)this.getJallButton(), gridBagConstraints2);
            this.\u00f500000.add((Component)this.getJProfiButton(), gridBagConstraints);
        }
        return this.\u00f500000;
    }

    private JLabel \u00d500000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JLabel("Weitere Daten");
        }
        return this.\u00d300000;
    }

    private void o00000() {
        this.setSize(new Dimension(767, 540));
        this.setContentPane(this.\u00d300000());
        this.setTitle("Speicherpfade anpassen");
    }
}

