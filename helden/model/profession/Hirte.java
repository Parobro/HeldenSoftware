/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.hirte.Kleintierzuechter;
import helden.model.profession.hirte.NivesischerKarenhirte;
import helden.model.profession.hirte.Rinderhirte;
import helden.model.profession.hirte.Schaefer;
import helden.model.profession.hirte.VarianteHirte;
import helden.model.profession.hirte.Viehdieb;
import helden.model.profession.hirte.Wasserbueffelhirte;
import helden.model.profession.varianten.FerkinaBesessener;
import java.util.ArrayList;

public class Hirte
extends L {
    private P ifStringnull;
    private P returnStringnull;
    private P \u00f4O\u00d3O00;
    private P \u00f8O\u00d3O00;
    private P \u00d8O\u00d3O00;
    private P \u00d5O\u00d3O00;
    private P \u00d4O\u00d3O00;
    private P \u00f5O\u00d3O00;

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
        if (this.\u00f5O\u00d3O00 == null) {
            this.\u00f5O\u00d3O00 = new FerkinaBesessener();
        }
        return this.\u00f5O\u00d3O00;
    }

    public P getHirte() {
        if (this.ifStringnull == null) {
            this.ifStringnull = new VarianteHirte();
        }
        return this.ifStringnull;
    }

    @Override
    public String getID() {
        return "P36";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKleintierzuechter() {
        if (this.\u00d5O\u00d3O00 == null) {
            this.\u00d5O\u00d3O00 = new Kleintierzuechter();
        }
        return this.\u00d5O\u00d3O00;
    }

    public P getNivesischerKarenhirte() {
        if (this.\u00d8O\u00d3O00 == null) {
            this.\u00d8O\u00d3O00 = new NivesischerKarenhirte();
        }
        return this.\u00d8O\u00d3O00;
    }

    public P getRinderhirte() {
        if (this.returnStringnull == null) {
            this.returnStringnull = new Rinderhirte();
        }
        return this.returnStringnull;
    }

    public P getSchaefer() {
        if (this.\u00f4O\u00d3O00 == null) {
            this.\u00f4O\u00d3O00 = new Schaefer();
        }
        return this.\u00f4O\u00d3O00;
    }

    public P getViehdieb() {
        if (this.\u00f8O\u00d3O00 == null) {
            this.\u00f8O\u00d3O00 = new Viehdieb();
        }
        return this.\u00f8O\u00d3O00;
    }

    public P getWasserbueffelhirte() {
        if (this.\u00d4O\u00d3O00 == null) {
            this.\u00d4O\u00d3O00 = new Wasserbueffelhirte();
        }
        return this.\u00d4O\u00d3O00;
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

