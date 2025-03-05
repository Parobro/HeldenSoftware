/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZRassen;

import helden.framework.Geschlecht;
import helden.framework.int.OooO;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.Gjalskerlaender;
import helden.model.DDZKulturen.Hjaldinger;
import helden.model.DDZKulturen.Nivesenstaemme;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Serrach;
import helden.model.DDZKulturen.Trollzacken;
import helden.model.rasse.Norbarde;
import java.util.ArrayList;

public class AlHani
extends Norbarde {
    public AlHani() {
    }

    public AlHani(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "R22";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Alhanien(this.getGeschlecht()));
        arrayList.add(new Serrach(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
            arrayList.add(new Nivesenstaemme(this.getGeschlecht()));
            arrayList.add(new Hjaldinger(this.getGeschlecht()));
            Nordprovinzen nordprovinzen = new Nordprovinzen(this.getGeschlecht());
            nordprovinzen.clearMoeglicheVarianten();
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.thisintreturn);
            arrayList.add(nordprovinzen);
            arrayList.add(new Trollzacken(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return "Al'Hani";
    }
}

