/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.D.P;
import helden.framework.D.public;
import helden.framework.d.oooo_3;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class F
extends oooo_0 {
    public static final int \u00d5\u00d20000 = 0;
    public static final int \u00d4\u00d20000 = 1;
    private List<P> Objectnew;

    public F(K k2, List<P> list) {
        super(k2, new String[]{"Liturgie", "Grad"});
        this.Objectnew = list;
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        P p2 = this.Objectnew.get(n);
        switch (n2) {
            case 0: {
                string = p2.toString();
                break;
            }
            case 1: {
                if (p2 instanceof oooo_3) {
                    oooo_3 oooo_32 = (oooo_3)((Object)p2);
                    string = "" + oooo_32.O\u00d50000();
                    break;
                }
                if (p2 instanceof public) {
                    public public_ = (public)p2;
                    string = "" + public_.whilenew();
                    break;
                }
                string = "Grad auswerte fehler";
                break;
            }
            default: {
                string = "Fehler! spaltenIndex: " + n2;
            }
        }
        return string;
    }

    @Override
    public int o00000() {
        return this.Objectnew.size();
    }

    public int \u00f400000() {
        return this.Objectnew.size();
    }

    protected List<P> void() {
        return this.Objectnew;
    }
}

