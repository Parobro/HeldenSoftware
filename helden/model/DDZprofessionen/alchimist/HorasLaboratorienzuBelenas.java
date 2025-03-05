/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.alchimist;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.alchimist.BasisAlchimistDDZ;
import java.util.ArrayList;

public class HorasLaboratorienzuBelenas
extends BasisAlchimistDDZ {
    public HorasLaboratorienzuBelenas() {
        super("Horas-Laboratorien zu Belenas", 12, true);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00f4\u00d3\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
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
        k_02.o00000(b_0.void("Asp"), 2);
        k_02.o00000(b_0.void("MR"), 1);
        return k_02;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper2);
        k_02.o00000(voidsuper3);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gesteinskunde"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(G.\u00d40\u00f6000, 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 4);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "Reich, Akademie oder Person"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

