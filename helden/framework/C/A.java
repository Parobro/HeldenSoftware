/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.D.P;
import helden.framework.OOoO.R;
import helden.framework.OOoO.oO0O;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.oooo_0;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Vector;

public abstract class A
extends M<R> {
    private ArrayList[] \u00d5\u00d5\u00d2000;
    private int \u00d3\u00d5\u00d2000;
    private oooo_0 \u00d4\u00d5\u00d2000;

    public A(I i2, boolean bl, int n, ArrayList ... arrayListArray) {
        this(i2, bl, n, arrayListArray.length);
        for (int i3 = 0; i3 < this.\u00d3\u00d5\u00d2000; ++i3) {
            this.\u00d5\u00d5\u00d2000[i3] = arrayListArray[i3];
        }
        this.\u00f6\u00d20000();
    }

    public A(I i2, boolean bl, int n, int n2) {
        super(i2, bl, new TreeMap(), n);
        this.\u00d3\u00d5\u00d2000 = n2;
        this.\u00d5\u00d5\u00d2000 = new ArrayList[n2];
    }

    @Override
    public void voidnew() {
        StringBuffer stringBuffer = new StringBuffer(this.toString());
        stringBuffer.append(" ");
        if (this.intsuper().size() > 1) {
            stringBuffer.append("(");
        }
        Iterator iterator = this.intsuper().iterator();
        while (iterator.hasNext()) {
            Object t = iterator.next();
            stringBuffer.append(t.toString());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        if (this.intsuper().size() > 1) {
            stringBuffer.append(")");
        }
        this.privatefloatsuper = stringBuffer.toString();
    }

    @Override
    public abstract Object clone() throws CloneNotSupportedException;

    public A o00000(A a2) throws CloneNotSupportedException {
        a2.\u00d5\u00d5\u00d2000 = this.\u00d5\u00d5\u00d2000;
        for (R r : this.intsuper()) {
            a2.o00000((R)r.clone());
        }
        a2.\u00f5O0000().addAll(this.\u00f5O0000());
        a2.\u00f6\u00d20000();
        a2.voidnew();
        return a2;
    }

    public int O\u00d30000() {
        return this.\u00d3\u00d5\u00d2000;
    }

    public ArrayList o00000(int n, Settings settings, R r) {
        ArrayList arrayList = new ArrayList();
        for (Object e : this.\u00d5\u00d5\u00d2000[n]) {
            if (settings != null && !settings.containsAuswahl(this, e)) continue;
            arrayList.add(e);
        }
        return arrayList;
    }

    public ArrayList o00000(int n, Settings settings) {
        return this.o00000(n, settings, null);
    }

    @Override
    public abstract int \u00d200000(R var1);

    public ArrayList[] floatnew() {
        return this.\u00d5\u00d5\u00d2000;
    }

    public ArrayList<I> Object(R r) {
        return new ArrayList<I>();
    }

    @Override
    public int supersuper() {
        int n = 1000;
        return n;
    }

    public Vector<KostenArt> o00000(floatsuper floatsuper2, Object object) {
        return new Vector<KostenArt>();
    }

    public ArrayList<oO0O<P, AbstraktBedingung, Integer>> o00000(R r, floatsuper floatsuper2) {
        return new ArrayList<oO0O<P, AbstraktBedingung, Integer>>();
    }

    public R o00000(String[] stringArray) {
        R r = new R(this.O\u00d30000());
        for (int i2 = 0; i2 < this.O\u00d30000(); ++i2) {
            if (this.\u00d5\u00d5\u00d2000[i2].size() == 0) {
                r.\u00d200000(i2, stringArray[i2]);
                continue;
            }
            Object var4_4 = null;
            for (Object e : this.\u00d5\u00d5\u00d2000[i2]) {
                if (!e.toString().equals(stringArray[i2])) continue;
                var4_4 = e;
                break;
            }
            r.\u00d200000(i2, var4_4);
        }
        return r;
    }

    @Override
    public String oO0000() {
        return this.privatefloatsuper;
    }

    @Override
    public void o00000(R r) {
        r.o00000(this.\u00d4\u00d5\u00d2000);
        super.o00000(r);
    }

    protected void \u00f6\u00d20000() {
        R r = new R(this.\u00d3\u00d5\u00d2000);
        for (int i2 = 0; i2 < this.\u00d3\u00d5\u00d2000; ++i2) {
            if (this.\u00d5\u00d5\u00d2000[i2].size() == 0) {
                r.\u00d200000(i2, "");
                continue;
            }
            r.\u00d200000(i2, this.\u00d5\u00d5\u00d2000[i2].get(0));
        }
        this.\u00d6o0000();
        this.o00000(r, this.\u00d200000(r));
    }

    @Override
    protected void o00000(oooo_0 oooo_02) {
        this.\u00d4\u00d5\u00d2000 = oooo_02;
    }
}

