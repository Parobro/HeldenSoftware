/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.A;

import helden.framework.Wuerfelwurf;
import helden.framework.held.A.OOoO;
import helden.framework.held.object.oooo_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A {
    private Integer class;
    private Integer super;
    private String[] \u00d400000;
    private OOoO \u00d300000;
    private Wuerfelwurf \u00d200000;

    public A(OOoO oOoO2, Wuerfelwurf wuerfelwurf) {
        this.\u00d300000 = oOoO2;
        this.\u00d200000 = wuerfelwurf;
        this.class = Integer.MAX_VALUE;
        this.super = Integer.MIN_VALUE;
        this.\u00d400000 = new String[wuerfelwurf.getMax() + 1];
        for (int i2 = 0; i2 <= wuerfelwurf.getMax(); ++i2) {
            this.\u00d400000[i2] = "keine";
        }
    }

    public void o00000(int n, int n2, String string) {
        if (n2 < n) {
            oooo_0.\u00f500000("Bis ist kleiner als Von");
        }
        if (n2 > this.\u00d200000.getMax()) {
            oooo_0.\u00f500000("Der Bis-Wert ist gr\u00f6\u00dfer als der maximale W\u00fcrfelwurf");
            return;
        }
        for (int i2 = n; i2 <= n2; ++i2) {
            if (!this.\u00d400000[i2].equals("keine")) {
                oooo_0.\u00f500000("Farbbereich " + i2 + " wird \u00fcberschrieben");
            }
            this.\u00d400000[i2] = string;
        }
        this.class = Math.min(n, this.class);
        this.super = Math.max(n2, this.super);
    }

    public void \u00d200000() {
        String string = "";
        for (int i2 = this.class.intValue(); i2 <= this.super; ++i2) {
            if (!this.\u00d400000[i2].equals("keine")) continue;
            string = string + i2 + " ";
        }
        if (string.isEmpty() && this.class.intValue() == this.\u00d200000.getMin() && this.super.intValue() == this.\u00d200000.getMax()) {
            return;
        }
        System.out.println("Bef\u00fcllte Bereiche: " + this.class + "-" + this.super);
        System.out.println("W\u00fcrfel   Bereiche: " + this.\u00d200000.getMin() + "-" + this.\u00d200000.getMax());
        System.out.print("L\u00fccken: " + string);
        System.out.println();
    }

    public OOoO o00000() {
        return this.\u00d300000;
    }

    public String Object() {
        return this.\u00d400000[this.\u00d200000.wuerfele()];
    }
}

