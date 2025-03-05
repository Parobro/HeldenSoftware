/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum GModBezeichner {
    if("Eigenschaft-Spalte"),
    \u00d300000("Eigenschafts-Modifizierer"),
    \u00d800000("Eigenschafts-Kosten"),
    \u00f400000("Talent-Spalte"),
    return("Talent-Kosten"),
    \u00f500000("Zauber-Spalte"),
    \u00d400000("Zauber-Kosten"),
    \u00d500000("Merkmale-Spalte");

    private String o00000;

    private GModBezeichner(String string2) {
        this.o00000 = string2;
    }

    public String toString() {
        return this.o00000;
    }
}

