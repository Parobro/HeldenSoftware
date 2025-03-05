/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.d.oooo_0;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.maggrundprof.ArkanerKuenstlerVariante;
import java.util.ArrayList;

public class ArkanerKuenstlerH
extends ArkanerKuenstlerVariante {
    public ArkanerKuenstlerH() {
        super("Arkaner K\u00fcnstler (H)", "Arkane K\u00fcnstlerin (H)", 3, false, 2);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Instruktion", "D\u00e4monische Manifestation"));
                arrayList.add(oooo_0.o00000("Instruktion", "Elementare Manifestation"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = super.getVerallgemeinteListenAuswahlen();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:(Un-)Element", 7);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.intnew), 7, false), new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.\u00f8\u00d40000), 7, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.intnew), 7, false), new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.\u00f8\u00d40000), 5, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.intnew), 5, false), new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.\u00f8\u00d40000), 7, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.intnew), 5, false), new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.\u00f8\u00d40000), 5, false)));
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.intnew), 4, false), new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.\u00f8\u00d40000), 4, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.intnew), 4, false), new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.\u00f8\u00d40000), 3, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.intnew), 3, false), new ZauberMitWertUndHZ(this.getZauber(L.o00000, o00O.\u00f8\u00d40000), 4, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.intnew), 3, false), new ZauberMitWertUndHZ(this.getZauber(L.\u00d500000, o00O.\u00f8\u00d40000), 3, false)));
        oooo_02 = new helden.framework.oooo.a.oooo_0(2, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.addAll(o00O.\u00f400000());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Halbzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 300;
    }
}

