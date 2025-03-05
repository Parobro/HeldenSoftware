/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.C.for;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.object.oooo_0;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Oo0O {
    public static final int \u00d600000 = 0;
    public static final int super = 1;
    public static final int class = 2;
    private SortedSet<public> \u00d300000 = new TreeSet<Object>(new for(false));
    private int \u00d400000 = 2;
    private KategorienArrayList<public> \u00d200000;

    public Oo0O() {
    }

    public Oo0O(List<public> list) {
        this();
        for (public public_ : list) {
            this.\u00d300000(public_);
        }
    }

    public Oo0O(Oo0O oo0O) {
        this();
        this.new(oo0O);
    }

    public Oo0O(Oo0O oo0O, Settings settings) {
        this();
        Iterator<public> iterator = oo0O.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!settings.contains(public_)) continue;
            this.\u00d300000(public_);
        }
    }

    public void \u00d300000(public public_) {
        if (public_ == null) {
            return;
        }
        if (this.\u00d400000(public_.oO0000())) {
            return;
        }
        if (public_ instanceof private) {
            if (public_ instanceof M) {
                M m = (M)public_;
                if (this.\u00f500000()) {
                    this.\u00d300000.addAll(m.\u00d200000(this.\u00d400000 == 1));
                } else if (this.\u00d400000(m.\u00f4O0000())) {
                    M m2 = (M)this.\u00d300000(m.\u00f4O0000());
                    m2.\u00d200000(m);
                } else {
                    this.\u00d300000.add(public_);
                }
            } else if (!this.\u00f500000()) {
                M m;
                D d2 = (D)public_;
                if (!this.new(d2)) {
                    m = (M)K.o00000(d2.\u00f4O0000());
                    m.\u00d2o0000();
                    d2.o00000(m);
                    this.\u00d300000.add(m);
                } else {
                    m = (M)this.\u00d300000(d2.\u00f4O0000());
                    d2.o00000(m);
                }
                if (d2.\u00f4o0000() != null) {
                    m.o00000(d2.\u00f4o0000());
                }
            } else {
                this.\u00d300000.add(public_);
            }
        } else {
            this.\u00d300000.add(public_);
        }
        this.\u00d200000 = null;
    }

    public void new(Oo0O oo0O) {
        Iterator<public> iterator = oo0O.\u00d500000();
        while (iterator.hasNext()) {
            this.\u00d300000(iterator.next());
        }
    }

    public void \u00f400000() {
        this.\u00d200000 = null;
    }

    public boolean \u00d400000(I i2) {
        return this.\u00d300000(i2.toString());
    }

    public boolean o00000(public public_) {
        I i2 = public_.\u00f4O0000();
        if (public_ instanceof D && this.\u00d300000(i2.toString()) && this.\u00d400000 == 2) {
            M m = (M)this.\u00d300000(i2);
            D d2 = (D)public_;
            return m.\u00f400000(d2.\u00f4o0000());
        }
        if (public_ instanceof M) {
            oooo_0.\u00d300000("MAV in VorteilMenge.contains: " + public_);
        }
        if (public_.toString().startsWith(I.\u00d3OO000.toString()) || public_.toString().startsWith(I.\u00d8\u00d80000.toString())) {
            return this.\u00d300000(public_.toString());
        }
        return this.\u00d300000(i2.toString());
    }

    public boolean \u00d300000(String string) {
        try {
            this.new(string);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public int o00000(I i2) {
        int n = 0;
        for (public public_ : this.\u00d300000) {
            if (!public_.toString().equals(i2.toString())) continue;
            ++n;
        }
        return n;
    }

    public public \u00d300000(I i2) {
        return this.new(i2.toString());
    }

    public List<public> \u00d300000(D<?> d2) {
        String string = d2.toString();
        boolean bl = true;
        try {
            Integer.parseInt(string.substring(string.length() - 1));
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
        }
        String string2 = bl ? string.substring(0, string.length() - 2) : string;
        ArrayList<public> arrayList = new ArrayList<public>();
        Iterator<public> iterator = this.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            String string3 = public_.toString();
            if (!string3.startsWith(string2) || string3.equals(string)) continue;
            arrayList.add(public_);
        }
        return arrayList;
    }

    public public new(String string) {
        for (public public_ : this.\u00d300000) {
            String string2 = public_.toString();
            if (!(this.\u00f500000() ? string2.equals(string) || this.o00000(string2, string) : string2.equals(string) || this.o00000(string, string2))) continue;
            return public_;
        }
        throw new IllegalArgumentException("Vorteil " + string + " gibt es nicht");
    }

    public KategorienArrayList<public> o00000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new KategorienArrayList<public>(){

                @Override
                public int getAnzahlListen() {
                    return 2;
                }

                public int \u00d200000(public public_) {
                    if (public_.\u00d500000()) {
                        return 1;
                    }
                    return 0;
                }
            };
            Iterator<public> iterator = this.o00000(true);
            while (iterator.hasNext()) {
                public public_ = iterator.next();
                if (public_ instanceof M) {
                    M m = (M)public_;
                    if (m.\u00d2\u00d20000() > 0) {
                        this.\u00d200000.addAll(m.\u00d200000(true));
                        continue;
                    }
                    D d2 = new D(m);
                    d2.intsuper().clear();
                    this.\u00d200000.add(d2);
                    continue;
                }
                this.\u00d200000.add(public_);
            }
        }
        return this.\u00d200000;
    }

    public boolean if() {
        return this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00f4\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.privateintsuper) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.returnifsuper) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d5\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00f5o\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d4\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.O\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d3\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d8\u00d2\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00f8o\u00d2000) || this.\u00d400000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00f4o\u00d2000);
    }

    public boolean while() {
        Iterator<public> iterator = this.\u00d500000();
        while (iterator.hasNext()) {
            if (!iterator.next().\u00f4O0000().o00000()) continue;
            return true;
        }
        return false;
    }

    public boolean \u00f800000() {
        Iterator<public> iterator = this.\u00d500000();
        while (iterator.hasNext()) {
            if (!iterator.next().\u00f4O0000().\u00d200000()) continue;
            return true;
        }
        return false;
    }

    public boolean oO0000() {
        return this.\u00d400000(I.\u00f5\u00d8o000) || this.\u00d400000(I.forsupersuper);
    }

    public boolean \u00d800000() {
        return this.\u00d400000(I.\u00d5\u00d3O000) || this.\u00d400000(I.\u00f5\u00d8o000) || this.\u00d400000(I.forsupersuper);
    }

    public Iterator<public> \u00d500000() {
        return this.o00000(false);
    }

    public Iterator<public> o00000(boolean bl) {
        if (((for)this.\u00d300000.comparator()).o00000() != bl) {
            TreeSet<Object> treeSet = new TreeSet<Object>(new for(bl));
            treeSet.addAll(this.\u00d300000);
            this.\u00d300000 = treeSet;
        }
        return this.\u00d300000.iterator();
    }

    public void new() {
        this.\u00d300000.clear();
        this.\u00d200000 = null;
    }

    public void o00000(floatsuper floatsuper2) {
        Iterator iterator = this.\u00d300000.iterator();
        while (iterator.hasNext()) {
            public public_ = (public)iterator.next();
            if (public_.\u00d5O0000() == null || floatsuper2.Object(public_.\u00d5O0000())) continue;
            iterator.remove();
        }
    }

    public void new(I i2) {
        Iterator iterator = this.\u00d300000.iterator();
        while (iterator.hasNext()) {
            public public_ = (public)iterator.next();
            if (!public_.\u00f4O0000().equals(i2)) continue;
            iterator.remove();
        }
        this.\u00d200000 = null;
    }

    public void new(public public_) {
        if (public_ instanceof D && !this.\u00f500000()) {
            D d2 = (D)public_;
            M<Object> m = this.o00000(d2);
            m.\u00d500000(d2.\u00f4o0000());
            M m2 = d2.\u00f5o0000();
            if (m2 != null) {
                m2.\u00d500000(d2.\u00f4o0000());
                if (m2.intsuper().isEmpty()) {
                    this.new(m2);
                }
            }
            if (m.\u00d2\u00d20000() == 0) {
                this.new(m);
            }
        } else {
            this.o00000(public_.toString());
        }
        this.\u00d200000 = null;
    }

    public void o00000(String string) {
        Iterator iterator = this.\u00d300000.iterator();
        while (iterator.hasNext()) {
            public public_ = (public)iterator.next();
            if (!public_.toString().equals(string)) continue;
            iterator.remove();
            break;
        }
        this.\u00d200000 = null;
    }

    public void \u00d300000() {
        Iterator iterator = this.\u00d300000.iterator();
        while (iterator.hasNext()) {
            public public_ = (public)iterator.next();
            if (public_.\u00f400000()) continue;
            iterator.remove();
        }
    }

    public void o00000(Oo0O oo0O) {
        Iterator iterator = this.\u00d300000.iterator();
        while (iterator.hasNext()) {
            public public_ = (public)iterator.next();
            if (public_.\u00f400000() || oo0O.o00000(public_)) continue;
            iterator.remove();
        }
    }

    public void o00000(int n) {
        if (this.\u00f500000() && n == 2) {
            this.\u00d400000 = n;
            this.\u00d400000();
        }
        if (!this.\u00f500000() && n != 2) {
            this.\u00d400000 = n;
            this.return();
        }
        this.\u00d200000 = null;
    }

    public int OO0000() {
        return this.\u00d300000.size();
    }

    private boolean \u00d400000(String string) {
        Iterator<public> iterator = this.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.oO0000().equals(string)) continue;
            return true;
        }
        return false;
    }

    private M<Object> o00000(D<Object> d2) {
        for (public public_ : this.\u00d300000) {
            M m;
            if (!(public_ instanceof M) || !(m = (M)public_).\u00f4O0000().equals(d2.\u00f4O0000())) continue;
            return m;
        }
        throw new RuntimeException(d2.\u00f4O0000() + " gibt es nicht.");
    }

    private boolean \u00f500000() {
        return this.\u00d400000 == 0 || this.\u00d400000 == 1;
    }

    private boolean new(D<Object> d2) {
        return this.\u00d400000(d2.\u00f4O0000());
    }

    private void \u00d400000() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator<public> iterator = this.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!(public_ instanceof D)) continue;
            arrayList.add(public_);
        }
        for (D d2 : arrayList) {
            this.new((public)d2);
            this.\u00d300000((public)d2);
        }
    }

    private void return() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator<public> iterator = this.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!(public_ instanceof M)) continue;
            arrayList.add(public_);
        }
        for (M m : arrayList) {
            this.new(m);
            this.\u00d300000(m);
        }
    }

    private boolean o00000(String string, String string2) {
        if (!Character.isDigit(string.charAt(string.length() - 1))) {
            return false;
        }
        String string3 = string.substring(0, string.length() - 1);
        while (Character.isDigit(string3.charAt(string3.length() - 1))) {
            string3 = string3.substring(0, string3.length() - 1);
        }
        if (!Character.isWhitespace(string3.charAt(string3.length() - 1))) {
            return false;
        }
        string3 = string3.substring(0, string3.length() - 1);
        String string4 = string2;
        return string3.equals(string4);
    }
}

