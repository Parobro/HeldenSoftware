/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import java.util.HashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum if {
    o00000("Elementar"),
    \u00d400000("Stellar"),
    \u00d500000("D\u00e4monisch"),
    \u00d800000("Naturwesen"),
    \u00f500000("Totenwesen"),
    \u00f400000("Sonstige");

    private static Set<if> new;
    private String \u00d300000;

    public static Set<if> o00000() {
        if (new == null) {
            new = new HashSet<if>();
            new.add(o00000);
            new.add(\u00d400000);
            new.add(\u00d500000);
            new.add(\u00d800000);
            new.add(\u00f500000);
        }
        return new;
    }

    private if(String string2) {
        this.\u00d300000 = string2;
    }

    public String toString() {
        return this.\u00d300000;
    }
}

