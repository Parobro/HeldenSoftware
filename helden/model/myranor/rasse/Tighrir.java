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
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BarbarischeKultur;
import java.util.ArrayList;

public class Tighrir
extends o0oo_0 {
    private static final int newwhilereturn = 100;
    private static final int oOOO00 = 2;
    private static final int OOOO00 = 0;
    private int \u00f80OO00 = 0;

    public Tighrir() {
    }

    public Tighrir(Geschlecht geschlecht) {
        super(geschlecht);
        this.\u00f80OO00 = this.istMaennlich() ? 260 : 250;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schleichen"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
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
        arrayList.add(new oooo_1("grau", 2, 20));
        arrayList.add(new oooo_1("grau-blau", 6, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 10, 20));
        arrayList.add(new oooo_1("bernsteinfarben", 2, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000(I.\u00f4\u00d20000));
        arrayList.add(K.o00000("Blutdurst"));
        arrayList.add(K.o00000("Blutrausch"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        return arrayList;
    }

    @Override
    public String getID() {
        return "R47";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 100;
    }

    @Override
    public int getMaxGroesse() {
        return this.\u00f80OO00 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 100;
    }

    @Override
    public int getMinGroesse() {
        return this.\u00f80OO00 + 2 + 0;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("H\u00fcnenw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Krallen (1W6+2 (A))", "Krallen (1W6+2)", "Gebiss (1W6+6)"));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Balanceschwanz"}));
        oo0O.\u00d300000(K.o00000("Erh\u00f6hter Nahrungsbedarf", 2));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "rohes Fleisch"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Tighrore";
        }
        return "Tighra";
    }

    @Override
    public int wurfeleAlter() {
        return 13 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return this.\u00f80OO00 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 18;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("FF"), -2);
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("KK"), 3);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("LE"), 16);
        this.putModifikator(b_0.void("AU"), 11);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

