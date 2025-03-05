/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public abstract class Fasar1
extends StandardMagierVariante {
    public Fasar1(String string, int n) {
        super(string, n);
        this.oO\u00d2O00 = "schwarz";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5\u00f6O000);
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
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.forforclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 3);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 3);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.forclassObject, 1);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 6);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.thisintObject, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 6);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 6);
        k_02.o00000(G.\u00f5\u00f6\u00f5000, 7);
        k_02.o00000(G.\u00d50\u00f5000, 4);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.o00000(G.\u00d3o\u00f5000, 8);
        k_02.o00000(G.\u00f8\u00f8\u00f4000, 6);
        k_02.o00000(G.nullpublicString, 4);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.StringObjectObject, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f6\u00f5\u00f6000));
        arrayList.add(new for(while.\u00d8\u00d20000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.thisdo);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullvoidnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringsupernew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilenullnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d5\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d2\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnreturnnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oO\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        return waehlbareZauber;
    }
}

