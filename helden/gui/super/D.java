/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.D.P;
import helden.framework.Einstellungen;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.b_0;
import helden.gui.super.C;
import helden.gui.super.F;
import helden.gui.super.float;
import helden.gui.super.super;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
extends F
implements float {
    private static final long \u00d2\u00d40000 = -5887672700544943092L;
    private GridBagLayout \u00f4\u00d40000;
    private GridBagConstraints[] \u00d5\u00d40000 = new GridBagConstraints[10];
    private C doObject;
    private int \u00f6\u00d40000;
    private Map<voidsuper, JTextField> \u00d4\u00d40000;
    private Map<voidsuper, JTextField> o\u00d40000;
    private Map<voidsuper, JLabel> intObject;
    private Map<P, JComboBox> O\u00d40000;
    private Map<JButton, E> classObject = new HashMap<JButton, E>();
    private Map<String, JButton> \u00d6\u00d40000;
    private Map<JComboBox, P> \u00f5\u00d40000;

    public D(super super_) {
        this.O\u00d40000 = new HashMap<P, JComboBox>();
        this.\u00f5\u00d40000 = new HashMap<JComboBox, P>();
        this.doObject = new C(this, super_);
        this.\u00f4\u00d40000 = new GridBagLayout();
        this.O\u00d20000();
        this.setLayout(this.\u00f4\u00d40000);
        this.interfacesuper();
    }

    public void o00000(E e) {
        JComponent jComponent;
        JLabel jLabel = new JLabel(e.toString() + ":");
        this.\u00d5\u00d40000[0].gridy = this.\u00f6\u00d40000;
        this.\u00f4\u00d40000.setConstraints(jLabel, this.\u00d5\u00d40000[0]);
        this.o00000(jLabel);
        if (!e.classclass()) {
            jComponent = new JLabel("AT:");
            this.\u00d5\u00d40000[1].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jComponent, this.\u00d5\u00d40000[1]);
            this.o00000(jComponent);
        }
        jComponent = this.\u00d200000(e);
        this.\u00d5\u00d40000[2].gridy = this.\u00f6\u00d40000;
        this.\u00f4\u00d40000.setConstraints(jComponent, this.\u00d5\u00d40000[2]);
        this.o00000(jComponent);
        if (e.o\u00d80000()) {
            JButton jButton = new JButton("+1");
            jButton.setName("A:" + e.toString());
            jButton.addActionListener(this.doObject);
            this.classObject.put(jButton, e);
            this.\u00d5\u00d40000[3].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jButton, this.\u00d5\u00d40000[3]);
            this.o00000(jButton);
            JButton jButton2 = new JButton("-1");
            jButton2.setName("A:" + e.toString());
            this.\u00d6\u00d40000.put("A:" + e.toString(), jButton2);
            this.classObject.put(jButton2, e);
            jButton2.setEnabled(false);
            jButton2.addActionListener(this.doObject);
            this.\u00d5\u00d40000[4].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jButton2, this.\u00d5\u00d40000[4]);
            this.o00000(jButton2);
            JLabel jLabel2 = new JLabel("PA:");
            this.\u00d5\u00d40000[5].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jLabel2, this.\u00d5\u00d40000[5]);
            this.o00000(jLabel2);
            JTextField jTextField = this.Object(e);
            this.\u00d5\u00d40000[6].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jTextField, this.\u00d5\u00d40000[6]);
            this.o00000(jTextField);
            JButton jButton3 = new JButton("+1");
            jButton3.setName("P:" + e.toString());
            jButton3.addActionListener(this.doObject);
            this.classObject.put(jButton3, e);
            this.\u00d5\u00d40000[7].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jButton3, this.\u00d5\u00d40000[7]);
            this.o00000(jButton3);
            JLabel jLabel3 = this.o00000((voidsuper)e);
            JButton jButton4 = new JButton("-1");
            jButton4.setName("P:" + e.toString());
            this.\u00d6\u00d40000.put("P:" + e.toString(), jButton4);
            this.classObject.put(jButton4, e);
            jButton4.setEnabled(false);
            jButton4.addActionListener(this.doObject);
            this.\u00d5\u00d40000[8].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jButton4, this.\u00d5\u00d40000[8]);
            this.o00000(jButton4);
            this.\u00d5\u00d40000[9].gridy = this.\u00f6\u00d40000;
            this.\u00f4\u00d40000.setConstraints(jLabel3, this.\u00d5\u00d40000[9]);
            this.o00000(jLabel3);
        }
        ++this.\u00f6\u00d40000;
    }

    public void o00000(P p2, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        JLabel jLabel = new JLabel(p2.toString() + ":");
        this.\u00d5\u00d40000[0].gridy = this.\u00f6\u00d40000;
        this.\u00d5\u00d40000[0].gridwidth = 3;
        this.\u00f4\u00d40000.setConstraints(jLabel, this.\u00d5\u00d40000[0]);
        this.\u00d5\u00d40000[0].gridwidth = 1;
        this.o00000(jLabel);
        JComboBox jComboBox = new JComboBox();
        DefaultComboBoxModel<Object> defaultComboBoxModel = new DefaultComboBoxModel<Object>();
        floatsuper floatsuper2 = new floatsuper((K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        if (floatsuper2.Object(p2.\u00f5o0000())) {
            voidsuper voidsuper2 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d5\u00d20000().get(p2);
            defaultComboBoxModel.addElement("Nicht Verteilt");
            for (voidsuper voidsuper3 : p2.oO0000()) {
                defaultComboBoxModel.addElement(voidsuper3);
            }
            if (voidsuper2 != null) {
                defaultComboBoxModel.setSelectedItem(voidsuper2);
                jComboBox.setEnabled(false);
            }
        } else {
            defaultComboBoxModel.addElement("ruhend");
            jComboBox.setEnabled(false);
        }
        jComboBox.setModel(defaultComboBoxModel);
        jComboBox.addActionListener(this.doObject);
        this.O\u00d40000.put(p2, jComboBox);
        this.\u00f5\u00d40000.put(jComboBox, p2);
        this.\u00d5\u00d40000[4].gridy = this.\u00f6\u00d40000++;
        this.\u00d5\u00d40000[4].gridwidth = 3;
        this.\u00f4\u00d40000.setConstraints(jComboBox, this.\u00d5\u00d40000[4]);
        this.\u00d5\u00d40000[4].gridwidth = 1;
        this.o00000(jComboBox);
    }

    public Map<JComboBox, P> \u00d2\u00d20000() {
        return this.\u00f5\u00d40000;
    }

    public E Object(JButton jButton) {
        return this.classObject.get(jButton);
    }

    public JButton Object(String string) {
        return this.\u00d6\u00d40000.get(string);
    }

    public Map<P, JComboBox> o\u00d20000() {
        return this.O\u00d40000;
    }

    public void o00000(voidsuper voidsuper2, int n) {
        this.\u00d200000(voidsuper2).setText("" + n);
    }

    @Override
    public void o00000(oooo_1 oooo_12) {
        this.interfacesuper();
        this.void(oooo_12);
        this.\u00f6\u00d40000 += 2;
        this.doObject.o00000(oooo_12);
    }

    public void \u00d200000(voidsuper voidsuper2, int n) {
        this.Object(voidsuper2).setText("" + n);
    }

    public void o00000(voidsuper voidsuper2, int n, int n2) {
        JLabel jLabel = this.o00000(voidsuper2);
        StringBuffer stringBuffer = new StringBuffer(10);
        stringBuffer.append(n);
        stringBuffer.append("/");
        stringBuffer.append(n2);
        stringBuffer.append(" TaP");
        jLabel.setText(stringBuffer.toString());
    }

    private JTextField \u00d200000(voidsuper voidsuper2) {
        JTextField jTextField = this.\u00d4\u00d40000.get(voidsuper2);
        if (jTextField == null) {
            jTextField = new JTextField();
            jTextField.setEditable(false);
            this.\u00d4\u00d40000.put(voidsuper2, jTextField);
        }
        return jTextField;
    }

    private void void(oooo_1 oooo_12) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 2;
        gridBagConstraints.insets.left = 2;
        gridBagConstraints.anchor = 17;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.weightx = 0.0;
        gridBagConstraints2.gridx = 5;
        gridBagConstraints2.gridwidth = 2;
        gridBagConstraints2.gridy = 0;
        gridBagConstraints2.insets.top = 3;
        gridBagConstraints2.insets.bottom = 2;
        gridBagConstraints2.insets.right = 2;
        gridBagConstraints2.insets.left = 2;
        gridBagConstraints2.anchor = 17;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.weightx = 0.0;
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridwidth = 2;
        gridBagConstraints3.gridy = 1;
        gridBagConstraints3.insets.top = 3;
        gridBagConstraints3.insets.bottom = 2;
        gridBagConstraints3.insets.right = 2;
        gridBagConstraints3.insets.left = 2;
        gridBagConstraints3.anchor = 17;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.weightx = 0.0;
        gridBagConstraints4.gridx = 5;
        gridBagConstraints4.gridwidth = 4;
        gridBagConstraints4.gridy = 1;
        gridBagConstraints4.insets.top = 3;
        gridBagConstraints4.insets.bottom = 2;
        gridBagConstraints4.insets.right = 2;
        gridBagConstraints4.insets.left = 2;
        gridBagConstraints4.anchor = 17;
        if (oooo_12 == null) {
            JLabel jLabel = new JLabel("AT-Basis: 0");
            this.\u00f4\u00d40000.setConstraints(jLabel, gridBagConstraints);
            this.o00000(jLabel);
            JLabel jLabel2 = new JLabel("PA-Basis: 0 ");
            this.\u00f4\u00d40000.setConstraints(jLabel2, gridBagConstraints2);
            this.o00000(jLabel2);
            JLabel jLabel3 = new JLabel("FK-Basis: 0");
            this.\u00f4\u00d40000.setConstraints(jLabel3, gridBagConstraints3);
            this.o00000(jLabel3);
        } else {
            JLabel jLabel = new JLabel("AT-Basis: " + oooo_12.\u00d800000().o00000(b_0.\u00f8\u00d8\u00d2000));
            this.\u00f4\u00d40000.setConstraints(jLabel, gridBagConstraints);
            this.o00000(jLabel);
            JLabel jLabel4 = new JLabel("PA-Basis: " + oooo_12.\u00d800000().o00000(b_0.ifwhilesuper) + "   ");
            this.\u00f4\u00d40000.setConstraints(jLabel4, gridBagConstraints2);
            this.o00000(jLabel4);
            JLabel jLabel5 = new JLabel("FK-Basis: " + oooo_12.\u00d800000().o00000(b_0.\u00f5\u00f4\u00d2000));
            this.\u00f4\u00d40000.setConstraints(jLabel5, gridBagConstraints3);
            this.o00000(jLabel5);
            if (Einstellungen.getInstance().getSeitenEinstellungen(oooo_12.\u00d800000().\u00f4o0000()).isZonenRuestung()) {
                JLabel jLabel6 = new JLabel("RS-Berechnung: Zonen");
                this.\u00f4\u00d40000.setConstraints(jLabel6, gridBagConstraints4);
                this.o00000(jLabel6);
            } else {
                JLabel jLabel7 = new JLabel("RS-Berechnung: Einfach");
                this.\u00f4\u00d40000.setConstraints(jLabel7, gridBagConstraints4);
                this.o00000(jLabel7);
            }
        }
    }

    private JTextField Object(voidsuper voidsuper2) {
        JTextField jTextField = this.o\u00d40000.get(voidsuper2);
        if (jTextField == null) {
            jTextField = new JTextField();
            jTextField.setEditable(false);
            this.o\u00d40000.put(voidsuper2, jTextField);
        }
        return jTextField;
    }

    private JLabel o00000(voidsuper voidsuper2) {
        JLabel jLabel = this.intObject.get(voidsuper2);
        if (jLabel == null) {
            jLabel = new JLabel();
            this.intObject.put(voidsuper2, jLabel);
        }
        return jLabel;
    }

    private void O\u00d20000() {
        this.\u00d5\u00d40000[0] = new GridBagConstraints();
        this.\u00d5\u00d40000[0].weightx = 0.3;
        this.\u00d5\u00d40000[0].gridx = 0;
        this.\u00d5\u00d40000[0].anchor = 17;
        this.\u00d5\u00d40000[0].insets.top = 3;
        this.\u00d5\u00d40000[0].insets.bottom = 2;
        this.\u00d5\u00d40000[0].insets.right = 5;
        this.\u00d5\u00d40000[0].insets.left = 10;
        this.\u00d5\u00d40000[1] = new GridBagConstraints();
        this.\u00d5\u00d40000[1].weightx = 0.0;
        this.\u00d5\u00d40000[1].gridx = 1;
        this.\u00d5\u00d40000[1].anchor = 17;
        this.\u00d5\u00d40000[1].insets.top = 3;
        this.\u00d5\u00d40000[1].insets.bottom = 2;
        this.\u00d5\u00d40000[1].insets.right = 5;
        this.\u00d5\u00d40000[2] = new GridBagConstraints();
        this.\u00d5\u00d40000[2].weightx = 0.2;
        this.\u00d5\u00d40000[2].gridx = 2;
        this.\u00d5\u00d40000[2].fill = 2;
        this.\u00d5\u00d40000[2].insets.top = 3;
        this.\u00d5\u00d40000[2].insets.bottom = 2;
        this.\u00d5\u00d40000[2].insets.right = 5;
        this.\u00d5\u00d40000[3] = new GridBagConstraints();
        this.\u00d5\u00d40000[3].weightx = 0.0;
        this.\u00d5\u00d40000[3].gridx = 3;
        this.\u00d5\u00d40000[3].fill = 13;
        this.\u00d5\u00d40000[3].insets.top = 3;
        this.\u00d5\u00d40000[3].insets.bottom = 2;
        this.\u00d5\u00d40000[3].insets.right = 5;
        this.\u00d5\u00d40000[4] = new GridBagConstraints();
        this.\u00d5\u00d40000[4].weightx = 0.0;
        this.\u00d5\u00d40000[4].gridx = 4;
        this.\u00d5\u00d40000[4].fill = 13;
        this.\u00d5\u00d40000[4].insets.top = 3;
        this.\u00d5\u00d40000[4].insets.bottom = 2;
        this.\u00d5\u00d40000[4].insets.right = 20;
        this.\u00d5\u00d40000[5] = new GridBagConstraints();
        this.\u00d5\u00d40000[5].weightx = 0.0;
        this.\u00d5\u00d40000[5].gridx = 5;
        this.\u00d5\u00d40000[5].anchor = 17;
        this.\u00d5\u00d40000[5].insets.top = 3;
        this.\u00d5\u00d40000[5].insets.bottom = 2;
        this.\u00d5\u00d40000[5].insets.right = 5;
        this.\u00d5\u00d40000[5].insets.left = 0;
        this.\u00d5\u00d40000[6] = new GridBagConstraints();
        this.\u00d5\u00d40000[6].weightx = 0.2;
        this.\u00d5\u00d40000[6].gridx = 6;
        this.\u00d5\u00d40000[6].fill = 2;
        this.\u00d5\u00d40000[6].insets.top = 3;
        this.\u00d5\u00d40000[6].insets.bottom = 2;
        this.\u00d5\u00d40000[6].insets.right = 5;
        this.\u00d5\u00d40000[7] = new GridBagConstraints();
        this.\u00d5\u00d40000[7].weightx = 0.0;
        this.\u00d5\u00d40000[7].gridx = 7;
        this.\u00d5\u00d40000[7].fill = 2;
        this.\u00d5\u00d40000[7].insets.top = 3;
        this.\u00d5\u00d40000[7].insets.bottom = 2;
        this.\u00d5\u00d40000[7].insets.right = 5;
        this.\u00d5\u00d40000[8] = new GridBagConstraints();
        this.\u00d5\u00d40000[8].weightx = 0.0;
        this.\u00d5\u00d40000[8].gridx = 8;
        this.\u00d5\u00d40000[8].fill = 2;
        this.\u00d5\u00d40000[8].insets.top = 3;
        this.\u00d5\u00d40000[8].insets.bottom = 2;
        this.\u00d5\u00d40000[8].insets.right = 5;
        this.\u00d5\u00d40000[9] = new GridBagConstraints();
        this.\u00d5\u00d40000[9].weightx = 0.2;
        this.\u00d5\u00d40000[9].gridx = 9;
        this.\u00d5\u00d40000[9].fill = 13;
        this.\u00d5\u00d40000[9].insets.top = 3;
        this.\u00d5\u00d40000[9].insets.bottom = 2;
        this.\u00d5\u00d40000[9].insets.right = 10;
    }

    private void interfacesuper() {
        this.\u00d4\u00d40000 = new HashMap<voidsuper, JTextField>();
        this.o\u00d40000 = new HashMap<voidsuper, JTextField>();
        this.intObject = new HashMap<voidsuper, JLabel>();
        this.\u00d6\u00d40000 = new HashMap<String, JButton>();
        this.\u00f6\u00d40000 = 0;
        this.removeAll();
        this.repaint();
    }
}

