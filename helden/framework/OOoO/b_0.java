/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.OoOO.U;
import helden.framework.OoOO.X;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.OoOO.B
 */
public class b_0
extends U {
    protected static final List<b_0> \u00d8\u00f4\u00d2000 = new ArrayList<b_0>();
    public static final b_0 \u00f5\u00d8\u00d2000 = new b_0("-", false);
    public static final b_0 o\u00f5\u00d2000 = new b_0("Eigenschaft", false);
    public static final b_0 whilewhilesuper = new b_0("Mut", true);
    public static final b_0 newwhilesuper = new b_0("Klugheit", true);
    public static final b_0 \u00f8\u00f4\u00d2000 = new b_0("Intuition", true);
    public static final b_0 \u00d5\u00f4\u00d2000 = new b_0("Charisma", true);
    public static final b_0 O\u00f5\u00d2000 = new b_0("Fingerfertigkeit", true);
    public static final b_0 \u00f4\u00f4\u00d2000 = new b_0("Gewandtheit", true);
    public static final b_0 returnwhilesuper = new b_0("Konstitution", true);
    public static final b_0 O\u00f4\u00d2000 = new b_0("Geschwindigkeit", false);
    public static final b_0 privatedosuper = new b_0("K\u00f6rperkraft", true);
    public static final b_0 \u00f5\u00f5\u00d2000 = new b_0("Sozialstatus", false);
    public static final b_0 \u00d3\u00f4\u00d2000 = new b_0("Lebensenergie", true);
    public static final b_0 thispublicsuper = new b_0("Ausdauer", true);
    public static final b_0 \u00f4\u00f5\u00d2000 = new b_0("Astralenergie", true);
    public static final b_0 \u00d8\u00f5\u00d2000 = new b_0("Magieresistenz", true);
    public static final b_0 \u00f8\u00d8\u00d2000 = new b_0("Attacke", false);
    public static final b_0 ifwhilesuper = new b_0("Parade", false);
    public static final b_0 \u00f5\u00f4\u00d2000 = new b_0("Fernkampf-Basis", false);
    public static final b_0 \u00f4\u00d8\u00d2000 = new b_0("Initiative", false);
    public static final b_0 \u00d4\u00f5\u00d2000 = new b_0("Karmaenergie", false);
    public static final b_0 \u00d5\u00f5\u00d2000 = new b_0("Wundschwelle", false);
    public static final b_0 \u00d3\u00f5\u00d2000 = new b_0("Ausweichen", false);
    private static ArrayList<b_0> o\u00f4\u00d2000;
    private boolean \u00d4\u00f4\u00d2000 = true;

    public static b_0 \u00f400000(String string) {
        if (o\u00f4\u00d2000 == null) {
            b_0.\u00d4\u00d60000();
        }
        if (string.equals("Mut")) {
            return whilewhilesuper;
        }
        if (string.equals("Wundschwelle")) {
            return \u00d5\u00f5\u00d2000;
        }
        if (string.equals("Klugheit")) {
            return newwhilesuper;
        }
        if (string.equals("Charisma")) {
            return \u00d5\u00f4\u00d2000;
        }
        if (string.equals("Intuition")) {
            return \u00f8\u00f4\u00d2000;
        }
        if (string.equals("Fingerfertigkeit")) {
            return O\u00f5\u00d2000;
        }
        if (string.equals("Gewandtheit")) {
            return \u00f4\u00f4\u00d2000;
        }
        if (string.equals("Konstitution")) {
            return returnwhilesuper;
        }
        if (string.equals("K\u00f6rperkraft")) {
            return privatedosuper;
        }
        if (string.equals("Sozialstatus")) {
            return \u00f5\u00f5\u00d2000;
        }
        if (string.equals("Lebensenergie")) {
            return \u00d3\u00f4\u00d2000;
        }
        if (string.equals("Ausdauer")) {
            return thispublicsuper;
        }
        if (string.equals("Astralenergie")) {
            return \u00f4\u00f5\u00d2000;
        }
        if (string.equals("Karmaenergie")) {
            return \u00d4\u00f5\u00d2000;
        }
        if (string.equals("Attacke")) {
            return \u00f8\u00d8\u00d2000;
        }
        if (string.equals("Parade")) {
            return ifwhilesuper;
        }
        if (string.equals("Parade")) {
            return ifwhilesuper;
        }
        if (string.equals("Fernkampf-Basis")) {
            return \u00f5\u00f4\u00d2000;
        }
        if (string.equals("Initiative")) {
            return \u00f4\u00d8\u00d2000;
        }
        if (string.equals("Magieresistenz")) {
            return \u00d8\u00f5\u00d2000;
        }
        if (string.equals("Ausdauer")) {
            return thispublicsuper;
        }
        throw new X(string + " ist keine Eigenschaft");
    }

    public static Iterator<b_0> \u00d4\u00d60000() {
        return b_0.o\u00d60000().iterator();
    }

    public static b_0 void(String string) {
        String string2 = string.toLowerCase();
        if (string2.equals("mu")) {
            return whilewhilesuper;
        }
        if (string2.equals("kl")) {
            return newwhilesuper;
        }
        if (string2.equals("ch")) {
            return \u00d5\u00f4\u00d2000;
        }
        if (string2.equals("in")) {
            return \u00f8\u00f4\u00d2000;
        }
        if (string2.equals("ff")) {
            return O\u00f5\u00d2000;
        }
        if (string2.equals("ge")) {
            return \u00f4\u00f4\u00d2000;
        }
        if (string2.equals("ko")) {
            return returnwhilesuper;
        }
        if (string2.equals("kk")) {
            return privatedosuper;
        }
        if (string2.equals("**")) {
            return o\u00f5\u00d2000;
        }
        if (string2.equals("ini")) {
            return \u00f4\u00d8\u00d2000;
        }
        if (string2.equals("aup") || string2.equals("au")) {
            return thispublicsuper;
        }
        if (string2.equals("mr")) {
            return \u00d8\u00f5\u00d2000;
        }
        if (string2.equals("lep") || string2.equals("le")) {
            return \u00d3\u00f4\u00d2000;
        }
        if (string2.equals("asp") || string2.equals("ae")) {
            return \u00f4\u00f5\u00d2000;
        }
        if (string2.equals("--")) {
            return \u00f5\u00d8\u00d2000;
        }
        if (string2.equals("at")) {
            return \u00f8\u00d8\u00d2000;
        }
        if (string2.equals("pa")) {
            return ifwhilesuper;
        }
        if (string2.equals("gs")) {
            return O\u00f4\u00d2000;
        }
        throw new IllegalArgumentException("Keine Eigenschaft bekannt f\u00fcr " + string2);
    }

    public static ArrayList<b_0> o\u00d60000() {
        if (o\u00f4\u00d2000 == null) {
            o\u00f4\u00d2000 = new ArrayList();
            o\u00f4\u00d2000.add(whilewhilesuper);
            o\u00f4\u00d2000.add(newwhilesuper);
            o\u00f4\u00d2000.add(\u00f8\u00f4\u00d2000);
            o\u00f4\u00d2000.add(\u00d5\u00f4\u00d2000);
            o\u00f4\u00d2000.add(O\u00f5\u00d2000);
            o\u00f4\u00d2000.add(\u00f4\u00f4\u00d2000);
            o\u00f4\u00d2000.add(returnwhilesuper);
            o\u00f4\u00d2000.add(privatedosuper);
            o\u00f4\u00d2000.add(\u00f5\u00f5\u00d2000);
        }
        return o\u00f4\u00d2000;
    }

    protected b_0(String string) {
        super(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.int);
        \u00d8\u00f4\u00d2000.add(this);
    }

    protected b_0(String string, boolean bl) {
        this(string);
        this.\u00d4\u00f4\u00d2000 = bl;
    }

    public String O\u00d60000() {
        if (this.equals(whilewhilesuper)) {
            return "MU";
        }
        if (this.equals(newwhilesuper)) {
            return "KL";
        }
        if (this.equals(\u00d5\u00f4\u00d2000)) {
            return "CH";
        }
        if (this.equals(\u00f8\u00f4\u00d2000)) {
            return "IN";
        }
        if (this.equals(O\u00f5\u00d2000)) {
            return "FF";
        }
        if (this.equals(\u00f4\u00f4\u00d2000)) {
            return "GE";
        }
        if (this.equals(returnwhilesuper)) {
            return "KO";
        }
        if (this.equals(privatedosuper)) {
            return "KK";
        }
        if (this.equals(\u00d5\u00f5\u00d2000)) {
            return "WS";
        }
        if (this.equals(o\u00f5\u00d2000)) {
            return "**";
        }
        if (this.equals(\u00f5\u00d8\u00d2000)) {
            return "--";
        }
        throw new IllegalArgumentException("Keine Abk\u00fcrzung bekannt f\u00fcr " + this.toString());
    }

    public s_0 \u00d2\u00d60000() {
        if (this.floatString()) {
            if (this.publicString()) {
                return s_0.\u00d600000;
            }
            if (this.equals(\u00d3\u00f4\u00d2000)) {
                return s_0.\u00d600000;
            }
            if (this.equals(thispublicsuper)) {
                return s_0.\u00f600000;
            }
            if (this.equals(\u00f4\u00f5\u00d2000)) {
                return s_0.void;
            }
            if (this.equals(\u00d4\u00f5\u00d2000)) {
                return s_0.\u00f500000;
            }
            if (this.equals(\u00d8\u00f5\u00d2000)) {
                return s_0.\u00d600000;
            }
            throw new IllegalArgumentException("Steigerungskosten f\u00fcr " + this.toString() + " nicht definiert");
        }
        throw new IllegalArgumentException("Eigenschaft " + this.toString() + " ist nicht steigerbar.");
    }

    public boolean publicString() {
        b_0.\u00d4\u00d60000();
        return o\u00f4\u00d2000.contains(this);
    }

    public boolean floatString() {
        return this.\u00d4\u00f4\u00d2000;
    }
}

