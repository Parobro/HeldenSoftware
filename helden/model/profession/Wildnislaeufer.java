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
import helden.model.profession.wildnislaeufer.Auenlauefer;
import helden.model.profession.wildnislaeufer.Schneelaeufer;
import helden.model.profession.wildnislaeufer.Steppenreiter;
import helden.model.profession.wildnislaeufer.Wipfellaeufer;
import java.util.ArrayList;

public class Wildnislaeufer
extends L {
    private P newthisnull;
    private P \u00d5\u00d8\u00d2O00;
    private P returnthisnull;
    private P \u00d3\u00d8\u00d2O00;
    private P \u00d4\u00d8\u00d2O00;

    public Wildnislaeufer() {
    }

    public Wildnislaeufer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getWanderer());
        return arrayList;
    }

    public P getAuenlaeufer() {
        if (this.newthisnull == null) {
            this.newthisnull = new Auenlauefer();
        }
        return this.newthisnull;
    }

    @Override
    public String getID() {
        return "P72";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getSchneelaeufer() {
        if (this.\u00d3\u00d8\u00d2O00 == null) {
            this.\u00d3\u00d8\u00d2O00 = new Schneelaeufer();
        }
        return this.\u00d3\u00d8\u00d2O00;
    }

    public P getSteppenreiter() {
        if (this.\u00d5\u00d8\u00d2O00 == null) {
            this.\u00d5\u00d8\u00d2O00 = new Steppenreiter();
        }
        return this.\u00d5\u00d8\u00d2O00;
    }

    public P getWanderer() {
        if (this.\u00d4\u00d8\u00d2O00 == null) {
            this.\u00d4\u00d8\u00d2O00 = new Wanderer();
        }
        return this.\u00d4\u00d8\u00d2O00;
    }

    public P getWipfellaeufer() {
        if (this.returnthisnull == null) {
            this.returnthisnull = new Wipfellaeufer();
        }
        return this.returnthisnull;
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
        if (this.istMaennlich()) {
            stringBuffer.append("Wildnisl\u00e4ufer");
        } else {
            stringBuffer.append("Wildnisl\u00e4uferin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(", ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAuenlaeufer());
        this.addAlleVarianten(this.getSteppenreiter());
        this.addAlleVarianten(this.getWipfellaeufer());
        this.addAlleVarianten(this.getSchneelaeufer());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAuenlaeufer());
        this.addMoeglicheVariante(this.getSteppenreiter());
        this.addMoeglicheVariante(this.getWipfellaeufer());
        this.addMoeglicheVariante(this.getSchneelaeufer());
    }
}

