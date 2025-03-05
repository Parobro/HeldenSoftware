/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.return;
import helden.framework.bedingungen.Bedingung;
import helden.framework.oooo.b_0;
import helden.model.dsa41.orden.BasisOrden;
import java.util.ArrayList;

public class MadaBasari
extends BasisOrden {
    public MadaBasari() {
        super("Mada Basari");
    }

    @Override
    public ArrayList<helden.framework.oooo.a.b_0> getBedingteWerte() {
        ArrayList<helden.framework.oooo.a.b_0> arrayList = new ArrayList<helden.framework.oooo.a.b_0>();
        arrayList.add(new helden.framework.oooo.a.b_0((Object)new return(b_0.\u00f5\u00f5\u00d2000, 1), Bedingung.hatKeinKarma()));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        return oo0O;
    }
}

