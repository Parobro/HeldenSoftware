/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.Object.O0OO;
import helden.gui.G.D;
import helden.gui.G.oOOO.B;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class V
extends D {
    private B \u00d4o0000;

    public V(O0OO o0OO2) {
        super(o0OO2);
        this.\u00d4o0000 = new B(o0OO2);
        this.\u00d4o0000.createPanel();
    }

    @Override
    public String \u00d200000() {
        return "Vor- und Nachteile";
    }

    @Override
    public JPanel super() {
        return this.\u00d4o0000.getPanel();
    }
}

