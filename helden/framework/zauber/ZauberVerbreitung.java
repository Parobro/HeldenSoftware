/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.OOoO.K;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ZauberVerbreitung {
    private K new;
    private K o00000;
    private Integer \u00d300000;

    public ZauberVerbreitung(K k2, K k3, Integer n) {
        this.new = k2;
        this.o00000 = k3;
        this.\u00d300000 = n;
    }

    public Integer getVerbreitung() {
        return this.\u00d300000;
    }

    public K getWelcheRep() {
        return this.o00000;
    }

    public K getWo() {
        return this.new;
    }

    public String toString() {
        if (this.o00000 == null || this.o00000.equals(this.new)) {
            return this.new + " " + this.\u00d300000;
        }
        return this.new + " (" + this.o00000 + ") " + this.\u00d300000;
    }
}

