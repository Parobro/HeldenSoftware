/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.model.dsa41.orden.BasisOrden;
import java.util.ArrayList;

public class BruderschaftLoderndesFeuer
extends BasisOrden {
    public BruderschaftLoderndesFeuer() {
        super("Bruderschaft des Loderndes Feuers");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.newwhilesuper, (Integer)12), Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)15), Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)14), Bedingung.hat(while.\u00d3O\u00d4000), Bedingung.hat(I.o\u00f5O000, 5), Bedingung.hat(I.O\u00d30000), Bedingung.hat(voidsuper.\u00f4\u00d6\u00d5000, (Integer)5), Bedingung.hat(voidsuper.\u00f4\u00d2\u00d6000, (Integer)10), Bedingung.hat(voidsuper.oo\u00d6000, (Integer)7), Bedingung.hat(voidsuper.\u00d5\u00d4\u00d6000, (Integer)7), Bedingung.hat(voidsuper.\u00f5\u00d8\u00d5000, (Integer)7), Bedingung.hatTalente(1, 5, voidsuper.whileStringObject, voidsuper.\u00f4\u00f6\u00d5000));
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d3\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber der Bruderschaft"));
        return oo0O;
    }
}

