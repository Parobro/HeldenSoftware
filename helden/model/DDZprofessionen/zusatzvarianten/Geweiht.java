/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.zusatzvarianten;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class Geweiht
extends N {
    private boolean StringObjectfloat;
    private int \u00f5o\u00f5O00;

    private static int \u00d200000(int n, boolean bl) {
        int n2 = 0;
        if (!bl) {
            n2 = 2;
        }
        switch (n) {
            case 1: {
                return 11 + n2;
            }
            case 2: {
                return 12 + n2;
            }
            case 3: {
                return 14 + n2;
            }
            case 4: {
                return 15 + n2;
            }
        }
        return 99;
    }

    public Geweiht(int n) {
        this(n, true);
    }

    public Geweiht(int n, boolean bl) {
        super("Geweiht (" + n * 6 + " KaP)", "Geweiht (" + n * 6 + " KaP)", Geweiht.\u00d200000(n, bl), false);
        this.StringObjectfloat = bl;
        this.\u00f5o\u00f5O00 = n;
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("heiliges Buch");
        arrayList.add("geweihter Talisman");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 10;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)5));
        return bedingungsVerknuepfung;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00f5\u00d5\u00f4000));
                arrayList.add(oooo_0.o00000(while.\u00d30\u00d4000));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00d5\u00f6000));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f6000));
                arrayList.add(oooo_0.o00000(while.\u00d2\u00f6\u00d2000));
                arrayList.add(oooo_0.o00000(while.\u00d6\u00f6\u00d5000));
                return new objectsuper_0(this.getProfession(), arrayList, 3);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00f5\u00d5\u00f4000.toString())) {
                    arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00f4000));
                }
                if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00d30\u00d4000.toString())) {
                    arrayList.add(oooo_0.o00000(while.\u00d20\u00d4000));
                }
                if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00f6\u00d5\u00f6000.toString())) {
                    arrayList.add(oooo_0.o00000(while.\u00f5\u00d5\u00f6000));
                }
                if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00d5\u00f4\u00f6000.toString())) {
                    arrayList.add(oooo_0.o00000(while.iffloatclass));
                }
                if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00d2\u00f6\u00d2000.toString())) {
                    arrayList.add(oooo_0.o00000(while.returnpublicsuper));
                }
                if (this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00d6\u00f6\u00d5000.toString())) {
                    arrayList.add(oooo_0.o00000(while.\u00d5\u00f6\u00d5000));
                }
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00f8\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.forinterface, this.\u00f5o\u00f5O00));
        if (this.StringObjectfloat) {
            oo0O.\u00d300000(K.o00000(I.o\u00d2o000, "passend zur Gottheit", 6));
        }
        return oo0O;
    }
}

