/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.comm.CommUtilities;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public final class p
extends AbstractAction {
    private static final long \u00d200000 = 7654938823429302837L;
    private static p o00000;

    public static p o00000(JComponent jComponent) {
        if (o00000 == null) {
            o00000 = new p(jComponent);
        }
        return o00000;
    }

    private p(JComponent jComponent) {
        super("Hilfe", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Question-small.gif"))));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = "http://wiki.helden-software.de/Steigern/Tabs/Infos";
        CommUtilities.showInBrowser(string);
    }
}

