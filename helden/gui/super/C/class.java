/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.A;
import helden.framework.E.F;
import helden.framework.E.if;
import helden.framework.OoOO.E;
import helden.framework.held.object.oooo_1;
import helden.gui.allgemein.Utils;
import helden.gui.super.C.G;
import helden.gui.super.C.Oo0O;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class class
implements ActionListener {
    private Oo0O o00000;
    private JDialog \u00d300000;
    private F[] String;
    private oooo_1 \u00d500000;
    private int \u00d600000;
    private if[] \u00d200000;

    public class(G g2, oooo_1 oooo_12, int n) {
        this.\u00d600000 = n;
        this.\u00d500000 = oooo_12;
        this.String = new F[3];
        this.String[0] = oooo_12.\u00d800000().o00000(n).\u00d500000(1);
        this.String[1] = oooo_12.\u00d800000().o00000(n).\u00d500000(2);
        this.String[2] = oooo_12.\u00d800000().o00000(n).\u00d500000(3);
        this.\u00d200000 = new if[3];
        this.\u00d200000[0] = oooo_12.\u00d800000().o00000(n).\u00f500000(1);
        this.\u00d200000[1] = oooo_12.\u00d800000().o00000(n).\u00f500000(2);
        this.\u00d200000[2] = oooo_12.\u00d800000().o00000(n).\u00f500000(3);
        this.o00000 = new Oo0O(oooo_12, this);
        this.o00000();
        if (n > 0) {
            this.o00000.o00000(0).setEnabled(false);
            this.o00000.o00000(1).setEnabled(false);
            this.o00000.o00000(2).setEnabled(false);
        }
        this.\u00d300000 = new JDialog(Utils.getFrame(g2), "Fernkampfwaffen", true);
        this.\u00d300000.getContentPane().add(this.o00000);
        this.\u00d300000.setSize(650, 350);
        Utils.zentriere(this.\u00d300000);
        this.\u00d300000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n;
        Object object;
        if (actionEvent.getSource() == this.o00000.\u00d500000()) {
            this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(1, this.String[0]);
            this.\u00d500000.\u00d800000().o00000(this.\u00d600000).o00000(1, this.\u00d200000[0]);
            this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(2, this.String[1]);
            this.\u00d500000.\u00d800000().o00000(this.\u00d600000).o00000(2, this.\u00d200000[1]);
            this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(3, this.String[2]);
            this.\u00d500000.\u00d800000().o00000(this.\u00d600000).o00000(3, this.\u00d200000[2]);
            if (this.o00000.o00000(0).isSelected()) {
                this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(1);
            } else if (this.o00000.o00000(1).isSelected()) {
                this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(2);
            } else if (this.o00000.o00000(2).isSelected()) {
                this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(3);
            } else {
                this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00d300000(0);
            }
            this.\u00d300000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.o00000()) {
            this.\u00d300000.setVisible(false);
        }
        if (actionEvent.getSource() instanceof JCheckBox) {
            object = (JCheckBox)actionEvent.getSource();
            n = Integer.parseInt(((Component)object).getName().substring(9));
            if (((AbstractButton)object).isSelected()) {
                if (n - 1 != 0 && this.o00000.o00000(0).isSelected()) {
                    this.o00000.o00000(0).setSelected(false);
                }
                if (n - 1 != 1 && this.o00000.o00000(1).isSelected()) {
                    this.o00000.o00000(1).setSelected(false);
                }
                if (n - 1 != 2 && this.o00000.o00000(2).isSelected()) {
                    this.o00000.o00000(2).setSelected(false);
                }
            }
        }
        if (actionEvent.getSource() instanceof JButton) {
            Object object2;
            Comparable<Object> comparable;
            object = ((JButton)actionEvent.getSource()).getName();
            if (((String)object).startsWith("I") && ((String)object).length() > 1 && this.String[(n = Integer.parseInt(((String)object).substring(1))) - 1] != null) {
                helden.framework.E.C.E e = (helden.framework.E.C.E)this.String[n - 1].o00000(A.\u00d800000, 0);
                comparable = null;
                comparable = this.\u00d200000[n - 1] != null ? this.\u00d200000[n - 1].super() : e.\u00f5o0000().get(0);
                object2 = (E)JOptionPane.showInputDialog(this.o00000, "Talent f\u00fcr " + this.String[n - 1].OO0000() + " ausw\u00e4hlen", "Fernkampfwaffen Talentauswahl", -1, null, e.\u00f5o0000().toArray(), comparable);
                if (object2 != null) {
                    this.\u00d200000[n - 1] = new if(e, (E)object2);
                }
            }
            if (((String)object).startsWith("i")) {
                n = this.o00000.\u00d400000().getSelectedRow();
                this.o00000.\u00d400000().getModel().getValueAt(n, 2);
            }
            if (((String)object).startsWith("ADD")) {
                n = Integer.parseInt(((String)object).substring(3));
                int n2 = this.o00000.\u00d400000().getSelectedRow();
                if (n2 < 0) {
                    JOptionPane.showConfirmDialog(this.o00000, "Bitte treffen sie eine Auswahl in der Tabelle", "Nichts gew\u00e4hlt", -1);
                } else {
                    comparable = (F)this.o00000.\u00d400000().getModel().getValueAt(n2, 2);
                    this.String[n - 1] = comparable;
                    object2 = (helden.framework.E.C.E)this.String[n - 1].o00000(A.\u00d800000, 0);
                    E e = ((helden.framework.E.C.E)object2).\u00f5o0000().get(0);
                    this.\u00d200000[n - 1] = new if((helden.framework.E.C.E)object2, e);
                    this.o00000.\u00d200000(n - 1).setText(((F)comparable).OO0000());
                    this.o00000.o00000(n - 1).setEnabled(true);
                    if (this.\u00d600000 > 0) {
                        this.o00000.o00000(0).setEnabled(false);
                        this.o00000.o00000(1).setEnabled(false);
                        this.o00000.o00000(2).setEnabled(false);
                    }
                }
            }
            if (((JButton)actionEvent.getSource()).getName().startsWith("REM")) {
                n = Integer.parseInt(((String)object).substring(3));
                this.String[n - 1] = null;
                this.o00000.\u00d200000(n - 1).setText("");
                this.o00000.o00000(n - 1).setEnabled(false);
                this.o00000.o00000(n - 1).setSelected(false);
            }
        }
    }

    private void o00000() {
        if (this.String[0] != null) {
            this.o00000.\u00d200000(0).setText(this.String[0].OO0000());
            this.o00000.o00000(0).setSelected(this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00f6O0000(1));
            this.o00000.o00000(0).setEnabled(true);
        }
        if (this.String[1] != null) {
            this.o00000.\u00d200000(1).setText(this.String[1].OO0000());
            this.o00000.o00000(1).setSelected(this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00f6O0000(2));
            this.o00000.o00000(1).setEnabled(true);
        }
        if (this.String[2] != null) {
            this.o00000.\u00d200000(2).setText(this.String[2].OO0000());
            this.o00000.o00000(2).setSelected(this.\u00d500000.\u00d800000().o00000(this.\u00d600000).\u00f6O0000(3));
            this.o00000.o00000(2).setEnabled(true);
        }
    }
}

