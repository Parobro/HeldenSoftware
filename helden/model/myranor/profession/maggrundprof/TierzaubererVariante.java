/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.OOoO.A;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class TierzaubererVariante
extends MagieVarianten {
    public TierzaubererVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 3;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.privatesuper);
        arrayList.add(I.\u00d8O\u00d2000);
        arrayList.add(K.o00000("Tierfreund"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(b_0.newwhilesuper, (Integer)12), Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)12));
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", A.\u00f800000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
            case 2: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(helden.framework.d.oooo_0.o00000(voidsuper.\u00d4\u00f6\u00d6000));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", A.\u00d8O0000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Fixierung"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kommunikation"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Wesen"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Speere"));
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Schleuder"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(N.floatsuper().\u00d200000("Klettern"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Fischen/Angeln"));
                arrayList.add(N.floatsuper().\u00d200000("Fallen stellen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
                arrayList.add(N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
                arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Abrichten"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kochen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.add(o00O.super);
        arrayList2.add(o00O.class);
        arrayList2.addAll(o00O.OO0000());
        this.addZauber(oooo_02, arrayList2, L.o00000, 7, true);
        arrayList2 = new ArrayList();
        arrayList2.add(o00O.\u00d6\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 6, true);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.add(o00O.super);
        arrayList2.addAll(o00O.\u00f500000());
        arrayList2.addAll(o00O.OO0000());
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 5);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(2, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 200;
    }
}

