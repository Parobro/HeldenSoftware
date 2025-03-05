/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.Einstellungen;
import helden.framework.held.object.oooo_1;
import helden.gui.A;
import helden.gui.super.F;
import helden.gui.super.I;
import helden.gui.super.float;
import helden.gui.super.oOoO.B.String;
import helden.gui.super.super.class;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class oOoO
extends F
implements float {
    private static final Dimension o\u00f40000 = new Dimension(200, 20);
    private JTextField \u00d4\u00f40000;
    private JTextField \u00d6\u00d60000;
    private JTextField O\u00d80000;
    private JTextField \u00f5\u00d80000;
    private JTextField publicString;
    private JTextField \u00d4\u00d80000;
    private JTextField O\u00d60000;
    private JTextField \u00d4\u00d60000;
    private JTextField \u00d2\u00f40000;
    private JTextField \u00d2\u00d60000;
    private JTextField O\u00f40000;
    private JTextField superclass;
    private JTextField \u00d6\u00d80000;
    private JTextField o\u00d60000;
    private JTextField \u00d5\u00f40000;
    private class classclass;
    private String \u00d5\u00d60000;
    private GridBagConstraints \u00f6\u00d60000;
    private GridBagConstraints doclass;
    private GridBagConstraints \u00f6\u00d80000;
    private GridBagConstraints floatString;
    private GridBagConstraints o\u00d80000;
    private GridBagConstraints \u00f4\u00d80000;
    private GridBagConstraints intclass;
    private GridBagConstraints \u00d2\u00d80000;
    private I \u00d5\u00d80000;
    private GridBagLayout interfaceclass;
    private JPanel \u00f5\u00d60000;
    private A Objectreturn;
    private JTextField \u00f4\u00d60000;

    public oOoO(A a2) {
        this.Objectreturn = a2;
        this.\u00d5\u00d80000 = new I(this);
        this.setLayout(new BorderLayout());
        this.\u00f5\u00d60000 = new JPanel();
        this.interfaceclass = new GridBagLayout();
        this.\u00f5\u00d60000.setLayout(this.interfaceclass);
        this.O\u00d30000();
        this.\u00f5\u00d60000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JLabel jLabel = new JLabel("Name:");
        this.\u00f6\u00d60000.gridy = 0;
        this.interfaceclass.setConstraints(jLabel, this.\u00f6\u00d60000);
        this.\u00f5\u00d60000.add(jLabel);
        JTextField jTextField = this.O\u00d40000();
        this.\u00f6\u00d80000.gridy = 0;
        this.interfaceclass.setConstraints(jTextField, this.\u00f6\u00d80000);
        this.\u00f5\u00d60000.add(jTextField);
        jLabel = new JLabel("Rasse:");
        this.\u00f6\u00d60000.gridy = 1;
        this.interfaceclass.setConstraints(jLabel, this.\u00f6\u00d60000);
        this.\u00f5\u00d60000.add(jLabel);
        jTextField = this.o\u00d30000();
        this.\u00f6\u00d80000.gridy = 1;
        this.interfaceclass.setConstraints(jTextField, this.\u00f6\u00d80000);
        this.\u00f5\u00d60000.add(jTextField);
        jLabel = new JLabel("Kultur:");
        this.\u00f6\u00d60000.gridy = 2;
        this.interfaceclass.setConstraints(jLabel, this.\u00f6\u00d60000);
        this.\u00f5\u00d60000.add(jLabel);
        jTextField = this.\u00f5\u00d20000();
        this.\u00f6\u00d80000.gridy = 2;
        this.interfaceclass.setConstraints(jTextField, this.\u00f6\u00d80000);
        this.\u00f5\u00d60000.add(jTextField);
        jLabel = new JLabel("Profession:");
        this.\u00f6\u00d60000.gridy = 3;
        this.interfaceclass.setConstraints(jLabel, this.\u00f6\u00d60000);
        this.\u00f5\u00d60000.add(jLabel);
        jTextField = this.\u00f5\u00d30000();
        this.\u00f6\u00d80000.gridy = 3;
        this.interfaceclass.setConstraints(jTextField, this.\u00f6\u00d80000);
        this.\u00f5\u00d60000.add(jTextField);
        this.o00000(1, 5, "Abenteuerpunkte:", this.classObject(), "Abenteuerpunkte k\u00f6nnen auch \u00fcber 'Steigern/Ereignis hinzuf\u00fcgen' ge\u00e4ndert werden.");
        this.o00000(2, 5, "Stufe (DSA 4.0):", this.\u00f6\u00d30000());
        this.o00000(3, 5, "Geburtsdatum:", this.\u00d5\u00d30000());
        this.o00000(1, 6, "AP Guthaben:", this.\u00f6\u00d20000());
        this.o00000(2, 6, "Stufe (DSA 4.1):", this.floatnew());
        this.o00000(3, 6, "Alter:", this.\u00f4\u00d30000(), "Das Alter kann unter 'Bearbeiten/Angaben bearbeiten' ver\u00e4ndert werden.");
        this.o00000(1, 7, "Geschlecht:", this.\u00d4\u00d30000());
        this.o00000(2, 7, "Gr\u00f6\u00dfe:", this.o\u00d40000());
        this.o00000(3, 7, "Gewicht:", this.\u00d2\u00d30000());
        this.o00000(1, 8, "Haarfarbe:", this.\u00d2\u00d40000());
        this.o00000(2, 8, "Augenfarbe:", this.superObject());
        this.o00000(3, 8, "RS-Berechnung:", this.\u00f4\u00d20000());
        class clazz = this.\u00d6\u00d30000();
        String string = this.publicnew();
        this.\u00d2\u00d80000.gridy = 9;
        this.\u00d2\u00d80000.insets.top = 22;
        JSplitPane jSplitPane = new JSplitPane(1, clazz, string);
        jSplitPane.setDividerLocation(300);
        this.\u00d2\u00d80000.gridy = 9;
        this.\u00d2\u00d80000.insets.top = 22;
        this.interfaceclass.setConstraints(jSplitPane, this.\u00d2\u00d80000);
        this.\u00f5\u00d60000.add(jSplitPane);
        this.o00000(this.\u00f5\u00d60000, "Center");
    }

    public JTextField classObject() {
        if (this.superclass == null) {
            this.superclass = new JTextField();
            this.superclass.setName("Abenteuerpunkte-Field");
            this.superclass.addFocusListener(this.\u00d5\u00d80000);
            this.superclass.addActionListener(this.\u00d5\u00d80000);
            this.superclass.setToolTipText("Abenteuerpunkte k\u00f6nnen auch \u00fcber 'Steigern/Ereignisse hinzuf\u00fcgen' eingeben werden");
        }
        return this.superclass;
    }

    public JTextField \u00f4\u00d30000() {
        if (this.\u00d2\u00d60000 == null) {
            this.\u00d2\u00d60000 = new JTextField();
            this.\u00d2\u00d60000.setName("alter-Field");
            this.\u00d2\u00d60000.setEditable(false);
        }
        return this.\u00d2\u00d60000;
    }

    public JTextField \u00f6\u00d20000() {
        if (this.\u00d6\u00d80000 == null) {
            this.\u00d6\u00d80000 = new JTextField();
            this.\u00d6\u00d80000.setName("APGuthaben-Field");
            this.\u00d6\u00d80000.setEditable(false);
        }
        return this.\u00d6\u00d80000;
    }

    public JTextField \u00d5\u00d30000() {
        if (this.\u00d2\u00f40000 == null) {
            this.\u00d2\u00f40000 = new JTextField();
            this.\u00d2\u00f40000.setName("Geburtsdatum-Field");
            this.\u00d2\u00f40000.setEditable(false);
        }
        return this.\u00d2\u00f40000;
    }

    public JTextField O\u00d40000() {
        if (this.\u00d4\u00f40000 == null) {
            this.\u00d4\u00f40000 = new JTextField();
            this.\u00d4\u00f40000.setName("Name-Field");
            this.\u00d4\u00f40000.setEditable(true);
            this.\u00d4\u00f40000.setMaximumSize(o\u00f40000);
            this.\u00d4\u00f40000.addFocusListener(this.\u00d5\u00d80000);
            this.\u00d4\u00f40000.addActionListener(this.\u00d5\u00d80000);
        }
        return this.\u00d4\u00f40000;
    }

    public JTextField \u00f6\u00d30000() {
        if (this.o\u00d60000 == null) {
            this.o\u00d60000 = new JTextField();
            this.o\u00d60000.setName("Stufe-Field");
            this.o\u00d60000.setEditable(false);
        }
        return this.o\u00d60000;
    }

    public JTextField floatnew() {
        if (this.\u00d5\u00f40000 == null) {
            this.\u00d5\u00f40000 = new JTextField();
            this.\u00d5\u00f40000.setName("Stufe-Field");
            this.\u00d5\u00f40000.setEditable(false);
        }
        return this.\u00d5\u00f40000;
    }

    public void o00000(int n, int n2, java.lang.String string, JTextField jTextField) {
        this.o00000(n, n2, string, jTextField, "");
    }

    public void o00000(int n, int n2, java.lang.String string, JTextField jTextField, java.lang.String string2) {
        GridBagConstraints gridBagConstraints = null;
        GridBagConstraints gridBagConstraints2 = null;
        switch (n) {
            case 1: {
                gridBagConstraints = this.\u00f6\u00d60000;
                gridBagConstraints2 = this.floatString;
                break;
            }
            case 2: {
                gridBagConstraints = this.doclass;
                gridBagConstraints2 = this.o\u00d80000;
                break;
            }
            case 3: {
                gridBagConstraints = this.\u00f4\u00d80000;
                gridBagConstraints2 = this.intclass;
                break;
            }
            default: {
                return;
            }
        }
        gridBagConstraints.insets.top = 2;
        gridBagConstraints2.insets.top = 2;
        if (n2 == 5) {
            gridBagConstraints.insets.top = 22;
            gridBagConstraints2.insets.top = 22;
        }
        JLabel jLabel = new JLabel(string);
        jLabel.setToolTipText(string2);
        gridBagConstraints.gridy = n2;
        this.interfaceclass.setConstraints(jLabel, gridBagConstraints);
        this.\u00f5\u00d60000.add(jLabel);
        gridBagConstraints2.gridy = n2;
        jTextField.setToolTipText(string2);
        this.interfaceclass.setConstraints(jTextField, gridBagConstraints2);
        this.\u00f5\u00d60000.add(jTextField);
    }

    @Override
    public void o00000(oooo_1 oooo_12) {
        this.\u00d5\u00d80000.o00000(oooo_12);
        this.O\u00d40000().setText(oooo_12.\u00d800000().\u00f5o0000());
        this.\u00d4\u00d30000().setText(oooo_12.\u00d800000().\u00d300000().toString());
        this.\u00d5\u00d30000().setText(oooo_12.\u00d800000().thissuper().super().toString());
        this.\u00f4\u00d30000().setText(oooo_12.\u00d800000().thissuper().\u00d200000() + " Jahre");
        this.o\u00d30000().setText(oooo_12.\u00d800000().o\u00d20000().toString());
        int n = oooo_12.\u00d800000().thissuper().getGroesse() / 100;
        int n2 = oooo_12.\u00d800000().thissuper().getGroesse() % 100;
        if (n2 > 9) {
            this.o\u00d40000().setText(n + "." + n2 + " Schritt");
        } else {
            this.o\u00d40000().setText(n + ".0" + n2 + " Schritt");
        }
        this.\u00d2\u00d40000().setText(oooo_12.\u00d800000().thissuper().getHaarFarbe());
        this.\u00f5\u00d20000().setText(oooo_12.\u00d800000().\u00f800000().toString());
        this.\u00d2\u00d30000().setText("" + oooo_12.\u00d800000().thissuper().getGewicht(oooo_12.\u00d800000().o00000(helden.framework.C.I.\u00f8\u00d2o000)) + " Stein");
        this.superObject().setText(oooo_12.\u00d800000().thissuper().getAugenFarbe());
        this.\u00f5\u00d30000().setText(oooo_12.\u00d800000().\u00d800000().toString());
        this.classObject().setText("" + oooo_12.\u00d800000().o\u00d30000());
        this.\u00f6\u00d20000().setText("" + oooo_12.\u00d800000().\u00d400000());
        this.\u00f6\u00d30000().setText("" + oooo_12.\u00d800000().\u00d4\u00d30000());
        this.floatnew().setText("" + oooo_12.\u00d800000().\u00d5\u00d30000());
        this.\u00d6\u00d30000().o00000(oooo_12.\u00d800000());
        this.publicnew().o00000(oooo_12);
        if (Einstellungen.getInstance().getSeitenEinstellungen(oooo_12.\u00d800000().\u00f4o0000()).isZonenRuestung()) {
            this.\u00f4\u00d20000().setText("Zonen");
        } else {
            this.\u00f4\u00d20000().setText("Einfach");
        }
    }

    private JTextField superObject() {
        if (this.O\u00d60000 == null) {
            this.O\u00d60000 = new JTextField();
            this.O\u00d60000.setName("AugenFarbe-Field");
            this.O\u00d60000.setEditable(false);
        }
        return this.O\u00d60000;
    }

    private JTextField \u00d4\u00d30000() {
        if (this.\u00d6\u00d60000 == null) {
            this.\u00d6\u00d60000 = new JTextField();
            this.\u00d6\u00d60000.setName("Geschlecht-Field");
            this.\u00d6\u00d60000.setEditable(false);
            this.\u00d6\u00d60000.setMaximumSize(o\u00f40000);
        }
        return this.\u00d6\u00d60000;
    }

    private JTextField \u00d2\u00d30000() {
        if (this.\u00d4\u00d80000 == null) {
            this.\u00d4\u00d80000 = new JTextField();
            this.\u00d4\u00d80000.setName("Gewicht-Field");
            this.\u00d4\u00d80000.setEditable(false);
        }
        return this.\u00d4\u00d80000;
    }

    private JTextField o\u00d40000() {
        if (this.\u00f5\u00d80000 == null) {
            this.\u00f5\u00d80000 = new JTextField();
            this.\u00f5\u00d80000.setName("Groesse-Field");
            this.\u00f5\u00d80000.setEditable(false);
        }
        return this.\u00f5\u00d80000;
    }

    private JTextField \u00d2\u00d40000() {
        if (this.\u00d4\u00d60000 == null) {
            this.\u00d4\u00d60000 = new JTextField();
            this.\u00d4\u00d60000.setName("HaarFarbe-Field");
            this.\u00d4\u00d60000.setEditable(false);
        }
        return this.\u00d4\u00d60000;
    }

    private JTextField \u00f5\u00d20000() {
        if (this.publicString == null) {
            this.publicString = new JTextField();
            this.publicString.setName("Kultur-Field");
            this.publicString.setEditable(false);
        }
        return this.publicString;
    }

    private JTextField \u00f5\u00d30000() {
        if (this.O\u00f40000 == null) {
            this.O\u00f40000 = new JTextField();
            this.O\u00f40000.setName("Profession-Field");
            this.O\u00f40000.setEditable(false);
        }
        return this.O\u00f40000;
    }

    private JTextField o\u00d30000() {
        if (this.O\u00d80000 == null) {
            this.O\u00d80000 = new JTextField();
            this.O\u00d80000.setName("Rasse-Field");
            this.O\u00d80000.setEditable(false);
        }
        return this.O\u00d80000;
    }

    private JTextField \u00f4\u00d20000() {
        if (this.\u00f4\u00d60000 == null) {
            this.\u00f4\u00d60000 = new JTextField();
            this.\u00f4\u00d60000.setName("getRSberchnungField");
            this.\u00f4\u00d60000.setEditable(false);
        }
        return this.\u00f4\u00d60000;
    }

    private String publicnew() {
        if (this.\u00d5\u00d60000 == null) {
            this.\u00d5\u00d60000 = new String(this.Objectreturn);
        }
        return this.\u00d5\u00d60000;
    }

    private class \u00d6\u00d30000() {
        if (this.classclass == null) {
            this.classclass = new class(this.Objectreturn);
        }
        return this.classclass;
    }

    private void O\u00d30000() {
        Insets insets = new Insets(2, 0, 3, 5);
        this.\u00f6\u00d80000 = new GridBagConstraints();
        this.\u00f6\u00d80000.weightx = 1.0;
        this.\u00f6\u00d80000.gridx = 1;
        this.\u00f6\u00d80000.gridwidth = 6;
        this.\u00f6\u00d80000.fill = 2;
        this.\u00f6\u00d80000.insets = insets;
        this.\u00f6\u00d60000 = new GridBagConstraints();
        this.\u00f6\u00d60000.weightx = 0.0;
        this.\u00f6\u00d60000.gridx = 0;
        this.\u00f6\u00d60000.anchor = 17;
        this.\u00f6\u00d60000.insets = insets;
        this.floatString = new GridBagConstraints();
        this.floatString.weightx = 0.2;
        this.floatString.gridx = 1;
        this.floatString.fill = 2;
        this.floatString.insets = insets;
        this.doclass = new GridBagConstraints();
        this.doclass.weightx = 0.0;
        this.doclass.gridx = 2;
        this.doclass.anchor = 17;
        this.doclass.insets = insets;
        this.o\u00d80000 = new GridBagConstraints();
        this.o\u00d80000.weightx = 0.2;
        this.o\u00d80000.gridx = 3;
        this.o\u00d80000.fill = 2;
        this.o\u00d80000.insets = insets;
        this.\u00f4\u00d80000 = new GridBagConstraints();
        this.\u00f4\u00d80000.weightx = 0.0;
        this.\u00f4\u00d80000.gridx = 4;
        this.\u00f4\u00d80000.anchor = 17;
        this.\u00f4\u00d80000.insets = insets;
        this.intclass = new GridBagConstraints();
        this.intclass.weightx = 0.2;
        this.intclass.gridx = 5;
        this.intclass.fill = 2;
        this.intclass.insets = insets;
        this.\u00d2\u00d80000 = new GridBagConstraints();
        this.\u00d2\u00d80000.weightx = 1.0;
        this.\u00d2\u00d80000.weighty = 1.0;
        this.\u00d2\u00d80000.gridwidth = 6;
        this.\u00d2\u00d80000.gridheight = 2;
        this.\u00d2\u00d80000.gridx = 0;
        this.\u00d2\u00d80000.fill = 1;
        this.\u00d2\u00d80000.insets = insets;
    }
}

