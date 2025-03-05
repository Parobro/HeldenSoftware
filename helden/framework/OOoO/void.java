/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oOoO;

import helden.framework.D.for;
import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oOoO.Z;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class void
extends W<for> {
    private ArrayList<for> \u00f600000;
    private Z \u00f500000;

    public void(Z z, ArrayList<for> arrayList, int n) {
        super(n);
        this.\u00f500000 = z;
        this.\u00f600000 = arrayList;
    }

    @Override
    public ArrayList<for> o00000() {
        return this.\u00f600000;
    }

    @Override
    public String return() {
        if (this.\u00d800000() == 1) {
            return "W\u00e4hle eine verbilligte Sonderfertigkeit";
        }
        return "W\u00e4hle " + this.\u00d800000() + " verbilligte Sonderfertigkeiten";
    }

    @Override
    public void o00000(int n, K k2) {
        this.\u00f500000.waehleVerbilligteSonderfertigkeit(this.\u00f600000.get(n));
    }
}

