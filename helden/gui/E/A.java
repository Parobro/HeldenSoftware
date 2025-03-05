/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E;

import helden.gui.E.B.super;
import helden.gui.E.Object.D;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public final class A
extends AbstractAction {
    private static A o00000;
    private helden.gui.A \u00d200000;

    public static A o00000(helden.gui.A a2) {
        if (o00000 == null) {
            o00000 = new A(a2);
        }
        return o00000;
    }

    private A(helden.gui.A a2) {
        super("Helden-Online (Beta) ...", null);
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        D d2 = new D(this.\u00d200000);
        if (d2.\u00d200000()) {
            new super(this.\u00d200000);
        }
    }
}

