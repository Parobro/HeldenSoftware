/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oOoO;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.n_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.r_0;
import helden.framework.oooo.string_1;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class returnsuper
implements string_1<oo0o_0> {
    private ArrayList<oo0o_0> dosuper;
    private int \u00d5o0000;
    private int \u00d4o0000;
    private int \u00f5o0000;
    private int \u00f4o0000;
    private int \u00d6o0000;
    private n_0 intsuper;
    private String \u00f6o0000;

    public returnsuper(n_0 n_02, ArrayList<oo0o_0> arrayList, int n, int n2) {
        this.intsuper = n_02;
        this.dosuper = arrayList;
        this.\u00d5o0000 = n;
        this.\u00d4o0000 = n2;
        this.\u00f4o0000 = -1;
        this.\u00d6o0000 = -1;
        this.\u00f5o0000 = 0;
    }

    public returnsuper(n_0 n_02, ArrayList<oo0o_0> arrayList, int n, int n2, int n3) {
        this.intsuper = n_02;
        this.dosuper = arrayList;
        this.\u00d5o0000 = n;
        this.\u00f4o0000 = n2;
        this.\u00d6o0000 = n2;
        this.\u00f5o0000 = n3;
        this.\u00d4o0000 = n;
    }

    public returnsuper(n_0 n_02, ArrayList<oo0o_0> arrayList, int n, int n2, int n3, int n4) {
        this.intsuper = n_02;
        this.dosuper = arrayList;
        this.\u00d5o0000 = n;
        this.\u00f4o0000 = n2;
        this.\u00d6o0000 = n2;
        this.\u00f5o0000 = n3;
        this.\u00d4o0000 = n4;
    }

    public returnsuper(n_0 n_02, ArrayList<oo0o_0> arrayList, int n, int n2, int n3, int n4, int n5) {
        this.intsuper = n_02;
        this.dosuper = arrayList;
        this.\u00d5o0000 = n;
        this.\u00f4o0000 = n2;
        this.\u00d6o0000 = n3;
        this.\u00f5o0000 = n4;
        this.\u00d4o0000 = n5;
    }

    @Override
    public ArrayList<oo0o_0> o00000() {
        return this.dosuper;
    }

    public String \u00f400000() {
        return this.\u00f6o0000;
    }

    public int if() {
        return this.\u00d6o0000;
    }

    public int oO0000() {
        return this.\u00d4o0000;
    }

    public int \u00f500000() {
        return this.\u00f4o0000;
    }

    public int OO0000() {
        return this.\u00f5o0000;
    }

    public int while() {
        return this.\u00d5o0000;
    }

    public boolean \u00f800000() {
        return this.\u00f4o0000 != -1 || this.\u00d6o0000 != -1;
    }

    public void new(String string) {
        this.\u00f6o0000 = string;
    }

    public void o00000(int n, int n2, r_0 r_02) {
        voidsuper voidsuper2 = (voidsuper)this.dosuper.get(n);
        r_02.o00000(voidsuper2, n2);
        this.intsuper.setTalentauswahl(voidsuper2, n2);
    }
}

