/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class Olafjord
extends N {
    private int nullObjectfloat = 0;

    public Olafjord() {
        super("Olafjorder Magier", 19);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("pers\u00f6nliche Waffe");
        arrayList.add("pers\u00f6nlicher Zauberstab");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f5\u00f6O000);
        arrayList.add(I.\u00d3\u00d80000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.forintsuper);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    public String getID() {
        return "P115";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.returnnew;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.nullreturnnew.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.oo\u00f6000));
        arrayList.add(oooo_0.o00000(while.StringthisString));
        arrayList.add(oooo_0.o00000(while.o\u00f50000));
        arrayList.add(oooo_0.o00000(while.o\u00d3\u00d2000));
        arrayList.add(oooo_0.o00000(while.\u00d80\u00f5000));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                ++n;
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00d8O\u00d3000));
                arrayList.add(this.getZauber(Zauber.o\u00f6\u00d3000));
                ++n;
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 4);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 4);
        k_02.\u00d200000(voidsuper.nullvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d5\u00f8\u00f4000, 6);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.returnifObject, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d6\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.Oo\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5o\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f6\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.ififnew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.\u00d200000(this.getZauber(Zauber.forinterfacenew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00f4oO000);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new for(while.nullreturnnew));
                arrayList.add(new for(while.\u00f6\u00d8O000));
                arrayList.add(new for(while.\u00d3\u00f5\u00d3000));
                ArrayList<for> arrayList2 = new ArrayList<for>();
                for (for for_ : arrayList) {
                    if (this.getProfession().getSonderfertigkeiten().\u00d200000(for_.toString())) continue;
                    arrayList2.add(for_);
                }
                return new void(this.getProfession(), arrayList2, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for<String>("", while.o\u00f8\u00d3000, true));
        arrayList.add(new for<String>("", while.\u00d60O000, true));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5oo000, "thorwalsche Traditionen, Swafnirglaube, Geheimhaltung Runenwissen, Freundschaft zu Elfen, Feindschaft zu Shakagra", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000, "Runajasko und Olafjorder Hetleute"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d6\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f6\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d5000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d8\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00f5\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d4\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00f6\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnthisnew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d2\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringsupernew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d3\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d5\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5o\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d6\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d50\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d5\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d4\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8O\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnprivatesuper, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d6\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d5000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d8\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilereturnnew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.OO\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f50\u00d5000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d3000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d2000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifwhilenew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifnewnew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f4\u00d4000, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullsupernew, K.returnnew, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f4\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.forfloatnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d4\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d50\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d2\u00d5000, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    public boolean hatMehrTalentAuswahl() {
        return this.nullObjectfloat < 2;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f5\u00d4000));
        arrayList.add(this.getZauber(Zauber.Oo\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5o\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f6\u00d3000));
        arrayList.add(this.getZauber(Zauber.ififnew));
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.\u00d8O\u00d3000))) {
            arrayList.add(this.getZauber(Zauber.\u00d8O\u00d3000));
        }
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.o\u00f6\u00d3000))) {
            arrayList.add(this.getZauber(Zauber.o\u00f6\u00d3000));
        }
    }

    public String toString(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Olafjorder Magier";
        }
        return "Olafjorder Magierin";
    }
}

