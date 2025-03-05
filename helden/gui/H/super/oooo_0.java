/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.h.super;

import helden.framework.held.K;
import helden.framework.settings.Setting;
import helden.gui.A;
import helden.gui.H.super.D;
import helden.gui.H.super.OoOO;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Renamed from helden.gui.H.super.oOOO
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oooo_0
extends AbstractAction {
    private static oooo_0 o00000;
    private A new;
    private K \u00d300000;

    public static oooo_0 o00000(A a2) {
        if (o00000 == null) {
            o00000 = new oooo_0(a2);
        }
        return o00000;
    }

    private oooo_0(A a2) {
        super("Sp\u00e4tweihe ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Blank.gif"))));
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.\u00d300000 = (K)this.new.\u00d2O0000();
        if (this.\u00d300000.o00000(Setting.returnsuper)) {
            D d2 = new D(this.\u00d300000, this.new);
            d2.o00000();
        } else if (this.\u00d300000.o00000(Setting.\u00f600000)) {
            OoOO ooOO2 = new OoOO(this.\u00d300000, this.new);
            ooOO2.o00000();
        } else {
            String string = "Eine Sp\u00e4tweihe in diesem Setting ist noch nicht m\u00f6glich.\n\n";
            JOptionPane.showMessageDialog(null, string, "Sp\u00e4tweihe", 0);
            return;
        }
    }
}

