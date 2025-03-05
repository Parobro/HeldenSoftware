/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
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
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Festum
extends StandardMagierVariante {
    public Festum() {
        super("Festum", 27);
        this.oO\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
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
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d5o0000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.O\u00d5o000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.thisfloat));
        return bedingungsVerknuepfung;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.oO\u00d8000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
                arrayList.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
                arrayList.add(oooo_0.o00000(while.nullreturnnew.toString()));
                arrayList.add(oooo_0.o00000(while.o\u00f50000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper));
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.O0\u00d6000);
                arrayList.remove(voidsuper.\u00d8\u00d5\u00d6000);
                arrayList.remove(voidsuper.thisinterfaceObject);
                arrayList.remove(voidsuper.\u00d30\u00d8000);
                arrayList.remove(voidsuper.StringclassObject);
                arrayList.remove(voidsuper.nullObjectObject);
                arrayList.remove(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.remove(voidsuper.oo\u00d6000);
                arrayList.remove(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.remove(voidsuper.o\u00d5\u00d6000);
                arrayList.remove(voidsuper.thisintObject);
                arrayList.remove(voidsuper.\u00f5\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00f4\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.remove(voidsuper.\u00d3\u00d6\u00d5000);
                arrayList.remove(voidsuper.\u00d4\u00f6\u00d6000);
                arrayList.remove(voidsuper.\u00f5o\u00d6000);
                arrayList.remove(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.remove(voidsuper.\u00d3\u00f4\u00d5000);
                int[] nArray = new int[]{3, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 4);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.nullObjectObject, 4);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 6);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisintObject, 6);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.newwhileString, 4);
        k_02.o00000(G.nullsuperclass, 3);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 5);
        k_02.o00000(G.\u00f5\u00f6\u00f5000, 4);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.o00000(G.\u00d3o\u00f5000, 5);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 5);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d4O\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.O\u00d6\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.ififnew), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d4\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d3\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d4\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d8\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f40\u00d3000), 3);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d4000, K.\u00f4o0000, ""), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 4);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d4000, K.\u00f4o0000, ""), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d4\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.privatefloatnew), 3);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00f8\u00d4000), 3);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new for(while.oO\u00d8000));
        arrayList.add(new for(while.\u00d3\u00f5\u00d3000));
        arrayList.add(new for(while.Stringwhilesuper));
        arrayList.add(new for(while.\u00d5\u00f4\u00f4000));
        arrayList.add(new for(while.\u00f8\u00f6\u00d4000));
        arrayList.add(new for(while.\u00f6\u00d8O000));
        arrayList.add(new for(while.nullreturnnew));
        arrayList.add(new for(while.o\u00f50000));
        ArrayList<for> arrayList2 = new ArrayList<for>();
        for (for for_ : arrayList) {
            if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(for_.toString())) continue;
            arrayList2.add(for_);
        }
        return new void(this.getProfession(), arrayList2, 1);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 1500));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d3000, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.o\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4O\u00d3000));
        arrayList.add(this.getZauber(Zauber.O\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f6\u00d3000));
        arrayList.add(this.getZauber(Zauber.ififnew));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d4\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d3\u00d3000));
    }

    @Override
    public String toString() {
        return "Halle des Quecksilbers zu Festum";
    }
}

