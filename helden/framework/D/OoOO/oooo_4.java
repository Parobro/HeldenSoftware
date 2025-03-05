/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.H;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.d.oooo.a_0;
import helden.framework.d.oooo_0;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

/*
 * Renamed from helden.framework.D.oOOO.ooOO
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum oooo_4 {
    OO0000("Probenerleichterung", oooo_4.\u00d500000(), new _o(){

        @Override
        public int \u00d200000(Object object) {
            return -1 * this.o00000(object);
        }

        @Override
        public int o00000(Object object) {
            R r = (R)object;
            return (Integer)r.o00000(1);
        }
    }, false, 15),
    super("INI-Bonus", new Integer[]{1, 2}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return this.o00000(object) * 3;
        }

        @Override
        public int o00000(Object object) {
            return (Integer)object;
        }
    }, false, 2),
    \u00d400000("Erlaubtes Man\u00f6ver", oooo_4.String(), new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 5;
        }

        @Override
        public int o00000(Object object) {
            return 1;
        }
    }, false, 1),
    \u00d8O0000("Reichweite FK", new String[]{"+10%", "+20%"}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return this.o00000(object);
        }

        @Override
        public int o00000(Object object) {
            if (object.toString().equals("+10%")) {
                return 1;
            }
            if (object.toString().equals("+20%")) {
                return 2;
            }
            return 99;
        }
    }, false, 1),
    \u00d3O0000("TP/KK", new String[]{"-1/-1"}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return this.o00000(object) * 2;
        }

        @Override
        public int o00000(Object object) {
            return 1;
        }
    }, false, 1),
    int("AT", new Integer[]{1, 2}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 5 * this.o00000(object);
        }

        @Override
        public int o00000(Object object) {
            return (Integer)object;
        }
    }, false, 1),
    interface("PA", new Integer[]{1, 2}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 5 * this.o00000(object);
        }

        @Override
        public int o00000(Object object) {
            return (Integer)object;
        }
    }, false, 1),
    \u00d200000("Ladezeit halbieren", null, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 5;
        }

        @Override
        public int o00000(Object object) {
            return 1;
        }
    }, false, 1),
    \u00f600000("Besondere Vorteile", new Integer[]{1, 2, 3, 4, 5}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return (Integer)object;
        }

        @Override
        public int o00000(Object object) {
            return 1;
        }
    }, true, 15),
    \u00d6O0000("Gezielte Sch\u00fcsse -1", null, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 2;
        }

        @Override
        public int o00000(Object object) {
            return 1;
        }
    }, false, 1),
    \u00f800000("Talent", new s_0[]{s_0.Object, s_0.o00000, s_0.\u00f600000}, new _o(){

        @Override
        public int \u00d200000(Object object) {
            s_0 s_02 = (s_0)object;
            if (s_02.equals(s_0.\u00f600000)) {
                return 0;
            }
            if (s_02.equals(s_0.o00000)) {
                return 2;
            }
            if (s_02.equals(s_0.Object)) {
                return 4;
            }
            return 99;
        }

        @Override
        public int o00000(Object object) {
            return ((s_0)object).\u00d400000();
        }
    }, false, 1),
    do("Angriffswaffe", null, new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 4;
        }

        @Override
        public int o00000(Object object) {
            return 1;
        }
    }, false, 1),
    \u00d800000("1. zus\u00e4tzliche Waffe", a_0.\u00d5\u00d60000().toArray(), new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 2;
        }

        @Override
        public int o00000(Object object) {
            return 0;
        }
    }, false, 1),
    \u00d600000("2. zus\u00e4tzliche Waffe", a_0.\u00d5\u00d60000().toArray(), new _o(){

        @Override
        public int \u00d200000(Object object) {
            return 0;
        }

        @Override
        public int o00000(Object object) {
            return 0;
        }
    }, false, 1);

    private static ArrayList<oooo_4> class;
    private String \u00f4O0000;
    private ArrayList \u00f400000;
    private boolean \u00d300000;
    private _o \u00d2O0000;

    public static oooo_4 o00000(String string) {
        for (oooo_4 oooo_42 : oooo_4.values()) {
            if (!string.equals(oooo_42.toString())) continue;
            return oooo_42;
        }
        return null;
    }

    public static ArrayList<oooo_4> \u00d200000() {
        if (oooo_4.class == null) {
            oooo_4.class = new ArrayList();
            for (oooo_4 oooo_42 : oooo_4.values()) {
                if (oooo_42.equals((Object)\u00f800000) || oooo_42.equals((Object)do)) continue;
                oooo_4.class.add(oooo_42);
            }
        }
        return oooo_4.class;
    }

    public static ArrayList<oooo_4> o00000(E e) {
        ArrayList<oooo_4> arrayList = new ArrayList<oooo_4>(oooo_4.\u00d200000());
        if (!e.equals(E.\u00d4\u00d6\u00d8000)) {
            arrayList.remove((Object)\u00d200000);
        }
        if (!e.classclass()) {
            arrayList.remove((Object)\u00d8O0000);
            arrayList.remove((Object)\u00d6O0000);
        }
        if (e.classclass()) {
            arrayList.remove((Object)\u00d3O0000);
        }
        if (!e.o\u00d80000()) {
            arrayList.remove((Object)interface);
        }
        if (!e.equals(E.nullsuperString) && !e.equals(E.\u00d4\u00d5\u00d8000)) {
            arrayList.remove((Object)\u00d3O0000);
        }
        return arrayList;
    }

    private static Object[] String() {
        H[] hArray = new H[]{while.\u00d8\u00f5\u00d6000, while.\u00f5\u00d3\u00d2000, while.\u00f80o000, while.\u00d8O\u00f5000, while.\u00d60\u00d2000, while.\u00f8o\u00f6000, while.\u00f5O\u00d5000, while.\u00d2\u00d3\u00f6000, while.o0\u00d3000, while.Stringfor, while.\u00d8\u00f80000, while.\u00d2\u00d8\u00f6000, while.\u00d80\u00f8000, while.returninterfaceString, while.o\u00f4\u00d6000, while.\u00f8\u00d3\u00d2000, while.ifdoString, while.\u00d30\u00f4000, while.\u00d8\u00d8\u00d8000, while.forwhilenew, while.\u00f5\u00f6\u00d5000, while.\u00f6\u00d20000};
        ArrayList<P> arrayList = new ArrayList<P>();
        for (H h2 : hArray) {
            P p2 = oooo_0.o00000(h2);
            arrayList.add(p2);
        }
        return arrayList.toArray();
    }

    private static Object[] \u00d500000() {
        H[] hArray = new H[]{while.\u00d8\u00f5\u00d6000, while.\u00f5\u00d3\u00d2000, while.\u00f80o000, while.\u00d8O\u00f5000, while.\u00d60\u00d2000, while.o\u00d6o000, while.\u00f8o\u00f6000, while.\u00d2\u00d8\u00f6000, while.\u00d80\u00f8000, while.o\u00f5\u00f6000, while.\u00f5O\u00d5000, while.o0\u00d3000, while.Stringfor, while.\u00d8\u00f80000, while.o\u00f4\u00d6000, while.\u00f8\u00d3\u00d2000, while.o\u00d8\u00f5000, while.ifdoString, while.\u00d30\u00f4000, while.\u00d8\u00d8\u00d8000, while.StringifObject, while.forwhilenew, while.\u00f5\u00f6\u00d5000};
        ArrayList<R> arrayList = new ArrayList<R>();
        for (H h2 : hArray) {
            P p2 = oooo_0.o00000(h2);
            arrayList.add(new R(p2, -1));
            arrayList.add(new R(p2, -2));
            arrayList.add(new R(p2, -4));
        }
        return arrayList.toArray();
    }

    private oooo_4(String string2, Object[] objectArray, _o _o2, boolean bl, int n2) {
        this.\u00f4O0000 = string2;
        this.\u00f400000 = new ArrayList();
        if (objectArray != null) {
            for (Object object : objectArray) {
                this.\u00f400000.add(object);
            }
        }
        this.\u00d2O0000 = _o2;
        this.\u00d300000 = bl;
    }

    public ArrayList o00000() {
        return this.\u00f400000;
    }

    public int o00000(Object object) {
        return this.\u00d2O0000.\u00d200000(object);
    }

    public Integer \u00d200000(Object object) {
        return this.\u00d2O0000.o00000(object);
    }

    public boolean \u00d300000() {
        return this.\u00d300000;
    }

    public void o00000(ArrayList arrayList) {
        this.\u00f400000 = arrayList;
    }

    public String toString() {
        return this.\u00f4O0000;
    }

    public static interface _o {
        public int \u00d200000(Object var1);

        public int o00000(Object var1);
    }
}

