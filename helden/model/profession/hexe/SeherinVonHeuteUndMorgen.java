/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hexe;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.hexe.BasisHexe;
import java.util.ArrayList;

public class SeherinVonHeuteUndMorgen
extends BasisHexe {
    public SeherinVonHeuteUndMorgen() {
        super("Seherin von Heute und Morgen", 18);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kunstfertiger Schmuck");
        arrayList.add("Kristallkugel");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Seherin von Heute und Morgen";
        }
        return "Seherin von Heute und Morgen";
    }

    @Override
    public ArrayList<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        OOOo oOOo = this.getProfession().getGewaehlteSonderfertigkeiten();
        ArrayList<for> arrayList = new ArrayList<for>();
        if (oOOo.\u00d200000(while.\u00d8\u00d4\u00d5000.toString())) {
            arrayList.add(new for(while.ifdoObject));
        }
        if (oOOo.\u00d200000(while.ifdoObject.toString())) {
            arrayList.add(new for(while.\u00d8\u00d4\u00d5000));
        }
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.if;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.ifdoObject.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d8\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisvoidObject, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 3);
        k_02.\u00d200000(voidsuper.forclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.StringclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, -3);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.\u00d200000(this.getProfession().getMuttersprachenSchrift(), 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, -1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, -1);
        k_02.\u00d200000(voidsuper.returnifObject, -1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d40\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f5\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d2\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d3\u00d5000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5o\u00d5000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8O\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d2\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.StringObjectnew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f6\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.ifnewnew), 3);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullinterfacesuper, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d3\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.forpublicnew, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnthisObject, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d4000, K.if, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00f5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.O\u00d3\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5o\u00d5000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

