/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZRassen;

import helden.framework.Geschlecht;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.Hjaldinger;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Nortreisch;
import helden.model.DDZKulturen.Orkland;
import helden.model.DDZKulturen.Yurach;
import java.util.ArrayList;

public class Ork
extends helden.model.rasse.Ork {
    public static final P O\u00f5OO00 = new P("Ghorinchai", 0, false);
    public static final P o\u00f5OO00 = new P("Tordochai", 0, false);

    public Ork() {
    }

    public Ork(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "R23";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Orkland(this.getGeschlecht()));
        arrayList.add(new Yurach(this.getGeschlecht()));
        arrayList.add(new Nortreisch(this.getGeschlecht()));
        if (!bl) {
            Nordprovinzen nordprovinzen = new Nordprovinzen(this.getGeschlecht());
            nordprovinzen.clearMoeglicheVarianten();
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00f5\u00d50O00);
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.thisintreturn);
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00d3\u00d60O00);
            arrayList.add(nordprovinzen);
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Hjaldinger(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        if (this.istVariante(O\u00f5OO00)) {
            stringBuffer.append("/Ghorinchai");
        }
        if (this.istVariante(o\u00f5OO00)) {
            stringBuffer.append("/Tordochai");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        super.setzeAlleVarianten();
        this.addAlleVarianten(O\u00f5OO00);
        this.addAlleVarianten(o\u00f5OO00);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        super.setzeMoeglicheVarianten();
        this.addMoeglicheVariante(O\u00f5OO00);
        this.addMoeglicheVariante(o\u00f5OO00);
    }
}

