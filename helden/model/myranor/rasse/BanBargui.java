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
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.NomadischeKultur;
import java.util.ArrayList;

public class BanBargui
extends o0oo_0 {
    private static final int \u00f4\u00d5OO00 = 110;
    private static final int \u00d8\u00d5OO00 = 160;
    private static final int forinterfacereturn = 2;
    private static final int \u00d5\u00d5OO00 = 0;

    public BanBargui() {
    }

    public BanBargui(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Orientierung"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(80);
        arrayList.add(130);
        arrayList.add(180);
        arrayList.add(220);
        arrayList.add(260);
        arrayList.add(290);
        arrayList.add(25);
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
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Tierempathie (speziell)"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("hellblau", 2, 20));
        arrayList.add(new oooo_1("rotblond", 8, 20));
        arrayList.add(new oooo_1("goldblond", 8, 20));
        arrayList.add(new oooo_1("wei\u00df", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R26";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 160 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 162;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Ban Bargui";
        }
        return "BanBargui";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 160 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 11);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

