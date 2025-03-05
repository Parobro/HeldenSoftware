/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kristallomant;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class KristallomantVariante
extends N {
    public KristallomantVariante() {
        super("Kristallomant", 10);
    }

    @Override
    public int anzahlAktivierbarerZauber() {
        return 20;
    }

    @Override
    public int anzahlWaehlbareHauszauber() {
        return 7;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Drei gebundene Kristalle");
        arrayList.add("Drei Kristalle mit max. 7 pAsP");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kristallomant";
        }
        return "Kristallomantin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f6O000);
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d50O000);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.O\u00f8o000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 5;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 15;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.thissuper;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.ifsupernew.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d3\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d6\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.oO\u00d8000.toString()));
        arrayList.add(K.o00000(voidsuper.\u00d50\u00d8000, "Edelsteine"));
        arrayList.add(oooo_0.o00000(while.thisifclass.toString()));
        arrayList.add(oooo_0.o00000(while.oo\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d4\u00f6000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 5);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 5);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 4);
        k_02.\u00d200000(this.getProfession().getMuttersprache(), 2);
        k_02.\u00d200000(G.\u00f4\u00d4\u00f5000, 5);
        k_02.\u00d200000(voidsuper.privateclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 5);
        k_02.\u00d200000(voidsuper.StringfloatObject, 6);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.O\u00f6o000);
        arrayList.add(I.O\u00f6O000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d8oo000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f8\u00d6O000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f600000));
        arrayList.add(new for(while.whilesuperclass));
        arrayList.add(new for(while.returnObjectnew));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00f5\u00f4000));
        arrayList.add(new for(while.\u00f8\u00f5o000));
        return arrayList;
    }

    @Override
    public int getVerrechnungspunkte() {
        return 220;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f8\u00d8O000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00d5o000, "Zwerge", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Zeitgef\u00fchl", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Geselligkeit", 6));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d6\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f6\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privateintnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullpublicnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f6\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.forintnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d6\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d2\u00d5000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f5\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8o\u00d5000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f5\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringpublicnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d5000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d5000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d5\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d4\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d4\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f4\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d5\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnnullnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnnewnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifnewnew, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d4000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d3\u00d3000, helden.framework.OOoO.K.thissuper, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newreturnnew, helden.framework.OOoO.K.thissuper, ""));
        return waehlbareZauber;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public helden.framework.OOoO.K repraesenationVerrechnungspunkte() {
        return helden.framework.OOoO.K.thissuper;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
    }
}

