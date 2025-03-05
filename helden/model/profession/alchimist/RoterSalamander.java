/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class RoterSalamander
extends BasisAlchimist {
    protected ORTE \u00f5O\u00f5O00;

    public RoterSalamander(String string, int n, boolean bl, ORTE oRTE) {
        super(string, n, bl);
        this.\u00f5O\u00f5O00 = oRTE;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 0;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 1);
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.new)) {
            k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 1);
        }
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d300000)) {
            k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        }
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d400000)) {
            k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        }
        k_02.\u00d200000(voidsuper.thisintObject, 1);
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d300000)) {
            k_02.\u00d200000(voidsuper.thisintObject, 1);
        }
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 1);
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d500000)) {
            k_02.\u00d200000(voidsuper.\u00d4\u00d3\u00d6000, 1);
        }
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 1);
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.new) || this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d400000)) {
            k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 1);
        }
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d500000) || this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d300000) || this.\u00f5O\u00f5O00.equals((Object)ORTE.new)) {
            k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        }
        if (this.\u00f5O\u00f5O00.equals((Object)ORTE.\u00d400000)) {
            k_02.\u00d200000(voidsuper.ififObject, 1);
        }
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00f8\u00f6\u00d5000));
        arrayList.add(new for(while.\u00d8\u00d2\u00d8000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.ifprivate));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Bund"));
        return oo0O;
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum ORTE {
        new,
        \u00d300000,
        \u00d400000,
        \u00d500000;

    }
}

