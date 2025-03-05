/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.H;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.HeldenMath;
import helden.framework.OooO.C;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.held.Object.private;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class void<T>
extends P {
    private String \u00d6\u00d3\u00f8000;
    protected Set<T> newinterfaceclass;
    protected Set<T> privateprivateclass;
    protected Map<T, Integer> \u00d5\u00d3\u00f8000;
    protected Map<T, Integer> \u00d8\u00d3\u00f8000;

    public void(String string, int n, Set<T> set, int n2) {
        super(string, n, n2);
        this.\u00d6\u00d3\u00f8000 = string;
        this.newinterfaceclass = set;
        this.privateprivateclass = new HashSet<T>();
        this.\u00d5\u00d3\u00f8000 = new HashMap<T, Integer>();
        this.\u00d8\u00d3\u00f8000 = new HashMap<T, Integer>();
        for (T t : this.newinterfaceclass) {
            this.\u00d5\u00d3\u00f8000.put(t, n);
            this.\u00d8\u00d3\u00f8000.put(t, new Integer(n));
        }
    }

    public void(String string, Set<T> set, HashMap<T, Integer> hashMap, int n) {
        this(string, 4711, set, n);
        this.\u00d8\u00d3\u00f8000 = hashMap;
        this.o00000();
    }

    public void \u00d400000(T t) {
        this.privateprivateclass.add(t);
        this.newinterfaceclass.add(t);
    }

    public void o00000(void<T> void_) {
        for (T t : void_.nullObject()) {
            this.\u00d400000(t);
            this.o00000(t, void_.return(t));
        }
    }

    public void new(T t, int n) {
        this.privateprivateclass.add(t);
        this.newinterfaceclass.add(t);
        this.\u00d8\u00d3\u00f8000.put(t, new Integer(n));
        this.\u00d5\u00d3\u00f8000.put(t, new Integer(n));
    }

    public void \u00d3\u00d40000() {
        this.privateprivateclass.clear();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        HashSet<T> hashSet = new HashSet<T>(this.newinterfaceclass);
        void<T> void_ = new void<T>(this.\u00f500000(), this.o\u00d20000(), hashSet, this.\u00d400000());
        this.o00000(this, void_);
        return void_;
    }

    public void return(String string) {
        for (T t : this.\u00f8\u00d30000()) {
            if (!string.equals(t.toString())) continue;
            this.\u00d500000(t);
        }
    }

    public boolean \u00d800000(String string) {
        boolean bl = false;
        for (Q<T> q : this.o\u00d40000()) {
            if (!q.toString().equals(string)) continue;
            bl = true;
        }
        return bl;
    }

    public List<Q<T>> o\u00d40000() {
        ArrayList<Q<T>> arrayList = new ArrayList<Q<T>>();
        for (T t : this.privateprivateclass) {
            arrayList.add(this.\u00d300000(t));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @Deprecated
    public List<Q<T>> StringObject() {
        return this.o00000((Settings)null);
    }

    public List<Q<T>> o00000(Settings settings) {
        ArrayList<Q<T>> arrayList = new ArrayList<Q<T>>();
        for (T t : this.newinterfaceclass) {
            Q<T> q = this.\u00d300000(t);
            if (settings != null && !settings.contains(q)) continue;
            arrayList.add(q);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public T \u00f400000(String string) {
        for (T t : this.\u00f8\u00d30000()) {
            if (!string.equals(t.toString())) continue;
            return t;
        }
        return null;
    }

    public int return(T t) {
        Integer n = this.\u00d5\u00d3\u00f8000.get(t);
        if (n == null) {
            return 0;
        }
        return n;
    }

    public Q<T> \u00d300000(T t) {
        Q<T> q = new Q<T>(this, t, this.return(t));
        q.o00000(this.\u00f500000(t));
        q.o00000(this.forsuper());
        return q;
    }

    public T \u00f4\u00d30000() {
        if (this.privateprivateclass.size() > 0) {
            return (T)this.privateprivateclass.toArray()[0];
        }
        return null;
    }

    public Set<T> nullObject() {
        return new HashSet<T>(this.privateprivateclass);
    }

    public List<T> \u00f5\u00d30000() {
        ArrayList<T> arrayList = new ArrayList<T>(this.privateprivateclass);
        C.o00000(arrayList);
        return arrayList;
    }

    public Map<T, Integer> O\u00d40000() {
        return this.\u00d5\u00d3\u00f8000;
    }

    public Set<T> \u00f8\u00d30000() {
        return this.newinterfaceclass;
    }

    @Override
    public String \u00f500000() {
        return this.\u00d6\u00d3\u00f8000;
    }

    public int \u00f400000(T t) {
        Integer n = this.\u00d8\u00d3\u00f8000.get(t);
        if (n == null) {
            return 0;
        }
        return n;
    }

    @Override
    public List<H> O\u00d20000() {
        ArrayList<H> arrayList = new ArrayList<H>();
        for (T t : this.nullObject()) {
            arrayList.addAll(this.\u00d800000(t));
        }
        return arrayList;
    }

    public List<H> \u00d800000(T t) {
        return new ArrayList<H>();
    }

    public void \u00d500000(T t) {
        this.privateprivateclass.remove(t);
    }

    @Override
    public void o00000() {
        super.o00000();
        this.\u00d5\u00d3\u00f8000.clear();
        for (Map.Entry<T, Integer> entry : this.\u00d8\u00d3\u00f8000.entrySet()) {
            this.\u00d5\u00d3\u00f8000.put(entry.getKey(), new Integer(entry.getValue()));
        }
    }

    public void o00000(T t, int n) {
        this.\u00d5\u00d3\u00f8000.put(t, n);
    }

    public void \u00d400000(int n) {
        this.new(n, "");
    }

    public void new(int n, String string) {
        for (T t : this.\u00f8\u00d30000()) {
            this.o00000(t, (int)new Integer(n));
        }
        this.new(n);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.\u00f500000());
        stringBuffer.append(" (");
        Iterator<T> iterator = this.\u00f5\u00d30000().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next().toString());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public void o00000(float f2, String string) {
        HashMap<T, Integer> hashMap = new HashMap<T, Integer>(this.O\u00d40000());
        for (Map.Entry entry : hashMap.entrySet()) {
            this.o00000(entry.getKey(), HeldenMath.runde((float)((Integer)entry.getValue()).intValue() * f2));
        }
    }

    public void \u00d500000(String string) {
        for (T t : this.\u00f8\u00d30000()) {
            if (!string.equals(t.toString())) continue;
            this.\u00d400000(t);
            return;
        }
        helden.framework.held.Object.private.\u00d200000("MehrfachAuswahlSonderfertigkeit: " + string + " bei " + this.toString() + " nicht gefunden.", "alle");
    }

    protected void o00000(void<T> void_, void<T> void_2) {
        HashMap<T, Integer> hashMap = new HashMap<T, Integer>(void_.\u00d5\u00d3\u00f8000);
        HashSet<T> hashSet = new HashSet<T>(void_.privateprivateclass);
        void_2.privateprivateclass = hashSet;
        void_2.\u00d5\u00d3\u00f8000 = hashMap;
        void_2.o00000(this.\u00f5o0000());
    }

    protected BedingungsVerknuepfung \u00f500000(T t) {
        return this.\u00f5o0000();
    }

    protected void o00000(Set<T> set) {
        this.privateprivateclass = set;
    }
}

