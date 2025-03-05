/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.C.O0OO;
import helden.framework.E.G;
import helden.framework.E.o0OO;
import helden.framework.oooo.oooo_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class F
implements Comparable<Object>,
Cloneable {
    private String o00000;
    private A \u00d600000;
    private float \u00d500000;
    private int \u00f600000;
    private int \u00f400000;
    private oooo_1 \u00f500000;
    private HashMap<A, ArrayList<G>> \u00d200000;
    private ArrayList<o0OO> Object;
    private String \u00d400000;
    private boolean void = false;

    public F(String string, A a2, float f2, int n, int n2, oooo_1 oooo_12, G ... gArray) {
        this.\u00d600000 = a2;
        this.o00000 = string;
        this.\u00d400000 = string;
        this.\u00d500000 = f2;
        this.\u00f600000 = n;
        this.\u00f400000 = n2;
        this.\u00f500000 = oooo_12;
        this.Object = new ArrayList();
        this.\u00d200000 = new HashMap();
        for (G g2 : gArray) {
            this.o00000(g2);
        }
    }

    public void \u00d200000(o0OO o0OO2) {
        this.Object.add(o0OO2);
    }

    public int Object(A a2) {
        if (this.\u00d200000.get((Object)a2) == null) {
            return 0;
        }
        return this.\u00d200000.get((Object)a2).size();
    }

    public Object clone() throws CloneNotSupportedException {
        F f2 = new F(this.o00000, this.\u00d600000, this.\u00d500000, this.\u00f600000, this.\u00f400000, this.\u00f500000.o00000(), new G[0]);
        Iterator<o0OO> iterator = this.\u00d2O0000().iterator();
        while (iterator.hasNext()) {
            f2.\u00d200000(iterator.next());
        }
        for (A a2 : this.\u00d500000()) {
            for (int i2 = 0; i2 < this.Object(a2); ++i2) {
                f2.o00000((G)this.o00000(a2, i2).clone());
            }
        }
        f2.o00000(this.\u00d400000);
        return f2;
    }

    @Override
    public int compareTo(Object object) {
        F f2 = (F)object;
        return this.toString().compareTo(f2.toString());
    }

    public boolean \u00d200000(int n) {
        return this.\u00d200000.containsKey(new Integer(n));
    }

    public boolean \u00d200000() {
        for (ArrayList<G> arrayList : this.\u00d200000.values()) {
            for (G g2 : arrayList) {
                if (!(g2 instanceof O0OO)) continue;
                return true;
            }
        }
        return false;
    }

    public int \u00f500000() {
        return this.\u00f400000;
    }

    public A \u00d400000() {
        return B.\u00d800000;
    }

    @Deprecated
    public G o00000(A a2) {
        return this.o00000(a2, 0);
    }

    public G o00000(A a2, int n) {
        if (this.\u00d200000.get((Object)a2) != null) {
            return this.\u00d200000.get((Object)a2).get(n);
        }
        return null;
    }

    public Vector<A> \u00d500000() {
        Vector<A> vector = new Vector<A>(this.\u00d200000.keySet());
        Collections.sort(vector);
        return vector;
    }

    public ArrayList<G> \u00d400000(A a2) {
        ArrayList<G> arrayList = this.\u00d200000.get((Object)a2);
        if (arrayList == null) {
            return new ArrayList<G>();
        }
        return arrayList;
    }

    public ArrayList<o0OO> \u00d2O0000() {
        return this.Object;
    }

    public F \u00f400000() throws CloneNotSupportedException {
        return (F)this.clone();
    }

    public A float() {
        return this.\u00d600000;
    }

    public float Object() {
        return this.\u00d500000;
    }

    public String OO0000() {
        return this.\u00d400000;
    }

    public int oO0000() {
        return this.\u00f600000;
    }

    public oooo_1 o00000() {
        return this.\u00f500000;
    }

    public String \u00f600000() {
        return this.o00000;
    }

    public String void() {
        StringBuffer stringBuffer = new StringBuffer();
        for (ArrayList<G> arrayList : this.\u00d200000.values()) {
            for (G g2 : arrayList) {
                if (g2.\u00d600000() == null) continue;
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(";");
                }
                stringBuffer.append(g2.\u00d600000());
            }
        }
        if (stringBuffer.length() == 0) {
            return this.\u00d400000;
        }
        return this.\u00d400000 + " (" + stringBuffer.toString() + ")";
    }

    public boolean public() {
        return this.void;
    }

    public boolean \u00d200000(A a2) {
        return this.\u00d600000.equals((Object)a2);
    }

    public void \u00d600000() {
        this.\u00d200000 = new HashMap();
    }

    public void o00000(o0OO o0OO2) {
        if (this.Object.contains(o0OO2)) {
            this.Object.remove(o0OO2);
        }
    }

    public void \u00d400000(int n) {
        this.\u00d200000.remove(new Integer(n));
    }

    public void Object(int n) {
        this.\u00f400000 = n;
    }

    public void o00000(G g2) {
        ArrayList<G> arrayList = this.\u00d200000.get((Object)g2.\u00d800000());
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.\u00d200000.put(g2.\u00d800000(), arrayList);
        }
        arrayList.add(g2);
    }

    public void o00000(boolean bl) {
        this.void = bl;
    }

    public void o00000(float f2) {
        this.\u00d500000 = f2;
    }

    public void \u00d200000(String string) {
        this.\u00f500000.o00000(string);
    }

    public void o00000(String string) {
        this.\u00d400000 = string;
    }

    public void \u00d500000(int n) {
        this.\u00f600000 = n;
    }

    public void o00000(int n) {
        this.\u00f500000.o00000(n);
    }

    public String toString() {
        return this.o00000;
    }

    public void o00000(F f2) {
        this.\u00d600000();
        Iterator<A> iterator = f2.\u00d500000().iterator();
        while (iterator.hasNext()) {
            try {
                A a2 = iterator.next();
                for (int i2 = 0; i2 < f2.Object(a2); ++i2) {
                    this.o00000((G)f2.o00000(a2, i2).clone());
                }
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
            }
        }
        this.o00000(f2.OO0000());
        this.o00000(f2.Object());
        this.\u00d500000(f2.oO0000());
        this.Object(f2.\u00f500000());
    }
}

