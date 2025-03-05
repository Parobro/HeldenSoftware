/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E;

import helden.framework.E.B;
import helden.framework.E.F;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OooO
implements Comparator<F> {
    public int super(F f2, F f3) {
        helden.framework.E.C.B b = (helden.framework.E.C.B)f2.o00000(B.OO0000, 0);
        helden.framework.E.C.B b2 = (helden.framework.E.C.B)f3.o00000(B.OO0000, 0);
        if (b.\u00d3O0000() && !b2.\u00d3O0000() || !b.\u00d3O0000() && b2.\u00d3O0000()) {
            if (b.\u00d3O0000()) {
                return 1;
            }
            return 1;
        }
        int n = b2.oO0000() - b.oO0000();
        if (n == 0) {
            n = b2.\u00f600000() - b.\u00f600000();
        }
        if (n == 0) {
            n = b.\u00f600000() - b2.\u00f600000();
        }
        if (n == 0) {
            n = f2.toString().compareTo(f3.toString());
        }
        return n;
    }
}

