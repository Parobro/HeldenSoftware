/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import helden.model.myranor.kultur.VagabundischeKultur;
import java.util.ArrayList;

public class Dorinther
extends o0oo_0 {
    private static final int \u00f4\u00d4OO00 = 95;
    private static final int \u00d8\u00d4OO00 = 144;
    private static final int thisinterfacereturn = 2;
    private static final int \u00d5\u00d4OO00 = 0;

    public Dorinther() {
    }

    public Dorinther(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
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
        arrayList.add(new oooo_1("schwarz", 5, 20));
        arrayList.add(new oooo_1("dunkelbraun", 8, 20));
        arrayList.add(new oooo_1("mittelbraun", 4, 20));
        arrayList.add(new oooo_1("hellbraun", 2, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 95;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 6, 20));
        arrayList.add(new oooo_1("dunkelbraun", 7, 20));
        arrayList.add(new oooo_1("mittelbraun", 5, 20));
        arrayList.add(new oooo_1("hellbraun", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R29";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        arrayList.add(new VagabundischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 95;
    }

    @Override
    public int getMaxGroesse() {
        return 144 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 95;
    }

    @Override
    public int getMinGroesse() {
        return 146;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Dorinther";
        }
        return "Dorintherin";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 144 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("GE"), -1);
        this.putModifikator(b_0.void("KK"), 1);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

