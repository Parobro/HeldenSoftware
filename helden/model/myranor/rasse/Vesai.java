/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Vesai
extends o0oo_0 {
    private static final int Stringpublicreturn = 115;
    private static final int \u00f5oOO00 = 155;
    private static final int \u00f4oOO00 = 2;
    private static final int \u00d8oOO00 = 0;

    public Vesai() {
    }

    public Vesai(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(35);
        arrayList.add(45);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(75);
        arrayList.add(80);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 2, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("rotbraun", 3, 20));
        arrayList.add(new oooo_1("dunkelrot", 4, 20));
        arrayList.add(new oooo_1("orangerot", 3, 20));
        arrayList.add(new oooo_1("bernsteingelb", 3, 20));
        arrayList.add(new oooo_1("grau", 2, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Gefahreninstinkt"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 115;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("kupferrot", 8, 20));
        arrayList.add(new oooo_1("feuerrot", 4, 20));
        arrayList.add(new oooo_1("granatrot", 4, 20));
        arrayList.add(new oooo_1("rotbraun", 2, 20));
        arrayList.add(new oooo_1("rotblond", 1, 20));
        arrayList.add(new oooo_1("dunkelblond", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R46";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new HoefischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 115;
    }

    @Override
    public int getMaxGroesse() {
        return 155 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 115;
    }

    @Override
    public int getMinGroesse() {
        return 157;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Vesai";
        }
        return "Vesai";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 155 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("FF"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

