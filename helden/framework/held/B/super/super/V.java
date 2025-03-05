/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.C.public;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import java.util.ArrayList;

public class V
extends oooo_0 {
    public static final int \u00d5\u00f40000 = 0;
    public static final int Objectreturn = 1;
    private final ArrayList<public> \u00d2\u00f40000;
    private final ArrayList<public> \u00d4\u00f40000;

    public V(K k2, ArrayList<public> arrayList, ArrayList<public> arrayList2) {
        super(k2, new String[]{"Vorteile", "Nachteile"});
        this.\u00d2\u00f40000 = arrayList;
        this.\u00d4\u00f40000 = arrayList2;
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n2) {
            case 0: {
                if (n < this.\u00d2\u00f40000.size()) {
                    string = this.\u00d2\u00d20000(n).oO0000();
                    break;
                }
                string = "";
                break;
            }
            case 1: {
                if (n < this.\u00d4\u00f40000.size()) {
                    string = this.Objectnew(n).oO0000();
                    break;
                }
                string = "";
                break;
            }
            default: {
                string = "Fehler! zeilenIndex " + n + " spaltenIndex " + n2;
            }
        }
        return string;
    }

    @Override
    public int o00000() {
        return Math.max(this.\u00d2\u00f40000.size(), this.\u00d4\u00f40000.size());
    }

    private public Objectnew(int n) {
        return this.\u00d4\u00f40000.get(n);
    }

    private public \u00d2\u00d20000(int n) {
        return this.\u00d2\u00f40000.get(n);
    }
}

