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
import helden.framework.Wuerfelwurf;
import helden.framework.d.oooo_0;
import helden.framework.held.A.A;
import helden.framework.held.A.OOoO;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Leonir
extends o0oo_0 {
    private int \u00f4\u00f60O00;
    private int \u00d8\u00f60O00;
    private int returnforreturn;
    private int \u00d5\u00f60O00;

    public Leonir() {
        this.o\u00d2O000();
    }

    public Leonir(Geschlecht geschlecht) {
        super(geschlecht);
        this.o\u00d2O000();
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.istMaennlich()) {
            this.setTalentwert(N.floatsuper().\u00d200000("Raufen"), 1);
            this.setTalentwert(N.floatsuper().\u00d200000("Athletik"), 2);
            this.setTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        }
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
        arrayList.add(new oooo_1("schwarzbrau", 10, 20));
        arrayList.add(new oooo_1("dunkelbraun", 9, 20));
        arrayList.add(new oooo_1("rotbraun", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public ArrayList<A> getFarben() {
        ArrayList<A> arrayList = super.getFarben();
        A a2 = new A(OOoO.\u00f600000, new Wuerfelwurf(1, 0, 0));
        a2.o00000(1, 4, "schwarz");
        a2.o00000(5, 10, "dunkelbraun");
        a2.o00000(11, 16, "mittelbraun");
        a2.o00000(17, 19, "sandbraun");
        a2.o00000(20, 20, "rotblond");
        arrayList.add(a2);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - this.\u00f4\u00f60O00;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkel sandfarben", 5, 20));
        arrayList.add(new oooo_1("sandfarben", 10, 20));
        arrayList.add(new oooo_1("hell sandfarben", 4, 20));
        arrayList.add(new oooo_1("r\u00f6tlich sandfarben", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R33";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new HoefischeKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - this.\u00f4\u00f60O00;
    }

    @Override
    public int getMaxGroesse() {
        return this.\u00d8\u00f60O00 + Wuerfel.max(20, this.returnforreturn) + Wuerfel.max(6, this.\u00d5\u00f60O00);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - this.\u00f4\u00f60O00;
    }

    @Override
    public int getMinGroesse() {
        return this.\u00d8\u00f60O00 + this.returnforreturn + this.\u00d5\u00f60O00;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Einsch\u00fcchterndes Gebr\u00fcll"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Krallen (1W6+1)", "Krallen (1W6+1 (A))", "Biss (1W6+4)"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Balanceschwanz"}));
        oo0O.\u00d300000(K.o00000("Arroganz", 9));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Fleischfresser"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        if (this.istMaennlich()) {
            oo0O.\u00d300000(K.o00000("Gro\u00dfw\u00fcchsig"));
            oo0O.\u00d300000(K.o00000("Erh\u00f6hter Nahrungsbedarf", 2));
        }
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Leonos";
        }
        return "Leona";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return this.\u00d8\u00f60O00 + Wuerfel.sum(20, this.returnforreturn) + Wuerfel.sum(6, this.\u00d5\u00f60O00);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("MU"), 2);
        this.putModifikator(b_0.void("FF"), -2);
        this.putModifikator(b_0.void("GE"), 1);
        if (this.istMaennlich()) {
            this.putModifikator(b_0.void("KO"), 2);
            this.putModifikator(b_0.void("KK"), 2);
            this.putModifikator(b_0.void("LE"), 12);
            this.putModifikator(b_0.void("AU"), 10);
        } else {
            this.putModifikator(b_0.void("KO"), 3);
            this.putModifikator(b_0.void("KK"), 1);
            this.putModifikator(b_0.void("LE"), 11);
            this.putModifikator(b_0.void("AU"), 12);
        }
        this.putModifikator(b_0.void("MR"), -6);
    }

    private void o\u00d2O000() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            this.\u00f4\u00f60O00 = 90;
            this.\u00d8\u00f60O00 = 210;
            this.returnforreturn = 1;
            this.\u00d5\u00f60O00 = 0;
        } else {
            this.\u00f4\u00f60O00 = 110;
            this.\u00d8\u00f60O00 = 170;
            this.returnforreturn = 1;
            this.\u00d5\u00f60O00 = 0;
        }
    }
}

