/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kaempferudw;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.kaempferudw.BasisKaempfer;
import java.util.ArrayList;

public class RobbenjaegerOttajasko
extends BasisKaempfer {
    public RobbenjaegerOttajasko() {
        super("RobbenjaegerOttajasko", 17);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "K\u00e4mpfer/Robbenj\u00e4ger aus einer Ottajasko (UdW)";
        }
        return "K\u00e4mpferin/Robbenj\u00e4gerin aus einer Ottajasko (UdW)";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 1);
        return k_02;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(G.whilewhileString, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        k_02.o00000(E.\u00d5\u00d4\u00d8000);
        k_02.\u00d200000(E.\u00d3\u00d5\u00d8000, 6);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.returnforObject, 3);
        k_02.\u00d200000(voidsuper.thisvoidObject, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d3\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.thisclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 3);
        k_02.\u00d200000(voidsuper.oO\u00d6000, 3);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d60\u00d5000));
        arrayList.add(new for(while.\u00d50\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

