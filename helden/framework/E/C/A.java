/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.B;
import helden.framework.E.C.null;
import helden.framework.E.G;
import helden.framework.E.OoOO.D;
import helden.framework.E.OoOO.F;
import helden.framework.E.OoOO.OoOO;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OoOO.E;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import java.util.ArrayList;
import java.util.Iterator;

public class A
extends null
implements G {
    private int \u00d3\u00d40000;
    private ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d2\u00d40000;
    private ArrayList<E> \u00d4\u00d40000;
    private boolean floatObject;
    private String O\u00d40000;
    private BedingungsVerknuepfung \u00d6\u00d40000;
    private boolean voidObject = false;

    public A(F f2, OoOO ooOO2, int n, E e, ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, D d2, int n2) {
        this(f2, ooOO2, n, e, arrayList, d2, n2, "", null);
    }

    public A(F f2, OoOO ooOO2, int n, E e, ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList, D d2, int n2, String string, BedingungsVerknuepfung bedingungsVerknuepfung) {
        super(f2, ooOO2.o00000(), ooOO2.new(), d2, n2);
        this.O\u00d40000 = string;
        this.\u00d3\u00d40000 = n;
        this.floatObject = false;
        this.\u00d4\u00d40000 = new ArrayList();
        this.\u00d4\u00d40000.add(e);
        this.\u00d2\u00d40000 = arrayList;
        this.\u00d6\u00d40000 = bedingungsVerknuepfung;
    }

    public void \u00d300000(E e) {
        this.\u00d4\u00d40000.add(e);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        A a2 = new A(this.o\u00d50000().\u00d500000(), new OoOO(super.\u00d200000().new(), super.String().\u00d300000()), this.\u00d3\u00d40000, this.\u00d4\u00d40000.get(0), (ArrayList)this.\u00d8\u00d50000().clone(), this.o00000().new(), this.\u00d300000(), this.thisString(), this.nullString());
        a2.\u00f6\u00d40000().addAll(this.\u00d4\u00d40000);
        a2.\u00d500000(this.\u00d2\u00d50000());
        Iterator<E> iterator = this.\u00f6\u00d40000().iterator();
        iterator.next();
        a2.String(this.StringString());
        while (iterator.hasNext()) {
            a2.\u00d300000(iterator.next());
        }
        return a2;
    }

    @Override
    public helden.framework.E.A \u00d800000() {
        return B.\u00d400000;
    }

    public BedingungsVerknuepfung nullString() {
        return this.\u00d6\u00d40000;
    }

    @Override
    public String \u00d600000() {
        return null;
    }

    public String thisString() {
        return this.O\u00d40000;
    }

    public A \u00d6\u00d50000() throws CloneNotSupportedException {
        return (A)this.clone();
    }

    public ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d8\u00d50000() {
        return this.\u00d2\u00d40000;
    }

    public helden.framework.E.OoOO.A \u00d3\u00d50000() {
        return super.\u00d200000();
    }

    public int \u00f8\u00d40000() {
        return this.\u00d3\u00d40000;
    }

    public ArrayList<E> \u00f6\u00d40000() {
        return this.\u00d4\u00d40000;
    }

    public F o\u00d50000() {
        return super.\u00d500000();
    }

    public helden.framework.E.OoOO.null \u00d5\u00d50000() {
        return super.String();
    }

    public boolean \u00d2\u00d50000() {
        return this.voidObject;
    }

    public boolean StringString() {
        return this.floatObject;
    }

    public void \u00d200000(E e) {
        this.\u00d4\u00d40000.remove(e);
    }

    public void \u00d200000(ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        this.\u00d2\u00d40000 = arrayList;
    }

    public void \u00d500000(boolean bl) {
        this.voidObject = bl;
    }

    public void oo0000(int n) {
        this.\u00d3\u00d40000 = n;
    }

    public void String(boolean bl) {
        this.floatObject = bl;
    }
}

