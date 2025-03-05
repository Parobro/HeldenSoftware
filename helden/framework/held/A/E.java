/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.A;

import helden.framework.Monat;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_2;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class E {
    private int super;
    private Monat \u00d200000;
    private int \u00d300000;
    private oooo_2 \u00d400000;

    public static E \u00d500000() {
        Monat monat;
        int n = Wuerfel.w30();
        int n2 = Wuerfel.w20();
        if (n2 == 20 && Wuerfel.w20() == 20) {
            monat = Monat.\u00d400000;
            n = Wuerfel.w5();
        } else {
            monat = Monat.getGeburtsmonat(n2);
        }
        return new E(n, monat, 1003, oooo_2.return);
    }

    public E(int n, Monat monat, int n2, oooo_2 oooo_22) {
        this.super = n;
        this.\u00d200000 = monat;
        this.\u00d300000 = n2;
        this.\u00d400000 = oooo_22;
    }

    public oooo_2 Object() {
        return this.\u00d400000;
    }

    public int \u00d400000() {
        return this.\u00d300000;
    }

    public Monat \u00d200000() {
        return this.\u00d200000;
    }

    public int o00000() {
        return this.super;
    }

    public void \u00d200000(oooo_2 oooo_22) {
        if (this.\u00d400000 == oooo_22) {
            return;
        }
        if (oooo_22.super() && this.\u00d400000.super()) {
            this.\u00d300000 += oooo_22.super(this.\u00d400000);
            this.\u00d400000 = oooo_22;
        } else if (!oooo_22.super() && !this.\u00d400000.super()) {
            int n = this.\u00d300000 + oooo_22.super(this.\u00d400000);
            if (this.\u00d300000 > 0 && n >= 1 || this.\u00d300000 < 1 && n < 0) {
                this.\u00d300000 = n;
                this.\u00d400000 = oooo_22;
            } else if (oooo_22.super(this.\u00d400000) >= 1) {
                this.\u00d300000 = this.\u00d300000 + oooo_22.super(this.\u00d400000) + 1;
                this.\u00d400000 = oooo_22;
            } else {
                this.\u00d300000 = this.\u00d300000 + oooo_22.super(this.\u00d400000) - 1;
                this.\u00d400000 = oooo_22;
            }
        } else {
            int n = this.\u00d300000 + oooo_22.super(this.\u00d400000);
            if (this.\u00d400000.super()) {
                if (n >= 0) {
                    this.\u00d300000 = ++n;
                    this.\u00d400000 = oooo_22;
                } else {
                    this.\u00d300000 = n;
                    this.\u00d400000 = oooo_22;
                }
            } else if (this.\u00d300000 > 0) {
                this.\u00d300000 = --n;
                this.\u00d400000 = oooo_22;
            } else {
                this.\u00d300000 = n;
                this.\u00d400000 = oooo_22;
            }
        }
    }

    public void o00000(oooo_2 oooo_22) {
        this.\u00d400000 = oooo_22;
    }

    public void o00000(int n) {
        this.\u00d300000 = n;
    }

    public void o00000(Monat monat) {
        this.\u00d200000 = monat;
    }

    public void \u00d200000(int n) {
        this.super = n;
    }

    public String toString() {
        if (this.\u00d300000 < 0) {
            return this.super + ". " + this.\u00d200000.toString() + " " + Math.abs(this.\u00d300000) + this.\u00d400000.\u00d300000();
        }
        return this.super + ". " + this.\u00d200000.toString() + " " + this.\u00d300000 + this.\u00d400000.\u00d200000();
    }
}

