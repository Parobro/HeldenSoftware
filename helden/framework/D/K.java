/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.P;
import helden.framework.oooo.oo0o_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class K
extends P {
    private oo0o_0 \u00f5\u00d2\u00f8000;
    private String \u00f6\u00d2\u00f8000;
    private boolean nullprivateclass;

    public static K o00000(oo0o_0 oo0o_02, String string) {
        return new K(oo0o_02, string, oo0o_02.istZauber());
    }

    public static K new(oo0o_0 oo0o_02, String string, boolean bl) {
        return new K(oo0o_02, string, bl);
    }

    private static String o00000(oo0o_0 oo0o_02, String string, boolean bl) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bl) {
            stringBuffer.append("Zauberspezialisierung ");
        } else {
            stringBuffer.append("Talentspezialisierung ");
        }
        stringBuffer.append(oo0o_02.toString());
        stringBuffer.append(" (");
        stringBuffer.append(string);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    private K(oo0o_0 oo0o_02, String string, boolean bl) {
        super(K.o00000(oo0o_02, string, bl), 0, 0);
        this.\u00f5\u00d2\u00f8000 = oo0o_02;
        this.\u00f6\u00d2\u00f8000 = string;
        this.nullprivateclass = bl;
        this.new(0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        K k2 = new K(this.\u00f5\u00d2\u00f8000, this.\u00f6\u00d2\u00f8000, this.nullprivateclass);
        k2.o00000(this.\u00f5o0000());
        k2.\u00d5O\u00f8000 = this.\u00d5O\u00f8000;
        k2.new(this.o\u00d20000());
        return k2;
    }

    public String \u00f8\u00d20000() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.nullprivateclass) {
            stringBuffer.append("Zauberspezialisierung ");
        } else {
            stringBuffer.append("Talentspezialisierung ");
        }
        stringBuffer.append(this.\u00f5\u00d2\u00f8000.toString());
        return stringBuffer.toString();
    }

    public String \u00f5\u00d20000() {
        return this.\u00f6\u00d2\u00f8000;
    }

    public oo0o_0 o\u00d30000() {
        return this.\u00f5\u00d2\u00f8000;
    }

    public String ifnew() {
        if (this.nullprivateclass) {
            return "Zauberspezialisierung";
        }
        return "Talentspezialisierung";
    }

    @Override
    public boolean privatesuper() {
        return this.nullprivateclass;
    }

    @Override
    public boolean \u00f8O0000() {
        return this.\u00f5\u00d2\u00f8000 != null;
    }

    public boolean O\u00d30000() {
        return this.nullprivateclass;
    }

    @Override
    public void o00000() {
        super.o00000();
    }

    public void \u00d400000(String string) {
        this.\u00f6\u00d2\u00f8000 = string;
        this.o00000(K.o00000(this.\u00f5\u00d2\u00f8000, this.\u00f6\u00d2\u00f8000, this.nullprivateclass));
    }

    public void new(oo0o_0 oo0o_02) {
        this.\u00f5\u00d2\u00f8000 = oo0o_02;
        this.o00000(K.o00000(this.\u00f5\u00d2\u00f8000, this.\u00f6\u00d2\u00f8000, this.nullprivateclass));
    }
}

