/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;

public class H
extends F {
    public H() {
        super(while.\u00d8\u00d3\u00d8000.toString(), 0, H.\u00d500000(0));
        this.\u00f4\u00d40000();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        H h2 = new H();
        this.o00000(this, h2);
        return h2;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    @Override
    public int o00000(R r) {
        return 0;
    }
}

