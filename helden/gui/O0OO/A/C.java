/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.A;

import helden.framework.C.public;
import helden.gui.O0OO.A.B;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends B {
    private ArrayList<public> o00000 = new ArrayList();
    private int \u00d200000 = 1;

    public void o00000(public public_) {
        if (!this.o00000.contains(public_)) {
            this.o00000.add(public_);
        }
    }

    public int \u00d300000() {
        return this.\u00d200000;
    }

    public ArrayList<public> \u00d400000() {
        return this.o00000;
    }

    public void new(public public_) {
        this.o00000.remove(public_);
    }

    public void o00000(int n) {
        this.\u00d200000 = n;
    }

    public String toString() {
        return "Vorteilsauswahl";
    }
}

