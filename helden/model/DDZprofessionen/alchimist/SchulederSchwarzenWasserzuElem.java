/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.alchimist;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.alchimist.BasisAlchimistDDZ;
import java.util.ArrayList;

public class SchulederSchwarzenWasserzuElem
extends BasisAlchimistDDZ {
    public SchulederSchwarzenWasserzuElem() {
        super("Schule der Schwarzen Wasser zu Elem", 15, true);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d5\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("AsP"), 1);
        k_02.o00000(b_0.void("MR"), 2);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 4: {
                arrayList.add(N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(N.floatsuper().\u00d200000("Seefahrt"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper2);
        k_02.o00000(voidsuper3);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Singen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zechen"), -2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        k_02.o00000(N.floatsuper().\u00d200000("H\u00fcttenkunde"));
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Rssahh"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Chrmk"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Zauberzeichen"));
        arrayList.addAll(for.\u00d200000(while.\u00d6\u00d2O000.toString()));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Arroganz", 8));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

