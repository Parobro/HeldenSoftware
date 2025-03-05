/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.c.a;

import helden.framework.C.I;
import helden.framework.C.OoOO.A;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.C.A.oooO
 */
public class oooo_1
extends helden.framework.C.A
implements A {
    private static String[] \u00f4\u00d5\u00d2000 = new String[]{"Wei\u00df", "Gelb", "Orange", "Rot", "Purpur", "Violett", "Blaurot"};

    private static ArrayList superObject() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 1; i2 <= 12; ++i2) {
            arrayList.add(i2);
        }
        return arrayList;
    }

    public oooo_1() {
        super(I.\u00d8\u00d2o000, true, 10, new ArrayList<String>(Arrays.asList(\u00f4\u00d5\u00d2000)), oooo_1.superObject());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        oooo_1 oooo_12 = new oooo_1();
        this.o00000(oooo_12);
        return oooo_12;
    }

    public int \u00f500000(R r) {
        R r2 = r.o00000(1, this.\u00f400000(r) - 1);
        return HeldenMath.runde(50.0 * -(this.\u00f600000(r) - this.\u00f600000(r2)));
    }

    @Override
    public ArrayList o00000(int n, Settings settings, R r) {
        if (n != 1) {
            return super.o00000(n, settings, r);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (r == null) {
            return arrayList;
        }
        for (int i2 = 5; i2 <= 12; ++i2) {
            float f2 = (float)((double)i2 * this.\u00f4\u00d30000());
            if (!HeldenMath.ganzzaehlig(f2)) continue;
            arrayList.add(i2);
        }
        return arrayList;
    }

    @Override
    public int \u00d200000(R r) {
        int n = HeldenMath.runde(this.\u00f600000(r));
        return n;
    }

    public double \u00f600000(R r) {
        return this.\u00f4\u00d30000() * (double)this.\u00f400000(r);
    }

    public int \u00f400000(R r) {
        return (Integer)r.o00000(1);
    }

    @Override
    public boolean O\u00d20000() {
        return true;
    }

    public String \u00d200000(R r, floatsuper floatsuper2, boolean bl) {
        String string = super.o00000(r, floatsuper2, bl);
        double d2 = this.\u00f4\u00d30000() * (double)this.\u00f400000(r);
        if (bl && !HeldenMath.ganzzaehlig(d2)) {
            if (string == null) {
                string = "<html><body>";
            }
            string = string + "Die GP-Kosten f\u00fcr ihre Auswahl sind nicht ganzz\u00e4hlig.<br>";
        }
        return string;
    }

    public void void(R r) {
        int n = this.\u00f400000(r);
        this.intsuper().remove(r);
        if (n > 1) {
            r.\u00d200000(1, n - 1);
            this.intsuper().add(r);
        }
    }

    @Override
    protected void \u00f6\u00d20000() {
        R r = new R(this.floatnew().length);
        r.\u00d200000(0, this.floatnew()[0].get(0));
        r.\u00d200000(1, 6);
        this.\u00d6o0000();
        this.o00000(r, this.\u00d200000(r));
    }

    private double \u00f4\u00d30000() {
        return -1.5;
    }
}

