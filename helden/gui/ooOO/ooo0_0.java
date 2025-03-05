/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.gui.A;
import helden.gui.erschaffung.HauptDialog;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/*
 * Renamed from helden.gui.ooOO.OoO0
 */
public final class ooo0_0
extends AbstractAction {
    private static ooo0_0 o00000;
    private A \u00d200000;

    public static ooo0_0 o00000(A a2) {
        if (o00000 == null) {
            o00000 = new ooo0_0(a2);
        }
        return o00000;
    }

    public static Action o00000(A a2, JDialog jDialog) {
        if (o00000 == null) {
            o00000 = new ooo0_0(a2);
        }
        return o00000;
    }

    private ooo0_0(A a2) {
        super("Heldenerschaffung fortsetzen ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/New.gif"))));
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new HauptDialog(this.\u00d200000, true);
    }
}

