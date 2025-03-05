/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.B.D;
import helden.gui.super.B.M;
import helden.gui.super.B.int;
import helden.gui.super.B.interface;
import helden.gui.super.b.oo0o_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class F
implements ActionListener {
    private int o00000;
    private D return;
    private M \u00d500000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO new;
    private JTable \u00d400000;
    private interface \u00d300000;

    public F(interface interface_) {
        this.\u00d300000 = interface_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (((JButton)actionEvent.getSource()).getText().equals("+")) {
            helden.framework.E.F f2 = this.o00000.o00000((JButton)actionEvent.getSource());
            if (f2 != null && f2.\u00f500000() < 1000) {
                ((K)this.new).ifnew().\u00d300000();
                f2.Object(f2.\u00f500000() + 1);
                if (f2.\u00f500000() == 1000) {
                    ((JButton)actionEvent.getSource()).setEnabled(false);
                }
                ((oo0o_0)this.\u00d400000.getModel()).fireTableDataChanged();
            }
        } else if (((JButton)actionEvent.getSource()).getText().equals("-")) {
            helden.framework.E.F f3 = this.return.super((JButton)actionEvent.getSource());
            if (f3 != null && f3.\u00f500000() > 1) {
                f3.Object(f3.\u00f500000() - 1);
                if (f3.\u00f500000() == 1) {
                    ((JButton)actionEvent.getSource()).setEnabled(false);
                }
                ((oo0o_0)this.\u00d400000.getModel()).fireTableDataChanged();
            }
        } else {
            helden.framework.E.F f4 = this.\u00d500000.super((JButton)actionEvent.getSource());
            if (f4 != null) {
                if (this.new.o00000(0).\u00d200000(f4) || this.new.o00000(1).\u00d200000(f4) || this.new.o00000(2).\u00d200000(f4)) {
                    JOptionPane.showMessageDialog(this.\u00d400000, "Der Gegenstand wird im Moment in der Ausr\u00fcstung benutzt.\nBitte diesen Gegenstand aus der Ausr\u00fcstung entfernen!" + f4.OO0000(), "Wird Benutzt", 0);
                } else {
                    for (int i2 = 0; i2 < this.new.\u00d8o0000().\u00d300000(); ++i2) {
                        if (!f4.equals(this.new.\u00d8o0000().\u00d300000(f4.toString())[i2])) continue;
                        this.new.\u00d8o0000().\u00d300000((String)f4.toString())[i2] = null;
                    }
                    this.new.\u00d8o0000().o00000();
                    this.\u00d300000.o00000();
                }
            }
        }
    }

    public void o00000(int intVal) {
        this.o00000 = intVal;
    }

    public void o00000(M m) {
        this.\u00d500000 = m;
    }

    public void o00000(D d2) {
        this.return = d2;
    }

    public void o00000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.new = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    public void o00000(JTable jTable) {
        this.\u00d400000 = jTable;
    }
}

