/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.oooo.a.oooo_0;
import helden.model.myranor.profession.maggrundprof.HellseherAnalytikerVariante;
import java.util.ArrayList;

public class HellseherAnalytikerZ
extends HellseherAnalytikerVariante {
    public HellseherAnalytikerZ() {
        super("Hellseher/Analytiker (Z)", "Hellseherin/Analytikerin (Z)", 3, false);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = super.getVerallgemeinteListenAuswahlen();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.beliebigeQuelle(oooo_02, 4, 3);
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
}

