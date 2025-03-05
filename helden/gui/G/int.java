/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.public;
import helden.framework.held.Object.O0OO;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.gui.g.oooo_1;
import helden.model.ProfessionenFabrik;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class int
extends oooo_1<super> {
    private int \u00d5O0000;

    public int(O0OO o0OO2, int n) {
        super(o0OO2, n == 0);
        this.\u00d5O0000 = n;
        super super_ = null;
        super_ = this.\u00d5O0000 == 0 ? o0OO2.oo0000() : o0OO2.newsuper();
        if (super_ != null && !super_.toString().equals("Professionslos")) {
            super super_2 = ProfessionenFabrik.getProfession(super_, this.\u00d300000().\u00d300000(), null, null);
            this.super(super_2);
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle eine Profession";
    }

    @Override
    public void class() {
        if (this.\u00d5O0000 == 1 && !this.\u00d600000().\u00d800000().o00000(I.O\u00f60000)) {
            this.\u00d600000().\u00d6O0000();
        }
    }

    @Override
    public boolean \u00d400000() {
        super super_ = (super)this.OO0000();
        super_.ueberpruefeAufEinzelVariante();
        if (this.\u00d5O0000 == 0) {
            if (this.\u00d600000().oo0000() == null || this.\u00d600000().oo0000().getClass() != super_.getClass()) {
                this.\u00d600000().\u00d300000(super_);
            }
            if (this.\u00f800000().\u00d200000(I.O\u00f60000.toString()) != null) {
                boolean bl = this.\u00f800000().o00000(I.O\u00f60000.toString());
                public public_ = K.o00000(I.O\u00f60000);
                if (bl && !this.\u00d300000().o00000(I.O\u00f60000)) {
                    this.\u00d600000().o00000(public_);
                }
                if (!bl && this.\u00d300000().o00000(I.O\u00f60000)) {
                    this.\u00d600000().\u00d200000(public_);
                    this.\u00d600000().\u00d6O0000();
                }
            }
        } else if (this.\u00d5O0000 == 1 && (this.\u00d600000().newsuper() == null || this.\u00d600000().newsuper().getClass() != super_.getClass())) {
            this.\u00d600000().\u00d200000(super_);
        }
        return true;
    }

    @Override
    protected ArrayList<super> \u00d800000() {
        OooO oooO2 = this.\u00d600000().\u00d800000().\u00f800000();
        return ProfessionenFabrik.getAlleProfessionen(oooO2.getGeschlecht(), oooO2.getMuttersprache(), oooO2.getSchrift());
    }

    @Override
    protected ArrayList<super> super(boolean bl) {
        OooO oooO2 = this.\u00d600000().\u00d800000().\u00f800000();
        ArrayList<super> arrayList = ProfessionenFabrik.getAlleProfessionen(this.\u00d300000().oO0000(), oooO2.getGeschlecht(), oooO2.getMuttersprache(), oooO2.getSchrift());
        return arrayList;
    }

    @Override
    protected void \u00f600000() {
        this.\u00f800000().o00000(I.O\u00f60000.toString(), "Breitgef\u00e4cherte Bildung");
        this.\u00f800000().\u00d200000(I.O\u00f60000.toString()).setSelected(this.\u00d300000().o00000(I.O\u00f60000));
    }
}

