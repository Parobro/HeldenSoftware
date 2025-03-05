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
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import java.util.ArrayList;

public class Loualil
extends o0oo_0 {
    private static final int \u00f5\u00f50O00 = 110;
    private static final int forfloatreturn = 148;
    private static final int \u00d5\u00f50O00 = 2;
    private static final int \u00d4\u00f50O00 = 0;
    public static final P \u00f4\u00f50O00 = new P("Loualil", 0, false);
    public static final P \u00d8\u00f50O00 = new P("Meereskinder", 0, false);

    public Loualil() {
    }

    public Loualil(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Zechen"), -2);
        this.setTalentwert(N.floatsuper().\u00d200000("Wettervorhersage"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(10);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("dunkelblau", 6, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 7, 20));
        arrayList.add(new oooo_1("grau", 3, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("K\u00e4lteresistenz"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 5, 20));
        arrayList.add(new oooo_1("blauschwarz", 9, 20));
        arrayList.add(new oooo_1("dunkelgr\u00fcn", 5, 20));
        arrayList.add(new oooo_1("silbern", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R34";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 148 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 150;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Angenehmer Geruch"));
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 1));
        oo0O.\u00d300000(K.o00000("Nichtschl\u00e4fer"));
        oo0O.\u00d300000(K.o00000("Wohlklang"));
        oo0O.\u00d300000(K.o00000("Angst vor Feuer", 6));
        oo0O.\u00d300000(K.o00000("Blutrausch"));
        oo0O.\u00d300000(K.o00000("Impulsiv"));
        return oo0O;
    }

    @Override
    public String toString() {
        String string = "";
        string = this.istMaennlich() ? "Loualil" : "Loualil";
        if (this.istVariante(\u00d8\u00f50O00)) {
            string = string + ": Meereskinder";
        }
        return string;
    }

    @Override
    public int wurfeleAlter() {
        return 13 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 148 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 8;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f4\u00f50O00);
        this.addAlleVarianten(\u00d8\u00f50O00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("CH"), 1);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 9);
        this.putModifikator(b_0.void("AU"), 15);
        this.putModifikator(b_0.void("MR"), -3);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f4\u00f50O00);
        this.addMoeglicheVariante(\u00d8\u00f50O00);
    }
}

