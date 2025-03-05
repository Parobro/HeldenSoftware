/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A.super;

import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Oo0o
extends voidsuper {
    private int \u00d4\u00f40000;
    private ArrayList<helden.framework.OoOO.voidsuper>[] \u00d3\u00f40000;
    private String newreturn;

    public Oo0o(ArrayList<helden.framework.OoOO.voidsuper>[] arrayListArray, int n, String string) {
        this.\u00d3\u00f40000 = arrayListArray;
        this.\u00d4\u00f40000 = n;
        this.newreturn = string;
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
        if (this.\u00d3\u00f40000.length >= n && this.\u00d3\u00f40000[n - 1].size() > this.\u00d4\u00f40000) {
            return this.\u00d3\u00f40000[n - 1].get(this.\u00d4\u00f40000).toString();
        }
        return "";
    }

    public String toString() {
        return this.newreturn;
    }
}

