/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.model.myranor.profession.maggrundprof.HeilerVariante;
import java.util.ArrayList;

public class HeilerV
extends HeilerVariante {
    public HeilerV() {
        super("Heiler (V)", "Heilerin (V)", 1, false);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = super.getVerallgemeinteListenAuswahlen();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Elementar (Humus)", 6);
        this.addWC(oooo_02, "E:Khalyanar", 6);
        this.addWC(oooo_02, "E:Mishkarya", 6);
        this.addWC(oooo_02, "E:Wahnsinn", 6);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.addAll(o00O.\u00f400000());
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<U> arrayList = new ArrayList<U>();
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
                arrayList.add(voidsuper.StringObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
                M<U> m = K.\u00d200000(arrayList);
                return o00o_0.o00000(this.getProfession(), m, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Viertelzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 80;
    }
}

