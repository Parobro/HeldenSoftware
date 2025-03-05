/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.jaeger.Fallensteller;
import helden.model.DDZprofessionen.jaeger.Robbenjaeger;
import helden.model.DDZprofessionen.jaeger.Stammesjaeger;
import helden.model.DDZprofessionen.jaeger.ThorwallerFallensteller;
import helden.model.DDZprofessionen.jaeger.VarianteJaeger;
import helden.model.DDZprofessionen.jaeger.Wildhueter;
import helden.model.DDZprofessionen.varianten.FerkinaBesessener;
import helden.model.DDZprofessionen.varianten.ThorwalerFallensteller;
import java.util.ArrayList;

public class Jaeger
extends BasisDDZProfessionMitGeweihter {
    private P \u00d4\u00f8\u00d6O00;
    private P \u00f5\u00f8\u00d6O00;
    private P \u00d3\u00f8\u00d6O00;
    private P forsuperif;
    private P nullsuperif;
    private P \u00d5\u00f8\u00d6O00;
    private P \u00f4\u00f8\u00d6O00;
    private P \u00d8\u00f8\u00d6O00;

    public Jaeger() {
    }

    public Jaeger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        arrayList.add(this.getThorwalerFallensteller());
        return arrayList;
    }

    public P getBessene() {
        if (this.\u00d5\u00f8\u00d6O00 == null) {
            this.\u00d5\u00f8\u00d6O00 = new FerkinaBesessener();
        }
        return this.\u00d5\u00f8\u00d6O00;
    }

    public P getFallensteller() {
        if (this.\u00f5\u00f8\u00d6O00 == null) {
            this.\u00f5\u00f8\u00d6O00 = new Fallensteller();
        }
        return this.\u00f5\u00f8\u00d6O00;
    }

    @Override
    public String getID() {
        return "P107";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getRobbenjaeger() {
        if (this.forsuperif == null) {
            this.forsuperif = new Robbenjaeger();
        }
        return this.forsuperif;
    }

    public P getStammesjaeger() {
        if (this.\u00f4\u00f8\u00d6O00 == null) {
            this.\u00f4\u00f8\u00d6O00 = new Stammesjaeger();
        }
        return this.\u00f4\u00f8\u00d6O00;
    }

    public P getThorwalerFallensteller() {
        if (this.\u00d8\u00f8\u00d6O00 == null) {
            this.\u00d8\u00f8\u00d6O00 = new ThorwalerFallensteller();
        }
        return this.\u00d8\u00f8\u00d6O00;
    }

    public P getThorwallerFallensteller() {
        if (this.nullsuperif == null) {
            this.nullsuperif = new ThorwallerFallensteller();
        }
        return this.nullsuperif;
    }

    public P getVarianteJaeger() {
        if (this.\u00d4\u00f8\u00d6O00 == null) {
            this.\u00d4\u00f8\u00d6O00 = new VarianteJaeger();
        }
        return this.\u00d4\u00f8\u00d6O00;
    }

    public P getWildhueter() {
        if (this.\u00d3\u00f8\u00d6O00 == null) {
            this.\u00d3\u00f8\u00d6O00 = new Wildhueter();
        }
        return this.\u00d3\u00f8\u00d6O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getRobbenjaeger())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getThorwalerFallensteller());
            arrayList.add(arrayList2);
            return arrayList;
        }
        if (p2.equals(this.getThorwalerFallensteller())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList3 = new ArrayList<P>();
            arrayList3.add(this.getRobbenjaeger());
            arrayList.add(arrayList3);
            return arrayList;
        }
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList4 = new ArrayList<P>();
        arrayList4.add(this.getBessene());
        arrayList.add(arrayList4);
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            StringBuffer stringBuffer = new StringBuffer("J\u00e4ger");
            if (!this.istVariante(this.getVarianteJaeger()) && this.varianteGewaehlt()) {
                stringBuffer.append(": ");
                stringBuffer.append(this.getVariante().toString());
            }
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("J\u00e4gerin");
        if (!this.istVariante(this.getVarianteJaeger()) && this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteJaeger());
        this.addAlleVarianten(this.getFallensteller());
        this.addAlleVarianten(this.getWildhueter());
        this.addAlleVarianten(this.getRobbenjaeger());
        this.addAlleVarianten(this.getThorwallerFallensteller());
        this.addAlleVarianten(this.getStammesjaeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteJaeger());
        this.addMoeglicheVariante(this.getFallensteller());
        this.addMoeglicheVariante(this.getWildhueter());
        this.addMoeglicheVariante(this.getStammesjaeger());
    }
}

