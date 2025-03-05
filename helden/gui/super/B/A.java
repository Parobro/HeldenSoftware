/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.framework.held.K;
import helden.framework.held.O;
import helden.gui.super.B.P;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class A
implements ActionListener {
    private P o00000;
    private JDialog \u00d400000;
    private O Object;
    private F[] \u00d200000;
    private int \u00d500000;

    public A(O o, K k2, F[] fArray, P p2) {
        int n;
        p2.super(fArray);
        this.o00000 = p2;
        this.\u00d200000 = fArray;
        this.Object = o;
        int n2 = -1;
        this.\u00d500000 = 0;
        for (n = 0; n < fArray.length; ++n) {
            if (!k2.o00000(0).\u00d200000(fArray[n]) && !k2.o00000(1).\u00d200000(fArray[n]) && !k2.o00000(2).\u00d200000(fArray[n])) continue;
            n2 = n;
        }
        if (n2 > -1) {
            for (n = 0; n < fArray.length; ++n) {
                p2.super(n).setEnabled(false);
                if (n != n2) continue;
                p2.super(n).setSelected(true);
            }
        } else {
            p2.super(0).setSelected(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.o00000.\u00d400000())) {
            F[] fArray = this.Object.\u00d300000(this.\u00d200000[0].toString());
            F f2 = null;
            for (int i2 = 0; i2 < this.\u00d200000.length; ++i2) {
                if (!this.o00000.super(i2).isSelected()) continue;
                f2 = this.\u00d200000[i2];
            }
            for (F f3 : this.\u00d200000) {
                for (int i3 = 0; i3 < fArray.length; ++i3) {
                    if (fArray[i3] != null && fArray[i3].equals(f3) && !fArray[i3].equals(f2)) {
                        this.\u00d500000 += fArray[i3].\u00f500000();
                        fArray[i3] = null;
                        continue;
                    }
                    if (fArray[i3] == null || !fArray[i3].equals(f3) || !fArray[i3].equals(f2)) continue;
                    this.\u00d500000 += fArray[i3].\u00f500000();
                }
            }
            if (this.\u00d500000 > 1000) {
                int n = JOptionPane.showConfirmDialog(this.o00000, "Die Gesammtanzahl \u00fcberschreitet das Maximum von 1000!\nSoll die Anzahl auf 1000 zur\u00fcck gesetzt werden?", "Maximale Anzahl \u00fcberschritten!", 0);
                if (n == 0) {
                    this.\u00d500000 = 1000;
                } else {
                    return;
                }
            }
            f2.Object(this.\u00d500000);
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource().equals(this.o00000.super())) {
            this.\u00d400000.setVisible(false);
        }
    }

    public void o00000(JDialog jDialog) {
        this.\u00d400000 = jDialog;
    }
}

