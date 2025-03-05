/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.MyranischerZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class ArkanerForscherVariante
extends MagieVarianten {
    public ArkanerForscherVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(K.o00000("Stubenhocker"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Elementare Manifestation"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Elementare Reinheit"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Siminiagef\u00e4lliges Wissen"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Dolche"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.remove(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.remove(voidsuper.oo\u00d6000);
                arrayList.remove(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.remove(voidsuper.\u00f5\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00d3\u00d6\u00d5000);
                int[] nArray = new int[]{3, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.addAll(this.getProfession().getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:Erkenntnis", 7);
        this.addWC(oooo_02, "HE:Iryabaar", 7);
        oooo_02 = new oooo_0(2, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Zauberei", 5);
        this.addWC(oooo_02, "E:Kraft", 4);
        this.addWC(oooo_02, "E:(Un-)Element", 5);
        this.addWC(oooo_02, "W:(Un-)Element", 4);
        oooo_02 = new oooo_0(2, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            b_0 b_02;
            if (myranischerZauber.hatMerkmal(o00O.OO0000, null)) continue;
            if (myranischerZauber.toString().startsWith("E:")) {
                b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 4, false));
                oooo_02.o00000(b_02);
                continue;
            }
            b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 3, false));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000("Instruktion", "Antimagie"), helden.framework.d.oooo_0.o00000("Instruktion", "Bann der Quelle")));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"), helden.framework.d.oooo_0.o00000("Instruktion", "Analyse")));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Gebildet", 3));
        oo0O.\u00d300000(K.o00000("Neugier", 5));
        return oo0O;
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

