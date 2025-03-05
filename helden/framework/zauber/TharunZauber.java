/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.D.while;
import helden.framework.E.A;
import helden.framework.E.C.I;
import helden.framework.E.F;
import helden.framework.OOoO.o00O;
import helden.framework.OOoO.o0Oo;
import helden.framework.held.K;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oooo_1;
import helden.framework.oooo.s_0;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class TharunZauber
extends Zauber {
    private o0Oo[] thissuperObject;
    private Integer[] \u00f4\u00d3\u00d5000;
    private String \u00d5\u00d3\u00d5000;
    private TharunischeZauberArten \u00d8\u00d3\u00d5000;

    private static Integer \u00d200000(F f2) {
        return TharunZauber.Object(f2).\u00f6\u00d20000();
    }

    private static I Object(F f2) {
        return (I)f2.o00000(A.\u00d400000, 0);
    }

    private static o0Oo o00000(F f2) {
        return TharunZauber.Object(f2).o\u00d30000();
    }

    private static l_0 o00000(TharunischeZauberArten tharunischeZauberArten, o0Oo[] o0OoArray) {
        switch (tharunischeZauberArten) {
            case o00000: {
                return new l_0(o0OoArray[0].\u00d600000(), o0OoArray[1].\u00d600000(), o0OoArray[2].\u00d600000());
            }
            case \u00d500000: {
                return new l_0(o0OoArray[0].\u00d600000(), o0OoArray[1].\u00d600000(), o0OoArray[4].\u00d600000());
            }
            case String: {
                return new l_0(o0OoArray[0].\u00d600000(), o0OoArray[3].\u00d600000(), o0OoArray[4].\u00d600000());
            }
        }
        throw new RuntimeException();
    }

    public TharunZauber(TharunischeZauberArten tharunischeZauberArten, F[] fArray) {
        super("TharunZauber", s_0.\u00d500000, null, new o00O[0], new oooo_1("WnT", 115), "");
        this.\u00d8\u00d3\u00d5000 = tharunischeZauberArten;
        this.thissuperObject = new o0Oo[fArray.length];
        this.\u00f4\u00d3\u00d5000 = new Integer[fArray.length];
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            F f2 = fArray[i2];
            this.thissuperObject[i2] = TharunZauber.o00000(f2);
            this.\u00f4\u00d3\u00d5000[i2] = TharunZauber.\u00d200000(f2);
        }
        this.\u00d5\u00d60000();
        this.setProbe(TharunZauber.o00000(this.\u00d8\u00d3\u00d5000, this.thissuperObject));
    }

    public TharunZauber(TharunischeZauberArten tharunischeZauberArten, o0Oo[] o0OoArray, Integer[] integerArray) {
        super("TharunZauber", s_0.\u00d500000, TharunZauber.o00000(tharunischeZauberArten, o0OoArray), new o00O[0], new oooo_1("WnT", 115), "");
        this.thissuperObject = o0OoArray;
        this.\u00f4\u00d3\u00d5000 = integerArray;
        this.\u00d8\u00d3\u00d5000 = tharunischeZauberArten;
        this.\u00d5\u00d60000();
    }

    public int getAsPKosten() {
        o0Oo[] o0OoArray = this.getRunen();
        switch (this.\u00d8\u00d3\u00d5000) {
            case o00000: {
                return 2 * o0OoArray[0].Object() + 1 * o0OoArray[1].Object() + 3 * o0OoArray[2].Object();
            }
            case \u00d500000: {
                return 2 * o0OoArray[0].Object() + 2 * o0OoArray[1].Object() + 1 * o0OoArray[2].Object() + 1 * o0OoArray[3].Object() + 3 * o0OoArray[4].Object();
            }
            case String: {
                return 2 * o0OoArray[0].Object() + 1 * o0OoArray[1].Object() + 1 * o0OoArray[2].Object() + 3 * o0OoArray[3].Object() + 3 * o0OoArray[4].Object();
            }
        }
        throw new RuntimeException();
    }

    public Integer[] getGegenstandsID() {
        return this.\u00f4\u00d3\u00d5000;
    }

    public o0Oo[] getRunen() {
        return this.thissuperObject;
    }

    public TharunischeZauberArten getZauberart() {
        return this.\u00d8\u00d3\u00d5000;
    }

    public boolean isGueltig(K k2) {
        int n;
        for (int i2 = 0; i2 < this.runenAnzahl() - 1; ++i2) {
            for (n = i2 + 1; n < this.runenAnzahl(); ++n) {
                if (this.thissuperObject[i2] != this.thissuperObject[n] || this.\u00f4\u00d3\u00d5000[i2] != this.\u00f4\u00d3\u00d5000[n]) continue;
                return false;
            }
        }
        switch (this.getZauberart()) {
            case o00000: {
                if (k2.new(while.\u00f5\u00d3\u00d5000.toString())) break;
                return false;
            }
            case String: {
                if (k2.new(while.o\u00f4\u00d2000.toString())) break;
                return false;
            }
            case \u00d500000: {
                if (k2.new(while.\u00d8\u00d4\u00d3000.toString())) break;
                return false;
            }
        }
        ArrayList<F> arrayList = k2.\u00d8o0000().o00000(A.\u00d400000);
        for (n = 0; n < this.runenAnzahl(); ++n) {
            boolean bl = false;
            for (F f2 : arrayList) {
                I i3 = TharunZauber.Object(f2);
                if (!i3.o\u00d30000().equals(this.thissuperObject[n]) || !i3.\u00f6\u00d20000().equals(this.\u00f4\u00d3\u00d5000[n]) || !i3.\u00d3\u00d30000().equals((Object)I._o.String) || !k2.\u00f8O0000().int(i3.o\u00d30000().\u00d200000())) continue;
                bl = true;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public int runenAnzahl() {
        if (this.\u00d8\u00d3\u00d5000 == TharunischeZauberArten.o00000) {
            return 3;
        }
        return 5;
    }

    @Override
    public String toString() {
        return this.\u00d5\u00d3\u00d5000;
    }

    private void \u00d5\u00d60000() {
        switch (this.\u00d8\u00d3\u00d5000) {
            case o00000: {
                this.\u00d5\u00d3\u00d5000 = String.format("%s (%d) - %s (%d) - %s (%d)", this.thissuperObject[0], this.\u00f4\u00d3\u00d5000[0], this.thissuperObject[1], this.\u00f4\u00d3\u00d5000[1], this.thissuperObject[2], this.\u00f4\u00d3\u00d5000[2]);
                break;
            }
            case \u00d500000: {
                this.\u00d5\u00d3\u00d5000 = String.format("%s (%d) %s (%d) - %s (%d) %s (%d) - %s (%d)", this.thissuperObject[0], this.\u00f4\u00d3\u00d5000[0], this.thissuperObject[1], this.\u00f4\u00d3\u00d5000[1], this.thissuperObject[2], this.\u00f4\u00d3\u00d5000[2], this.thissuperObject[3], this.\u00f4\u00d3\u00d5000[3], this.thissuperObject[4], this.\u00f4\u00d3\u00d5000[4]);
                break;
            }
            case String: {
                this.\u00d5\u00d3\u00d5000 = String.format("%s (%d) - %s (%d) %s (%d) - %s (%d) - %s (%d)", this.thissuperObject[0], this.\u00f4\u00d3\u00d5000[0], this.thissuperObject[1], this.\u00f4\u00d3\u00d5000[1], this.thissuperObject[2], this.\u00f4\u00d3\u00d5000[2], this.thissuperObject[3], this.\u00f4\u00d3\u00d5000[3], this.thissuperObject[4], this.\u00f4\u00d3\u00d5000[4]);
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }

    public static enum TharunischeZauberArten {
        o00000("Runendreieck (TWZ)"),
        \u00d500000("Pentagramm mit zwei Tr\u00e4gern (TTWWZZ)"),
        String("Pentagramm mit zwei Zielen (TWWZZ)");

        private String \u00d200000;

        private TharunischeZauberArten(String string2) {
            this.\u00d200000 = string2;
        }

        public String toString() {
            return this.\u00d200000;
        }
    }
}

