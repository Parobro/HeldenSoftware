/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.F;
import helden.framework.D.H;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.MehrfachAuswahlInfoBehaelter;
import helden.framework.OOoO.R;
import helden.framework.d.oooo_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;
import java.util.Iterator;

public class for<T>
extends MehrfachAuswahlInfoBehaelter<String, T> {
    private oo0o_0 \u00d500000;
    private boolean String;

    public static for<String> o00000(oo0o_0 oo0o_02, ArrayList<String> arrayList, int n) {
        for<ArrayList<String>> for_ = new for<ArrayList<String>>(arrayList, oo0o_02.istZauber() ? while.\u00d3\u00d80000 : while.Stringnullsuper, oo0o_02.istZauber());
        super.o00000(oo0o_02);
        return for_;
    }

    public static ArrayList<for> o00000(P p2) {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (p2.\u00f8O0000()) {
            K k2 = (K)p2;
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2.add(k2.\u00f5\u00d20000());
            arrayList.add(for.o00000(k2.o\u00d30000(), arrayList2, 1));
        } else if (p2 instanceof F) {
            F f2 = (F)p2;
            for (R r : f2.privateprivateclass) {
                arrayList.add(new for<R>(r, p2.\u00f500000(), false));
            }
        } else if (p2 instanceof void) {
            void void_ = (void)p2;
            Iterator iterator = void_.nullObject().iterator();
            while (iterator.hasNext()) {
                ArrayList<String> arrayList3 = new ArrayList<String>();
                arrayList3.add(iterator.next().toString());
                arrayList.add(new for(arrayList3, p2.\u00f500000(), false));
            }
        } else if (p2 instanceof Q) {
            Q q = (Q)p2;
            arrayList.add(new for(q.\u00d8\u00d30000(), q.\u00d4\u00d30000().\u00f500000(), false));
        } else {
            arrayList.add(new for(p2.toString()));
        }
        return arrayList;
    }

    public static ArrayList<for> \u00d200000(String string) {
        return for.o00000(oooo_0.o00000(string));
    }

    public for(ArrayList<T> arrayList, H h2, boolean bl) {
        super(arrayList, h2.toString(), bl);
        this.o00000(h2.toString());
    }

    public for(ArrayList<T> arrayList, String string, boolean bl) {
        super(arrayList, string, bl);
        this.o00000(string);
    }

    public for(H h2) {
        super(h2.toString());
        this.o00000(h2.toString());
    }

    public for(H h2, boolean bl) {
        super(h2.toString(), bl);
        this.o00000(h2.toString());
    }

    public for(String string) {
        super(string);
    }

    public for(T t, H h2, boolean bl) {
        super(h2.toString(), bl);
        ArrayList<T> arrayList = new ArrayList<T>();
        arrayList.add(t);
        this.setAuswahlen(arrayList);
    }

    public for(T t, String string, boolean bl) {
        super(string, bl);
        ArrayList<T> arrayList = new ArrayList<T>();
        arrayList.add(t);
        this.setAuswahlen(arrayList);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return object.toString().equals(this.toString());
    }

    public oo0o_0 Object() {
        return this.\u00d500000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean o00000() {
        return this.String;
    }

    @Override
    public String toString() {
        String string = ((String)this.getBezeichner()).toString();
        if (this.String) {
            string = string + ":" + this.\u00d500000.toString();
        }
        if (!this.isEmpty()) {
            string = string + " [" + this.getAuswahlen().get(0).toString();
            for (int i2 = 1; i2 < this.getAuswahlen().size(); ++i2) {
                string = string + ", " + this.getAuswahlen().get(i2).toString();
            }
            string = string + "]";
        }
        return string;
    }

    public String \u00d200000() {
        String string = ((String)this.getBezeichner()).toString();
        if (this.String) {
            string = string + ":" + this.\u00d500000.toString();
        }
        if (!this.isEmpty()) {
            string = string + " [" + this.getAuswahlen().get(0).toString() + " (" + this.getAuswahlen().get(0).getClass() + ")";
            for (int i2 = 1; i2 < this.getAuswahlen().size(); ++i2) {
                string = string + ", " + this.getAuswahlen().get(i2).toString() + " (" + this.getAuswahlen().get(i2).getClass() + ")";
            }
            string = string + "]";
        }
        return string;
    }

    private void o00000(oo0o_0 oo0o_02) {
        this.\u00d500000 = oo0o_02;
    }

    private void o00000(String string) {
        if (while.Stringnullsuper.toString().equals(string)) {
            this.String = true;
        }
        if (while.\u00d3\u00d80000.toString().equals(string)) {
            this.String = true;
        }
    }
}

