/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.schreiber.Amtsschreiber;
import helden.model.DDZprofessionen.schreiber.Kontorist;
import helden.model.DDZprofessionen.schreiber.Kopist;
import helden.model.DDZprofessionen.schreiber.VarianteSchreiber;
import helden.model.profession.varianten.DraconiterProfanerZweig;
import java.util.ArrayList;

public class Schreiber
extends BasisDDZProfessionMitGeweihter {
    private P thisclassif;
    private P \u00d8\u00d3\u00d8O00;
    private P \u00f4\u00d3\u00d8O00;
    private P \u00d5\u00d3\u00d8O00;
    private P \u00f5\u00d3\u00d8O00;

    public Schreiber() {
    }

    public Schreiber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getDraconiter());
        return arrayList;
    }

    public P getAmtsschreiber() {
        if (this.\u00d8\u00d3\u00d8O00 == null) {
            this.\u00d8\u00d3\u00d8O00 = new Amtsschreiber();
        }
        return this.\u00d8\u00d3\u00d8O00;
    }

    public P getDraconiter() {
        if (this.\u00f5\u00d3\u00d8O00 == null) {
            this.\u00f5\u00d3\u00d8O00 = new DraconiterProfanerZweig();
        }
        return this.\u00f5\u00d3\u00d8O00;
    }

    @Override
    public String getID() {
        return "P99";
    }

    public P getKontorist() {
        if (this.\u00d5\u00d3\u00d8O00 == null) {
            this.\u00d5\u00d3\u00d8O00 = new Kontorist();
        }
        return this.\u00d5\u00d3\u00d8O00;
    }

    public P getKopist() {
        if (this.\u00f4\u00d3\u00d8O00 == null) {
            this.\u00f4\u00d3\u00d8O00 = new Kopist();
        }
        return this.\u00f4\u00d3\u00d8O00;
    }

    public P getVarianteSchreiber() {
        if (this.thisclassif == null) {
            this.thisclassif = new VarianteSchreiber();
        }
        return this.thisclassif;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getDraconiter());
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schreiber");
        } else {
            stringBuffer.append("Schreiberin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteSchreiber());
        this.addAlleVarianten(this.getAmtsschreiber());
        this.addAlleVarianten(this.getKopist());
        this.addAlleVarianten(this.getKontorist());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteSchreiber());
        this.addMoeglicheVariante(this.getAmtsschreiber());
        this.addMoeglicheVariante(this.getKopist());
        this.addMoeglicheVariante(this.getKontorist());
    }
}

