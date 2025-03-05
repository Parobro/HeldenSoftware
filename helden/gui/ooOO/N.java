/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.allgemein.spielleiterBrief.SpielleiterBriefController;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class N
extends AbstractAction {
    private static N super;
    private A \u00d200000;

    public static N o00000(A a2) {
        if (super == null) {
            super = new N(a2);
        }
        return super;
    }

    private N(A a2) {
        super("Spielleiter-Brief drucken ...");
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new SpielleiterBriefController(this.\u00d200000);
    }
}

