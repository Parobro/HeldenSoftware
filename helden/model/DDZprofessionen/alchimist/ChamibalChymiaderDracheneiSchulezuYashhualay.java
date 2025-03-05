/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.alchimist;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.alchimist.BasisAlchimistDDZ;
import java.util.ArrayList;

public class ChamibalChymiaderDracheneiSchulezuYashhualay
extends BasisAlchimistDDZ {
    public ChamibalChymiaderDracheneiSchulezuYashhualay() {
        super("Chamib al'Chymia der Drachenei-Schule zu Yash'hualay", 16, true);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00f5\u00f6\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
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
        k_02.o00000(b_0.void("AsP"), 2);
        k_02.o00000(b_0.void("MR"), 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Zauberzeichen"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 4: {
                arrayList.add(N.floatsuper().\u00d200000("Lesen/Schreiben Chrmk"));
                arrayList.add(N.floatsuper().\u00d200000("Lesen/Schreiben Amulashtra"));
                int[] nArray = new int[]{4};
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
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gesteinskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Urtulamidya"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Steinschneider/Juwelier"), 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        public public_ = K.o00000(I.O\u00d5o000, "echsische Wesen", 8);
        oo0O.\u00d300000(public_);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

