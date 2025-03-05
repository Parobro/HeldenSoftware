/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.object;

import helden.framework.A.A;
import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.C;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Object.H;
import helden.framework.held.Stringsuper;
import helden.framework.held.U;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;

/*
 * Renamed from helden.framework.held.Object.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
 */
public class o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0
extends H {
    private oooo_1 \u00d3O0000;

    public o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(K k2) {
        super(k2);
        this.\u00d3O0000 = new oooo_1(k2);
    }

    public void o00000(P p2, String string) {
        this.\u00d3O0000.\u00d300000(p2);
        A a2 = new A("Sonderfertigkeit hinzugef\u00fcgt", p2.toString(), string);
        this.\u00d800000().o00000(a2);
    }

    public void o00000(String string, String string2) {
        this.o00000(oooo_0.o00000(string), string2);
    }

    public void o00000(I i2, String string) {
        super.o00000(helden.framework.C.K.o00000(i2));
        A a2 = new A("Vor-/Nachteil hinzugef\u00fcgt", i2.toString(), string);
        this.\u00d800000().o00000(a2);
    }

    public void o00000(public public_, String string) {
        try {
            super.o00000((public)public_.clone());
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            super.o00000(public_);
        }
        A a2 = new A("Vor-/Nachteil hinzugef\u00fcgt", public_.toString(), string);
        this.\u00d800000().o00000(a2);
    }

    public void o00000(int n, String string) {
        this.\u00d3O0000.o00000(n, string, "", "", "", "", "");
    }

    public void \u00d200000(int n, String string) {
        int n2 = this.\u00d800000().o00000(b_0.\u00f5\u00f5\u00d2000);
        int n3 = n2 + n;
        try {
            this.\u00d3O0000.\u00d500000(n3);
        }
        catch (C c) {
            // empty catch block
        }
        A a2 = new A("Eigenschaft steigern", b_0.\u00f5\u00f5\u00d2000.toString(), string);
        a2.o00000("" + n2, "" + n3);
        this.\u00d800000().o00000(a2);
    }

    public A \u00d8o0000() {
        return this.\u00d800000().if().o00000();
    }

    public void o00000(voidsuper voidsuper2, int n, String string) {
        int n2 = 0;
        boolean bl = false;
        if (this.\u00d800000().\u00f8O0000().\u00d300000(voidsuper2)) {
            try {
                n2 = this.\u00d800000().\u00d300000((oo0o_0)voidsuper2);
            }
            catch (D d2) {}
        } else {
            bl = true;
        }
        this.\u00d800000().\u00f8O0000().\u00d300000(voidsuper2, n);
        A a2 = new A("Talent steigern", voidsuper2.toString(), string);
        a2.o00000("" + n2, "" + (n2 + n));
        this.\u00d800000().o00000(a2);
        if (bl && voidsuper2.isKampftalent()) {
            E e = (E)voidsuper2;
            this.\u00d800000().o00000((voidsuper)e, new U(e, this.\u00d800000().\u00f8O0000()));
        }
    }

    public boolean \u00d300000(voidsuper voidsuper2, int n) {
        boolean bl = true;
        try {
            if (this.\u00d800000().\u00d300000((oo0o_0)voidsuper2) < n) {
                bl = false;
            }
        }
        catch (Stringsuper stringsuper) {
            bl = false;
        }
        return !bl;
    }

    public boolean \u00d200000(voidsuper voidsuper2, int n) {
        try {
            if (this.\u00d800000().\u00d300000((oo0o_0)voidsuper2) >= n) {
                return true;
            }
        }
        catch (D d2) {
            // empty catch block
        }
        return false;
    }
}

