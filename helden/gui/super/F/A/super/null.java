/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.OoOO.G;
import helden.framework.held.Object.private;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.oooo_2;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class null
extends voidsuper {
    private helden.framework.OoOO.voidsuper \u00f5o0000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d8o0000;
    private HashMap<oooo_2, Integer> \u00f4o0000;

    public null(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, HashMap<oooo_2, Integer> hashMap, helden.framework.OoOO.voidsuper voidsuper2) {
        this.\u00f4o0000 = hashMap;
        this.\u00d8o0000 = arrayList;
        this.\u00f5o0000 = voidsuper2;
    }

    @Override
    public ArrayList<voidsuper> super() {
        return new ArrayList<voidsuper>();
    }

    @Override
    public String super(int n) {
        if (n == 0) {
            return this.toString();
        }
        if (this.\u00d8o0000.size() >= n && this.\u00d8o0000.get(n - 1).\u00f8O0000().\u00d300000(this.\u00f5o0000)) {
            try {
                int n2;
                int n3 = this.\u00d8o0000.get(n - 1).\u00f8O0000().\u00f400000(this.\u00f5o0000);
                int n4 = this.\u00d8o0000.get(n - 1).o00000(this.\u00f5o0000.getTalentprobe().o00000(0));
                int n5 = this.\u00d8o0000.get(n - 1).o00000(this.\u00f5o0000.getTalentprobe().o00000(1));
                int n6 = this.\u00d8o0000.get(n - 1).o00000(this.\u00f5o0000.getTalentprobe().o00000(2));
                boolean bl = false;
                if (this.\u00f5o0000.superclass() != null && this.\u00f5o0000.superclass().length() > 1) {
                    if ("BE".equals(this.\u00f5o0000.superclass())) {
                        n3 -= this.\u00d8o0000.get(n - 1).OO0000().\u00d300000();
                        bl = true;
                    }
                    if (this.\u00f5o0000.superclass().startsWith("BE-")) {
                        n2 = Integer.parseInt(this.\u00f5o0000.superclass().substring(3));
                        n2 = Math.max(0, this.\u00d8o0000.get(n - 1).OO0000().\u00d300000() - n2);
                        n3 -= n2;
                        if (n2 > 0) {
                            bl = true;
                        }
                    }
                    if (this.\u00f5o0000.superclass().startsWith("BEx")) {
                        n2 = Integer.parseInt(this.\u00f5o0000.superclass().substring(3));
                        n2 = this.\u00d8o0000.get(n - 1).OO0000().\u00d300000() * n2;
                        n3 -= n2;
                        bl = true;
                    }
                }
                n2 = n3;
                int n7 = n4;
                int n8 = n5;
                int n9 = n6;
                if (n7 > 20) {
                    n7 = 20;
                }
                if (n8 > 20) {
                    n8 = 20;
                }
                if (n9 > 20) {
                    n9 = 20;
                }
                if (n3 < 0) {
                    n2 = 0;
                    n8 += n3;
                    n9 += n3;
                    if ((n7 += n3) < 1) {
                        n7 = 1;
                    }
                    if (n8 < 1) {
                        n8 = 1;
                    }
                    if (n9 < 1) {
                        n9 = 1;
                    }
                }
                oooo_2 oooo_22 = new oooo_2(n7, n8, n9, n2);
                int n10 = 0;
                n10 = oooo_22.\u00d200000() ? 58 : (oooo_22.o00000() ? 7942 : this.\u00f4o0000.get(oooo_22));
                int n11 = n10 / 80;
                int n12 = n10 % 80 * 100 / 80;
                String string = " TaW ";
                if (bl) {
                    string = " TaW* ";
                }
                if (n12 < 10) {
                    return "--PROZENT--" + string + n3 + " = " + n11 + ".0" + n12 + "%";
                }
                return "--PROZENT--" + string + n3 + " = " + n11 + "." + n12 + "%";
            }
            catch (Exception exception) {
                private.\u00d200000(this.\u00f5o0000.toStringKomplett(), "maik");
            }
        }
        return "--LEER--";
    }

    public String toString() {
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.equals(this.\u00f5o0000.getArt())) {
            return this.\u00f5o0000.toStringKomplett() + " " + this.\u00f5o0000.superclass();
        }
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000.equals(this.\u00f5o0000.getArt())) {
            return this.\u00f5o0000.toStringKomplett() + " " + this.\u00f5o0000.superclass();
        }
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000.equals(this.\u00f5o0000.getArt())) {
            return this.\u00f5o0000.toStringKomplett().substring("Sprachen kennen ".length()) + " (" + ((G)this.\u00f5o0000).\u00f5\u00f40000() + ")";
        }
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000.equals(this.\u00f5o0000.getArt())) {
            return this.\u00f5o0000.toStringKomplett().substring("Lesen/Schreiben ".length()) + " (" + ((G)this.\u00f5o0000).\u00f5\u00f40000() + ")";
        }
        return this.\u00f5o0000.toStringKomplett();
    }
}

