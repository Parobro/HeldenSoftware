/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
implements Comparable {
    private static HashMap<String, A> \u00d4o0000 = new HashMap();
    public static final A \u00f400000 = new A("Alpdruck");
    public static final A o00000 = new A("Alptraumwelt");
    public static final A \u00d3o0000 = new A("Analyse");
    public static final A \u00d3O0000 = new A("Antimagie");
    public static final A \u00f8O0000 = new A("Bann der Quelle");
    public static final A \u00d8O0000 = new A("Beseelung der Quelle");
    public static final A \u00d500000 = new A("D\u00e4monische Manifestation");
    public static final A \u00d8o0000 = new A("Elementare Manifestation");
    public static final A forsuper = new A("Elementare Reinheit");
    public static final A return = new A("Explosion");
    public static final A if = new A("Fixierung");
    public static final A \u00d5o0000 = new A("Geistillusion");
    public static final A \u00d400000 = new A("Heilung/Wiederherstellung");
    public static final A \u00f4O0000 = new A("Hellsicht");
    public static final A \u00f8o0000 = new A("Illusion");
    public static final A O\u00d20000 = new A("Infektion");
    public static final A thissuper = new A("Kommunikation");
    public static final A \u00f800000 = new A("Kontrolle \u00fcber Element");
    public static final A while = new A("Kontrolle \u00fcber Gef\u00fchle");
    public static final A \u00f5o0000 = new A("Kontrolle \u00fcber Wesen");
    public static final A \u00f4o0000 = new A("Metamagie");
    public static final A nullsuper = new A("Objektbewegung");
    public static final A oo0000 = new A("Regeneration");
    public static final A o\u00d20000 = new A("Reinigung");
    public static final A new = new A("Schadenszauber");
    public static final A privatesuper = new A("Schutz vor Quelle");
    public static final A \u00d300000 = new A("Traumbesuch");
    public static final A \u00d4O0000 = new A("Transfer");
    public static final A Oo0000 = new A("Transformation");
    public static final A OO0000 = new A("Transport durch Element");
    public static final A \u00f500000 = new A("\u00dcber Element gehen");
    public static final A Stringsuper = new A("Verh\u00fcllung");
    public static final A \u00f5O0000 = new A("Verwandlung");
    public static final A \u00d800000 = new A("Wahnsinn");
    public static final A oO0000 = new A("Wahrnehmung der Quelle");
    private String \u00d5O0000;

    public static A o00000(String string) {
        A a2 = \u00d4o0000.get(string);
        if (a2 == null) {
            System.out.println("Dienst " + string + " gibt es nicht.");
        }
        return a2;
    }

    public static HashSet<A> o00000() {
        return new HashSet<A>(\u00d4o0000.values());
    }

    public A(String string) {
        this.\u00d5O0000 = string;
        \u00d4o0000.put(this.\u00d5O0000, this);
    }

    public int compareTo(Object object) {
        return this.toString().compareTo(object.toString());
    }

    public boolean equals(Object object) {
        return this.\u00d5O0000 != null && object != null && this.\u00d5O0000.equals(object.toString());
    }

    public int hashCode() {
        return this.\u00d5O0000.hashCode();
    }

    public String toString() {
        return this.\u00d5O0000;
    }
}

