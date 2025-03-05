/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class o0Oo
implements Comparable<o0Oo> {
    public static final o0Oo \u00d300000 = new o0Oo("Sehen", 1, s_0.\u00d400000, b_0.newwhilesuper);
    public static final o0Oo if = new o0Oo("H\u00f6ren", 1, s_0.\u00d400000, b_0.\u00d5\u00f4\u00d2000);
    public static final o0Oo OO0000 = new o0Oo("F\u00fchlen", 1, s_0.\u00d400000, b_0.O\u00f5\u00d2000);
    public static final o0Oo \u00d8O0000 = new o0Oo("Schmecken", 1, s_0.\u00d400000, b_0.\u00f8\u00f4\u00d2000);
    public static final o0Oo oO0000 = new o0Oo("Licht", 2, s_0.Object, b_0.newwhilesuper);
    public static final o0Oo while = new o0Oo("Finsternis", 2, s_0.Object, b_0.\u00f8\u00f4\u00d2000);
    public static final o0Oo new = new o0Oo("H\u00e4rte", 2, s_0.Object, b_0.privatedosuper);
    public static final o0Oo o00000 = new o0Oo("Weichheit", 2, s_0.Object, b_0.\u00d5\u00f4\u00d2000);
    public static final o0Oo \u00d500000 = new o0Oo("Feuer", 3, s_0.o00000, b_0.whilewhilesuper);
    public static final o0Oo \u00d4O0000 = new o0Oo("Wasser", 3, s_0.o00000, b_0.\u00f8\u00f4\u00d2000);
    public static final o0Oo \u00f400000 = new o0Oo("Erde", 3, s_0.o00000, b_0.privatedosuper);
    public static final o0Oo \u00f500000 = new o0Oo("Luft", 3, s_0.o00000, b_0.O\u00f5\u00d2000);
    public static final o0Oo \u00d800000 = new o0Oo("Kampf", 4, s_0.\u00f600000, b_0.whilewhilesuper);
    public static final o0Oo \u00d3O0000 = new o0Oo("Frieden", 4, s_0.\u00f600000, b_0.\u00d5\u00f4\u00d2000);
    public static final o0Oo \u00f5O0000 = new o0Oo("K\u00f6rper", 5, s_0.\u00f600000, b_0.\u00f4\u00f4\u00d2000);
    public static final o0Oo \u00d5O0000 = new o0Oo("Geist", 6, s_0.\u00f500000, b_0.newwhilesuper);
    private static ArrayList<o0Oo> return;
    private String Stringsuper;
    private int \u00f4O0000;
    private s_0 \u00f800000;
    private b_0 thissuper;
    private voidsuper \u00d400000;

    public static ArrayList<o0Oo> o00000() {
        if (return == null) {
            return = new ArrayList();
            return.add(\u00f400000);
            return.add(\u00d500000);
            return.add(while);
            return.add(\u00d3O0000);
            return.add(OO0000);
            return.add(\u00d5O0000);
            return.add(new);
            return.add(if);
            return.add(\u00d800000);
            return.add(\u00f5O0000);
            return.add(oO0000);
            return.add(\u00f500000);
            return.add(\u00d8O0000);
            return.add(\u00d300000);
            return.add(\u00d4O0000);
            return.add(o00000);
        }
        return return;
    }

    public static o0Oo o00000(String string) {
        for (o0Oo o0Oo2 : o0Oo.o00000()) {
            if (!o0Oo2.\u00d400000().equals(string)) continue;
            return o0Oo2;
        }
        return null;
    }

    public o0Oo(String string, int n, s_0 s_02, b_0 b_02) {
        this.Stringsuper = string;
        this.\u00f4O0000 = n;
        this.\u00f800000 = s_02;
        this.thissuper = b_02;
    }

    public int o00000(o0Oo o0Oo2) {
        return this.Stringsuper.compareTo(o0Oo2.Stringsuper);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        o0Oo o0Oo2 = (o0Oo)object;
        return !(this.Stringsuper == null ? o0Oo2.Stringsuper != null : !this.Stringsuper.equals(o0Oo2.Stringsuper));
    }

    public b_0 \u00d600000() {
        return this.thissuper;
    }

    public s_0 \u00d500000() {
        return this.\u00f800000;
    }

    public String \u00d400000() {
        return this.Stringsuper;
    }

    public int Object() {
        return this.\u00f4O0000;
    }

    public voidsuper \u00d200000() {
        return this.\u00d400000;
    }

    public int hashCode() {
        return this.Stringsuper.hashCode();
    }

    public void o00000(voidsuper voidsuper2) {
        this.\u00d400000 = voidsuper2;
    }

    public String toString() {
        return this.Stringsuper;
    }
}

