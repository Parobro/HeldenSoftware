/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.fischer.Bergungstaucher;
import helden.model.DDZprofessionen.fischer.Harpunier;
import helden.model.DDZprofessionen.fischer.Perlenfischer;
import helden.model.DDZprofessionen.fischer.Seefischer;
import helden.model.DDZprofessionen.fischer.Unterwasserjaeger;
import helden.model.DDZprofessionen.fischer.VarianteFischer;

public class Fischer
extends BasisDDZProfessionMitGeweihter {
    private P \u00d80\u00f4O00;
    private P \u00d50\u00f4O00;
    private P \u00d40\u00f4O00;
    private P \u00d30\u00f4O00;
    private P whileifif;
    private P thisfloatif;

    public Fischer() {
    }

    public Fischer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBergungstaucher() {
        if (this.\u00d30\u00f4O00 == null) {
            this.\u00d30\u00f4O00 = new Bergungstaucher();
        }
        return this.\u00d30\u00f4O00;
    }

    public P getHarpunier() {
        if (this.whileifif == null) {
            this.whileifif = new Harpunier();
        }
        return this.whileifif;
    }

    @Override
    public String getID() {
        return "P102";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getPerlenfischer() {
        if (this.\u00d40\u00f4O00 == null) {
            this.\u00d40\u00f4O00 = new Perlenfischer();
        }
        return this.\u00d40\u00f4O00;
    }

    public P getSeefischer() {
        if (this.\u00d50\u00f4O00 == null) {
            this.\u00d50\u00f4O00 = new Seefischer();
        }
        return this.\u00d50\u00f4O00;
    }

    public P getUnterwasserjaeger() {
        if (this.thisfloatif == null) {
            this.thisfloatif = new Unterwasserjaeger();
        }
        return this.thisfloatif;
    }

    public P getVarianteFischer() {
        if (this.\u00d80\u00f4O00 == null) {
            this.\u00d80\u00f4O00 = new VarianteFischer();
        }
        return this.\u00d80\u00f4O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Fischer");
        } else {
            stringBuffer.append("Fischerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteFischer());
        this.addAlleVarianten(this.getSeefischer());
        this.addAlleVarianten(this.getPerlenfischer());
        this.addAlleVarianten(this.getBergungstaucher());
        this.addAlleVarianten(this.getHarpunier());
        this.addAlleVarianten(this.getUnterwasserjaeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteFischer());
        this.addMoeglicheVariante(this.getSeefischer());
        this.addMoeglicheVariante(this.getPerlenfischer());
    }
}

