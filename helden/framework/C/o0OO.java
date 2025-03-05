/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.OoOO.A;
import helden.framework.C.void;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.held.Object.floatsuper;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class o0OO
extends helden.framework.C.A
implements A {
    private int o\u00d6\u00d2000 = 0;
    private int ifforsuper = 0;
    private int \u00f8\u00d5\u00d2000 = 0;
    private int O\u00d6\u00d2000 = 0;
    private double \u00f5\u00d5\u00d2000;
    private HashMap<String, Integer> whileforsuper;

    protected static ArrayList o00000(int n, int n2, int n3) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = n; i2 <= n2; i2 += n3) {
            arrayList.add(new Integer(i2));
        }
        return arrayList;
    }

    public o0OO(I i2, boolean bl, int n, int n2, int n3, int n4, double d2, int n5) {
        super(i2, bl, n, o0OO.o00000(n3, n4, 1), new ArrayList());
        this.ifforsuper = n3;
        this.\u00f8\u00d5\u00d2000 = n4;
        this.whileforsuper = new HashMap();
        this.\u00f5\u00d5\u00d2000 = d2;
        this.O\u00d6\u00d2000 = n5;
        this.o\u00d6\u00d2000 = n2;
    }

    public void \u00d5O0000(R r) {
        this.whileforsuper.put(this.public(r), this.\u00d4O0000(r));
    }

    @Override
    public int \u00d200000(R r) {
        if (r == null) {
            return 999;
        }
        int n = (Integer)r.o00000(0);
        if (this.whileforsuper != null && this.whileforsuper.containsKey(r.o00000(1))) {
            n -= this.whileforsuper.get(r.o00000(1)).intValue();
        }
        return HeldenMath.runde(this.\u00f5\u00d5\u00d2000 * (double)n);
    }

    public String public(R r) {
        return (String)r.o00000(1);
    }

    public Integer \u00d6O0000(R r) {
        return this.whileforsuper.get(this.public(r));
    }

    public Integer \u00d4O0000(R r) {
        return (Integer)r.o00000(0);
    }

    public String Object(R r, floatsuper floatsuper2, boolean bl) {
        String string = super.o00000(r, floatsuper2, bl);
        if (r.o00000(1) == null || r.o00000(1).toString().isEmpty()) {
            if (string == null) {
                string = "<html><body>";
            }
            string = string + "Bitte geben sie einen Name f\u00fcr<br>diesen Nachteil ein";
        }
        return string;
    }

    @Override
    protected D<R> \u00d6\u00d20000() {
        void void_ = new void(this);
        return void_;
    }

    protected double \u00d2\u00d40000() {
        return this.\u00f5\u00d5\u00d2000;
    }

    protected int \u00d5\u00d40000() {
        return this.\u00f8\u00d5\u00d2000;
    }

    protected int intObject() {
        return this.ifforsuper;
    }

    protected int o\u00d40000() {
        return this.O\u00d6\u00d2000;
    }

    protected int \u00d4\u00d40000() {
        return this.o\u00d6\u00d2000;
    }
}

