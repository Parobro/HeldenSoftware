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
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.maggrundprof.PionierVariante;
import java.util.ArrayList;

public class PionierZ
extends PionierVariante {
    public PionierZ() {
        super("Pionier/Wildniskundiger (Z)", "Pionier/Wildniskundige (Z)", 8, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 3;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Instruktion", "Heilung/Wiederherstellung"));
                arrayList.add(oooo_0.o00000("Instruktion", "Hellsicht"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Instruktion", "Antimagie"));
                arrayList.add(oooo_0.o00000("Instruktion", "Elementare Manifestation"));
                arrayList.add(oooo_0.o00000("Instruktion", "Reinigung"));
                arrayList.add(oooo_0.o00000("Instruktion", "Schutz vor Quelle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 2: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Instruktion", "Verwandlung"));
                arrayList.add(oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Elementare Reinheit"));
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Wesen"));
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:(Un-)Element", 7);
        this.addWC(oooo_02, "HE:Ghorgumor", 7);
        this.addWC(oooo_02, "HW:(Un-)Element", 5);
        this.addWC(oooo_02, "HW:Ghorgumor", 5);
        this.addWC(oooo_02, "HW:Tiergeister", 5);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.addAll(o00O.\u00f400000());
        arrayList2.add(o00O.\u00f6\u00d30000);
        arrayList2.add(o00O.\u00d6\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 5);
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.\u00f400000());
        arrayList2.add(o00O.\u00f6\u00d30000);
        arrayList2.add(o00O.\u00d6\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Vollzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 220;
    }
}

