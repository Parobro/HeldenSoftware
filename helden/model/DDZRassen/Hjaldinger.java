/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZRassen;

import helden.framework.Geschlecht;
import helden.framework.int.OooO;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.Cyclopea;
import helden.model.DDZKulturen.Fjarninger;
import helden.model.DDZKulturen.Gjalskerlaender;
import helden.model.rasse.Thorwaler;
import java.util.ArrayList;

public class Hjaldinger
extends Thorwaler {
    public Hjaldinger() {
    }

    public Hjaldinger(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "R21";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new helden.model.DDZKulturen.Hjaldinger(this.getGeschlecht()));
        arrayList.add(new Fjarninger(this.getGeschlecht()));
        arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Cyclopea(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Hjaldinger";
        }
        return "Hjaldingerin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d8\u00f6OO00);
        this.addAlleVarianten(\u00f5\u00f6OO00);
        this.addAlleVarianten(StringObjectvoid);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d8\u00f6OO00);
        this.addMoeglicheVariante(\u00f5\u00f6OO00);
        this.addMoeglicheVariante(StringObjectvoid);
    }
}

