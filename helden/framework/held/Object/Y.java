/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Y {
    private boolean super;
    private String \u00d200000;
    private ArrayList<Y> \u00d300000;

    public Y(String string, boolean bl) {
        this.super = bl;
        this.\u00d200000 = string;
        this.\u00d300000 = new ArrayList();
    }

    public void o00000(Y y2) {
        if (y2 != null) {
            this.\u00d300000.add(y2);
        }
    }

    public ArrayList<Y> o00000() {
        return this.\u00d300000;
    }

    public String new() {
        return this.\u00d200000;
    }

    public boolean \u00d300000() {
        return this.super;
    }

    public void o00000(String string) {
        this.\u00d200000 = string;
    }
}

