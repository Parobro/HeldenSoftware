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
import helden.model.myranor.kultur.MaritimeKultur;
import java.util.ArrayList;

public class Ziliten
extends o0oo_0 {
    private static final int \u00d3\u00f50O00 = 110;
    private static final int nullfloatreturn = 160;
    private static final int o\u00f50O00 = 1;
    private static final int O\u00f50O00 = 0;

    public Ziliten() {
    }

    public Ziliten(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 2);
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
        arrayList.add(new oooo_1("schwarz", 19, 20));
        arrayList.add(new oooo_1("nachtblau", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Kleinw\u00fcchsig"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public String getID() {
        return "R68";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 160 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 161;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 1));
        oo0O.\u00d300000(K.o00000("Nachtsicht"));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Bemuskelter Schwanz"}));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Zilit";
        }
        return "Ziliti";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 160 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 7;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("MU"), -1);
        this.putModifikator(b_0.void("IN"), 2);
        this.putModifikator(b_0.void("GE"), 2);
        this.putModifikator(b_0.void("KO"), -2);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 5);
        this.putModifikator(b_0.void("AU"), 15);
        this.putModifikator(b_0.void("MR"), -2);
    }
}

