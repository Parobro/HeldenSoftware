/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.C.I;
import helden.framework.E.B;
import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.OoOO.E;
import helden.framework.e.oooo_0;
import helden.framework.held.object.oooo_1;
import helden.gui.allgemein.Utils;
import helden.gui.super.C.G;
import helden.gui.super.C.M;
import helden.gui.super.C.OoOO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
implements ActionListener {
    private M Object;
    private JDialog \u00d400000;
    private oooo_1 void;
    private F[] \u00d500000;
    private G \u00d200000;
    private oooo_0[] \u00d600000;
    private int \u00f400000;
    private String o00000;

    public O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(G g2, oooo_1 oooo_12, int n) {
        this.\u00f400000 = n;
        this.\u00d200000 = g2;
        this.void = oooo_12;
        this.\u00d500000 = new F[5];
        this.\u00d500000[0] = oooo_12.\u00d800000().o00000(n).\u00f8O0000(1);
        this.\u00d500000[1] = oooo_12.\u00d800000().o00000(n).\u00f8O0000(2);
        this.\u00d500000[2] = oooo_12.\u00d800000().o00000(n).\u00f8O0000(3);
        this.\u00d500000[3] = oooo_12.\u00d800000().o00000(n).\u00f8O0000(4);
        this.\u00d500000[4] = oooo_12.\u00d800000().o00000(n).\u00f8O0000(5);
        this.\u00d600000 = new oooo_0[5];
        for (int i2 = 0; i2 < 5; ++i2) {
            this.\u00d600000[i2] = oooo_12.\u00d800000().o00000(n).\u00d3O0000(i2 + 1);
        }
        this.Object = new M(oooo_12, this);
        this.\u00d300000();
        this.\u00d400000 = new JDialog(Utils.getFrame(g2), "Nahkampfwaffen", true);
        this.\u00d400000.getContentPane().add(this.Object);
        this.\u00d400000.setSize(750, 580);
        Utils.zentriere(this.\u00d400000);
        this.\u00d400000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.Object.\u00d6o0000()) {
            if (this.Object.\u00d5O0000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(1, 1);
            } else if (this.Object.\u00f800000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(1, 2);
            } else {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(1, 0);
            }
            if (this.Object.\u00d600000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(2, 1);
            } else if (this.Object.\u00d200000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(2, 2);
            } else {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(2, 0);
            }
            if (this.Object.\u00d3o0000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(3, 1);
            } else if (this.Object.oo0000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(3, 2);
            } else {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(3, 0);
            }
            if (this.Object.newsuper().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(4, 1);
            } else if (this.Object.oO0000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(4, 2);
            } else {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(4, 0);
            }
            if (this.Object.\u00d800000().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(5, 1);
            } else if (this.Object.String().isSelected()) {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(5, 2);
            } else {
                this.void.\u00d800000().o00000(this.\u00f400000).o00000(5, 0);
            }
            this.void.\u00d800000().o00000(this.\u00f400000).\u00d200000(1, this.\u00d500000[0]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(1, this.\u00d600000[0]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(1, this.Object.\u00d200000(0).getSelectedItem().toString());
            this.void.\u00d800000().o00000(this.\u00f400000).\u00d200000(this.Object.String(0).isSelected());
            this.void.\u00d800000().o00000(this.\u00f400000).\u00d200000(2, this.\u00d500000[1]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(2, this.\u00d600000[1]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(2, this.Object.\u00d200000(1).getSelectedItem().toString());
            this.void.\u00d800000().o00000(this.\u00f400000).\u00d200000(3, this.\u00d500000[2]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(3, this.\u00d600000[2]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(3, this.Object.\u00d200000(2).getSelectedItem().toString());
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(this.Object.String(1).isSelected());
            this.void.\u00d800000().o00000(this.\u00f400000).\u00d200000(4, this.\u00d500000[3]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(4, this.\u00d600000[3]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(4, this.Object.\u00d200000(3).getSelectedItem().toString());
            this.void.\u00d800000().o00000(this.\u00f400000).\u00d200000(5, this.\u00d500000[4]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(5, this.\u00d600000[4]);
            this.void.\u00d800000().o00000(this.\u00f400000).o00000(5, this.Object.\u00d200000(4).getSelectedItem().toString());
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() == this.Object.\u00d2O0000()) {
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() instanceof JCheckBox) {
            int n = Integer.parseInt(((JCheckBox)actionEvent.getSource()).getName().substring(2));
            this.o00000(n);
        } else if (actionEvent.getSource() instanceof JToggleButton) {
            if (actionEvent.getSource() == this.Object.\u00d5O0000() && this.Object.\u00f800000().isSelected()) {
                this.Object.null().setSelected(true);
            } else if (actionEvent.getSource() == this.Object.\u00f800000() && this.Object.\u00d5O0000().isSelected()) {
                this.Object.\u00d5o0000().setSelected(true);
            }
            if (actionEvent.getSource() == this.Object.\u00d600000() && this.Object.\u00d200000().isSelected()) {
                this.Object.null().setSelected(true);
            } else if (actionEvent.getSource() == this.Object.\u00d200000() && this.Object.\u00d600000().isSelected()) {
                this.Object.\u00d5o0000().setSelected(true);
            }
            if (actionEvent.getSource() == this.Object.\u00d3o0000() && this.Object.oo0000().isSelected()) {
                this.Object.null().setSelected(true);
            } else if (actionEvent.getSource() == this.Object.oo0000() && this.Object.\u00d3o0000().isSelected()) {
                this.Object.\u00d5o0000().setSelected(true);
            }
            if (actionEvent.getSource() == this.Object.newsuper() && this.Object.oO0000().isSelected()) {
                this.Object.null().setSelected(true);
            } else if (actionEvent.getSource() == this.Object.oO0000() && this.Object.newsuper().isSelected()) {
                this.Object.\u00d5o0000().setSelected(true);
            }
            if (actionEvent.getSource() == this.Object.\u00d800000() && this.Object.String().isSelected()) {
                this.Object.null().setSelected(true);
            } else if (actionEvent.getSource() == this.Object.String() && this.Object.\u00d800000().isSelected()) {
                this.Object.\u00d5o0000().setSelected(true);
            }
            this.o00000();
        } else if (actionEvent.getSource() instanceof JComboBox) {
            int n = Integer.parseInt(((JComboBox)actionEvent.getSource()).getName().substring(4));
            if (n == 0 && this.Object.String(0).isSelected()) {
                this.Object.\u00d500000(1);
            } else if (n == 2 && this.Object.String(1).isSelected()) {
                this.Object.\u00d500000(3);
            }
        } else {
            OoOO ooOO2;
            int n;
            String string = ((JButton)actionEvent.getSource()).getName();
            if (string.startsWith("I") && string.length() > 1 && this.\u00d500000[n = Integer.parseInt(string.substring(1))] != null && (ooOO2 = new OoOO(this.\u00d200000, this.\u00d500000[n], this.\u00d600000[n])).o00000()) {
                this.\u00d600000[n] = ooOO2.\u00d200000();
                this.new();
            }
            if (string.startsWith("ADD")) {
                n = Integer.parseInt(string.substring(3));
                int n2 = this.Object.\u00f600000().getSelectedRow();
                if (n2 < 0) {
                    JOptionPane.showConfirmDialog(this.Object, "Bitte treffen sie eine Auswahl in der Tabelle", "Nichts gew\u00e4hlt", -1);
                } else {
                    F f2;
                    this.\u00d500000[n] = f2 = (F)this.Object.\u00f600000().getModel().getValueAt(n2, 2);
                    this.\u00d600000[n] = oooo_0.o00000(f2).get(0);
                    switch (n) {
                        case 0: {
                            this.Object.ifsuper().setText(f2.OO0000());
                            break;
                        }
                        case 1: {
                            this.Object.\u00f500000().setText(f2.OO0000());
                            break;
                        }
                        case 2: {
                            this.Object.\u00f6O0000().setText(f2.OO0000());
                            break;
                        }
                        case 3: {
                            this.Object.\u00d300000().setText(f2.OO0000());
                            break;
                        }
                        case 4: {
                            this.Object.\u00d8O0000().setText(f2.OO0000());
                            break;
                        }
                    }
                    this.new();
                }
            }
            if (string.startsWith("REM")) {
                n = Integer.parseInt(string.substring(3));
                this.\u00d500000[n] = null;
                this.\u00d600000[n] = null;
                switch (n) {
                    case 0: {
                        this.Object.ifsuper().setText("");
                        break;
                    }
                    case 1: {
                        this.Object.\u00f500000().setText("");
                        break;
                    }
                    case 2: {
                        this.Object.\u00f6O0000().setText("");
                        break;
                    }
                    case 3: {
                        this.Object.\u00d300000().setText("");
                        break;
                    }
                    case 4: {
                        this.Object.\u00d8O0000().setText("");
                        break;
                    }
                }
                this.new();
            }
        }
    }

    private void \u00d300000() {
        this.o00000 = "rechts";
        if (this.void.\u00d800000().o00000(I.o\u00d50000)) {
            this.o00000 = "links";
        }
        this.Object.\u00d5o0000().setSelected(true);
        this.Object.null().setSelected(true);
        if (this.\u00d500000[0] != null) {
            this.Object.ifsuper().setText(this.\u00d500000[0].OO0000());
            if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(1) == 1) {
                this.Object.\u00d5O0000().setSelected(true);
            } else if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(1) == 2) {
                this.Object.\u00f800000().setSelected(true);
            }
        }
        if (this.\u00d500000[1] != null) {
            this.Object.\u00f500000().setText(this.\u00d500000[1].OO0000());
            if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(2) == 1) {
                this.Object.\u00d600000().setSelected(true);
            } else if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(2) == 2) {
                this.Object.\u00d200000().setSelected(true);
            }
        }
        if (this.\u00d500000[2] != null) {
            this.Object.\u00f6O0000().setText(this.\u00d500000[2].OO0000());
            if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(3) == 1) {
                this.Object.\u00d3o0000().setSelected(true);
            } else if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(3) == 2) {
                this.Object.oo0000().setSelected(true);
            }
        }
        if (this.\u00d500000[3] != null) {
            this.Object.\u00d300000().setText(this.\u00d500000[3].OO0000());
            if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(4) == 1) {
                this.Object.newsuper().setSelected(true);
            } else if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(4) == 2) {
                this.Object.oO0000().setSelected(true);
            }
        }
        if (this.\u00d500000[4] != null) {
            this.Object.\u00d8O0000().setText(this.\u00d500000[4].OO0000());
            if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(5) == 1) {
                this.Object.\u00d800000().setSelected(true);
            } else if (this.void.\u00d800000().o00000(this.\u00f400000).\u00d800000(5) == 2) {
                this.Object.String().setSelected(true);
            }
        }
        this.Object.\u00d200000(0).setSelectedItem(this.void.\u00d800000().o00000(this.\u00f400000).oo0000(1));
        this.Object.\u00d200000(1).setSelectedItem(this.void.\u00d800000().o00000(this.\u00f400000).oo0000(2));
        this.Object.\u00d200000(2).setSelectedItem(this.void.\u00d800000().o00000(this.\u00f400000).oo0000(3));
        this.Object.\u00d200000(3).setSelectedItem(this.void.\u00d800000().o00000(this.\u00f400000).oo0000(4));
        this.Object.\u00d200000(4).setSelectedItem(this.void.\u00d800000().o00000(this.\u00f400000).oo0000(5));
        this.Object.String(0).setSelected(this.void.\u00d800000().o00000(this.\u00f400000).\u00d6O0000());
        this.Object.String(1).setSelected(this.void.\u00d800000().o00000(this.\u00f400000).\u00f500000());
        this.new();
    }

    private void new() {
        if (this.\u00d500000[0] == null || this.\u00d500000[1] == null) {
            this.Object.String(0).setEnabled(false);
            this.Object.String(0).setSelected(false);
        } else if (((A)this.\u00d500000[0].o00000(B.\u00d400000, 0)).\u00d2\u00d50000() || ((A)this.\u00d500000[1].o00000(B.\u00d400000, 0)).\u00d2\u00d50000()) {
            this.Object.String(0).setEnabled(false);
            this.Object.String(0).setSelected(false);
        } else if (this.o00000(this.\u00d600000[0]) && this.new(this.\u00d600000[1]) || this.o00000(this.\u00d600000[1]) && this.new(this.\u00d600000[0])) {
            this.Object.String(0).setEnabled(true);
        } else if (!this.o00000(this.\u00d600000[0]) || !this.o00000(this.\u00d600000[1])) {
            this.Object.String(0).setEnabled(false);
            this.Object.String(0).setSelected(false);
        } else {
            this.Object.String(0).setEnabled(true);
        }
        if (this.\u00d500000[2] == null || this.\u00d500000[3] == null) {
            this.Object.String(1).setEnabled(false);
            this.Object.String(1).setSelected(false);
        } else if (((A)this.\u00d500000[2].o00000(B.\u00d400000, 0)).\u00d2\u00d50000() || ((A)this.\u00d500000[3].o00000(B.\u00d400000, 0)).\u00d2\u00d50000()) {
            this.Object.String(1).setEnabled(false);
            this.Object.String(1).setSelected(false);
        } else if (this.o00000(this.\u00d600000[2]) && this.new(this.\u00d600000[3]) || this.o00000(this.\u00d600000[3]) && this.new(this.\u00d600000[2])) {
            this.Object.String(1).setEnabled(true);
        } else if (!this.o00000(this.\u00d600000[2]) || !this.o00000(this.\u00d600000[2])) {
            this.Object.String(1).setEnabled(false);
            this.Object.String(1).setSelected(false);
        } else {
            this.Object.String(1).setEnabled(true);
        }
        this.o00000(0);
        this.o00000(1);
    }

    private boolean o00000(oooo_0 oooo_02) {
        if (!oooo_02.o00000().intclass()) {
            return false;
        }
        if (!oooo_02.\u00d200000().\u00f6\u00d40000().get(0).intclass()) {
            return false;
        }
        return oooo_02.\u00d200000().nullString() == null;
    }

    private boolean new(oooo_0 oooo_02) {
        return oooo_02.o00000().equals(E.\u00f4\u00d5\u00d8000);
    }

    private void o00000(int n) {
        if (n == 0) {
            if (this.Object.String(0).isSelected()) {
                this.Object.\u00d200000(1).removeActionListener(this);
                if (this.Object.\u00d5O0000().isSelected() || this.Object.\u00d600000().isSelected()) {
                    this.Object.\u00d5o0000().setSelected(true);
                }
                this.Object.\u00d5O0000().setEnabled(false);
                this.Object.\u00d600000().setEnabled(false);
                if (this.Object.\u00f800000().isSelected() || this.Object.\u00d200000().isSelected()) {
                    this.Object.null().setSelected(true);
                }
                this.Object.\u00f800000().setEnabled(false);
                this.Object.\u00d200000().setEnabled(false);
                this.Object.\u00d200000(1).setEnabled(false);
                this.Object.\u00d500000(1);
            } else {
                this.Object.\u00d200000(1).addActionListener(this);
                this.Object.\u00d200000(1).setEnabled(true);
                this.Object.\u00d5O0000().setEnabled(true);
                this.Object.\u00d600000().setEnabled(true);
                this.Object.\u00f800000().setEnabled(true);
                this.Object.\u00d200000().setEnabled(true);
            }
        } else if (this.Object.String(1).isSelected()) {
            this.Object.\u00d200000(3).removeActionListener(this);
            this.Object.\u00d200000(3).setEnabled(false);
            this.Object.\u00d500000(3);
            if (this.Object.\u00d3o0000().isSelected() || this.Object.newsuper().isSelected()) {
                this.Object.\u00d5o0000().setSelected(true);
            }
            this.Object.\u00d3o0000().setEnabled(false);
            this.Object.newsuper().setEnabled(false);
            if (this.Object.oo0000().isSelected() || this.Object.oO0000().isSelected()) {
                this.Object.null().setSelected(true);
            }
            this.Object.oo0000().setEnabled(false);
            this.Object.oO0000().setEnabled(false);
        } else {
            this.Object.\u00d200000(3).setEnabled(true);
            this.Object.\u00d200000(3).addActionListener(this);
            this.Object.\u00d3o0000().setEnabled(true);
            this.Object.newsuper().setEnabled(true);
            this.Object.oo0000().setEnabled(true);
            this.Object.oO0000().setEnabled(true);
        }
    }

    private void o00000() {
        if (this.Object.\u00f800000().isSelected() || this.Object.\u00d5O0000().isSelected()) {
            this.Object.\u00d200000(0).setEnabled(false);
            this.Object.\u00d200000(0).setSelectedItem(this.o00000);
        }
        if (this.Object.\u00d200000().isSelected() || this.Object.\u00d600000().isSelected()) {
            this.Object.\u00d200000(1).setEnabled(false);
            this.Object.\u00d200000(1).setSelectedItem(this.o00000);
        }
        if (this.Object.oo0000().isSelected() || this.Object.\u00d3o0000().isSelected()) {
            this.Object.\u00d200000(2).setEnabled(false);
            this.Object.\u00d200000(2).setSelectedItem(this.o00000);
        }
        if (this.Object.oO0000().isSelected() || this.Object.newsuper().isSelected()) {
            this.Object.\u00d200000(3).setEnabled(false);
            this.Object.\u00d200000(3).setSelectedItem(this.o00000);
        }
        if (this.Object.String().isSelected() || this.Object.\u00d800000().isSelected()) {
            this.Object.\u00d200000(4).setEnabled(false);
            this.Object.\u00d200000(4).setSelectedItem(this.o00000);
        }
        if (!this.Object.String(0).isSelected()) {
            if (!this.Object.\u00f800000().isSelected() && !this.Object.\u00d5O0000().isSelected()) {
                this.Object.\u00d200000(0).setEnabled(true);
            }
            if (!this.Object.\u00d200000().isSelected() && !this.Object.\u00d600000().isSelected()) {
                this.Object.\u00d200000(1).setEnabled(true);
            }
        }
        if (!this.Object.String(1).isSelected()) {
            if (!this.Object.oo0000().isSelected() && !this.Object.\u00d3o0000().isSelected()) {
                this.Object.\u00d200000(2).setEnabled(true);
            }
            if (!this.Object.oO0000().isSelected() && !this.Object.newsuper().isSelected()) {
                this.Object.\u00d200000(3).setEnabled(true);
            }
        }
        if (!this.Object.String().isSelected() && !this.Object.\u00d800000().isSelected()) {
            this.Object.\u00d200000(4).setEnabled(true);
        }
    }
}

