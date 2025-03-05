/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.OooO;
import helden.gui.importieren.ImportZustand;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Stringsuper
extends AbstractAction {
    private A o00000;

    public Stringsuper(A a2) {
        super("Importieren aus URL", OooO.\u00d300000().\u00d400000());
        this.o00000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new ImportZustand(this.o00000);
    }
}

