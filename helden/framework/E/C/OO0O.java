/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.zauber.Zauber;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OO0O {
    private int Objectsuper;
    private int \u00f8O0000;
    private ArrayList<Zauber> \u00f6O0000;
    private String Oo0000;

    public OO0O(int n, int n2, String string, ArrayList<Zauber> arrayList) {
        this.Objectsuper = n;
        this.\u00f8O0000 = n2;
        this.Oo0000 = string;
        this.\u00f6O0000 = arrayList;
    }

    public int oo0000() {
        return this.Objectsuper;
    }

    public String \u00d600000() {
        return this.Oo0000;
    }

    public int returnsuper() {
        return this.\u00f8O0000;
    }

    public ArrayList<Zauber> \u00d2o0000() {
        return this.\u00f6O0000;
    }

    public void private(int n) {
        this.Objectsuper = n;
    }

    public void o00000(String string) {
        this.Oo0000 = string;
    }

    public void \u00d3O0000(int n) {
        this.\u00f8O0000 = n;
    }

    public void o00000(Zauber zauber) {
        this.\u00f6O0000.add(zauber);
    }

    protected Object clone() throws CloneNotSupportedException {
        return new OO0O(this.Objectsuper, this.\u00f8O0000, this.Oo0000, (ArrayList)this.\u00f6O0000.clone());
    }
}

