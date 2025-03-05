/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.athlet;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class AthletVariante
extends N {
    public AthletVariante() {
        super("Athlet", "Athletin", 0, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Flink"));
        arrayList.add(K.o00000("Guter Ruf"));
        arrayList.add(K.o00000("Aberglaube"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("LeP"), 1);
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(b_0.\u00f4\u00f4\u00d2000, (Integer)13), Bedingung.hat(b_0.privatedosuper, (Integer)13)));
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Aufmerksamkeit"));
        arrayList.add(oooo_0.o00000("Ausweichen I"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfspeere"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfbeile"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Wurfmesser"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                int[] nArray = new int[]{6, 3, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gassenwissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verkleiden"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schauspielerei"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fahrzeug lenken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Flugger\u00e4te steuern"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                arrayList.addAll(for.\u00d200000("Waffenloser Kampfstil: Amaunischer Stil"));
                arrayList.addAll(for.\u00d200000("Waffenloser Kampfstil: Gladiatorenstil"));
                arrayList.addAll(for.\u00d200000("Waffenloser Kampfstil: Hammerfaust"));
                arrayList.addAll(for.\u00d200000("Waffenloser Kampfstil: Myrmidonenstil"));
                arrayList.addAll(for.\u00d200000("Waffenloser Kampfstil: Thalassischer Stil"));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        return super.getVerbilligteSonderfertigkeitAuswahl(n);
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

