/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.held.L;
import helden.framework.oOoO.floatsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.r_0;
import helden.framework.oooo.string_1;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;

/*
 * Renamed from helden.framework.oOoO.A
 */
public class a_1
extends o0oo_2
implements string_1<oo0o_0> {
    private k_0<oo0o_0> \u00d500000;

    public a_1(floatsuper floatsuper2, ArrayList<oo0o_0> arrayList, int[] nArray, String string, k_0<oo0o_0> k_02) {
        super(floatsuper2, arrayList, nArray, string);
        this.\u00d500000 = k_02;
    }

    @Override
    public void o00000(int n, int n2, r_0 r_02, L l2) {
        this.o00000(n, n2, r_02, l2, false);
    }

    @Override
    public void o00000(int n, int n2, r_0 r_02, L l2, boolean bl) {
        if (n >= this.\u00d200000.size()) {
            System.out.println("Talentauswahl Index ung\u00fcltig Size: " + this.\u00d200000.size() + " Idx: " + n);
        }
        oo0o_0 oo0o_02 = (oo0o_0)this.\u00d200000.get(n);
        int n3 = this.Object[n2];
        if (!bl) {
            if (oo0o_02.istZauber()) {
                l2.super((KonkreterZauber)oo0o_02, (Integer)(n3 - this.\u00d500000.Object(oo0o_02)));
            } else {
                r_02.o00000(oo0o_02, n3 - this.\u00d500000.Object(oo0o_02));
            }
        }
        this.o00000.setTalentauswahl(oo0o_02, n3);
    }
}

