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
import helden.framework.OoOO.N;
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class GRolmur
extends o0oo_0 {
    private static final int \u00d4\u00f60O00 = 80;
    private static final int \u00d3\u00f60O00 = 1;
    private static final int newforreturn = 0;

    public GRolmur() {
    }

    public GRolmur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Schleichen"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Sich verstecken"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        this.setTalentwert(N.floatsuper().\u00d200000("Mechanik"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);
        arrayList.add(26);
        arrayList.add(27);
        arrayList.add(28);
        arrayList.add(29);
        arrayList.add(30);
        arrayList.add(1);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("milchig-grau", 3, 20));
        arrayList.add(new oooo_1("klar-grau", 4, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 7, 20));
        arrayList.add(new oooo_1("blau", 4, 20));
        arrayList.add(new oooo_1("schwarz", 2, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Astrale Regeneration"));
        arrayList.add(K.o00000("Astralmacht"));
        arrayList.add(K.o00000(I.\u00f4\u00d20000));
        arrayList.add(K.o00000("Feste Matrix"));
        arrayList.add(K.o00000("Hohe Magieresistenz"));
        arrayList.add(K.o00000("Prospektorensinn"));
        arrayList.add(K.o00000("Schutzgeist"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Lichtempfindlich"));
        arrayList.add(K.o00000("Lichtscheu"));
        arrayList.add(K.o00000("Neugier"));
        arrayList.add(K.o00000("Schlechter Ruf"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() / 3;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("bleich", 6, 20));
        arrayList.add(new oooo_1("hellgrau", 8, 20));
        arrayList.add(new oooo_1("hellr\u00f6tlich", 1, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R30";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BaeuerlicheKultur(this.getGeschlecht()));
        arrayList.add(new HoefischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() / 3;
    }

    @Override
    public int getMaxGroesse() {
        return 80 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() / 3;
    }

    @Override
    public int getMinGroesse() {
        return 81;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.o00000(oooo_0.o00000(while.\u00d2o\u00d4000));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Halbzauberer"));
        oo0O.\u00d300000(K.o00000("Nachtsicht"));
        oo0O.\u00d300000(K.o00000("Geiz", 6));
        oo0O.\u00d300000(K.o00000("Goldgier", 7));
        oo0O.\u00d300000(K.o00000("Winzw\u00fcchsig"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "G'Rolmur";
        }
        return "G'Rolmurin";
    }

    @Override
    public int wurfeleAlter() {
        return 2 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 80 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("KL"), 2);
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("CH"), -1);
        this.putModifikator(b_0.void("FF"), 2);
        this.putModifikator(b_0.void("KO"), -1);
        this.putModifikator(b_0.void("KK"), -3);
        this.putModifikator(b_0.void("LE"), 5);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -2);
    }
}

