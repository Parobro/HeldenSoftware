/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.int.N;

public class KeineWahl
extends N {
    private static String ifnewfloat = "Keine zus\u00e4tzliche Variante";
    private BedingungsVerknuepfung \u00f8O\u00f5O00;

    public KeineWahl() {
        super(ifnewfloat, 0, false);
    }

    public KeineWahl(BedingungsVerknuepfung bedingungsVerknuepfung) {
        super(ifnewfloat, 0, false);
        this.\u00f8O\u00f5O00 = bedingungsVerknuepfung;
    }

    @Override
    public BedingungsVerknuepfung getWahlBedingung() {
        return this.\u00f8O\u00f5O00;
    }
}

