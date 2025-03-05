/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.hoefling;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public class HoeflingVariante
extends N {
    public HoeflingVariante() {
        super("H\u00f6fling", "Hofdame", 0, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausr\u00fcstungsvorteil"));
        arrayList.add(K.o00000("Besonderer Besitz"));
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Verbindungen"));
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Schulden"));
        arrayList.add(K.o00000("Verpflichtungen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 10;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"));
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Bet\u00f6ren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Gassenwissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schauspielerei"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schriftlicher Ausdruck"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberzeugen"));
                int[] nArray = new int[]{6, 3, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                for (voidsuper voidsuper2 : helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
                    E e;
                    if (!(voidsuper2 instanceof E) || !(e = (E)voidsuper2).getKategorie(false).equals(s_0.o00000)) continue;
                    arrayList.add(e);
                }
                Object object = new int[]{3};
                return new m_0(arrayList, (int[])object);
            }
            case 3: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6, 3, 3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Abrichten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Alchimie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Boote fahren"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Brett-/Kartenspiel"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Fahrzeug lenken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Falschspiel"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Feinmechanik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Geschichtswissen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Handel"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Hauswirtschaft"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Gift"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kartografie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kriegskunst"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Kryptographie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Magiekunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Malen/Zeichnen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Mechanik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Philosophie"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechtskunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sch\u00e4tzen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sprachenkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Staatskunst"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Steinschneider/Juwelier"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sternkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Viehzucht"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Winzer"));
                int[] nArray = new int[]{5, 2, 2, 1, 1};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Akrobatik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Freies Fliegen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schleichen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verstecken"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Singen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Taschendiebstahl"));
                arrayList.add(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"));
                int[] nArray = new int[]{3, 2, 2, 1, 1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"), 7);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heraldik"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 5);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Verbindungen", 21));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

