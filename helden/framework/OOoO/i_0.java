/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oooo.c_0;
import helden.framework.oooo.o0oo_1;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.I
 */
public class i_0
extends W<Object> {
    private ArrayList<Object> OO0000;
    private c_0 float;

    public i_0(ArrayList<Object> arrayList, c_0 c_02) {
        super(1);
        this.OO0000 = arrayList;
        this.float = c_02;
    }

    @Override
    public ArrayList<Object> o00000() {
        return this.OO0000;
    }

    @Override
    public String return() {
        return "W\u00e4hle eine G\u00f6ttergeschenk-Auswirkung";
    }

    @Override
    public void o00000(int n, K k2) {
        this.float.o00000((o0oo_1)this.OO0000.get(n));
    }
}

