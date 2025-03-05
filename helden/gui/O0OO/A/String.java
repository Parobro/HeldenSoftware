/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.A;

import helden.gui.O0OO.A.B;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class String
extends B {
    private int String = 5;
    private ArrayList<ArrayList<Object>> \u00d300000 = new ArrayList();
    private int \u00d500000 = 1;

    public void o00000(Object object, int n) {
        if (n == -1 || n >= this.\u00d300000.size()) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            arrayList.add(object);
            this.\u00d300000.add(arrayList);
        } else {
            ArrayList<Object> arrayList = this.\u00d300000.get(n);
            if (arrayList.size() <= this.String) {
                arrayList.add(object);
            }
        }
    }

    public Object o00000(int n, int n2) {
        if (n >= this.\u00d300000.size()) {
            return null;
        }
        ArrayList<Object> arrayList = this.\u00d300000.get(n);
        if (n2 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(n2);
    }

    public int \u00d500000() {
        return this.\u00d500000;
    }

    public ArrayList<ArrayList<Object>> return() {
        return this.\u00d300000;
    }

    @Override
    public boolean o00000() {
        return this.\u00d300000.size() != 0 && this.\u00d500000 != 0 && this.\u00d500000 <= this.\u00d300000.size();
    }

    public void o00000(Integer n, Integer n2) {
        if (n2 >= this.\u00d300000.size()) {
            return;
        }
        ArrayList<Object> arrayList = this.\u00d300000.get(n2);
        if (n >= arrayList.size()) {
            return;
        }
        arrayList.remove(n);
        if (arrayList.size() == 0) {
            this.\u00d300000.remove(arrayList);
        }
    }

    public void new(int n) {
        this.\u00d500000 = n;
    }

    public java.lang.String toString() {
        return "Flex-Auswahl";
    }
}

