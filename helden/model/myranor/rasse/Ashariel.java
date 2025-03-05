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
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Ashariel
extends o0oo_0 {
    private static final int privatedoreturn = 170;
    private static final int \u00f50OO00 = 230;
    private static final int \u00f40OO00 = 0;
    private static final int \u00d80OO00 = 3;

    public Ashariel() {
    }

    public Ashariel(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(35);
        arrayList.add(50);
        arrayList.add(65);
        arrayList.add(80);
        arrayList.add(100);
        arrayList.add(120);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("hellblau", 4, 20));
        arrayList.add(new oooo_1("blaugr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("blaugrau", 4, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 1, 20));
        arrayList.add(new oooo_1("schwarz", 5, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        arrayList.add(new oooo_1("braun", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Talentschub"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 170;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelblond", 6, 20));
        arrayList.add(new oooo_1("mittelblond", 6, 20));
        arrayList.add(new oooo_1("hellblond", 4, 20));
        arrayList.add(new oooo_1("wei\u00dfblond", 3, 20));
        arrayList.add(new oooo_1("wei\u00df", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R25";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 170;
    }

    @Override
    public int getMaxGroesse() {
        return 230 + Wuerfel.max(20, 0) + Wuerfel.max(6, 3);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 170;
    }

    @Override
    public int getMinGroesse() {
        return 233;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Balance"));
        oo0O.\u00d300000(K.o00000("Beidh\u00e4ndig"));
        oo0O.\u00d300000(K.o00000("Fliegendes Wesen"));
        oo0O.\u00d300000(K.o00000("Gro\u00dfw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Ungeduld", 9));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Ashariel";
        }
        return "Ashariel";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 230 + Wuerfel.sum(20, 0) + Wuerfel.sum(6, 3);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("KK"), -1);
        this.putModifikator(b_0.void("LE"), 9);
        this.putModifikator(b_0.void("AU"), 20);
        this.putModifikator(b_0.void("MR"), -3);
    }
}

