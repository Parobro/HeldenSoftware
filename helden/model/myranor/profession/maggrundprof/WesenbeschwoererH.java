/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.model.myranor.profession.maggrundprof.WesenbeschwoererVariante;

public class WesenbeschwoererH
extends WesenbeschwoererVariante {
    public WesenbeschwoererH() {
        super("Wesenbeschw\u00f6rer (H)", "Wesenbeschw\u00f6rerin (H)", 4, false);
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
}

