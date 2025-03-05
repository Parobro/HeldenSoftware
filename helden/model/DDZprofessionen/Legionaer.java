/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.legionaer.Decurio;
import helden.model.DDZprofessionen.legionaer.Grenztruppen;
import helden.model.DDZprofessionen.legionaer.Sonnenlegion;
import java.util.ArrayList;
import java.util.Iterator;

public class Legionaer
extends BasisDDZProfessionMitGeweihter {
    private P \u00f8\u00d2\u00d8O00;
    private P ifStringif;
    private P \u00f4\u00d2\u00d8O00;
    private P \u00f5\u00d2\u00d8O00;

    public Legionaer() {
    }

    public Legionaer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getDecurio());
        return arrayList;
    }

    public P getDecurio() {
        if (this.\u00f8\u00d2\u00d8O00 == null) {
            this.\u00f8\u00d2\u00d8O00 = new Decurio();
        }
        return this.\u00f8\u00d2\u00d8O00;
    }

    public P getGrenztruppen() {
        if (this.\u00f4\u00d2\u00d8O00 == null) {
            this.\u00f4\u00d2\u00d8O00 = new Grenztruppen();
        }
        return this.\u00f4\u00d2\u00d8O00;
    }

    @Override
    public String getID() {
        return "P100";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getLegionaer() {
        if (this.ifStringif == null) {
            this.ifStringif = new helden.model.DDZprofessionen.legionaer.Legionaer();
        }
        return this.ifStringif;
    }

    public P getSonnenlegion() {
        if (this.\u00f5\u00d2\u00d8O00 == null) {
            this.\u00f5\u00d2\u00d8O00 = new Sonnenlegion();
        }
        return this.\u00f5\u00d2\u00d8O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = super.getZusatzVarianten(p2);
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getDecurio());
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Legion\u00e4r");
        } else {
            stringBuffer.append("Legion\u00e4rin");
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
        this.addAlleVarianten(this.getLegionaer());
        this.addAlleVarianten(this.getGrenztruppen());
        this.addAlleVarianten(this.getSonnenlegion());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLegionaer());
        this.addMoeglicheVariante(this.getGrenztruppen());
        this.addMoeglicheVariante(this.getSonnenlegion());
    }
}

