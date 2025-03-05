/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkerferkina;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkerferkina.ArchaischerHandwerkerDerFerkinas;

public class Sattler
extends ArchaischerHandwerkerDerFerkinas {
    public Sattler() {
        super("Sattler/Schuster", 2);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Sattler/Schuster";
        }
        return "Sattlerin/Schusterin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        if (n == 0) {
            return new objectsuper_0(this.getProfession(), oooo_0.o00000(voidsuper.\u00d4\u00d4\u00d5000), 1);
        }
        return null;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.Oo\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 6);
        k_02.\u00d200000(voidsuper.returnifObject, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d6000, 3);
        return k_02;
    }
}

