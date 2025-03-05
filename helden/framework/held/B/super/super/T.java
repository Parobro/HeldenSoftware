/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.E.F;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import java.util.ArrayList;
import java.util.Iterator;

public class T
extends oooo_0 {
    private ArrayList<F> o\u00f40000 = new ArrayList();

    public T(K k2) {
        super(k2, new String[]{"Gegenstand", "Anzahl", "Gewicht", "Gegenstand", "Anzahl", "Gewicht"});
        Iterator<F> iterator = k2.\u00d8o0000().\u00d400000().iterator();
        while (iterator.hasNext()) {
            this.o\u00f40000.add(iterator.next());
        }
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        if (n == this.o00000() - 1 && n2 >= 3 && this.o\u00f40000.size() % 2 == 1) {
            return "";
        }
        switch (n2) {
            case 0: {
                string = this.o\u00f40000.get(n).OO0000();
                break;
            }
            case 1: {
                string = new Integer(this.o\u00f40000.get(n).\u00f500000()).toString();
                break;
            }
            case 2: {
                string = new Float(this.o\u00f40000.get(n).Object()).toString();
                break;
            }
            case 3: {
                string = this.o\u00f40000.get(n + this.o00000()).OO0000();
                break;
            }
            case 4: {
                string = new Integer(this.o\u00f40000.get(n + this.o00000()).\u00f500000()).toString();
                break;
            }
            case 5: {
                string = new Float(this.o\u00f40000.get(n + this.o00000()).Object()).toString();
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
        return Math.round((float)this.o\u00f40000.size() / 2.0f);
    }
}

