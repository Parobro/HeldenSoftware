/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod.impl;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.GmodFactory;
import helden.framework.gmod.impl.SpaltenVerschiebung;
import java.util.ArrayList;
import java.util.Collections;

public class TalenteSpaltenVerschiebung
extends SpaltenVerschiebung<voidsuper> {
    public static ArrayList<voidsuper> getTalente() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.addAll(N.floatsuper().\u00d3O0000());
        arrayList.addAll(N.floatsuper().\u00d800000());
        Collections.sort(arrayList);
        return arrayList;
    }

    public TalenteSpaltenVerschiebung() {
        super(GModBezeichner.\u00f400000, (GModAuswahlen<T>[])new GModAuswahlen[]{GmodFactory.obj2Atome("Object", TalenteSpaltenVerschiebung.getTalente())});
    }
}

