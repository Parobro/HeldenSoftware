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
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import java.util.ArrayList;

public class Hjaldinger
extends o0oo_0 {
    public static final P o0OO00 = new P("Variante KK+1", 0, false);
    public static final P O0OO00 = new P("Variante KO+1", 0, false);
    private static final int nulldoreturn = 90;
    private static final int \u00f8\u00f80O00 = 172;
    private static final int Stringdoreturn = 2;
    private static final int \u00f5\u00f80O00 = 0;

    public Hjaldinger() {
    }

    public Hjaldinger(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
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
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("braun", 5, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("blau", 7, 20));
        arrayList.add(new oooo_1("grau", 2, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("K\u00e4lteresistenz"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Blutrausch"));
        arrayList.add(K.o00000("Hitzeempfindlichkeit"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 90;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blond", 8, 20));
        arrayList.add(new oooo_1("rotblond", 5, 20));
        arrayList.add(new oooo_1("wei\u00dfblond", 2, 20));
        arrayList.add(new oooo_1("rot", 2, 20));
        arrayList.add(new oooo_1("dunkelblond", 1, 20));
        arrayList.add(new oooo_1("hellbraun", 1, 20));
        arrayList.add(new oooo_1("dunkelbraun", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R31";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 90;
    }

    @Override
    public int getMaxGroesse() {
        return 172 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 90;
    }

    @Override
    public int getMinGroesse() {
        return 174;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Hjaldinger";
        }
        return "Hjaldingerin";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 172 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(o0OO00);
        this.addAlleVarianten(O0OO00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("LE"), 11);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -5);
        if (this.istVariante(O0OO00)) {
            this.putModifikator(b_0.void("KO"), 1);
        }
        if (this.istVariante(o0OO00)) {
            this.putModifikator(b_0.void("KK"), 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(o0OO00);
        this.addMoeglicheVariante(O0OO00);
    }
}

