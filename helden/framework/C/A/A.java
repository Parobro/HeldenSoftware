/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.OOoO.R;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.Arrays;

public class A
extends helden.framework.C.A {
    private static String[] returnforsuper = new String[]{"Minderpakt", "1. Kreis", "2. Kreis", "3. Kreis", "4. Kreis", "5. Kreis", "6. Kreis", "7. Kreis"};

    public A() {
        super(I.o\u00f5o000, true, 1, new ArrayList<String>(Arrays.asList(returnforsuper)), new ArrayList());
        ((M)this).o00000(true);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        A a2 = new A();
        this.o00000(a2);
        return a2;
    }

    @Override
    public ArrayList o00000(int n, Settings settings, R r) {
        if (n != 0) {
            return super.o00000(n, settings, r);
        }
        return new ArrayList<String>(Arrays.asList(returnforsuper));
    }

    @Override
    public int \u00d200000(R r) {
        return 0;
    }

    @Override
    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        String string = super.o00000(r, floatsuper2, bl);
        if (r.o00000(1) == null || r.o00000(1).toString().isEmpty()) {
            if (string == null) {
                string = "<html><body>";
            }
            string = string + "Bitte geben die D\u00e4mone an.";
        }
        return string;
    }

    @Override
    protected void \u00f6\u00d20000() {
        R r = new R(this.floatnew().length);
        for (int i2 = 0; i2 < this.floatnew().length; ++i2) {
            if (this.floatnew()[i2].size() == 0) {
                r.\u00d200000(i2, "");
                continue;
            }
            r.\u00d200000(i2, this.floatnew()[i2].get(0));
        }
        this.\u00d6o0000();
        this.o00000(r, this.\u00d200000(r));
    }

    @Override
    public R o00000(String[] stringArray) {
        if (stringArray.length == 2 && stringArray[0].startsWith("Stufe ")) {
            stringArray[0] = stringArray[0].replace("Stufe ", "") + ". Kreis";
        }
        return super.o00000(stringArray);
    }
}

