/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OoOO;

import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class D {
    private static Map<String, D> \u00d600000 = new HashMap<String, D>();
    public static final D \u00f400000 = new D("Freie Steigerung");
    public static final D o00000 = new D("Lehrmeister");
    public static final D Object = new D("Gegenseitiges Lehren");
    public static final D \u00d500000 = new D("Selbststudium");
    public static final D \u00d200000 = new D("Salasandra");
    public static final D \u00d400000 = new D("Ohne Salasandra");
    private String void;

    public static D o00000(String string) {
        if (string.equals("Guter Lehrmeister")) {
            string = o00000.toString();
        }
        return \u00d600000.get(string);
    }

    private D(String string) {
        this.void = string;
        \u00d600000.put(string, this);
    }

    public String toString() {
        return this.void;
    }
}

