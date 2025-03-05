/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.erschaffung.HauptDialog;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nullObject
extends AbstractAction {
    private static nullObject super;
    private static JDialog \u00d300000;
    private A \u00d200000;

    public static nullObject o00000(A a2) {
        if (super == null) {
            super = new nullObject(a2);
        }
        return super;
    }

    public static Action o00000(A a2, JDialog jDialog) {
        if (super == null) {
            super = new nullObject(a2);
        }
        \u00d300000 = jDialog;
        return super;
    }

    private nullObject(A a2) {
        super("Neuen Helden erschaffen ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/New.gif"))));
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new HauptDialog(this.\u00d200000, false);
        if (\u00d300000 != null) {
            \u00d300000.setVisible(false);
        }
    }
}

