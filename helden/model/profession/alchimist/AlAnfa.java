/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class AlAnfa
extends BasisAlchimist {
    public AlAnfa(String string, int n, boolean bl) {
        super(string, n, bl);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
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
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        if (n == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(voidsuper.\u00f5o\u00d6000);
            arrayList.add(voidsuper.\u00d5\u00d3\u00d8000);
            arrayList.add(voidsuper.\u00d8O\u00d8000);
            arrayList.add(voidsuper.Oo\u00d6000);
            arrayList.add(voidsuper.ififObject);
            arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
            arrayList.add(voidsuper.privatedoObject);
            arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
            arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
            arrayList.add(voidsuper.o\u00f6\u00d6000);
            arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
            arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
            arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
            arrayList.add(voidsuper.\u00d50\u00d8000);
            arrayList.add(voidsuper.oo\u00d6000);
            arrayList.add(voidsuper.\u00f40\u00d8000);
            arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
            arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
            arrayList.add(voidsuper.o\u00d5\u00d6000);
            arrayList.add(voidsuper.thisintObject);
            arrayList.add(voidsuper.\u00f5\u00d2\u00d6000);
            arrayList.add(voidsuper.\u00f4\u00d2\u00d6000);
            arrayList.add(voidsuper.\u00f8\u00f4\u00d5000);
            arrayList.add(voidsuper.O\u00f4\u00d5000);
            arrayList.add(voidsuper.\u00d3\u00d6\u00d5000);
            arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
            return new returnsuper(this.getProfession(), arrayList, 12, 3);
        }
        throw new c_1();
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00f4oO000));
        return bedingungsVerknuepfung;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                return super.getTalentAuswahl(n);
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
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.thisintObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 6);
        k_02.\u00d200000(G.\u00d5o\u00f5000, 4);
        k_02.\u00d200000(G.newwhileString, 5);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 7);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        return k_02;
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
        oo0O.\u00d300000(K.o00000(I.ifprivate));
        oo0O.\u00d300000(K.o00000(I.whilenewsuper, 1000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber Fakult\u00e4t, M\u00e4zenen oder der Familie"));
        return oo0O;
    }
}

