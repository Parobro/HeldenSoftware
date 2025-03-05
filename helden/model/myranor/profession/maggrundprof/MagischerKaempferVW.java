/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.oooo.a.oooo_0;
import helden.model.myranor.profession.maggrundprof.MagischerKaempferVariante;
import java.util.ArrayList;

public class MagischerKaempferVW
extends MagischerKaempferVariante {
    public MagischerKaempferVW() {
        super("Magischer K\u00e4mpfer (Wesen) (V)", "Magische K\u00e4mpferin (Wesen) (V)", 11, false);
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 6);
        return arrayList;
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
        return 50;
    }
}

