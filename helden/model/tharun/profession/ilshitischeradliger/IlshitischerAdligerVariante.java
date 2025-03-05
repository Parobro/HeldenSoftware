/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.ilshitischeradliger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class IlshitischerAdligerVariante
extends N {
    public IlshitischerAdligerVariante() {
        super("Ilshitischer Adliger", "Ilshitischer Adliger", 7, false);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Reittier");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Adliges Erbe"));
        arrayList.add(K.o00000("Ausr\u00fcstungsvorteil"));
        arrayList.add(K.o00000("Besonderer Besitz"));
        arrayList.add(K.o00000("Gebildet"));
        arrayList.add(K.o00000("Gutaussehend"));
        arrayList.add(K.o00000("Verbindungen"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Feind"));
        arrayList.add(K.o00000("Gr\u00f6\u00dfenwahn"));
        arrayList.add(K.o00000("Stubenhocker"));
        arrayList.add(K.o00000("Verpflichtungen"));
        arrayList.add(K.o00000("Verschwendungssucht"));
        arrayList.add(K.o00000("Verw\u00f6hnt"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Peitsche"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Schleichen"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verstecken"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Singen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Zechen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Bet\u00f6ren"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"), 7);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 7);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberzeugen"), 5);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Geografie"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heraldik"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechtskunde"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sch\u00e4tzen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sprachenkunde"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Staatskunst"), 5);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Hauswirtschaft"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Handel"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Musizieren"), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Abschaum"));
        arrayList.add(K.o00000("Randgruppe"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Arroganz", 5));
        oo0O.\u00d300000(K.o00000("Verbindungen", 45));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

