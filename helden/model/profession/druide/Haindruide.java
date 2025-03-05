/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.druide;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
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

public class Haindruide
extends Druide {
    public Haindruide() {
        super("Haindruide", 17);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Haindruide";
        }
        return "Haindruidin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
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
        switch (n) {
            case 0: {
                arrayList.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
                arrayList.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
                arrayList.add(oooo_0.o00000(while.nullreturnnew.toString()));
                arrayList.add(oooo_0.o00000(while.o\u00f50000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.returnprivateObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.whilenewnew));
                arrayList.add(this.getZauber(Zauber.\u00f4o\u00d5000));
                int[] nArray = new int[]{4, 1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.thispublicnew), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d5000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d3\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.newreturnnew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d5\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.forintnew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d4\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f8\u00d4000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f8\u00d4000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d80\u00d4000), 2);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList arrayList = new ArrayList();
                ArrayList<for> arrayList2 = new ArrayList<for>();
                arrayList.add(new for(while.\u00d3\u00f5\u00d3000));
                arrayList.add(new for(while.Stringwhilesuper));
                arrayList.add(new for(while.\u00d5\u00f4\u00f4000));
                arrayList.add(new for(while.\u00f8\u00f6\u00d4000));
                arrayList.add(new for(while.\u00f6\u00d8O000));
                arrayList.add(new for(while.nullreturnnew));
                arrayList.add(new for(while.o\u00f50000));
                for (for for_ : arrayList) {
                    if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(for_.toString())) continue;
                    arrayList2.add(for_);
                }
                return new void(this.getProfession(), arrayList2, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d3000));
        arrayList.add(this.getZauber(Zauber.thispublicnew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d3O\u00d5000));
        if (this.getProfession().getGewaehlteTalente().contains(this.getZauber(Zauber.whilenewnew)) && this.getProfession().getWahlWert(this.getZauber(Zauber.whilenewnew)) == 4) {
            arrayList.add(this.getZauber(Zauber.whilenewnew));
        }
        if (this.getProfession().getGewaehlteTalente().contains(this.getZauber(Zauber.\u00f4o\u00d5000)) && this.getProfession().getWahlWert(this.getZauber(Zauber.\u00f4o\u00d5000)) == 4) {
            arrayList.add(this.getZauber(Zauber.\u00f4o\u00d5000));
        }
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d3\u00d4000));
        arrayList.add(this.getZauber(Zauber.newreturnnew));
    }
}

