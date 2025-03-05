/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.int.super;
import java.util.ArrayList;
import java.util.Vector;

public abstract class I
extends N {
    public I(String string, int n) {
        super(string, n);
    }

    public super._o getKategorie() {
        return super._o.class;
    }

    public abstract Vector<voidsuper> getMirakelplustalente();

    @Override
    public ArrayList<P> getSegnungen() {
        ArrayList<P> arrayList = new ArrayList<P>();
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }
}

