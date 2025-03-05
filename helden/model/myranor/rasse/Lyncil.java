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
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import helden.model.myranor.kultur.VagabundischeKultur;
import java.util.ArrayList;

public class Lyncil
extends o0oo_0 {
    private static final int whilewhilereturn = 70;
    private static final int ooOO00 = 139;
    private static final int OoOO00 = 1;
    private static final int \u00f8OOO00 = 0;

    public Lyncil() {
    }

    public Lyncil(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(55);
        arrayList.add(60);
        arrayList.add(65);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("milchigwei\u00df", 3, 20));
        arrayList.add(new oooo_1("grau", 4, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 8, 20));
        arrayList.add(new oooo_1("gelb-braun", 4, 20));
        arrayList.add(new oooo_1("golden", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Richtungssinn"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 70;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schneewei\u00df", 1, 20));
        arrayList.add(new oooo_1("grau mit schwarzen Flecken", 3, 20));
        arrayList.add(new oooo_1("hellbraun", 5, 20));
        arrayList.add(new oooo_1("dunkelbraun", 6, 20));
        arrayList.add(new oooo_1("gelblich", 4, 20));
        arrayList.add(new oooo_1("golden", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R36";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new HoefischeKultur(this.getGeschlecht()));
        arrayList.add(new NomadischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        arrayList.add(new VagabundischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 70;
    }

    @Override
    public int getMaxGroesse() {
        return 139 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 70;
    }

    @Override
    public int getMinGroesse() {
        return 140;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Balance"));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Herausragender Sinn", new Object[]{"Geh\u00f6r"}));
        oo0O.\u00d300000(K.o00000("K\u00e4lteresistenz"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Krallen (1W6+1)", "Krallen (1W6+1 (A))", "Biss (1W6+1)"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Hitzeempfindlichkeit"));
        oo0O.\u00d300000(K.o00000("Kleinw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Fleischfresser"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Lyncil";
        }
        return "Lyncila";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 139 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 11;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("GE"), -1);
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("LE"), 13);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

