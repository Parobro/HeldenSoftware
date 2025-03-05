/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.framework.Einstellungen;
import helden.gui.A;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class O
implements ChangeListener {
    private A o00000;

    public O(A a2) {
        this.o00000 = a2;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource().equals(this.o00000.Objectsuper().getModel())) {
            int n = this.o00000.Objectsuper().getSelectedIndex();
            Einstellungen.getInstance().setLastSelectedListeTree(n);
            if (n > 0) {
                this.o00000.\u00d600000().o00000(true);
            } else {
                this.o00000.\u00d600000().o00000(false);
            }
        }
    }
}

