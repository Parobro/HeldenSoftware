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
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Minotauren
extends o0oo_0 {
    private static final int O\u00d6OO00 = 90;
    private static final int \u00f8\u00d5OO00 = 208;
    private static final int privateinterfacereturn = 2;
    private static final int \u00f5\u00d5OO00 = 0;

    public Minotauren() {
    }

    public Minotauren(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
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
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 20, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(I.\u00d8O\u00d2000);
        arrayList.add(K.o00000("Blutrausch"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 90;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz-wei\u00df gescheckt", 3, 20));
        arrayList.add(new oooo_1("einfarbig schwarz", 5, 20));
        arrayList.add(new oooo_1("hellbraun", 7, 20));
        arrayList.add(new oooo_1("schneewei\u00df", 5, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R38";
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
        return this.getMaxGroesse() - 90;
    }

    @Override
    public int getMaxGroesse() {
        return 208 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 90;
    }

    @Override
    public int getMinGroesse() {
        return 210;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.o00000(oooo_0.o00000(while.Stringreturn));
        oOOo.o00000(oooo_0.o00000("Kopfsto\u00df"));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Gro\u00dfw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Hufe (1W6+4 (A))", "H\u00f6rner (1W6+4)"));
        oo0O.\u00d300000(K.o00000("Erh\u00f6hter Nahrungsbedarf", 1));
        oo0O.\u00d300000(K.o00000("J\u00e4hzorn", 6));
        oo0O.\u00d300000(K.o00000("Kein r\u00e4umliches Sehen"));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Vegetarier"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Minotaurus";
        }
        return "Minotaurin";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 208 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 8;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("KL"), -1);
        this.putModifikator(b_0.void("FF"), -1);
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("KK"), 2);
        this.putModifikator(b_0.void("LE"), 12);
        this.putModifikator(b_0.void("AU"), 18);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

