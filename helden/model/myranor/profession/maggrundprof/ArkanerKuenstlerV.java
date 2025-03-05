/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.maggrundprof.ArkanerKuenstlerVariante;
import java.util.ArrayList;

public class ArkanerKuenstlerV
extends ArkanerKuenstlerVariante {
    public ArkanerKuenstlerV() {
        super("Arkaner K\u00fcnstler (V)", "Arkane K\u00fcnstlerin (V)", 2, false, 2);
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = super.getVerallgemeinteListenAuswahlen();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:(Un-)Element", 5);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.intnew), 4, false), new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.\u00f8\u00d40000), 4, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.intnew), 4, false), new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.\u00f8\u00d40000), 3, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.intnew), 3, false), new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.\u00f8\u00d40000), 4, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.intnew), 3, false), new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.\u00f8\u00d40000), 3, false)));
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
        return 100;
    }
}

