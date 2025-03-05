/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.A;

import helden.framework.D.P;
import helden.gui.O0OO.A.B;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class class
extends B {
    private ArrayList<P> \u00d600000 = new ArrayList();
    private int null = 3;
    private boolean \u00d800000 = false;

    public void o00000(P p2) {
        if (!this.\u00d600000.contains(p2)) {
            this.\u00d600000.add(p2);
        }
    }

    public int \u00d800000() {
        return this.null;
    }

    public ArrayList<P> \u00f500000() {
        return this.\u00d600000;
    }

    public boolean \u00f400000() {
        return this.\u00d800000;
    }

    public void new(P p2) {
        this.\u00d600000.remove(p2);
    }

    public void \u00d300000(int n) {
        this.null = n;
    }

    public void o00000(boolean bl) {
        this.\u00d800000 = bl;
    }

    public String toString() {
        return "Sonderfertigkeitsauswahl";
    }
}

