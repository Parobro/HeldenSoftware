/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.handwerker.HandwerkerVariante;
import java.util.ArrayList;
import java.util.Iterator;

public class Handwerker
extends L {
    private ArrayList<P> \u00f5\u00f8\u00d5O00;

    public Handwerker() {
    }

    public Handwerker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P162";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Handwerker");
        } else {
            stringBuffer.append("Handwerkerin");
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
        if (this.\u00f5\u00f8\u00d5O00 == null) {
            this.superfloat();
        }
        for (P p2 : this.\u00f5\u00f8\u00d5O00) {
            this.addAlleVarianten(p2);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        if (this.\u00f5\u00f8\u00d5O00 == null) {
            this.superfloat();
        }
        for (P p2 : this.\u00f5\u00f8\u00d5O00) {
            this.addMoeglicheVariante(p2);
        }
    }

    private void superfloat() {
        this.\u00f5\u00f8\u00d5O00 = new ArrayList();
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.\u00f5o\u00d6000);
        arrayList.add(voidsuper.forvoidObject);
        arrayList.add(voidsuper.\u00d8O\u00d8000);
        arrayList.add(voidsuper.\u00d4\u00d3\u00d6000);
        arrayList.add(voidsuper.o\u00f6\u00d5000);
        arrayList.add(voidsuper.\u00f80\u00d8000);
        arrayList.add(voidsuper.oO\u00d6000);
        arrayList.add(voidsuper.Oo\u00d6000);
        arrayList.add(voidsuper.O\u00f5\u00d6000);
        arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d8\u00f5\u00d6000);
        arrayList.add(voidsuper.privateclassObject);
        arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
        arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
        arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
        arrayList.add(voidsuper.ififObject);
        arrayList.add(voidsuper.returnifObject);
        arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
        arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
        arrayList.add(voidsuper.StringfloatObject);
        arrayList.add(voidsuper.whilewhileObject);
        arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
        arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
        arrayList.add(voidsuper.newreturnObject);
        arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
        arrayList.add(voidsuper.oo\u00d8000);
        for (oo0o_0 oo0o_02 : arrayList) {
            this.\u00f5\u00f8\u00d5O00.add(new HandwerkerVariante((voidsuper)oo0o_02));
        }
    }
}

