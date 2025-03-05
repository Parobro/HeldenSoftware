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
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import java.util.ArrayList;

public class Shinoqi
extends o0oo_0 {
    private static final int O\u00f80O00 = 80;
    private static final int \u00f8\u00f60O00 = 180;
    private static final int ifforreturn = 1;
    private static final int \u00f5\u00f60O00 = 0;

    public Shinoqi() {
    }

    public Shinoqi(Geschlecht geschlecht) {
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
        arrayList.add(60);
        arrayList.add(120);
        arrayList.add(170);
        arrayList.add(210);
        arrayList.add(240);
        arrayList.add(255);
        arrayList.add(15);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("gelb", 7, 20));
        arrayList.add(new oooo_1("bernsteinfarben", 10, 20));
        arrayList.add(new oooo_1("orange", 3, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Schwer zu verzaubern"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Raumangst"));
        arrayList.add(K.o00000("Sonnensucht"));
        arrayList.add(K.o00000("Unangenehme Stimme"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 80;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelgr\u00fcn", 2, 20));
        arrayList.add(new oooo_1("hellgr\u00fcn", 10, 20));
        arrayList.add(new oooo_1("gelbgr\u00fcn", 6, 20));
        arrayList.add(new oooo_1("sandgelb", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R52";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 80;
    }

    @Override
    public int getMaxGroesse() {
        return 180 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 80;
    }

    @Override
    public int getMinGroesse() {
        return 181;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d5O0000));
        oOOo.o00000(oooo_0.o00000(while.\u00d6\u00d40000));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Bedrohliches Knurren"));
        oo0O.\u00d300000(K.o00000("Immunit\u00e4t gegen Krankheiten", new Object[]{"alle Krankheiten"}));
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d50000.toString(), new Object[]{"pflanzliche Gifte"}));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 3));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", new Object[]{"Hornkamm (1W6+2)"}));
        oo0O.\u00d300000(K.o00000("Verringerter Nahrungsbedarf", 1));
        oo0O.\u00d300000(K.o00000(I.\u00d800000.toString(), new Object[]{"Bemuskelter Schwanz"}));
        oo0O.\u00d300000(K.o00000("F\u00fchllos"));
        oo0O.\u00d300000(K.o00000(I.\u00d8\u00f8O000.toString(), new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do.toString()}));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Shinoq";
        }
        return "Shinoq";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 180 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 24;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("FF"), -2);
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("LE"), 13);
        this.putModifikator(b_0.void("AU"), 13);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

