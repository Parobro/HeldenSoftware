/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.D.while;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.model.dsa41.orden.Rondraorden;

public class Bluter
extends Rondraorden {
    public Bluter() {
        super("Orden vom Heiligen Blute der M\u00e4rtyrer vom Theater in Arivor zu Salzsteige (Bluter)");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.o00000), Bedingung.hat(while.\u00f6\u00d8\u00f6000));
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, bedingungsVerknuepfung, bedingungsVerknuepfung2);
    }
}

