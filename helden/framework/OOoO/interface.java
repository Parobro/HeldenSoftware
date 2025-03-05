/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OoOO;

import helden.framework.held.object.oooo_0;
import helden.framework.oooo.oo0o_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class interface {
    private oo0o_0 \u00d200000;
    private Integer \u00d300000;
    private boolean o00000;

    public interface(oo0o_0 oo0o_02, Integer n) {
        this(oo0o_02, n, false);
    }

    public interface(oo0o_0 oo0o_02, Integer n, boolean bl) {
        if (oo0o_02 == null) {
            oooo_0.\u00f500000("Talent is null");
            throw new RuntimeException("Talent is null");
        }
        this.\u00d200000 = oo0o_02;
        this.\u00d300000 = n;
        this.o00000 = bl;
    }

    public oo0o_0 new() {
        return this.\u00d200000;
    }

    public Integer \u00d300000() {
        return this.\u00d300000;
    }

    public boolean o00000() {
        return this.o00000;
    }

    public void o00000(boolean bl) {
        this.o00000 = bl;
    }

    public void o00000(oo0o_0 oo0o_02) {
        this.\u00d200000 = oo0o_02;
    }

    public void o00000(Integer n) {
        this.\u00d300000 = n;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.\u00d200000.toString());
        if (this.o00000()) {
            stringBuffer.append(" ");
            stringBuffer.append("(L)");
        }
        if (this.\u00d300000 != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.\u00d300000);
        }
        return stringBuffer.toString();
    }
}

