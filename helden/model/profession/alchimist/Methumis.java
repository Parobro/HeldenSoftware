/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class Methumis
extends BasisAlchimist {
    protected Quadrivium \u00f4O\u00f5O00;

    public Methumis(String string, int n, boolean bl, Quadrivium quadrivium) {
        super(string, n, bl);
        this.\u00f4O\u00f5O00 = quadrivium;
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 0;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d400000)) {
            arrayList.add(I.\u00f4\u00f80000);
        }
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00f8\u00f6\u00d5000.toString()));
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.o00000)) {
            arrayList.add(K.o00000(voidsuper.\u00f5\u00d2\u00d6000, "Arithmetik"));
        }
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d300000)) {
            arrayList.add(K.o00000(voidsuper.\u00f5\u00d2\u00d6000, "Geometrie"));
        }
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(1);
            }
            case 1: {
                return super.getTalentAuswahl(2);
            }
            case 2: {
                return super.getTalentAuswahl(3);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper2);
        k_02.o00000(voidsuper3);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.forpublicObject, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, -1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, -1);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 4);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d40\u00f6000, 6);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 9);
        k_02.\u00d200000(G.\u00d5\u00d4\u00f5000, 6);
        k_02.\u00d200000(voidsuper.O\u00f5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.o00000) || this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d300000)) {
            k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 1);
            if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.o00000)) {
                k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 1);
            }
            k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d6000, 3);
            k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
            k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
            if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d300000)) {
                k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
            }
        }
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d400000)) {
            k_02.\u00d200000(voidsuper.newnewObject, 3);
            k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 2);
            k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 2);
            k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
            k_02.\u00d200000(voidsuper.privateObjectObject, 3);
        }
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d500000)) {
            k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
            k_02.\u00d200000(voidsuper.StringvoidObject, 2);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 4);
            k_02.\u00d200000(voidsuper.ifnullObject, 3);
        }
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d400000)) {
            arrayList.add(helden.framework.C.K.o00000(I.ifif, new Object[]{"Geh\u00f6r"}));
        }
        if (this.\u00f4O\u00f5O00.equals((Object)Quadrivium.\u00d500000)) {
            arrayList.add(I.\u00d30\u00d2000);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00f8\u00f6\u00d5000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.ifprivate));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000, "Universit\u00e4t und Herzog"));
        return oo0O;
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum Quadrivium {
        o00000,
        \u00d300000,
        \u00d400000,
        \u00d500000;

    }
}

