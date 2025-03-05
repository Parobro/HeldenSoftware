/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.OoOO.E;
import helden.framework.held.Object.private;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class N
extends voidsuper {
    private E \u00f8\u00d20000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00f5\u00d20000;
    private boolean ifnew;

    public N(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, E e, boolean bl) {
        this.\u00f5\u00d20000 = arrayList;
        this.\u00f8\u00d20000 = e;
        this.ifnew = bl;
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
        if (this.\u00f5\u00d20000.size() >= n && this.\u00f5\u00d20000.get(n - 1).\u00f8O0000().\u00d300000(this.\u00f8\u00d20000)) {
            try {
                String string = "";
                int n2 = this.\u00f5\u00d20000.get(n - 1).OO0000().\u00d300000() + this.\u00f8\u00d20000.\u00d2\u00d80000();
                n2 = Math.max(0, n2);
                if (this.ifnew) {
                    int n3 = this.\u00f5\u00d20000.get(n - 1).o00000(this.\u00f8\u00d20000);
                    if ((n3 -= n2 / 2) < 1) {
                        n3 = 1;
                    } else if (n3 > 19) {
                        n3 = 19;
                    }
                    int n4 = n3 * 100 / 20;
                    string = string + "AT:" + n3 + " = " + n4 + ".00%";
                } else {
                    int n5 = this.\u00f5\u00d20000.get(n - 1).new(this.\u00f8\u00d20000);
                    if ((n5 -= (n2 + 1) / 2) < 1) {
                        n5 = 1;
                    } else if (n5 > 19) {
                        n5 = 19;
                    }
                    int n6 = n5 * 10 / 2;
                    string = string + "PA:" + n5 + " = " + n6 + ".00%";
                }
                return "--PROZENT--" + string;
            }
            catch (Exception exception) {
                private.\u00d200000(this.\u00f8\u00d20000.toStringKomplett(), "maik");
            }
        }
        return "--LEER--";
    }

    public String toString() {
        return this.\u00f8\u00d20000.toStringKomplett() + " " + this.\u00f8\u00d20000.superclass();
    }
}

