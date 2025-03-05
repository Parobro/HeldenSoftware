/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.wellenkind.Wellenkinder;
import helden.model.myranor.profession.wellenkind.Wogenformer;
import java.util.Iterator;

public class Wellenkind
extends BasisTraditionsaufsaetze {
    private P ifprivateint;
    private P \u00f8\u00d6\u00d6O00;

    public Wellenkind() {
    }

    public Wellenkind(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P206";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getWellenkind() {
        if (this.ifprivateint == null) {
            this.ifprivateint = new Wellenkinder();
        }
        return this.ifprivateint;
    }

    public P getWogenformer() {
        if (this.\u00f8\u00d6\u00d6O00 == null) {
            this.\u00f8\u00d6\u00d6O00 = new Wogenformer();
        }
        return this.\u00f8\u00d6\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Wellenkind");
        } else {
            stringBuffer.append("Wellenkind");
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
        this.addAlleVarianten(this.getWogenformer());
        this.addAlleVarianten(this.getWellenkind());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWogenformer());
        this.addMoeglicheVariante(this.getWellenkind());
    }
}

