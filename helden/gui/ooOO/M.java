/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.allgemein.druckeinstellungen.DruckeinstellungenPanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class M
extends AbstractAction {
    private static M super;
    private A \u00d200000;

    public static M o00000(A a2) {
        if (super == null) {
            super = new M(a2);
        }
        return super;
    }

    private M(A a2) {
        super("Seiten / Hintergund w\u00e4hlen");
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DruckeinstellungenPanel druckeinstellungenPanel = new DruckeinstellungenPanel(this.\u00d200000, null);
        druckeinstellungenPanel.zeigePanel();
    }
}

