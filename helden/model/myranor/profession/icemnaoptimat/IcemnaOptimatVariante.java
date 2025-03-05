/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.icemnaoptimat;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import java.util.ArrayList;

public class IcemnaOptimatVariante
extends N {
    public IcemnaOptimatVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Aurakonjunktion"));
        arrayList.add(K.o00000("Eigeboren"));
        arrayList.add(I.\u00d5\u00d6o000);
        arrayList.add(I.privatesuper);
        arrayList.add(I.\u00d8O\u00d2000);
        arrayList.add(K.o00000("Animalische Magie"));
        arrayList.add(K.o00000("Wahrer Name"));
        arrayList.add(K.o00000("Weltfremd bzgl."));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatSfAuswahl(while.\u00d2o\u00f5000, "Imperium"));
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d3O000));
        arrayList.add(oooo_0.o00000(while.\u00d5O\u00d6000));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.o00000(oooo_0.o00000(while.\u00f8\u00d3\u00d4000, "Instruktion")));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.Stringclasssuper));
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "Kult und Haus"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

