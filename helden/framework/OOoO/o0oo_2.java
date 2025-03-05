/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.held.L;
import helden.framework.held.object.oooo_0;
import helden.framework.oOoO.floatsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.r_0;
import helden.framework.oooo.string_1;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.o0OO
 */
public class o0oo_2
implements string_1<oo0o_0> {
    protected ArrayList<oo0o_0> \u00d200000;
    protected int[] Object;
    protected floatsuper o00000;
    private String \u00d400000;

    public o0oo_2(floatsuper floatsuper2, ArrayList<oo0o_0> arrayList, int[] nArray) {
        this(floatsuper2, arrayList, nArray, "");
    }

    public o0oo_2(floatsuper floatsuper2, ArrayList<oo0o_0> arrayList, int[] nArray, String string) {
        this.o00000 = floatsuper2;
        this.\u00d200000 = arrayList;
        this.Object = nArray;
        this.\u00d400000 = string;
        Iterator<oo0o_0> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) continue;
            oooo_0.\u00f500000("Nullwerte in der Auswahl: " + this.toString());
            iterator.remove();
        }
    }

    @Override
    public ArrayList<oo0o_0> o00000() {
        return this.\u00d200000;
    }

    public floatsuper \u00d400000() {
        return this.o00000;
    }

    public String new() {
        return this.\u00d400000;
    }

    public String \u00d300000() {
        return this.o00000.toString() + " " + this.\u00d200000.toString() + " " + Arrays.toString(this.Object);
    }

    public String toString() {
        return "AuswahlIterator: " + this.o00000 + "\n" + "Beschreibung: " + this.new() + "\n" + "Talente: " + this.\u00d200000.toString() + "\n" + "Werte: " + Arrays.toString(this.Object);
    }

    public int[] \u00d500000() {
        return this.Object;
    }

    public void o00000(int n, int n2, r_0 r_02, L l2) {
        this.o00000(n, n2, r_02, l2, false);
    }

    public void o00000(int n, int n2, r_0 r_02, L l2, boolean bl) {
        if (n >= this.\u00d200000.size()) {
            oooo_0.\u00f500000("Talentauswahl Index ung\u00fcltig Size: " + this.\u00d200000.size() + " Idx: " + n);
        }
        oo0o_0 oo0o_02 = this.\u00d200000.get(n);
        int n3 = this.Object[n2];
        if (!bl) {
            if (oo0o_02.istZauber()) {
                l2.super((KonkreterZauber)oo0o_02, (Integer)n3);
            } else {
                r_02.o00000(oo0o_02, n3);
            }
        }
        this.o00000.setTalentauswahl(oo0o_02, n3);
    }
}

