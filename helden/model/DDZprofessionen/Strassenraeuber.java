/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.strassenraeuber.Bandit;
import helden.model.DDZprofessionen.strassenraeuber.Freischaerler;
import helden.model.DDZprofessionen.strassenraeuber.Wegelagerer;
import helden.model.DDZprofessionen.varianten.FerkinaBesessener;
import java.util.ArrayList;

public class Strassenraeuber
extends BasisDDZProfessionMitGeweihter {
    private P \u00d8\u00d3\u00f4O00;
    private P privatedoif;
    private P \u00f5\u00d3\u00f4O00;
    private P \u00f4\u00d3\u00f4O00;

    public Strassenraeuber() {
    }

    public Strassenraeuber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        return arrayList;
    }

    public P getBandit() {
        if (this.\u00d8\u00d3\u00f4O00 == null) {
            this.\u00d8\u00d3\u00f4O00 = new Bandit();
        }
        return this.\u00d8\u00d3\u00f4O00;
    }

    public P getBessene() {
        if (this.\u00f4\u00d3\u00f4O00 == null) {
            this.\u00f4\u00d3\u00f4O00 = new FerkinaBesessener();
        }
        return this.\u00f4\u00d3\u00f4O00;
    }

    public P getFreischaerler() {
        if (this.\u00f5\u00d3\u00f4O00 == null) {
            this.\u00f5\u00d3\u00f4O00 = new Freischaerler();
        }
        return this.\u00f5\u00d3\u00f4O00;
    }

    @Override
    public String getID() {
        return "P114";
    }

    public P getWegelagerer() {
        if (this.privatedoif == null) {
            this.privatedoif = new Wegelagerer();
        }
        return this.privatedoif;
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
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Stra\u00dfenr\u00e4uber");
        } else {
            stringBuffer.append("Stra\u00dfenr\u00e4uberin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBandit());
        this.addAlleVarianten(this.getWegelagerer());
        this.addAlleVarianten(this.getFreischaerler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBandit());
        this.addMoeglicheVariante(this.getWegelagerer());
        this.addMoeglicheVariante(this.getFreischaerler());
    }
}

