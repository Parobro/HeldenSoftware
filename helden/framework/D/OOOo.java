/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.H;
import helden.framework.D.J;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.X;
import helden.framework.d.oooo_0;
import helden.framework.d.oooo_1;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.werkzeug.HEW2SF;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OOOo
implements Iterable<P> {
    private Map<String, P> String = new HashMap<String, P>();
    private ArrayList<P> o00000 = new ArrayList();
    private ArrayList<P> \u00d200000;
    private KategorienArrayList<P> \u00d500000;
    private ArrayList<P> \u00d300000;

    public <T> void o00000(P p2) {
        this.\u00d200000 = null;
        this.\u00d500000 = null;
        this.\u00d300000 = null;
        if (p2 instanceof Q) {
            void void_;
            Q q = (Q)p2;
            void void_2 = q.\u00d4\u00d30000();
            if (!this.\u00d200000(void_2.\u00f500000())) {
                void_ = (void)oooo_0.o00000(void_2.\u00f500000());
                void_.\u00d3\u00d40000();
                this.o00000(void_);
            }
            void_ = (void)this.o00000(void_2.\u00f500000());
            void_.\u00d400000(q.\u00d8\u00d30000());
            void_.o00000(q.\u00d8\u00d30000(), q.o\u00d20000());
        } else if (p2 instanceof void) {
            if (this.String.containsKey(p2.\u00f500000())) {
                void void_ = (void)this.String.get(p2.\u00f500000());
                void void_3 = (void)p2;
                void_.o00000(void_3);
            } else {
                this.String.put(p2.\u00f500000(), p2);
                this.o00000.add(p2);
            }
        } else {
            this.String.put(p2.toString(), p2);
            this.o00000.add(p2);
        }
    }

    public void o00000(Collection<P> collection) {
        for (P p2 : collection) {
            this.o00000(p2);
        }
    }

    public void o00000(OOOo oOOo) {
        for (P p2 : oOOo.\u00f600000()) {
            this.String.put(p2.toString(), p2);
            this.o00000.add(p2);
            this.\u00d200000 = null;
            this.\u00d500000 = null;
        }
    }

    public boolean \u00d200000(String string) {
        if (this.String.containsKey(string)) {
            return true;
        }
        for (P p2 : this) {
            if (!(p2 instanceof void)) continue;
            void void_ = (void)p2;
            if (void_.toString().equals(string)) {
                return true;
            }
            for (Q q : void_.o\u00d40000()) {
                if (!q.toString().equals(string)) continue;
                return true;
            }
        }
        return false;
    }

    public void \u00d200000() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object : this) {
            if (!((P)object).\u00d4o0000()) continue;
            arrayList.add(object);
        }
        for (P p2 : arrayList) {
            this.\u00d300000(p2.toString());
        }
    }

    public P o00000(String string) {
        P p2 = this.String.get(string);
        if (p2 == null) {
            for (Q<?> q : this.\u00d6O0000()) {
                if (!q.toString().equals(string)) continue;
                return q;
            }
            throw new X("Sonderfertigkeit " + string + " gibt es nicht.");
        }
        return p2;
    }

    public Collection<P> \u00f600000() {
        return this.String.values();
    }

    public HashMap<oo0o_0, ArrayList<String>> \u00d500000() {
        HashMap<oo0o_0, ArrayList<String>> hashMap = new HashMap<oo0o_0, ArrayList<String>>();
        for (K k2 : this.String()) {
            ArrayList<String> arrayList = hashMap.get(k2.o\u00d30000());
            if (arrayList != null) {
                arrayList.add(k2.\u00f5\u00d20000());
            } else {
                arrayList = new ArrayList();
                arrayList.add(k2.\u00f5\u00d20000());
            }
            hashMap.put(k2.o\u00d30000(), arrayList);
        }
        return hashMap;
    }

    public int oO0000() {
        int n = 0;
        for (P p2 : this) {
            if (!p2.if()) continue;
            ++n;
        }
        return n;
    }

    public int \u00f8O0000() {
        int n = 0;
        for (P p2 : this) {
            if (!p2.\u00f4O0000()) continue;
            ++n;
        }
        return n;
    }

    public ArrayList<P> returnsuper() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (!p2.\u00f4o0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public ArrayList<P> oo0000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (!p2.\u00f5O0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public ArrayList<P> o00000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (!p2.\u00d4o0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public ArrayList<P> \u00d600000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (!p2.oo0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public ArrayList<P> \u00d800000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (p2.privatesuper()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public ArrayList<P> \u00d8O0000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (!p2.returnnew()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public ArrayList<P> \u00f800000() {
        return this.o00000;
    }

    public ArrayList<P> \u00d3O0000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new ArrayList();
            Iterator<P> iterator = this.\u00d3o0000();
            while (iterator.hasNext()) {
                this.\u00d200000.add(iterator.next());
            }
        }
        return this.\u00d200000;
    }

    public ArrayList<P> \u00d2o0000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new ArrayList<P>(this.String.values());
            Collections.sort(this.\u00d300000);
        }
        return this.\u00d300000;
    }

    public ArrayList<String> o00000(oo0o_0 oo0o_02) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (K k2 : this.String()) {
            if (!k2.o\u00d30000().equals(oo0o_02)) continue;
            arrayList.add(k2.\u00f5\u00d20000());
        }
        return arrayList;
    }

    public ArrayList<K> String() {
        ArrayList<K> arrayList = new ArrayList<K>();
        for (P p2 : this) {
            if (!(p2 instanceof K)) continue;
            arrayList.add((K)p2);
        }
        return arrayList;
    }

    public KategorienArrayList<P> private() {
        return this.o00000(HEW2SF.Object);
    }

    public KategorienArrayList<P> o00000(final String[] stringArray) {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new KategorienArrayList<P>(){

                @Override
                public int getAnzahlListen() {
                    return stringArray.length;
                }

                @Override
                public String getKategorieNamen(int n) {
                    return stringArray[n];
                }

                public int o00000(P p2) {
                    if (this.getAnzahlListen() == 1) {
                        return 0;
                    }
                    String string = p2.while();
                    if (string.equals("")) {
                        string = "Allgemein";
                    }
                    if (string.startsWith("Magisch: Magische Lieder")) {
                        string = "Magisch";
                    }
                    if (string.startsWith("Magisch: ")) {
                        string = string.substring(9);
                    }
                    if (string.startsWith("Kampf: ")) {
                        string = string.substring(7);
                    }
                    if (string.startsWith("Geweiht: ")) {
                        string = string.substring(0, 7);
                    }
                    if (p2.toString().startsWith("Ritualkenntnis")) {
                        string = "Ritualkenntnis";
                    }
                    if (p2.toString().startsWith("Paktgeschenk: ")) {
                        string = "Pakt";
                    }
                    if (p2.o00000((floatsuper)null) == -1) {
                        string = "DSA 4.0";
                    }
                    for (int i2 = 0; i2 < stringArray.length; ++i2) {
                        if (!stringArray[i2].equals(string)) continue;
                        return i2;
                    }
                    helden.framework.held.object.oooo_0.\u00f500000("SF-Bereich nicht gefunden: " + string + ", " + p2);
                    return 0;
                }
            };
            for (P p2 : this) {
                this.\u00d500000.add(p2);
            }
        }
        return this.\u00d500000;
    }

    public ArrayList<P> \u00f5O0000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this) {
            if (!p2.\u00d3\u00d20000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public boolean \u00d5O0000() {
        return this.oo0000().size() > 0;
    }

    public boolean \u00f500000() {
        Iterator<P> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().\u00d300000()) continue;
            return true;
        }
        return false;
    }

    public boolean \u00d300000() {
        Iterator<P> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().privatesuper()) continue;
            return true;
        }
        return false;
    }

    public boolean o00000(o00O o00O2) {
        for (P p2 : this) {
            P p3;
            if (p2.if()) {
                p3 = (oooo_1)p2;
                if (!((oooo_1)p3).\u00f4\u00d20000().equals(o00O2)) continue;
                return true;
            }
            if (!J.super(while.newvoidclass, p2)) continue;
            if (p2 instanceof Q) {
                helden.framework.held.object.oooo_0.\u00f500000("hatMerkmalskenntnis: masf erwartet " + p2.toString() + " " + p2.getClass());
                return false;
            }
            p3 = (void)p2;
            for (o00O o00O3 : ((void)p3).nullObject()) {
                if (!o00O3.equals(o00O2)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean o00000(helden.framework.OOoO.K k2) {
        H h2 = k2.\u00d300000();
        for (P p2 : this) {
            if (!p2.\u00f4O0000() || h2 == null || !p2.toString().equals(h2.toString())) continue;
            return true;
        }
        return false;
    }

    public boolean \u00d2O0000() {
        return this.\u00f5O0000().size() > 0;
    }

    @Override
    public Iterator<P> iterator() {
        return this.\u00d2o0000().iterator();
    }

    public Iterator<P> null() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this.\u00d2o0000()) {
            if (p2 instanceof void) {
                void void_ = (void)p2;
                arrayList.addAll(void_.o\u00d40000());
                continue;
            }
            arrayList.add(p2);
        }
        return arrayList.iterator();
    }

    public Iterator<P> \u00d3o0000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : this.\u00d2o0000()) {
            if (p2 instanceof void) {
                void void_ = (void)p2;
                arrayList.addAll(void_.o\u00d40000());
                continue;
            }
            arrayList.add(p2);
        }
        return arrayList.iterator();
    }

    public Iterator<P> \u00f6O0000() {
        return this.o00000.iterator();
    }

    public void \u00d200000(P p2) {
        if (p2 instanceof Q) {
            Q q = (Q)p2;
            for (Map.Entry<String, P> entry : this.String.entrySet()) {
                if (!(entry.getValue() instanceof void)) continue;
                void void_ = (void)entry.getValue();
                if (!q.\u00d4\u00d30000().\u00f500000().equals(void_.\u00f500000())) continue;
                void_.\u00d500000(q.\u00d8\u00d30000());
                if (void_.nullObject().size() == 0) {
                    this.String.remove(entry.getKey());
                    this.o00000.remove(entry.getValue());
                }
                this.\u00d200000 = null;
                this.\u00d500000 = null;
                this.\u00d300000 = null;
                return;
            }
        }
        this.String.remove(p2);
        this.o00000.remove(p2);
        this.\u00d200000 = null;
        this.\u00d500000 = null;
        this.\u00d300000 = null;
    }

    public void \u00d300000(String string) {
        P p2 = this.String.remove(string);
        this.o00000.remove(p2);
        this.\u00d200000 = null;
        this.\u00d500000 = null;
        this.\u00d300000 = null;
    }

    public void for() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.addAll(this.String.values());
        for (P p2 : arrayList) {
            this.\u00d200000(p2);
        }
    }

    public int newsuper() {
        return this.String.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (P p2 : this.\u00d2o0000()) {
            stringBuffer.append(p2.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    private ArrayList<Q<?>> \u00d6O0000() {
        ArrayList arrayList = new ArrayList();
        for (P p2 : this) {
            if (!(p2 instanceof void)) continue;
            void void_ = (void)p2;
            arrayList.addAll(void_.o\u00d40000());
        }
        return arrayList;
    }
}

