/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.String;

import helden.framework.held.Object.O0OO;
import helden.gui.G.D;
import helden.gui.G.String.oOOO;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends D {
    private JPanel \u00d500000;

    public C(O0OO o0OO2, boolean bl) {
        super(o0OO2);
        o0OO2.\u00d5O0000();
        oOOO oOOO2 = new oOOO(o0OO2, this);
        this.\u00d500000 = oOOO2.getPanel();
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle Sonderfertigkeiten";
    }

    @Override
    public JPanel super() {
        return this.\u00d500000;
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }
}

