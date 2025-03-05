/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.H;
import helden.framework.D.while;
import helden.framework.OOoO.Stringsuper;
import helden.framework.OOoO.class;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.b_0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class R
extends F {
    public R() {
        super(while.\u00d3\u00f8\u00d4000.toString(), 11, new ArrayList[0]);
        this.o00000(0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        R r = new R();
        this.o00000(this, r);
        return r;
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return Bedingung.AND(Bedingung.hat(voidsuper.oo\u00d6000, (Integer)6), Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)11));
    }

    public ArrayList<Stringsuper> \u00d8\u00d50000() {
        return new ArrayList<Stringsuper>(class.super().keySet());
    }

    @Override
    public int o00000(helden.framework.OOoO.R r) {
        return Integer.MAX_VALUE;
    }

    public List<H> \u00d8O0000(helden.framework.OOoO.R r) {
        H h2 = ((Stringsuper)r.o00000(0)).o00000();
        return Arrays.asList(h2, while.nullfor);
    }

    @Override
    public String o00000(helden.framework.OOoO.R r, floatsuper floatsuper2, boolean bl) {
        return super.o00000(r, floatsuper2, bl);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.\u00f500000());
        stringBuffer.append(" (");
        Iterator iterator = this.privateprivateclass.iterator();
        while (iterator.hasNext()) {
            helden.framework.OOoO.R r = (helden.framework.OOoO.R)iterator.next();
            stringBuffer.append(r.o00000(0));
            stringBuffer.append(" ");
            stringBuffer.append(r.o00000(1));
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    protected BedingungsVerknuepfung \u00f4O0000(helden.framework.OOoO.R r) {
        return Bedingung.AND(this.\u00f5o0000(), Bedingung.hatMirakelPlusTalente(class.super().get(r.o00000(0)), 10, 7, 7));
    }
}

