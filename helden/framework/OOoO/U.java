/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OoOO;

import helden.framework.OoOO.M;
import helden.framework.held.Object.public;
import helden.framework.oooo.oooo_1;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import java.util.ArrayList;

public abstract class U
implements Comparable<Object>,
M {
    private String \u00d5\u00d8\u00d2000;
    private oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 \u00d8\u00d8\u00d2000;
    private ArrayList<oooo_1> fordosuper;

    protected U(String string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) {
        this.\u00d5\u00d8\u00d2000 = string;
        this.\u00d8\u00d8\u00d2000 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12;
    }

    public void addQuelle(oooo_1 oooo_12) {
        if (this.fordosuper == null) {
            this.fordosuper = new ArrayList();
        }
        this.fordosuper.add(oooo_12);
    }

    @Override
    public int compareTo(Object object) {
        U u2 = (U)object;
        int n = this.getArt().compareTo(u2.getArt());
        if (n != 0) {
            return n;
        }
        return public.o00000().compare(this.toString(), u2.toString());
    }

    public oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 getArt() {
        return this.\u00d8\u00d8\u00d2000;
    }

    public s_0 getErschaffenKategorie() {
        return this.getKategorie(true);
    }

    public s_0 getKategorie(boolean bl) {
        if (bl) {
            return this.getArt().new();
        }
        return this.getArt().o00000();
    }

    public ArrayList<oooo_1> getQuellen() {
        return this.fordosuper;
    }

    public s_0 getSteigernKategorie() {
        return this.getKategorie(false);
    }

    public String toString() {
        return this.\u00d5\u00d8\u00d2000;
    }
}

