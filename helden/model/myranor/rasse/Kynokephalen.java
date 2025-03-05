/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Kynokephalen
extends o0oo_0 {
    private static final int o\u00d3OO00 = 150;
    private static final int O\u00d3OO00 = 0;
    private static final int \u00f8\u00d2OO00 = 5;

    public Kynokephalen() {
    }

    public Kynokephalen(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(42);
        arrayList.add(47);
        arrayList.add(50);
        arrayList.add(52);
        arrayList.add(1);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 6, 20));
        arrayList.add(new oooo_1("braun", 5, 20));
        arrayList.add(new oooo_1("bernstein", 3, 20));
        arrayList.add(new oooo_1("gelb", 2, 20));
        arrayList.add(new oooo_1("grau", 3, 20));
        arrayList.add(new oooo_1("rot", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Kr\u00e4fteschub"));
        arrayList.add(I.\u00d8O\u00d2000);
        arrayList.add(K.o00000("Blutrausch"));
        arrayList.add(K.o00000("Sklavenmentalit\u00e4t"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.getGroesse() - 70;
        }
        return this.getGroesse() - 65;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("grauschwarz", 4, 20));
        arrayList.add(new oooo_1("graubraun", 4, 20));
        arrayList.add(new oooo_1("rotbraun", 4, 20));
        arrayList.add(new oooo_1("erdbraun", 4, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R32";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.getMaxGroesse() - 70;
        }
        return this.getMaxGroesse() - 65;
    }

    @Override
    public int getMaxGroesse() {
        return 150 + Wuerfel.max(20, 0) + Wuerfel.max(6, 5);
    }

    @Override
    public int getMinGewicht() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.getMinGroesse() - 70;
        }
        return this.getMinGroesse() - 65;
    }

    @Override
    public int getMinGroesse() {
        return 155;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", new Object[]{"Biss (1W6+4)"}));
        oo0O.\u00d300000(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        oo0O.\u00d300000(K.o00000("F\u00fcrsorglich", 7));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Kynokephal";
        }
        return "Kynokephale";
    }

    @Override
    public int wurfeleAlter() {
        return 10 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 150 + Wuerfel.sum(20, 0) + Wuerfel.sum(6, 5);
    }

    @Override
    protected int getBasisGPKosten() {
        return 9;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("MU"), -1);
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("CH"), -1);
        this.putModifikator(b_0.void("FF"), 1);
        this.putModifikator(b_0.void("KK"), 2);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

