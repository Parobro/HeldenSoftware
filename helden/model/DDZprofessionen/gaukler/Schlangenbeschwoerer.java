/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gaukler;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gaukler.VarianteGaukler;
import java.util.ArrayList;

public class Schlangenbeschwoerer
extends VarianteGaukler {
    public Schlangenbeschwoerer() {
        super("Schlangenbeschw\u00f6rer", 4);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        int n = 4;
        return n;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Esel/Muli mit Ausr\u00fcstung");
        arrayList.add("Hochwertiges Instrument");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schlangenbeschw\u00f6rer";
        }
        return "Schlangenbeschw\u00f6rerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.ooO000);
        arrayList.add(I.\u00d5\u00d3O000);
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d5o\u00d8000);
        k_02.\u00d200000(voidsuper.privateObjectObject, 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        M m = (M)K.o00000(I.\u00d5\u00d50000);
        m.\u00d2o0000();
        m.o00000("tierische Gifte");
        oo0O.\u00d300000(m);
        return oo0O;
    }
}

