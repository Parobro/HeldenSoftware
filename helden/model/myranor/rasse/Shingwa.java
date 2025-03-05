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
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import helden.model.myranor.kultur.VagabundischeKultur;
import java.util.ArrayList;

public class Shingwa
extends o0oo_0 {
    private static final int O\u00d8OO00 = 110;
    private static final int \u00f8\u00d6OO00 = 130;
    private static final int ifthisvoid = 0;
    private static final int \u00f5\u00d6OO00 = 3;

    public Shingwa() {
    }

    public Shingwa(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Klettern"), 3);
        this.setTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
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
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blau", 1, 20));
        arrayList.add(new oooo_1("rot", 2, 20));
        arrayList.add(new oooo_1("violett", 3, 20));
        arrayList.add(new oooo_1("braun", 7, 20));
        arrayList.add(new oooo_1("schwarz", 5, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Herausragender Sinn"));
        arrayList.add(K.o00000("Herausragende Balance"));
        arrayList.add(K.o00000("Schlangenmensch"));
        arrayList.add(K.o00000("Sonnensucht"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        return arrayList;
    }

    @Override
    public String getID() {
        return "R45";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        arrayList.add(new VagabundischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 130 + Wuerfel.max(20, 0) + Wuerfel.max(6, 3);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 133;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d5O0000));
        oOOo.o00000(oooo_0.o00000(while.privateStringString));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Balance"));
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00d20000.toString(), voidsuper.\u00f8\u00f4\u00d6000));
        oo0O.\u00d300000(K.o00000(I.o\u00d30000));
        oo0O.\u00d300000(K.o00000("Flink", 1));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Saugn\u00e4pfe", 4));
        oo0O.\u00d300000(K.o00000("Schleuderzunge"));
        oo0O.\u00d300000(K.o00000("Verringerter Nahrungsbedarf", 1));
        oo0O.\u00d300000(K.o00000(I.\u00d800000.toString(), new Object[]{"Bemuskelter Schwanz"}));
        oo0O.\u00d300000(K.o00000("Neugier", 6));
        oo0O.\u00d300000(K.o00000("K\u00e4ltestarre"));
        oo0O.\u00d300000(K.o00000(I.fordo.toString(), voidsuper.newnewObject, voidsuper.returnwhileObject));
        oo0O.\u00d300000(K.o00000(I.\u00f50\u00d2000));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Shingwa";
        }
        return "Shingwa";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 130 + Wuerfel.sum(20, 0) + Wuerfel.sum(6, 3);
    }

    @Override
    protected int getBasisGPKosten() {
        return 15;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("FF"), -1);
        this.putModifikator(b_0.void("GE"), 2);
        this.putModifikator(b_0.void("KO"), -1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 6);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

