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
 * Renamed from helden.framework.C.A.ooOO
 */
public class oooo_0
extends helden.framework.C.A
implements A {
    private static String[] \u00d3\u00d6\u00d2000 = new String[]{"0,5 GP/Stufe", "1 GP/Stufe", "1,5 GP/Stufe", "2 GP/Stufe"};

    private static ArrayList \u00d6\u00d40000() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 1; i2 <= 20; ++i2) {
            arrayList.add(i2);
        }
        return arrayList;
    }

    public oooo_0() {
        super(I.\u00d8\u00d6o000, true, 10, new ArrayList<String>(Arrays.asList(\u00d3\u00d6\u00d2000)), oooo_0.\u00d6\u00d40000(), new ArrayList());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        oooo_0 oooo_02 = new oooo_0();
        this.o00000(oooo_02);
        return oooo_02;
    }

    public int \u00f5O0000(R r) {
        R r2 = r.o00000(1, this.\u00f4O0000(r) - 1);
        return HeldenMath.runde(50.0 * -(this.\u00f6O0000(r) - this.\u00f6O0000(r2)));
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
            float f2 = (float)((double)i2 * this.\u00d600000(r.o00000(0).toString()));
            if (!HeldenMath.ganzzaehlig(f2)) continue;
            arrayList.add(i2);
        }
        return arrayList;
    }

    @Override
    public ArrayList o00000(int n, Settings settings) {
        if (n != 1) {
            return super.o00000(n, settings, null);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 1; i2 <= 12; ++i2) {
            arrayList.add(i2);
        }
        return arrayList;
    }

    @Override
    public int \u00d200000(R r) {
        int n = HeldenMath.runde(this.\u00f6O0000(r));
        return n;
    }

    public double \u00f6O0000(R r) {
        return this.\u00d600000(r.o00000(0).toString()) * (double)((Integer)r.o00000(1)).intValue();
    }

    public int \u00f4O0000(R r) {
        return (Integer)r.o00000(1);
    }

    @Override
    public boolean O\u00d20000() {
        return true;
    }

    public String \u00d400000(R r, floatsuper floatsuper2, boolean bl) {
        String string = super.o00000(r, floatsuper2, bl);
        if (r.o00000(2) == null || r.o00000(2).toString().isEmpty()) {
            if (string == null) {
                string = "<html><body>";
            }
            string = string + "Bitte geben sie einen Name f\u00fcr<br>die schlechte Eigenschaft ein.<br>";
        }
        double d2 = this.\u00d600000(r.o00000(0).toString()) * (double)((Integer)r.o00000(1)).intValue();
        if (bl && !HeldenMath.ganzzaehlig(d2)) {
            if (string == null) {
                string = "<html><body>";
            }
            string = string + "Die GP-Kosten f\u00fcr ihre Auswahl sind nicht ganzz\u00e4hlig.<br>";
        }
        return string;
    }

    public void supersuper(R r) {
        int n = this.\u00f4O0000(r);
        this.intsuper().remove(r);
        if (n > 1) {
            r.\u00d200000(1, n - 1);
            this.intsuper().add(r);
        }
    }

    @Override
    protected void \u00f6\u00d20000() {
        R r = new R(this.floatnew().length);
        for (int i2 = 0; i2 < this.floatnew().length; ++i2) {
            if (this.floatnew()[i2].size() == 0) {
                r.\u00d200000(i2, "");
            } else {
                r.\u00d200000(i2, this.floatnew()[i2].get(0));
            }
            if (i2 != 1) continue;
            r.\u00d200000(i2, 6);
        }
        this.\u00d6o0000();
        this.o00000(r, this.\u00d200000(r));
    }

    private double \u00d600000(String string) {
        for (int i2 = 0; i2 < \u00d3\u00d6\u00d2000.length; ++i2) {
            if (!\u00d3\u00d6\u00d2000[i2].equals(string)) continue;
            switch (i2) {
                case 0: {
                    return -0.5;
                }
                case 1: {
                    return -1.0;
                }
                case 2: {
                    return -1.5;
                }
                case 3: {
                    return -2.0;
                }
            }
        }
        return 999.0;
    }
}

