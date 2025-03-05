/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oOoO.for;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.o00O
 */
public class o00o_0
extends W<public> {
    private ArrayList<public> \u00d5O0000;
    private for \u00d4O0000;

    public static o00o_0 o00000(for for_, M<?> m, int n) {
        return new o00o_0(for_, m.\u00f4\u00d20000(), n);
    }

    public o00o_0(for for_, ArrayList<public> arrayList, int n) {
        super(n);
        this.\u00d4O0000 = for_;
        this.\u00d5O0000 = arrayList;
    }

    @Override
    public ArrayList<public> o00000() {
        return this.\u00d5O0000;
    }

    @Override
    public String return() {
        StringBuffer stringBuffer = new StringBuffer("W\u00e4hle ");
        if (this.\u00d800000() == 1) {
            stringBuffer.append("einen");
        } else {
            stringBuffer.append(this.\u00d800000());
        }
        public public_ = this.\u00d5O0000.get(0);
        if (public_.\u00d500000()) {
            stringBuffer.append(" Nachteil");
        } else {
            stringBuffer.append(" Vorteil");
        }
        if (this.\u00d800000() > 1) {
            stringBuffer.append("e");
        }
        return stringBuffer.toString();
    }

    public void o00000(public public_) {
        this.\u00d5O0000.remove(public_);
    }

    @Override
    public void o00000(int n, K k2) {
        this.\u00d4O0000.addAutomatischerVorteil(this.\u00d5O0000.get(n));
    }
}

