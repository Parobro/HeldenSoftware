/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.gladiator.Knochenbrecher;
import helden.model.DDZprofessionen.gladiator.LieblingDerMassen;
import helden.model.DDZprofessionen.gladiator.Schaukaempfer;

public class Gladiator
extends BasisDDZProfessionMitGeweihter {
    private P \u00d4\u00d6\u00f4O00;
    private P \u00d3\u00d6\u00f4O00;
    private P \u00d5\u00d6\u00f4O00;

    public Gladiator() {
    }

    public Gladiator(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P94";
    }

    public P getKnochenbrecher() {
        if (this.\u00d4\u00d6\u00f4O00 == null) {
            this.\u00d4\u00d6\u00f4O00 = new Knochenbrecher();
        }
        return this.\u00d4\u00d6\u00f4O00;
    }

    public P getLieblingDerMasse() {
        if (this.\u00d3\u00d6\u00f4O00 == null) {
            this.\u00d3\u00d6\u00f4O00 = new LieblingDerMassen();
        }
        return this.\u00d3\u00d6\u00f4O00;
    }

    public P getSchaukaempfer() {
        if (this.\u00d5\u00d6\u00f4O00 == null) {
            this.\u00d5\u00d6\u00f4O00 = new Schaukaempfer();
        }
        return this.\u00d5\u00d6\u00f4O00;
    }

    @Override
    public boolean istErstProfession() {
        return this.istVariante(this.getKnochenbrecher());
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        if (this.varianteGewaehlt()) {
            return super.toString();
        }
        if (this.istMaennlich()) {
            return "Gladiator/Schauk\u00e4mpfer";
        }
        return "Gladiatorin/Schauk\u00e4mpferin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKnochenbrecher());
        this.addAlleVarianten(this.getLieblingDerMasse());
        this.addAlleVarianten(this.getSchaukaempfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKnochenbrecher());
        this.addMoeglicheVariante(this.getLieblingDerMasse());
        this.addMoeglicheVariante(this.getSchaukaempfer());
    }
}

