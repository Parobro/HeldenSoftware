/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.D.P;
import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oooo.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.Objectsuper
 */
public class objectsuper_0
extends W<P> {
    private ArrayList<P> classsuper;
    private o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 \u00f6O0000;
    private String Oo0000 = "";

    public objectsuper_0(o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02, ArrayList<P> arrayList, int n) {
        super(n);
        this.\u00f6O0000 = o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02;
        this.classsuper = arrayList;
    }

    @Override
    public ArrayList<P> o00000() {
        return this.classsuper;
    }

    @Override
    public String return() {
        String string = "";
        if (this.\u00d800000() == 1) {
            string = "W\u00e4hle eine Sonderfertigkeit";
        }
        string = "W\u00e4hle " + this.\u00d800000() + " Sonderfertigkeiten";
        if (!this.Oo0000.equals("")) {
            string = string + "\n" + this.Oo0000;
        }
        return string;
    }

    @Override
    public void o00000(int n, K k2) {
        this.\u00f6O0000.waehleSonderfertigkeit(this.classsuper.get(n));
    }

    public void o00000(String string) {
        this.Oo0000 = string;
    }
}

