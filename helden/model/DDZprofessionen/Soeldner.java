/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.soeldner.Artillerist;
import helden.model.DDZprofessionen.soeldner.BerittenerSchuetze;
import helden.model.DDZprofessionen.soeldner.Leibwaechter;
import helden.model.DDZprofessionen.soeldner.LeichteReiterei;
import helden.model.DDZprofessionen.soeldner.LeichtesFussvolk;
import helden.model.DDZprofessionen.soeldner.LeichtesFussvolk2;
import helden.model.DDZprofessionen.soeldner.Sappeur;
import helden.model.DDZprofessionen.soeldner.Schuetze;
import helden.model.DDZprofessionen.soeldner.SchweresFussvolk;
import helden.model.DDZprofessionen.soeldner.Seesoeldner;
import helden.model.DDZprofessionen.soeldner.SklavenAufseher;

public class Soeldner
extends BasisDDZProfessionMitGeweihter {
    private P \u00d3\u00d3\u00f4O00;
    private P thisdoif;
    private P \u00f8\u00d2\u00f4O00;
    private P O\u00d3\u00f4O00;
    private P nulldoif;
    private P o\u00d3\u00f4O00;
    private P Stringdoif;
    private P \u00d5\u00d2\u00f4O00;
    private P \u00d8\u00d2\u00f4O00;
    private P \u00f5\u00d2\u00f4O00;
    private P \u00f4\u00d2\u00f4O00;

    public Soeldner() {
    }

    public Soeldner(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getArtillerist() {
        if (this.o\u00d3\u00f4O00 == null) {
            this.o\u00d3\u00f4O00 = new Artillerist();
        }
        return this.o\u00d3\u00f4O00;
    }

    public P getBerittenerSchuetze() {
        if (this.nulldoif == null) {
            this.nulldoif = new BerittenerSchuetze();
        }
        return this.nulldoif;
    }

    @Override
    public String getID() {
        return "P96";
    }

    public P getLeibwaechter() {
        if (this.\u00d8\u00d2\u00f4O00 == null) {
            this.\u00d8\u00d2\u00f4O00 = new Leibwaechter();
        }
        return this.\u00d8\u00d2\u00f4O00;
    }

    public P getLeichteReiterei() {
        if (this.\u00f8\u00d2\u00f4O00 == null) {
            this.\u00f8\u00d2\u00f4O00 = new LeichteReiterei();
        }
        return this.\u00f8\u00d2\u00f4O00;
    }

    public P getLeichtesFussvolk() {
        if (this.thisdoif == null) {
            this.thisdoif = new LeichtesFussvolk();
        }
        return this.thisdoif;
    }

    public P getLeichtesFussvolk2() {
        if (this.\u00f4\u00d2\u00f4O00 == null) {
            this.\u00f4\u00d2\u00f4O00 = new LeichtesFussvolk2();
        }
        return this.\u00f4\u00d2\u00f4O00;
    }

    public P getSappeur() {
        if (this.Stringdoif == null) {
            this.Stringdoif = new Sappeur();
        }
        return this.Stringdoif;
    }

    public P getSchuetze() {
        if (this.O\u00d3\u00f4O00 == null) {
            this.O\u00d3\u00f4O00 = new Schuetze();
        }
        return this.O\u00d3\u00f4O00;
    }

    public P getSchweresFussvolk() {
        if (this.\u00d3\u00d3\u00f4O00 == null) {
            this.\u00d3\u00d3\u00f4O00 = new SchweresFussvolk();
        }
        return this.\u00d3\u00d3\u00f4O00;
    }

    public P getSeesoeldner() {
        if (this.\u00d5\u00d2\u00f4O00 == null) {
            this.\u00d5\u00d2\u00f4O00 = new Seesoeldner();
        }
        return this.\u00d5\u00d2\u00f4O00;
    }

    public P getSklavenAufseher() {
        if (this.\u00f5\u00d2\u00f4O00 == null) {
            this.\u00f5\u00d2\u00f4O00 = new SklavenAufseher();
        }
        return this.\u00f5\u00d2\u00f4O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("S\u00f6ldner");
        } else {
            stringBuffer.append("S\u00f6ldnerin");
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
        this.addAlleVarianten(this.getSchuetze());
        this.addAlleVarianten(this.getBerittenerSchuetze());
        this.addAlleVarianten(this.getSappeur());
        this.addAlleVarianten(this.getArtillerist());
        this.addAlleVarianten(this.getSeesoeldner());
        this.addAlleVarianten(this.getLeibwaechter());
        this.addAlleVarianten(this.getSklavenAufseher());
        this.addAlleVarianten(this.getLeichtesFussvolk2());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchweresFussvolk());
        this.addMoeglicheVariante(this.getLeichtesFussvolk());
        this.addMoeglicheVariante(this.getLeichteReiterei());
        this.addMoeglicheVariante(this.getSchuetze());
        this.addMoeglicheVariante(this.getBerittenerSchuetze());
        this.addMoeglicheVariante(this.getSappeur());
        this.addMoeglicheVariante(this.getArtillerist());
        this.addMoeglicheVariante(this.getSeesoeldner());
        this.addMoeglicheVariante(this.getLeibwaechter());
        this.addMoeglicheVariante(this.getLeichtesFussvolk2());
    }
}

