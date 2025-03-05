/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.E.A;
import helden.framework.E.C.O0OO;
import helden.framework.E.F;
import helden.framework.E.G;
import helden.framework.held.while;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O {
    private HashMap<String, F[]> o00000 = new HashMap();
    private int \u00d300000 = 20;
    private while \u00d200000;

    public O(while while_) {
        this.\u00d200000 = while_;
    }

    public void new(F f2, int n) {
        this.\u00d300000(f2);
        if (this.o00000.containsKey(f2.toString())) {
            F[] fArray = this.o00000.get(f2.toString());
            if (fArray[n] != null) {
                fArray[n].Object(f2.\u00f500000());
            } else {
                fArray[n] = f2;
            }
        } else {
            F[] fArray = new F[this.\u00d300000];
            fArray[n] = f2;
            this.o00000.put(f2.toString(), fArray);
        }
        this.\u00d200000.\u00d300000();
    }

    public boolean new(F f2) {
        F f3;
        try {
            f3 = f2.\u00f400000();
            this.\u00d300000(f3);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return false;
        }
        F[] fArray = this.\u00d300000(f2.toString());
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            if (fArray[i2] != null) continue;
            fArray[i2] = f3;
            this.\u00d200000.\u00d300000();
            return true;
        }
        return false;
    }

    public boolean new(String string) {
        return this.o00000.containsKey(string);
    }

    public void o00000(String string) {
        this.\u00d200000.\u00d300000();
        this.o00000.remove(string);
    }

    public void o00000() {
        Iterator<String> iterator = this.o00000.keySet().iterator();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (iterator.hasNext()) {
            String string = iterator.next();
            F[] fArray = this.o00000.get(string);
            boolean bl = true;
            for (F f2 : fArray) {
                if (f2 == null) continue;
                bl = false;
            }
            if (!bl) continue;
            arrayList.add(string);
        }
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            this.\u00d200000.\u00d300000();
            this.o00000(iterator.next());
        }
    }

    public F[] \u00d300000(String string) {
        F[] fArray = this.o00000.get(string);
        if (fArray == null) {
            fArray = new F[this.\u00d300000()];
            this.o00000.put(string, fArray);
        }
        return fArray;
    }

    public Collection<F[]> new() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(this.o00000.keySet());
        Collections.sort(arrayList);
        Iterator iterator = arrayList.iterator();
        ArrayList<F[]> arrayList2 = new ArrayList<F[]>();
        while (iterator.hasNext()) {
            arrayList2.add(this.o00000.get(iterator.next()));
        }
        return arrayList2;
    }

    public ArrayList<F> o00000(A a2) {
        Iterator<F[]> iterator = this.new().iterator();
        ArrayList<F> arrayList = new ArrayList<F>();
        while (iterator.hasNext()) {
            F[] fArray;
            for (F f2 : fArray = iterator.next()) {
                if (f2 == null || f2.\u00d400000() != a2 && !f2.\u00d200000(a2) && f2.o00000(a2, 0) == null) continue;
                arrayList.add(f2);
            }
        }
        return arrayList;
    }

    public int \u00d300000() {
        return this.\u00d300000;
    }

    public ArrayList<F> \u00d400000() {
        ArrayList<F> arrayList = new ArrayList<F>();
        for (F[] fArray : this.new()) {
            for (F f2 : fArray) {
                if (f2 == null) continue;
                arrayList.add(f2);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean o00000(F f2) {
        F[] fArray = this.\u00d300000(f2.toString());
        boolean bl = false;
        for (F f3 : fArray) {
            if (f3 != null) continue;
            bl = true;
        }
        return bl;
    }

    public void o00000(F f2, int n) {
        if (this.o00000.containsKey(f2.toString())) {
            this.\u00d200000.\u00d300000();
            F[] fArray = this.o00000.get(f2.toString());
            if (fArray[n] != null) {
                fArray[n].Object(f2.\u00f500000() + fArray[n].\u00f500000());
                if (fArray[n].\u00f500000() <= 0) {
                    fArray[n] = null;
                }
            }
            boolean bl = true;
            for (F f3 : fArray) {
                if (f3 == null) continue;
                bl = false;
            }
            if (bl) {
                this.o00000(f2.toString());
            }
        }
    }

    public void o00000(F f2, int n, int n2) {
        if (this.o00000.containsKey(f2.toString())) {
            this.\u00d200000.\u00d300000();
            F[] fArray = this.o00000.get(f2.toString());
            if (fArray[n2] != null) {
                fArray[n2].Object(fArray[n2].\u00f500000() - n);
                if (fArray[n2].\u00f500000() <= 0) {
                    fArray[n2] = null;
                }
            }
        }
    }

    private void \u00d300000(F f2) {
        if (!f2.\u00d200000()) {
            return;
        }
        boolean bl = false;
        for (A fArray : f2.\u00d500000()) {
            G g2 = f2.o00000(fArray, 0);
            if (!(g2 instanceof O0OO) || ((O0OO)((Object)g2)).\u00f6\u00d20000() != null) continue;
            bl = true;
        }
        if (!bl) {
            return;
        }
        int n = 0;
        for (Cloneable cloneable : this.\u00d300000(f2.\u00f600000())) {
            if (cloneable == null) continue;
            for (A a2 : cloneable.\u00d500000()) {
                G g3 = cloneable.o00000(a2, 0);
                if (!(g3 instanceof O0OO)) continue;
                Integer n2 = ((O0OO)((Object)g3)).\u00f6\u00d20000();
                if (n2 == null) {
                    throw new RuntimeException("Rune hat keine ID. Bitte den Entwicklern melden!");
                }
                n = Math.max(n, n2);
            }
        }
        int n3 = n + 1;
        for (A a3 : f2.\u00d500000()) {
            Cloneable cloneable;
            cloneable = f2.o00000(a3, 0);
            if (!(cloneable instanceof O0OO)) continue;
            ((O0OO)((Object)cloneable)).o00000(n3);
        }
    }
}

