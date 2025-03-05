/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.A;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.O0OO.A.B;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oOOO
extends B {
    private ArrayList<oo0o_0> \u00f500000 = new ArrayList();
    private ArrayList<Integer> \u00f600000 = new ArrayList();

    public void o00000(oo0o_0 oo0o_02) {
        if (!this.\u00f500000.contains(oo0o_02)) {
            this.\u00f500000.add(oo0o_02);
        }
    }

    public void \u00d500000(int n) {
        this.\u00f600000.add(new Integer(n));
        Collections.sort(this.\u00f600000);
    }

    public ArrayList<oo0o_0> \u00f800000() {
        return this.\u00f500000;
    }

    public ArrayList<Integer> OO0000() {
        return this.\u00f600000;
    }

    public int[] if() {
        int[] nArray = new int[this.OO0000().size()];
        for (int i2 = 0; i2 < this.OO0000().size(); ++i2) {
            nArray[i2] = this.OO0000().get(i2);
        }
        return nArray;
    }

    @Override
    public boolean o00000() {
        return this.\u00f600000.size() != 0 && this.\u00f500000.size() != 0 && this.\u00f600000.size() <= this.\u00f500000.size();
    }

    public void o00000(voidsuper voidsuper2) {
        this.\u00f500000.remove(voidsuper2);
    }

    public void \u00d400000(int n) {
        this.\u00f600000.remove(new Integer(n));
        Collections.sort(this.\u00f600000);
    }

    public String toString() {
        return "Talentauswahl";
    }
}

