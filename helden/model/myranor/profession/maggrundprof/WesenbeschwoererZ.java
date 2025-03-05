/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.c_1;
import helden.model.myranor.profession.maggrundprof.WesenbeschwoererVariante;
import java.util.ArrayList;

public class WesenbeschwoererZ
extends WesenbeschwoererVariante {
    public WesenbeschwoererZ() {
        super("Wesenbeschw\u00f6rer (Z)", "Wesenbeschw\u00f6rerin (Z)", 7, false);
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringthisString));
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.addAll(for.o00000(oooo_0.o00000("Spontanzauberer", "Invokation")));
                arrayList.addAll(for.o00000(oooo_0.o00000("Spontanzauberer", "Inspiration")));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Spontanzauberer"));
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

