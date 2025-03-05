/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.bosparanischermagier;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.bosparanischermagier.BasisBosMagier;
import java.util.ArrayList;

public class NekromantBosparan
extends BasisBosMagier {
    public NekromantBosparan() {
        super("Nekromant der Imperialen Akademie zu Bosparan", 25);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Thargunitothgef\u00e4lliges Amulett");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Nekromant der Imperialen Akademie zu Bosparan";
        }
        return "Nekromantin der Imperialen Akademie zu Bosparan";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f6\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.whileinterfacesuper.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisvoidObject, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 5);
        k_02.\u00d200000(G.\u00d5\u00f6\u00f5000, 8);
        k_02.\u00d200000(G.\u00d50\u00f5000, 5);
        k_02.\u00d200000(G.nullpublicString, 4);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d30\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d5\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d6\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f4\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f80\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d4\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.forinterfacenew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 2);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d50\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d2\u00d3000), 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d6\u00f5\u00d4000));
        arrayList.add(new for(while.returnsuperObject));
        arrayList.add(new for(while.\u00d3\u00d30000));
        arrayList.add(new for(while.\u00d8\u00f6\u00f4000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d30\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f80\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d4\u00d3000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

