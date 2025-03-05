/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_1;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.B
 */
public class b_1
extends W<Object> {
    private ArrayList<b_0> \u00f400000;
    private oo0o_1 void;

    public b_1(ArrayList<b_0> arrayList, oo0o_1 oo0o_12) {
        super(1);
        this.\u00f400000 = arrayList;
        this.void = oo0o_12;
    }

    @Override
    public ArrayList<Object> o00000() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator<b_0> iterator = this.\u00f400000.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().toString() + " +1");
        }
        return arrayList;
    }

    @Override
    public String return() {
        StringBuffer stringBuffer = new StringBuffer("W\u00e4hle ");
        if (this.\u00d800000() == 1) {
            stringBuffer.append("eine");
        } else {
            stringBuffer.append(this.\u00d800000());
        }
        stringBuffer.append(" Eigenschaft-Modifikation");
        if (this.\u00d800000() > 1) {
            stringBuffer.append("en");
        }
        return stringBuffer.toString();
    }

    @Override
    public void o00000(int n, K k2) {
        this.void.setzeModifizierteEigenschaft(this.\u00f400000.get(n));
    }
}

