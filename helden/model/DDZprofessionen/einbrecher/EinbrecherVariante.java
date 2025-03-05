/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.einbrecher;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class EinbrecherVariante
extends N {
    private J thisObjectfloat;

    public EinbrecherVariante() {
        super("Einbrecher", 0);
    }

    public EinbrecherVariante(String string, int n) {
        super(string, n);
    }

    public void addAutomatischerVorteil(public public_) {
        this.thisObjectfloat = (J)public_;
        this.thisObjectfloat.oO0000(5);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hochwertige Dietriche");
        arrayList.add("lautlosem Wurfhaken");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f50O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.o00000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00d4\u00d8o000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
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
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00f8\u00f4\u00d6000, "Freiklettern"));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Revier"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 3);
        k_02.\u00d200000(E.newnewString, 1);
        k_02.\u00d200000(E.\u00f5\u00d5\u00d8000, 1);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 6);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 5);
        k_02.\u00d200000(voidsuper.returnforObject, 5);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 5);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.whilenewObject, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.forclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, 7);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        if (this.thisObjectfloat == null) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(helden.framework.C.K.o00000(I.privateclass));
            arrayList.add(helden.framework.C.K.o00000(I.\u00d50o000));
            return new o00o_0(this.getProfession(), arrayList, 1);
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(this.thisObjectfloat);
        return oo0O;
    }
}

