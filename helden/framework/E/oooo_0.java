/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.e;

import helden.framework.E.B;
import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.OoOO.E;
import java.util.ArrayList;

/*
 * Renamed from helden.framework.E.oooO
 */
public class oooo_0 {
    private A o00000;
    private E \u00d200000;

    public static ArrayList<oooo_0> o00000(F f2) {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        for (int i2 = 0; i2 < f2.Object(B.\u00d400000); ++i2) {
            A a2 = (A)f2.o00000(B.\u00d400000, i2);
            for (E e : a2.\u00f6\u00d40000()) {
                arrayList.add(new oooo_0(a2, e));
            }
        }
        return arrayList;
    }

    public oooo_0(A a2, E e) {
        this.o00000 = a2;
        this.\u00d200000 = e;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    public A \u00d200000() {
        return this.o00000;
    }

    public E o00000() {
        return this.\u00d200000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public void o00000(A a2) {
        this.o00000 = a2;
    }

    public void o00000(E e) {
        this.\u00d200000 = e;
    }

    public String toString() {
        String string = this.o00000().toString();
        if (!this.o00000.thisString().equals("")) {
            string = string + " (" + this.o00000.thisString() + ")";
        }
        return string;
    }
}

