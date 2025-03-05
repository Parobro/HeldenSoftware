/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.edelhandwerker.Apothekarius;
import helden.model.DDZprofessionen.edelhandwerker.Baumeister;
import helden.model.DDZprofessionen.edelhandwerker.Huettenkundiger;
import helden.model.DDZprofessionen.edelhandwerker.Mechanikus;
import helden.model.DDZprofessionen.edelhandwerker.Schiffbauer;
import helden.model.DDZprofessionen.edelhandwerker.TradSchiffbauer;
import helden.model.DDZprofessionen.edelhandwerker.Tresorbauer;
import helden.model.DDZprofessionen.varianten.ViertelRunenzauberer;
import java.util.ArrayList;
import java.util.Iterator;

public class Edelhandwerker
extends BasisDDZProfessionMitGeweihter {
    private P \u00f4\u00d6\u00f4O00;
    private P O\u00d8\u00f4O00;
    private P o\u00d8\u00f4O00;
    private P \u00f8\u00d6\u00f4O00;
    private P \u00f5\u00d6\u00f4O00;
    private P forpublicif;
    private P privatepublicif;
    private P \u00d8\u00d6\u00f4O00;

    public Edelhandwerker() {
    }

    public Edelhandwerker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getApothekarius() {
        if (this.\u00f4\u00d6\u00f4O00 == null) {
            this.\u00f4\u00d6\u00f4O00 = new Apothekarius();
        }
        return this.\u00f4\u00d6\u00f4O00;
    }

    public P getBaumeister() {
        if (this.O\u00d8\u00f4O00 == null) {
            this.O\u00d8\u00f4O00 = new Baumeister();
        }
        return this.O\u00d8\u00f4O00;
    }

    public P getHuettenkundiger() {
        if (this.o\u00d8\u00f4O00 == null) {
            this.o\u00d8\u00f4O00 = new Huettenkundiger();
        }
        return this.o\u00d8\u00f4O00;
    }

    @Override
    public String getID() {
        return "P141";
    }

    public P getMechanikus() {
        if (this.\u00f8\u00d6\u00f4O00 == null) {
            this.\u00f8\u00d6\u00f4O00 = new Mechanikus();
        }
        return this.\u00f8\u00d6\u00f4O00;
    }

    public P getSchiffbauer() {
        if (this.\u00f5\u00d6\u00f4O00 == null) {
            this.\u00f5\u00d6\u00f4O00 = new Schiffbauer();
        }
        return this.\u00f5\u00d6\u00f4O00;
    }

    public P getTradSchiffbauer() {
        if (this.privatepublicif == null) {
            this.privatepublicif = new TradSchiffbauer();
        }
        return this.privatepublicif;
    }

    public P getTresorbauer() {
        if (this.forpublicif == null) {
            this.forpublicif = new Tresorbauer();
        }
        return this.forpublicif;
    }

    public P getViertelRunenZauberer() {
        if (this.\u00d8\u00d6\u00f4O00 == null) {
            this.\u00d8\u00d6\u00f4O00 = new ViertelRunenzauberer();
        }
        return this.\u00d8\u00d6\u00f4O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getSchiffbauer()) || p2.equals(this.getTradSchiffbauer())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getViertelRunenZauberer());
            arrayList.add(arrayList2);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Edelhandwerker");
        } else {
            stringBuffer.append("Edelhandwerkerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getApothekarius());
        this.addAlleVarianten(this.getBaumeister());
        this.addAlleVarianten(this.getHuettenkundiger());
        this.addAlleVarianten(this.getMechanikus());
        this.addAlleVarianten(this.getSchiffbauer());
        this.addAlleVarianten(this.getTresorbauer());
        this.addAlleVarianten(this.getTradSchiffbauer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getApothekarius());
        this.addMoeglicheVariante(this.getBaumeister());
        this.addMoeglicheVariante(this.getHuettenkundiger());
        this.addMoeglicheVariante(this.getMechanikus());
        this.addMoeglicheVariante(this.getSchiffbauer());
    }
}

