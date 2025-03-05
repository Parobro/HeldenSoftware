/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.D.P;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
extends voidsuper {
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> o00000;
    private P new;

    public B(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, P p2) {
        this.o00000 = arrayList;
        this.new = p2;
    }

    @Override
    public ArrayList<voidsuper> super() {
        return new ArrayList<voidsuper>();
    }

    @Override
    public String super(int n) {
        if (n == 0) {
            String string = this.toString();
            if (string.startsWith("Talentspezialisierung ")) {
                return "TS " + string.substring("Talentspezialisierung ".length());
            }
            if (string.startsWith("Zauberspezialisierung ")) {
                return "TS " + string.substring("Zauberspezialisierung ".length());
            }
            if (string.startsWith("Waffenloser Kampfstil: ")) {
                return "WK: " + string.substring("Waffenloser Kampfstil: ".length());
            }
            if (string.startsWith("Zauberzeichen: Bann- und Schutzkreis gegen ")) {
                return "Schutzkreis: " + string.substring("Zauberzeichen: Bann- und Schutzkreis gegen ".length());
            }
            return this.toString();
        }
        if (this.o00000.size() >= n && this.o00000.get(n - 1).\u00f5O0000().\u00d200000(this.new.toString())) {
            return "--AKTIVIERT--";
        }
        return "";
    }

    public String toString() {
        String string = this.new.toString();
        if (string.startsWith("Talentspezialisierung ")) {
            return "TS " + string.substring("Talentspezialisierung ".length());
        }
        if (string.startsWith("Zauberspezialisierung ")) {
            return "TS " + string.substring("Zauberspezialisierung ".length());
        }
        if (string.startsWith("Waffenloser Kampfstil: ")) {
            return "WK: " + string.substring("Waffenloser Kampfstil: ".length());
        }
        if (string.startsWith("Zauberzeichen: Bann- und Schutzkreis gegen ")) {
            return "Zauberzeichen Kreis: " + string.substring("Zauberzeichen: Bann- und Schutzkreis gegen ".length());
        }
        return string;
    }
}

