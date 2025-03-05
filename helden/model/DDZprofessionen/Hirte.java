/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.hirte.Kleintierzuechter;
import helden.model.DDZprofessionen.hirte.NivesischerKarenhirte;
import helden.model.DDZprofessionen.hirte.Rinderhirte;
import helden.model.DDZprofessionen.hirte.Schaefer;
import helden.model.DDZprofessionen.hirte.VarianteHirte;
import helden.model.DDZprofessionen.hirte.Viehdieb;
import helden.model.DDZprofessionen.hirte.Wasserbueffelhirte;
import helden.model.DDZprofessionen.varianten.FerkinaBesessener;
import java.util.ArrayList;

public class Hirte
extends BasisDDZProfessionMitGeweihter {
    private P \u00f8\u00f6\u00d8O00;
    private P \u00d8\u00f6\u00d8O00;
    private P \u00f5\u00f6\u00d8O00;
    private P O\u00f8\u00d8O00;
    private P \u00f4\u00f6\u00d8O00;
    private P forintif;
    private P \u00d5\u00f6\u00d8O00;
    private P privateintif;

    public Hirte() {
    }

    public Hirte(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        return arrayList;
    }

    public P getBessene() {
        if (this.privateintif == null) {
            this.privateintif = new FerkinaBesessener();
        }
        return this.privateintif;
    }

    public P getHirte() {
        if (this.\u00f8\u00f6\u00d8O00 == null) {
            this.\u00f8\u00f6\u00d8O00 = new VarianteHirte();
        }
        return this.\u00f8\u00f6\u00d8O00;
    }

    @Override
    public String getID() {
        return "P106";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKleintierzuechter() {
        if (this.forintif == null) {
            this.forintif = new Kleintierzuechter();
        }
        return this.forintif;
    }

    public P getNivesischerKarenhirte() {
        if (this.\u00f4\u00f6\u00d8O00 == null) {
            this.\u00f4\u00f6\u00d8O00 = new NivesischerKarenhirte();
        }
        return this.\u00f4\u00f6\u00d8O00;
    }

    public P getRinderhirte() {
        if (this.\u00d8\u00f6\u00d8O00 == null) {
            this.\u00d8\u00f6\u00d8O00 = new Rinderhirte();
        }
        return this.\u00d8\u00f6\u00d8O00;
    }

    public P getSchaefer() {
        if (this.\u00f5\u00f6\u00d8O00 == null) {
            this.\u00f5\u00f6\u00d8O00 = new Schaefer();
        }
        return this.\u00f5\u00f6\u00d8O00;
    }

    public P getViehdieb() {
        if (this.O\u00f8\u00d8O00 == null) {
            this.O\u00f8\u00d8O00 = new Viehdieb();
        }
        return this.O\u00f8\u00d8O00;
    }

    public P getWasserbueffelhirte() {
        if (this.\u00d5\u00f6\u00d8O00 == null) {
            this.\u00d5\u00f6\u00d8O00 = new Wasserbueffelhirte();
        }
        return this.\u00d5\u00f6\u00d8O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getBessene());
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Hirte");
        } else {
            stringBuffer.append("Hirtin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHirte());
        this.addAlleVarianten(this.getRinderhirte());
        this.addAlleVarianten(this.getSchaefer());
        this.addAlleVarianten(this.getViehdieb());
        this.addAlleVarianten(this.getNivesischerKarenhirte());
        this.addAlleVarianten(this.getKleintierzuechter());
        this.addAlleVarianten(this.getWasserbueffelhirte());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHirte());
        this.addMoeglicheVariante(this.getRinderhirte());
        this.addMoeglicheVariante(this.getSchaefer());
        this.addMoeglicheVariante(this.getViehdieb());
        this.addMoeglicheVariante(this.getNivesischerKarenhirte());
    }
}

