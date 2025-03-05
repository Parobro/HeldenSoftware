/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
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

public class ArkanerHaendlerDiplomatVariante
extends MagieVarianten {
    public ArkanerHaendlerDiplomatVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Empathie"));
        arrayList.add(K.o00000("Gebildet"));
        arrayList.add(K.o00000("Gutaussehend"));
        arrayList.add(K.o00000("Guter Ruf"));
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Goldgier"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(N.floatsuper().\u00d200000("Geschichtswissen"));
                arrayList.add(N.floatsuper().\u00d200000("Handel"));
                arrayList.add(N.floatsuper().\u00d200000("Heraldik"));
                arrayList.add(voidsuper.\u00d3\u00d8\u00d6000);
                arrayList.add(N.floatsuper().\u00d200000("Sch\u00e4tzen"));
                arrayList.add(N.floatsuper().\u00d200000("Sprachenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Staatskunst"));
                return new returnsuper(this.getProfession(), arrayList, 10, 4, 1, 4);
            }
        }
        throw new c_1();
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(this.getSetting().getSF(while.\u00d2o\u00f5000));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Geistillusion"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kommunikation"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verh\u00fcllung"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Eiserner Wille I"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Dolche"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6, 6};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
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
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zechen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bet\u00f6ren"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hauswirtschaft"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 2);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        b_0 b_02;
        String string;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:Harmonie", 7);
        this.addWC(oooo_02, "HE:Darcalya", 7);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Erkenntnis", 6);
        this.addWC(oooo_02, "E:Iryabaar", 6);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Kreativit\u00e4t", 5);
        this.addWC(oooo_02, "E:Endg\u00fcltigkeit", 5);
        this.addWC(oooo_02, "E:Erfolg", 5);
        this.addWC(oooo_02, "E:Xolovar", 5);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (o00O comparable : o00O.\u00f400000()) {
            string = "W:" + comparable.toString();
            if (!MyranischerZauber.zauberExists(string) || comparable.equals(o00O.OO0000)) continue;
            b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(string), 3, false));
            oooo_02.o00000(b_02);
        }
        for (o00O o00O2 : o00O.\u00f400000()) {
            string = "E:" + o00O2.toString();
            if (!MyranischerZauber.zauberExists(string) || o00O2.equals(o00O.OO0000)) continue;
            b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(string), 4, false));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            if (myranischerZauber.hatMerkmal(o00O.OO0000, null)) continue;
            if (myranischerZauber.toString().startsWith("E:")) {
                b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 4, false));
                oooo_02.o00000(b_02);
                continue;
            }
            b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 3, false));
            oooo_02.o00000(b_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(this.getSetting().getvSF(while.\u00d2o\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00f4\u00d8\u00f5000);
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

