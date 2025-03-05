/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.Object.O0OO;
import helden.framework.int.OooO;
import helden.gui.g.oooo_1;
import helden.model.KulturFabrik;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class M
extends oooo_1<OooO> {
    public M(O0OO o0OO2) {
        super(o0OO2, true);
        if (o0OO2.\u00d800000().\u00f800000() != null && !o0OO2.\u00d800000().\u00f800000().toString().equals("Kulturlos")) {
            OooO oooO2 = this.\u00d300000().\u00f800000();
            this.super(KulturFabrik.getKultur(oooO2, this.\u00d300000().\u00d300000()));
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle die Kultur";
    }

    @Override
    public boolean \u00d400000() {
        Object object = this.OO0000();
        boolean bl = false;
        OooO oooO2 = (OooO)object;
        oooO2.ueberpruefeAufEinzelVariante();
        if (this.\u00d600000().\u00d800000().\u00f800000() == null || this.\u00d600000().\u00d800000().\u00f800000().getClass() != oooO2.getClass() || bl) {
            this.\u00d600000().o00000(oooO2);
        }
        return true;
    }

    @Override
    protected ArrayList<OooO> \u00d800000() {
        return KulturFabrik.getKulturen(this.\u00d300000().o\u00d20000().getGeschlecht());
    }

    @Override
    protected ArrayList<OooO> super(boolean bl) {
        ArrayList<OooO> arrayList = KulturFabrik.getKulturen(this.\u00d300000().oO0000(), this.\u00d300000().o\u00d20000().getGeschlecht());
        return arrayList;
    }

    @Override
    protected void \u00f600000() {
    }
}

