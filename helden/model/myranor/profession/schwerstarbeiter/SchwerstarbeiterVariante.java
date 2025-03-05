/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.schwerstarbeiter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class SchwerstarbeiterVariante
extends N {
    public SchwerstarbeiterVariante() {
        super("Schwerstarbeiter", "Schwerstarbeiterin", 0, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Herausragende Eigenschaft: K\u00f6rperkraft"));
        arrayList.add(K.o00000("Herausragende Eigenschaft: Konstitution"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Aberglaube"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 5;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KO"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Waffenloser Kampfstil: Gossenstil"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"));
                int[] nArray = new int[]{4, 3, 2, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"));
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schneidern"));
                int[] nArray = new int[]{4, 2, 1, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Ackerbau"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Baukunst"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Bergbau"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fahrzeug lenken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fallen stellen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fesseln/Entfesseln"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gesteinskunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Hauswirtschaft"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("H\u00fcttenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Maurer"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Mechanik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Seiler"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Steinmetz"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("T\u00f6pfern"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Viehzucht"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Zimmermann"));
                int[] nArray = new int[]{4, 4, 3, 3, 3, 1, 1, 1, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Hiebwaffen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Gassenwissen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"), 2);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

