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
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Neristu
extends o0oo_0 {
    private static final int \u00d4\u00d6OO00 = 110;
    private static final int \u00d3\u00d6OO00 = 142;
    private static final int newthisvoid = 0;
    private static final int o\u00d6OO00 = 3;

    public Neristu() {
    }

    public Neristu(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(48);
        arrayList.add(54);
        arrayList.add(60);
        arrayList.add(64);
        arrayList.add(4);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("dunkelblau", 14, 20));
        arrayList.add(new oooo_1("hellblau", 5, 20));
        arrayList.add(new oooo_1("schwarz", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Breitgef\u00e4cherte Bildung"));
        arrayList.add(K.o00000("Gebildet"));
        arrayList.add(K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(K.o00000("Resistenz gegen Krankheiten"));
        arrayList.add(K.o00000("Verlorene Zwillingsseele"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 7, 20));
        arrayList.add(new oooo_1("blauschwarz", 4, 20));
        arrayList.add(new oooo_1("dunkelblau", 5, 20));
        arrayList.add(new oooo_1("hellblau", 2, 20));
        arrayList.add(new oooo_1("wei\u00df ", 1, 20));
        arrayList.add(new oooo_1("blond", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R39";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new HoefischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 110;
    }

    @Override
    public int getMaxGroesse() {
        return 142 + Wuerfel.max(20, 0) + Wuerfel.max(6, 3);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 145;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Beidh\u00e4ndig"));
        oo0O.\u00d300000(K.o00000("Immunit\u00e4t gegen Gift", "pflanzliche Gifte", "alchimistische Gifte"));
        oo0O.\u00d300000(K.o00000("Nachtsicht"));
        oo0O.\u00d300000(K.o00000("Zus\u00e4tzliche Gliedma\u00dfen", new Object[]{"Armpaar"}));
        oo0O.\u00d300000(K.o00000("Kleinw\u00fcchsig"));
        oo0O.\u00d300000(K.o00000("Lichtempfindlich"));
        oo0O.\u00d300000(K.o00000("Unf\u00e4higkeit f\u00fcr [Talent]", voidsuper.newnewObject, voidsuper.returnwhileObject));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Neristo";
        }
        return "Nerista";
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 142 + Wuerfel.sum(20, 0) + Wuerfel.sum(6, 3);
    }

    @Override
    protected int getBasisGPKosten() {
        return 16;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("FF"), 2);
        this.putModifikator(b_0.void("KO"), -1);
        this.putModifikator(b_0.void("KK"), -2);
        this.putModifikator(b_0.void("LE"), 7);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -2);
    }
}

