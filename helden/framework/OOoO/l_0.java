/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.oooo.b_0;

/*
 * Renamed from helden.framework.OoOO.L
 */
public class l_0 {
    private b_0[] o00000 = new b_0[3];

    public l_0(b_0 b_02, b_0 b_03, b_0 b_04) {
        this.o00000[0] = b_02;
        this.o00000[1] = b_03;
        this.o00000[2] = b_04;
    }

    public b_0 o00000(int n) {
        return this.o00000[n];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" (");
        stringBuffer.append(this.o00000[0].O\u00d60000());
        stringBuffer.append("/");
        stringBuffer.append(this.o00000[1].O\u00d60000());
        stringBuffer.append("/");
        stringBuffer.append(this.o00000[2].O\u00d60000());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}

