/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.gui.allgemein.new.I;
import helden.gui.return;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public final class F
implements Comparator<I> {
    private static Collator o00000 = Collator.getInstance(Locale.GERMAN);
    private return \u00d200000;

    public F(return return_) {
        this.\u00d200000 = return_;
    }

    public int o00000(I i2, I i3) {
        if (i2.isLeaf() && !i3.isLeaf()) {
            return 1;
        }
        if (!i2.isLeaf() && i3.isLeaf()) {
            return -1;
        }
        String string = i2.getUserObject().toString();
        String string2 = i3.getUserObject().toString();
        string = i2.isLeaf() ? this.\u00d200000.\u00d300000(i2.\u00d200000()).\u00f5o0000().toLowerCase() : i2.getUserObject().toString().toLowerCase();
        int n = o00000.compare(string, string2 = i3.isLeaf() ? this.\u00d200000.\u00d300000(i3.\u00d200000()).\u00f5o0000().toLowerCase() : i3.getUserObject().toString().toLowerCase());
        if (n != 0 || !i2.isLeaf()) {
            return n;
        }
        return new Long(Long.parseLong(i2.\u00d200000())).compareTo(Long.parseLong(i3.\u00d200000()));
    }
}

