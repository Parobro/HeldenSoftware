/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Methumis
extends BasisKrieger {
    public Methumis() {
        super("Methumis", 24);
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
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Seele"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                arrayList.add(N.floatsuper().\u00d200000("Rechnen"));
                arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Staatskunst"));
                arrayList.add(N.floatsuper().\u00d200000("Rechtskunde"));
                arrayList.add(N.floatsuper().\u00d200000("Seefahrt"));
                arrayList.add(N.floatsuper().\u00d200000("Anatomie"));
                arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
                arrayList.add(N.floatsuper().\u00d200000("Singen"));
                arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
                arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Alchimie"));
                arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
                arrayList.add(N.floatsuper().\u00d200000("Handel"));
                arrayList.add(N.floatsuper().\u00d200000("Philosophie"));
                arrayList.add(N.floatsuper().\u00d200000("Mechanik"));
                arrayList.add(N.floatsuper().\u00d200000("Sprachenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Magiekunde"));
                returnsuper returnsuper2 = new returnsuper(this.getProfession(), arrayList, 12, 6, 0, 4);
                returnsuper2.new("4 bis 8 Talente; maximal +4 pro Talent");
                return returnsuper2;
            }
        }
        throw new c_1();
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00d3\u00d8000));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"));
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Fechtwaffen"));
                arrayList.add(E.ifthisString);
                arrayList.add(N.floatsuper().\u00d200000("Infanteriewaffen"));
                int[] nArray = new int[]{6, 4, 3, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Tulamidya"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 5);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                arrayList.addAll(for.o00000(K.o00000(voidsuper.nullvoidObject, "Strategie")));
                arrayList.addAll(for.o00000(K.o00000(voidsuper.nullvoidObject, "Logistik")));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        return super.getVerbilligteSonderfertigkeitAuswahl(n);
    }

    @Override
    public String toString() {
        return "Rondraschule der Universit\u00e4t Methumis";
    }
}

