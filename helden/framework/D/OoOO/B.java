/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.oOOO;

import helden.framework.OOoO.R;
import helden.framework.d.oooo.oooo_4;
import helden.framework.oooo.oooo_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
implements oooo_0 {
    @Override
    public String super(R r) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(r.o00000(0));
        if (r.o00000(0).equals((Object)oooo_4.\u00f600000)) {
            stringBuilder.append(" (");
            stringBuilder.append(r.o00000(2).toString());
            stringBuilder.append("): ");
            stringBuilder.append(r.o00000(3).toString());
            return stringBuilder.toString();
        }
        if ((r.o00000(2) == null || r.o00000(2).toString().isEmpty()) && r.o00000(3).toString().isEmpty()) {
            return stringBuilder.toString();
        }
        stringBuilder.append(": ");
        stringBuilder.append(r.o00000(2).toString());
        stringBuilder.append(" ");
        stringBuilder.append(r.o00000(3).toString());
        return stringBuilder.toString().replace("  ", " ").trim();
    }
}

