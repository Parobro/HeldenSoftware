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
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Satyare
extends o0oo_0 {
    private static final int ifwhilereturn = 100;
    private static final int \u00f5OOO00 = 140;
    private static final int \u00f4OOO00 = 1;
    private static final int \u00d8OOO00 = 0;

    public Satyare() {
    }

    public Satyare(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Zechen"), 1);
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
        arrayList.add(new oooo_1("blau", 3, 20));
        arrayList.add(new oooo_1("bernstein", 2, 20));
        arrayList.add(new oooo_1("grau", 3, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        arrayList.add(new oooo_1("schwarz", 3, 20));
        arrayList.add(new oooo_1("amethyst", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Unstet"));
        arrayList.add(K.o00000("Weltfremd bzgl."));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 100;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blond", 2, 20));
        arrayList.add(new oooo_1("dunkelblond", 3, 20));
        arrayList.add(new oooo_1("rot", 1, 20));
        arrayList.add(new oooo_1("rotbraun", 4, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        arrayList.add(new oooo_1("dunkelbraun", 4, 20));
        arrayList.add(new oooo_1("schwarz", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R51";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 100;
    }

    @Override
    public int getMaxGroesse() {
        return 140 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 100;
    }

    @Override
    public int getMinGroesse() {
        return 141;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d6\u00d40000));
        oOOo.o00000(oooo_0.o00000(while.Stringreturn));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Angenehmer Geruch"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Hufe (1W6+2 (A))", "H\u00f6rner (1W6+2)"));
        oo0O.\u00d300000(K.o00000("Schnelle Heilung", 1));
        oo0O.\u00d300000(K.o00000(I.\u00d8O\u00d2000));
        oo0O.\u00d300000(K.o00000("Impulsiv"));
        oo0O.\u00d300000(K.o00000("Kleinw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Neugier", 5));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Satyar";
        }
        return "Satyarin";
    }

    @Override
    public int wurfeleAlter() {
        return 11 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 140 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 14;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("CH"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 12);
        this.putModifikator(b_0.void("AU"), 13);
        this.putModifikator(b_0.void("MR"), -2);
    }
}

