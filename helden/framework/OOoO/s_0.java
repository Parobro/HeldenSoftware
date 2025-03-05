/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.OoOO.S
 */
public final class s_0
implements Comparable<Object> {
    public static final s_0 \u00d500000 = new s_0("A", 1);
    public static final s_0 \u00d400000 = new s_0("B", 2);
    public static final s_0 Object = new s_0("C", 3);
    public static final s_0 o00000 = new s_0("D", 4);
    public static final s_0 \u00f600000 = new s_0("E", 5);
    public static final s_0 \u00f500000 = new s_0("F", 6);
    public static final s_0 void = new s_0("G", 7);
    public static final s_0 \u00d600000 = new s_0("H", 8);
    private String \u00d200000;
    private int \u00f400000;

    public static List<s_0> o00000() {
        ArrayList<s_0> arrayList = new ArrayList<s_0>();
        arrayList.add(\u00d500000);
        arrayList.add(\u00d400000);
        arrayList.add(Object);
        arrayList.add(o00000);
        arrayList.add(\u00f600000);
        arrayList.add(\u00f500000);
        arrayList.add(void);
        arrayList.add(\u00d600000);
        return arrayList;
    }

    public static s_0 o00000(int n) {
        if (n < 1) {
            return new s_0("A+", n);
        }
        switch (n) {
            case 1: {
                return \u00d500000;
            }
            case 2: {
                return \u00d400000;
            }
            case 3: {
                return Object;
            }
            case 4: {
                return o00000;
            }
            case 5: {
                return \u00f600000;
            }
            case 6: {
                return \u00f500000;
            }
            case 7: {
                return void;
            }
            case 8: {
                return \u00d600000;
            }
        }
        return \u00d600000;
    }

    private s_0(String string, int n) {
        this.\u00d200000 = string;
        this.\u00f400000 = n;
    }

    @Override
    public int compareTo(Object object) {
        s_0 s_02 = (s_0)object;
        if (this.\u00f400000 < s_02.\u00f400000) {
            return -1;
        }
        if (this.\u00f400000 > s_02.\u00f400000) {
            return 1;
        }
        return 0;
    }

    public s_0 \u00d300000() {
        return this.new(1);
    }

    public s_0 new(int n) {
        return s_0.o00000(this.\u00f400000 + n);
    }

    public s_0 new() {
        return this.\u00d300000(1);
    }

    public s_0 \u00d300000(int n) {
        return s_0.o00000(this.\u00f400000 - n);
    }

    public int \u00d400000() {
        return this.\u00f400000;
    }

    public String toString() {
        return this.\u00d200000;
    }
}

