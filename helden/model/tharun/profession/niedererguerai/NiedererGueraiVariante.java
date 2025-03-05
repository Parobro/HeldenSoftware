/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererguerai;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public abstract class NiedererGueraiVariante
extends N {
    public NiedererGueraiVariante(String string, String string2) {
        super(string, string2, 25, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Enduriumwaffe (Familienbesitz)");
        arrayList.add("Reittier");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Beidh\u00e4ndig"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Vorurteile"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("LeP"), 2);
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getSetting().getSF(while.\u00d8\u00d3\u00d2000));
                objectsuper_0 objectsuper_02 = new objectsuper_0(this.getProfession(), arrayList, 1);
                objectsuper_02.o00000("\u00fcblicherweise Spranger");
                return objectsuper_02;
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Ausfall"));
        arrayList.add(oooo_0.o00000("Ausweichen I"));
        arrayList.add(oooo_0.o00000("Finte"));
        arrayList.add(oooo_0.o00000("Kampfreflexe"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Infanteriewaffen"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heraldik"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Kriegskunst"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"), 1);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("T\u00e4towieren"), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Gesucht"));
        arrayList.add(K.o00000("Lichtscheu"));
        arrayList.add(K.o00000("Randgruppe"));
        arrayList.add(K.o00000("Fettleibig"));
        arrayList.add(K.o00000("Glasknochen"));
        arrayList.add(K.o00000("Raumangst"));
        arrayList.add(K.o00000("Weltfremd"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Aufmerksamkeit"));
        arrayList.addAll(for.\u00d200000("Schwingentanz"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Gueraiausbildung"));
        oo0O.\u00d300000(K.o00000("Arroganz", 5));
        oo0O.\u00d300000(K.o00000("Prinzipientreue", 10));
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "Herrscher"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

