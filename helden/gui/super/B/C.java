/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.gui.super.B.OO0O;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
implements ActionListener {
    private OO0O super;
    private JDialog \u00d300000;
    private F \u00d200000;

    public C(OO0O oO0O2, F f2) {
        this.\u00d200000 = f2;
        this.super = oO0O2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.super.o00000() && JOptionPane.showConfirmDialog(this.super, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.\u00d300000.setVisible(false);
        }
        if (actionEvent.getSource() == this.super.\u00d600000() && this.super.String().super(this.\u00d200000)) {
            this.\u00d200000.o00000(this.super.\u00d500000());
            this.\u00d300000.setVisible(false);
        }
    }

    public void o00000(JDialog jDialog) {
        this.\u00d300000 = jDialog;
    }
}

