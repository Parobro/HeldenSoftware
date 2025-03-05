/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.StaedtischeKultur;
import helden.model.myranor.kultur.VagabundischeKultur;
import java.util.ArrayList;

public class Zwerge
extends o0oo_0 {
    private static final int returnwhilereturn = 80;
    private static final int \u00d5OOO00 = 128;
    private static final int \u00d4OOO00 = 0;
    private static final int \u00d3OOO00 = 2;

    public Zwerge() {
    }

    public Zwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Akrobatik"), -3);
        this.setTalentwert(N.floatsuper().\u00d200000("Raufen"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), -3);
        this.setTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Zechen"), 1);
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
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("blau", 1, 20));
        arrayList.add(new oooo_1("grau", 4, 20));
        arrayList.add(new oooo_1("schwarz", 6, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(K.o00000("Hitzeresistenz"));
        arrayList.add(K.o00000("Hohe Magieresistenz"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Nachtsicht"));
        arrayList.add(I.\u00f4Oo000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Prospektorensinn"));
        arrayList.add(K.o00000("Blutrausch"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        arrayList.add(K.o00000("Lichtscheu"));
        arrayList.add(K.o00000("Meeresangst"));
        arrayList.add(K.o00000("Platzangst"));
        arrayList.add(K.o00000("Unansehnlich"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 80;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("goldblond", 2, 20));
        arrayList.add(new oooo_1("silberwei\u00df", 2, 20));
        arrayList.add(new oooo_1("kohlschwarz", 5, 20));
        arrayList.add(new oooo_1("felsgrau", 3, 20));
        arrayList.add(new oooo_1("stahlgrau", 2, 20));
        arrayList.add(new oooo_1("aschgrau", 2, 20));
        arrayList.add(new oooo_1("salzwei\u00df", 2, 20));
        arrayList.add(new oooo_1("kupferrot", 1, 20));
        arrayList.add(new oooo_1("feuerrot", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R50";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        arrayList.add(new VagabundischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 80;
    }

    @Override
    public int getMaxGroesse() {
        return 128 + Wuerfel.max(20, 0) + Wuerfel.max(6, 2);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 80;
    }

    @Override
    public int getMinGroesse() {
        return 130;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Kompakt"));
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d50000.toString(), new Object[]{"mineralische Gifte"}));
        oo0O.\u00d300000(K.o00000("Resistenz gegen Krankheiten"));
        oo0O.\u00d300000(K.o00000("Schwer zu verzaubern"));
        oo0O.\u00d300000(K.o00000(I.fordo.toString(), voidsuper.returnprivateObject));
        oo0O.\u00d300000(K.o00000("Zwergenwuchs"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Zwerg";
        }
        return "Zwergin";
    }

    @Override
    public int wurfeleAlter() {
        return 35 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 128 + Wuerfel.sum(20, 0) + Wuerfel.sum(6, 2);
    }

    @Override
    protected int getBasisGPKosten() {
        return 15;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("GE"), -1);
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("KK"), 2);
        this.putModifikator(b_0.void("LE"), 12);
        this.putModifikator(b_0.void("AU"), 16);
        this.putModifikator(b_0.void("MR"), -4);
    }
}

