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
import java.util.ArrayList;

public class Norkosh
extends o0oo_0 {
    private static final int \u00d4\u00f80O00 = 90;
    private static final int \u00d3\u00f80O00 = 189;
    private static final int whileforreturn = 1;
    private static final int o\u00f80O00 = 0;

    public Norkosh() {
    }

    public Norkosh(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 1);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelblau", 5, 20));
        arrayList.add(new oooo_1("dunkelviolett", 5, 20));
        arrayList.add(new oooo_1("dunkelgrau", 6, 20));
        arrayList.add(new oooo_1("schwarz", 4, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(K.o00000("Nachtsicht"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 90;
    }

    @Override
    public String getID() {
        return "R64";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 90;
    }

    @Override
    public int getMaxGroesse() {
        return 189 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 90;
    }

    @Override
    public int getMinGroesse() {
        return 190;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 1));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 2));
        oo0O.\u00d300000(K.o00000("Beh\u00e4big"));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Norkosh";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 189 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("FF"), -1);
        this.putModifikator(b_0.void("GE"), -1);
        this.putModifikator(b_0.void("KO"), 3);
        this.putModifikator(b_0.void("KK"), 1);
        this.putModifikator(b_0.void("LE"), 12);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

