/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.legendensaenger.Unterhaendler;
import helden.model.profession.varianten.Wanderer;
import java.util.ArrayList;
import java.util.Iterator;

public class Legendensaenger
extends L {
    private P \u00d4\u00f5\u00d5O00;
    private P \u00d5\u00f5\u00d5O00;
    private P \u00d3\u00f5\u00d5O00;

    public Legendensaenger() {
    }

    public Legendensaenger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getWanderer());
        return arrayList;
    }

    @Override
    public String getID() {
        return "P47";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getLegendenSaenger() {
        if (this.\u00d4\u00f5\u00d5O00 == null) {
            this.\u00d4\u00f5\u00d5O00 = new helden.model.profession.legendensaenger.Legendensaenger();
        }
        return this.\u00d4\u00f5\u00d5O00;
    }

    public P getUnterhaendler() {
        if (this.\u00d3\u00f5\u00d5O00 == null) {
            this.\u00d3\u00f5\u00d5O00 = new Unterhaendler();
        }
        return this.\u00d3\u00f5\u00d5O00;
    }

    public P getWanderer() {
        if (this.\u00d5\u00f5\u00d5O00 == null) {
            this.\u00d5\u00f5\u00d5O00 = new Wanderer();
        }
        return this.\u00d5\u00f5\u00d5O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getWanderer());
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.varianteGewaehlt()) {
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        if (stringBuffer.toString().equals("")) {
            return "Legendens\u00e4nger";
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getLegendenSaenger());
        this.addAlleVarianten(this.getUnterhaendler());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLegendenSaenger());
        this.addMoeglicheVariante(this.getUnterhaendler());
    }
}

