/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OoOO.N;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Object.public;
import helden.framework.held.Stringsuper;
import helden.framework.held.class;
import helden.framework.oooo.o0oo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class o00O<T>
extends class<T> {
    private Map<oo0o_0, helden.framework.OoOO.D> do = new HashMap<oo0o_0, helden.framework.OoOO.D>();
    protected ArrayList<oo0o_0> OO0000 = new ArrayList();

    public o00O() {
    }

    public o00O(public public_) {
        super(public_);
    }

    public void \u00d300000(T t, int n) {
        try {
            int n2 = this.\u00f400000(t);
            int n3 = n2 + n;
            if (n3 > 0) {
                this.super(t, n3);
            } else {
                this.super(t);
            }
        }
        catch (D d2) {
            this.super(t, n);
        }
    }

    public void \u00d200000(oo0o_0 oo0o_02) {
        this.OO0000.add(oo0o_02);
    }

    public void \u00d200000(ArrayList<oo0o_0> arrayList) {
        this.OO0000.addAll(arrayList);
    }

    public void class(T t) throws D {
        this.super(t, this.\u00f400000(t) + 1);
    }

    public abstract s_0 super(oo0o_0 var1, K var2, boolean var3) throws Stringsuper;

    public int super(oo0o_0 oo0o_02, K k2, boolean bl, boolean bl2) throws Stringsuper {
        s_0 s_02 = this.super(oo0o_02, k2, bl2);
        if (bl) {
            s_02 = s_02.new();
        }
        float f2 = o0oo_0.super(s_02, bl2);
        return HeldenMath.runde(this.super(oo0o_02, k2, f2));
    }

    public ArrayList<T> super(Settings settings) {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper object2 : N.floatsuper().super(settings)) {
            if (this.\u00d300000(object2)) continue;
            arrayList.add(object2);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        return new ArrayList(arrayList2);
    }

    public ArrayList<oo0o_0> \u00d6O0000() {
        return this.OO0000;
    }

    public helden.framework.OoOO.D super(oo0o_0 oo0o_02) {
        helden.framework.OoOO.D d2 = this.do.get(oo0o_02);
        if (d2 == null) {
            d2 = helden.framework.OoOO.D.Object;
            this.super(oo0o_02, d2);
        }
        return d2;
    }

    public abstract float \u00d200000(oo0o_0 var1, K var2, boolean var3) throws Stringsuper;

    public T super(String string) {
        Object object = null;
        Iterator iterator = this.super();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!object.toString().equals(string)) continue;
            return (T)object;
        }
        throw new X("AbstraktesTalent " + string + " nicht vorhanden/aktiviert");
    }

    public int \u00f400000(T t) throws D {
        if (!this.\u00d300000(t)) {
            throw new D(t.toString());
        }
        return this.\u00d200000(t);
    }

    public int \u00d800000(T t) {
        if (!this.\u00d300000(t)) {
            return 0;
        }
        return this.\u00d200000(t);
    }

    public boolean int(T t) {
        return this.\u00d300000(t);
    }

    public boolean super(oo0o_0 oo0o_02, K k2) {
        return oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d200000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d300000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d3O0000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000) && !k2.o00000(I.\u00d5\u00d3O000);
    }

    public boolean \u00d200000(oo0o_0 oo0o_02, K k2) {
        boolean bl = oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d200000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d300000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d3O0000) || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000) && !k2.o00000(I.\u00d5\u00d3O000);
        switch (k2.oO0000().getHauptSetting()) {
            case \u00f600000: {
                return bl || oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000);
            }
        }
        return bl;
    }

    public abstract boolean super(oo0o_0 var1, Oo0O var2);

    public void \u00d300000(oo0o_0 oo0o_02) {
        this.OO0000.remove(oo0o_02);
    }

    public void \u00d600000(T t) throws D {
        this.super(t, this.\u00f400000(t) - 1);
    }

    public void super(oo0o_0 oo0o_02, helden.framework.OoOO.D d2) {
        this.do.put(oo0o_02, d2);
    }

    public boolean \u00d200000(T t, int n) {
        int n2 = -99999;
        try {
            n2 = this.\u00f400000(t);
        }
        catch (D d2) {
            // empty catch block
        }
        return n2 < n;
    }

    protected float super(oo0o_0 oo0o_02, K k2, float f2) {
        KonkreterZauber konkreterZauber;
        if (k2.o00000(I.OO\u00d2000) && this.super(oo0o_02, k2)) {
            if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
                konkreterZauber = (KonkreterZauber)oo0o_02;
                f2 = k2.new(while.\u00d3\u00d2\u00d5000.toString()) && konkreterZauber.getRep().equals(helden.framework.OOoO.K.\u00f800000) ? f2 * 1.0f / 3.0f : (f2 /= 2.0f);
            } else {
                f2 /= 2.0f;
            }
        }
        if (k2.o00000(I.\u00d4\u00d5o000) && this.\u00d200000(oo0o_02, k2)) {
            if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
                konkreterZauber = (KonkreterZauber)oo0o_02;
                f2 = k2.new(while.\u00d3\u00d2\u00d5000.toString()) && konkreterZauber.getRep().equals(helden.framework.OOoO.K.\u00f800000) ? f2 * 2.0f / 3.0f : f2 * 3.0f / 4.0f;
            } else {
                f2 = f2 * 3.0f / 4.0f;
            }
        }
        return f2;
    }
}

