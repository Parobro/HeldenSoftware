/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.D.while;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.model.dsa41.orden.Rondraorden;

public class Templer
extends Rondraorden {
    public Templer() {
        super("Orden des Tempels zu Jergan");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.o00000), Bedingung.hat(while.\u00f6\u00d8\u00f6000));
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, bedingungsVerknuepfung, bedingungsVerknuepfung2);
    }
}

