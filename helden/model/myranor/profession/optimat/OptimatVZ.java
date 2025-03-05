/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.optimat;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo.oooo_3;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.optimat.OptimatVariante;
import java.util.ArrayList;

public class OptimatVZ
extends OptimatVariante {
    public OptimatVZ() {
        super("Optimatischer Vollzauberer", "OptimatischerVollzaubererin", 15, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, super.getNotwendigeVoraussetzungen(), Bedingung.hat(I.forsupersuper));
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                oooo_3 oooo_32 = (oooo_3)oooo_0.o00000("Spontanzaubererei");
                for (Object e : oooo_32.o00000(1, this.getSetting())) {
                    arrayList.add(oooo_0.o00000("Spontanzaubererei", new R(new Integer(1), e)));
                }
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Spontanzauberer", "Instruktion"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

