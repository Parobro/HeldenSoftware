/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_3;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.oOoo
 */
public class oooo_6
extends W<interface> {
    private ArrayList<interface> \u00d2o0000;
    private oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_3 oo0000;

    public oooo_6(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_3 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_32, ArrayList<interface> arrayList, int n) {
        super(n);
        this.oo0000 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_32;
        this.\u00d2o0000 = arrayList;
    }

    @Override
    public ArrayList<interface> o00000() {
        return this.\u00d2o0000;
    }

    @Override
    public String return() {
        StringBuffer stringBuffer = new StringBuffer("W\u00e4hle ");
        if (this.\u00d800000() == 1) {
            stringBuffer.append("ein Talent:");
        } else {
            stringBuffer.append(this.\u00d800000());
            stringBuffer.append(" Talente:");
        }
        return stringBuffer.toString();
    }

    @Override
    public void o00000(int n, K k2) {
        this.oo0000.addTalentTyp2Auswahl(this.\u00d2o0000.get(n));
        interface interface_ = this.\u00d2o0000.get(n);
        k2.\u00f8O0000().\u00d300000((voidsuper)interface_.new(), interface_.\u00d300000());
    }
}

