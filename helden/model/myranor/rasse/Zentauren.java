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
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import java.util.ArrayList;

public class Zentauren
extends o0oo_0 {
    private static final int \u00d4\u00d4OO00 = 190;
    private static final int \u00d3\u00d4OO00 = 2;
    private static final int whileprivatereturn = 0;

    public Zentauren() {
    }

    public Zentauren(Geschlecht geschlecht) {
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
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("braun", 14, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 2, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() * 2;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 2, 20));
        arrayList.add(new oooo_1("grau gescheckt", 2, 20));
        arrayList.add(new oooo_1("hellbraun", 5, 20));
        arrayList.add(new oooo_1("dunkelbraun", 4, 20));
        arrayList.add(new oooo_1("beige", 4, 20));
        arrayList.add(new oooo_1("golden", 3, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R49";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() * 2;
    }

    @Override
    public int getMaxGroesse() {
        return 190 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() * 2;
    }

    @Override
    public int getMinGroesse() {
        return 192;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.Stringreturn));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Berittenes Wesen"));
        oo0O.\u00d300000(K.o00000("Galopp"));
        oo0O.\u00d300000(K.o00000("Gro\u00dfe Tragf\u00e4higkeit"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", new Object[]{"Hufe (1W6+4 (A))"}));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Beinpaar"}));
        oo0O.\u00d300000(K.o00000("Erh\u00f6hter Nahrungsbedarf", 2));
        oo0O.\u00d300000(K.o00000("Gro\u00dfer Rumpf"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Zentaur";
        }
        return "Zentaurin";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 190 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 21;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("LE"), 14);
        this.putModifikator(b_0.void("AU"), 19);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

