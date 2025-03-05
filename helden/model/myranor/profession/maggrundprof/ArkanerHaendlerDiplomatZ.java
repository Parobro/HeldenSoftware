/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.d.oooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.maggrundprof.ArkanerHaendlerDiplomatVariante;
import java.util.ArrayList;

public class ArkanerHaendlerDiplomatZ
extends ArkanerHaendlerDiplomatVariante {
    public ArkanerHaendlerDiplomatZ() {
        super("Arkaner H\u00e4ndler/Diplomat (Z)", "Arkane H\u00e4ndlerin/Diplomatin (Z)", 8, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 3;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 2: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getSetting().getSF("Instruktion"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
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

