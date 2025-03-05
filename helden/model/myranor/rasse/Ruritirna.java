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
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import java.util.ArrayList;

public class Ruritirna
extends o0oo_0 {
    private static final int \u00f8\u00f40O00 = 105;
    private static final int Stringfloatreturn = 165;
    private static final int \u00f5\u00f40O00 = 1;
    private static final int \u00f4\u00f40O00 = 0;

    public Ruritirna() {
    }

    public Ruritirna(Geschlecht geschlecht) {
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
        arrayList.add(K.o00000("Kampfrausch"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 105;
    }

    @Override
    public String getID() {
        return "R66";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 105;
    }

    @Override
    public int getMaxGroesse() {
        return 165 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 105;
    }

    @Override
    public int getMinGroesse() {
        return 166;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 2));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000(I.\u00d4\u00f80000));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", new Object[]{"Biss (1W6+3)"}));
        oo0O.\u00d300000(K.o00000("Saugn\u00e4pfe", 4));
        oo0O.\u00d300000(K.o00000("Schlangenmensch"));
        oo0O.\u00d300000(K.o00000("Lichtscheu"));
        oo0O.\u00d300000(K.o00000("Unstet"));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Ruritirna";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 165 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 14;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("MU"), -1);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("LE"), 9);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

