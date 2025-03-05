/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.OoOO.G;
import helden.framework.held.K;
import helden.framework.oOoO.F;
import helden.framework.oOoO.W;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.oo0O
 */
public class oo0o_2
extends W<G> {
    private ArrayList<G> \u00d2O0000;
    private F oO0000;
    private String public;

    public oo0o_2(F f2, ArrayList<G> arrayList, int n, String string) {
        super(n);
        this.oO0000 = f2;
        this.\u00d2O0000 = arrayList;
        this.public = string;
    }

    @Override
    public ArrayList<G> o00000() {
        return this.\u00d2O0000;
    }

    @Override
    public String return() {
        StringBuffer stringBuffer = new StringBuffer("W\u00e4hle ");
        if (this.\u00d800000() == 1) {
            stringBuffer.append("eine Sprache");
        } else {
            stringBuffer.append(this.\u00d800000());
            stringBuffer.append(" Sprachen");
        }
        stringBuffer.append(" (");
        stringBuffer.append(this.public);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    @Override
    public void o00000(int n, K k2) {
        this.oO0000.addSpracheAuswahl(this.\u00d2O0000.get(n));
    }
}

