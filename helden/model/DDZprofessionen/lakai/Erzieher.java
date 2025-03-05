/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.lakai;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.DDZprofessionen.lakai.Lakai;
import java.util.ArrayList;

public class Erzieher
extends Lakai {
    public Erzieher() {
        super("Erzieher", 5);
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
    public int getAnzahlVerteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Erzieher";
        }
        return "Erzieherin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 14;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                for (oo0o_0 oo0o_02 : this.getProfession().getTalente()) {
                    if (!N.floatsuper().\u00f800000().contains(oo0o_02) && !N.floatsuper().\u00d600000().contains(oo0o_02) && !N.floatsuper().\u00f4o0000().contains(oo0o_02)) continue;
                    arrayList.add(oo0o_02);
                }
                for (oo0o_0 oo0o_02 : this.getProfession().getGewaehlteTalente()) {
                    if (!N.floatsuper().\u00f800000().contains(oo0o_02) && !N.floatsuper().\u00d600000().contains(oo0o_02) && !N.floatsuper().\u00f4o0000().contains(oo0o_02)) continue;
                    arrayList.add(oo0o_02);
                }
                return new returnsuper(this.getProfession(), arrayList, 10, 3);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                arrayList.add(G.\u00f4\u00d4\u00f5000);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.o00000(voidsuper.\u00d5O\u00d6000);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, -1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00f4\u00d6000);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.privatedoObject, -2);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for(while.\u00f8\u00f6\u00d5000));
                arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }
}

