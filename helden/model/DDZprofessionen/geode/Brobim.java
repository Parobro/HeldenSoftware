/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.geode;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.geode.Geode;
import java.util.ArrayList;

public class Brobim
extends Geode {
    public Brobim() {
        super("Brobim", 2);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 0;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Brobim";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.O\u00f8o000);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.\u00f8\u00d6o000);
        arrayList.add(I.\u00f8\u00d6O000);
        arrayList.add(I.\u00d8\u00d4O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, -4);
        return k_02;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d2\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00f8o\u00d4000));
                arrayList.add(this.getZauber(Zauber.O\u00d5\u00d3000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.Oo\u00d4000));
                arrayList.add(this.getZauber(Zauber.whileifnew));
                arrayList.add(this.getZauber(Zauber.\u00d8O\u00d3000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(this.getZauber(Zauber.newfornew));
                arrayList.add(this.getZauber(Zauber.\u00d4o\u00d5000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(this.getZauber(Zauber.O\u00d2\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d3\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00f8\u00d4000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(this.getZauber(Zauber.O\u00d6\u00d4000));
                arrayList.add(this.getZauber(Zauber.whilewhilenew));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, -1);
        k_02.o00000(voidsuper.\u00d40\u00d8000);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, -2);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, -2);
        k_02.\u00d200000(G.\u00d5\u00f8\u00f4000, 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 6);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d6\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.oo\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d3000), 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(I.forsupersuper);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00f60000));
        J j2 = (J)helden.framework.C.K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        M m = (M)helden.framework.C.K.o00000(I.\u00d3\u00d20000);
        m.\u00d2o0000();
        m.o00000("Erz");
        m.o00000("Feuer");
        m.o00000("Luft");
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.\u00f8o\u00d4000))) {
            arrayList.add(this.getZauber(Zauber.\u00f8o\u00d4000));
        } else {
            arrayList.add(this.getZauber(Zauber.O\u00d5\u00d3000));
        }
        arrayList.add(this.getZauber(Zauber.ifthisObject));
        arrayList.add(this.getZauber(Zauber.nullinterfacesuper));
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.Oo\u00d4000))) {
            arrayList.add(this.getZauber(Zauber.Oo\u00d4000));
        }
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.whileifnew))) {
            arrayList.add(this.getZauber(Zauber.whileifnew));
        }
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.\u00d8O\u00d3000))) {
            arrayList.add(this.getZauber(Zauber.\u00d8O\u00d3000));
        }
    }
}

