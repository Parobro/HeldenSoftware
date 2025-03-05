/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.C.OO0O;
import helden.framework.E.G;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class Object
extends OO0O
implements G {
    private ArrayList<String> voidsuper;

    public Object(int n, int n2, String string, ArrayList<Zauber> arrayList, ArrayList<String> arrayList2) {
        super(n, n2, string, arrayList);
        this.voidsuper = arrayList2;
    }

    @Override
    public java.lang.Object clone() throws CloneNotSupportedException {
        return new Object(this.oo0000(), this.returnsuper(), this.\u00d600000(), this.\u00d2o0000(), (ArrayList)this.voidsuper.clone());
    }

    @Override
    public A \u00d800000() {
        return B.\u00f400000;
    }

    public ArrayList<String> \u00d3o0000() {
        return this.voidsuper;
    }

    public void o00000(ArrayList<String> arrayList) {
        this.voidsuper = arrayList;
    }

    protected Object ifsuper() throws CloneNotSupportedException {
        return (Object)this.clone();
    }
}

