/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.schamane.Skuldrun;
import java.util.ArrayList;
import java.util.Vector;

public class SkuldrunMammutSeher
extends Skuldrun {
    public SkuldrunMammutSeher() {
        super("Skuldrun: Mammut-Seher", 7);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Skuldrun: Mammut-Seher";
        }
        return "Skuldrun: Mammut-Seherin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d8\u00d3\u00d8000, 3);
        k_02.\u00d200000(voidsuper.returnwhileObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d30\u00f5000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        if (n == 1) {
            Vector<KonkreterZauber> vector = new Vector<KonkreterZauber>(2);
            vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
            vector.add(this.getZauber(Zauber.\u00d4o\u00d3000));
            return o00o_0.o00000(this.getProfession(), K.o00000(vector), 1);
        }
        return super.getVorteilAuswahl(n);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        M m = K.\u00d600000();
        m.\u00d2o0000();
        m.o00000(this.getZauber(Zauber.\u00d8\u00f4\u00d3000));
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

