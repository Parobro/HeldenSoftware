/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Ravesaran
extends o0oo_0 {
    private static final int fordoreturn = 115;
    private static final int \u00d50OO00 = 165;
    private static final int \u00d40OO00 = 1;
    private static final int \u00d30OO00 = 0;

    public Ravesaran() {
    }

    public Ravesaran(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 7, 20));
        arrayList.add(new oooo_1("braun", 8, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 2, 20));
        arrayList.add(new oooo_1("blau", 3, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Sucht"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 115;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 6, 20));
        arrayList.add(new oooo_1("dunkelbraun", 5, 20));
        arrayList.add(new oooo_1("mittelbraun", 4, 20));
        arrayList.add(new oooo_1("hellbraun", 3, 20));
        arrayList.add(new oooo_1("rotblond", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R41";
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
        return this.getMaxGroesse() - 115;
    }

    @Override
    public int getMaxGroesse() {
        return 165 + Wuerfel.max(20, 1) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 115;
    }

    @Override
    public int getMinGroesse() {
        return 166;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("Altersresistenz"));
        oo0O.\u00d300000(K.o00000("Angenehmer Geruch"));
        oo0O.\u00d300000(K.o00000("Geschlechtswandel"));
        oo0O.\u00d300000(K.o00000("Herausragendes Aussehen"));
        oo0O.\u00d300000(K.o00000("Wohlklang"));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Vegan"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Ravesaran";
        }
        return "Ravesaran";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w6();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 165 + Wuerfel.sum(20, 1) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 14;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("IN"), 1);
        this.putModifikator(b_0.void("CH"), 2);
        this.putModifikator(b_0.void("KK"), -2);
        this.putModifikator(b_0.void("LE"), 10);
        this.putModifikator(b_0.void("AU"), 10);
        this.putModifikator(b_0.void("MR"), -2);
    }
}

