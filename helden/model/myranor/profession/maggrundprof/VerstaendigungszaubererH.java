/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.model.myranor.profession.maggrundprof.VerstaendigungszaubererVariante;

public class VerstaendigungszaubererH
extends VerstaendigungszaubererVariante {
    public VerstaendigungszaubererH() {
        super("Verst\u00e4ndigungszauberer (H)", "Verst\u00e4ndigungszaubererin (H)", 1, false);
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

