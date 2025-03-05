/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OOoO.A;
import helden.framework.d.oooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.maggrundprof.ZauberpriesterVariante;
import java.util.ArrayList;

public class ZauberpriesterZ
extends ZauberpriesterVariante {
    public ZauberpriesterZ() {
        super("Zauberpriester (Z)", "Zauberpriesterin (Z)", 4, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 4;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 3: {
                ArrayList<P> arrayList = new ArrayList<P>();
                for (A a2 : A.o00000()) {
                    arrayList.add(oooo_0.o00000("Instruktion", a2.toString()));
                }
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

