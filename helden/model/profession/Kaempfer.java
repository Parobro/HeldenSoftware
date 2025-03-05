/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.kaempfer.AuelfischerKaempfer;
import helden.model.profession.kaempfer.FirnelfischerKaempfer;
import helden.model.profession.kaempfer.SteppenelfischerKaempfer;
import helden.model.profession.kaempfer.WaldelfischerKaempfer;
import helden.model.profession.varianten.Wanderer;
import java.util.ArrayList;
import java.util.Iterator;

public class Kaempfer
extends L {
    private P \u00d4O\u00d5O00;
    private P \u00d3O\u00d5O00;
    private P nullObjectint;
    private P oO\u00d5O00;
    private P \u00d5O\u00d5O00;

    public Kaempfer() {
    }

    public Kaempfer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getWanderer());
        return arrayList;
    }

    public P getAuelfischerKaempfer() {
        if (this.\u00d3O\u00d5O00 == null) {
            this.\u00d3O\u00d5O00 = new AuelfischerKaempfer();
        }
        return this.\u00d3O\u00d5O00;
    }

    public P getFirnelfischerKaempfer() {
        if (this.\u00d5O\u00d5O00 == null) {
            this.\u00d5O\u00d5O00 = new FirnelfischerKaempfer();
        }
        return this.\u00d5O\u00d5O00;
    }

    @Override
    public String getID() {
        return "P40";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getSteppenelfischerKaempfer() {
        if (this.nullObjectint == null) {
            this.nullObjectint = new SteppenelfischerKaempfer();
        }
        return this.nullObjectint;
    }

    public P getWaldelfischerKaempfer() {
        if (this.oO\u00d5O00 == null) {
            this.oO\u00d5O00 = new WaldelfischerKaempfer();
        }
        return this.oO\u00d5O00;
    }

    public P getWanderer() {
        if (this.\u00d4O\u00d5O00 == null) {
            this.\u00d4O\u00d5O00 = new Wanderer();
        }
        return this.\u00d4O\u00d5O00;
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
    public boolean istElfischeProfession() {
        return true;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.getGewaehlteVarianten().size() == 0) {
            if (this.istMaennlich()) {
                return "Elfenk\u00e4mpfer";
            }
            return "Elfenk\u00e4mpferin";
        }
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAuelfischerKaempfer());
        this.addAlleVarianten(this.getSteppenelfischerKaempfer());
        this.addAlleVarianten(this.getWaldelfischerKaempfer());
        this.addAlleVarianten(this.getFirnelfischerKaempfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAuelfischerKaempfer());
        this.addMoeglicheVariante(this.getSteppenelfischerKaempfer());
        this.addMoeglicheVariante(this.getWaldelfischerKaempfer());
        this.addMoeglicheVariante(this.getFirnelfischerKaempfer());
    }
}

