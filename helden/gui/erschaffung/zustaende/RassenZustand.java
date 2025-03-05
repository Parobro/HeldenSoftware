/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.Einstellungen;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.model.RassenFabrik;
import java.util.ArrayList;

public class RassenZustand
extends ModifizierAuswahlZustand<o0oo_0> {
    public RassenZustand(HEW2 hEW2) {
        super(hEW2);
    }

    @Override
    public boolean anzeigen(o0oo_0 o0oo_02, P p2) {
        if (!this.super.getSetting().contains(o0oo_02, p2)) {
            return false;
        }
        return super.anzeigen(o0oo_02, p2);
    }

    @Override
    public ArrayList<o0oo_0> getAlleRPK() {
        o0oo_0 o0oo_02;
        ArrayList<o0oo_0> arrayList = RassenFabrik.getRassen(this.super.getGeschlecht(), false);
        if (Einstellungen.getInstance().isTestMode() && (o0oo_02 = RassenFabrik.getLeerRasse(this.super.getGeschlecht())) != null) {
            arrayList.add(o0oo_02);
        }
        return arrayList;
    }

    @Override
    public String getBezeichner() {
        return "Rasse";
    }

    @Override
    public ArrayList<o0oo_0> getMoeglicheRPK() {
        return RassenFabrik.getRassen(this.super.getGeschlecht(), false);
    }

    @Override
    public ArrayList<o0oo_0> getUebliche() {
        return new ArrayList<o0oo_0>();
    }

    @Override
    public boolean hatFilterBox() {
        return false;
    }

    @Override
    public boolean hatNameFilter() {
        return true;
    }

    @Override
    public boolean hatUeblicheFiler() {
        return false;
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.\u00d200000;
    }

    @Override
    public void update() {
    }
}

