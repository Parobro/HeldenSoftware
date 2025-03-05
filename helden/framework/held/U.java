/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.int;
import helden.framework.held.o00O;
import helden.framework.held.oooo_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class U {
    private E \u00d400000;
    private o00O<voidsuper> super;
    private int \u00d300000 = 0;
    private int \u00d200000 = 0;

    public U(E e, o00O<voidsuper> o00O2) {
        this.\u00d400000 = e;
        this.super = o00O2;
        this.\u00d200000();
    }

    public int \u00d300000() {
        if (this.\u00d400000.o\u00d80000()) {
            return this.\u00d300000;
        }
        int n = 0;
        try {
            n = this.super.\u00f400000(this.\u00d400000);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException("Attackewert eines nicht vorhandenen Talents abgefragt");
        }
        return n;
    }

    public int String() {
        return this.\u00d200000;
    }

    public int o00000() {
        int n = 0;
        try {
            n = this.super.\u00f400000(this.\u00d400000);
        }
        catch (D d2) {
            d2.printStackTrace();
        }
        if (n < 0) {
            return 0;
        }
        return n - (this.\u00d300000 + this.\u00d200000);
    }

    public void \u00d200000() {
        try {
            int n = this.super.\u00f400000(this.\u00d400000);
            if (n <= 0) {
                this.\u00d300000 = 0;
                this.\u00d200000 = 0;
                if (this.\u00d400000.o\u00d80000()) {
                    this.\u00d200000 += n / 2;
                    this.\u00d300000 += n / 2;
                    this.\u00d200000 += n % 2;
                } else {
                    this.\u00d300000 += n;
                }
            }
        }
        catch (D d2) {
            throw new RuntimeException("Talent " + this.\u00d400000 + " ist gar nicht aktiviert.");
        }
    }

    public void o00000(int n, int n2) throws D, oooo_0, int {
        int n3 = this.super.\u00f400000(this.\u00d400000);
        this.\u00d200000(n, n2);
        if (n + n2 > n3) {
            throw new oooo_0();
        }
        this.\u00d300000 = n;
        this.\u00d200000 = n2;
    }

    public void o00000(int n, boolean bl) throws D, oooo_0, int {
        int n2 = this.super.\u00f400000(this.\u00d400000);
        if (!bl) {
            this.\u00d200000(n, this.\u00d200000);
        }
        if (!bl && n + this.\u00d200000 > n2) {
            helden.framework.held.object.oooo_0.\u00f500000("Kampfwerte stimmen nicht " + this.\u00d400000 + " Neuer Wert: " + n);
            throw new oooo_0();
        }
        this.\u00d300000 = n;
    }

    public void o00000(int n) throws oooo_0, int {
        if (this.\u00d400000.o\u00d80000()) {
            int n2 = 0;
            try {
                n2 = this.super.\u00f400000(this.\u00d400000);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                throw new RuntimeException("Parade-Erh\u00f6hung eines nicht vorhandenen Kampftalents");
            }
            this.\u00d200000(this.\u00d300000, n);
            if (this.\u00d300000 + n <= n2) {
                this.\u00d200000 = n;
            } else {
                throw new oooo_0("Nicht gen\u00fcgend Talentpunte");
            }
        }
    }

    private void \u00d200000(int n, int n2) throws int {
        if (Math.abs(n - n2) > 5) {
            throw new int(this.\u00d400000.toString());
        }
    }
}

