/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.Object.O0OO;
import helden.framework.int.o0oo_0;
import helden.gui.g.oooo_1;
import helden.model.RassenFabrik;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class i
extends oooo_1<o0oo_0> {
    public i(O0OO o0OO2) {
        super(o0OO2, false);
        if (o0OO2.\u00d800000().o\u00d20000() != null && !o0OO2.\u00d800000().o\u00d20000().toString().equals("Rassenlos")) {
            this.super(RassenFabrik.getRasse(this.\u00d300000().o\u00d20000(), this.\u00d300000().\u00d300000()));
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle eine Rasse";
    }

    @Override
    public boolean \u00d400000() {
        Object object = this.OO0000();
        o0oo_0 o0oo_02 = (o0oo_0)object;
        o0oo_02.ueberpruefeAufEinzelVariante();
        if (this.\u00d600000().\u00d800000().o\u00d20000() == null || this.\u00d600000().\u00d800000().o\u00d20000().getClass() != o0oo_02.getClass()) {
            this.\u00d600000().o00000(o0oo_02);
        }
        return true;
    }

    @Override
    protected ArrayList<o0oo_0> \u00d800000() {
        return this.super(true);
    }

    @Override
    protected ArrayList<o0oo_0> super(boolean bl) {
        ArrayList<o0oo_0> arrayList = RassenFabrik.getRassen(this.\u00d300000().oO0000(), this.\u00d300000().\u00d300000(), bl);
        return arrayList;
    }
}

