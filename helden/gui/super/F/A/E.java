/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.oooo_2;
import helden.gui.super.F.A.G;
import helden.gui.super.F.A.super;
import helden.gui.super.F.A.super._;
import helden.gui.super.F.A.super.voidsuper;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class E
extends super {
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d300000;
    private HashMap<oooo_2, Integer> String;

    public E(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, HashMap<oooo_2, Integer> hashMap) {
        super(null);
        this.String = hashMap;
        this.o00000 = new _(arrayList, this.String);
        this.\u00d300000 = arrayList;
    }

    @Override
    public Object getChild(Object object, int n) {
        return this.o00000(object).get(n);
    }

    @Override
    public int getChildCount(Object object) {
        ArrayList<voidsuper> arrayList = this.o00000(object);
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public Class o00000(int n) {
        if (n == 0) {
            return G.class;
        }
        return String.class;
    }

    @Override
    public int o00000() {
        return this.\u00d300000.size() + 1;
    }

    @Override
    public String new(int n) {
        if (n == 0) {
            return "Bezeichner";
        }
        if (this.\u00d300000.size() + 1 > n) {
            return this.\u00d300000.get(n - 1).toString();
        }
        return "Held " + n;
    }

    @Override
    public Object o00000(Object object, int n) {
        voidsuper voidsuper2 = (voidsuper)object;
        return voidsuper2.super(n);
    }

    @Override
    public boolean isLeaf(Object object) {
        return ((voidsuper)object).super().size() < 1;
    }

    public void o00000(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        this.\u00d300000 = arrayList;
        this.o00000 = new _(arrayList, this.String);
        this.new(this, new Object[]{this.o00000}, new int[0], new Object[0]);
    }

    protected ArrayList<voidsuper> o00000(Object object) {
        voidsuper voidsuper2 = (voidsuper)object;
        return voidsuper2.super();
    }
}

