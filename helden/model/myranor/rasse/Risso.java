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
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import java.util.ArrayList;

public class Risso
extends o0oo_0 {
    private static final int \u00d5\u00d3OO00 = 110;
    private static final int \u00d4\u00d3OO00 = 163;
    private static final int \u00d3\u00d3OO00 = 0;
    private static final int newprivatereturn = 2;

    public Risso() {
    }

    public Risso(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(35);
        arrayList.add(50);
        arrayList.add(65);
        arrayList.add(80);
        arrayList.add(100);
        arrayList.add(120);
        arrayList.add(30);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelgr\u00fcn", 19, 20));
        arrayList.add(new oooo_1("nachtblau", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8O\u00d2000);
        arrayList.add(K.o00000("Landangst"));
        arrayList.add(K.o00000("Raumangst"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("silbriggr\u00fcn", 15, 20));
        arrayList.add(new oooo_1("silbrigblau", 4, 20));
        arrayList.add(new oooo_1("silbern", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R43";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 163 + Wuerfel.max(20, 0) + Wuerfel.max(6, 2);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 165;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 2));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("K\u00e4lteresistenz"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("H\u00f6henangst", 6));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Risso";
        }
        return "Risso";
    }

    @Override
    public int wurfeleAlter() {
        return 17 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 163 + Wuerfel.sum(20, 0) + Wuerfel.sum(6, 2);
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("CH"), -2);
        this.putModifikator(b_0.void("FF"), -1);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("KO"), 1);
        this.putModifikator(b_0.void("KK"), 2);
        this.putModifikator(b_0.void("LE"), 5);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

