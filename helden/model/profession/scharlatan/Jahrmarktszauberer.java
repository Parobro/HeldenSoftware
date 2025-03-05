/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.scharlatan;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.scharlatan.VarianteScharlatan;
import java.util.ArrayList;

public class Jahrmarktszauberer
extends VarianteScharlatan {
    public Jahrmarktszauberer() {
        super("Jahrmarktszauberer", 13);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Jahrmarktszauberer";
        }
        return "Jahrmarktszauberin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00f4\u00f5\u00d2000, 3);
        return k_02;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        if (zauber.equals(Zauber.\u00d3\u00d3\u00d5000) || zauber.equals(Zauber.Stringpublicnew)) {
            return K.\u00f8O0000;
        }
        return K.\u00d300000;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(E.whilethisString);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                arrayList.add(E.\u00d5\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray, "Muttersprache oder Sprache der Kultur, in der sich der Held vorwiegend aufh\u00e4lt.");
            }
            case 6: {
                arrayList.add(G.o\u00f8\u00f5000);
                arrayList.add(G.StringdoString);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.OO\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.forclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.returnifObject, 4);
        k_02.o00000(this.getZauber(Zauber.newfornew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d6\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d5000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.newwhilenew), 5);
        k_02.o00000(this.getZauber(Zauber.O\u00f5\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d80\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.thisinterfacenew), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.fordonew), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d8\u00d4000), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.thisifclass));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.newfornew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d3\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.newwhilenew));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

