/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.zauber.KonkreterZauber;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ZauberMitWertUndHZ {
    private KonkreterZauber \u00d200000;
    private int \u00d300000;
    private boolean super;

    public ZauberMitWertUndHZ(KonkreterZauber konkreterZauber, int n, boolean bl) {
        this.\u00d200000 = konkreterZauber;
        this.\u00d300000 = n;
        this.super = bl;
    }

    public int getWert() {
        return this.\u00d300000;
    }

    public KonkreterZauber getZauber() {
        return this.\u00d200000;
    }

    public boolean isHauszauber() {
        return this.super;
    }

    public void setHauszauber(boolean bl) {
        this.super = bl;
    }

    public void setTalent(KonkreterZauber konkreterZauber) {
        this.\u00d200000 = konkreterZauber;
    }

    public void setWert(int n) {
        this.\u00d300000 = n;
    }

    public String toString() {
        String string = this.\u00d200000.toString() + " +" + this.\u00d300000;
        if (this.super) {
            string = string + " (HZ)";
        }
        return string;
    }
}

