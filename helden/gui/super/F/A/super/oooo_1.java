/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.f.a.super;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.super.F.A.super.oooO
 */
public class oooo_1
extends voidsuper {
    private I \u00f8o0000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> privatesuper;

    public oooo_1(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, I i2) {
        this.privatesuper = arrayList;
        this.\u00f8o0000 = i2;
    }

    @Override
    public ArrayList<voidsuper> super() {
        return new ArrayList<voidsuper>();
    }

    @Override
    public String super(int n) {
        if (n == 0) {
            return this.toString();
        }
        if (this.privatesuper.size() >= n && this.privatesuper.get(n - 1).\u00d500000().\u00d400000(this.\u00f8o0000)) {
            public public_ = this.privatesuper.get(n - 1).\u00d500000().\u00d300000(this.\u00f8o0000);
            if (public_ instanceof J) {
                return "--AKTIVIERT--" + ((J)public_).ObjectString();
            }
            if (public_ instanceof M) {
                String string = ((M)public_).oO0000().substring(this.\u00f8o0000.toString().length() + 1);
                return "--AKTIVIERT--" + string;
            }
            if (public_ instanceof D) {
                return "--AKTIVIERT--" + ((D)public_).oO0000();
            }
            return "--AKTIVIERT--";
        }
        return "";
    }

    public String toString() {
        return this.\u00f8o0000.toString();
    }
}

