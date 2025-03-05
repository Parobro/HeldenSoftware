/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.d.oooo_0;
import helden.model.myranor.profession.maggrundprof.ArkanerForscherVariante;
import java.util.ArrayList;

public class ArkanerForscherZ
extends ArkanerForscherVariante {
    public ArkanerForscherZ() {
        super("Arkaner Forscher (Z)", "Arkaner Forscherin (Z)", 6, false);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringthisString));
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
        return super.getUmfangFormelPool() + 100;
    }
}

