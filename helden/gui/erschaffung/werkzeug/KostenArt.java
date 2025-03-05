/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class KostenArt {
    private static Vector<KostenArt> \u00d400000;
    public static final KostenArt \u00d800000;
    public static final KostenArt \u00f600000;
    public static final KostenArt int;
    public static final KostenArt \u00f400000;
    public static final KostenArt \u00f800000;
    public static final KostenArt \u00d300000;
    public static final KostenArt class;
    public static final KostenArt \u00d600000;
    private String super;
    private String \u00d200000;

    public static KostenArt valueOf(String string) {
        for (KostenArt kostenArt : \u00d400000) {
            if (!kostenArt.toString().equals(string)) continue;
            return kostenArt;
        }
        return null;
    }

    public static Vector<KostenArt> values() {
        return \u00d400000;
    }

    public KostenArt(String string, String string2) {
        this.super = string;
        this.\u00d200000 = string2;
    }

    private KostenArt(String string) {
        if (\u00d400000 == null) {
            \u00d400000 = new Vector(20);
        }
        this.super = string;
        this.\u00d200000 = "intern";
        \u00d400000.add(this);
    }

    public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
        return false;
    }

    public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2, KostenEntry kostenEntry, HEW2 hEW2) {
        return this.darfGenutztWerden(object, kostenBereich2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        KostenArt kostenArt = (KostenArt)object;
        if (this.\u00d200000 == null ? kostenArt.\u00d200000 != null : !this.\u00d200000.equals(kostenArt.\u00d200000)) {
            return false;
        }
        return !(this.super == null ? kostenArt.super != null : !this.super.equals(kostenArt.super));
    }

    public String getID() {
        return this.\u00d200000;
    }

    public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
        return new Vector<KostenEntry.kostenBereich>();
    }

    public int getVerfuegbarePunkte() {
        return -1;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.\u00d200000.hashCode();
        n = 31 * n + this.super.hashCode();
        return n;
    }

    public ArrayList<Hinweis> pruefen() {
        return null;
    }

    public String toString() {
        return this.super;
    }

    public abstract Boolean verbilligteSFKostennutzen();

    static {
        \u00d800000 = new KostenArt("NONE"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return null;
            }
        };
        \u00f600000 = new KostenArt("AP"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return true;
            }
        };
        int = new KostenArt("GP"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return null;
            }
        };
        \u00f400000 = new KostenArt("BGB"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return true;
            }
        };
        \u00f800000 = new KostenArt("GEBILDET"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return true;
            }
        };
        \u00d300000 = new KostenArt("VETERAN"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return true;
            }
        };
        KostenArt.class = new KostenArt("VR"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        };
        \u00d600000 = new KostenArt("DOPPELSF"){

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        };
    }
}

