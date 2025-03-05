/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class void
extends public {
    private ArrayList<Object> \u00d3\u00d4\u00d2000 = new ArrayList();
    private ArrayList<String> nullfloatsuper;

    public void(I i2, int n) {
        super(i2, n, true, true);
        this.\u00d3\u00d4\u00d2000.add(b_0.\u00f4\u00f4\u00d2000);
        this.\u00d3\u00d4\u00d2000.add(b_0.privatedosuper);
        this.\u00d3\u00d4\u00d2000.add(b_0.returnwhilesuper);
        this.\u00d3\u00d4\u00d2000.add(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000);
        this.\u00d3\u00d4\u00d2000.add(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000);
        this.nullfloatsuper = new ArrayList();
    }

    public void \u00d400000(String string) {
        this.nullfloatsuper.add(string);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        void void_ = new void(this.\u00f4O0000(), this.supersuper());
        void_.nullfloatsuper.addAll(this.nullfloatsuper);
        return void_;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return object instanceof void;
    }

    public ArrayList<String> classsuper() {
        return this.nullfloatsuper;
    }

    public ArrayList<Object> Oo0000() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object : this.\u00d3\u00d4\u00d2000) {
            if (this.nullfloatsuper.contains(object.toString())) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    @Override
    public String oO0000() {
        String string = super.toString();
        if (this.nullfloatsuper.size() > 0) {
            string = string + " (normal: ";
            for (int i2 = 0; i2 < this.nullfloatsuper.size(); ++i2) {
                if (i2 > 0) {
                    string = string + ", ";
                }
                string = string + this.nullfloatsuper.get(i2);
            }
            string = string + ")";
        }
        return string;
    }

    public boolean \u00d200000(b_0 b_02) {
        return this.\u00d3\u00d4\u00d2000.contains(b_02) && !this.nullfloatsuper.contains(b_02.toString());
    }

    public boolean o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) {
        return this.\u00d3\u00d4\u00d2000.contains(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) && !this.nullfloatsuper.contains(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.toString());
    }
}

