/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.soldat.Artillerist;
import helden.model.profession.soldat.AufgesessenerSchuetze;
import helden.model.profession.soldat.BerittenerSchuetze;
import helden.model.profession.soldat.LeichteReiterei;
import helden.model.profession.soldat.LeichtesFussvolk;
import helden.model.profession.soldat.Sappeur;
import helden.model.profession.soldat.Schuetze;
import helden.model.profession.soldat.SchwereReiterei;
import helden.model.profession.soldat.SchweresFussvolk;
import helden.model.profession.soldat.Seeartillerist;
import helden.model.profession.soldat.Seesoldat;
import helden.model.profession.soldat.Streitwagenlenker;
import helden.model.profession.soldat.Thinskari;

public class Soldat
extends L {
    private P returnifnull;
    private P \u00f4\u00f4\u00d3O00;
    private P \u00f8\u00f4\u00d3O00;
    private P \u00d4\u00f5\u00d3O00;
    private P \u00d8\u00f4\u00d3O00;
    private P O\u00f5\u00d3O00;
    private P \u00d5\u00f5\u00d3O00;
    private P \u00f5\u00f4\u00d3O00;
    private P \u00d3\u00f5\u00d3O00;
    private P privateintnull;
    private P o\u00f5\u00d3O00;
    private P newifnull;
    private P forintnull;

    public Soldat() {
    }

    public Soldat(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getArtillerist() {
        if (this.\u00d3\u00f5\u00d3O00 == null) {
            this.\u00d3\u00f5\u00d3O00 = new Artillerist();
        }
        return this.\u00d3\u00f5\u00d3O00;
    }

    public P getAufgesessenerSchuetze() {
        if (this.\u00f5\u00f4\u00d3O00 == null) {
            this.\u00f5\u00f4\u00d3O00 = new AufgesessenerSchuetze();
        }
        return this.\u00f5\u00f4\u00d3O00;
    }

    public P getBerittenerSchuetze() {
        if (this.\u00d5\u00f5\u00d3O00 == null) {
            this.\u00d5\u00f5\u00d3O00 = new BerittenerSchuetze();
        }
        return this.\u00d5\u00f5\u00d3O00;
    }

    @Override
    public String getID() {
        return "P62";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getLeichteReiterei() {
        if (this.\u00f8\u00f4\u00d3O00 == null) {
            this.\u00f8\u00f4\u00d3O00 = new LeichteReiterei();
        }
        return this.\u00f8\u00f4\u00d3O00;
    }

    public P getLeichtesFussvolk() {
        if (this.\u00f4\u00f4\u00d3O00 == null) {
            this.\u00f4\u00f4\u00d3O00 = new LeichtesFussvolk();
        }
        return this.\u00f4\u00f4\u00d3O00;
    }

    public P getSappeur() {
        if (this.privateintnull == null) {
            this.privateintnull = new Sappeur();
        }
        return this.privateintnull;
    }

    public P getSchuetze() {
        if (this.O\u00f5\u00d3O00 == null) {
            this.O\u00f5\u00d3O00 = new Schuetze();
        }
        return this.O\u00f5\u00d3O00;
    }

    public P getSchwereReiterei() {
        if (this.\u00d4\u00f5\u00d3O00 == null) {
            this.\u00d4\u00f5\u00d3O00 = new SchwereReiterei();
        }
        return this.\u00d4\u00f5\u00d3O00;
    }

    public P getSchweresFussvolk() {
        if (this.returnifnull == null) {
            this.returnifnull = new SchweresFussvolk();
        }
        return this.returnifnull;
    }

    public P getSeeartillerist() {
        if (this.newifnull == null) {
            this.newifnull = new Seeartillerist();
        }
        return this.newifnull;
    }

    public P getSeesoldat() {
        if (this.o\u00f5\u00d3O00 == null) {
            this.o\u00f5\u00d3O00 = new Seesoldat();
        }
        return this.o\u00f5\u00d3O00;
    }

    public P getStreitwagenlenker() {
        if (this.\u00d8\u00f4\u00d3O00 == null) {
            this.\u00d8\u00f4\u00d3O00 = new Streitwagenlenker();
        }
        return this.\u00d8\u00f4\u00d3O00;
    }

    public P getThinskari() {
        if (this.forintnull == null) {
            this.forintnull = new Thinskari();
        }
        return this.forintnull;
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
        this.addAlleVarianten(this.getThinskari());
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

