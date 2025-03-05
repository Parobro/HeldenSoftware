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
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import java.util.ArrayList;
import java.util.Vector;

public class Ifirn
extends I
implements private_0 {
    private int whileStringfloat = 0;
    private Vector<voidsuper> \u00d3\u00d4\u00f5O00;

    public Ifirn() {
        super("Ifirn", 19);
    }

    public Ifirn(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hundeschlitten");
        arrayList.add("Packtier");
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
        arrayList.add(helden.framework.C.I.\u00f50O000);
        arrayList.add(helden.framework.C.I.\u00f4\u00d8O000);
        arrayList.add(helden.framework.C.I.\u00d8\u00f6o000);
        arrayList.add(helden.framework.C.I.\u00f5\u00f60000);
        arrayList.add(helden.framework.C.I.o\u00d8o000);
        arrayList.add(helden.framework.C.I.\u00f8\u00d4O000);
        arrayList.add(helden.framework.C.I.ifreturn);
        arrayList.add(helden.framework.C.I.newnew);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.whilewhilesuper);
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.\u00f4\u00f4\u00d2000);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 10;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.o\u00f8\u00d5000);
        return vector;
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        ++this.whileStringfloat;
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.addAll(N.floatsuper().\u00f800000());
        arrayList.addAll(N.floatsuper().\u00f8O0000());
        return new s_1(this, arrayList, 11);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d4\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.returnclassObject.toString()));
        arrayList.add(oooo_0.o00000(while.ifinterface.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringnull.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2O\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d2\u00d4O000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00f8o\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d6\u00d3\u00d3000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5\u00d5000.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d5\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.newdoString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d4\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f4\u00d6\u00d8000);
                arrayList.add(E.newnewString);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.returnprivateObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.forvoidObject);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.returnifObject);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00d3\u00d6\u00d8000, 5);
        k_02.o00000(voidsuper.ifforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.o00000(voidsuper.returnforObject, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.newnewObject, 1);
        k_02.o00000(voidsuper.\u00d8\u00d3\u00d8000, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 3);
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 6);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 4);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 6);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 5);
        k_02.o00000(voidsuper3, 5);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(K.o00000(helden.framework.C.I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(helden.framework.C.I.\u00d4oo000);
        arrayList.add(helden.framework.C.I.newif);
        arrayList.add(helden.framework.C.I.nullclass);
        arrayList.add(helden.framework.C.I.o\u00f5O000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d6o000);
        arrayList.add(helden.framework.C.I.\u00d30\u00d2000);
        arrayList.add(helden.framework.C.I.\u00d8o0000);
        arrayList.add(helden.framework.C.I.\u00d4\u00d8o000);
        arrayList.add(helden.framework.C.I.Stringintsuper);
        arrayList.add(helden.framework.C.I.\u00f4\u00f5o000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for<String>(E.\u00d3\u00d6\u00d8000.toString(), while.\u00f6\u00d5\u00d2000, false));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d50000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Ifirn"}));
        return oo0O;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return this.whileStringfloat < 1;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
        vector.addAll(this.\u00d3\u00d4\u00f5O00);
    }

    @Override
    public String toString() {
        return "Ifirn";
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
        this.\u00d3\u00d4\u00f5O00.add(voidsuper2);
    }
}

