/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import java.util.ArrayList;

public class Wolfalben
extends o0oo_0 {
    private static final int thispublicreturn = 105;
    private static final int \u00d5oOO00 = 184;
    private static final int \u00d4oOO00 = 1;
    private static final int \u00d3oOO00 = 0;

    public Wolfalben() {
    }

    public Wolfalben(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Athletik"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Schleichen"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("obsidianschwarz", 8, 20));
        arrayList.add(new oooo_1("nachtblau", 8, 20));
        arrayList.add(new oooo_1("saphirblau", 3, 20));
        arrayList.add(new oooo_1("silbergrau", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Astrale Regeneration"));
        arrayList.add(K.o00000("Astralmacht"));
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Balance"));
        arrayList.add(K.o00000("D\u00e4mmerungssicht"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Flink"));
        arrayList.add(K.o00000("K\u00e4lteresistenz"));
        arrayList.add(K.o00000("Resistenz gegen Krankheiten"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("K\u00f6rpergebundene Kraft"));
        arrayList.add(K.o00000("Monds\u00fcchtig"));
        arrayList.add(K.o00000("Unvertr\u00e4glichkeit mit verarbeitetem Metall"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 105;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("glanzschwarz", 10, 20));
        arrayList.add(new oooo_1("blauschwarz", 8, 20));
        arrayList.add(new oooo_1("nachtblau", 1, 20));
        arrayList.add(new oooo_1("silbern)", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R48";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 105;
    }

    @Override
    public int getMaxGroesse() {
        return 184 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 105;
    }

    @Override
    public int getMinGroesse() {
        return 185;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Halbzauberer"));
        oo0O.\u00d300000(K.o00000("Wolfskind", new Object[]{"wissentlich"}));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Wolfalbe";
        }
        return "Wolfalbin";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 184 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("KO"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 14);
        this.putModifikator(b_0.void("AE"), 6);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

