/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.H;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.Stringsuper;
import helden.framework.OOoO.class;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from helden.framework.D.OoOO.O0oo
 */
public class o0oo_0
extends F {
    private ArrayList<Stringsuper> o\u00d5\u00f8000 = null;
    private H \u00d2\u00d5\u00f8000;

    public o0oo_0(H h2, ArrayList<Stringsuper> arrayList) {
        super(h2.toString(), 11, arrayList, o0oo_0.\u00d500000(6));
        this.\u00d2\u00d5\u00f8000 = h2;
        this.o\u00d5\u00f8000 = arrayList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        o0oo_0 o0oo_02 = new o0oo_0(this.\u00d2\u00d5\u00f8000, this.o\u00d5\u00f8000);
        this.o00000(this, o0oo_02);
        return o0oo_02;
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return Bedingung.AND(Bedingung.hat(voidsuper.oo\u00d6000, (Integer)6));
    }

    @Override
    public int o00000(R r) {
        return Integer.MAX_VALUE;
    }

    public List<H> \u00d3o0000(R r) {
        H h2 = ((Stringsuper)r.o00000(0)).o00000();
        return Arrays.asList(h2, while.nullfor);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.\u00f500000());
        stringBuffer.append(" (");
        Iterator iterator = this.privateprivateclass.iterator();
        while (iterator.hasNext()) {
            R r = (R)iterator.next();
            stringBuffer.append(r.o00000(0));
            stringBuffer.append(" ");
            stringBuffer.append(r.o00000(1));
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    protected BedingungsVerknuepfung \u00d4o0000(R r) {
        return Bedingung.AND(this.\u00f5o0000(), Bedingung.hatMirakelPlusTalente(class.\u00d200000().get(r.o00000(0)), 10, 7, 7));
    }
}

