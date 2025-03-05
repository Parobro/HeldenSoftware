/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;
import java.util.Vector;

public class RondraAmazone
extends I {
    public RondraAmazone() {
        super("Rondra, Amazone", 24);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Erfahrenes Reitpferd");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.StringObject);
        arrayList.add(helden.framework.C.I.ifnullsuper);
        arrayList.add(helden.framework.C.I.\u00f4\u00d8O000);
        arrayList.add(helden.framework.C.I.returnnewsuper);
        arrayList.add(helden.framework.C.I.OO0000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d40000);
        arrayList.add(helden.framework.C.I.ifreturn);
        arrayList.add(helden.framework.C.I.privateObject);
        arrayList.add(helden.framework.C.I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d8\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.iffloatObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.nullifString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Amazonenr\u00fcstung (kompl)"));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6oo000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnewnew.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d4\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.ifinterface.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringnull.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f8\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00f5\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnullclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.newwhileString);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.O\u00d6\u00d8000, 5);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(E.o\u00d6\u00d8000, 2);
        k_02.o00000(voidsuper.ifforObject, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.newnewObject, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.nullvoidObject, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f8\u00d2\u00d8000, 1);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.whilethissuper);
        arrayList.add(K.o00000(helden.framework.C.I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(helden.framework.C.I.\u00f800000);
        arrayList.add(helden.framework.C.I.\u00d8Oo000);
        arrayList.add(helden.framework.C.I.\u00d4oo000);
        arrayList.add(helden.framework.C.I.Ooo000);
        arrayList.add(helden.framework.C.I.\u00f8\u00d2o000);
        arrayList.add(helden.framework.C.I.\u00d4OO000);
        arrayList.add(helden.framework.C.I.newfor);
        arrayList.add(helden.framework.C.I.\u00d3\u00d6o000);
        arrayList.add(helden.framework.C.I.\u00d3Oo000);
        arrayList.add(helden.framework.C.I.\u00d8\u00f50000);
        arrayList.add(helden.framework.C.I.\u00d4\u00f5o000);
        arrayList.add(helden.framework.C.I.whilenewsuper);
        arrayList.add(helden.framework.C.I.\u00d3\u00d3O000);
        arrayList.add(helden.framework.C.I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d8\u00f5\u00d6000));
        arrayList.add(new for(while.\u00d2\u00d3\u00f6000));
        arrayList.add(new for(while.\u00f8\u00f5\u00d5000));
        arrayList.add(new for(while.\u00d5\u00d8\u00f6000));
        arrayList.add(new for(while.o\u00d3\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.o\u00d6o000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00f5O000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Rondra"}));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Rondra, Amazone";
    }
}

