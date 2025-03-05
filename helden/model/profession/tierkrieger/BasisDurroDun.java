/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.tierkrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public abstract class BasisDurroDun
extends N {
    public BasisDurroDun(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ooO000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 6;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 3);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00f4\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 4);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 4);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(voidsuper.ifforObject, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.o00000(voidsuper.returnforObject, 2);
        k_02.o00000(voidsuper.returnprivateObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 1);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f80\u00d8000, 2);
        k_02.o00000(voidsuper.Oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d3\u00d3\u00d2000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                return o00o_0.o00000(this.getProfession(), K.o00000(this.getZauber(false)), 3);
            }
            case 1: {
                Vector<KonkreterZauber> vector = this.getZauber(true);
                Iterator<public> iterator = this.getProfession().getVorteile().\u00d500000();
                while (iterator.hasNext()) {
                    public public_ = iterator.next();
                    if (!(public_ instanceof M)) continue;
                    M m = (M)public_;
                    for (Object t : m.intsuper()) {
                        vector.remove(t);
                    }
                }
                return o00o_0.o00000(this.getProfession(), K.o00000(vector), 2);
            }
        }
        return super.getVorteilAuswahl(n);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00f4o000));
        oo0O.\u00d300000(K.o00000(I.\u00d5oo000, "Od\u00fcn-Verhalten, Gjalskerl\u00e4nder Religion", 5));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    protected abstract Vector<KonkreterZauber> getZauber(boolean var1);
}

