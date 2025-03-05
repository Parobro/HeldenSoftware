/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.Version;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.ooOO.privatesuper;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class interface
extends AbstractAction {
    private static interface o00000;
    private A new;

    public static interface o00000(A a2) {
        if (o00000 == null) {
            o00000 = new interface(a2);
        }
        return o00000;
    }

    private interface(A a2) {
        super("\u00dcber Helden ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/About.gif"))));
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JDialog jDialog = new JDialog(Utils.getFrame(this.new), "\u00dcber Helden Version: " + Version.getVersion(), true);
        privatesuper privatesuper2 = new privatesuper(jDialog);
        jDialog.getContentPane().add(privatesuper2);
        jDialog.setSize(600, 500);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
    }

    public void o00000() {
    }
}

