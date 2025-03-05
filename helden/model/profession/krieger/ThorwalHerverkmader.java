/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.ThorwalFotskari;

public class ThorwalHerverkmader
extends ThorwalFotskari {
    public ThorwalHerverkmader() {
        super("ThorwalHerverkmader", 29);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d8\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 3);
        k_02.\u00d200000(voidsuper.nullvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.forObjectObject, 4);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d8000, 3);
        return k_02;
    }

    @Override
    public String toString() {
        return "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Herverkmader (UdW)";
    }
}

