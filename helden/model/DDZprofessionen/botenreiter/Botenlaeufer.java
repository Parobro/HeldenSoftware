/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.botenreiter;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.botenreiter.VarianteBotenreiter;
import java.util.ArrayList;

public class Botenlaeufer
extends VarianteBotenreiter {
    public Botenlaeufer() {
        super("Botenl\u00e4ufer", 4);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Botenl\u00e4ufer";
        }
        return "Botenl\u00e4uferin";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 3);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnewsuper.toString()));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.thisclassObject);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, -3);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.nullifString));
        return arrayList;
    }
}

