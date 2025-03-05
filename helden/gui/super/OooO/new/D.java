/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.new;

import helden.framework.OOoO.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import helden.gui.super.OooO.O0OO.B;
import helden.gui.super.OooO.new.F;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
extends F
implements Comparable<B> {
    private KonkreterZauber for = null;

    public D(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, KonkreterZauber konkreterZauber) {
        this.for = konkreterZauber;
        this.\u00f800000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    public int o00000(B b) {
        return this.toString().compareTo(b.toString());
    }

    @Override
    public int \u00d500000() {
        return 6;
    }

    @Override
    public int[] \u00d200000() {
        int[] nArray = new int[this.\u00d500000()];
        nArray[0] = 620;
        nArray[1] = 225;
        nArray[2] = 64;
        nArray[3] = 75;
        nArray[4] = 74;
        nArray[5] = 77;
        return nArray;
    }

    @Override
    public String[] \u00f500000() {
        String[] stringArray = new String[this.\u00d500000()];
        stringArray[0] = "Kommentar:";
        stringArray[1] = "Anmerkung:";
        stringArray[2] = "Kosten:";
        stringArray[3] = "Zauberdauer:";
        stringArray[4] = "Wirkungsdauer:";
        stringArray[5] = "Reichweite:";
        return stringArray;
    }

    @Override
    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f800000() {
        return this.\u00f800000;
    }

    @Override
    public String[] o00000() {
        ZauberInfos zauberInfos = this.\u00f800000().\u00d5o0000().\u00d600000(this.for);
        String[] stringArray = new String[this.\u00d500000()];
        stringArray[0] = zauberInfos.getKommentar();
        stringArray[1] = zauberInfos.getAnmerkungen();
        stringArray[2] = zauberInfos.getKosten();
        stringArray[3] = zauberInfos.getZauberdauer();
        stringArray[4] = zauberInfos.getWirkungsdauer();
        stringArray[5] = zauberInfos.getReichweite();
        return stringArray;
    }

    @Override
    public String \u00d600000() {
        return this.toString();
    }

    @Override
    public String null() {
        return this.for.getRep().super();
    }

    @Override
    public K \u00d300000() {
        return this.for.getRep();
    }

    public KonkreterZauber \u00d5O0000() {
        return this.for;
    }

    @Override
    public boolean \u00f600000() {
        return true;
    }

    @Override
    public void o00000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00f800000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    @Override
    public void o00000(String[] stringArray) {
        ZauberInfos zauberInfos = this.\u00f800000().\u00d5o0000().\u00d600000(this.for);
        zauberInfos.setKommentar(stringArray[0]);
        zauberInfos.setAnmerkungen(stringArray[1]);
        zauberInfos.setKosten(stringArray[2]);
        zauberInfos.setZauberdauer(stringArray[3]);
        zauberInfos.setWirkungsdauer(stringArray[4]);
        zauberInfos.setReichweite(stringArray[5]);
    }

    public String toString() {
        return this.for.getZaubername();
    }
}

