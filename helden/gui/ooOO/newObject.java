/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.comm.CommUtilities;
import helden.gui.A;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class newObject
extends AbstractAction {
    private static newObject o00000;
    private A \u00d200000;

    public static newObject super(A a2) {
        if (o00000 == null) {
            o00000 = new newObject(a2);
        }
        return o00000;
    }

    private newObject(A a2) {
        super("Hilfe", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Question-small.gif"))));
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = "http://wiki.helden-software.de/Steigern/Tabs/" + this.\u00d200000.OO0000().replace(' ', '_').replace('/', '_');
        CommUtilities.showInBrowser(string);
    }
}

