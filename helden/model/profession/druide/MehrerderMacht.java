/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.druide;

import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.druide.Druide;
import java.util.ArrayList;

public class MehrerderMacht
extends Druide {
    public MehrerderMacht() {
        super("Mehrer der Macht", 15);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Mehrer der Macht";
        }
        return "Mehrerin der Macht";
    }

    @Override
    public ArrayList<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        OOOo oOOo = this.getProfession().getGewaehlteSonderfertigkeiten();
        ArrayList<for> arrayList = new ArrayList<for>();
        if (oOOo.\u00d200000(while.\u00d8\u00d20000.toString())) {
            arrayList.add(new for(while.\u00d8\u00f5\u00d8000));
        }
        if (oOOo.\u00d200000(while.\u00d8\u00f5\u00d8000.toString())) {
            arrayList.add(new for(while.\u00d8\u00d20000));
        }
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d20000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5\u00d8000.toString()));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.O\u00d3\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.StringObjectObject);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.forpublicObject);
                arrayList.add(voidsuper.\u00d3\u00d6\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.O\u00d2\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d3\u00d4000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper3, 4);
        k_02.\u00d200000(this.getZauber(Zauber.forintnew), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d4\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d8\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8O\u00d5000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.oO\u00d5000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f8\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d2000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8o\u00d5000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.oo\u00d4000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d3\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.ifStringnew), 1);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.O\u00d2\u00d4000))) {
            arrayList.add(this.getZauber(Zauber.O\u00d2\u00d4000));
        }
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.\u00d8\u00d3\u00d4000))) {
            arrayList.add(this.getZauber(Zauber.\u00d8\u00d3\u00d4000));
        }
        arrayList.add(this.getZauber(Zauber.forintnew));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d8O\u00d5000));
        arrayList.add(this.getZauber(Zauber.oO\u00d5000));
        arrayList.add(this.getZauber(Zauber.o\u00f8\u00d4000));
    }
}

