/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.G;
import helden.framework.E.OoOO.E;
import helden.framework.OOoO.S;
import helden.framework.OoOO.interface;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Setting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class K
implements G {
    private List<E> ObjectObject;
    private List<interface> \u00d3\u00d30000;
    private HashMap<b_0, Object> \u00d2\u00d30000 = new HashMap();
    private int \u00d8\u00d30000;
    private OOOo interfacenew;
    private Oo0O \u00d4\u00d30000;
    private S \u00f8\u00d30000 = new S(0, 6, 0);
    private String \u00f6\u00d30000;
    private String \u00f4\u00d30000;
    private _o \u00d6\u00d30000;

    public K() {
        this(_o.\u00d500000);
    }

    public K(_o _o2) {
        this.\u00d6\u00d30000 = _o2;
        this.\u00f6\u00d30000 = "";
        this.\u00f4\u00d30000 = "";
        this.\u00d6\u00d30000();
        this.\u00d5\u00d40000();
        this.\u00d8\u00d30000();
        this.ifObject();
    }

    public void o00000(E e) {
        this.ObjectObject.add(e);
    }

    public void o00000(P p2) {
        this.interfacenew.o00000(p2);
    }

    public void o00000(oo0o_0 oo0o_02, Number number) {
        this.\u00d3\u00d30000.add(new interface(oo0o_02, number.intValue()));
    }

    public void o00000(public public_) {
        this.\u00d4\u00d30000.\u00d300000(public_);
    }

    public void ifObject() {
        this.ObjectObject = new ArrayList<E>();
    }

    public void o\u00d40000() {
        this.\u00d2\u00d30000.clear();
    }

    public void \u00d5\u00d40000() {
        this.interfacenew = new OOOo();
    }

    public void \u00d6\u00d30000() {
        this.\u00d3\u00d30000 = new ArrayList<interface>();
    }

    public void \u00d8\u00d30000() {
        this.\u00d4\u00d30000 = new Oo0O();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        K k2 = new K(this.\u00d6\u00d30000);
        k2.\u00d2\u00d30000 = new HashMap<b_0, Object>(this.\u00d2\u00d30000);
        k2.\u00f6\u00d30000 = this.\u00d5\u00d30000();
        k2.\u00f4\u00d30000 = this.\u00d2\u00d40000();
        k2.\u00f8\u00d30000 = this.\u00f8\u00d30000.\u00d200000();
        k2.interfacenew = new OOOo();
        k2.interfacenew.o00000(this.interfacenew);
        k2.\u00d4\u00d30000 = new Oo0O(this.\u00d4\u00d30000);
        k2.\u00d8\u00d30000 = this.\u00d8\u00d30000;
        k2.ObjectObject = new ArrayList<E>(this.ObjectObject);
        k2.\u00d3\u00d30000 = new ArrayList<interface>(this.\u00d3\u00d30000);
        return k2;
    }

    public ArrayList<b_0> \u00d8\u00d40000() {
        ArrayList<b_0> arrayList = new ArrayList<b_0>(this.\u00d2\u00d30000.keySet());
        Collections.sort(arrayList);
        return arrayList;
    }

    public List<E> \u00d6\u00d40000() {
        return this.ObjectObject;
    }

    @Override
    public A \u00d800000() {
        return B.\u00d200000;
    }

    @Override
    public String \u00d600000() {
        return null;
    }

    public K whileObject() throws CloneNotSupportedException {
        return (K)this.clone();
    }

    public Number o00000(b_0 b_02) {
        return (Number)this.\u00d2\u00d30000.get(b_02);
    }

    public String \u00d2\u00d40000() {
        return this.\u00f4\u00d30000;
    }

    public String \u00d5\u00d30000() {
        return this.\u00f6\u00d30000;
    }

    public int \u00f5\u00d30000() {
        return this.\u00d8\u00d30000;
    }

    public S returnObject() {
        return this.\u00f8\u00d30000;
    }

    public Setting \u00f6\u00d30000() {
        return this.\u00d6\u00d30000.\u00d400000;
    }

    public OOOo \u00d3\u00d40000() {
        return this.interfacenew;
    }

    public List<interface> \u00f8\u00d30000() {
        return this.\u00d3\u00d30000;
    }

    public Oo0O \u00f5\u00d40000() {
        return this.\u00d4\u00d30000;
    }

    public _o newObject() {
        return this.\u00d6\u00d30000;
    }

    public void o00000(b_0 b_02, Object object) {
        this.\u00d2\u00d30000.put(b_02, object);
    }

    public void \u00d300000(String string) {
        this.\u00f4\u00d30000 = string;
    }

    public void \u00d200000(String string) {
        this.\u00f6\u00d30000 = string;
    }

    public void returnsuper(int n) {
        this.\u00d8\u00d30000 = n;
    }

    public void o00000(S s) {
        this.\u00f8\u00d30000 = s;
    }

    public void o00000(_o _o2) {
        this.\u00d6\u00d30000 = _o2;
    }

    public static enum _o {
        \u00d500000("Tier", Setting.\u00d600000),
        \u00d600000("Wesenheit (Aventurien)", Setting.\u00f800000),
        Object("Wesenheit (Myranor)", Setting.\u00f500000);

        private String o00000;
        private Setting \u00d400000;

        public static _o o00000(String string) {
            for (_o _o2 : _o.values()) {
                if (!_o2.toString().equals(string)) continue;
                return _o2;
            }
            return null;
        }

        private _o(String string2, Setting setting) {
            this.o00000 = string2;
            this.\u00d400000 = setting;
        }

        public Setting o00000() {
            return this.\u00d400000;
        }

        public String toString() {
            return this.o00000;
        }
    }
}

