/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.d.oooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.profession.schamane.Medizinmann;
import java.util.ArrayList;

public class MedizinmannUtulus
extends Medizinmann {
    public MedizinmannUtulus() {
        super("Medizinmann (Utulus)", 10);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Medizinmann (Utulus)";
        }
        return "Medizinfrau (Utulus)";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d3\u00f4O000);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        ArrayList<I> arrayList = super.getEntfernteKutlurVorteile();
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d5\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00f5000.toString()));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d3\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d5\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

