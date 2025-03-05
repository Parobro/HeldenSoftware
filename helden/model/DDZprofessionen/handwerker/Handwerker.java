/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.C.I;
import helden.framework.D.OoOO.D;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.DDZKulturen.Ambosszwerge;
import helden.model.DDZKulturen.Brillantzwerge;
import helden.model.DDZKulturen.Darna;
import helden.model.DDZKulturen.Dschungelstaemme;
import helden.model.DDZKulturen.Erzzwerge;
import helden.model.DDZKulturen.Ferkina;
import helden.model.DDZKulturen.Fjarninger;
import helden.model.DDZKulturen.Gjalskerlaender;
import helden.model.DDZKulturen.Koschzwerge;
import helden.model.DDZKulturen.Nivesenstaemme;
import helden.model.DDZKulturen.Nortreisch;
import helden.model.DDZKulturen.Orkland;
import helden.model.DDZKulturen.Tocamuyac;
import helden.model.DDZKulturen.Trollzacken;
import helden.model.DDZKulturen.VerloreneStaemme;
import helden.model.DDZKulturen.WaldinselUtulus;
import helden.model.kultur.Goblinstamm;
import helden.model.kultur.NuanaaeLi;
import helden.model.kultur.StammesAchaz;
import java.util.ArrayList;

