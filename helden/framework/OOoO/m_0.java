/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.held.object.oooo_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.M
 */
public class m_0 {
    private ArrayList<oo0o_0> super;
    private int[] \u00d200000;
    private String \u00d300000;

    public m_0(ArrayList<oo0o_0> arrayList, int[] nArray) {
        this(arrayList, nArray, "");
    }

    public m_0(ArrayList<oo0o_0> arrayList, int[] nArray, String string) {
        if (arrayList.contains(null)) {
            oooo_0.\u00d300000("Null in Talentauswahlliste " + string);
            arrayList.remove(null);
        }
        this.super = arrayList;
        this.\u00d200000 = nArray;
        this.\u00d300000 = string;
    }

    public String o00000() {
        return this.\u00d300000;
    }

    public ArrayList<oo0o_0> new() {
        return this.super;
    }

    public int[] \u00d300000() {
        return this.\u00d200000;
    }
}

