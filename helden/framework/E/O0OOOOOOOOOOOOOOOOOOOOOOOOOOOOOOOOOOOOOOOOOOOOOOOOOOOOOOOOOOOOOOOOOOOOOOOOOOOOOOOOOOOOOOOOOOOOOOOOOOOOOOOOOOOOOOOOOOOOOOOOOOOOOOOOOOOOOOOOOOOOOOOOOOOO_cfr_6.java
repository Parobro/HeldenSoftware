/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E;

import helden.framework.E.F;
import helden.framework.E.Object;
import helden.framework.E.super.E;
import helden.framework.E.super.H;
import helden.framework.E.super.I;
import helden.framework.E.super.K;
import helden.framework.E.super.N;
import helden.framework.E.super.O;
import helden.framework.E.super.OO0O;
import helden.framework.E.super.OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.super.Objectsuper;
import helden.framework.E.super.OoOO;
import helden.framework.E.super.P;
import helden.framework.E.super.Q;
import helden.framework.E.super.V;
import helden.framework.E.super.Y;
import helden.framework.E.super.Z;
import helden.framework.E.super.a;
import helden.framework.E.super.if;
import helden.framework.E.super.intsuper;
import helden.framework.E.super.o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.super.o0oo;
import helden.framework.E.super.returnsuper;
import helden.framework.E.super.super;
import helden.framework.E.super.thissuper;
import helden.framework.E.super.void;
import helden.framework.e.super.oo0o_0;
import helden.framework.e.super.oooo_0;
import helden.framework.e.super.oooo_1;
import helden.framework.e.super.oooo_2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO {
    private static O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d400000;
    private HashMap<Object, ArrayList<F>> \u00d300000 = new HashMap();
    private ArrayList<F> \u00d200000;
    private ArrayList<F> class;
    private HashMap<String, F> super;

    public static O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d400000() {
        if (\u00d400000 == null) {
            \u00d400000 = new O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO();
        }
        return \u00d400000;
    }

    private O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO() {
    }

    public ArrayList<F> Object() {
        if (this.\u00d200000 == null) {
            this.o00000(false);
            this.\u00d200000 = new ArrayList();
            for (ArrayList<F> arrayList : this.\u00d300000.values()) {
                this.\u00d200000.addAll(arrayList);
            }
        }
        return this.\u00d200000;
    }

    public Object[] \u00d500000() {
        return Object.o00000();
    }

    public F o00000(String string) {
        if (this.super == null) {
            this.super = new HashMap();
            for (F f2 : this.Object()) {
                this.super.put(f2.toString(), f2);
            }
        }
        return this.super.get(string);
    }

    public ArrayList<F> o00000(Object object) {
        return this.\u00d300000.get((java.lang.Object)object);
    }

    public ArrayList<F> o00000() {
        if (this.class == null) {
            this.o00000(true);
            this.class = new ArrayList();
            this.class.addAll((Collection<F>)this.\u00d300000.get((java.lang.Object)Object.\u00d800000));
            this.class.addAll((Collection<F>)this.\u00d300000.get((java.lang.Object)Object.\u00d2O0000));
            this.class.addAll((Collection<F>)this.\u00d300000.get((java.lang.Object)Object.\u00f4O0000));
            this.class.addAll((Collection<F>)this.\u00d300000.get((java.lang.Object)Object.\u00d3O0000));
            this.class.addAll((Collection<F>)this.\u00d300000.get((java.lang.Object)Object.\u00d8o0000));
        }
        return this.class;
    }

    public void o00000(boolean bl) {
        for (Object object : Object.values()) {
            this.\u00d300000.put(object, new ArrayList());
        }
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.super(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.class(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.int(this));
        this.o00000(Object.\u00d2O0000, o0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00f400000(this));
        this.o00000(Object.\u00f4O0000, helden.framework.E.super.super.class(this));
        this.o00000(Object.\u00f4O0000, helden.framework.E.super.super.\u00d200000(this));
        this.o00000(Object.\u00f4O0000, helden.framework.E.super.super.super(this));
        this.o00000(Object.\u00f4O0000, helden.framework.E.super.super.\u00d400000(this));
        this.o00000(Object.\u00f4O0000, helden.framework.E.super.super.\u00d300000(this));
        this.o00000(Object.\u00d3O0000, oooo_2.\u00d400000(this));
        this.o00000(Object.\u00d3O0000, oooo_2.super(this));
        this.o00000(Object.\u00d3O0000, oooo_2.\u00d200000(this));
        this.o00000(Object.\u00d3O0000, oooo_2.\u00d300000(this));
        this.o00000(Object.\u00d8o0000, H.\u00d400000(this));
        this.o00000(Object.\u00d8o0000, H.Object(this));
        this.o00000(Object.\u00d8o0000, H.o00000(this));
        this.o00000(Object.\u00d8o0000, H.\u00d200000(this));
        this.o00000(Object.\u00d8o0000, H.\u00d500000(this));
        if (bl) {
            return;
        }
        this.o00000(Object.\u00d4o0000, Objectsuper.o00000(this));
        this.o00000(Object.voidsuper, oooo_1.o00000(this));
        this.o00000(Object.\u00f400000, P.super(this));
        this.o00000(Object.floatsuper, OoOO.o00000(this));
        this.o00000(Object.\u00d2o0000, V.super(this));
        this.o00000(Object.\u00d6O0000, Z.o00000(this));
        this.o00000(Object.super, OO0O.o00000(this));
        this.o00000(Object.int, K.new(this));
        this.o00000(Object.\u00d400000, o0oo.o00000(this));
        this.o00000(Object.\u00f600000, OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000(this));
        this.o00000(Object.\u00d600000, if.new(this));
        this.o00000(Object.\u00d600000, if.o00000(this));
        this.o00000(Object.class, oooo_0.o00000(this));
        this.o00000(Object.\u00f800000, N.o00000(this));
        this.o00000(Object.\u00d3o0000, oo0o_0.o00000(this));
        this.o00000(Object.\u00d800000, O.o00000(this));
        this.o00000(Object.\u00d8O0000, Y.o00000(this));
        this.o00000(Object.\u00f8O0000, Q.o00000(this));
        this.o00000(Object.\u00f6O0000, I.super(this));
        this.o00000(Object.interface, returnsuper.o00000(this));
        this.o00000(Object.do, void.o00000(this));
        this.o00000(Object.\u00d300000, a.o00000(this));
        this.o00000(Object.int, K.o00000(this));
        this.o00000(Object.OO0000, intsuper.o00000(this));
        this.o00000(Object.Oo0000, E.super(this));
        this.o00000(Object.\u00d200000, thissuper.o00000(this));
        this.\u00d200000();
    }

    private void o00000(Object object, ArrayList<F> arrayList) {
        ArrayList<F> arrayList2 = this.\u00d300000.get((java.lang.Object)object);
        arrayList2.addAll(arrayList);
    }

    private void \u00d200000() {
        for (Object object : Object.values()) {
            ArrayList<F> arrayList = this.\u00d300000.get((java.lang.Object)object);
            Collections.sort(arrayList);
        }
    }
}

