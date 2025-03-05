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
import helden.model.profession.zauberweber.Beschuetzer;
import java.util.ArrayList;
import java.util.Iterator;

public class Zauberweber
extends L {
    private P \u00d3\u00d8\u00d3O00;
    private P o\u00d8\u00d3O00;
    private P whilenullnull;

    public Zauberweber() {
    }

    public Zauberweber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getWanderer());
        return arrayList;
    }

    public P getBeschuetzer() {
        if (this.whilenullnull == null) {
            this.whilenullnull = new Beschuetzer();
        }
        return this.whilenullnull;
    }

    @Override
    public String getID() {
        return "P76";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getWanderer() {
        if (this.o\u00d8\u00d3O00 == null) {
            this.o\u00d8\u00d3O00 = new Wanderer();
        }
        return this.o\u00d8\u00d3O00;
    }

    public P getZauberweber() {
        if (this.\u00d3\u00d8\u00d3O00 == null) {
            this.\u00d3\u00d8\u00d3O00 = new helden.model.profession.zauberweber.Zauberweber();
        }
        return this.\u00d3\u00d8\u00d3O00;
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
        } else {
            if (this.istMaennlich()) {
                return "Zauberweber";
            }
            return "Zauberweberin";
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getZauberweber());
        this.addAlleVarianten(this.getBeschuetzer());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getZauberweber());
        this.addMoeglicheVariante(this.getBeschuetzer());
    }
}

