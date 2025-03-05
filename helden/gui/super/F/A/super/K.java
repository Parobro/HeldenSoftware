/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberWertSortierer;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class K
extends voidsuper {
    private Zauber \u00d3\u00d20000;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> newnew;

    public K(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, Zauber zauber) {
        this.\u00d3\u00d20000 = zauber;
        this.newnew = arrayList;
    }

    @Override
    public ArrayList<voidsuper> super() {
        return new ArrayList<voidsuper>();
    }

    @Override
    public String super(int n) {
        ArrayList<KonkreterZauber> arrayList;
        if (n == 0) {
            return this.toString();
        }
        if (this.newnew.size() >= n && (arrayList = this.newnew.get(n - 1).\u00d5o0000().class(this.\u00d3\u00d20000)).size() > 0) {
            String string = "";
            Collections.sort(arrayList, new ZauberWertSortierer(this.newnew.get(n - 1)));
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                KonkreterZauber konkreterZauber = arrayList.get(i2);
                try {
                    string = string + this.newnew.get(n - 1).\u00d5o0000().\u00d400000(konkreterZauber) + " (" + konkreterZauber.getRep().super() + ") ";
                    continue;
                }
                catch (D d2) {
                    // empty catch block
                }
            }
            return "--ZAUBER--" + string;
        }
        return "";
    }

    public String toString() {
        return this.\u00d3\u00d20000.toString();
    }
}

