/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.optimat.OptimatVZ;
import helden.model.myranor.profession.optimat.OptimatVariante;
import java.util.ArrayList;
import java.util.Iterator;

public class Optimat
extends BasisTraditionsaufsaetze {
    private P \u00f5\u00d8\u00d6O00;
    private P \u00f4\u00d8\u00d6O00;

    public Optimat() {
    }

    public Optimat(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P215";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getOptimat() {
        if (this.\u00f5\u00d8\u00d6O00 == null) {
            this.\u00f5\u00d8\u00d6O00 = new OptimatVariante();
        }
        return this.\u00f5\u00d8\u00d6O00;
    }

    public P getVZOptimat() {
        if (this.\u00f4\u00d8\u00d6O00 == null) {
            this.\u00f4\u00d8\u00d6O00 = new OptimatVZ();
        }
        return this.\u00f4\u00d8\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Optimat");
        } else {
            stringBuffer.append("Optimat");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
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
        this.addAlleVarianten(this.getOptimat());
        this.addAlleVarianten(this.getVZOptimat());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getOptimat());
        this.addMoeglicheVariante(this.getVZOptimat());
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<Object> arrayList = new ArrayList();
        if (this.getOptimat().equals(p2)) {
            arrayList = this.getAlleZusatzVarianten();
        } else if (this.getVZOptimat().equals(p2)) {
            for (P p3 : this.getAlleZusatzVarianten()) {
                if (!p3.toString().contains("(Z")) continue;
                arrayList.add(p3);
            }
        }
        ArrayList<ArrayList<Object>> arrayList2 = new ArrayList<ArrayList<Object>>();
        arrayList2.add(arrayList);
        return arrayList2;
    }
}

