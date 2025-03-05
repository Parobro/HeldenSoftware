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
import helden.model.myranor.kultur.MaritimeKultur;
import java.util.ArrayList;

public class Hippocampir
extends o0oo_0 {
    private static final int o\u00d4OO00 = 105;
    private static final int O\u00d4OO00 = 139;
    private static final int \u00f8\u00d3OO00 = 1;
    private static final int ifprivatereturn = 0;

    public Hippocampir() {
    }

    public Hippocampir(Geschlecht geschlecht) {
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
        arrayList.add(new oooo_1("dunkelgr\u00fcn", 19, 20));
        arrayList.add(new oooo_1("nachtblau", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Herausragender Sinn", "Sicht"));
        arrayList.add(K.o00000("H\u00f6henangst"));
        arrayList.add(K.o00000("Landangst"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 105;
    }

    @Override
    public String getID() {
        return "R62";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new MaritimeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 105;
    }

    @Override
    public int getMaxGroesse() {
        return 139 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 105;
    }

    @Override
    public int getMinGroesse() {
        return 140;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Aquatisches Lebewesen", 1));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 2));
        oo0O.\u00d300000(K.o00000("Rundumsicht"));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Greifschwanz"}));
        oo0O.\u00d300000(K.o00000("Eingeschr\u00e4nkter Sinn", new Object[]{"Tastsinn"}));
        oo0O.\u00d300000(K.o00000("Kleinw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Hippocampir";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 139 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 13;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("CH"), 1);
        this.putModifikator(b_0.void("FF"), -1);
        this.putModifikator(b_0.void("GE"), 2);
        this.putModifikator(b_0.void("KK"), -2);
        this.putModifikator(b_0.void("LE"), 7);
        this.putModifikator(b_0.void("AU"), 16);
        this.putModifikator(b_0.void("MR"), -6);
    }
}

