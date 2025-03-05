/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.held.object.oooo_1;
import helden.framework.oooo.b_0;
import helden.gui.super.B;
import helden.gui.super.F;
import helden.gui.super.float;
import helden.gui.super.super;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class null
extends F
implements float {
    private GridBagLayout \u00f6\u00f40000;
    private GridBagConstraints[] o\u00f50000 = new GridBagConstraints[8];
    private Map<String, JTextField> \u00f4\u00f40000;
    private Map<String, JLabel> voidreturn;
    private Map<String, JButton> \u00f5\u00f40000;
    private B \u00d6\u00f40000;
    private Map<b_0, JCheckBox> O\u00f50000;
    private JComboBox floatreturn;

    public null(super super_) {
        this.\u00d6\u00f40000 = new B(this, super_);
        this.\u00f6\u00f40000 = new GridBagLayout();
        this.\u00f4\u00f40000 = new HashMap<String, JTextField>();
        this.voidreturn = new HashMap<String, JLabel>();
        this.\u00f5\u00f40000 = new HashMap<String, JButton>();
        this.O\u00f50000 = new HashMap<b_0, JCheckBox>();
        this.\u00d4\u00d40000();
        this.setLayout(this.\u00f6\u00f40000);
        this.o00000(b_0.whilewhilesuper, true, 0, true, true);
        this.o00000(b_0.newwhilesuper, true, 1, true, true);
        this.o00000(b_0.\u00f8\u00f4\u00d2000, true, 2, true, true);
        this.o00000(b_0.\u00d5\u00f4\u00d2000, true, 3, true, true);
        this.o00000(b_0.O\u00f5\u00d2000, true, 4, true, true);
        this.o00000(b_0.\u00f4\u00f4\u00d2000, true, 5, true, true);
        this.o00000(b_0.returnwhilesuper, true, 6, true, true);
        this.o00000(b_0.privatedosuper, true, 7, true, true);
        this.o00000(b_0.\u00d8\u00f5\u00d2000, true, 8, true, true);
        this.o\u00f50000[0].insets.top = 30;
        this.o\u00f50000[1].insets.top = 30;
        this.o\u00f50000[1].gridwidth = 1;
        this.o\u00f50000[2].insets.top = 30;
        this.o\u00f50000[3].insets.top = 30;
        this.o\u00f50000[4].insets.top = 30;
        this.o\u00f50000[0].insets.top = 3;
        this.o\u00f50000[1].insets.top = 3;
        this.o\u00f50000[2].insets.top = 3;
        this.o\u00f50000[3].insets.top = 3;
        this.o\u00f50000[4].insets.top = 3;
        this.o00000(b_0.\u00d3\u00f4\u00d2000, true, 9, true, true);
        this.o00000(b_0.thispublicsuper, true, 10, true, true);
        this.o00000(b_0.\u00f4\u00f5\u00d2000, true, 11, true, true);
        this.\u00d200000(b_0.\u00f4\u00f5\u00d2000, true, 12, true, true);
        this.o00000(b_0.\u00d4\u00f5\u00d2000, true, 13, false, false);
        this.o\u00f50000[1].gridwidth = 1;
        this.o00000(b_0.\u00f8\u00d8\u00d2000, false, 0, false, false);
        this.o00000(b_0.ifwhilesuper, false, 1, false, false);
        this.o00000(b_0.\u00f5\u00f4\u00d2000, false, 2, false, false);
        this.o00000(b_0.\u00f4\u00d8\u00d2000, false, 3, false, false);
        this.o\u00f50000[5].insets.top = 30;
        this.o\u00f50000[6].insets.top = 30;
        this.o00000(b_0.\u00f5\u00f5\u00d2000, false, 8, true, false);
        this.o\u00f50000[5].insets.top = 3;
        this.o\u00f50000[6].insets.top = 3;
        this.o00000(10);
    }

    public void o00000(int n) {
        int n2 = 5;
        JLabel jLabel = new JLabel("Gildenzugeh\u00f6rigkeit:");
        this.o\u00f50000[0 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jLabel, this.o\u00f50000[0 + n2]);
        this.o00000(jLabel);
        JComboBox jComboBox = this.\u00d6\u00d40000();
        this.o\u00f50000[1 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jComboBox, this.o\u00f50000[1 + n2]);
        this.o00000(jComboBox);
    }

    public JComboBox \u00d6\u00d40000() {
        if (this.floatreturn == null) {
            this.floatreturn = new JComboBox();
            this.floatreturn.addItem("keine");
            this.floatreturn.addItem("wei\u00df");
            this.floatreturn.addItem("grau");
            this.floatreturn.addItem("schwarz");
            this.floatreturn.addActionListener(this.\u00d6\u00f40000);
        }
        return this.floatreturn;
    }

    public JTextField \u00d5\u00d40000() {
        return this.o00000(b_0.\u00f5\u00f5\u00d2000, false);
    }

    @Override
    public void o00000(oooo_1 oooo_12) {
        this.\u00d6\u00f40000.o00000(oooo_12);
        this.o00000(b_0.whilewhilesuper, oooo_12);
        this.o00000(b_0.newwhilesuper, oooo_12);
        this.o00000(b_0.\u00f8\u00f4\u00d2000, oooo_12);
        this.o00000(b_0.\u00d5\u00f4\u00d2000, oooo_12);
        this.o00000(b_0.O\u00f5\u00d2000, oooo_12);
        this.o00000(b_0.\u00f4\u00f4\u00d2000, oooo_12);
        this.o00000(b_0.returnwhilesuper, oooo_12);
        this.o00000(b_0.privatedosuper, oooo_12);
        this.o00000(b_0.\u00f5\u00f5\u00d2000, oooo_12);
        this.o00000(b_0.\u00d3\u00f4\u00d2000, oooo_12);
        this.o00000(b_0.thispublicsuper, oooo_12);
        this.o00000(b_0.\u00f8\u00d8\u00d2000, oooo_12);
        this.o00000(b_0.ifwhilesuper, oooo_12);
        this.o00000(b_0.\u00f5\u00f4\u00d2000, oooo_12);
        this.o00000(b_0.\u00f4\u00d8\u00d2000, oooo_12);
        this.o00000(b_0.\u00d8\u00f5\u00d2000, oooo_12);
        if (oooo_12.\u00d800000().oo0000()) {
            this.o00000(b_0.\u00f4\u00f5\u00d2000, oooo_12);
            this.O\u00f50000.get(b_0.\u00f4\u00f5\u00d2000).setEnabled(true);
            int n = oooo_12.\u00d800000().\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000);
            this.intObject().setEnabled(n == 0);
        } else {
            this.intObject().setEnabled(false);
            this.o00000(b_0.\u00f4\u00f5\u00d2000, false).setText("");
            this.\u00d200000(b_0.\u00f4\u00f5\u00d2000, false).setText("");
            this.O\u00f50000.get(b_0.\u00f4\u00f5\u00d2000).setEnabled(false);
            this.O\u00f50000.get(b_0.\u00f4\u00f5\u00d2000).setSelected(false);
        }
        if (oooo_12.\u00d800000().\u00d8\u00d20000()) {
            this.o00000(b_0.\u00d4\u00f5\u00d2000, oooo_12);
        } else {
            this.o00000(b_0.\u00d4\u00f5\u00d2000, false).setText("");
        }
        if (oooo_12.\u00d800000().\u00d800000().hatProfession(Magier.class) != null || oooo_12.\u00d800000().\u00d800000().hatProfession(Lehrmeister.class) != null) {
            if (oooo_12.\u00d800000().returnnew() != null) {
                this.\u00d6\u00d40000().setSelectedItem(oooo_12.\u00d800000().returnnew());
            } else {
                this.\u00d6\u00d40000().setSelectedIndex(0);
            }
            this.\u00d6\u00d40000().setEnabled(true);
        } else {
            this.\u00d6\u00d40000().setSelectedItem(null);
            this.\u00d6\u00d40000().setEnabled(false);
        }
    }

    public void o00000(b_0 b_02, oooo_1 oooo_12) {
        AbstractButton abstractButton;
        Object object;
        if (b_0.\u00f4\u00d8\u00d2000.equals(b_02)) {
            oooo_12.\u00d800000().OO0000().String(oooo_12.\u00d800000());
            this.o00000(b_02, false).setText("" + oooo_12.\u00d800000().OO0000().private());
        } else {
            this.o00000(b_02, false).setText("" + oooo_12.\u00d800000().o00000(b_02));
        }
        JLabel jLabel = this.\u00d200000(b_02, false);
        if (jLabel != null && b_02.floatString()) {
            jLabel.setText(oooo_12.String(b_02) + " AP");
            object = this.\u00f5\u00f40000.get(b_02.toString());
            if (oooo_12.\u00d800000().\u00d3\u00d30000().\u00d4O0000(b_02)) {
                ((AbstractButton)object).setEnabled(false);
                ((JComponent)object).setToolTipText("Maximum erreicht");
            } else {
                ((AbstractButton)object).setEnabled(true);
                ((JComponent)object).setToolTipText("");
            }
            abstractButton = this.O\u00f50000.get(b_02);
            if (abstractButton != null) {
                abstractButton.setSelected(oooo_12.\u00d800000().\u00d3\u00d30000().\u00d400000(b_02));
            }
        }
        if (this.\u00f4\u00f40000.get(object = b_02.toString() + "-permanent") != null) {
            jLabel = this.\u00d200000(b_02, true);
            this.o00000(b_02, true).setText("");
            jLabel.setText("");
            abstractButton = this.\u00f5\u00f40000.get(object);
            abstractButton.setEnabled(false);
            int n = oooo_12.\u00d800000().\u00d3\u00d30000().super(b_02);
            if (n < 0) {
                abstractButton.setEnabled(true);
                this.intObject().setEnabled(false);
                jLabel.setText(oooo_12.\u00d200000(b_02) + " AP");
            } else {
                this.intObject().setEnabled(true);
            }
            if (n != 0) {
                this.o00000(b_02, true).setText("" + n);
            }
        }
        if (!oooo_12.\u00d800000().oo0000()) {
            this.intObject().setEnabled(false);
            this.o00000(b_0.\u00f4\u00f5\u00d2000, false).setText("");
            this.\u00d200000(b_0.\u00f4\u00f5\u00d2000, false).setText("");
            this.O\u00f50000.get(b_0.\u00f4\u00f5\u00d2000).setEnabled(false);
            this.O\u00f50000.get(b_0.\u00f4\u00f5\u00d2000).setSelected(false);
        }
        if (!oooo_12.\u00d800000().\u00d8\u00d20000()) {
            this.o00000(b_0.\u00d4\u00f5\u00d2000, false).setText("");
        }
    }

    private void o00000(b_0 b_02, boolean bl, int n, boolean bl2, boolean bl3) {
        int n2 = 0;
        if (!bl) {
            n2 = 5;
        }
        JLabel jLabel = new JLabel(b_02.toString() + ":");
        this.o\u00f50000[0 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jLabel, this.o\u00f50000[0 + n2]);
        this.o00000(jLabel);
        JTextField jTextField = this.o00000(b_02, false);
        this.o\u00f50000[1 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jTextField, this.o\u00f50000[1 + n2]);
        this.o00000(jTextField);
        if (bl2 && bl) {
            JComponent jComponent;
            JComponent jComponent2;
            if (bl3) {
                jComponent2 = new JPanel();
                jComponent2.add(new JLabel("SE:"));
                jComponent = new JCheckBox();
                jComponent.setName(b_02.toString());
                ((AbstractButton)jComponent).addChangeListener(this.\u00d6\u00f40000);
                this.O\u00f50000.put(b_02, (JCheckBox)jComponent);
                jComponent2.add(jComponent);
                this.o\u00f50000[2 + n2].gridy = n;
                this.\u00f6\u00f40000.setConstraints(jComponent2, this.o\u00f50000[2 + n2]);
                this.o00000(jComponent2);
                if (b_02.equals(b_0.\u00f4\u00f5\u00d2000) || b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.thispublicsuper)) {
                    jComponent.setToolTipText("Inoffiziel");
                }
            }
            jComponent2 = new JButton("Steigern");
            jComponent2.setName(b_02.toString());
            this.\u00f5\u00f40000.put(b_02.toString(), (JButton)jComponent2);
            ((AbstractButton)jComponent2).addActionListener(this.\u00d6\u00f40000);
            this.o\u00f50000[3 + n2].gridy = n;
            this.\u00f6\u00f40000.setConstraints(jComponent2, this.o\u00f50000[3 + n2]);
            this.o00000(jComponent2);
            jComponent = this.\u00d200000(b_02, false);
            this.o\u00f50000[4 + n2].gridy = n;
            this.\u00f6\u00f40000.setConstraints(jComponent, this.o\u00f50000[4 + n2]);
            this.o00000(jComponent);
        }
        if (bl2 && !bl) {
            jTextField.setEditable(true);
            jTextField.addActionListener(this.\u00d6\u00f40000);
            jTextField.addFocusListener(this.\u00d6\u00f40000);
        }
    }

    private void \u00d200000(b_0 b_02, boolean bl, int n, boolean bl2, boolean bl3) {
        int n2 = 0;
        if (!bl) {
            n2 = 5;
        }
        JTextField jTextField = this.o00000(b_02, true);
        this.o\u00f50000[1 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jTextField, this.o\u00f50000[1 + n2]);
        this.o00000(jTextField);
        JButton jButton = new JButton("Zur\u00fcckkaufen");
        String string = b_02.toString() + "-permanent";
        jButton.setName(string);
        this.\u00f5\u00f40000.put(string, jButton);
        jButton.addActionListener(this.\u00d6\u00f40000);
        this.o\u00f50000[3 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jButton, this.o\u00f50000[3 + n2]);
        this.o00000(jButton);
        JLabel jLabel = this.\u00d200000(b_02, true);
        this.o\u00f50000[4 + n2].gridy = n;
        this.\u00f6\u00f40000.setConstraints(jLabel, this.o\u00f50000[4 + n2]);
        this.o00000(jLabel);
    }

    private JLabel \u00d200000(b_0 b_02, boolean bl) {
        JLabel jLabel;
        String string = b_02.toString();
        if (bl) {
            string = string + "-permanent";
        }
        if ((jLabel = this.voidreturn.get(string)) == null) {
            jLabel = new JLabel();
            jLabel.setName(b_02.toString());
            this.voidreturn.put(string, jLabel);
        }
        return jLabel;
    }

    private JButton intObject() {
        return this.\u00f5\u00f40000.get(b_0.\u00f4\u00f5\u00d2000.toString());
    }

    private JTextField o00000(b_0 b_02, boolean bl) {
        JTextField jTextField;
        String string = b_02.toString();
        if (bl) {
            string = string + "-permanent";
        }
        if ((jTextField = this.\u00f4\u00f40000.get(string)) == null) {
            jTextField = new JTextField();
            jTextField.setName(string);
            jTextField.setEditable(false);
            this.\u00f4\u00f40000.put(string, jTextField);
        }
        return jTextField;
    }

    private void \u00d4\u00d40000() {
        this.o\u00f50000[0] = new GridBagConstraints();
        this.o\u00f50000[0].weightx = 0.0;
        this.o\u00f50000[0].gridx = 0;
        this.o\u00f50000[0].anchor = 17;
        this.o\u00f50000[0].insets.top = 3;
        this.o\u00f50000[0].insets.bottom = 2;
        this.o\u00f50000[0].insets.right = 5;
        this.o\u00f50000[0].insets.left = 10;
        this.o\u00f50000[1] = new GridBagConstraints();
        this.o\u00f50000[1].weightx = 0.2;
        this.o\u00f50000[1].gridx = 1;
        this.o\u00f50000[1].fill = 2;
        this.o\u00f50000[1].insets.top = 3;
        this.o\u00f50000[1].insets.bottom = 2;
        this.o\u00f50000[1].insets.right = 5;
        this.o\u00f50000[2] = new GridBagConstraints();
        this.o\u00f50000[2].weightx = 0.0;
        this.o\u00f50000[2].gridx = 2;
        this.o\u00f50000[2].anchor = 17;
        this.o\u00f50000[2].insets.top = 3;
        this.o\u00f50000[2].insets.bottom = 2;
        this.o\u00f50000[2].insets.right = 0;
        this.o\u00f50000[3] = new GridBagConstraints();
        this.o\u00f50000[3].weightx = 0.0;
        this.o\u00f50000[3].gridx = 3;
        this.o\u00f50000[3].fill = 2;
        this.o\u00f50000[3].insets.top = 3;
        this.o\u00f50000[3].insets.bottom = 2;
        this.o\u00f50000[3].insets.right = 5;
        this.o\u00f50000[4] = new GridBagConstraints();
        this.o\u00f50000[4].weightx = 0.0;
        this.o\u00f50000[4].gridx = 4;
        this.o\u00f50000[4].fill = 13;
        this.o\u00f50000[4].insets.top = 3;
        this.o\u00f50000[4].insets.bottom = 2;
        this.o\u00f50000[4].insets.right = 40;
        this.o\u00f50000[5] = new GridBagConstraints();
        this.o\u00f50000[5].weightx = 0.0;
        this.o\u00f50000[5].gridx = 5;
        this.o\u00f50000[5].anchor = 17;
        this.o\u00f50000[5].insets.top = 3;
        this.o\u00f50000[5].insets.bottom = 2;
        this.o\u00f50000[5].insets.right = 5;
        this.o\u00f50000[5].insets.left = 0;
        this.o\u00f50000[6] = new GridBagConstraints();
        this.o\u00f50000[6].weightx = 0.2;
        this.o\u00f50000[6].gridx = 6;
        this.o\u00f50000[6].fill = 2;
        this.o\u00f50000[6].insets.top = 3;
        this.o\u00f50000[6].insets.bottom = 2;
        this.o\u00f50000[6].insets.right = 5;
    }
}

