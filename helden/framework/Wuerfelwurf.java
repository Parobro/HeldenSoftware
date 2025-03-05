/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

import helden.framework.Wuerfel;

public class Wuerfelwurf {
    private int \u00d300000;
    private int \u00d200000;
    private int o00000;

    public Wuerfelwurf() {
        this(0, 0, 0);
    }

    public Wuerfelwurf(int n, int n2, int n3) {
        this.\u00d300000 = n2;
        this.\u00d200000 = n;
        this.o00000 = n3;
    }

    public int getKonstant() {
        return this.o00000;
    }

    public int getMax() {
        int n = this.o00000;
        n = this.\u00d300000 > 0 ? (n += 6 * this.\u00d300000) : (n += this.\u00d300000);
        n = this.\u00d200000 > 0 ? (n += 20 * this.\u00d200000) : (n += this.\u00d200000);
        return n;
    }

    public int getMin() {
        int n = this.o00000;
        n = this.\u00d300000 > 0 ? (n += this.\u00d300000) : (n += 6 * this.\u00d300000);
        n = this.\u00d200000 > 0 ? (n += this.\u00d200000) : (n += 20 * this.\u00d200000);
        return n;
    }

    public int getW20() {
        return this.\u00d200000;
    }

    public int getW6() {
        return this.\u00d300000;
    }

    public boolean isNull() {
        return this.\u00d200000 == 0 && this.\u00d300000 == 0 && this.o00000 == 0;
    }

    public void setKonstant(int n) {
        this.o00000 = n;
    }

    public void setW20(int n) {
        this.\u00d200000 = n;
    }

    public void setW6(int n) {
        this.\u00d300000 = n;
    }

    public String toString() {
        return this.\u00d200000 + " W20 + " + this.\u00d300000 + " W6 + " + this.o00000;
    }

    public int wuerfele() {
        int n;
        int n2 = this.o00000;
        for (n = 1; n <= Math.abs(this.\u00d200000); ++n) {
            n2 = (int)((float)n2 + Math.signum(this.\u00d200000) * (float)Wuerfel.w20());
        }
        for (n = 1; n <= Math.abs(this.\u00d300000); ++n) {
            n2 = (int)((float)n2 + Math.signum(this.\u00d300000) * (float)Wuerfel.w6());
        }
        return n2;
    }
}

