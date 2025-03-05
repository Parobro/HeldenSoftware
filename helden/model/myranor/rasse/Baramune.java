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
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.kultur.BarbarischeKultur;
import java.util.ArrayList;

public class Baramune
extends o0oo_0 {
    private static final int O\u00d5OO00 = 0;
    private static final int \u00f8\u00d4OO00 = 210;
    private static final int Stringinterfacereturn = 2;
    private static final int \u00f5\u00d4OO00 = 0;

    public Baramune() {
    }

    public Baramune(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Raufen"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(80);
        arrayList.add(130);
        arrayList.add(180);
        arrayList.add(220);
        arrayList.add(260);
        arrayList.add(290);
        arrayList.add(25);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("grau", 3, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("braun", 7, 20));
        arrayList.add(new oooo_1("gelb", 5, 20));
        arrayList.add(new oooo_1("bernsteinfarben", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("F\u00fcrsorglich"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Monds\u00fcchtig"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 0;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz (1-4)", 4, 20));
        arrayList.add(new oooo_1("dunkelbraun (5-14)", 10, 20));
        arrayList.add(new oooo_1("hellbraun (15-17)", 3, 20));
        arrayList.add(new oooo_1("wei\u00df (18-20)", 3, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R28";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 0;
    }

    @Override
    public int getMaxGroesse() {
        return 210 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 0;
    }

    @Override
    public int getMinGroesse() {
        return 212;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Gro\u00dfe Tragf\u00e4higkeit"));
        oo0O.\u00d300000(K.o00000("Gro\u00dfw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("K\u00e4lteresistenz"));
        oo0O.\u00d300000(K.o00000("Kompakt"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Krallen (1W6+3)", "Biss (1W6+5)"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 2));
        oo0O.\u00d300000(K.o00000("Schnelle Heilung", 2));
        oo0O.\u00d300000(K.o00000("Beh\u00e4big"));
        oo0O.\u00d300000(K.o00000("Erh\u00f6hter Nahrungsbedarf", 2));
        oo0O.\u00d300000(K.o00000("Farbenblind"));
        oo0O.\u00d300000(K.o00000("Hitzeempfindlichkeit"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        oo0O.\u00d300000(K.o00000(I.\u00d8\u00f8O000.toString(), new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper.toString()}));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Baramune";
        }
        return "Baramunin";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 210 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("CH"), -2);
        this.putModifikator(b_0.void("FF"), -3);
        this.putModifikator(b_0.void("GE"), -2);
        this.putModifikator(b_0.void("KO"), 3);
        this.putModifikator(b_0.void("KK"), 4);
        this.putModifikator(b_0.void("LE"), 15);
        this.putModifikator(b_0.void("AU"), 13);
        this.putModifikator(b_0.void("MR"), -2);
    }
}

