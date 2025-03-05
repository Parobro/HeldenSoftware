/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.d.oooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.maggrundprof.ZaubertaenzerVariante;
import java.util.ArrayList;

public class ZaubertaenzerZ
extends ZaubertaenzerVariante {
    public ZaubertaenzerZ() {
        super("Zaubert\u00e4nzer (Z)", "Zaubert\u00e4nzerin (Z)", 10, false);
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
                arrayList.add(oooo_0.o00000("Instruktion", "Heilung/Wiederherstellung"));
                arrayList.add(oooo_0.o00000("Instruktion", "Hellsicht"));
                arrayList.add(oooo_0.o00000("Instruktion", "Kommunikation"));
                arrayList.add(oooo_0.o00000("Instruktion", "Transfer"));
                return new objectsuper_0(this.getProfession(), arrayList, 2);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringthisString));
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = super.getVerallgemeinteListenAuswahlen();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.add(o00O.\u00d8\u00d20000);
        arrayList2.add(o00O.\u00f4\u00d30000);
        arrayList2.add(o00O.\u00f4\u00d20000);
        this.addZauber(oooo_02, arrayList2, L.o00000, 7, true);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.add(o00O.\u00d8\u00d20000);
        arrayList2.add(o00O.\u00f4\u00d30000);
        arrayList2.add(o00O.O\u00d20000);
        arrayList2.add(o00O.intnew);
        arrayList2.add(o00O.\u00f8\u00d30000);
        arrayList2.add(o00O.\u00f4\u00d20000);
        arrayList2.add(o00O.\u00d8\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addZauber(oooo_02, arrayList2, L.o00000, 5);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.public());
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
        return 200;
    }
}

