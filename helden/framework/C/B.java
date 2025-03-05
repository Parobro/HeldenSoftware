/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.I;
import helden.framework.C.o0OO;
import helden.framework.OOoO.R;
import helden.framework.oooo.oooo_0;
import helden.framework.settings.Settings;
import java.util.ArrayList;

public class B
extends o0OO {
    public B(I i2, double d2, int n, int n2) {
        super(i2, true, 99, n2, 0, 12, d2, n);
        this.o00000(new oooo_0(){

            @Override
            public String super(R r) {
                return r.o00000(1) + " " + r.o00000(0);
            }
        });
    }

    public void o00000(String string, Integer n) {
        R r = new R(n, string);
        this.o00000(r);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        B b = new B(this.\u00f4O0000(), this.\u00d2\u00d40000(), this.o\u00d40000(), this.\u00d4\u00d40000());
        this.o00000(b);
        return b;
    }

    @Override
    public ArrayList o00000(int n, Settings settings, R r) {
        boolean bl;
        if (n > 0) {
            return super.o00000(n, settings, r);
        }
        if (r == null) {
            return B.o00000(this.\u00d4\u00d40000(), this.\u00d5\u00d40000(), this.o\u00d40000());
        }
        boolean bl2 = bl = this.\u00d6O0000(r) != null;
        if (bl) {
            ArrayList arrayList = B.o00000(0, (int)this.\u00d6O0000(r), 1);
            arrayList.addAll(B.o00000(this.\u00d6O0000(r) + this.o\u00d40000(), 12, this.o\u00d40000()));
            return arrayList;
        }
        return B.o00000(this.\u00d4\u00d40000(), this.\u00d5\u00d40000(), this.o\u00d40000());
    }

    @Override
    public ArrayList o00000(int n, Settings settings) {
        if (n > 0) {
            return super.o00000(n, settings, null);
        }
        return B.o00000(1, this.\u00d5\u00d40000(), 1);
    }

    @Override
    public boolean O\u00d20000() {
        return true;
    }
}

