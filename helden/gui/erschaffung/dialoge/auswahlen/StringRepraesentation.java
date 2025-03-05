/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.auswahlen;

import helden.framework.C.B;
import helden.framework.C.D;
import helden.framework.C.public;

public final class StringRepraesentation {
    public static String praesentiere(Object object) {
        if (object instanceof D || object instanceof B) {
            return ((public)object).oO0000();
        }
        return object.toString();
    }

    private StringRepraesentation() {
    }
}

