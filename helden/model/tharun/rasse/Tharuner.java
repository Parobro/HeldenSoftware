/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.tharun.kultur.Conossos;
import helden.model.tharun.kultur.Hashandra;
import helden.model.tharun.kultur.IlshiVailen;
import helden.model.tharun.kultur.Jue;
import helden.model.tharun.kultur.Kuum;
import helden.model.tharun.kultur.Lania;
import helden.model.tharun.kultur.Memonhab;
import helden.model.tharun.kultur.Tharun;
import helden.model.tharun.kultur.Thuara;
import java.util.ArrayList;

public class Tharuner
extends o0oo_0 {
    private static final int O\u00d3oO00 = 105;
    private static final int \u00f8\u00d2oO00 = 145;
    private static final int ifreturnvoid = 3;
    private static final int \u00f5\u00d2oO00 = 0;
    private static ArrayList<P> \u00f4\u00d2oO00;

    public Tharuner() {
    }

    public Tharuner(Geschlecht geschlecht) {
        super(geschlecht);
        this.publicif();
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
        arrayList.add(new oooo_1("schwarz", 1, 20));
        arrayList.add(new oooo_1("dunkelbraun", 3, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("dunkelgr\u00fcn", 1, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 2, 20));
        arrayList.add(new oooo_1("gelbgr\u00fcn", 1, 20));
        arrayList.add(new oooo_1("blau", 3, 20));
        arrayList.add(new oooo_1("blaugrau", 1, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        arrayList.add(new oooo_1("silbrig", 1, 20));
        arrayList.add(new oooo_1("bernsteinfaben", 1, 20));
        arrayList.add(new oooo_1("rot", 1, 20));
        arrayList.add(new oooo_1("violett", 1, 20));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 105;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blauschwarz", 2, 20));
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("dunkelbraun", 3, 20));
        arrayList.add(new oooo_1("mittelbraun", 3, 20));
        arrayList.add(new oooo_1("hellbraun", 1, 20));
        arrayList.add(new oooo_1("dunkelblond", 1, 20));
        arrayList.add(new oooo_1("blond", 1, 20));
        arrayList.add(new oooo_1("hellblond", 1, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        arrayList.add(new oooo_1("wei\u00df", 1, 20));
        arrayList.add(new oooo_1("rot", 1, 20));
        arrayList.add(new oooo_1("gold", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R54";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Tharun(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Hashandra(this.getGeschlecht()));
            arrayList.add(new Conossos(this.getGeschlecht()));
            arrayList.add(new Memonhab(this.getGeschlecht()));
            arrayList.add(new Lania(this.getGeschlecht()));
            arrayList.add(new IlshiVailen(this.getGeschlecht()));
            arrayList.add(new Jue(this.getGeschlecht()));
            arrayList.add(new Kuum(this.getGeschlecht()));
            arrayList.add(new Thuara(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 105;
    }

    @Override
    public int getMaxGroesse() {
        return 145 + Wuerfel.max(20, 3) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 105;
    }

    @Override
    public int getMinGroesse() {
        return 148;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Herausragende Balance"));
        arrayList.add(K.o00000("Nahrungsrestriktion"));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Tharuner";
        }
        return "Tharuner";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 145 + Wuerfel.sum(20, 3) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.publicif();
        for (P p2 : \u00f4\u00d2oO00) {
            this.addAlleVarianten(p2);
        }
    }

    @Override
    protected void setzeModifikationen() {
        for (P p2 : this.getGewaehlteVarianten()) {
            this.putModifikator(b_0.\u00f400000(p2.toString()), 1);
        }
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -3);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.publicif();
        for (P p2 : \u00f4\u00d2oO00) {
            this.addMoeglicheVariante(p2);
        }
    }

    private void publicif() {
        if (\u00f4\u00d2oO00 == null) {
            \u00f4\u00d2oO00 = new ArrayList();
            for (b_0 b_02 : b_0.o\u00d60000()) {
                if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) continue;
                \u00f4\u00d2oO00.add(new P(b_02.toString(), 0, false));
            }
        }
    }
}

