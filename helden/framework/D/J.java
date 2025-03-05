/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.H;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.void;
import helden.framework.held.object.oooo_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class J {
    public static boolean super(H h2, P p2) {
        return h2.toString().equals(J.super(p2));
    }

    public static boolean super(P p2, P p3) {
        return J.super(p2).equals(J.super(p3));
    }

    public static boolean super(for for_, P p2) {
        P p3;
        if (!J.super(p2).equals(for_.getBezeichner())) {
            return false;
        }
        if (for_.toString().equals(p2.toString())) {
            return true;
        }
        if (p2 instanceof void) {
            p3 = (void)p2;
            if (((void)p3).privateprivateclass.size() == 0) {
                return false;
            }
            if (((void)p3).privateprivateclass.size() > 1) {
                oooo_0.\u00f500000("SFCOMP.containsSFOderAuswahl MASF.gewaehlteAuswahlen.size != 1: " + p2.toString());
                return false;
            }
            for (Object t : for_.getAuswahlen()) {
                if (!((void)p3).\u00f4\u00d30000().toString().equals(t.toString())) continue;
                return true;
            }
        }
        if (p2 instanceof Q) {
            p3 = (Q)p2;
            for (Object t : for_.getAuswahlen()) {
                if (!((Q)p3).\u00d8\u00d30000().toString().equals(t.toString())) continue;
                return true;
            }
        }
        return false;
    }

    public static String super(P p2) {
        Q q;
        if (p2 instanceof K) {
            return ((K)p2).ifnew();
        }
        if (p2 instanceof void) {
            void void_ = (void)p2;
            return void_.\u00f500000();
        }
        if (p2 instanceof Q && (q = (Q)p2).\u00d4\u00d30000() != null) {
            return q.\u00d4\u00d30000().\u00f500000();
        }
        return p2.\u00f500000();
    }

    private J() {
    }
}

