/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.int.L;
import helden.framework.int.super;
import helden.framework.oOoO.A.Object;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.model.myranor.profession.soldaten.SoldatenVariante;
import java.util.ArrayList;
import java.util.Iterator;

public class Soldaten
extends L
implements Object {
    private helden.framework.int.P forfloatint;

    public Soldaten() {
    }

    public Soldaten(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P184";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public helden.framework.int.P getSoldaten() {
        if (this.forfloatint == null) {
            this.forfloatint = new SoldatenVariante();
        }
        return this.forfloatint;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        if (this.getVariante() instanceof Object) {
            return ((Object)((java.lang.Object)this.getVariante())).getVerallgemeinteListenAuswahlen();
        }
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        return arrayList;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
    }

    @Override
    public void gewaehlterVorteil(public public_) {
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, K k2, boolean bl) {
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Soldat");
        } else {
            stringBuffer.append("Soldatin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
            Iterator<helden.framework.int.P> iterator = this.getGewaehlteVarianten().iterator();
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
        this.addAlleVarianten(this.getSoldaten());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSoldaten());
    }
}

