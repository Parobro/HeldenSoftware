/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.D;
import helden.framework.C.OoOO.A;
import helden.framework.C.o0OO;
import helden.framework.OOoO.R;
import java.util.TreeSet;

public class void
extends D<R>
implements A {
    protected void(o0OO o0OO2) {
        super(o0OO2);
    }

    public void \u00f5\u00d50000() {
        this.\u00f6\u00d50000().\u00d5O0000((R)this.\u00f4o0000());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        void void_ = new void(this.\u00f6\u00d50000());
        void_.o00000(new TreeSet(this.intsuper()));
        return void_;
    }

    @Override
    public int \u00d600000() {
        float f2 = (float)this.\u00f6\u00d50000().\u00d2\u00d40000();
        if (this.O\u00d20000()) {
            return Math.round(f2 * -50.0f);
        }
        return Math.round(f2 * -100.0f);
    }

    @Override
    public int supersuper() {
        if (this.\u00f5o0000() == null) {
            return 0;
        }
        return this.\u00f5o0000().\u00d200000(this.\u00f4o0000());
    }

    public o0OO \u00f6\u00d50000() {
        o0OO o0OO2 = (o0OO)this.\u00f5o0000();
        return o0OO2;
    }

    @Override
    public boolean O\u00d20000() {
        return this.\u00f6\u00d50000().O\u00d20000();
    }

    @Override
    public String oO0000() {
        StringBuffer stringBuffer = new StringBuffer(this.toString());
        stringBuffer.append(": ");
        if (this.intsuper().size() > 0 && this.\u00f4o0000() != null) {
            stringBuffer.append(((R)this.\u00f4o0000()).toString());
        }
        return stringBuffer.toString();
    }
}

