/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum Monat {
    \u00f400000("Praios", 1),
    \u00f600000("Rondra", 2),
    o00000("Efferd", 3),
    \u00d500000("Travia", 4),
    OO0000("Boron", 5),
    \u00d200000("Hesinde", 6),
    \u00d2O0000("Firun", 7),
    float("Tsa", 8),
    public("Phex", 9),
    void("Peraine", 10),
    \u00d600000("Ingerimm", 11),
    \u00d4O0000("Rahja", 12),
    \u00d400000("Namenloser Tag", 13);

    private String Object;
    private int oO0000;

    public static Monat get(int n) {
        switch (n) {
            case 1: {
                return \u00f400000;
            }
            case 2: {
                return \u00f600000;
            }
            case 3: {
                return o00000;
            }
            case 4: {
                return \u00d500000;
            }
            case 5: {
                return OO0000;
            }
            case 6: {
                return \u00d200000;
            }
            case 7: {
                return \u00d2O0000;
            }
            case 8: {
                return float;
            }
            case 9: {
                return public;
            }
            case 10: {
                return void;
            }
            case 11: {
                return \u00d600000;
            }
            case 12: {
                return \u00d4O0000;
            }
            case 13: {
                return \u00d400000;
            }
        }
        throw new IllegalArgumentException("Monat " + n + " gibt es nicht.");
    }

    public static Monat getGeburtsmonat(int n) {
        switch (n) {
            case 1: 
            case 2: {
                return \u00f400000;
            }
            case 3: 
            case 4: {
                return \u00f600000;
            }
            case 5: 
            case 6: {
                return o00000;
            }
            case 7: 
            case 8: {
                return \u00d500000;
            }
            case 9: 
            case 10: {
                return OO0000;
            }
            case 11: {
                return \u00d200000;
            }
            case 12: {
                return \u00d2O0000;
            }
            case 13: {
                return float;
            }
            case 14: 
            case 15: 
            case 16: {
                return public;
            }
            case 17: {
                return void;
            }
            case 18: {
                return \u00d600000;
            }
            case 19: 
            case 20: {
                return \u00d4O0000;
            }
        }
        throw new IllegalArgumentException("Unzul\u00e4ssiger W\u00fcrfelwurf: " + n);
    }

    private Monat(String string2, int n2) {
        this.Object = string2;
        this.oO0000 = n2;
    }

    public int getNummer() {
        return this.oO0000;
    }

    public String toString() {
        return this.Object;
    }
}

