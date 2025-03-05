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
import helden.model.profession.varianten.Wanderer;
import java.util.ArrayList;
import java.util.Iterator;

public class Bewahrer
extends L {
    private P oo\u00d3O00;
    private P Oo\u00d3O00;

    public Bewahrer() {
    }

    public Bewahrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getWanderer());
        return arrayList;
    }

    public P getBewahrer() {
        if (this.oo\u00d3O00 == null) {
            this.oo\u00d3O00 = new helden.model.profession.bewahrer.Bewahrer();
        }
        return this.oo\u00d3O00;
    }

    @Override
    public String getID() {
        return "P10";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getWanderer() {
        if (this.Oo\u00d3O00 == null) {
            this.Oo\u00d3O00 = new Wanderer();
        }
        return this.Oo\u00d3O00;
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
            if (this.istMaennlich()) {
                return "Bewahrer";
            }
            return "Bewahrerin";
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBewahrer());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBewahrer());
    }
}

