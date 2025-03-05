/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.D.P;
import helden.framework.held.Object.public;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.F.A.super.B;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class R
extends voidsuper {
    public static final String \u00f4\u00d30000 = "allgemein";
    public static final String StringObject = "kampf";
    public static final String thisObject = "magisch";
    public static final String \u00d8\u00d30000 = "klerikal";
    private String O\u00d40000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00f5\u00d30000;
    private ArrayList<voidsuper> \u00f8\u00d30000;

    public R(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, String string) {
        this.O\u00d40000 = string;
        this.\u00f5\u00d30000 = arrayList;
    }

    @Override
    public ArrayList<voidsuper> super() {
        Object object;
        int n;
        if (this.\u00f8\u00d30000 != null) {
            return this.\u00f8\u00d30000;
        }
        this.\u00f8\u00d30000 = new ArrayList();
        ArrayList<P> arrayList = new ArrayList<P>();
        for (n = 0; n < this.\u00f5\u00d30000.size(); ++n) {
            object = this.\u00f5\u00d30000.get(n);
            for (P p2 : object.\u00f5O0000().\u00f600000()) {
                if (StringObject.equals(this.O\u00d40000) && p2.\u00f400000() && !arrayList.contains(p2)) {
                    arrayList.add(p2);
                }
                if (\u00d8\u00d30000.equals(this.O\u00d40000) && p2.\u00d300000() && !arrayList.contains(p2)) {
                    arrayList.add(p2);
                }
                if (thisObject.equals(this.O\u00d40000) && p2.privatesuper() && !arrayList.contains(p2)) {
                    arrayList.add(p2);
                }
                if (!\u00f4\u00d30000.equals(this.O\u00d40000) || p2.\u00d300000() || p2.privatesuper() || p2.\u00f400000() || arrayList.contains(p2)) continue;
                arrayList.add(p2);
            }
        }
        Collections.sort(arrayList, public.o00000());
        for (n = 0; n < arrayList.size(); ++n) {
            object = (P)arrayList.get(n);
            this.\u00f8\u00d30000.add(new B(this.\u00f5\u00d30000, (P)object));
        }
        return new ArrayList<voidsuper>();
    }

    @Override
    public String super(int n) {
        if (n == 0) {
            return this.toString();
        }
        return "--LEER--";
    }

    public String toString() {
        return this.O\u00d40000;
    }
}

