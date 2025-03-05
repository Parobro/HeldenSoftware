/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.varianten;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.kultur.Ferkina;
import java.util.ArrayList;

public class FerkinaBesessener
extends N {
    private BedingungsVerknuepfung \u00d3O\u00f5O00 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);

    public static String getName() {
        return "Ferkina Besessener";
    }

    public FerkinaBesessener() {
        super(FerkinaBesessener.getName(), 3, true);
        this.\u00d3O\u00f5O00.addBedingung(Bedingung.hatKulturID(new Ferkina().getID()));
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.o\u00f5O000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d30\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00d3O000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.newif));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d50000, "Vegetarier"));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00d3O000));
        M<U> m = helden.framework.C.K.o00000();
        m.\u00d2o0000();
        M m2 = helden.framework.C.K.\u00d600000();
        m2.\u00d2o0000();
        m.o00000(b_0.whilewhilesuper);
        m.o00000(b_0.\u00f8\u00f4\u00d2000);
        m.o00000(b_0.\u00f4\u00f4\u00d2000);
        m.o00000(b_0.returnwhilesuper);
        m.o00000(b_0.privatedosuper);
        m.o00000(voidsuper.ifforObject);
        m.o00000(voidsuper.\u00d4\u00d2\u00d8000);
        m.o00000(E.\u00f4\u00d6\u00d8000);
        m.o00000(voidsuper.\u00f8\u00f4\u00d6000);
        m.o00000(voidsuper.returnforObject);
        m.o00000(voidsuper.thisvoidObject);
        m.o00000(voidsuper.o\u00d3\u00d6000);
        m.o00000(voidsuper.\u00d5\u00d5\u00d5000);
        m.o00000(voidsuper.o\u00d2\u00d8000);
        m.o00000(E.newnewString);
        m.o00000(voidsuper.\u00d4\u00d8\u00d6000);
        m2.o00000(KonkreterZauber.getZauber(Zauber.o\u00d2\u00d5000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d5000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00f4\u00d6\u00d3000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d3\u00d2\u00d5000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d50\u00d3000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00f50\u00d5000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d5\u00f5\u00d4000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d4000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00f8O\u00d5000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00d3\u00d3\u00d3000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.StringObjectnew, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.ifprivatesuper, K.\u00d400000, ""));
        m2.o00000(KonkreterZauber.getZauber(Zauber.\u00f4\u00d5\u00d3000, K.\u00d400000, ""));
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(m2);
        return oo0O;
    }

    @Override
    public BedingungsVerknuepfung getWahlBedingung() {
        return this.\u00d3O\u00f5O00;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Ferkina Besessener");
        return stringBuffer.toString();
    }
}

