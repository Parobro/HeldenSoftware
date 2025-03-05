/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.ooOO;

import helden.framework.Einstellungen;
import helden.gui.components.JTextFieldWithRangeCheckUMenu;
import helden.gui.super.OooO.ooOO.super;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OoOO
extends JDialog {
    private JPanel new;
    private JLabel \u00d5O0000;
    private JPanel \u00f800000;
    private JButton \u00f400000;
    private JButton \u00d4O0000;
    private JButton while;
    private JList \u00d400000;
    private JButton OO0000;
    private JTextField \u00d800000;
    private JPanel \u00f500000;
    private JPanel \u00d500000;
    private super return;
    private JTextFieldWithRangeCheckUMenu o00000;
    private JLabel oO0000;
    private JLabel \u00d3O0000;
    private JButton if;
    private JScrollPane \u00d300000;

    public OoOO(super super_, JDialog jDialog) {
        super(jDialog);
        this.return = super_;
        this.super();
    }

    public JTextField \u00d800000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JTextField();
            this.\u00d800000.setColumns(10);
            this.\u00d800000.addKeyListener(new KeyListener(){

                @Override
                public void keyPressed(KeyEvent keyEvent) {
                }

                @Override
                public void keyReleased(KeyEvent keyEvent) {
                    OoOO.this.return.o00000();
                }

                @Override
                public void keyTyped(KeyEvent keyEvent) {
                }
            });
        }
        return this.\u00d800000;
    }

    public JButton \u00d4O0000() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JButton("neue Variante");
            this.\u00d4O0000.addActionListener(this.return);
        }
        return this.\u00d4O0000;
    }

    public JLabel \u00d600000() {
        if (this.\u00d3O0000 == null) {
            this.\u00d3O0000 = new JLabel("Nichts gew\u00e4hlt");
        }
        return this.\u00d3O0000;
    }

    public JButton \u00d2O0000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JButton("speichern");
            this.\u00f400000.addActionListener(this.return);
        }
        return this.\u00f400000;
    }

    public JButton do() {
        if (this.OO0000 == null) {
            this.OO0000 = new JButton("Variante auf Helden anwenden");
            this.OO0000.addActionListener(this.return);
            this.OO0000.setVisible(false);
        }
        return this.OO0000;
    }

    public JButton int() {
        if (this.while == null) {
            this.while = new JButton("Variante l\u00f6schen");
            this.while.addActionListener(this.return);
        }
        return this.while;
    }

    public JList \u00f800000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JList();
            this.\u00d400000.setSelectionMode(0);
            this.\u00d400000.setCellRenderer(new helden.gui.super.OooO.super.super(40));
        }
        return this.\u00d400000;
    }

    public JTextFieldWithRangeCheckUMenu \u00f600000() {
        if (this.o00000 == null) {
            this.o00000 = new JTextFieldWithRangeCheckUMenu(300, !Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
            this.o00000.setColumns(10);
        }
        return this.o00000;
    }

    public JButton class() {
        if (this.if == null) {
            this.if = new JButton("schlie\u00dfen");
            this.if.addActionListener(this.return);
        }
        return this.if;
    }

    private JPanel \u00d200000() {
        if (this.new == null) {
            this.new = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{224, 138, 0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
            gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0};
            this.new.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 1;
            gridBagConstraints.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.new.add((Component)this.\u00f400000(), gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints2.gridx = 2;
            gridBagConstraints2.gridy = 0;
            this.new.add((Component)this.\u00d600000(), gridBagConstraints2);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.anchor = 17;
            gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy = 1;
            this.new.add((Component)this.OO0000(), gridBagConstraints3);
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints4.anchor = 13;
            gridBagConstraints4.gridx = 1;
            gridBagConstraints4.gridy = 1;
            this.new.add((Component)this.\u00d300000(), gridBagConstraints4);
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints5.fill = 2;
            gridBagConstraints5.gridx = 2;
            gridBagConstraints5.gridy = 1;
            this.new.add((Component)this.\u00f600000(), gridBagConstraints5);
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.fill = 1;
            gridBagConstraints6.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.gridy = 2;
            this.new.add((Component)this.interface(), gridBagConstraints6);
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints7.fill = 1;
            gridBagConstraints7.gridx = 1;
            gridBagConstraints7.gridy = 2;
            gridBagConstraints7.gridwidth = 2;
            this.new.add((Component)this.\u00d3O0000(), gridBagConstraints7);
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.gridwidth = 3;
            gridBagConstraints8.fill = 1;
            gridBagConstraints8.gridx = 0;
            gridBagConstraints8.gridy = 3;
            this.new.add((Component)this.\u00d400000(), gridBagConstraints8);
        }
        return this.new;
    }

    private JPanel \u00f400000() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JPanel();
            this.\u00f500000.setBorder(new TitledBorder(null, "Filter", 4, 2, null, null));
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{46, 0};
            gridBagLayout.rowHeights = new int[]{0, 0};
            gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.\u00f500000.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.\u00f500000.add((Component)this.\u00d800000(), gridBagConstraints);
        }
        return this.\u00f500000;
    }

    private JLabel OO0000() {
        if (this.\u00d5O0000 == null) {
            this.\u00d5O0000 = new JLabel("Varianten");
        }
        return this.\u00d5O0000;
    }

    private JLabel \u00d300000() {
        if (this.oO0000 == null) {
            this.oO0000 = new JLabel("Variantenname");
        }
        return this.oO0000;
    }

    private JPanel \u00d400000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JPanel();
            this.\u00f800000.setBorder(new EtchedBorder(1, null, null));
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0};
            gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.\u00f800000.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.\u00f800000.add((Component)this.int(), gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            this.\u00f800000.add((Component)this.class(), gridBagConstraints2);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints3.gridx = 2;
            gridBagConstraints3.gridy = 0;
            this.\u00f800000.add((Component)this.\u00d2O0000(), gridBagConstraints3);
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints4.gridx = 3;
            gridBagConstraints4.gridy = 0;
            this.\u00f800000.add((Component)this.\u00d4O0000(), gridBagConstraints4);
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 4;
            gridBagConstraints5.gridy = 0;
            this.\u00f800000.add((Component)this.do(), gridBagConstraints5);
        }
        return this.\u00f800000;
    }

    private JScrollPane interface() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JScrollPane();
            this.\u00d300000.setVerticalScrollBarPolicy(22);
            this.\u00d300000.setHorizontalScrollBarPolicy(31);
            this.\u00d300000.setViewportView(this.\u00f800000());
        }
        return this.\u00d300000;
    }

    private JPanel \u00d3O0000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = this.return.return().\u00f500000();
        }
        return this.\u00d500000;
    }

    private void super() {
        this.getContentPane().add((Component)this.\u00d200000(), "Center");
    }
}

