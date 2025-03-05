/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BarbarischeKultur;
import java.util.ArrayList;

public class Lutraa
extends o0oo_0 {
    private static final int \u00f5\u00d3OO00 = 90;
    private static final int \u00f4\u00d3OO00 = 120;
    private static final int \u00d8\u00d3OO00 = 2;
    private static final int returnprivatereturn = 0;

    public Lutraa() {
    }

    public Lutraa(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Raufen"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 5);
        this.setTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(48);
        arrayList.add(54);
        arrayList.add(58);
        arrayList.add(60);
        arrayList.add(2);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelbraun", 8, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        arrayList.add(new oooo_1("schwarz", 8, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Talentschub"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 90;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelbraun", 7, 20));
        arrayList.add(new oooo_1("braun", 7, 20));
        arrayList.add(new oooo_1("dunkelgrau", 4, 20));
        arrayList.add(new oooo_1("hellgrau", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R35";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 90;
    }

    @Override
    public int getMaxGroesse() {
        return 120 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 90;
    }

    @Override
    public int getMinGroesse() {
        return 122;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000("Kampf im Wasser"));
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000));
        oOOo.o00000(oooo_0.o00000("Schwanzschlag"));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00d20000.toString(), voidsuper.returnprivateObject));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Flink (Wasser)"));
        oo0O.\u00d300000(K.o00000("K\u00e4lteresistenz"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", new Object[]{"Biss (1W6)"}));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Richtungssinn", "Seen, Fl\u00fcsse, Auen"));
        oo0O.\u00d300000(K.o00000("Taucherlunge"));
        oo0O.\u00d300000(K.o00000(I.\u00d800000.toString(), new Object[]{"Bemuskelter Schwanz"}));
        oo0O.\u00d300000(K.o00000("Erh\u00f6hter Nahrungsbedarf", 1));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Fleischfresser"));
        oo0O.\u00d300000(K.o00000("Spieltrieb", 5));
        oo0O.\u00d300000(K.o00000(I.\u00f50\u00d2000));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Lutraa";
        }
        return "Lutraa";
    }

    @Override
    public int wurfeleAlter() {
        return 13 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 120 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("FF"), -2);
        this.putModifikator(b_0.void("GE"), 2);
        this.putModifikator(b_0.void("KO"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 7);
        this.putModifikator(b_0.void("AU"), 18);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

