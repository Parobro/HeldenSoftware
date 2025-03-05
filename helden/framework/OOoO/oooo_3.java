/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.oooo.b_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.OoOO.ooOO
 */
public class oooo_3
extends b_0 {
    public static final b_0 \u00f8\u00f5\u00d2000 = new b_0("Magieresistenz 2");
    public static final b_0 forpublicsuper = new b_0("Geschwindigkeit 2");
    public static final b_0 \u00d4\u00f6\u00d2000 = new b_0("Geschwindigkeit 3");
    public static final b_0 o\u00f6\u00d2000 = new b_0("Gefahrenwert");
    public static final b_0 \u00d3\u00f6\u00d2000 = new b_0("R\u00fcstungsschutz");
    public static final b_0 Stringpublicsuper = new b_0("Loyalit\u00e4t");
    public static final b_0 \u00d5\u00f6\u00d2000 = new b_0("F\u00e4hrtensuche");
    public static final b_0 O\u00f6\u00d2000 = new b_0("Attacke 2");
    public static final b_0 nullpublicsuper = new b_0("Parade 2");

    public static b_0 \u00f400000(String string) {
        for (b_0 b_02 : \u00d8\u00f4\u00d2000) {
            if (!string.equals(b_02.toString())) continue;
            return b_02;
        }
        return b_0.\u00f400000(string);
    }

    public static b_0 void(String string) {
        String string2 = string.toLowerCase();
        if (string2.equals("mr1")) {
            return \u00d8\u00f5\u00d2000;
        }
        if (string2.equals("mr2")) {
            return \u00f8\u00f5\u00d2000;
        }
        if (string2.equals("gs1")) {
            return O\u00f4\u00d2000;
        }
        if (string2.equals("gs2")) {
            return forpublicsuper;
        }
        if (string2.equals("gs3")) {
            return \u00d4\u00f6\u00d2000;
        }
        if (string2.equals("gw")) {
            return o\u00f6\u00d2000;
        }
        if (string2.equals("lo")) {
            return Stringpublicsuper;
        }
        if (string2.equals("rs")) {
            return \u00d3\u00f6\u00d2000;
        }
        if (string2.equals("fs")) {
            return \u00d5\u00f6\u00d2000;
        }
        return b_0.void(string2);
    }

    protected oooo_3(String string) {
        super(string);
    }
}

