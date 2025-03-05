/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.B;
import helden.framework.E.F;
import helden.gui.oooo_1;
import helden.gui.super.c.oooo_0;
import helden.gui.super.float;
import helden.gui.super.super;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class G
extends JPanel
implements float {
    public static final String classsuper = "Nahkampfwaffe 1";
    public static final String \u00f6O0000 = "Nahkampfwaffe 2";
    public static final String \u00f5O0000 = "Nahkampfwaffe 3";
    public static final String \u00f4O0000 = "Nahkampfwaffe 4";
    public static final String supersuper = "Nahkampfwaffe 5";
    public static final String \u00d4o0000 = "Fernkampfwaffe 1";
    public static final String intsuper = "Fernkampfwaffe 2";
    public static final String \u00d2o0000 = "Fernkampfwaffe 3";
    public static final String \u00d6O0000 = "Schild 1";
    public static final String \u00d5O0000 = "Schild 2";
    public static final String \u00d5\u00d20000 = "R\u00fcstung 1";
    public static final String Objectnew = "R\u00fcstung 2";
    public static final String o\u00d20000 = "R\u00fcstung 3";
    public static final String interfacesuper = "R\u00fcstung 4";
    public static final String \u00f6o0000 = "R\u00fcstung 5";
    private static Icon \u00d5o0000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Draw.gif")));
    private GridBagLayout \u00d6\u00d20000;
    private GridBagConstraints[] O\u00d20000 = new GridBagConstraints[3];
    private oooo_0 \u00f5o0000;
    private int \u00d4O0000;
    private Map<String, JTextField> \u00f4o0000;
    private JButton \u00d6o0000;
    private JButton Oo0000;
    private JButton \u00d4\u00d20000;
    private JButton oo0000;
    private helden.framework.held.object.oooo_1 \u00d2\u00d20000;
    private int dosuper;

    public G(int n, super super_) {
        this.\u00f5o0000 = new oooo_0(this, n, super_);
        this.\u00f4o0000 = new HashMap<String, JTextField>();
        this.\u00d6\u00d20000 = new GridBagLayout();
        this.\u00d2O0000();
        this.setLayout(this.\u00d6\u00d20000);
        this.dosuper = n;
        this.supersuper();
    }

    public void \u00d6O0000() {
        if (this.\u00d2\u00d20000 != null) {
            if (this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.OO0000).size() < 1 && this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.\u00d600000).size() < 1) {
                this.\u00d6o0000.setEnabled(false);
                this.\u00d6o0000.setToolTipText("Keine R\u00fcstungsteile im Inventar");
            } else {
                this.\u00d6o0000.setEnabled(true);
                this.\u00d6o0000.setToolTipText("");
            }
            ArrayList<F> arrayList = this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.\u00d400000);
            boolean bl = false;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                if (arrayList.get(i2).o00000(B.class, 0) == null) continue;
                bl = true;
                break;
            }
            if (!bl && this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.class).size() < 1) {
                this.\u00d4\u00d20000.setEnabled(false);
                this.\u00d4\u00d20000.setToolTipText("Keine Fernkampfwaffe im Inventar");
            } else {
                this.\u00d4\u00d20000.setEnabled(true);
                this.\u00d4\u00d20000.setToolTipText("");
            }
            if (this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.\u00d300000).size() < 1 && this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.\u00f600000).size() < 1) {
                this.Oo0000.setEnabled(false);
                this.Oo0000.setToolTipText("Kein Schild /keine Parierwaffe im Inventar");
            } else {
                this.Oo0000.setEnabled(true);
                this.Oo0000.setToolTipText("");
            }
            if (this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.\u00d400000).size() < 1 && this.\u00d2\u00d20000.\u00d800000().\u00d8o0000().o00000(B.\u00f600000).size() < 1) {
                this.oo0000.setEnabled(false);
                this.oo0000.setToolTipText("Keine Nahkampfwaffe im Inventar");
            } else {
                this.oo0000.setEnabled(true);
                this.oo0000.setToolTipText("");
            }
        }
    }

    public JTextField \u00d200000(String string) {
        return this.\u00f4o0000.get(string);
    }

    @Override
    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d2\u00d20000 = oooo_12;
        this.\u00f5o0000.o00000(oooo_12);
        this.\u00d6O0000();
    }

    private void o00000(String string) {
        JLabel jLabel = new JLabel(string);
        this.O\u00d20000[1].gridy = this.\u00d4O0000++;
        this.O\u00d20000[1].gridwidth = 1;
        this.O\u00d20000[1].fill = 0;
        this.\u00d6\u00d20000.setConstraints(jLabel, this.O\u00d20000[1]);
        this.add(jLabel);
    }

    private void o00000(String string, int n) {
        JLabel jLabel = new JLabel(n + ": ");
        this.O\u00d20000[0].gridy = this.\u00d4O0000;
        this.\u00d6\u00d20000.setConstraints(jLabel, this.O\u00d20000[0]);
        this.add(jLabel);
        JTextField jTextField = new JTextField();
        jTextField.setEditable(false);
        this.\u00f4o0000.put(string, jTextField);
        this.O\u00d20000[1].gridy = this.\u00d4O0000++;
        this.O\u00d20000[1].gridwidth = 2;
        this.O\u00d20000[1].fill = 2;
        this.\u00d6\u00d20000.setConstraints(jTextField, this.O\u00d20000[1]);
        this.add(jTextField);
    }

    private void \u00d4O0000() {
        JLabel jLabel = new JLabel(" ");
        this.O\u00d20000[0].gridy = this.\u00d4O0000++;
        this.\u00d6\u00d20000.setConstraints(jLabel, this.O\u00d20000[0]);
        this.add(jLabel);
    }

    private void public() {
        this.\u00d4\u00d20000 = new JButton(\u00d5o0000);
        this.\u00d4\u00d20000.setName("fkw");
        this.\u00d4\u00d20000.addActionListener(this.\u00f5o0000);
        this.O\u00d20000[2].gridy = this.\u00d4O0000;
        this.\u00d6\u00d20000.setConstraints(this.\u00d4\u00d20000, this.O\u00d20000[2]);
        this.add(this.\u00d4\u00d20000);
    }

    private void \u00f4O0000() {
        this.oo0000 = new JButton(\u00d5o0000);
        this.oo0000.setName("nkw");
        this.oo0000.addActionListener(this.\u00f5o0000);
        this.O\u00d20000[2].gridy = this.\u00d4O0000;
        this.\u00d6\u00d20000.setConstraints(this.oo0000, this.O\u00d20000[2]);
        this.add(this.oo0000);
    }

    private void \u00f5O0000() {
        this.\u00d6o0000 = new JButton(\u00d5o0000);
        this.\u00d6o0000.setName("ruestung");
        this.\u00d6o0000.addActionListener(this.\u00f5o0000);
        this.O\u00d20000[2].gridy = this.\u00d4O0000;
        this.\u00d6\u00d20000.setConstraints(this.\u00d6o0000, this.O\u00d20000[2]);
        this.add(this.\u00d6o0000);
    }

    private void \u00d5O0000() {
        this.Oo0000 = new JButton(\u00d5o0000);
        this.Oo0000.setName("schilde");
        this.Oo0000.addActionListener(this.\u00f5o0000);
        this.O\u00d20000[2].gridy = this.\u00d4O0000;
        this.\u00d6\u00d20000.setConstraints(this.Oo0000, this.O\u00d20000[2]);
        this.add(this.Oo0000);
    }

    private void \u00d2O0000() {
        this.O\u00d20000[0] = new GridBagConstraints();
        this.O\u00d20000[0].gridx = 0;
        this.O\u00d20000[0].anchor = 13;
        this.O\u00d20000[0].insets.top = 3;
        this.O\u00d20000[0].insets.bottom = 2;
        this.O\u00d20000[0].insets.right = 5;
        this.O\u00d20000[0].insets.left = 5;
        this.O\u00d20000[1] = new GridBagConstraints();
        this.O\u00d20000[1].anchor = 17;
        this.O\u00d20000[1].weightx = 1.0;
        this.O\u00d20000[1].gridx = 1;
        this.O\u00d20000[1].insets.top = 3;
        this.O\u00d20000[1].insets.bottom = 2;
        this.O\u00d20000[1].insets.right = 5;
        this.O\u00d20000[2] = new GridBagConstraints();
        this.O\u00d20000[2].weightx = 1.0;
        this.O\u00d20000[2].gridx = 2;
        this.O\u00d20000[2].anchor = 13;
        this.O\u00d20000[2].insets.top = 3;
        this.O\u00d20000[2].insets.bottom = 2;
        this.O\u00d20000[2].insets.right = 5;
    }

    private void supersuper() {
        this.o00000("Ausr\u00fcstungsset " + (this.dosuper + 1));
        this.\u00f4O0000();
        this.o00000("Nahkampfwaffen");
        this.o00000(classsuper, 1);
        this.o00000(\u00f6O0000, 2);
        this.o00000(\u00f5O0000, 3);
        this.o00000(\u00f4O0000, 4);
        this.o00000(supersuper, 5);
        this.\u00d4O0000();
        this.public();
        this.o00000("Fernkampfwaffen");
        this.o00000(\u00d4o0000, 1);
        this.o00000(intsuper, 2);
        this.o00000(\u00d2o0000, 3);
        this.\u00d4O0000();
        this.\u00d5O0000();
        this.o00000("Schilde / Parierwaffen");
        this.o00000(\u00d6O0000, 1);
        this.o00000(\u00d5O0000, 2);
        this.\u00d4O0000();
        this.\u00f5O0000();
        this.o00000("R\u00fcstungsteile");
        this.o00000(\u00d5\u00d20000, 1);
        this.o00000(Objectnew, 2);
        this.o00000(o\u00d20000, 3);
        this.o00000(interfacesuper, 4);
        this.o00000(\u00f6o0000, 5);
    }
}

