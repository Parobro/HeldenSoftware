/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur.optimatenhaeuser;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.private;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import helden.model.profession.Botenreiter;
import java.util.ArrayList;
import java.util.Iterator;

public class OptimatPartholonVariante
extends OptimatBasisVariante {
    public OptimatPartholonVariante() {
        super("Haus Partholon", "Haus Partholon", 4, false);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2 + super.getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000);
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 2);
        return k_02;
    }

    @Override
    public boolean wirdMutterspracheZurZeitsprache() {
        return true;
    }

    @Override
    public G getMuttersprache() {
        return G.o\u00d8\u00f5000;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Bastardst\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Speere"));
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Prinzipientreue", 10));
        return oo0O;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Arroganz"));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Blutdurst"));
        arrayList.add(K.o00000("Blutrausch"));
        arrayList.add(K.o00000("Impulsiv"));
        return arrayList;
    }

    public static void main(String[] stringArray) {
        int n;
        OptimatPartholonVariante optimatPartholonVariante = new OptimatPartholonVariante();
        optimatPartholonVariante.setProfession(new Botenreiter());
        optimatPartholonVariante.getProfession().setSetting(Settings.getSettingByName("Myranor"));
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            optimatPartholonVariante.getMinimalEigenschaftswert(iterator.next());
        }
        optimatPartholonVariante.getTalentwerte(G.\u00d8\u00f8\u00f4000, G.\u00d3\u00d2\u00f5000, 10);
        optimatPartholonVariante.getModifikationen();
        optimatPartholonVariante.getSonderfertigkeiten();
        optimatPartholonVariante.getEmpfohleneVorteile();
        optimatPartholonVariante.getUngeeigneteVorteile();
        optimatPartholonVariante.getVerbilligteSonderfertigkeiten();
        optimatPartholonVariante.getVorteile();
        for (n = 0; n < optimatPartholonVariante.getAnzahlTalentAuswahlen(); ++n) {
            optimatPartholonVariante.getTalentAuswahl(n);
        }
        for (n = 0; n < optimatPartholonVariante.getAnzahlSonderfertigkeitAuswahlen(); ++n) {
            optimatPartholonVariante.getSonderfertigkeitAuswahl(n);
        }
        for (n = 0; n < optimatPartholonVariante.getAnzahlVerbilligteSonderfertigkeitAuswahlen(); ++n) {
            optimatPartholonVariante.getVerbilligteSonderfertigkeitAuswahl(n);
        }
        String string = optimatPartholonVariante.toString();
        if (optimatPartholonVariante.getBezeichner(Geschlecht.\u00d400000).equals(optimatPartholonVariante.getBezeichner(Geschlecht.\u00d300000))) {
            System.out.println(string + ": Bezeichner");
        }
        int n2 = 0;
        while (true) {
            try {
                if (optimatPartholonVariante.getTalentAuswahl(n2) == null) {
                    break;
                }
            }
            catch (c_1 c_12) {
                break;
            }
            catch (X x) {
                System.out.println(string + ": Unbekanntes Talent " + x.getMessage());
            }
            ++n2;
        }
        if (n2 != optimatPartholonVariante.getAnzahlTalentAuswahlen()) {
            System.out.println(string + ": Talentauswahlen (" + n2 + "/" + optimatPartholonVariante.getAnzahlTalentAuswahlen());
        }
        n2 = 0;
        while (true) {
            try {
                if (optimatPartholonVariante.getSonderfertigkeitAuswahl(n2) == null) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                System.out.println(string + ": Unbekanntes Talent " + runtimeException.getMessage());
            }
            ++n2;
        }
        if (n2 != optimatPartholonVariante.getAnzahlSonderfertigkeitAuswahlen()) {
            System.out.println(string + ": SFauswahlen (" + n2 + "/" + optimatPartholonVariante.getAnzahlSonderfertigkeitAuswahlen());
        }
        n2 = 0;
        while (true) {
            try {
                if (optimatPartholonVariante.getVerbilligteSonderfertigkeitAuswahl(n2) == null) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                System.out.println(string + ": Unbekanntes vSF " + runtimeException.getMessage());
            }
            ++n2;
        }
        if (n2 != optimatPartholonVariante.getAnzahlVerbilligteSonderfertigkeitAuswahlen()) {
            System.out.println(string + ": vSFauswahlen (" + n2 + "/" + optimatPartholonVariante.getAnzahlVerbilligteSonderfertigkeitAuswahlen());
        }
        private.o00000("Finish");
    }
}

