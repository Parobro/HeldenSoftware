/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.zaubertaenzer.GauklertaenzerVariante;
import helden.model.myranor.profession.zaubertaenzer.TempeltaenzerVariante;
import java.util.Iterator;

public class Zaubertaenzer
extends BasisTraditionsaufsaetze {
    private P forpublicint;
    private P \u00d8\u00d5\u00d6O00;

    public Zaubertaenzer() {
    }

    public Zaubertaenzer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGaukler() {
        if (this.forpublicint == null) {
            this.forpublicint = new GauklertaenzerVariante();
        }
        return this.forpublicint;
    }

    @Override
    public String getID() {
        return "P214";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getZaubertaenzer() {
        if (this.\u00d8\u00d5\u00d6O00 == null) {
            this.\u00d8\u00d5\u00d6O00 = new TempeltaenzerVariante();
        }
        return this.\u00d8\u00d5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Zaubert\u00e4nzer");
        } else {
            stringBuffer.append("Zaubert\u00e4nzer");
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
        this.addAlleVarianten(this.getZaubertaenzer());
        this.addAlleVarianten(this.getGaukler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getZaubertaenzer());
        this.addMoeglicheVariante(this.getGaukler());
    }
}

