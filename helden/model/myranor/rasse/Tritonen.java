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
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import java.util.ArrayList;

public class Tritonen
extends o0oo_0 {
    private static final int \u00f4\u00d6OO00 = 110;
    private static final int \u00d8\u00d6OO00 = 168;
    private static final int returnthisvoid = 1;
    private static final int \u00d5\u00d6OO00 = 0;

    public Tritonen() {
    }

    public Tritonen(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 3);
        this.setTalentwert(N.floatsuper().\u00d200000("Singen"), 2);
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
        arrayList.add(new oooo_1("gr\u00fcn", 9, 20));
        arrayList.add(new oooo_1("blau", 7, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
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
        arrayList.add(new oooo_1("goldblond", 5, "1W20"));
        arrayList.add(new oooo_1("feuerrot", 5, "1W20"));
        arrayList.add(new oooo_1("lilabraun", 5, "1W20"));
        arrayList.add(new oooo_1("schwarzblau", 5, "1W20"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R67";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        arrayList.add(new HoefischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 168 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 169;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 2));
        oo0O.\u00d300000(K.o00000("Meereskind"));
        oo0O.\u00d300000(K.o00000("Viertelzauberer"));
        oo0O.\u00d300000(K.o00000("Blutrausch"));
        oo0O.\u00d300000(K.o00000("Elementgebunden", new Object[]{"Wasser"}));
        oo0O.\u00d300000(K.o00000("Impulsiv"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Triton";
        }
        return "Tritonin";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 168 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -3);
    }
}

