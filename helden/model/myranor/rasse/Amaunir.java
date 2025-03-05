/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o00o_0;
import helden.model.KulturFabrik;
import java.util.ArrayList;
import java.util.List;

public class Amaunir
extends o0oo_0
implements for {
    private static final int privatevoidvoid = 110;
    private static final int \u00f5\u00d4oO00 = 148;
    private static final int \u00f4\u00d4oO00 = 2;
    private static final int \u00d8\u00d4oO00 = 0;
    private List<public> forvoidvoid;

    public Amaunir() {
    }

    public Amaunir(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        if (this.forvoidvoid == null) {
            this.forvoidvoid = new ArrayList<public>();
        }
        this.forvoidvoid.add(public_);
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
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("golden", 4, 20));
        arrayList.add(new oooo_1("gelb", 4, 20));
        arrayList.add(new oooo_1("helles Orange", 3, 20));
        arrayList.add(new oooo_1("dunkles Orange", 3, 20));
        arrayList.add(new oooo_1("helles Violett", 1, 20));
        arrayList.add(new oooo_1("dunkles Violett", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Herausragende Balance"));
        arrayList.add(K.o00000("Herausragende Eigenschaft: Charisma"));
        arrayList.add(K.o00000("Nachtsicht"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Goldgier"));
        arrayList.add(K.o00000("Neugier"));
        arrayList.add(K.o00000("Unstet"));
        arrayList.add(K.o00000("Nat\u00fcrliche Waffen", new Object[]{"Biss 1W6+1 TP/TP(A)"}));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("golden", 1, "3W6"));
        arrayList.add(new oooo_1("silberfarben", 2, "3W6"));
        arrayList.add(new oooo_1("wei\u00df", 2, "3W6"));
        arrayList.add(new oooo_1("kupferfarben", 2, "3W6"));
        arrayList.add(new oooo_1("bronzefarben", 2, "3W6"));
        arrayList.add(new oooo_1("grau", 2, "3W6"));
        arrayList.add(new oooo_1("anthrazitfarben", 2, "3W6"));
        arrayList.add(new oooo_1("schwarz", 2, "3W6"));
        arrayList.add(new oooo_1("dunkelviolett", 1, "3W6"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R24";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.addAll(KulturFabrik.getKulturen(this.getSetting(), this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 148 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 150;
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        ArrayList<public> arrayList = new ArrayList<public>();
        arrayList.add(K.o00000("Faulheit", 5));
        arrayList.add(K.o00000("Spieltrieb", 5));
        arrayList.add(K.o00000("Neugier", 5));
        return new o00o_0(this, arrayList, 2);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Balance"));
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Heilsames Schnurren"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Krallen (1W6+1)", "Krallen (1W6+1 (A))"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Springgelenke", new Object[]{"3"}));
        oo0O.\u00d300000(K.o00000("Wohlklang"));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Balanceschwanz"}));
        oo0O.\u00d300000(K.o00000("Krankhafte Reinlichkeit", 5));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Fleischfresser"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        if (this.forvoidvoid != null) {
            for (public public_ : this.forvoidvoid) {
                oo0O.\u00d300000(public_);
            }
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.forvoidvoid == null;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Amaunir";
        }
        return "Amauna";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 148 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 12;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("FF"), -1);
        this.putModifikator(b_0.void("LE"), 11);
        this.putModifikator(b_0.void("AU"), 11);
        this.putModifikator(b_0.void("MR"), -5);
    }
}

