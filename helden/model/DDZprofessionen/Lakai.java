/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.lakai.Erzieher;
import helden.model.DDZprofessionen.lakai.Hausknecht;
import helden.model.DDZprofessionen.lakai.Haussklave;
import helden.model.DDZprofessionen.lakai.HaussklaveAlAnfa;
import helden.model.DDZprofessionen.lakai.Kutscher;
import helden.model.DDZprofessionen.lakai.Leibdiener;

public class Lakai
extends BasisDDZProfessionMitGeweihter {
    private P thisinterfaceif;
    private P \u00d4\u00f4\u00f4O00;
    private P \u00d3\u00f4\u00f4O00;
    private P whileprivateif;
    private P \u00d8\u00f4\u00f4O00;
    private P \u00d5\u00f4\u00f4O00;

    public Lakai() {
    }

    public Lakai(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getErzieher() {
        if (this.\u00d5\u00f4\u00f4O00 == null) {
            this.\u00d5\u00f4\u00f4O00 = new Erzieher();
        }
        return this.\u00d5\u00f4\u00f4O00;
    }

    public P getHausknecht() {
        if (this.\u00d3\u00f4\u00f4O00 == null) {
            this.\u00d3\u00f4\u00f4O00 = new Hausknecht();
        }
        return this.\u00d3\u00f4\u00f4O00;
    }

    public P getHaussklave() {
        if (this.thisinterfaceif == null) {
            this.thisinterfaceif = new Haussklave();
        }
        return this.thisinterfaceif;
    }

    public P getHaussklaveAlAnfa() {
        if (this.\u00d4\u00f4\u00f4O00 == null) {
            this.\u00d4\u00f4\u00f4O00 = new HaussklaveAlAnfa();
        }
        return this.\u00d4\u00f4\u00f4O00;
    }

    @Override
    public String getID() {
        return "P140";
    }

    public P getKutscher() {
        if (this.\u00d8\u00f4\u00f4O00 == null) {
            this.\u00d8\u00f4\u00f4O00 = new Kutscher();
        }
        return this.\u00d8\u00f4\u00f4O00;
    }

    public P getLeibdiener() {
        if (this.whileprivateif == null) {
            this.whileprivateif = new Leibdiener();
        }
        return this.whileprivateif;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Lakai");
        } else {
            stringBuffer.append("Lakaiin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHaussklave());
        this.addAlleVarianten(this.getHausknecht());
        this.addAlleVarianten(this.getLeibdiener());
        this.addAlleVarianten(this.getKutscher());
        this.addAlleVarianten(this.getErzieher());
        this.addAlleVarianten(this.getHaussklaveAlAnfa());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHaussklave());
        this.addMoeglicheVariante(this.getHaussklaveAlAnfa());
        this.addMoeglicheVariante(this.getHausknecht());
        this.addMoeglicheVariante(this.getLeibdiener());
        this.addMoeglicheVariante(this.getKutscher());
    }
}

