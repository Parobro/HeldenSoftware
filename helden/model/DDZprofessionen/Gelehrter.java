/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.gelehrter.Anatom;
import helden.model.DDZprofessionen.gelehrter.Astronom;
import helden.model.DDZprofessionen.gelehrter.Mathematicus;
import helden.model.DDZprofessionen.gelehrter.Medicus;
import helden.model.DDZprofessionen.gelehrter.PhilosophMetaphysikerStaatskundler;
import helden.model.DDZprofessionen.gelehrter.ZwergischerZahlenmystiker;
import java.util.Iterator;

public class Gelehrter
extends BasisDDZProfessionMitGeweihter {
    private P returnifif;
    private P \u00d5\u00f8\u00d8O00;
    private P \u00d3\u00f8\u00d8O00;
    private P \u00d4\u00f8\u00d8O00;
    private P newifif;
    private P o\u00f8\u00d8O00;

    public Gelehrter() {
    }

    public Gelehrter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAnatom() {
        if (this.returnifif == null) {
            this.returnifif = new Anatom();
        }
        return this.returnifif;
    }

    public P getAstronom() {
        if (this.\u00d5\u00f8\u00d8O00 == null) {
            this.\u00d5\u00f8\u00d8O00 = new Astronom();
        }
        return this.\u00d5\u00f8\u00d8O00;
    }

    @Override
    public String getID() {
        return "P117";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getMathematicus() {
        if (this.\u00d3\u00f8\u00d8O00 == null) {
            this.\u00d3\u00f8\u00d8O00 = new Mathematicus();
        }
        return this.\u00d3\u00f8\u00d8O00;
    }

    public P getMedicus() {
        if (this.\u00d4\u00f8\u00d8O00 == null) {
            this.\u00d4\u00f8\u00d8O00 = new Medicus();
        }
        return this.\u00d4\u00f8\u00d8O00;
    }

    public P getPhilosophMetaphysikerStaatskundler() {
        if (this.newifif == null) {
            this.newifif = new PhilosophMetaphysikerStaatskundler();
        }
        return this.newifif;
    }

    public P getZwergischerZahlenmystiker() {
        if (this.o\u00f8\u00d8O00 == null) {
            this.o\u00f8\u00d8O00 = new ZwergischerZahlenmystiker();
        }
        return this.o\u00f8\u00d8O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return true;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return true;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Gelehrter");
        } else {
            stringBuffer.append("Gelehrte");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAnatom());
        this.addAlleVarianten(this.getAstronom());
        this.addAlleVarianten(this.getMathematicus());
        this.addAlleVarianten(this.getMedicus());
        this.addAlleVarianten(this.getPhilosophMetaphysikerStaatskundler());
        this.addAlleVarianten(this.getZwergischerZahlenmystiker());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAnatom());
        this.addMoeglicheVariante(this.getAstronom());
        this.addMoeglicheVariante(this.getMathematicus());
        this.addMoeglicheVariante(this.getMedicus());
        this.addMoeglicheVariante(this.getPhilosophMetaphysikerStaatskundler());
        this.addMoeglicheVariante(this.getZwergischerZahlenmystiker());
    }
}

