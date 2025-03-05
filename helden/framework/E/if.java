/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E;

import helden.framework.E.B;
import helden.framework.E.C.E;
import helden.framework.E.F;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class if {
    private E o00000;
    private helden.framework.OoOO.E \u00d200000;

    public static ArrayList<if> super(F f2) {
        ArrayList<if> arrayList = new ArrayList<if>();
        for (int i2 = 0; i2 < f2.Object(B.class); ++i2) {
            E e = (E)f2.o00000(B.class, i2);
            for (helden.framework.OoOO.E e2 : e.\u00f5o0000()) {
                arrayList.add(new if(e, e2));
            }
        }
        return arrayList;
    }

    public if(E e, helden.framework.OoOO.E e2) {
        this.o00000 = e;
        this.\u00d200000 = e2;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    public E \u00d200000() {
        return this.o00000;
    }

    public helden.framework.OoOO.E super() {
        return this.\u00d200000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public void super(E e) {
        this.o00000 = e;
    }

    public void super(helden.framework.OoOO.E e) {
        this.\u00d200000 = e;
    }

    public String toString() {
        String string = this.super().toString();
        return string;
    }
}

