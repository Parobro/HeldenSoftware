/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.B;
import helden.framework.E.F;
import helden.framework.held.object.oooo_1;
import helden.gui.allgemein.Utils;
import helden.gui.super.C.A;
import helden.gui.super.C.G;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class float
implements ActionListener {
    private A \u00d200000;
    private JDialog o00000;
    private F[] Object;
    private oooo_1 \u00d400000;
    private int \u00d500000;

    public float(G g2, oooo_1 oooo_12, int n) {
        this.\u00d500000 = n;
        this.\u00d400000 = oooo_12;
        this.Object = new F[2];
        this.Object[0] = oooo_12.\u00d800000().o00000(n).\u00f5O0000(1);
        this.Object[1] = oooo_12.\u00d800000().o00000(n).\u00f5O0000(2);
        this.\u00d200000 = new A(oooo_12, this);
        this.o00000();
        this.o00000 = new JDialog(Utils.getFrame(g2), "", true);
        this.o00000.getContentPane().add(this.\u00d200000);
        this.o00000.setSize(700, 500);
        Utils.zentriere(this.o00000);
        if (this.Object[0] != null) {
            this.\u00d200000.\u00d200000().setSelectedItem(oooo_12.\u00d800000().o00000(n).\u00f600000(1));
            if (this.Object[0].o00000(B.\u00d400000, 0) != null && this.Object[0].o00000(B.\u00d300000, 0) != null) {
                this.\u00d200000.\u00d200000().setEnabled(true);
            } else {
                this.\u00d200000.\u00d200000().setEnabled(false);
            }
        } else {
            this.\u00d200000.\u00d200000().setEnabled(false);
        }
        if (this.Object[1] != null) {
            this.\u00d200000.\u00d800000().setSelectedItem(oooo_12.\u00d800000().o00000(n).\u00f600000(2));
            if (this.Object[1].o00000(B.\u00d400000, 0) != null && this.Object[1].o00000(B.\u00d300000, 0) != null) {
                this.\u00d200000.\u00d800000().setEnabled(true);
            } else {
                this.\u00d200000.\u00d800000().setEnabled(false);
            }
        } else {
            this.\u00d200000.\u00d800000().setEnabled(false);
        }
        this.o00000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n;
        String string;
        if (actionEvent.getSource() == this.\u00d200000.\u00d300000()) {
            this.\u00d400000.\u00d800000().o00000(this.\u00d500000).o00000(1, this.Object[0]);
            this.\u00d400000.\u00d800000().o00000(this.\u00d500000).\u00d200000(1, (String)this.\u00d200000.\u00d200000().getSelectedItem());
            this.\u00d400000.\u00d800000().o00000(this.\u00d500000).o00000(2, this.Object[1]);
            this.\u00d400000.\u00d800000().o00000(this.\u00d500000).\u00d200000(2, (String)this.\u00d200000.\u00d800000().getSelectedItem());
            this.o00000.setVisible(false);
        }
        if (actionEvent.getSource() == this.\u00d200000.o00000()) {
            this.o00000.setVisible(false);
        }
        if ((string = ((JButton)actionEvent.getSource()).getName()).startsWith("I") && string.length() > 1) {
            Integer.parseInt(string.substring(1));
        }
        if (string.startsWith("i")) {
            n = this.\u00d200000.String().getSelectedRow();
            this.\u00d200000.String().getModel().getValueAt(n, 2);
        }
        if (string.startsWith("ADD")) {
            n = Integer.parseInt(string.substring(3));
            int n2 = this.\u00d200000.String().getSelectedRow();
            if (n2 < 0) {
                JOptionPane.showConfirmDialog(this.\u00d200000, "Bitte treffen sie eine Auswahl in der Tabelle", "Nichts gew\u00e4hlt", -1);
            } else {
                F f2;
                this.Object[n - 1] = f2 = (F)this.\u00d200000.String().getModel().getValueAt(n2, 2);
                this.\u00d200000.o00000(n - 1).setText(f2.OO0000());
                if (n == 1) {
                    this.\u00d200000.\u00d200000().setSelectedItem(B.super(f2.float()));
                    if (f2.o00000(B.\u00d400000, 0) != null && f2.o00000(B.\u00d300000, 0) != null) {
                        this.\u00d200000.\u00d200000().setEnabled(true);
                    } else {
                        this.\u00d200000.\u00d200000().setEnabled(false);
                    }
                } else {
                    this.\u00d200000.\u00d800000().setSelectedItem(B.super(f2.float()));
                    if (f2.o00000(B.\u00d400000, 0) != null && f2.o00000(B.\u00d300000, 0) != null) {
                        this.\u00d200000.\u00d800000().setEnabled(true);
                    } else {
                        this.\u00d200000.\u00d800000().setEnabled(false);
                    }
                }
            }
        }
        if (((JButton)actionEvent.getSource()).getName().startsWith("REM")) {
            n = Integer.parseInt(string.substring(3));
            this.Object[n - 1] = null;
            this.\u00d200000.o00000(n - 1).setText("");
            if (n == 1) {
                this.\u00d200000.\u00d200000().setEnabled(false);
            } else {
                this.\u00d200000.\u00d800000().setEnabled(false);
            }
        }
    }

    private void o00000() {
        if (this.Object[0] != null) {
            this.\u00d200000.o00000(0).setText(this.Object[0].OO0000());
        }
        if (this.Object[1] != null) {
            this.\u00d200000.o00000(1).setText(this.Object[1].OO0000());
        }
    }
}

