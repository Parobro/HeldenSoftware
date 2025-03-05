/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.kundschafter.KundschafterVariante;

public class Kundschafter
extends BasisDDZProfessionMitGeweihter {
    private P whilewhileif;

    public Kundschafter() {
    }

    public Kundschafter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P109";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKundschafter() {
        if (this.whilewhileif == null) {
            this.whilewhileif = new KundschafterVariante();
        }
        return this.whilewhileif;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Kundschafter";
        }
        return "Kundschafterin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKundschafter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKundschafter());
    }
}