public class Handwerker
extends helden.framework.int.N {
    public static final int privateObjectfloat = 1;
    public static final int forObjectfloat = 2;
    public static final int \u00f5\u00d2\u00f5O00 = 3;
    public static final int \u00f4\u00d2\u00f5O00 = 4;
    private ArrayList<m_0> \u00d8\u00d2\u00f5O00;
    private boolean \u00d5\u00d2\u00f5O00;
    private boolean \u00d4\u00d2\u00f5O00;
    private int \u00d3\u00d2\u00f5O00;

    public Handwerker(String string, int n) {
        this(string, n, false, false);
    }

    public Handwerker(String string, int n, boolean bl, boolean bl2) {
        this(string, n, bl, bl2, 0);
    }

    public Handwerker(String string, int n, boolean bl, boolean bl2, int n2) {
        super(string, n);
        this.\u00d3\u00d2\u00f5O00 = n2;
        this.\u00d5\u00d2\u00f5O00 = bl;
        this.\u00d4\u00d2\u00f5O00 = bl2;
    }

    public Handwerker(String string, int n, int n2) {
        this(string, n, false, false, n2);
    }

    public void createAuswahlen() {
        this.\u00d8\u00d2\u00f5O00 = new ArrayList();
        this.\u00d8\u00d2\u00f5O00.add(this.\u00d4\u00d4O000());
        if (this.\u00d3\u00d2\u00f5O00 < 1) {
            this.\u00d8\u00d2\u00f5O00.add(this.Objectfor());
        }
        if (!this.\u00d4\u00d2\u00f5O00) {
            if (this.\u00d3\u00d2\u00f5O00 > 0) {
                this.\u00d8\u00d2\u00f5O00.add(this.\u00d6\u00d4O000());
            }
            this.\u00d8\u00d2\u00f5O00.add(this.voidfor());
            if (this.\u00d3\u00d2\u00f5O00 != 1 || this.\u00d3\u00d2\u00f5O00 != 2) {
                this.\u00d8\u00d2\u00f5O00.add(this.\u00d2\u00d4O000());
            }
        }
        if (this.\u00d3\u00d2\u00f5O00 == 2) {
            this.\u00d8\u00d2\u00f5O00.add(this.floatfor());
        }
        if (this.\u00d3\u00d2\u00f5O00 == 3) {
            this.\u00d8\u00d2\u00f5O00.add(this.\u00d5\u00d4O000());
            this.\u00d8\u00d2\u00f5O00.add(this.\u00f6\u00d4O000());
        }
        if (this.\u00d3\u00d2\u00f5O00 == 4) {
            this.\u00d8\u00d2\u00f5O00.add(this.\u00f5\u00d4O000());
        }
        this.\u00d8\u00d2\u00f5O00.add(this.\u00f4\u00d4O000());
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        if (this.\u00d8\u00d2\u00f5O00 == null) {
            this.createAuswahlen();
        }
        return this.\u00d8\u00d2\u00f5O00.size();
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        if (this.\u00d4\u00d2\u00f5O00) {
            return 1;
        }
        return 0;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Handkarren");
        arrayList.add("Kiepe mit hochwertigem Arbeitsger\u00e4t");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (this.\u00d3\u00d2\u00f5O00 > 0) {
            if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                return 1;
            }
        } else if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        if (n == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
            arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
            return new returnsuper(this.getProfession(), arrayList, 6, 2);
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        D d2 = (D)oooo_0.o00000(while.\u00d30\u00d2000.toString());
        d2.\u00d500000("Stadtviertel oder Ort");
        arrayList.add(d2);
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        return this.\u00d8\u00d2\u00f5O00.get(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        if (this.\u00d5\u00d2\u00f5O00) {
            k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
            k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        } else {
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        }
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        if (this.\u00d4\u00d2\u00f5O00) {
            k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
            k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
            k_02.\u00d200000(G.\u00d80\u00f6000, 2);
            k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
            k_02.\u00d200000(voidsuper.o\u00f6\u00d5000, 2);
            k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 3);
            k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, 1);
        }
        if (this.\u00d3\u00d2\u00f5O00 == 1) {
            k_02.\u00d200000(E.o\u00d6\u00d8000, 2);
            k_02.\u00d200000(voidsuper.ifforObject, 1);
            k_02.o00000(voidsuper.O0\u00d6000);
            k_02.o00000(voidsuper.O\u00f6\u00d5000);
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
            k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000);
            k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 3);
        }
        if (this.\u00d3\u00d2\u00f5O00 == 2) {
            k_02.o00000(voidsuper.O0\u00d6000);
            k_02.o00000(voidsuper.O\u00f6\u00d5000);
            k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, -1);
            k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 4);
            k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
            k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        }
        if (this.\u00d3\u00d2\u00f5O00 == 3) {
            k_02.o00000(voidsuper.O0\u00d6000);
            k_02.o00000(voidsuper.O\u00f6\u00d5000);
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
            k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        }
        if (this.\u00d3\u00d2\u00f5O00 == 4) {
            k_02.\u00d200000(voidsuper.newnewObject, 1);
            k_02.o00000(voidsuper.\u00d40\u00d6000);
            k_02.o00000(voidsuper.O0\u00d6000);
            k_02.o00000(voidsuper.O\u00f6\u00d5000);
            k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
            k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
            k_02.o00000(voidsuper.O\u00f4\u00d5000);
            k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 1);
            k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 2);
        }
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.\u00d8\u00d6O000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public BedingungsVerknuepfung getWahlBedingung() {
        BedingungsVerknuepfung bedingungsVerknuepfung;
        if (this.\u00d4\u00d2\u00f5O00) {
            bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
            bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Ambosszwerge().getID()));
            bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Brillantzwerge().getID()));
            bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Erzzwerge().getID()));
            bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Koschzwerge().getID()));
        } else {
            switch (this.\u00d3\u00d2\u00f5O00) {
                case 1: {
                    bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Darna().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Dschungelstaemme().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new StammesAchaz().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Tocamuyac().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new VerloreneStaemme().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new WaldinselUtulus().getID()));
                    break;
                }
                case 2: {
                    bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Ferkina().getID()));
                    break;
                }
                case 3: {
                    bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Orkland().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Nortreisch().getID()));
                    break;
                }
                case 4: {
                    bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Fjarninger().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Gjalskerlaender().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Nivesenstaemme().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Goblinstamm().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new NuanaaeLi().getID()));
                    bedingungsVerknuepfung.addBedingung(Bedingung.hatKulturID(new Trollzacken().getID()));
                    break;
                }
                default: {
                    bedingungsVerknuepfung = null;
                }
            }
        }
        return bedingungsVerknuepfung;
    }

    private m_0 \u00f6\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
        arrayList.add(voidsuper.\u00d5\u00f6\u00d5000);
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray);
    }

    private m_0 \u00d4\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        if (this.\u00d3\u00d2\u00f5O00 == 1) {
            arrayList.add(E.\u00d4\u00d4\u00d8000);
            arrayList.add(E.\u00d3\u00d6\u00d8000);
            arrayList.add(E.\u00f5\u00d5\u00d8000);
            arrayList.add(E.\u00d3\u00d5\u00d8000);
        } else if (this.\u00d3\u00d2\u00f5O00 == 2) {
            arrayList.add(E.\u00d3\u00d6\u00d8000);
            arrayList.add(E.\u00f5\u00d5\u00d8000);
            arrayList.add(E.\u00d5\u00d4\u00d8000);
            arrayList.add(E.\u00d3\u00d5\u00d8000);
        } else if (this.\u00d3\u00d2\u00f5O00 == 4) {
            arrayList.add(E.\u00d3\u00d6\u00d8000);
            arrayList.add(E.\u00d5\u00d4\u00d8000);
            arrayList.add(E.\u00d3\u00d5\u00d8000);
        } else {
            arrayList.add(E.\u00d4\u00d6\u00d8000);
            arrayList.add(E.\u00d3\u00d6\u00d8000);
            arrayList.add(E.\u00d5\u00d4\u00d8000);
            arrayList.add(E.\u00d5\u00d6\u00d8000);
            arrayList.add(E.\u00d3\u00d5\u00d8000);
        }
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray, "Armbrust, Bogen oder kulturtypische Wurfwaffe");
    }

    private m_0 \u00d2\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(voidsuper.\u00d5o\u00d8000);
        arrayList.add(voidsuper.thisclassObject);
        int[] nArray = new int[]{1};
        return new m_0(arrayList, nArray);
    }

    private m_0 \u00f4\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
        arrayList.add(voidsuper.privatedoObject);
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray);
    }

    private m_0 \u00d6\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
        int[] nArray = new int[]{5, 5};
        return new m_0(arrayList, nArray, "Haupttalent");
    }

    private m_0 voidfor() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
        arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
        if (this.\u00d3\u00d2\u00f5O00 > 0) {
            int[] nArray = new int[]{4, 4, 2, 2, 2, 2};
            return new m_0(arrayList, nArray, "Hilfs- oder verwandte Talente. Passend zum Haupttalent des Berufs. Haupttalent maximal auf +8!");
        }
        int[] nArray = new int[]{4, 4, 2, 2, 2, 2, 2};
        return new m_0(arrayList, nArray, "Hilfs- oder verwandte Talente. Passend zum Haupttalent des Berufs");
    }

    private m_0 \u00f5\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(E.o\u00d6\u00d8000);
        arrayList.add(E.\u00f8\u00d5\u00d8000);
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray);
    }

    private m_0 \u00d5\u00d4O000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(E.\u00d8\u00d5\u00d8000);
        arrayList.add(E.o\u00d6\u00d8000);
        arrayList.add(E.\u00f8\u00d5\u00d8000);
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray);
    }

    private m_0 floatfor() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(E.o\u00d6\u00d8000);
        arrayList.add(E.\u00d3\u00d4\u00d8000);
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray);
    }

    private m_0 Objectfor() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        if (this.\u00d5\u00d2\u00f5O00) {
            arrayList.add(E.\u00d8\u00d5\u00d8000);
        }
        arrayList.add(E.o\u00d6\u00d8000);
        arrayList.add(E.\u00d5\u00d5\u00d8000);
        arrayList.add(E.\u00f8\u00d5\u00d8000);
        int[] nArray = new int[]{2};
        return new m_0(arrayList, nArray);
    }
}

