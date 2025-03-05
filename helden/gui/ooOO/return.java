/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.pfadEinstellung.PfadEinstellungsController;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class return
extends AbstractAction {
    private static return o00000;
    private A new;

    public static return o00000(A a2) {
        if (o00000 == null) {
            o00000 = new return(a2);
        }
        return o00000;
    }

    private return(A a2) {
        super("Speicherpfade \u00e4ndern ...");
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new PfadEinstellungsController(this.new);
    }
}

