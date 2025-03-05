/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.framework.zauber.KonkreterZauber;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class S
extends voidsuper {
    private int nullObject;
    private ArrayList<KonkreterZauber>[] o\u00d40000;

    public S(ArrayList<KonkreterZauber>[] arrayListArray, int n) {
        this.o\u00d40000 = arrayListArray;
        this.nullObject = n;
    }

    @Override
    public ArrayList<voidsuper> super() {
        return new ArrayList<voidsuper>();
    }

    @Override
    public String super(int n) {
        if (n == 0) {
            return this.toString();
        }
        if (this.o\u00d40000.length >= n && this.o\u00d40000[n - 1].size() > this.nullObject) {
            return this.o\u00d40000[n - 1].get(this.nullObject).toString();
        }
        return "";
    }

    public String toString() {
        return "Zauber";
    }
}

