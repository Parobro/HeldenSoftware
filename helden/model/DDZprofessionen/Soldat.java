/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.soldat.Artillerist;
import helden.model.DDZprofessionen.soldat.AufgesessenerSchuetze;
import helden.model.DDZprofessionen.soldat.BerittenerSchuetze;
import helden.model.DDZprofessionen.soldat.LeichteReiterei;
import helden.model.DDZprofessionen.soldat.LeichtesFussvolk;
import helden.model.DDZprofessionen.soldat.Sappeur;
import helden.model.DDZprofessionen.soldat.Schuetze;
import helden.model.DDZprofessionen.soldat.SchwereReiterei;
import helden.model.DDZprofessionen.soldat.SchweresFussvolk;
import helden.model.DDZprofessionen.soldat.Seeartillerist;
import helden.model.DDZprofessionen.soldat.Seesoldat;
import helden.model.DDZprofessionen.soldat.Streitwagenlenker;

public class Soldat
extends BasisDDZProfessionMitGeweihter {
    private P \u00d8O\u00f4O00;
    private P \u00f50\u00f4O00;
    private P OO\u00f4O00;
    private P \u00d5O\u00f4O00;
    private P \u00f40\u00f4O00;
    private P oO\u00f4O00;
    private P forfloatif;
    private P Stringfloatif;
    private P \u00d4O\u00f4O00;
    private P \u00f80\u00f4O00;
    private P nullfloatif;
    private P \u00d3O\u00f4O00;

    public Soldat() {
    }

    public Soldat(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getArtillerist() {
        if (this.\u00d4O\u00f4O00 == null) {
            this.\u00d4O\u00f4O00 = new Artillerist();
        }
        return this.\u00d4O\u00f4O00;
    }

    public P getAufgesessenerSchuetze() {
        if (this.Stringfloatif == null) {
            this.Stringfloatif = new AufgesessenerSchuetze();
        }
        return this.Stringfloatif;
    }

    public P getBerittenerSchuetze() {
        if (this.forfloatif == null) {
            this.forfloatif = new BerittenerSchuetze();
        }
        return this.forfloatif;
    }

    @Override
    public String getID() {
        return "P95";
    }

    public P getLeichteReiterei() {
        if (this.OO\u00f4O00 == null) {
            this.OO\u00f4O00 = new LeichteReiterei();
        }
        return this.OO\u00f4O00;
    }

    public P getLeichtesFussvolk() {
        if (this.\u00f50\u00f4O00 == null) {
            this.\u00f50\u00f4O00 = new LeichtesFussvolk();
        }
        return this.\u00f50\u00f4O00;
    }

    public P getSappeur() {
        if (this.\u00f80\u00f4O00 == null) {
            this.\u00f80\u00f4O00 = new Sappeur();
        }
        return this.\u00f80\u00f4O00;
    }

    public P getSchuetze() {
        if (this.oO\u00f4O00 == null) {
            this.oO\u00f4O00 = new Schuetze();
        }
        return this.oO\u00f4O00;
    }

    public P getSchwereReiterei() {
        if (this.\u00d5O\u00f4O00 == null) {
            this.\u00d5O\u00f4O00 = new SchwereReiterei();
        }
        return this.\u00d5O\u00f4O00;
    }

    public P getSchweresFussvolk() {
        if (this.\u00d8O\u00f4O00 == null) {
            this.\u00d8O\u00f4O00 = new SchweresFussvolk();
        }
        return this.\u00d8O\u00f4O00;
    }

    public P getSeeartillerist() {
        if (this.\u00d3O\u00f4O00 == null) {
            this.\u00d3O\u00f4O00 = new Seeartillerist();
        }
        return this.\u00d3O\u00f4O00;
    }

    public P getSeesoldat() {
        if (this.nullfloatif == null) {
            this.nullfloatif = new Seesoldat();
        }
        return this.nullfloatif;
    }

    public P getStreitwagenlenker() {
        if (this.\u00f40\u00f4O00 == null) {
            this.\u00f40\u00f4O00 = new Streitwagenlenker();
        }
        return this.\u00f40\u00f4O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Soldat");
        } else {
            stringBuffer.append("Soldatin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append("/");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getSchweresFussvolk());
        this.addAlleVarianten(this.getLeichtesFussvolk());
        this.addAlleVarianten(this.getLeichteReiterei());
        this.addAlleVarianten(this.getSchwereReiterei());
        this.addAlleVarianten(this.getStreitwagenlenker());
        this.addAlleVarianten(this.getSchuetze());
        this.addAlleVarianten(this.getBerittenerSchuetze());
        this.addAlleVarianten(this.getAufgesessenerSchuetze());
        this.addAlleVarianten(this.getSappeur());
        this.addAlleVarianten(this.getArtillerist());
        this.addAlleVarianten(this.getSeesoldat());
        this.addAlleVarianten(this.getSeeartillerist());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchweresFussvolk());
        this.addMoeglicheVariante(this.getLeichtesFussvolk());
        this.addMoeglicheVariante(this.getLeichteReiterei());
        this.addMoeglicheVariante(this.getSchwereReiterei());
        this.addMoeglicheVariante(this.getStreitwagenlenker());
        this.addMoeglicheVariante(this.getSchuetze());
        this.addMoeglicheVariante(this.getBerittenerSchuetze());
        this.addMoeglicheVariante(this.getAufgesessenerSchuetze());
        this.addMoeglicheVariante(this.getSappeur());
        this.addMoeglicheVariante(this.getArtillerist());
        this.addMoeglicheVariante(this.getSeesoldat());
        this.addMoeglicheVariante(this.getSeeartillerist());
    }
}

