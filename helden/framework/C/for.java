/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.public;
import helden.framework.OooO.C;
import java.util.Comparator;

public class for
implements Comparator<Object> {
    private boolean o00000;

    public for(boolean bl) {
        this.o00000 = bl;
    }

    @Override
    public int compare(Object object, Object object2) {
        public public_ = (public)object;
        public public_2 = (public)object2;
        if (!this.o00000) {
            if (public_.\u00d500000() && !public_2.\u00d500000()) {
                return 1;
            }
            if (!public_.\u00d500000() && public_2.\u00d500000()) {
                return -1;
            }
        }
        return C.o00000(public_, public_2);
    }

    public boolean o00000() {
        return this.o00000;
    }
}

