/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Objectsuper {
    private static HashMap<String, Objectsuper> \u00d200000 = new HashMap();
    public static final Objectsuper \u00d300000 = new Objectsuper("Invokation");
    public static final Objectsuper class = new Objectsuper("Inspiration");
    public static final Objectsuper super = new Objectsuper("Instruktion");
    public static final Objectsuper \u00d600000 = new Objectsuper("Influxion");
    private String \u00d400000;

    public static HashSet<Objectsuper> o00000() {
        return new HashSet<Objectsuper>(\u00d200000.values());
    }

    public static Objectsuper o00000(String string) {
        Objectsuper objectsuper = \u00d200000.get(string);
        if (objectsuper == null) {
            System.out.println("Diziplin " + string + " gibt es nicht.");
        }
        return objectsuper;
    }

    public Objectsuper(String string) {
        this.\u00d400000 = string;
        \u00d200000.put(this.\u00d400000, this);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof Objectsuper)) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    public int hashCode() {
        return this.\u00d400000.hashCode();
    }

    public String toString() {
        return this.\u00d400000;
    }
}

