/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.oooo_0;
import helden.model.myranor.profession.maggrundprof.ZaubertaenzerVariante;
import java.util.ArrayList;

public class ZaubertaenzerV
extends ZaubertaenzerVariante {
    public ZaubertaenzerV() {
        super("Zaubert\u00e4nzer (V)", "Zaubert\u00e4nzerin (V)", 8, false);
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = super.getVerallgemeinteListenAuswahlen();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Begierde", 7);
        this.addWC(oooo_02, "E:Harmonie", 7);
        this.addWC(oooo_02, "E:Darcalya", 7);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Viertelzauberer"));
        K.o00000(I.while.toString(), voidsuper.\u00d4\u00d8\u00d6000);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 50;
    }
}

