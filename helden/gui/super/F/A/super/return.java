/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.held.Object.private;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooo_2;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class return
extends voidsuper {
    private KonkreterZauber \u00d3o0000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> oo0000;
    private HashMap<oooo_2, Integer> \u00d4o0000;
    private b_0 nullsuper;

    public return(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, HashMap<oooo_2, Integer> hashMap, KonkreterZauber konkreterZauber, b_0 b_02) {
        this.\u00d4o0000 = hashMap;
        this.oo0000 = arrayList;
        this.\u00d3o0000 = konkreterZauber;
        this.nullsuper = b_02;
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
        if (this.oo0000.size() >= n && this.oo0000.get(n - 1).\u00d5o0000().\u00d300000(this.\u00d3o0000)) {
            try {
                int n2 = this.oo0000.get(n - 1).\u00d5o0000().\u00d400000(this.\u00d3o0000);
                int n3 = this.oo0000.get(n - 1).o00000(this.\u00d3o0000.getTalentprobe().o00000(0));
                int n4 = this.oo0000.get(n - 1).o00000(this.\u00d3o0000.getTalentprobe().o00000(1));
                int n5 = 0;
                n5 = this.nullsuper != null ? this.oo0000.get(n - 1).o00000(this.nullsuper) : this.oo0000.get(n - 1).o00000(this.\u00d3o0000.getTalentprobe().o00000(2));
                int n6 = n2;
                int n7 = n3;
                int n8 = n4;
                int n9 = n5;
                if (n7 > 20) {
                    n7 = 20;
                }
                if (n8 > 20) {
                    n8 = 20;
                }
                if (n9 > 20) {
                    n9 = 20;
                }
                if (n2 < 0) {
                    n6 = 0;
                    n8 += n2;
                    n9 += n2;
                    if ((n7 += n2) < 1) {
                        n7 = 1;
                    }
                    if (n8 < 1) {
                        n8 = 1;
                    }
                    if (n9 < 1) {
                        n9 = 1;
                    }
                }
                oooo_2 oooo_22 = new oooo_2(n7, n8, n9, n6);
                int n10 = 0;
                n10 = oooo_22.\u00d200000() ? 58 : (oooo_22.o00000() ? 7942 : this.\u00d4o0000.get(oooo_22));
                int n11 = n10 / 80;
                int n12 = n10 % 80 * 100 / 80;
                if (n12 < 10) {
                    return "--PROZENT-- ZfW " + n2 + " = " + n11 + ".0" + n12 + "%";
                }
                return "--PROZENT-- ZfW " + n2 + " = " + n11 + "." + n12 + "%";
            }
            catch (Exception exception) {
                private.\u00d200000(this.\u00d3o0000.toStringKomplett(), "maik");
            }
        }
        return "--LEER--";
    }

    public String toString() {
        if (Zauber.newfornew.equals(this.\u00d3o0000.getZauber())) {
            return "Attributo (KL/CH/" + this.nullsuper.O\u00d60000() + ") ";
        }
        return this.\u00d3o0000.toStringKomplett();
    }
}

