/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.int.N;

public class KeineWahl
extends N {
    private static String o\u00d3\u00f5O00 = "Keine zus\u00e4tzliche Variante";
    private BedingungsVerknuepfung newStringfloat;

    public KeineWahl() {
        super(o\u00d3\u00f5O00, 0, false);
    }

    public KeineWahl(BedingungsVerknuepfung bedingungsVerknuepfung) {
        super(o\u00d3\u00f5O00, 0, false);
        this.newStringfloat = bedingungsVerknuepfung;
    }

    @Override
    public BedingungsVerknuepfung getWahlBedingung() {
        return this.newStringfloat;
    }
}

